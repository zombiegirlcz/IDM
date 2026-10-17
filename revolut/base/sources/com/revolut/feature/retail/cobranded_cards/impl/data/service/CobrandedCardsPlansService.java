package com.revolut.feature.retail.cobranded_cards.impl.data.service;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import w5b.c5;
import w5b.d3;
import w5b.f;
import w5b.n1;
import w5b.q1;
import w5b.w4;
import w5b.z4;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0014\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0016\u0010\tJ\u001a\u0010\u0018\u001a\u00020\u00112\b\b\u0001\u0010\u0010\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/data/service/CobrandedCardsPlansService;", "", "Lw5b/z4;", "getProductArticleId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "brand", "Lw5b/q1;", "getPlanDashboard", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlanSwitchDashboard", "Lw5b/d3;", "getPlanHub", "Lw5b/n1;", "getCurrentPlan", "Lw5b/w4;", "request", "", "subscribe", "(Lw5b/w4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "code", "Lw5b/f;", "getAvailableRewards", "Lw5b/c5;", "selectReward", "(Lw5b/c5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CobrandedCardsPlansService {
    @GET("co-brands/rewards/{code}")
    Object getAvailableRewards(@Path("code") @NotNull String str, @NotNull Continuation<? super f> continuation);

    @GET("co-brands/plan/current")
    Object getCurrentPlan(@NotNull Continuation<? super n1> continuation);

    @GET("co-brands/plan-dashboard")
    Object getPlanDashboard(@Query("brand") String str, @NotNull Continuation<? super q1> continuation);

    @GET("co-brands/plan-hub")
    Object getPlanHub(@NotNull Continuation<? super d3> continuation);

    @GET("co-brands/plan-switch")
    Object getPlanSwitchDashboard(@NotNull Continuation<? super q1> continuation);

    @GET("co-brands/product-article")
    Object getProductArticleId(@NotNull Continuation<? super z4> continuation);

    @PUT("co-brands/rewards/select")
    Object selectReward(@Body @NotNull c5 c5Var, @NotNull Continuation<? super Unit> continuation);

    @POST("co-brands/subscribe")
    Object subscribe(@Body @NotNull w4 w4Var, @NotNull Continuation<? super Unit> continuation);
}
