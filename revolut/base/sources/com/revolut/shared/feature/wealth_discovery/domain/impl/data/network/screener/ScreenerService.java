package com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.screener;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import nhl.k0;
import nhl.q;
import nhl.q0;
import nhl.r;
import nhl.t0;
import nhl.v;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\nH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00142\b\b\u0001\u0010\u0017\u001a\u00020\nH§@¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001b\u001a\u00020\u001a2\u000e\b\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth_discovery/domain/impl/data/network/screener/ScreenerService;", "", "Lnhl/q0;", "request", "Lnhl/t0;", "getAssetSearchResult", "(Lnhl/q0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnhl/k0;", "getAssetSearchCount", "Lnhl/v;", "", "createScreener", "(Lnhl/v;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "", "updateScreener", "(Ljava/lang/String;Lnhl/v;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteScreener", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lnhl/q;", "getScreenerCollections", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectionDiscoveryKey", "getTradeDiscoveryCollection", "securityTypes", "Lnhl/r;", "getScreenerConfig", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_shared_wealth_discovery_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ScreenerService {
    @POST("/trading/screener")
    Object createScreener(@Body @NotNull v vVar, @NotNull Continuation<? super String> continuation);

    @DELETE("/trading/screener/{id}")
    Object deleteScreener(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("trading/screener/search/count")
    Object getAssetSearchCount(@Body @NotNull q0 q0Var, @NotNull Continuation<? super k0> continuation);

    @POST("trading/screener/search")
    Object getAssetSearchResult(@Body @NotNull q0 q0Var, @NotNull Continuation<? super t0> continuation);

    @GET("/trading/screeners")
    Object getScreenerCollections(@NotNull Continuation<? super List<q>> continuation);

    @GET("/trading/screener/config")
    Object getScreenerConfig(@NotNull @Query("securityTypes") List<String> list, @NotNull Continuation<? super r> continuation);

    @GET("/trading/screener/predefined/{collectionDiscoveryKey}")
    Object getTradeDiscoveryCollection(@Path("collectionDiscoveryKey") @NotNull String str, @NotNull Continuation<? super q> continuation);

    @PATCH("/trading/screener/{id}")
    Object updateScreener(@Path("id") @NotNull String str, @Body @NotNull v vVar, @NotNull Continuation<? super Unit> continuation);
}
