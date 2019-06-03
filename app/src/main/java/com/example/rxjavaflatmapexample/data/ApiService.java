package com.example.rxjavaflatmapexample.data;

import com.example.rxjavaflatmapexample.data.model.Comment;
import com.example.rxjavaflatmapexample.data.model.Post;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * @author Shiraj Sayed
 */
public interface ApiService {

    @GET("posts")
    Observable<List<Post>> getPosts();

    @GET("posts/{id}/comments")
    Observable<List<Comment>> getComments(@Path("id") int id);
}
