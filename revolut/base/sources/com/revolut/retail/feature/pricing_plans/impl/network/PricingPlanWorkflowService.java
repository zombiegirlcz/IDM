package com.revolut.retail.feature.pricing_plans.impl.network;

import gfk.j0;
import gfk.k0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/impl/network/PricingPlanWorkflowService;", "", "Lgfk/j0;", "getWorkflowsConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "planId", "Lgfk/k0;", "getTermsWorkflow", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PricingPlanWorkflowService {
    @POST("plans/{planId}/terms-workflow")
    Object getTermsWorkflow(@Path("planId") @NotNull String str, @NotNull Continuation<? super k0> continuation);

    @GET("plans/workflows/config")
    Object getWorkflowsConfig(@NotNull Continuation<? super j0> continuation);
}
