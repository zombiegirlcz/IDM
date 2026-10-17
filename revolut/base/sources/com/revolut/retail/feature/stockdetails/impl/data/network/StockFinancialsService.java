package com.revolut.retail.feature.stockdetails.impl.data.network;

import efm.d0;
import java.util.List;
import jrk.a0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/data/network/StockFinancialsService;", "", "", "ref", "period", "Lefm/d0;", "Ljrk/a0;", "getStockFinancials", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "statementType", "", "Ljrk/d0;", "getStockFinancialsStatements", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StockFinancialsService {
    @GET("/trading/instrument/{ref}/financials/{period}")
    @NotNull
    d0<a0> getStockFinancials(@Path("ref") @NotNull String ref2, @Path("period") @NotNull String period);

    @GET("/trading/instrument/{ref}/financials/statements/{statementType}/{period}")
    @NotNull
    d0<List<jrk.d0>> getStockFinancialsStatements(@Path("ref") @NotNull String ref2, @Path("statementType") @NotNull String statementType, @Path("period") @NotNull String period);
}
