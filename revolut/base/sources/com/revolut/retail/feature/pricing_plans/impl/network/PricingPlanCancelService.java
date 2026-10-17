package com.revolut.retail.feature.pricing_plans.impl.network;

import efm.b;
import efm.d0;
import hfk.a;
import hfk.g;
import hfk.h;
import hfk.j;
import hfk.s;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000bH'¢\u0006\u0004\b\u0016\u0010\u000eJ\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014H§@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H'¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/impl/network/PricingPlanCancelService;", "", "Lhfk/a;", "reason", "Lefm/b;", "cancelCurrentPlan", "(Lhfk/a;)Lefm/b;", "Lhfk/g;", "survey", "sendDowngradeSurveyV2", "(Lhfk/g;)Lefm/b;", "Lefm/d0;", "Lhfk/b;", "getDowngradeSurveyConfig", "()Lefm/d0;", "", "downgradingToPlanId", "Lhfk/h;", "getCurrentPlanBenefitsToLose", "(Ljava/lang/String;)Lefm/d0;", "Lretrofit2/Response;", "Lhfk/j;", "getCancellationPreventingOffer", "Lhfk/s;", "getValueOfferReminder", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acceptCancellationPreventingOffer", "()Lefm/b;", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PricingPlanCancelService {
    @POST("/plans/current/cancellation-preventing-offer/accept")
    @NotNull
    b acceptCancellationPreventingOffer();

    @POST("/plans/current/cancel")
    @NotNull
    b cancelCurrentPlan(@Body @NotNull a reason);

    @GET("/plans/current/cancellation-preventing-offer")
    @NotNull
    d0<Response<j>> getCancellationPreventingOffer();

    @GET("/plans/current/downgrade-benefits-loss")
    @NotNull
    d0<h> getCurrentPlanBenefitsToLose(@Query("downgradingToPlan") String downgradingToPlanId);

    @GET("/downgrade-survey/config")
    @NotNull
    d0<hfk.b> getDowngradeSurveyConfig();

    @GET("/plans/current/value-offer-reminder")
    Object getValueOfferReminder(@NotNull Continuation<? super Response<s>> continuation);

    @POST("/downgrade-survey")
    @NotNull
    b sendDowngradeSurveyV2(@Body @NotNull g survey);
}
