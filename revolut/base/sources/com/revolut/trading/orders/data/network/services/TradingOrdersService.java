package com.revolut.trading.orders.data.network.services;

import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import orl.j0;
import orl.o;
import orl.t0;
import orl.u0;
import orl.v;
import orl.w;
import orl.x;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J3\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0013\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00122\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\b\b\u0001\u0010\u0011\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\u001aJK\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u001eH'¢\u0006\u0004\b!\u0010\"Jg\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0(0\b2\n\b\u0003\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0003\u0010%\u001a\u0004\u0018\u00010#2\n\b\u0003\u0010'\u001a\u0004\u0018\u00010&2\u000e\b\u0003\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(2\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001eH'¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020+0\b2\b\b\u0001\u0010.\u001a\u00020\u0002H'¢\u0006\u0004\b/\u0010\u001a¨\u00060À\u0006\u0003"}, d2 = {"Lcom/revolut/trading/orders/data/network/services/TradingOrdersService;", "", "", "portfolioId", "Lorl/w;", "placeOrderRequestDto", "Lwj0/b;", "idempotencyTag", "Lefm/d0;", "Lorl/x;", "postOrder", "(Ljava/lang/String;Lorl/w;Lwj0/b;)Lefm/d0;", "Lorl/v;", "request", "", "postBracketOrder", "(Ljava/lang/String;Lorl/v;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "Lorl/u0;", "updateOrder", "(Ljava/lang/String;Lorl/u0;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lefm/b;", "cancelOrder", "(Ljava/lang/String;)Lefm/b;", "Lorl/t0;", "getOrderCancellable", "(Ljava/lang/String;)Lefm/d0;", "instrument", "side", "timeInForce", "", "standing", "Lorl/j0;", "getOrderLimitsForPortfolio", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lefm/d0;", "", "createdFrom", "createdTo", "", "limit", "", "transactionCcy", "accountType", "Lorl/o;", "getInvestOrders", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)Lefm/d0;", "compoundId", "getInvestOrderByCompoundId", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradingOrdersService {
    @POST("/trading/users/current/orders/{id}/cancel")
    @NotNull
    b cancelOrder(@Path("id") @NotNull String id10);

    @GET("/trading/orders/{compoundId}")
    @NotNull
    d0<o> getInvestOrderByCompoundId(@Path("compoundId") @NotNull String compoundId);

    @GET("/trading/orders")
    @NotNull
    d0<List<o>> getInvestOrders(@Query("createdFrom") Long createdFrom, @Query("createdTo") Long createdTo, @Query("limit") Integer limit, @NotNull @Query("transactionCcy") List<String> transactionCcy, @Query("accountType") String accountType, @Query("standing") Boolean standing);

    @GET("/trading/users/current/orders/{id}/cancellable")
    @NotNull
    d0<t0> getOrderCancellable(@Path("id") @NotNull String id10);

    @GET("trading-access/portfolios/{portfolioId}/order/{instrument}/{side}/limits")
    @NotNull
    d0<j0> getOrderLimitsForPortfolio(@Path("portfolioId") @NotNull String portfolioId, @Path("instrument") @NotNull String instrument, @Path("side") @NotNull String side, @Query("timeInForce") String timeInForce, @Query("standing") Boolean standing);

    @POST("/trading-access/portfolios/{portfolioId}/orders")
    Object postBracketOrder(@Path("portfolioId") @NotNull String str, @Body @NotNull v vVar, @Tag @NotNull wj0.b bVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/trading-access/portfolios/{portfolioId}/orders")
    @NotNull
    d0<x> postOrder(@Path("portfolioId") @NotNull String portfolioId, @Body @NotNull w placeOrderRequestDto, @Tag @NotNull wj0.b idempotencyTag);

    @PUT("/trading/orders/{id}")
    Object updateOrder(@Path("id") @NotNull String str, @Body @NotNull u0 u0Var, @Tag @NotNull wj0.b bVar, @NotNull Continuation<? super Unit> continuation);
}
