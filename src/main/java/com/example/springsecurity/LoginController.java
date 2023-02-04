package com.example.springsecurity;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    // 로그인 화면으로 이동
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    // 로그인 성공
    @GetMapping("/")
    public String index(HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "index";
    }
}
