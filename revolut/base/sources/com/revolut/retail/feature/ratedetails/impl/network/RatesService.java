package com.revolut.retail.feature.ratedetails.impl.network;

import efm.d0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rpk.a;
import rpk.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JE\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00020\b2\u0012\b\u0001\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00042\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00020\b2\u0012\b\u0001\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004H'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/ratedetails/impl/network/RatesService;", "", "", "", "Lcom/revolut/retail/feature/ratedetails/impl/network/CurrencyPairsParam;", "currencyPairs", "", "options", "Lefm/d0;", "Lrpk/g;", "getMidExchangeRates", "(Ljava/util/List;Ljava/util/Map;)Lefm/d0;", "Lrpk/a;", "getAllExchangeRates", "(Ljava/util/List;)Lefm/d0;", "feature_rate_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RatesService {
    @GET("/quote?includeEod=true&rateSide=all")
    @NotNull
    d0<List<a>> getAllExchangeRates(@NotNull @Query("symbol") List<String> currencyPairs);

    @GET("/quote?rateSide=mid")
    @NotNull
    d0<List<g>> getMidExchangeRates(@NotNull @Query("symbol") List<String> currencyPairs, @QueryMap @NotNull Map<String, String> options);
}
