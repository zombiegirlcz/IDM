package com.revolut.retail.feature.pricing_plans.impl.network;

import kfk.a;
import kfk.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/impl/network/CreditPlansService;", "", "", "cardId", "planId", "Lkfk/a;", "getCreditCardActivationInfo", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkfk/b;", "getPlanActivationInfo", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditPlansService {
    @GET("credit-card-activation-info")
    Object getCreditCardActivationInfo(@NotNull @Query("cardId") String str, @Query("planId") String str2, @NotNull Continuation<? super a> continuation);

    @GET("/plans/{planId}/activation-info")
    Object getPlanActivationInfo(@Path("planId") @NotNull String str, @NotNull Continuation<? super b> continuation);
}
