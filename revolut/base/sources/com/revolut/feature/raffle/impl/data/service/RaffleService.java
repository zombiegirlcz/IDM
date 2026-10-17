package com.revolut.feature.raffle.impl.data.service;

import bta.z;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0006¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/raffle/impl/data/service/RaffleService;", "", "", "campaignId", "Lbta/z;", "getRaffleCampaign", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "optInToRaffle", "claimRaffleReward", "getNotified", "feature_raffle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RaffleService {
    @POST("/crypto/competitions/{id}/rewards/claim")
    Object claimRaffleReward(@Path("id") @NotNull String str, @NotNull Continuation<? super z> continuation);

    @POST("/crypto/competitions/{id}/alerts/subscribe")
    Object getNotified(@Path("id") @NotNull String str, @NotNull Continuation<? super z> continuation);

    @GET("/crypto/competitions/{id}")
    Object getRaffleCampaign(@Path("id") @NotNull String str, @NotNull Continuation<? super z> continuation);

    @POST("/crypto/competitions/{id}/join")
    Object optInToRaffle(@Path("id") @NotNull String str, @NotNull Continuation<? super z> continuation);
}
