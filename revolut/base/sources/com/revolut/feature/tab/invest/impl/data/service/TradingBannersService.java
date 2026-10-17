package com.revolut.feature.tab.invest.impl.data.service;

import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tab/invest/impl/data/service/TradingBannersService;", "", "", "type", "Lefm/d0;", "", "Loke/b;", "getBanners", "(Ljava/lang/String;)Lefm/d0;", "bannerId", "Lefm/b;", "closeBanner", "(Ljava/lang/String;)Lefm/b;", "feature_tab_invest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradingBannersService {
    @DELETE("/trading/users/current/banners/{bannerId}")
    @NotNull
    b closeBanner(@Path("bannerId") @NotNull String bannerId);

    @GET("/trading/users/current/banners")
    @NotNull
    d0<List<oke.b>> getBanners(@NotNull @Query("type") String type);
}
