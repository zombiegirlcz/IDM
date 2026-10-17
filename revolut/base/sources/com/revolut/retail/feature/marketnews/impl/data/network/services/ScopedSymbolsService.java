package com.revolut.retail.feature.marketnews.impl.data.network.services;

import efm.d0;
import g0k.c;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00070\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/data/network/services/ScopedSymbolsService;", "", "", "scope", "Lefm/d0;", "", "Lg0k/c;", "Lcom/revolut/retail/feature/marketnews/impl/data/network/services/ScopeDto;", "getSymbolsForScope", "(Ljava/lang/String;)Lefm/d0;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ScopedSymbolsService {
    @GET("/trading/instruments/tickers/scope/{scope}")
    @NotNull
    d0<List<c>> getSymbolsForScope(@Path("scope") @NotNull String scope);
}
