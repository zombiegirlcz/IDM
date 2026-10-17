package com.revolut.feature.wealth.impl.data.network.eodrates;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import r7h.a;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J7\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u00062\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/eodrates/EodRatesService;", "", "", "", "currencyPairs", "date", "Lefm/d0;", "Lr7h/a;", "getEodRates", "(Ljava/util/List;Ljava/lang/String;)Lefm/d0;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EodRatesService {
    @GET("quote/eod-rates")
    @NotNull
    d0<List<a>> getEodRates(@NotNull @Query("symbol") List<String> currencyPairs, @Query("date") String date);
}
