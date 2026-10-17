package com.revolut.retail.feature.impl.budgeting_cycle.network;

import efm.b;
import efm.d0;
import kotlin.Metadata;
import ksj.c;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020\u0005H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting_cycle/network/AnalyticsCycleService;", "", "", "walletId", "Lefm/d0;", "Lksj/c;", "getAnalyticsCycle", "(Ljava/lang/String;)Lefm/d0;", "analyticsCycle", "Lefm/b;", "setAnalyticsCycle", "(Ljava/lang/String;Lksj/c;)Lefm/b;", "feature_budgeting_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AnalyticsCycleService {
    @GET("/budget-cycle")
    @NotNull
    d0<c> getAnalyticsCycle(@Query("walletId") String walletId);

    @POST("/budget-cycle")
    @NotNull
    b setAnalyticsCycle(@Query("walletId") String walletId, @Body @NotNull c analyticsCycle);
}
