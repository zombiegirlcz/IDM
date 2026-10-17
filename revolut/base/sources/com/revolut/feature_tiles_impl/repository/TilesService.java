package com.revolut.feature_tiles_impl.repository;

import efm.b;
import efm.d0;
import java.util.List;
import kei.a;
import kei.d;
import kei.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u0013\u0010\r¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/feature_tiles_impl/repository/TilesService;", "", "Lefm/d0;", "", "Lkei/j;", "getTileCarousels", "()Lefm/d0;", "", "id", "Lkei/d;", "tileCallbackRequestDto", "Lefm/b;", "viewTile", "(Ljava/lang/String;Lkei/d;)Lefm/b;", "closeTile", "Lkei/a;", "request", "closeTiles", "(Lkei/a;)Lefm/b;", "openTile", "feature_tiles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TilesService {
    @POST("/tiles/{id}/close")
    @NotNull
    b closeTile(@Path("id") @NotNull String id10, @Body @NotNull d tileCallbackRequestDto);

    @POST("/tiles/close-all")
    @NotNull
    b closeTiles(@Body @NotNull a request);

    @Headers({"ApiVersion: 2"})
    @GET("tile-carousels")
    @NotNull
    d0<List<j>> getTileCarousels();

    @POST("/tiles/{id}/open")
    @NotNull
    b openTile(@Path("id") @NotNull String id10, @Body @NotNull d tileCallbackRequestDto);

    @POST("/tiles/{id}/view")
    @NotNull
    b viewTile(@Path("id") @NotNull String id10, @Body @NotNull d tileCallbackRequestDto);
}
