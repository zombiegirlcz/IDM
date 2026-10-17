package com.revolut.feature.rewards.impl.data.network.services;

import ahc.c;
import efm.b;
import efm.d0;
import ehc.a;
import ehc.f;
import ehc.k;
import ehc.l;
import ehc.r;
import ehc.u;
import ehc.v;
import ehc.w;
import ehc.y;
import ehc.z;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JQ\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\b\b\u0001\u0010\u0013\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\u000fJ\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\b2\b\b\u0001\u0010\u0013\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\u000fJ\u0019\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0013\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\b\b\u0001\u0010\u0013\u001a\u00020\u0002H'¢\u0006\u0004\b\u001c\u0010\u000fJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\b2\b\b\u0001\u0010\u0013\u001a\u00020\u0002H'¢\u0006\u0004\b\u001e\u0010\u000fJ\u0019\u0010\u001f\u001a\u00020\u00182\b\b\u0001\u0010\u0013\u001a\u00020\u0002H'¢\u0006\u0004\b\u001f\u0010\u001aJ\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b \u0010\u000fJ5\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\b2\b\b\u0001\u0010!\u001a\u00020\u00022\u0014\b\u0001\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\"H'¢\u0006\u0004\b%\u0010&J%\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\b2\u000e\b\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020'H'¢\u0006\u0004\b*\u0010+J%\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\b2\u000e\b\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020'H'¢\u0006\u0004\b,\u0010+J7\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\b2\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b/\u00100J%\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00050\b2\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b2\u0010\u000fJ\u0015\u00104\u001a\b\u0012\u0004\u0012\u0002030\bH'¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0018H'¢\u0006\u0004\b6\u00107J$\u0010:\u001a\u0002092\b\b\u0001\u0010!\u001a\u00020\u00022\b\b\u0001\u00108\u001a\u00020\u0002H§@¢\u0006\u0004\b:\u0010;J\u001a\u0010>\u001a\u00020=2\b\b\u0001\u0010<\u001a\u00020\u0002H§@¢\u0006\u0004\b>\u0010?J\u0010\u0010A\u001a\u00020@H§@¢\u0006\u0004\bA\u0010B¨\u0006CÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/rewards/impl/data/network/services/RewardsService;", "", "", "lat", "long", "", "excludedSourceTypes", "includedSourceTypes", "Lefm/d0;", "Lehc/y;", "getRewards", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lefm/d0;", "rewardId", "Lehc/r;", "getRewardDetailsByUserSpecificRewardId", "(Ljava/lang/String;)Lefm/d0;", "userId", "getRewardDetailsById", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "perkId", "Lihc/a;", "getExternalMerchantUrl", "Lkhc/b;", "getSubscriptionUrl", "Lefm/b;", "cancelSubscription", "(Ljava/lang/String;)Lefm/b;", "Lkhc/a;", "getSubscriptionCancellationState", "Lehc/l;", "redeem", "redeemViaEmail", "activateReward", "merchantRef", "", "parameters", "Lehc/w;", "completeExternalRewardRegistration", "(Ljava/lang/String;Ljava/util/Map;)Lefm/d0;", "", "rewardIdsToActivate", "Lehc/a;", "activateRewards", "(Ljava/util/Set;)Lefm/d0;", "activatePerks", "lon", "Lehc/u;", "getClosestOutlet", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lehc/z;", "getRewardsPreview", "Lehc/v;", "getPartnerMembershipApplications", "()Lefm/d0;", "activatePartnerMembership", "()Lefm/b;", "planTier", "Lehc/f;", "getPerkAccess", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "type", "Lehc/k;", "getPerks", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lahc/c;", "getPerkCategories", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RewardsService {
    @POST("/partner-membership-applications")
    @NotNull
    b activatePartnerMembership();

    @PUT("/rewards/perk/activate")
    @NotNull
    d0<a> activatePerks(@Body @NotNull Set<String> rewardIdsToActivate);

    @PATCH("/rewards/userPerk/{id}/activate")
    @NotNull
    d0<r> activateReward(@Path("id") @NotNull String rewardId);

    @PUT("/rewards/userPerk/activate")
    @NotNull
    d0<a> activateRewards(@Body @NotNull Set<String> rewardIdsToActivate);

    @PUT("/rewards/perk/{perkId}/subscription/cancellation")
    @NotNull
    b cancelSubscription(@Path("perkId") @NotNull String perkId);

    @PUT("/rewards/{merchantRef}/registration/callback")
    @NotNull
    d0<w> completeExternalRewardRegistration(@Path("merchantRef") @NotNull String merchantRef, @Body @NotNull Map<String, String> parameters);

    @GET("/rewards/userPerk/{id}/closest-outlet")
    @NotNull
    d0<u> getClosestOutlet(@Path("id") @NotNull String rewardId, @Query("lat") String lat, @Query("long") String lon);

    @GET("/rewards/perk/{id}/registration-url")
    @NotNull
    d0<ihc.a> getExternalMerchantUrl(@Path("id") @NotNull String perkId);

    @GET("/partner-membership-applications")
    @NotNull
    d0<v> getPartnerMembershipApplications();

    @GET("/rewards/perk/access")
    Object getPerkAccess(@NotNull @Query("merchant") String str, @NotNull @Query("planTier") String str2, @NotNull Continuation<? super f> continuation);

    @GET("/rewards/perks/categories")
    Object getPerkCategories(@NotNull Continuation<? super c> continuation);

    @GET("/rewards/perks")
    Object getPerks(@NotNull @Query("subscriberAccountType") String str, @NotNull Continuation<? super k> continuation);

    @GET("/rewards/perk/{id}")
    @NotNull
    d0<r> getRewardDetailsById(@Path("id") @NotNull String rewardId, @Query("userId") String userId);

    @GET("/rewards/userPerk/{id}")
    @NotNull
    d0<r> getRewardDetailsByUserSpecificRewardId(@Path("id") @NotNull String rewardId);

    @GET("/rewards")
    @NotNull
    d0<y> getRewards(@Query("lat") String lat, @Query("long") String str, @Query("excludedSourceTypes") List<String> excludedSourceTypes, @Query("includedSourceTypes") List<String> includedSourceTypes);

    @GET("/rewards/preview")
    @NotNull
    d0<List<z>> getRewardsPreview(@NotNull @Query("userId") String userId);

    @GET("/rewards/perk/{perkId}/subscription/cancellation")
    @NotNull
    d0<khc.a> getSubscriptionCancellationState(@Path("perkId") @NotNull String perkId);

    @GET("/rewards/perk/{perkId}/subscription/url")
    @NotNull
    d0<khc.b> getSubscriptionUrl(@Path("perkId") @NotNull String perkId);

    @POST("/rewards/{offerId}/redeem")
    @NotNull
    d0<l> redeem(@Path("offerId") @NotNull String perkId);

    @POST("/rewards/{perkId}/redeem-email")
    @NotNull
    b redeemViaEmail(@Path("perkId") @NotNull String perkId);
}
