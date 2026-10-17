package com.revolut.feature.staking.impl.service.unstaking;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import pwd.a;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/staking/impl/service/unstaking/UnstakingDataService;", "", "", "transactionId", "Lpwd/a;", "getUnstakingData", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UnstakingDataService {
    @GET("crypto-staking/transactions/{transaction-id}/unstaking-data")
    Object getUnstakingData(@Path("transaction-id") @NotNull String str, @NotNull Continuation<? super a> continuation);
}
