package com.revolut.feature.freelancer.impl.network.services;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import uad.a;
import uad.d;
import uad.e;
import uad.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\tH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0001\u0010\u000e\u001a\u00020\tH§@¢\u0006\u0004\b\u0017\u0010\u0010J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0001\u0010\u000e\u001a\u00020\tH§@¢\u0006\u0004\b\u0018\u0010\u0010J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0001\u0010\u000e\u001a\u00020\tH§@¢\u0006\u0004\b\u0019\u0010\u0010¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/services/OrderInitiationPageService;", "", "Luad/a;", "request", "Luad/d;", "createOrderInitiationPage", "(Luad/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "limit", "", "product", "", "getOrderInitiationPages", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "orderId", "getOrderInitiationPage", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Luad/e;", "Luad/f;", "searchOrderInitiationPages", "(Luad/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "completeOrderInitiationPage", "suspendOrderInitiationPage", "activateOrderInitiationPage", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OrderInitiationPageService {
    @POST("acquiring/merchant/order-initiation-pages/{orderId}/activate")
    Object activateOrderInitiationPage(@Path("orderId") @NotNull String str, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @POST("acquiring/merchant/order-initiation-pages/{orderId}/complete")
    Object completeOrderInitiationPage(@Path("orderId") @NotNull String str, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @POST("acquiring/merchant/order-initiation-pages")
    Object createOrderInitiationPage(@Body @NotNull a aVar, @NotNull Continuation<? super d> continuation);

    @GET("acquiring/merchant/order-initiation-pages/{orderId}")
    Object getOrderInitiationPage(@Path("orderId") @NotNull String str, @NotNull Continuation<? super d> continuation);

    @GET("acquiring/merchant/order-initiation-pages")
    Object getOrderInitiationPages(@Query("limit") int i, @NotNull @Query("product") String str, @NotNull Continuation<? super List<d>> continuation);

    @POST("acquiring/merchant/order-initiation-pages/search")
    Object searchOrderInitiationPages(@Body @NotNull e eVar, @NotNull Continuation<? super f> continuation);

    @POST("acquiring/merchant/order-initiation-pages/{orderId}/suspend")
    Object suspendOrderInitiationPage(@Path("orderId") @NotNull String str, @NotNull Continuation<? super Response<ResponseBody>> continuation);
}
