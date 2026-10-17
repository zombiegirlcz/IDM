package com.revolut.core.chaosmanagement.data.network;

import efm.b;
import efm.d0;
import java.util.List;
import kd0.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H'¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u000fJ#\u0010\u0011\u001a\u00020\r2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0013\u0010\bJ%\u0010\u0014\u001a\u00020\r2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0014\u0010\u000fJ%\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0015\u0010\u000f¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/core/chaosmanagement/data/network/ChaosManagementService;", "", "", "domain", "Lefm/d0;", "", "Lkd0/c;", "getBannerNews", "(Ljava/lang/String;)Lefm/d0;", "getBannerLocal", "()Lefm/d0;", "id", "type", "Lefm/b;", "closeNewsItem", "(Ljava/lang/String;Ljava/lang/String;)Lefm/b;", "viewNewsItem", "openNewsItem", "Lkd0/b;", "getIncidents", "closeIncidentsItem", "subscribeToIncident", "core_chaos_management_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChaosManagementService {
    @POST("/banners/incidents/{id}/close")
    @NotNull
    b closeIncidentsItem(@Path("id") @NotNull String id10, @Query("domain") String domain);

    @POST("/banners/{type}/{id}/close")
    @NotNull
    b closeNewsItem(@Path("id") @NotNull String id10, @Path("type") @NotNull String type);

    @GET("/banners/local")
    @NotNull
    d0<List<c>> getBannerLocal();

    @GET("/banners/news")
    @NotNull
    d0<List<c>> getBannerNews(@Query("domain") String domain);

    @GET("/banners/incidents")
    @NotNull
    d0<List<kd0.b>> getIncidents(@Query("domain") String domain);

    @POST("/banners/{type}/{id}/open")
    @NotNull
    b openNewsItem(@Path("id") @NotNull String id10, @Path("type") @NotNull String type);

    @POST("/banners/incidents/{id}/subscribe")
    @NotNull
    b subscribeToIncident(@Path("id") @NotNull String id10, @Query("domain") String domain);

    @POST("/banners/{type}/{id}/view")
    @NotNull
    b viewNewsItem(@Path("id") @NotNull String id10, @Path("type") @NotNull String type);
}
