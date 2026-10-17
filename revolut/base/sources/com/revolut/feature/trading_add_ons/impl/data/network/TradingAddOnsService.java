package com.revolut.feature.trading_add_ons.impl.data.network;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import qbf.j;
import qbf.k;
import qbf.l;
import qbf.m;
import qbf.o;
import qbf.s;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\bJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\bJ/\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\bJ%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\u001b\u0010\b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trading_add_ons/impl/data/network/TradingAddOnsService;", "", "", "group", "Lefm/d0;", "", "Lqbf/o;", "getAddOnsForGroup", "(Ljava/lang/String;)Lefm/d0;", "Lqbf/m;", "getEnabledAddOns", "id", "Lretrofit2/Response;", "", "unsubscribeFromAddOn", "Lqbf/s;", "params", "subscribeToAddOn", "(Ljava/lang/String;Lqbf/s;)Lefm/d0;", "type", "Lqbf/j;", "getDowngradeSurveyConfig", "Lqbf/k;", "survey", "sendDowngradeSurvey", "(Lqbf/k;)Lefm/d0;", "Lqbf/l;", "getEligibility", "feature_trading_add_ons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradingAddOnsService {
    @GET("plans/add-ons/{group}")
    @NotNull
    d0<List<o>> getAddOnsForGroup(@Path("group") @NotNull String group);

    @GET("/downgrade-survey/config")
    @NotNull
    d0<j> getDowngradeSurveyConfig(@NotNull @Query("type") String type);

    @GET("plans/add-ons/{id}/eligibility")
    @NotNull
    d0<l> getEligibility(@Path("id") @NotNull String id10);

    @GET("plans/add-ons/{group}/enabled")
    @NotNull
    d0<List<m>> getEnabledAddOns(@Path("group") @NotNull String group);

    @POST("/downgrade-survey")
    @NotNull
    d0<Response<Unit>> sendDowngradeSurvey(@Body @NotNull k survey);

    @POST("plans/add-ons/{id}/subscribe")
    @NotNull
    d0<Response<Unit>> subscribeToAddOn(@Path("id") @NotNull String id10, @Body @NotNull s params);

    @DELETE("plans/add-ons/{id}/subscription")
    @NotNull
    d0<Response<Unit>> unsubscribeFromAddOn(@Path("id") @NotNull String id10);
}
