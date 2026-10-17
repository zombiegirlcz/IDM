package com.revolut.feature.travel.common.impl.network;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import nxf.b;
import nxf.c;
import org.jetbrains.annotations.NotNull;
import pxf.a;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JK\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\bH'¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/travel/common/impl/network/TravelService;", "", "", "status", "", "count", "startFrom", "products", "Lefm/d0;", "", "Lnxf/b;", "getBookings", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lnxf/c;", "getFavorites", "()Lefm/d0;", "currency", "limit", "Lrxf/b;", "getNextTripWithRecommendations", "(Ljava/lang/String;ILjava/lang/String;)Lefm/d0;", "product", "type", "Lpxf/a;", "getDocument", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "feature_travel_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelService {
    @GET("travels/bookings")
    @NotNull
    d0<List<b>> getBookings(@Query("status") String status, @Query("count") Integer count, @Query("startFrom") String startFrom, @Query("products") String products);

    @GET("travels/documents")
    @NotNull
    d0<a> getDocument(@NotNull @Query("product") String product, @NotNull @Query("type") String type);

    @GET("travels/favourites")
    @NotNull
    d0<List<c>> getFavorites();

    @GET("travels/trips/next/recommendations")
    @NotNull
    d0<rxf.b> getNextTripWithRecommendations(@NotNull @Query("currency") String currency, @Query("limit") int limit, @NotNull @Query("products") String products);
}
