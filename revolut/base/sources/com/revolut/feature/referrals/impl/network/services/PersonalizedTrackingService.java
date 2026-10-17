package com.revolut.feature.referrals.impl.network.services;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import nxa.t0;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/referrals/impl/network/services/PersonalizedTrackingService;", "", "", "inviteId", "Lnxa/t0;", "getPersonalizedTrackingDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "acceptInvitation", "feature_retail_referrals_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PersonalizedTrackingService {
    @POST("/invitation/internal/accept/{inviteId}")
    Object acceptInvitation(@Path("inviteId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("/inviteCampaigns/invites/{inviteId}")
    Object getPersonalizedTrackingDetails(@Path("inviteId") @NotNull String str, @NotNull Continuation<? super t0> continuation);
}
