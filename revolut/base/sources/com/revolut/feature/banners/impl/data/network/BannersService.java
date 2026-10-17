package com.revolut.feature.banners.impl.data.network;

import com.revolut.feature.banners.impl.data.network.dto.BannersResponseDto;
import efm.b;
import efm.d0;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/banners/impl/data/network/BannersService;", "", "", "key", "Lefm/d0;", "Lcom/revolut/feature/banners/impl/data/network/dto/BannersResponseDto;", "getBanners", "(Ljava/lang/String;)Lefm/d0;", "", "payload", "getBannersWithPayload", "(Ljava/lang/String;Ljava/util/Map;)Lefm/d0;", "id", "Lefm/b;", "deleteBanner", "(Ljava/lang/String;)Lefm/b;", "feature_banners_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BannersService {
    @DELETE("learn/banners/{id}")
    @NotNull
    b deleteBanner(@Path("id") @NotNull String id10);

    @GET("learn/banners")
    @NotNull
    d0<BannersResponseDto> getBanners(@NotNull @Query("key") String key);

    @GET("learn/banners")
    @NotNull
    d0<BannersResponseDto> getBannersWithPayload(@NotNull @Query("key") String key, @QueryMap Map<String, String> payload);
}
