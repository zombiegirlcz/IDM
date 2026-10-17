package com.revolut.feature.global_markets.impl.data.network;

import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import s77.m;
import s77.t;
import s77.w;
import s77.z;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/global_markets/impl/data/network/GlobalMarketsService;", "", "Lefm/d0;", "Ls77/t;", "getMarketAssets", "()Lefm/d0;", "", "ref", "Ls77/m;", "getIndexDetails", "(Ljava/lang/String;)Lefm/d0;", "Ls77/z;", "market", "Ls77/w;", "getMarketDetails", "(Ls77/z;)Lefm/d0;", "feature_global_markets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GlobalMarketsService {
    @GET("/trading/markets/indexes/{ref}/details")
    @NotNull
    d0<m> getIndexDetails(@Path("ref") @NotNull String ref2);

    @GET("/trading/markets/items")
    @NotNull
    d0<t> getMarketAssets();

    @GET("/trading/markets/{market}/details")
    @NotNull
    d0<w> getMarketDetails(@Path("market") @NotNull z market);
}
