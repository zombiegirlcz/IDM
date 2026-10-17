package com.revolut.retail.feature.airportlounges.impl.network;

import gwi.a0;
import gwi.d0;
import gwi.e1;
import gwi.m0;
import gwi.s0;
import gwi.y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u0013\u0010\u000bJ \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u0015\u0010\u000b¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/network/AirportLoungeNewPassesService;", "", "", "Lgwi/m0;", "getLoungePassDetailsList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgwi/s0;", "getLoungePassRecentPassengers", "", "passId", "getLoungePassDetailsByPassId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgwi/a0;", "requestDto", "Lretrofit2/Response;", "Lgwi/d0;", "assignPassengerToLoungePassByPassId", "(Ljava/lang/String;Lgwi/a0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgwi/y0;", "getPassRefundBreakdown", "Lgwi/e1;", "putPassRefund", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AirportLoungeNewPassesService {
    @PUT("/lounges/v2/lounge-passes/{id}")
    Object assignPassengerToLoungePassByPassId(@Path("id") @NotNull String str, @Body @NotNull a0 a0Var, @NotNull Continuation<? super Response<d0>> continuation);

    @GET("/lounges/v2/lounge-passes/{id}")
    Object getLoungePassDetailsByPassId(@Path("id") @NotNull String str, @NotNull Continuation<? super m0> continuation);

    @GET("/lounges/v2/lounge-passes/list")
    Object getLoungePassDetailsList(@NotNull Continuation<? super List<m0>> continuation);

    @GET("/lounges/v2/lounge-passes/recent-passengers")
    Object getLoungePassRecentPassengers(@NotNull Continuation<? super List<s0>> continuation);

    @GET("/lounges/v2/lounge-passes/{id}/refund")
    Object getPassRefundBreakdown(@Path("id") @NotNull String str, @NotNull Continuation<? super y0> continuation);

    @PUT("/lounges/v2/lounge-passes/{id}/refund")
    Object putPassRefund(@Path("id") @NotNull String str, @NotNull Continuation<? super Response<e1>> continuation);
}
