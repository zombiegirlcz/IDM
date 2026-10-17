package com.revolut.feature.staking.impl.service.pocket;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mwd.a;
import mwd.b;
import mwd.c;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/staking/impl/service/pocket/StakingPocketService;", "", "", "Lmwd/a;", "getStakingPockets", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "pocketId", "Lmwd/c;", "request", "unstake", "(Ljava/lang/String;Lmwd/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmwd/b;", "getRewards", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StakingPocketService {
    @GET("crypto-staking/pockets/{pocket-id}/rewards")
    Object getRewards(@Path("pocket-id") @NotNull String str, @NotNull Continuation<? super b> continuation);

    @GET("/crypto-staking/pockets")
    Object getStakingPockets(@NotNull Continuation<? super List<a>> continuation);

    @POST("/crypto-staking/pockets/{pocket-id}/unstake")
    Object unstake(@Path("pocket-id") @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super a> continuation);
}
