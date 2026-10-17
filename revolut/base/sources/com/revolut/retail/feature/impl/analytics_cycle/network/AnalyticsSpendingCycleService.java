package com.revolut.retail.feature.impl.analytics_cycle.network;

import hqj.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/impl/analytics_cycle/network/AnalyticsSpendingCycleService;", "", "Lhqj/c;", "getSpendingCycle", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cycle", "Lretrofit2/Response;", "", "setSpendingCycle", "(Lhqj/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AnalyticsSpendingCycleService {
    @GET("/budgeting/spending-cycle")
    Object getSpendingCycle(@NotNull Continuation<? super c> continuation);

    @PATCH("/budgeting/spending-cycle")
    Object setSpendingCycle(@Body @NotNull c cVar, @NotNull Continuation<? super Response<Unit>> continuation);
}
