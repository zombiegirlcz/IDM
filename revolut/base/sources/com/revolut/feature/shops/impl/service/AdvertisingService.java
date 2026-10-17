package com.revolut.feature.shops.impl.service;

import efm.b;
import efm.d0;
import eid.c0;
import eid.e0;
import eid.j;
import eid.k;
import eid.p;
import eid.q;
import fid.a;
import java.util.List;
import kotlin.Metadata;
import mid.a0;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import yhm.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006JC\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\fH'¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000eH'¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\b\b\u0001\u0010\u0016\u001a\u00020\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\b\b\u0001\u0010\u001a\u001a\u00020\u00072\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001bH'¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000e2\b\b\u0001\u0010 \u001a\u00020\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\"\u0010\u0019J\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u000e2\b\b\u0001\u0010#\u001a\u00020\u0007H'¢\u0006\u0004\b$\u0010%J)\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u000e2\b\b\u0001\u0010 \u001a\u00020\u00072\b\b\u0001\u0010'\u001a\u00020&H'¢\u0006\u0004\b)\u0010*J9\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00120\u000e2\b\b\u0001\u0010 \u001a\u00020\u00072\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010+\u001a\u00020\u001bH'¢\u0006\u0004\b-\u0010.J!\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u000e2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b0\u0010%J]\u00108\u001a\b\u0012\u0004\u0012\u0002070\u000e2\n\b\u0001\u00101\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u00102\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u00104\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u00105\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u00106\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u000eH'¢\u0006\u0004\b;\u0010\u0015¨\u0006<À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shops/impl/service/AdvertisingService;", "", "Lfid/a;", "activateRewardsRequest", "Lefm/b;", "activateRewards", "(Lfid/a;)Lefm/b;", "", "category", "", "lat", "lon", "", "ratio", "Lefm/d0;", "Leid/q;", "getHomeCategoryLayout", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Float;)Lefm/d0;", "", "Leid/k;", "getPills", "()Lefm/d0;", "carouselId", "Leid/p;", "getCarouselDetails", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "query", "", "limit", "Leid/c0;", "getSearch", "(Ljava/lang/String;Ljava/lang/Integer;)Lefm/d0;", "id", "Leid/j;", "getCampaign", "brandId", "getCampaignByBrand", "(Ljava/lang/String;)Lefm/d0;", "Lfid/b;", "shopsRedeemRequestDto", "Leid/d;", "redeem", "(Ljava/lang/String;Lfid/b;)Lefm/d0;", "offset", "Leid/e0;", "getCarouselTiles", "(Ljava/lang/String;II)Lefm/d0;", "Lmid/a0;", "getSearchLayout", "latitude", "longitude", "bottomRightLatitude", "topLeftLatitude", "topLeftLongitude", "bottomRightLongitude", "Lmid/p;", "getOutlets", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Leid/a;", "getAdvertisingInfo", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AdvertisingService {
    @POST("/advertising/campaigns/activate")
    @NotNull
    b activateRewards(@Body @NotNull a activateRewardsRequest);

    @GET("/advertising/v2/info")
    @NotNull
    d0<eid.a> getAdvertisingInfo();

    @GET("/advertising/campaigns/{id}")
    @NotNull
    @d
    d0<j> getCampaign(@Path("id") @NotNull String id10, @Query("userLat") String lat, @Query("userLon") String lon);

    @GET("/advertising/campaigns")
    @NotNull
    @d
    d0<j> getCampaignByBrand(@NotNull @Query("brandId") String brandId);

    @GET("/advertising/v2/layout/carousels/{id}")
    @NotNull
    d0<p> getCarouselDetails(@Path("id") @NotNull String carouselId, @Query("userLat") String lat, @Query("userLon") String lon);

    @GET("/advertising/v2/layout/carousels/{id}/tiles")
    @NotNull
    d0<List<e0>> getCarouselTiles(@Path("id") @NotNull String id10, @Query("limit") int limit, @Query("offset") int offset);

    @GET("/advertising/v2/layout/{category}")
    @NotNull
    d0<q> getHomeCategoryLayout(@Path("category") @NotNull String category, @Query("userLat") Double lat, @Query("userLon") Double lon, @Query("mapRatio") Float ratio);

    @GET("/advertising/outlets")
    @NotNull
    d0<mid.p> getOutlets(@Query("lat") String latitude, @Query("long") String longitude, @Query("bottomRightLat") String bottomRightLatitude, @Query("topLeftLat") String topLeftLatitude, @Query("topLeftLong") String topLeftLongitude, @Query("bottomRightLong") String bottomRightLongitude);

    @GET("/advertising/v2/layout/pills")
    @NotNull
    d0<List<k>> getPills();

    @GET("/advertising/v2/search")
    @NotNull
    d0<c0> getSearch(@NotNull @Query("query") String query, @Query("limit") Integer limit);

    @GET("/advertising/v2/search/layout")
    @NotNull
    d0<a0> getSearchLayout(@Query("query") String query);

    @POST("/advertising/campaigns/{id}/redeem")
    @NotNull
    d0<eid.d> redeem(@Path("id") @NotNull String id10, @Body @NotNull fid.b shopsRedeemRequestDto);
}
