package com.revolut.chat.data.network;

import efm.d0;
import f20.a;
import f20.c;
import f20.d;
import f20.f;
import f20.g;
import f20.h;
import f20.j;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import m20.n;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\tJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0001\u0010\u0013\u001a\u00020\u000e2\b\b\u0001\u0010\u0014\u001a\u00020\u000e2\b\b\u0003\u0010\u0015\u001a\u00020\u0001H§@¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\b\u0003\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\b\u0001\u0010 \u001a\u00020\u000eH§@¢\u0006\u0004\b\"\u0010\u0012¨\u0006#À\u0006\u0003"}, d2 = {"Lcom/revolut/chat/data/network/InAppCallSupportApi;", "", "Lf20/g;", "request", "Lm20/n;", "createInboundCall", "(Lf20/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf20/h;", "getInboundCallConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf20/j;", "getInAppCallTwilioToken", "Lf20/c;", "getCallsInfo", "Ljava/util/UUID;", "callId", "Lf20/a;", "getCallDetails", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ticketId", "correlationId", "body", "Lretrofit2/Response;", "", "confirmIdentity", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "channel", "Lefm/d0;", "Lf20/d;", "getCategories", "(Ljava/lang/String;)Lefm/d0;", "feedId", "Lf20/f;", "checkInAppCallAvailability", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InAppCallSupportApi {
    @GET("/api/client/feeds/{id}/check-in-app-call")
    Object checkInAppCallAvailability(@Path("id") @NotNull UUID uuid, @NotNull Continuation<? super f> continuation);

    @POST("/api/client/tickets/{id}/confirm-identity")
    Object confirmIdentity(@Path("id") @NotNull UUID uuid, @NotNull @Query("correlationId") UUID uuid2, @Body @NotNull Object obj2, @NotNull Continuation<? super Response<Unit>> continuation);

    @POST("/api/client/tickets/in-app-call")
    Object createInboundCall(@Body @NotNull g gVar, @NotNull Continuation<? super n> continuation);

    @GET("/api/client/calls/{callId}")
    Object getCallDetails(@Path("callId") @NotNull UUID uuid, @NotNull Continuation<? super a> continuation);

    @GET("api/client/calls")
    Object getCallsInfo(@NotNull Continuation<? super c> continuation);

    @GET("/api/client/categories")
    @NotNull
    d0<d> getCategories(@NotNull @Query("channel") String channel);

    @GET("/api/client/in-app-calls/token")
    Object getInAppCallTwilioToken(@NotNull Continuation<? super j> continuation);

    @GET("/api/client/in-app-calls/config")
    Object getInboundCallConfig(@NotNull Continuation<? super h> continuation);
}
