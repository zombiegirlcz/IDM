package com.revolut.feature.user.impl.network.service;

import dng.g;
import dng.h;
import dng.l;
import dng.m;
import dng.p;
import efm.b;
import efm.d0;
import eng.c;
import eng.d;
import eng.e;
import fng.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H'¢\u0006\u0004\b\u0007\u0010\u0005J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002H'¢\u0006\u0004\b\u000e\u0010\u0005J#\u0010\u0013\u001a\u00020\n2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH'¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002H'¢\u0006\u0004\b\u0018\u0010\u0005J\u0019\u0010\u001a\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u0019H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\t\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u001fH'¢\u0006\u0004\b \u0010!J\u001c\u0010%\u001a\u00020$2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\"H§@¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020'H'¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u00020\n2\b\b\u0001\u0010\u0010\u001a\u00020*H'¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\nH'¢\u0006\u0004\b-\u0010\u0016J\u000f\u0010.\u001a\u00020\nH'¢\u0006\u0004\b.\u0010\u0016¨\u0006/À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/user/impl/network/service/UserService;", "", "Lefm/d0;", "Ldng/h;", "getCurrentUser", "()Lefm/d0;", "Ldng/g;", "getUserCompany", "Ldng/p;", "request", "Lefm/b;", "validateUsername", "(Ldng/p;)Lefm/b;", "Lqo3/a;", "getUserAddressLocation", "Ldng/l;", "body", "", "skipUsIdCode", "updateUserDetails", "(Ldng/l;Z)Lefm/b;", "deleteAvatar", "()Lefm/b;", "Ldng/m;", "getUsernames", "Leng/d;", "sendVerificationEmail", "(Leng/d;)Lefm/b;", "Leng/e;", "requestEmailOtp", "(Leng/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Leng/c;", "validateEmail", "(Leng/c;)Lefm/b;", "", "country", "Leng/a;", "getEmailDomainSuggestions", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Leng/b;", "verifyEmailByCode", "(Leng/b;)Lefm/b;", "Lfng/a;", "changePassword", "(Lfng/a;)Lefm/b;", "confirmProfileDetails", "signOut", "feature_user_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UserService {
    @POST("user/password")
    @NotNull
    b changePassword(@Body @NotNull a body);

    @POST("/user/current/review/user-details/confirm")
    @NotNull
    b confirmProfileDetails();

    @DELETE("user/current/picture")
    @NotNull
    b deleteAvatar();

    @GET("user/current")
    @NotNull
    d0<h> getCurrentUser();

    @GET("user/email/domain-suggestions")
    Object getEmailDomainSuggestions(@Query("country") String str, @NotNull Continuation<? super eng.a> continuation);

    @GET("/user/current/address/geo-location")
    @NotNull
    d0<qo3.a> getUserAddressLocation();

    @GET("user/current/company")
    @NotNull
    d0<g> getUserCompany();

    @GET("user/current/usernames")
    @NotNull
    d0<m> getUsernames();

    @POST("user/email/verify")
    Object requestEmailOtp(@Body @NotNull d dVar, @NotNull Continuation<? super e> continuation);

    @POST("/user/current/email/code")
    @NotNull
    b sendVerificationEmail(@Body @NotNull d request);

    @POST("signout")
    @NotNull
    b signOut();

    @PATCH("user/current")
    @NotNull
    b updateUserDetails(@Body @NotNull l body, @Header("X-Skip-SSN-ITIN") boolean skipUsIdCode);

    @POST("user/current/email/validate")
    @NotNull
    b validateEmail(@Body @NotNull c request);

    @POST("/user/current/username/validate")
    @NotNull
    b validateUsername(@Body @NotNull p request);

    @POST("/user/current/email/confirm")
    @NotNull
    b verifyEmailByCode(@Body @NotNull eng.b request);
}
