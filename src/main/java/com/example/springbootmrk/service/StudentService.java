package com.example.springbootmrk.service;

import com.example.springbootmrk.data.Student;
import com.example.springbootmrk.data.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public void saveStudent(Student student) {
        studentRepository.saveStudent(student);
    }

    public Student getStudentbyId(UUID id) {
        return studentRepository.getStudentbyId(id);
    }

}
