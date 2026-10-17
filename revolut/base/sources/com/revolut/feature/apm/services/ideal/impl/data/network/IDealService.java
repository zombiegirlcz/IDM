package com.revolut.feature.apm.services.ideal.impl.data.network;

import cd2.a;
import cd2.b;
import cd2.c;
import cd2.d;
import cd2.e;
import cd2.f;
import efm.d0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H'¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000e\u001a\u00020\r2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004H'¢\u0006\u0004\b\u0015\u0010\u000bJ\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/impl/data/network/IDealService;", "", "", "url", "Lefm/d0;", "Lretrofit2/Response;", "", "callRedirectUrl", "(Ljava/lang/String;)Lefm/d0;", "Lcd2/d;", "getUserRegistered", "()Lefm/d0;", "payloadUri", "Lcd2/a;", "getAvailablePockets", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcd2/c;", "body", "Lcd2/b;", "postUserProfile", "(Lcd2/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProfileUrl", "Lcd2/e;", "requestDto", "Lcd2/f;", "authorise", "(Lcd2/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_apm_services_ideal_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IDealService {
    @POST("/ideal/user/auth")
    Object authorise(@Body @NotNull e eVar, @NotNull Continuation<? super f> continuation);

    @GET
    @NotNull
    d0<Response<Unit>> callRedirectUrl(@Url @NotNull String url2);

    @GET("/ideal/user/pockets")
    Object getAvailablePockets(@Query("payloadUri") String str, @NotNull Continuation<? super a> continuation);

    @GET("/ideal/user/profile-url")
    @NotNull
    d0<b> getProfileUrl();

    @GET("/ideal/user")
    @NotNull
    d0<d> getUserRegistered();

    @POST("/ideal/user")
    Object postUserProfile(@Body @NotNull c cVar, @NotNull Continuation<? super b> continuation);
}
