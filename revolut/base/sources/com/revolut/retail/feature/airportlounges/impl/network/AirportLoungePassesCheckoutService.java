package com.revolut.retail.feature.airportlounges.impl.network;

import gwi.i2;
import gwi.j3;
import gwi.l2;
import gwi.o2;
import gwi.r2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J0\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\u000e\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\b\b\u0001\u0010\u0015\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/network/AirportLoungePassesCheckoutService;", "", "Lgwi/j3;", "getLoungePassesQuotes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "priceQuoteTraceId", "", "entries", "", "ignoreUpsell", "Lgwi/i2;", "getLoungePassesPricing", "(Ljava/lang/String;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "idempotencyKey", "Lgwi/l2;", "body", "Lretrofit2/Response;", "Lgwi/o2;", "postPurchase", "(Ljava/lang/String;Lgwi/l2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "groupKey", "Lgwi/r2;", "getPurchaseState", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AirportLoungePassesCheckoutService {
    @GET("/lounges/v2/lounge-passes/pricing")
    Object getLoungePassesPricing(@Header("X-Price-Quote-Trace-Id") String str, @Query("entries") int i, @Query("ignoreUpsell") boolean z, @NotNull Continuation<? super i2> continuation);

    @GET("/lounges/v2/lounge-passes/quotes")
    Object getLoungePassesQuotes(@NotNull Continuation<? super j3> continuation);

    @GET("/lounges/v2/lounge-passes/purchase/{groupKey}")
    Object getPurchaseState(@Path("groupKey") @NotNull String str, @NotNull Continuation<? super Response<r2>> continuation);

    @POST("/lounges/v2/lounge-passes/purchase/async")
    Object postPurchase(@Header("X-Idempotency-Key") @NotNull String str, @Body @NotNull l2 l2Var, @NotNull Continuation<? super Response<o2>> continuation);
}
