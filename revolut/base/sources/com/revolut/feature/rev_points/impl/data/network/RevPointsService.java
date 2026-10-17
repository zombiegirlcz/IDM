package com.revolut.feature.rev_points.impl.data.network;

import efm.b;
import efm.d0;
import efm.k;
import hxb.a;
import hxb.c;
import hxb.d;
import hxb.e0;
import hxb.f;
import hxb.f0;
import hxb.i;
import hxb.l;
import hxb.m;
import hxb.n;
import hxb.p;
import hxb.q;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0014\u0010\u0005J\u001b\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000b0\u0002H'¢\u0006\u0004\b\u0016\u0010\u0005J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002H'¢\u0006\u0004\b\u0018\u0010\u0005J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0002H'¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\u001bH'¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000b0\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u000fH'¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u001b2\b\b\u0001\u0010\u001e\u001a\u00020\u000fH'¢\u0006\u0004\b\"\u0010#J'\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u000b0\u00022\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b&\u0010!J\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u000fH'¢\u0006\u0004\b(\u0010!J\u0019\u0010+\u001a\u00020\u001b2\b\b\u0001\u0010*\u001a\u00020)H'¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0002H'¢\u0006\u0004\b.\u0010\u0005J\u0019\u00100\u001a\u00020\u001b2\b\b\u0001\u0010/\u001a\u00020\u000fH'¢\u0006\u0004\b0\u0010#J\u001f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00022\b\b\u0001\u0010/\u001a\u00020\u000fH'¢\u0006\u0004\b2\u0010!J%\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u000b0\u00022\b\b\u0001\u00104\u001a\u000203H'¢\u0006\u0004\b6\u00107J9\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00022\n\b\u0001\u00109\u001a\u0004\u0018\u0001082\n\b\u0001\u0010:\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b=\u0010>¨\u0006?À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/rev_points/impl/data/network/RevPointsService;", "", "Lefm/d0;", "Lhxb/f;", "getRevPointsAccount", "()Lefm/d0;", "", "to", "from", "", "count", "", "Lhxb/f0;", "getLastRevPointsTransactions", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;)Lefm/d0;", "", "transactionId", "Lefm/k;", "getRevPointsTransactionById", "(Ljava/lang/String;)Lefm/k;", "createRevPointsAccount", "Lhxb/e0;", "getProductRates", "Lhxb/n;", "getRevPointsEarningBreakdown", "Lhxb/p;", "getLoyaltyEarningRates", "Lefm/b;", "executeUpsellFlow", "()Lefm/b;", "type", "Lhxb/d;", "getLoyaltyLearnItems", "(Ljava/lang/String;)Lefm/d0;", "markLearnCompleted", "(Ljava/lang/String;)Lefm/b;", "userLocation", "Lhxb/q;", "getRevPointsFeaturedRewards", "Lhxb/i;", "getRevPointsBottomSheet", "Lhxb/a;", "request", "markChecklistStepCompleted", "(Lhxb/a;)Lefm/b;", "Lhxb/m;", "getChallengesBreakdown", "challengeId", "claimChallengeReward", "Lhxb/l;", "activateChallenge", "", "expired", "Lhxb/c;", "getIssuedPoints", "(Z)Lefm/d0;", "", "gap", "contentId", "productType", "Lhxb/b;", "getEarnOptionsBottomSheet", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevPointsService {
    @POST("/point-account/v3/challenges/activate")
    @NotNull
    d0<l> activateChallenge(@NotNull @Query("challengeId") String challengeId);

    @PUT("/point-account/v3/challenges/{challengeId}/claim-reward")
    @NotNull
    b claimChallengeReward(@Path("challengeId") @NotNull String challengeId);

    @POST("point-account")
    @NotNull
    d0<f> createRevPointsAccount();

    @PUT("/point-account/upsell-flow-execution")
    @NotNull
    b executeUpsellFlow();

    @GET("/point-account/v3/challenges")
    @NotNull
    d0<m> getChallengesBreakdown();

    @GET("/loyalty/earn-options-bottom-sheet")
    @NotNull
    d0<hxb.b> getEarnOptionsBottomSheet(@Query("gap") Double gap, @Query("contentId") String contentId, @Query("productType") String productType);

    @GET("point-account/points/issued")
    @NotNull
    d0<List<c>> getIssuedPoints(@Query("expired") boolean expired);

    @GET("point-account/transactions/last")
    @NotNull
    d0<List<f0>> getLastRevPointsTransactions(@Query("to") Long to6, @Query("from") Long from, @Query("count") Integer count);

    @GET("/loyalty/rates")
    @NotNull
    d0<p> getLoyaltyEarningRates();

    @GET("/loyalty/learn")
    @NotNull
    d0<List<d>> getLoyaltyLearnItems(@NotNull @Query("type") String type);

    @GET("point-account/product-rates")
    @NotNull
    d0<List<e0>> getProductRates();

    @GET("point-account")
    @NotNull
    d0<f> getRevPointsAccount();

    @GET("/loyalty/bottom-sheet")
    @NotNull
    d0<i> getRevPointsBottomSheet(@NotNull @Query("type") String type);

    @GET("loyalty/earning")
    @NotNull
    d0<n> getRevPointsEarningBreakdown();

    @GET("/point-account/featured-rewards")
    @NotNull
    d0<List<q>> getRevPointsFeaturedRewards(@Header("X-Client-Geo-Location") String userLocation);

    @GET("point-account/transactions/single/{txnId}")
    @NotNull
    k<f0> getRevPointsTransactionById(@Path("txnId") @NotNull String transactionId);

    @POST("/loyalty/checklist-step/force-complete")
    @NotNull
    b markChecklistStepCompleted(@Body @NotNull a request);

    @PUT("/loyalty/learn/{type}")
    @NotNull
    b markLearnCompleted(@Path("type") @NotNull String type);
}
