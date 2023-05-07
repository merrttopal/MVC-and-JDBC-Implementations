package com.works.controllers;

import com.works.props.Users;
import com.works.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @GetMapping("/register")
    public String registerPage(Users user){
        return "register";
    }
    @PostMapping("/userRegister")
    public String userSave(Users user){
        UserService userService = new UserService();
        int status = userService.saveUser(user);
        if(status > 0){
            return "redirect:/";
        }
        return "Home";
    }
}
