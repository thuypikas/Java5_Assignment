package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User_login {
@RequestMapping("/index")
    public String showLogin() {
    return "index";
}
}
