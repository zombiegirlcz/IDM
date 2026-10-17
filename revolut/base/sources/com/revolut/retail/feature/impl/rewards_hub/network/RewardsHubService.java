package com.revolut.retail.feature.impl.rewards_hub.network;

import ib.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ttj.a0;
import ttj.d0;
import ttj.f;
import ttj.f2;
import ttj.i;
import ttj.i2;
import ttj.l2;
import ttj.m0;
import ttj.n1;
import ttj.o;
import ttj.t1;
import ttj.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J8\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u0019\u0010\u0011J2\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u001a\u001a\u00020\u00022\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001cH§@¢\u0006\u0004\b\u001f\u0010 J&\u0010\"\u001a\u00020!2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$H§@¢\u0006\u0004\b%\u0010\u0011J\u001a\u0010)\u001a\u00020(2\b\b\u0001\u0010'\u001a\u00020&H§@¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\b\u0001\u0010+\u001a\u00020\u0002H§@¢\u0006\u0004\b-\u0010\u0015J$\u0010.\u001a\u00020(2\b\b\u0001\u0010+\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b.\u0010#J$\u00100\u001a\u00020/2\b\b\u0001\u0010+\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b0\u0010#¨\u00061À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/impl/rewards_hub/network/RewardsHubService;", "", "", "challengeCampaignId", "challengeId", "ifModifiedSince", "Lretrofit2/Response;", "Lttj/o;", "getChallengeDetails", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lstj/f;", "startChallengeRequestBody", "Lttj/i2;", "startChallenge", "(Ljava/lang/String;Lstj/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lttj/n1;", "getRewardsHub", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", b.Screen, "Lttj/f2;", "getRewardsHubWidget", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lttj/t1;", "getEligibilityCriteria", "Lttj/a0;", "getChallengesEligibility", "type", "cursor", "", "limit", "Lttj/d0;", "getChallengeHistory", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lttj/u;", "getChallenge", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lttj/l2;", "getUnacknowledgedChallenges", "Lttj/f;", "request", "", "acknowledgeChallenges", "(Lttj/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectionId", "Lttj/m0;", "getCollection", "revealChallengeCampaign", "Lttj/i;", "activateChallengeCampaign", "feature_rewards_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RewardsHubService {
    @POST("incentives/rewards-hub/challenges/acknowledge")
    Object acknowledgeChallenges(@Body @NotNull f fVar, @NotNull Continuation<? super Unit> continuation);

    @POST("incentives/rewards-hub/collections/{collectionId}/campaigns/{challengeCampaignId}/activate")
    Object activateChallengeCampaign(@Path("collectionId") @NotNull String str, @Path("challengeCampaignId") @NotNull String str2, @NotNull Continuation<? super i> continuation);

    @GET("incentives/rewards-hub/challenges/{challengeCampaignId}/info")
    Object getChallenge(@Path("challengeCampaignId") @NotNull String str, @Query("userChallengeId") String str2, @NotNull Continuation<? super u> continuation);

    @GET("incentives/rewards-hub/challenges/{challengeCampaignId}")
    Object getChallengeDetails(@Path("challengeCampaignId") @NotNull String str, @Query("userChallengeId") String str2, @Header("If-Modified-Since") String str3, @NotNull Continuation<? super Response<o>> continuation);

    @GET("incentives/rewards-hub/challenges")
    Object getChallengeHistory(@NotNull @Query("type") String str, @Query("cursor") String str2, @Query("limit") Integer num, @NotNull Continuation<? super d0> continuation);

    @GET("incentives/rewards-hub/challenges/eligibility")
    Object getChallengesEligibility(@NotNull Continuation<? super a0> continuation);

    @GET("incentives/rewards-hub/collections/{collectionId}")
    Object getCollection(@Path("collectionId") @NotNull String str, @NotNull Continuation<? super m0> continuation);

    @GET("incentives/rewards-hub/challenges/{challengeCampaignId}/eligibility-criteria")
    Object getEligibilityCriteria(@Path("challengeCampaignId") @NotNull String str, @NotNull Continuation<? super t1> continuation);

    @GET("incentives/rewards-hub")
    Object getRewardsHub(@NotNull Continuation<? super n1> continuation);

    @GET("incentives/rewards-hub/widget")
    Object getRewardsHubWidget(@NotNull @Query(b.Screen) String str, @NotNull Continuation<? super f2> continuation);

    @GET("incentives/rewards-hub/challenges/unacknowledged")
    Object getUnacknowledgedChallenges(@NotNull Continuation<? super l2> continuation);

    @POST("incentives/rewards-hub/collections/{collectionId}/campaigns/{challengeCampaignId}/reveal")
    Object revealChallengeCampaign(@Path("collectionId") @NotNull String str, @Path("challengeCampaignId") @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @POST("incentives/rewards-hub/challenges/{challengeCampaignId}")
    Object startChallenge(@Path("challengeCampaignId") @NotNull String str, @Body @NotNull stj.f fVar, @NotNull Continuation<? super i2> continuation);
}
