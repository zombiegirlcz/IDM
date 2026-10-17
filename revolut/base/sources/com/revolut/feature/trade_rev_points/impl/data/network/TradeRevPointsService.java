package com.revolut.feature.trade_rev_points.impl.data.network;

import efm.d0;
import j1f.c;
import j1f.f;
import j1f.j;
import j1f.n;
import j1f.o;
import j1f.t0;
import j1f.z0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import wj0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u0007J\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0014\u0010\u0007J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0007J5\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\b\b\u0001\u0010\f\u001a\u00020\u00172\b\b\u0001\u0010\u0019\u001a\u00020\u00182\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u0002H'¢\u0006\u0004\b\u001f\u0010\u0007¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/data/network/TradeRevPointsService;", "", "", "product", "Lefm/d0;", "Lj1f/j;", "getAccounts", "(Ljava/lang/String;)Lefm/d0;", "agentId", "Lj1f/c;", "getAccount", "Lj1f/f;", "request", "registerAccount", "(Lj1f/f;)Lefm/d0;", "accountId", "Lefm/b;", "unlinkAccount", "(Ljava/lang/String;)Lefm/b;", "Lj1f/o;", "getAgents", "Lj1f/n;", "getAgentDetails", "Lj1f/z0;", "Lwj0/b;", "idempotencyTag", "apiVersion", "Lj1f/t0;", "createTopup", "(Lj1f/z0;Lwj0/b;Ljava/lang/String;)Lefm/d0;", "topupId", "getTopup", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradeRevPointsService {
    @POST("travels/trade-rev-points/topups")
    @NotNull
    d0<t0> createTopup(@Body @NotNull z0 request, @Tag @NotNull b idempotencyTag, @Header("X-Api-Version") String apiVersion);

    @GET("travels/trade-rev-points/agents/{agentId}/account")
    @NotNull
    d0<c> getAccount(@Path("agentId") @NotNull String agentId);

    @GET("travels/trade-rev-points/accounts")
    @NotNull
    d0<j> getAccounts(@NotNull @Query("product") String product);

    @GET("travels/trade-rev-points/agents/{agentId}")
    @NotNull
    d0<n> getAgentDetails(@Path("agentId") @NotNull String agentId);

    @GET("travels/trade-rev-points/agents")
    @NotNull
    d0<o> getAgents(@NotNull @Query("product") String product);

    @GET("travels/trade-rev-points/topups/{topupId}")
    @NotNull
    d0<t0> getTopup(@Path("topupId") @NotNull String topupId);

    @POST("travels/trade-rev-points/accounts")
    @NotNull
    d0<c> registerAccount(@Body @NotNull f request);

    @DELETE("travels/trade-rev-points/accounts/{accountId}")
    @NotNull
    efm.b unlinkAccount(@Path("accountId") @NotNull String accountId);
}
