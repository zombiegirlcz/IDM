package com.revolut.chat.data.network;

import e20.a;
import e20.b;
import e20.c;
import e20.d;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/chat/data/network/AuthenticationApi;", "", "Le20/c;", "request", "Lefm/d0;", "Le20/a;", "signInAnonymousByPhone", "(Le20/c;)Lefm/d0;", "Le20/b;", "signInAnonymousByEmail", "(Le20/b;)Lefm/d0;", "Le20/d;", "signInVerification", "(Le20/d;)Lefm/d0;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AuthenticationApi {
    @Headers({"X-Force-App-Auth: true"})
    @POST("/api/client/signin/anonymous")
    @NotNull
    d0<a> signInAnonymousByEmail(@Body @NotNull b request);

    @Headers({"X-Force-App-Auth: true"})
    @POST("/api/client/signin/anonymous")
    @NotNull
    d0<a> signInAnonymousByPhone(@Body @NotNull c request);

    @zj0.b
    @NotNull
    @Headers({"X-Force-App-Auth: true"})
    @POST("/api/client/signin")
    d0<a> signInVerification(@Body @NotNull d request);
}
