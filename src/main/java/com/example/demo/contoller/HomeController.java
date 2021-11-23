package com.example.demo.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String home() {
        String homeMessage = "Github Actions Test Home";
        return homeMessage;
    }
}
