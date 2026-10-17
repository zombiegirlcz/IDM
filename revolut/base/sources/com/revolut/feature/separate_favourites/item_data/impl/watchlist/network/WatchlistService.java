package com.revolut.feature.separate_favourites.item_data.impl.watchlist.network;

import efm.d0;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Query;
import s4d.a;
import s4d.b;
import s4d.f;
import s4d.h;
import s4d.j;
import s4d.k;
import s4d.m;
import s4d.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J;\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\r\u001a\u00020\f2\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0003H§@¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\b2\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\b\b\u0001\u0010\u0018\u001a\u00020\u00032\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0003H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00112\b\b\u0001\u0010\u001e\u001a\u00020\u001dH'¢\u0006\u0004\b\u001f\u0010 J$\u0010%\u001a\u00020$2\b\b\u0001\u0010\"\u001a\u00020!2\b\b\u0001\u0010\u001e\u001a\u00020#H§@¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020$2\b\b\u0001\u0010\u001e\u001a\u00020'H§@¢\u0006\u0004\b(\u0010)¨\u0006*À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/separate_favourites/item_data/impl/watchlist/network/WatchlistService;", "", "", "", "assetTypes", "sortMode", "", "limit", "Lefm/d0;", "Ls4d/f;", "getWatchlistItems", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lefm/d0;", "Ls4d/a;", "getAllWatchlists", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ls4d/n;", "watchlistUpdateDto", "Lefm/b;", "updateWatchlistItems", "(Ls4d/n;)Lefm/b;", "Lretrofit2/Response;", "Ls4d/k;", "getSettings", "(Ljava/util/List;)Lefm/d0;", "context", "watchlistId", "Ls4d/m;", "getSortedWatchlistItems", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Ls4d/h;", "body", "updateSortedWatchlistItems", "(Ls4d/h;)Lefm/b;", "Ljava/util/UUID;", "idempotencyKey", "Ls4d/b;", "", "createWatchlist", "(Ljava/util/UUID;Ls4d/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ls4d/j;", "updateWatchlists", "(Ls4d/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_separate_favourites_item_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WatchlistService {
    @POST("trading/watchlists")
    Object createWatchlist(@Header("X-Idempotency-Key") @NotNull UUID uuid, @Body @NotNull b bVar, @NotNull Continuation<? super Unit> continuation);

    @GET("trading/watchlists")
    Object getAllWatchlists(@NotNull @Query("assetTypes") List<String> list, @NotNull @Query("sort") String str, @NotNull Continuation<? super a> continuation);

    @GET("trading/watchlist/settings")
    @NotNull
    d0<Response<k>> getSettings(@NotNull @Query("assetTypes") List<String> assetTypes);

    @GET("trading/watchlist/settings")
    @NotNull
    d0<m> getSortedWatchlistItems(@NotNull @Query("context") String context, @Query("watchlistId") String watchlistId);

    @GET("trading/watchlist/items")
    @NotNull
    d0<f> getWatchlistItems(@NotNull @Query("assetTypes") List<String> assetTypes, @NotNull @Query("sort") String sortMode, @Query("limit") Integer limit);

    @POST("trading/watchlist/settings")
    @NotNull
    efm.b updateSortedWatchlistItems(@Body @NotNull h body);

    @POST("trading/watchlist/items")
    @NotNull
    efm.b updateWatchlistItems(@Body @NotNull n watchlistUpdateDto);

    @PATCH("trading/watchlists")
    Object updateWatchlists(@Body @NotNull j jVar, @NotNull Continuation<? super Unit> continuation);
}
