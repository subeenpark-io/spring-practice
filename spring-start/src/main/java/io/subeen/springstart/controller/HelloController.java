package io.subeen.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") // path와 자동으로 mapping
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello"; // resources/templates 밑의 파일 이름
    }
}
