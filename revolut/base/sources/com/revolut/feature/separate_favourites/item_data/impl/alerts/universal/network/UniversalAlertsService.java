package com.revolut.feature.separate_favourites.item_data.impl.alerts.universal.network;

import e4d.a;
import efm.b;
import efm.d0;
import g4d.c;
import g4d.d;
import g4d.f;
import g4d.g;
import g4d.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001Ju\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0015\u001a\u00020\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u0005H'¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u0011\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010!\u001a\u00020 2\b\b\u0001\u0010\u0015\u001a\u00020\u00032\b\b\u0001\u0010\u001f\u001a\u00020\u001eH§@¢\u0006\u0004\b!\u0010\"J$\u0010$\u001a\u00020 2\b\b\u0001\u0010\u0015\u001a\u00020\u00032\b\b\u0001\u0010\u001f\u001a\u00020#H§@¢\u0006\u0004\b$\u0010%J \u0010'\u001a\b\u0012\u0004\u0012\u00020 0&2\b\b\u0001\u0010\u0015\u001a\u00020\u0003H§@¢\u0006\u0004\b'\u0010(¨\u0006)À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/separate_favourites/item_data/impl/alerts/universal/network/UniversalAlertsService;", "", "", "", "states", "Le4d/a;", "assetTypes", "baseAssetIds", "targetPriceQuotesAssetIds", "", "limit", "alertTypes", "Lefm/d0;", "Lg4d/f;", "getAlerts", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)Lefm/d0;", "Lg4d/c;", "creationDto", "Lg4d/d;", "create", "(Lg4d/c;)Lefm/d0;", "id", "assetType", "Lefm/b;", "delete", "(Ljava/lang/String;Le4d/a;)Lefm/b;", "Lg4d/g;", "Lg4d/h;", "createVolatilityAlert", "(Lg4d/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg4d/a;", "editDto", "", "editPriceAlert", "(Ljava/lang/String;Lg4d/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg4d/b;", "editVolatilityAlert", "(Ljava/lang/String;Lg4d/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Response;", "deleteVolatilityAlert", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_separate_favourites_item_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UniversalAlertsService {
    @POST("/trading/price-alerts")
    @NotNull
    d0<d> create(@Body @NotNull c creationDto);

    @POST("/trading/volatility-alerts")
    Object createVolatilityAlert(@Body @NotNull g gVar, @NotNull Continuation<? super h> continuation);

    @DELETE("trading/price-alerts/{id}")
    @NotNull
    b delete(@Path("id") @NotNull String id10, @NotNull @Query("assetType") a assetType);

    @DELETE("/trading/volatility-alerts/{id}")
    Object deleteVolatilityAlert(@Path("id") @NotNull String str, @NotNull Continuation<? super Response<Unit>> continuation);

    @PUT("/trading/price-alerts/{id}")
    Object editPriceAlert(@Path("id") @NotNull String str, @Body @NotNull g4d.a aVar, @NotNull Continuation<? super Unit> continuation);

    @PUT("/trading/volatility-alerts/{id}")
    Object editVolatilityAlert(@Path("id") @NotNull String str, @Body @NotNull g4d.b bVar, @NotNull Continuation<? super Unit> continuation);

    @GET("/trading/price-alerts")
    @NotNull
    d0<f> getAlerts(@NotNull @Query("states") List<String> states, @NotNull @Query("assetTypes") List<a> assetTypes, @Query("bases") List<String> baseAssetIds, @Query("targetPriceQuotes") List<String> targetPriceQuotesAssetIds, @Query("limit") Integer limit, @NotNull @Query("alertTypes") List<String> alertTypes);
}
