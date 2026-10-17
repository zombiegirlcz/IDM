package com.revolut.feature.incentive_reward.impl.network;

import com.revolut.feature.incentive_reward.impl.model.lotteries.b;
import gf7.o;
import hf7.c;
import java.util.Map;
import kf7.r;
import kf7.u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import lf7.k;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006J4\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0018\b\u0001\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tj\u0002`\nH§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0010\u001a\u00020\u000f2\u0018\b\u0001\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tj\u0002`\nH§@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0006J\u001a\u0010\u0016\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0006J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\u0006J$\u0010\u001c\u001a\u00020\u00072\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u0017\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001f\u0010\u0006¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/incentive_reward/impl/network/IncentiveRewardService;", "", "", "detailsId", "Lhf7/c;", "getIncentiveRewardDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sendOptOut", "", "Lcom/revolut/feature/incentive_reward/impl/model/IncentiveSelectionContextParams;", "incentiveSelectionContextParams", "sendOptIn", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contextParams", "Lgf7/o;", "getIncentiveSelection", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "campaignId", "Lretrofit2/Response;", "Llf7/k;", "redeemReward", "rejectReward", "code", "Lkf7/r;", "getLotteryEnrollmentDetails", "Lkf7/u;", "enrollState", "updateLotteryEnrollment", "(Ljava/lang/String;Lkf7/u;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/revolut/feature/incentive_reward/impl/model/lotteries/b;", "getLotteryDrawDetails", "feature_retail_incentive_reward_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IncentiveRewardService {
    @GET("incentives/v2/rewards/{detailsId}")
    Object getIncentiveRewardDetails(@Path("detailsId") @NotNull String str, @NotNull Continuation<? super c> continuation);

    @GET("incentives/available")
    Object getIncentiveSelection(@QueryMap @NotNull Map<String, String> map, @NotNull Continuation<? super o> continuation);

    @GET("incentives/lotteries/draw")
    Object getLotteryDrawDetails(@NotNull @Query("code") String str, @NotNull Continuation<? super b> continuation);

    @GET("incentives/lotteries/enrollment")
    Object getLotteryEnrollmentDetails(@NotNull @Query("code") String str, @NotNull Continuation<? super r> continuation);

    @POST("incentives/campaigns/{campaignId}/redeem-reward/")
    Object redeemReward(@Path("campaignId") @NotNull String str, @NotNull Continuation<? super Response<k>> continuation);

    @POST("incentives/campaigns/{campaignId}/reject-reward/")
    Object rejectReward(@Path("campaignId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("incentives/rewards/{detailsId}/opt-in")
    Object sendOptIn(@Path("detailsId") @NotNull String str, @QueryMap @NotNull Map<String, String> map, @NotNull Continuation<? super Unit> continuation);

    @POST("incentives/rewards/{detailsId}/opt-out")
    Object sendOptOut(@Path("detailsId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("incentives/lotteries/enrollment")
    Object updateLotteryEnrollment(@NotNull @Query("code") String str, @Body @NotNull u uVar, @NotNull Continuation<? super Unit> continuation);
}
