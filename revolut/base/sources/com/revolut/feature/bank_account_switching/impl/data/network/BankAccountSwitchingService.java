package com.revolut.feature.bank_account_switching.impl.data.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rn2.a0;
import rn2.b;
import rn2.e;
import rn2.f;
import rn2.g;
import rn2.h;
import rn2.i;
import rn2.k;
import rn2.q;
import rn2.r;
import rn2.s;
import rn2.t;
import rn2.u;
import rn2.w;
import rn2.z;
import wn2.a;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\r\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u0005H§@¢\u0006\u0004\b\u001a\u0010\u0013J\u001a\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u0018\u001a\u00020\u0005H§@¢\u0006\u0004\b\u001c\u0010\u0013J\u001a\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\r\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020!2\b\b\u0001\u0010\u0018\u001a\u00020\u0005H§@¢\u0006\u0004\b\"\u0010\u0013J\u001a\u0010$\u001a\u00020#2\b\b\u0001\u0010\u0018\u001a\u00020\u0005H§@¢\u0006\u0004\b$\u0010\u0013J\u001a\u0010%\u001a\u00020#2\b\b\u0001\u0010\u0018\u001a\u00020\u0005H§@¢\u0006\u0004\b%\u0010\u0013J\u001a\u0010&\u001a\u00020#2\b\b\u0001\u0010\u0018\u001a\u00020\u0005H§@¢\u0006\u0004\b&\u0010\u0013J\u001a\u0010(\u001a\u00020'2\b\b\u0001\u0010\u0018\u001a\u00020\u0005H§@¢\u0006\u0004\b(\u0010\u0013J$\u0010*\u001a\u00020#2\b\b\u0001\u0010\u0018\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020)H§@¢\u0006\u0004\b*\u0010+J \u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\b\b\u0001\u0010,\u001a\u00020\u0005H§@¢\u0006\u0004\b/\u0010\u0013¨\u00060À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/data/network/BankAccountSwitchingService;", "", "Lrn2/s;", "getSwitchRequests", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "switchType", "Lwn2/a;", "targetAccountType", "Lrn2/k;", "getForm", "(Ljava/lang/String;Lwn2/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrn2/q;", "request", "Lrn2/r;", "validateForm", "(Lrn2/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrn2/b;", "getCalendar", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrn2/t;", "Lrn2/u;", "getInboundReview", "(Lrn2/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestId", "Lrn2/h;", "getJointReview", "Lrn2/i;", "getSwitchOutReview", "Lrn2/z;", "Lrn2/a0;", "submitRequest", "(Lrn2/z;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrn2/w;", "getRequestStatus", "", "cancelRequest", "acceptRequest", "rejectRequest", "Lrn2/g;", "getPaymentsToReview", "Lrn2/f;", "confirmPayments", "(Ljava/lang/String;Lrn2/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scenario", "", "Lrn2/e;", "getObligatedProducts", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BankAccountSwitchingService {
    @POST("account-switches/requests/{requestId}/accept")
    Object acceptRequest(@Path("requestId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @DELETE("account-switches/requests/{requestId}")
    Object cancelRequest(@Path("requestId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @PATCH("account-switches/{requestId}/payments")
    Object confirmPayments(@Path("requestId") @NotNull String str, @Body @NotNull f fVar, @NotNull Continuation<? super Unit> continuation);

    @GET("account-switches/calendars")
    Object getCalendar(@NotNull @Query("switchType") String str, @NotNull Continuation<? super b> continuation);

    @GET("account-switches/forms")
    Object getForm(@NotNull @Query("switchType") String str, @Query("targetAccountType") a aVar, @NotNull Continuation<? super k> continuation);

    @POST("account-switches/requests/review")
    Object getInboundReview(@Body @NotNull t tVar, @NotNull Continuation<? super u> continuation);

    @GET("account-switches/requests/{requestId}/review")
    Object getJointReview(@Path("requestId") @NotNull String str, @NotNull Continuation<? super h> continuation);

    @GET("user/current/terminate/check")
    Object getObligatedProducts(@NotNull @Query("scenario") String str, @NotNull Continuation<? super List<e>> continuation);

    @GET("account-switches/{requestId}/payments")
    Object getPaymentsToReview(@Path("requestId") @NotNull String str, @NotNull Continuation<? super g> continuation);

    @GET("account-switches/requests/{requestId}")
    Object getRequestStatus(@Path("requestId") @NotNull String str, @NotNull Continuation<? super w> continuation);

    @GET("account-switches/requests/{requestId}/review")
    Object getSwitchOutReview(@Path("requestId") @NotNull String str, @NotNull Continuation<? super i> continuation);

    @GET("account-switches/requests")
    Object getSwitchRequests(@NotNull Continuation<? super s> continuation);

    @POST("account-switches/requests/{requestId}/reject")
    Object rejectRequest(@Path("requestId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("account-switches/requests")
    Object submitRequest(@Body @NotNull z zVar, @NotNull Continuation<? super a0> continuation);

    @POST("account-switches/requests/validate")
    Object validateForm(@Body @NotNull q qVar, @NotNull Continuation<? super r> continuation);
}
