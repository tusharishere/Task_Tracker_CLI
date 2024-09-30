package com.api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name="task_tracker_cli")
public class TaskTracker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="description",nullable = false,length = 200)
    private String description;
    @Column(name="status",nullable = false,length = 100)
    private String status;
    @Column(name="createdAt",nullable = false,length=100)
    private LocalDateTime createdAt;
    @Column(name="updatedAt",nullable = false,length=100)
    private LocalDateTime updatedAt;
}
