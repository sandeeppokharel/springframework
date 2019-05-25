package com.sandy.spring.controller;

import com.sandy.spring.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students/1")
    public Student getSingleStudent()
    {
        return new Student(Long.parseLong("1"),"Binod","Pant");
    }

    @GetMapping("/students/2")
    public Student getSingleStudent2()
    {
        return new Student(Long.parseLong("2"),"Sandeep","Pokharel");
    }


    @GetMapping("/students")
    public List<Student> getAllStudent(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(Long.parseLong("1"),"Binod","Pant"));
        studentList.add(new Student(Long.parseLong("2"),"Sandeep","Pokharel"));
        studentList.add(new Student(Long.parseLong("3"),"Bipul","Bhattarai"));
        studentList.add(new Student(Long.parseLong("4"),"Kiran","Neupane"));
        studentList.add(new Student(Long.parseLong("5"),"Simant","Thapa"));
        studentList.add(new Student(Long.parseLong("6"),"Sujan","Adhikari"));
        studentList.add(new Student(Long.parseLong("7"),"Shivram","Shrestha"));
        return studentList;

    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return student;

    }
    @DeleteMapping("/students/2")
    public void deleteStudent(){

    }

        @PutMapping("/students/2")
    public Student updateStudent(@RequestBody Student student){
        return student;
    }

}