package pl.przemek.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloWorldController {


    @GetMapping("/hello")
    public String displayIt(Model model) {

        model.addAttribute("message", "Hello World");

        return "HelloWorld";
    }

    @GetMapping("/hello1")
    public String displayIt2(Model model) {

        List<String> list = new ArrayList<>();
        list.add("Przemek");
        list.add("Tomek");
        list.add("Fabian");
        list.add("Wiesiek");


        model.addAttribute("list", list);

        return "List";
    }

    @GetMapping("/boot")
    public String displayBootstrap(Model model) {


        return "BootstrapApplicationExample";
    }
}
