package com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.corporate_events;

import efm.d0;
import fed.f;
import fed.j;
import java.time.Instant;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J1\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\t\u0010\nJQ\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0010\u0010\u0011J]\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth_discovery/domain/impl/data/network/corporate_events/CorporateEventsService;", "", "", "", "eventTypes", "", "limit", "Lefm/d0;", "Lfed/j;", "getUpcomingEvents", "(Ljava/util/Collection;Ljava/lang/Integer;)Lefm/d0;", "ref", "query", "Ljava/time/Instant;", "from", "to", "getMyEventsForPeriod", "(Ljava/lang/String;Ljava/lang/String;Ljava/time/Instant;Ljava/time/Instant;Ljava/lang/Integer;)Lefm/d0;", "sortOrder", "getMarketEventsForPeriod", "(Ljava/lang/String;Ljava/lang/String;Ljava/time/Instant;Ljava/time/Instant;Ljava/lang/Integer;Ljava/lang/String;)Lefm/d0;", "id", "Lfed/f;", "getEvent", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_shared_wealth_discovery_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CorporateEventsService {
    @GET("trading/calendars/market-events/{id}")
    Object getEvent(@Path("id") @NotNull String str, @NotNull Continuation<? super f> continuation);

    @GET("trading/calendars/market-events")
    @NotNull
    d0<j> getMarketEventsForPeriod(@Query("ref") String ref2, @Query("query") String query, @Query("from") Instant from, @Query("to") Instant to6, @Query("limit") Integer limit, @Query("sortOrder") String sortOrder);

    @GET("/trading/users/current/calendars/market-events")
    @NotNull
    d0<j> getMyEventsForPeriod(@Query("ref") String ref2, @Query("query") String query, @Query("from") Instant from, @Query("to") Instant to6, @Query("limit") Integer limit);

    @GET("/trading/users/current/calendars/market-events/upcoming")
    @NotNull
    d0<j> getUpcomingEvents(@NotNull @Query("eventType") Collection<String> eventTypes, @Query("limit") Integer limit);
}
