package com.revolut.retail.feature.pricing_plans.impl.network;

import efm.b;
import efm.d0;
import gfk.a;
import gfk.b0;
import gfk.d;
import gfk.g;
import gfk.g0;
import gfk.h0;
import gfk.i0;
import gfk.j;
import gfk.q;
import gfk.r;
import gfk.r0;
import gfk.u;
import gfk.v;
import gfk.x;
import hfk.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H'¢\u0006\u0004\b\r\u0010\u000eJ[\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00052\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u000f\u001a\u00020\u00052\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u001e\u001a\u00020\u001dH'¢\u0006\u0004\b \u0010!J#\u0010#\u001a\u00020\u001f2\b\b\u0001\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u001e\u001a\u00020\"H'¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\u001f2\b\b\u0001\u0010\u000f\u001a\u00020\u0005H'¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\b0\u0007H'¢\u0006\u0004\b(\u0010\u000eJ\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0007H'¢\u0006\u0004\b*\u0010\u000eJ\u001b\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\b0\u0007H'¢\u0006\u0004\b,\u0010\u000eJ\u001b\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\b0\u0007H'¢\u0006\u0004\b-\u0010\u000eJ\u001b\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0\u0007H'¢\u0006\u0004\b0\u0010\u000eJ\u0015\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0007H'¢\u0006\u0004\b2\u0010\u000eJ\u001b\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\b0\u0007H'¢\u0006\u0004\b4\u0010\u000eJ\u0010\u00106\u001a\u000205H§@¢\u0006\u0004\b6\u0010\u0004J\u001b\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\b0\u0007H'¢\u0006\u0004\b8\u0010\u000eJ\u000f\u00109\u001a\u00020\u001fH'¢\u0006\u0004\b9\u0010:J\u001a\u0010;\u001a\u00020/2\b\b\u0001\u0010\u000f\u001a\u00020\u0005H§@¢\u0006\u0004\b;\u0010<J$\u0010?\u001a\u00020/2\b\b\u0001\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010>\u001a\u00020=H§@¢\u0006\u0004\b?\u0010@¨\u0006AÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/impl/network/PricingPlanService;", "", "Lgfk/g;", "getMinimumBalanceInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "forProgressionTo", "Lefm/d0;", "", "Lgfk/v;", "getAvailablePricingPlans", "(Ljava/lang/String;)Lefm/d0;", "Lgfk/b0;", "getPricingPlanSubscription", "()Lefm/d0;", "planId", "billingOption", "", "bypassOnNoCardFee", "reason", "source", "planDiscountId", "Lhfk/o;", "getPlanSubscribeInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "pricingPlanGiftId", "Lgfk/g0;", "getSubscriptionPreviews", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgfk/d;", "request", "Lefm/b;", "subscribeToPlan", "(Ljava/lang/String;Lgfk/d;)Lefm/b;", "Lgfk/a;", "applyDiscount", "(Ljava/lang/String;Lgfk/a;)Lefm/b;", "removeFromWaitingList", "(Ljava/lang/String;)Lefm/b;", "Lgfk/r0;", "getPlanLimits", "Lgfk/r;", "getPlansUsageLimits", "Lgfk/h0;", "getPlanSuggestions", "getPlanDashboardSuggestions", "Lretrofit2/Response;", "", "assignFreeTrial", "Lgfk/x;", "getPlanHub", "Lgfk/j;", "getPlanFeatures", "Lgfk/u;", "getPlanCampaigns", "Lgfk/i0;", "getLoyaltyEarnRates", "deleteFuturePlan", "()Lefm/b;", "prepareDurableMediumsTerms", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgfk/q;", "body", "postTermsDownloaded", "(Ljava/lang/String;Lgfk/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PricingPlanService {
    @POST("/plans/{id}/discount")
    @NotNull
    b applyDiscount(@Path("id") @NotNull String planId, @Body @NotNull a request);

    @POST("/plans/discounts/assign")
    @NotNull
    d0<Response<Unit>> assignFreeTrial();

    @DELETE("/plans/future")
    @NotNull
    b deleteFuturePlan();

    @GET("plans")
    @NotNull
    d0<List<v>> getAvailablePricingPlans(@Query("forProgressionTo") String forProgressionTo);

    @GET("/plans/loyalty-earn-rates")
    @NotNull
    d0<List<i0>> getLoyaltyEarnRates();

    @GET("plans/minimum-balance")
    Object getMinimumBalanceInfo(@NotNull Continuation<? super g> continuation);

    @GET("/plans/campaigns")
    Object getPlanCampaigns(@NotNull Continuation<? super u> continuation);

    @GET("/plan-dashboard/suggestions")
    @NotNull
    d0<List<h0>> getPlanDashboardSuggestions();

    @GET("/plans/features")
    @NotNull
    d0<List<j>> getPlanFeatures();

    @GET("/plans/hub")
    @NotNull
    d0<x> getPlanHub();

    @GET("plan/limits")
    @NotNull
    d0<List<r0>> getPlanLimits();

    @GET("/plans/{id}/subscribe-info")
    @NotNull
    d0<o> getPlanSubscribeInfo(@Path("id") @NotNull String planId, @Query("billingOption") String billingOption, @Query("bypassOnNoCardFee") Boolean bypassOnNoCardFee, @Query("reason") String reason, @Query("source") String source, @Query("planDiscountId") String planDiscountId);

    @GET("plans/suggestions")
    @NotNull
    d0<List<h0>> getPlanSuggestions();

    @GET("/plans/usage-limits")
    @NotNull
    d0<r> getPlansUsageLimits();

    @GET("plans/current")
    @NotNull
    d0<b0> getPricingPlanSubscription();

    @GET("/plans/{id}/subscription-previews")
    Object getSubscriptionPreviews(@Path("id") @NotNull String str, @Query("billingOption") String str2, @Query("pricingPlanGiftId") String str3, @NotNull Continuation<? super g0> continuation);

    @PATCH("/plan-terms/{id}/durable-medium")
    Object postTermsDownloaded(@Path("id") @NotNull String str, @Body @NotNull q qVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/plan-terms/{id}/durable-medium")
    Object prepareDurableMediumsTerms(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @DELETE("plans/{id}/reservation")
    @NotNull
    b removeFromWaitingList(@Path("id") @NotNull String planId);

    @POST("/plans/{id}/subscribe")
    @NotNull
    b subscribeToPlan(@Path("id") @NotNull String planId, @Body @NotNull d request);
}
