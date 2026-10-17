package com.revolut.shared.feature.wealth.domain.impl.data.network;

import efm.d0;
import fdl.c1;
import fdl.d1;
import java.util.List;
import java.util.Set;
import jj0.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import zj0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00042\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH'¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00042\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH'¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth/domain/impl/data/network/InstrumentTickerService;", "", "", "nextParameters", "Lefm/d0;", "Lretrofit2/Response;", "Lfdl/d1;", "getInstruments", "(Ljava/lang/String;)Lefm/d0;", "", "instruments", "", "Lfdl/c1;", "getInstrumentsTickersByPost", "(Ljava/util/Set;)Lefm/d0;", "getInstrumentsTickers", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InstrumentTickerService {
    @GET("/trading/instruments")
    @NotNull
    d0<Response<d1>> getInstruments(@Query("query") String nextParameters);

    @d(tokenId = "Widget")
    @GET("instruments/tickers")
    @NotNull
    d0<List<c1>> getInstrumentsTickers(@NotNull @Query("s") Set<String> instruments);

    @b
    @POST("instruments/tickers")
    @NotNull
    d0<List<c1>> getInstrumentsTickersByPost(@Body @NotNull Set<String> instruments);
}
