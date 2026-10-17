package com.revolut.retail.feature.impl.analytics_cycle.network;

import efm.b;
import efm.d0;
import iqj.a;
import iqj.f;
import iqj.g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;
import yhm.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u0010H'¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/impl/analytics_cycle/network/TransactionAnalyticsService;", "", "", "lastModified", "", "walletId", "Lefm/d0;", "Liqj/f;", "getTransactionsAnalyticsUpdates", "(Ljava/lang/Long;Ljava/lang/String;)Lefm/d0;", "id", "Liqj/g;", "body", "Lefm/b;", "updateTransactionAnalyticsExclusion", "(Ljava/lang/String;Liqj/g;)Lefm/b;", "Liqj/a;", "excludeFromAnalytics", "(Ljava/lang/String;Liqj/a;)Lefm/b;", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransactionAnalyticsService {
    @PATCH("/transaction/{id}/budgeting")
    @NotNull
    @d
    b excludeFromAnalytics(@Path("id") @NotNull String id10, @Body @NotNull a body);

    @GET("/analytics/transactions")
    @NotNull
    d0<f> getTransactionsAnalyticsUpdates(@Query("lastModified") Long lastModified, @NotNull @Query("walletId") String walletId);

    @PATCH("/analytics/transactions/{id}")
    @NotNull
    b updateTransactionAnalyticsExclusion(@Path("id") @NotNull String id10, @Body @NotNull g body);
}
