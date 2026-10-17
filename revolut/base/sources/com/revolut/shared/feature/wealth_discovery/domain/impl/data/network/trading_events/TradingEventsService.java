package com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.trading_events;

import efm.d0;
import java.util.Set;
import kotlin.Metadata;
import ohl.b;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J;\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth_discovery/domain/impl/data/network/trading_events/TradingEventsService;", "", "", "", "portfolioIds", "", "limit", "", "from", "Lefm/d0;", "Lohl/b;", "getEvents", "(Ljava/util/Set;ILjava/lang/Long;)Lefm/d0;", "feature_shared_wealth_discovery_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradingEventsService {
    @GET("/trading/event-markers")
    @NotNull
    d0<b> getEvents(@NotNull @Query("portfolioId") Set<String> portfolioIds, @Query("limit") int limit, @Query("from") Long from);
}
