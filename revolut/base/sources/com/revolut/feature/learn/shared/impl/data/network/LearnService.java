package com.revolut.feature.learn.shared.impl.data.network;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import qz8.l;
import qz8.t;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import tz8.f;
import uz8.i;
import uz8.n;
import xz8.d;
import xz8.o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J9\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\t\u0010\nJ7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0001\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0010J/\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u00022\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H'¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001b0\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001b0\u00072\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u001e\u0010\u0010J!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b \u0010\u0010J7\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010!H'¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0001\u0010%\u001a\u00020\u0002H'¢\u0006\u0004\b&\u0010\u0010J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0007H'¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u0007H'¢\u0006\u0004\b+\u0010)¨\u0006,À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/learn/shared/impl/data/network/LearnService;", "", "", "productDomain", "", "limit", "offset", "Lefm/d0;", "Lrz8/f;", "getCourseCategories", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lefm/d0;", "Lqz8/l;", "getAllCourses", "courseId", "Lqz8/t;", "getCourseDetails", "(Ljava/lang/String;)Lefm/d0;", "lessonId", "Luz8/i;", "getLessonDetails", "", "Lxz8/d;", "body", "Lxz8/o;", "submitQuizAnswers", "(Ljava/lang/String;Ljava/util/List;)Lefm/d0;", "Luz8/n;", "Lretrofit2/Response;", "submitLessonProgress", "(Ljava/lang/String;Luz8/n;)Lefm/d0;", "completeLesson", "Ltz8/f;", "getAllGlossaryTerms", "", "publishedBefore", "getBlogs", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)Lefm/d0;", "id", "getBlog", "Lzz8/f;", "getTotalRewards", "()Lefm/d0;", "Lsz8/f;", "getProductDomains", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LearnService {
    @POST("learn/lessons/{id}/progress/complete")
    @NotNull
    d0<Response<n>> completeLesson(@Path("id") @NotNull String lessonId);

    @GET("learn/courses")
    @NotNull
    d0<l> getAllCourses(@NotNull @Query("productDomain") String productDomain, @Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("learn/glossary-items")
    @NotNull
    d0<f> getAllGlossaryTerms(@Query("productDomain") String productDomain);

    @GET("learn/blog-posts/{id}")
    @NotNull
    d0<Object> getBlog(@Path("id") @NotNull String id10);

    @GET("learn/blog-posts")
    @NotNull
    d0<Object> getBlogs(@NotNull @Query("productDomain") String productDomain, @Query("limit") Integer limit, @Query("createdBefore") Long publishedBefore);

    @GET("learn/courses/categories")
    @NotNull
    d0<rz8.f> getCourseCategories(@Query("productDomain") String productDomain, @Query("limit") Integer limit, @Query("offset") Integer offset);

    @GET("learn/courses/{id}?latest=true")
    @NotNull
    d0<t> getCourseDetails(@Path("id") @NotNull String courseId);

    @GET("learn/lessons/{id}")
    @NotNull
    d0<i> getLessonDetails(@Path("id") @NotNull String lessonId);

    @GET("learn/productDomains")
    @NotNull
    d0<sz8.f> getProductDomains();

    @GET("learn/rewards/total")
    @NotNull
    d0<zz8.f> getTotalRewards();

    @PUT("learn/lessons/{id}/progress")
    @NotNull
    d0<Response<n>> submitLessonProgress(@Path("id") @NotNull String lessonId, @Body @NotNull n body);

    @PUT("learn/lessons/{id}/answers")
    @NotNull
    d0<o> submitQuizAnswers(@Path("id") @NotNull String lessonId, @Body @NotNull List<d> body);
}
