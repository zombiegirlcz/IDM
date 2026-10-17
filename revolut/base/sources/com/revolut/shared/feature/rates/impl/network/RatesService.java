package com.revolut.shared.feature.rates.impl.network;

import efm.d0;
import java.util.List;
import jj0.d;
import kotlin.Metadata;
import l9l.a;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/rates/impl/network/RatesService;", "", "", "", "currencyPairs", "Lefm/d0;", "Ll9l/a;", "getBidExchangeRates", "(Ljava/util/List;)Lefm/d0;", "feature_shared_rates_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RatesService {
    @d(tokenId = "Widget")
    @GET("quote")
    @NotNull
    d0<List<a>> getBidExchangeRates(@NotNull @Query("symbol") List<String> currencyPairs);
}
