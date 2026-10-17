package com.revolut.feature.credit.health.impl.data.network;

import j05.f;
import j05.i;
import j05.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\b\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/health/impl/data/network/CreditHealthService;", "", "Lj05/l;", "getCreditScore", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj05/f;", "getCreditScoreDetails", "Lj05/i;", "getCreditScoreInsights", "", "date", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditHealthService {
    @GET("/credit-profile/score")
    Object getCreditScore(@NotNull Continuation<? super l> continuation);

    @GET("/credit-profile/score/details")
    Object getCreditScoreDetails(@NotNull Continuation<? super f> continuation);

    @GET("/credit-profile/score/insights/{date}")
    Object getCreditScoreInsights(@Path("date") @NotNull String str, @NotNull Continuation<? super i> continuation);

    @GET("/credit-profile/score/insights")
    Object getCreditScoreInsights(@NotNull Continuation<? super i> continuation);
}
