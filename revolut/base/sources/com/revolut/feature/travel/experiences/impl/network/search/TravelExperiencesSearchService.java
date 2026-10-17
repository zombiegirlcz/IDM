package com.revolut.feature.travel.experiences.impl.network.search;

import c0g.b;
import c0g.e;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import nzf.c;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JG\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/network/search/TravelExperiencesSearchService;", "", "", "text", "startDate", "endDate", "", "resultTypes", "Lefm/d0;", "Lc0g/e;", "getExperiencesSearchByQuery", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lefm/d0;", "id", "Lc0g/b;", "getDestination", "(Ljava/lang/String;)Lefm/d0;", "destinationId", "currency", "Lnzf/c;", "getDestinationDiscovery", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelExperiencesSearchService {
    @GET("travels/experiences/destinations/{id}")
    @NotNull
    d0<b> getDestination(@Path("id") @NotNull String id10);

    @GET("travels/experiences/destinations/{destinationId}/discovery")
    @NotNull
    d0<c> getDestinationDiscovery(@Path("destinationId") @NotNull String destinationId, @NotNull @Query("currency") String currency, @Query("startDate") String startDate, @Query("endDate") String endDate);

    @GET("travels/experiences/search")
    @NotNull
    d0<e> getExperiencesSearchByQuery(@NotNull @Query("text") String text, @Query("startDate") String startDate, @Query("endDate") String endDate, @NotNull @Query("resultTypes") List<String> resultTypes);
}
