package com.example.shadab_retrofit_simple_get_request;

import com.google.gson.annotations.SerializedName;

import com.google.gson.annotations.SerializedName;

public class Post {

    private int userId;

    private int id;


    private String title;

    @SerializedName("body")
    private String text;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}