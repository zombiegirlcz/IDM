package com.revolut.feature.travel.miles.impl.network;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import wj0.b;
import xfg.a;
import xfg.c;
import xfg.d;
import xfg.e;
import xfg.i;
import xfg.j0;
import xfg.k0;
import xfg.t;
import xfg.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0015\u001a\u00020\u0010H'¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u001c\u001a\u00020\u001bH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00022\b\b\u0001\u0010 \u001a\u00020\u0010H'¢\u0006\u0004\b!\u0010\"J'\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00022\u0010\b\u0001\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003H'¢\u0006\u0004\b%\u0010&J)\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00022\b\b\u0001\u0010(\u001a\u00020'2\b\b\u0001\u0010)\u001a\u00020'H'¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00022\b\b\u0001\u0010-\u001a\u00020\u0010H'¢\u0006\u0004\b/\u0010\"¨\u00060À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/network/TravelMilesService;", "", "Lefm/d0;", "", "Lxfg/t;", "getProviders", "()Lefm/d0;", "Lxfg/c;", "account", "Lxfg/d;", "registerAccount", "(Lxfg/c;)Lefm/d0;", "", "includeInternal", "getAccounts", "(Z)Lefm/d0;", "", "accountId", "Lefm/b;", "unlinkAccount", "(Ljava/lang/String;)Lefm/b;", "currency", "Lxfg/w;", "getRate", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lxfg/a;", "request", "Lwj0/b;", "idempotencyTag", "Lxfg/j0;", "createTopUp", "(Lxfg/a;Lwj0/b;)Lefm/d0;", "topUpId", "getTopUp", "(Ljava/lang/String;)Lefm/d0;", "allowedRedemptionTypes", "Lxfg/i;", "getAirlines", "(Ljava/util/List;)Lefm/d0;", "", "limit", "offset", "Lxfg/k0;", "getTopUps", "(II)Lefm/d0;", "airlineId", "Lxfg/e;", "getAirlineDetails", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelMilesService {
    @POST("travels/miles/topups")
    @NotNull
    d0<j0> createTopUp(@Body @NotNull a request, @Tag @NotNull b idempotencyTag);

    @GET("travels/miles/accounts")
    @NotNull
    d0<List<d>> getAccounts(@Query("include_internal") boolean includeInternal);

    @GET("travels/miles/airlines/{airlineId}")
    @NotNull
    d0<e> getAirlineDetails(@Path("airlineId") @NotNull String airlineId);

    @Headers({"X-Api-Version: 2"})
    @GET("travels/miles/airlines")
    @NotNull
    d0<i> getAirlines(@Query("allowedRedemptionTypes") List<String> allowedRedemptionTypes);

    @Headers({"X-Api-Version: 2"})
    @GET("travels/miles/providers")
    @NotNull
    d0<List<t>> getProviders();

    @GET("travels/miles/accounts/{accountId}/rate")
    @NotNull
    d0<w> getRate(@Path("accountId") @NotNull String accountId, @NotNull @Query("currency") String currency);

    @GET("travels/miles/topups/{topupId}")
    @NotNull
    d0<j0> getTopUp(@Path("topupId") @NotNull String topUpId);

    @GET("travels/miles/topups")
    @NotNull
    d0<k0> getTopUps(@Query("limit") int limit, @Query("offset") int offset);

    @POST("travels/miles/accounts")
    @NotNull
    d0<d> registerAccount(@Body @NotNull c account);

    @DELETE("travels/miles/accounts/{accountId}")
    @NotNull
    efm.b unlinkAccount(@Path("accountId") @NotNull String accountId);
}
