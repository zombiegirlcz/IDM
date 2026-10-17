package com.revolut.retail.feature.impl.balance_history.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oqj.c;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J:\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/impl/balance_history/network/BalanceHistoryService;", "", "", "from", "to", "latestRequestTimestamp", "Lretrofit2/Response;", "Loqj/c;", "getBalanceHistory", "(Ljava/lang/Long;JLjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BalanceHistoryService {
    @GET("/analytics/total-wealth-history")
    Object getBalanceHistory(@Query("from") Long l2, @Query("to") long j2, @Query("latestRequestTimestamp") Long l3, @NotNull Continuation<? super Response<c>> continuation);
}
