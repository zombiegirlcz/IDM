package com.revolut.feature.wealth.impl.data.network.recurring_orders;

import c8h.a;
import c8h.c;
import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\r2\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\u0015¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/recurring_orders/PortfolioRecurringOrdersService;", "", "", "portfolioId", "Lefm/d0;", "", "Lc8h/b;", "getRecurringOrders", "(Ljava/lang/String;)Lefm/d0;", "orderId", "getRecurringOrder", "Lc8h/a;", "createPortfolioRecurringOrderDto", "Lefm/b;", "createRecurringOrder", "(Lc8h/a;)Lefm/b;", "Lc8h/c;", "updatePortfolioRecurringOrderDto", "updateRecurringOrder", "(Ljava/lang/String;Lc8h/c;)Lefm/b;", "activateRecurringOrder", "(Ljava/lang/String;)Lefm/b;", "deactivateRecurringOrder", "deleteRecurringOrder", "Companion", "a", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PortfolioRecurringOrdersService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f95498a;

    /* JADX INFO: renamed from: com.revolut.feature.wealth.impl.data.network.recurring_orders.PortfolioRecurringOrdersService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f95498a = new Companion();

        private Companion() {
        }
    }

    @POST("/trading/standing-orders/{orderId}/activation")
    @NotNull
    b activateRecurringOrder(@Path("orderId") @NotNull String orderId);

    @POST("/trading/standing-orders")
    @NotNull
    b createRecurringOrder(@Body @NotNull a createPortfolioRecurringOrderDto);

    @POST("/trading/standing-orders/{orderId}/deactivation")
    @NotNull
    b deactivateRecurringOrder(@Path("orderId") @NotNull String orderId);

    @DELETE("/trading/standing-orders/{orderId}")
    @NotNull
    b deleteRecurringOrder(@Path("orderId") @NotNull String orderId);

    @GET("/trading/standing-orders/{orderId}")
    @NotNull
    d0<c8h.b> getRecurringOrder(@Path("orderId") @NotNull String orderId);

    @GET("/trading/standing-orders")
    @NotNull
    d0<List<c8h.b>> getRecurringOrders(@NotNull @Query("portfolioId") String portfolioId);

    @PUT("/trading/standing-orders/{orderId}")
    @NotNull
    b updateRecurringOrder(@Path("orderId") @NotNull String orderId, @Body @NotNull c updatePortfolioRecurringOrderDto);
}
