package com.revolut.retail.feature.pricing_plans.ui.impl.network;

import bjk.b2;
import bjk.e0;
import bjk.u3;
import bjk.x1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J<\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\u0014\b\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0010\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/network/PricingPlanOffersService;", "", "", "type", "planReferralId", "Lbjk/x1;", "getPricingPlansPromptLayout", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "promptType", "suggestedPlanTier", "", "params", "Lbjk/e0;", "getPricingPlanContextualSelectionLayout", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbjk/u3;", "body", "postPromoOffer", "(Lbjk/u3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbjk/b2;", "", "reportPlanOfferPromptAction", "(Lbjk/b2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PricingPlanOffersService {
    @GET("/pricing-plans/benefit-prompt/layout")
    Object getPricingPlanContextualSelectionLayout(@NotNull @Query("promptType") String str, @Query("suggestedPlanTier") String str2, @QueryMap @NotNull Map<String, String> map, @NotNull Continuation<? super e0> continuation);

    @GET("/pricing-plans/prompt/layout")
    Object getPricingPlansPromptLayout(@NotNull @Query("type") String str, @Query("planReferralId") String str2, @NotNull Continuation<? super x1> continuation);

    @POST("/pricing-plans/promo/offer")
    Object postPromoOffer(@Body @NotNull u3 u3Var, @NotNull Continuation<? super x1> continuation);

    @PUT("/pricing-plans/promo/action")
    Object reportPlanOfferPromptAction(@Body @NotNull b2 b2Var, @NotNull Continuation<? super Unit> continuation);
}
