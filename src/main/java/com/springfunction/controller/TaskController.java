package com.springfunction.controller;

import com.springfunction.model.Task;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Component
public class TaskController {
    @Bean
    public Function<String, String> reverse() {
        return value -> new StringBuilder(value).reverse().toString();
    }

    @Bean
    public Supplier<Task> taskSupplier() {
        return () -> new Task(1L, "Task 1", "Description 1");
    }

    @Bean
    public Consumer<String> printMessage() {
        return System.out::println;
    }
}
