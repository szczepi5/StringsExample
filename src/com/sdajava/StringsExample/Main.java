package com.sdajava.StringsExample;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //przyklad 1
        List<String> words = Arrays.asList("hej", "czesc", "hello", "yoyo");

        words.forEach(s -> System.out.println("Slowo: " + s));
        words.forEach(System.out::println);

        System.out.println("-----------");

        //przyklad 2
       List<String> modWords =
               words.stream().map(s -> s + "!").collect(Collectors.toList());
        modWords.forEach(System.out::println);

        System.out.println("-----------");
        //words.stream().forEach(s -> );
        //przyklad 3

        List<String> replaceWords =
                words.stream().map(s -> s.replace("e", "stodola")).collect(Collectors.toList());

                replaceWords.forEach(System.out::println);

        System.out.println("-----------");

        //przyklad 4

        List<String> upperCaseWords =
                words.stream().map(String::toUpperCase).collect(Collectors.toList());

        upperCaseWords.forEach(System.out::println);

        System.out.println("-----------");

        //przyklad 5

        List<String> shortWords =
                words.stream().filter(s -> s.length() < 4).collect(Collectors.toList());

        shortWords.forEach(System.out::println);

        System.out.println("-----------");

        //przyklad 6

        List<String> cWords =
                words.stream().filter(s -> s.contains("c")).collect(Collectors.toList());

        cWords.forEach(System.out::println);

        System.out.println("-----------");

        //przyklad 7

        List<String> evenWords =
                words.stream().filter(s -> s.length() % 2 == 0).collect(Collectors.toList());

        evenWords.forEach(System.out::println);

        System.out.println("-----------");

        //przyklad 8




    }
}
