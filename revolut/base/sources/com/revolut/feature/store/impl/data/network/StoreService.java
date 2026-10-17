package com.revolut.feature.store.impl.data.network;

import f2e.b1;
import f2e.c;
import f2e.c1;
import f2e.c4;
import f2e.d;
import f2e.h3;
import f2e.i4;
import f2e.l1;
import f2e.l4;
import f2e.m4;
import f2e.n3;
import f2e.n4;
import f2e.p0;
import f2e.s0;
import f2e.s2;
import f2e.v0;
import f2e.x;
import f2e.x4;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JL\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\r\u001a\u00020\f2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0010\u001a\u00020\u000f2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0012\u001a\u00020\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0018\u001a\u00020\u00172\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0011J\u001c\u0010\u001a\u001a\u00020\u00192\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001a\u0010\u0011JR\u0010\u001e\u001a\u00020\u001d2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00012\b\b\u0001\u0010!\u001a\u00020 H§@¢\u0006\u0004\b\"\u0010#J4\u0010%\u001a\u00020$2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\b\u0001\u0010'\u001a\u00020\u0002H§@¢\u0006\u0004\b)\u0010\u0011J \u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\b\b\u0001\u0010'\u001a\u00020\u0002H§@¢\u0006\u0004\b,\u0010\u0011J>\u00100\u001a\u00020/2\b\b\u0001\u0010\u0012\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010-\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010.\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b0\u00101J&\u00102\u001a\u00020/2\b\b\u0001\u0010\u001c\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b2\u00103J\u001a\u00107\u001a\u0002062\b\b\u0001\u00105\u001a\u000204H§@¢\u0006\u0004\b7\u00108J$\u0010<\u001a\u00020;2\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010:\u001a\u000209H§@¢\u0006\u0004\b<\u0010=J4\u0010@\u001a\u00020?2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010-\u001a\u0004\u0018\u00010>2\n\b\u0003\u0010.\u001a\u0004\u0018\u00010>H§@¢\u0006\u0004\b@\u0010AJ&\u0010C\u001a\u00020B2\b\b\u0001\u0010\u0012\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\bC\u00103JD\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u001b2\b\b\u0001\u0010\u0012\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\bE\u0010F¨\u0006GÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/store/impl/data/network/StoreService;", "", "", "shopsFeatures", "", "limit", "offset", "query", "filter", "Lf2e/n3;", "getMegaOffers", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf2e/x4;", "searchMegaOffers", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf2e/s2;", "getMegaOffersFilters", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "adSetId", "Lf2e/h3;", "getMegaOffer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf2e/c1;", "getExclusivesHeader", "Lf2e/b1;", "getExclusivesFilters", "", "brandId", "Lf2e/l1;", "getExclusivesOffers", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf2e/i4;", "request", "submitPurchase", "(Lf2e/i4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf2e/l4;", "getPurchases", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "purchaseId", "Lf2e/c4;", "getPurchaseDetails", "Lretrofit2/Response;", "", "cancelPurchase", "lat", "lon", "Lf2e/x;", "getCampaign", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCampaignByBrand", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf2e/c;", "activateRewardsRequest", "Lf2e/d;", "activateRewards", "(Lf2e/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf2e/m4;", "redeemRequest", "Lf2e/n4;", "redeem", "(Ljava/lang/String;Lf2e/m4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lf2e/s0;", "getDealsLayout", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf2e/p0;", "getDealsLayoutCarousel", "Lf2e/v0;", "getDealsLayoutCarouselTiles", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StoreService {
    @POST("advertising/campaigns/activate")
    Object activateRewards(@Body @NotNull c cVar, @NotNull Continuation<? super d> continuation);

    @POST("exclusive-store/purchases/{purchaseId}/cancel")
    Object cancelPurchase(@Path("purchaseId") @NotNull String str, @NotNull Continuation<? super Response<Unit>> continuation);

    @GET("advertising/campaigns/{id}")
    Object getCampaign(@Path("id") @NotNull String str, @Header("X-Shops-Features") String str2, @Query("userLat") String str3, @Query("userLon") String str4, @NotNull Continuation<? super x> continuation);

    @GET("advertising/campaigns")
    Object getCampaignByBrand(@NotNull @Query("brandId") String str, @Header("X-Shops-Features") String str2, @NotNull Continuation<? super x> continuation);

    @GET("advertising/deals-layout")
    Object getDealsLayout(@Header("X-Shops-Features") String str, @Query("userLat") Double d, @Query("userLon") Double d5, @NotNull Continuation<? super s0> continuation);

    @GET("advertising/deals-layout/carousels/{id}")
    Object getDealsLayoutCarousel(@Path("id") @NotNull String str, @Header("X-Shops-Features") String str2, @NotNull Continuation<? super p0> continuation);

    @GET("advertising/deals-layout/carousels/{id}/tiles")
    Object getDealsLayoutCarouselTiles(@Path("id") @NotNull String str, @Header("X-Shops-Features") String str2, @Query("limit") Integer num, @Query("offset") Integer num2, @NotNull Continuation<? super List<v0>> continuation);

    @GET("exclusive-store/exclusives/filters")
    Object getExclusivesFilters(@Header("X-Shops-Features") String str, @NotNull Continuation<? super b1> continuation);

    @GET("exclusive-store/exclusives/header")
    Object getExclusivesHeader(@Header("X-Shops-Features") String str, @NotNull Continuation<? super c1> continuation);

    @GET("exclusive-store/exclusives/offers")
    Object getExclusivesOffers(@Header("X-Shops-Features") String str, @Query("filter") List<String> list, @Query("brandId") String str2, @Query("offset") Integer num, @Query("limit") Integer num2, @NotNull Continuation<? super l1> continuation);

    @GET("advertising/mega-offers/{id}")
    Object getMegaOffer(@Path("id") @NotNull String str, @Query("adSetId") String str2, @Header("X-Shops-Features") String str3, @NotNull Continuation<? super h3> continuation);

    @GET("advertising/mega-offers")
    Object getMegaOffers(@Header("X-Shops-Features") String str, @Query("limit") Integer num, @Query("offset") Integer num2, @Query("query") String str2, @Query("filter") String str3, @NotNull Continuation<? super n3> continuation);

    @GET("advertising/mega-offers-filters")
    Object getMegaOffersFilters(@Header("X-Shops-Features") String str, @NotNull Continuation<? super s2> continuation);

    @GET("exclusive-store/purchases/{purchaseId}")
    Object getPurchaseDetails(@Path("purchaseId") @NotNull String str, @NotNull Continuation<? super c4> continuation);

    @GET("exclusive-store/purchases")
    Object getPurchases(@Header("X-Shops-Features") String str, @Query("limit") Integer num, @Query("offset") Integer num2, @NotNull Continuation<? super l4> continuation);

    @POST("advertising/campaigns/{id}/redeem")
    Object redeem(@Path("id") @NotNull String str, @Body @NotNull m4 m4Var, @NotNull Continuation<? super n4> continuation);

    @GET("advertising/mega-offers-search")
    Object searchMegaOffers(@Header("X-Shops-Features") String str, @Query("limit") Integer num, @Query("query") String str2, @NotNull Continuation<? super x4> continuation);

    @POST("exclusive-store/purchases")
    Object submitPurchase(@Body @NotNull i4 i4Var, @NotNull Continuation<Object> continuation);
}
