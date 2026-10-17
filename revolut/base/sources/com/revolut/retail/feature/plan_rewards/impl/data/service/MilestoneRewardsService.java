package com.revolut.retail.feature.plan_rewards.impl.data.service;

import adk.i;
import adk.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\u0004¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/data/service/MilestoneRewardsService;", "", "Ladk/i;", "getMilestoneRewards", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "optOutFromMilestoneRewards", "Ladk/l;", "getOptInStatus", "optInToMilestoneRewards", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MilestoneRewardsService {
    @GET("milestone-rewards")
    Object getMilestoneRewards(@NotNull Continuation<? super i> continuation);

    @GET("milestone-rewards/opt-in")
    Object getOptInStatus(@NotNull Continuation<? super l> continuation);

    @POST("milestone-rewards/opt-in")
    Object optInToMilestoneRewards(@NotNull Continuation<? super Unit> continuation);

    @DELETE("milestone-rewards/opt-out")
    Object optOutFromMilestoneRewards(@NotNull Continuation<? super Unit> continuation);
}
