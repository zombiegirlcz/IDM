package com.revolut.feature.referrals.common.data.impl.network.services;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import zwa.a;
import zwa.b;
import zwa.d;
import zwa.i;
import zwa.j;
import zwa.o;
import zwa.r;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\b\u0010\tJ>\u0010\f\u001a\u00020\u00072\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\n\u001a\u00020\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\rJQ\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00112\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00062\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0003\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020 2\b\b\u0001\u0010\u001c\u001a\u00020\u0002H'¢\u0006\u0004\b!\u0010\"J \u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\b\b\u0001\u0010$\u001a\u00020#H§@¢\u0006\u0004\b'\u0010(J \u0010*\u001a\b\u0012\u0004\u0012\u00020)0%2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b*\u0010+J$\u0010-\u001a\u00020,2\b\b\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b-\u0010.J0\u00102\u001a\u0002012\b\b\u0001\u0010\u000e\u001a\u00020\u00022\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u00100\u001a\u00020\u0004H§@¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u0002042\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b5\u0010+J$\u00108\u001a\u00020&2\b\b\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0001\u00107\u001a\u000206H§@¢\u0006\u0004\b8\u00109¨\u0006:À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/referrals/common/data/impl/network/services/InviteCampaignService;", "", "", "type", "", "activeInvitesCount", "Lefm/d0;", "Lzwa/r;", "getCurrentCampaignV4", "(Ljava/lang/String;Ljava/lang/Integer;)Lefm/d0;", "version", "youthId", "getCurrentCampaign", "(Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "campaignType", "", "redesigned", "", "inviteStates", "sortBy", "Lswa/b;", "getActiveOrPastInvites", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)Lefm/d0;", "getAllInvites", "(ZLjava/lang/String;)Lefm/d0;", "Lzwa/d;", "getReferralBenefits", "(Ljava/lang/String;)Lefm/d0;", "inviteId", "Lswa/a;", "getInviteDetails", "(Ljava/lang/String;Z)Lefm/d0;", "Lefm/b;", "setRewardRevealed", "(Ljava/lang/String;)Lefm/b;", "Lzwa/a;", "request", "Lretrofit2/Response;", "", "acceptInvitationByExistingUser", "(Lzwa/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lzwa/j;", "getInviteeStatus", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lswa/i;", "getTransactionWidget", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cursor", "limit", "Lzwa/o;", "getPaginatedInvites", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lzwa/i;", "getInviteSummary", "Lzwa/b;", "body", "acknowledgeConfetti", "(Ljava/lang/String;Lzwa/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_shared_referrals_common_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InviteCampaignService {
    @POST("v2/invitation/accept-by-existing-user")
    Object acceptInvitationByExistingUser(@Body @NotNull a aVar, @NotNull Continuation<? super Response<Unit>> continuation);

    @POST("referrals/invite/{inviteId}/acknowledge")
    Object acknowledgeConfetti(@Path("inviteId") @NotNull String str, @Body @NotNull b bVar, @NotNull Continuation<? super Unit> continuation);

    @GET("inviteCampaigns/inviteHistory/v3")
    @NotNull
    d0<swa.b> getActiveOrPastInvites(@NotNull @Query("type") String type, @NotNull @Query("campaignType") String campaignType, @Query("redesigned") boolean redesigned, @Query("inviteState") List<String> inviteStates, @Query("sortBy") String sortBy);

    @GET("inviteCampaigns/inviteHistory/v4")
    @NotNull
    d0<swa.b> getAllInvites(@Query("redesigned") boolean redesigned, @NotNull @Query("campaignType") String campaignType);

    @GET("inviteCampaigns/lastActive")
    Object getCurrentCampaign(@Query("campaignType") String str, @Query("activeInvites") Integer num, @Query("v") int i, @Query("youthId") String str2, @NotNull Continuation<? super r> continuation);

    @GET("inviteCampaigns/v4/lastActive")
    @NotNull
    d0<r> getCurrentCampaignV4(@Query("campaignType") String type, @Query("activeInvites") Integer activeInvitesCount);

    @GET("referrals/invite/{inviteId}")
    @NotNull
    d0<swa.a> getInviteDetails(@Path("inviteId") @NotNull String inviteId, @Query("redesigned") boolean redesigned);

    @GET("referrals/invites/summary")
    Object getInviteSummary(@NotNull @Query("campaignType") String str, @NotNull Continuation<? super i> continuation);

    @GET("inviteCampaigns/inviteeStatus")
    Object getInviteeStatus(@NotNull @Query("campaignType") String str, @NotNull Continuation<? super Response<j>> continuation);

    @GET("referrals/invites")
    Object getPaginatedInvites(@NotNull @Query("campaignType") String str, @Query("cursor") String str2, @Query("limit") int i, @NotNull Continuation<? super o> continuation);

    @GET("inviteCampaigns/benefits")
    @NotNull
    d0<d> getReferralBenefits(@NotNull @Query("campaignType") String campaignType);

    @GET("inviteCampaigns/invites/{inviteId}/reward-details")
    Object getTransactionWidget(@Path("inviteId") @NotNull String str, @NotNull @Query("campaignType") String str2, @NotNull Continuation<? super swa.i> continuation);

    @POST("inviteCampaigns/inviteHistory/{inviteId}/revealReward")
    @NotNull
    efm.b setRewardRevealed(@Path("inviteId") @NotNull String inviteId);
}
