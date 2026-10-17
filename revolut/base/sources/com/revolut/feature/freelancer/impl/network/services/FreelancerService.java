package com.revolut.feature.freelancer.impl.network.services;

import com.revolut.feature.freelancer.impl.network.models.e;
import com.revolut.feature.freelancer.impl.network.models.f;
import com.revolut.feature.freelancer.impl.network.models.g;
import com.revolut.feature.freelancer.impl.network.models.h0;
import com.revolut.feature.freelancer.impl.network.models.j;
import com.revolut.feature.freelancer.impl.network.models.k0;
import com.revolut.feature.freelancer.impl.network.models.l0;
import com.revolut.feature.freelancer.impl.network.models.m0;
import com.revolut.feature.freelancer.impl.network.models.n0;
import com.revolut.feature.freelancer.impl.network.models.q;
import com.revolut.feature.freelancer.impl.network.models.s;
import com.revolut.feature.freelancer.impl.network.models.s0;
import com.revolut.feature.freelancer.impl.network.models.t;
import com.revolut.feature.freelancer.impl.network.models.v;
import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u0001H'¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u0001H'¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015JK\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e0\u00042\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\bH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020 H'¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0004H'¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0004H'¢\u0006\u0004\b'\u0010%J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0004H'¢\u0006\u0004\b)\u0010%J\u001b\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u000e0\u0004H'¢\u0006\u0004\b+\u0010%J\u001b\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u000e0\u0004H'¢\u0006\u0004\b-\u0010%J\u0019\u00100\u001a\u00020\u000b2\b\b\u0001\u0010/\u001a\u00020.H'¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0004H'¢\u0006\u0004\b3\u0010%J\u0015\u00105\u001a\b\u0012\u0004\u0012\u0002040\u0004H'¢\u0006\u0004\b5\u0010%J\u0019\u00108\u001a\u00020\u000b2\b\b\u0001\u00107\u001a\u000206H'¢\u0006\u0004\b8\u00109¨\u0006:À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/services/FreelancerService;", "", "Lcom/revolut/feature/freelancer/impl/network/models/g;", "createOrderDto", "Lefm/d0;", "Lcom/revolut/feature/freelancer/impl/network/models/v;", "createOrder", "(Lcom/revolut/feature/freelancer/impl/network/models/g;)Lefm/d0;", "", "orderId", "body", "Lefm/b;", "cancelOrder", "(Ljava/lang/String;Ljava/lang/Object;)Lefm/b;", "", "Lcom/revolut/feature/freelancer/impl/network/models/h0;", "getOrderTransactions", "(Ljava/lang/String;Ljava/lang/Object;)Lefm/d0;", "Lcom/revolut/feature/freelancer/impl/network/models/n0;", "params", "refundOrder", "(Ljava/lang/String;Lcom/revolut/feature/freelancer/impl/network/models/n0;)Lefm/b;", "", "limit", "", "from", "to", "sortField", "getOrders", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lefm/d0;", "getOrder", "(Ljava/lang/String;)Lefm/d0;", "Lcom/revolut/feature/freelancer/impl/network/models/s0;", "transferMoney", "(Lcom/revolut/feature/freelancer/impl/network/models/s0;)Lefm/b;", "Lcom/revolut/feature/freelancer/impl/network/models/f;", "getCashbackRates", "()Lefm/d0;", "Lcom/revolut/feature/freelancer/impl/network/models/j;", "getCurrentCashbackRate", "Lcom/revolut/feature/freelancer/impl/network/models/e;", "getCashbackInfo", "Lcom/revolut/feature/freelancer/impl/network/models/q;", "getBanners", "Lcom/revolut/feature/freelancer/impl/network/models/s;", "getAnnualInboundVolumes", "Lcom/revolut/feature/freelancer/impl/network/models/t;", "dto", "setAnnualInboundVolume", "(Lcom/revolut/feature/freelancer/impl/network/models/t;)Lefm/b;", "Lcom/revolut/feature/freelancer/impl/network/models/k0;", "getProcessingSettings", "Lcom/revolut/feature/freelancer/impl/network/models/l0;", "getProfileSettings", "Lcom/revolut/feature/freelancer/impl/network/models/m0;", "profileSettingsUpdateDto", "updateProfileSettings", "(Lcom/revolut/feature/freelancer/impl/network/models/m0;)Lefm/b;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerService {
    @POST("/acquiring/merchant/order/{orderId}/cancel")
    @NotNull
    b cancelOrder(@Path("orderId") @NotNull String orderId, @Body @NotNull Object body);

    @POST("/acquiring/merchant/order")
    @NotNull
    d0<v> createOrder(@Body @NotNull g createOrderDto);

    @GET("/acquiring/merchant/operational-info/annual-inbound-volumes")
    @NotNull
    d0<List<s>> getAnnualInboundVolumes();

    @GET("/acquiring/merchant/banners")
    @NotNull
    d0<List<q>> getBanners();

    @GET("/acquiring/cashback/current")
    @NotNull
    d0<e> getCashbackInfo();

    @GET("/acquiring/cashback/rates")
    @NotNull
    d0<f> getCashbackRates();

    @GET("/acquiring/cashback/rates/current")
    @NotNull
    d0<j> getCurrentCashbackRate();

    @GET("/acquiring/merchant/order/{orderId}")
    @NotNull
    d0<v> getOrder(@Path("orderId") @NotNull String orderId);

    @GET("/acquiring/merchant/order/{orderId}/transactions")
    @NotNull
    d0<List<h0>> getOrderTransactions(@Path("orderId") @NotNull String orderId, @Body @NotNull Object body);

    @GET("/acquiring/merchant/orders")
    @NotNull
    d0<List<v>> getOrders(@Query("limit") Integer limit, @Query("from") Long from, @Query("to") Long to6, @Query("sortField") String sortField);

    @GET("/acquiring/merchant/processing/settings")
    @NotNull
    d0<k0> getProcessingSettings();

    @GET("/acquiring/merchant/settings")
    @NotNull
    d0<l0> getProfileSettings();

    @POST("/acquiring/merchant/order/{orderId}/refund")
    @NotNull
    b refundOrder(@Path("orderId") @NotNull String orderId, @Body @NotNull n0 params);

    @PATCH("/acquiring/merchant/operational-info")
    @NotNull
    b setAnnualInboundVolume(@Body @NotNull t dto);

    @POST("/acquiring/merchant/pocket/transfer")
    @NotNull
    b transferMoney(@Body @NotNull s0 body);

    @PATCH("/acquiring/merchant/settings")
    @NotNull
    b updateProfileSettings(@Body @NotNull m0 profileSettingsUpdateDto);
}
