package pl.jones.mat.jokes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.jones.mat.jokes.services.JokeService;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String randomJoke(Model model) {

        model.addAttribute("joke", jokeService.getRandomJoke());

        return "jokes/joke";
    }
}
