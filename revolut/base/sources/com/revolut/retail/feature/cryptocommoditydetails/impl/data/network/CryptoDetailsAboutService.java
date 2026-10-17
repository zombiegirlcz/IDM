package com.revolut.retail.feature.cryptocommoditydetails.impl.data.network;

import ddj.b;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/cryptocommoditydetails/impl/data/network/CryptoDetailsAboutService;", "", "", "symbol", "Lefm/d0;", "Lddj/b;", "getCryptoDetailsAbout", "(Ljava/lang/String;)Lefm/d0;", "feature_cryptocommodity_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoDetailsAboutService {
    @GET("instruments/crypto/{symbol}/details")
    @NotNull
    d0<b> getCryptoDetailsAbout(@Path("symbol") @NotNull String symbol);
}
