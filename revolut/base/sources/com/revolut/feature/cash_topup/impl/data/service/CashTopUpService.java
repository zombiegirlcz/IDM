package com.revolut.feature.cash_topup.impl.data.service;

import efm.d0;
import hb3.e;
import hb3.f;
import hb3.g;
import java.util.List;
import jo3.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J3\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ/\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00072\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H'¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H'¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/data/service/CashTopUpService;", "", "", "userLocation", "", "lat", "lon", "Lefm/d0;", "Lhb3/f;", "getLocations", "(Ljava/lang/String;DD)Lefm/d0;", "", "Lhb3/e;", "getLocationsEu", "(DD)Lefm/d0;", "Lhb3/g;", "getCurrentTopupLimits", "()Lefm/d0;", "currency", "", "amount", "Ljo3/a;", "getTopupFee", "(Ljava/lang/String;J)Lefm/d0;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CashTopUpService {
    @GET("/topup/by-token/barzahlen/limits")
    @NotNull
    d0<g> getCurrentTopupLimits();

    @GET("/green-dot/locations")
    @NotNull
    d0<f> getLocations(@Header("X-Client-Geo-Location") @NotNull String userLocation, @Query("lat") double lat, @Query("lon") double lon);

    @GET("/viafintech/locations")
    @NotNull
    d0<List<e>> getLocationsEu(@Query("lat") double lat, @Query("lon") double lon);

    @GET("/topup/by-token/barzahlen/fee")
    @NotNull
    d0<a> getTopupFee(@NotNull @Query("currency") String currency, @Query("amount") long amount);
}
