package com.revolut.feature.credit.post_termination_plan.impl.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Tag;
import ta5.c;
import ta5.f;
import wj0.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J.\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/post_termination_plan/impl/network/PostTerminationPlanService;", "", "", "planId", "Lta5/c;", "getPostTerminationPlanDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lta5/f;", "request", "Lwj0/b;", "idempotencyTag", "", "repayPlan", "(Ljava/lang/String;Lta5/f;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_credit_post_termination_plan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PostTerminationPlanService {
    @GET("/credit-post-termination-plan/{planId}")
    Object getPostTerminationPlanDetails(@Path("planId") @NotNull String str, @NotNull Continuation<? super c> continuation);

    @POST("/credit-post-termination-plan/{planId}/repay")
    Object repayPlan(@Path("planId") @NotNull String str, @Body @NotNull f fVar, @Tag @NotNull b bVar, @NotNull Continuation<? super Unit> continuation);
}
