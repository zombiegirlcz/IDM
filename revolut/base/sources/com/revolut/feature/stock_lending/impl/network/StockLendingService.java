package com.revolut.feature.stock_lending.impl.network;

import e1e.b;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/stock_lending/impl/network/StockLendingService;", "", "", "limit", "Lefm/d0;", "Le1e/b;", "getTransactions", "(I)Lefm/d0;", "feature_stock_lending_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StockLendingService {
    @GET("/trading/users/current/portfolio/stock-lending/transactions")
    @NotNull
    d0<b> getTransactions(@Query("limit") int limit);
}
