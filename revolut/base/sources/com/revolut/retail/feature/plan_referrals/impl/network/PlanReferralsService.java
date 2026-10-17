package com.revolut.retail.feature.plan_referrals.impl.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import tck.f;
import tck.m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/plan_referrals/impl/network/PlanReferralsService;", "", "Ltck/m;", "requestBody", "", "sendReferrals", "(Ltck/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltck/f;", "getCampaignInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "referralId", "cancelReferral", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "claimReferral", "feature_retail_plan_referrals_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanReferralsService {
    @POST("/plans/referrals/{planReferralId}/cancel")
    Object cancelReferral(@Path("planReferralId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("/plans/referrals/{planReferralId}/claim")
    Object claimReferral(@Path("planReferralId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("/plans/referrals")
    Object getCampaignInfo(@NotNull Continuation<? super f> continuation);

    @POST("/plans/referrals")
    Object sendReferrals(@Body @NotNull m mVar, @NotNull Continuation<? super Unit> continuation);
}
