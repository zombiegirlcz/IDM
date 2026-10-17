package com.revolut.retail.feature.pricing_plans.ui.impl.network;

import bjk.f0;
import bjk.f2;
import bjk.g2;
import bjk.l;
import bjk.m;
import bjk.r0;
import bjk.r3;
import bjk.v3;
import bjk.w0;
import bjk.w2;
import efm.d0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u0007J\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u0007J\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0007J2\u0010\u0014\u001a\u00020\u00132\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0018\u0010\u0007JM\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u00022\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001b2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010\"\u001a\u00020!2\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\b\b\u0001\u0010$\u001a\u00020\u0002H'¢\u0006\u0004\b&\u0010\u0007J!\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00042\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b)\u0010\u0007J\u001a\u0010+\u001a\u00020*2\b\b\u0001\u0010\u0012\u001a\u00020\u0002H§@¢\u0006\u0004\b+\u0010#J\u0010\u0010-\u001a\u00020,H§@¢\u0006\u0004\b-\u0010.¨\u0006/À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/network/PricingPlanUiService;", "", "", "entry", "Lefm/d0;", "Lbjk/f0;", "getPlanDashboardConfig", "(Ljava/lang/String;)Lefm/d0;", "id", "Lbjk/r3;", "getScreen", "entryPoint", "Lbjk/g2;", "getPlansDashboardLayout", "receiverUserName", "getPlanGiftingDashboardLayout", "monthlyOfferToken", "annualOfferToken", "planId", "Lbjk/m;", "getPricingPlansBillingPicker", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enabledExperiments", "Lbjk/w0;", "getPlanHubScreen", "bottomSheetId", "entrypoint", "", "additionalParameters", "Lbjk/w2;", "getBottomSheetLayout", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lefm/d0;", "feedId", "Lbjk/f2;", "getPlanUnlockableBenefitsLayout", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "planGiftId", "Lbjk/g2$d;", "getPlanGiftBenefitsLayout", "downgradingToPlanId", "Lbjk/r0;", "getDowngradePerksLoss", "Lbjk/l;", "getPlanBenefitsSuggestions", "Lbjk/v3;", "getStudentsHubScreenConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PricingPlanUiService {
    @GET("plans/hub/layouts/bottom-sheets")
    @NotNull
    d0<w2> getBottomSheetLayout(@NotNull @Query("id") String bottomSheetId, @Query("entrypoint") String entrypoint, @QueryMap @NotNull Map<String, String> additionalParameters, @Header("X-Enabled-Experiments") String enabledExperiments);

    @GET("plans/current/downgrade-perks-loss")
    @NotNull
    d0<r0> getDowngradePerksLoss(@Query("downgradingToPlan") String downgradingToPlanId);

    @GET("plan-dashboard/highlighted-benefits")
    Object getPlanBenefitsSuggestions(@NotNull @Query("planId") String str, @NotNull Continuation<? super l> continuation);

    @GET("/plans/dashboard/config")
    @NotNull
    d0<f0> getPlanDashboardConfig(@Query("entry") String entry);

    @GET("pricing-plan-gifts/{pricingPlanGiftId}/plan-layout")
    @NotNull
    d0<g2.d> getPlanGiftBenefitsLayout(@Path("pricingPlanGiftId") @NotNull String planGiftId);

    @GET("/pricing-plan-gifts/send-gift-layout")
    @NotNull
    d0<g2> getPlanGiftingDashboardLayout(@NotNull @Query("receiverUsername") String receiverUserName);

    @GET("plans/hub/layouts/main-screen")
    @NotNull
    d0<w0> getPlanHubScreen(@Header("X-Enabled-Experiments") String enabledExperiments);

    @GET("plans/unlockable-benefits")
    Object getPlanUnlockableBenefitsLayout(@Query("feedId") String str, @NotNull Continuation<? super f2> continuation);

    @GET("/plan-dashboard/layout")
    @NotNull
    d0<g2> getPlansDashboardLayout(@NotNull @Query("entryPoint") String entryPoint);

    @GET("/pricing-plans/{id}/billing-picker")
    Object getPricingPlansBillingPicker(@Header("X-Monthly-Offer-Token") String str, @Header("X-Annual-Offer-Token") String str2, @Path("id") @NotNull String str3, @NotNull Continuation<? super m> continuation);

    @GET("/plans/screens")
    @NotNull
    d0<r3> getScreen(@NotNull @Query("id") String id10);

    @GET("/students/hub")
    Object getStudentsHubScreenConfig(@NotNull Continuation<? super v3> continuation);
}
