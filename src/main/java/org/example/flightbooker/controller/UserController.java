package org.example.flightbooker.controller;

import org.example.flightbooker.dto.UserDTO;
import org.example.flightbooker.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    public IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("addUser")
    public void addUser(@RequestBody UserDTO userDTO) {
        userService.addUser(userDTO);
    }
    @GetMapping("getUserById/{userId}")
    public UserDTO getUserById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }
}
