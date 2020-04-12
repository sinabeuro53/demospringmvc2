package me.sinabeuro.demospringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/hello2")
    public String hello2(Model model) {
        model.addAttribute("name", "keesun");
        return "hello2";
    }
}
