package com.revolut.retail.feature.plan_rewards.impl.data.service;

import adk.b1;
import adk.l1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/data/service/PlanRewardsService;", "", "", "url", "Ladk/b1;", "getProductArticle", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ladk/l1;", "revealReward", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanRewardsService {
    @GET
    Object getProductArticle(@Url @NotNull String str, @NotNull Continuation<? super b1> continuation);

    @POST
    Object revealReward(@Url @NotNull String str, @NotNull Continuation<? super l1> continuation);
}
