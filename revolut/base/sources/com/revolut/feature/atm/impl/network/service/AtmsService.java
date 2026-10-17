package com.revolut.feature.atm.impl.network.service;

import ak2.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001Ja\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\u000e\u0010\u000fJO\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/atm/impl/network/service/AtmsService;", "", "", "minLatitude", "minLongitude", "maxLatitude", "maxLongitude", "", "surchargeFree", "", "searchMode", "Lefm/d0;", "", "Lak2/b;", "getAtmsBy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/lang/String;)Lefm/d0;", "positionLatitude", "positionLongitude", "", "limit", "getAtmsNearby", "(DDIZLjava/lang/String;)Lefm/d0;", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AtmsService {
    @GET("/atm/locations")
    @NotNull
    d0<List<b>> getAtmsBy(@Query("minLatitude") Double minLatitude, @Query("minLongitude") Double minLongitude, @Query("maxLatitude") Double maxLatitude, @Query("maxLongitude") Double maxLongitude, @Query("surchargeFree") boolean surchargeFree, @Query("searchMode") String searchMode);

    @GET("/atm/locations/nearby")
    @NotNull
    d0<List<b>> getAtmsNearby(@Query("positionLatitude") double positionLatitude, @Query("positionLongitude") double positionLongitude, @Query("limit") int limit, @Query("surchargeFree") boolean surchargeFree, @Query("searchMode") String searchMode);
}
