package com.revolut.shared.feature.wealth.domain.impl.data.network;

import efm.d0;
import fdl.b1;
import fdl.g;
import fdl.t;
import fdl.y2;
import fdl.z0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u0007J\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0007J$\u0010\u0013\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth/domain/impl/data/network/InstrumentDetailsService;", "", "", "ref", "Lefm/d0;", "Lfdl/g;", "getInstrumentDetails", "(Ljava/lang/String;)Lefm/d0;", "from", "to", "Lfdl/y2;", "getRecommendations", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lfdl/b1;", "getGovernance", "Lfdl/z0;", "getInstrumentSummary", "Lfdl/t;", "timespan", "getDrawdown", "(Ljava/lang/String;Lfdl/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InstrumentDetailsService {
    @GET("trading/instrument/{ref}/drawdown/{timespan}")
    Object getDrawdown(@Path("ref") @NotNull String str, @Path("timespan") @NotNull t tVar, @NotNull Continuation<Object> continuation);

    @GET("instruments/{ref}/governance")
    @NotNull
    d0<b1> getGovernance(@Path("ref") @NotNull String ref2);

    @GET("instruments/{ref}/details")
    @NotNull
    d0<g> getInstrumentDetails(@Path("ref") @NotNull String ref2);

    @GET("instruments/{ref}/summary")
    @NotNull
    d0<z0> getInstrumentSummary(@Path("ref") @NotNull String ref2);

    @GET("instruments/{ref}/details/recommendations")
    @NotNull
    d0<y2> getRecommendations(@Path("ref") @NotNull String ref2, @NotNull @Query("from") String from, @NotNull @Query("to") String to6);
}
