package com.revolut.shared.feature.recurring_payments.data.services;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o9l.a0;
import o9l.f;
import o9l.r;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import wj0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0015J&\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0010\u001a\u00020\u00022\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0019\u0010\b¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/recurring_payments/data/services/StandingOrdersService;", "", "", "walletId", "enabledExperiments", "", "Lo9l/r;", "getStandingOrders", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo9l/f;", "request", "location", "Lwj0/b;", "idempotencyTag", "postRecurringPaymentOrder", "(Lo9l/f;Ljava/lang/String;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "Lo9l/a0;", "putRecurringPaymentOrder", "(Ljava/lang/String;Lo9l/a0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activateRecurringPaymentOrder", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deactivateRecurringPaymentOrder", "reason", "", "deleteRecurringPaymentOrder", "feature_shared_recurring_payments_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StandingOrdersService {
    @Headers({"X-Api-Version: v2"})
    @POST("/standing-orders/{id}/activation")
    Object activateRecurringPaymentOrder(@Path("id") @NotNull String str, @NotNull Continuation<? super r> continuation);

    @Headers({"X-Api-Version: v2"})
    @POST("/standing-orders/{id}/deactivation")
    Object deactivateRecurringPaymentOrder(@Path("id") @NotNull String str, @NotNull Continuation<? super r> continuation);

    @DELETE("/standing-orders/{id}")
    Object deleteRecurringPaymentOrder(@Path("id") @NotNull String str, @Query("reason") String str2, @NotNull Continuation<? super Unit> continuation);

    @Headers({"X-Api-Version: v2"})
    @GET("/standing-orders")
    Object getStandingOrders(@Query("walletId") String str, @Header("X-Enabled-Experiments") String str2, @NotNull Continuation<? super List<r>> continuation);

    @Headers({"X-Api-Version: v2"})
    @POST("/standing-orders")
    Object postRecurringPaymentOrder(@Body @NotNull f fVar, @Header("X-Client-Geo-Location") String str, @Tag @NotNull b bVar, @NotNull Continuation<? super r> continuation);

    @Headers({"X-Api-Version: v2"})
    @PUT("/standing-orders/{id}")
    Object putRecurringPaymentOrder(@Path("id") @NotNull String str, @Body @NotNull a0 a0Var, @NotNull Continuation<? super r> continuation);
}
