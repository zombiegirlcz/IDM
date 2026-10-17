package com.revolut.feature.revolut_shop.data.service;

import j3c.a;
import j3c.d;
import j3c.d0;
import j3c.e;
import j3c.e0;
import j3c.m;
import j3c.r;
import j3c.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J4\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0001H§@¢\u0006\u0004\b\r\u0010\fJ0\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\f\b\u0001\u0010\u000f\u001a\u00060\u0002j\u0002`\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0014\u0010\u0015J>\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\f\b\u0001\u0010\u000f\u001a\u00060\u0002j\u0002`\u000e2\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\f\b\u0001\u0010\u000f\u001a\u00060\u0002j\u0002`\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u001e\u001a\u00020\u001d2\f\b\u0001\u0010\u000f\u001a\u00060\u0002j\u0002`\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001fJ4\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\f\b\u0001\u0010\u000f\u001a\u00060\u0002j\u0002`\u000e2\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H§@¢\u0006\u0004\b \u0010\tJ,\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00062\b\b\u0001\u0010\"\u001a\u00020!2\n\b\u0001\u0010$\u001a\u0004\u0018\u00010#H§@¢\u0006\u0004\b&\u0010'J\u001e\u0010*\u001a\u00020%2\f\b\u0001\u0010)\u001a\u00060\u0002j\u0002`(H§@¢\u0006\u0004\b*\u0010+J0\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00122\f\b\u0001\u0010)\u001a\u00060\u0002j\u0002`(2\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b.\u0010\t¨\u0006/À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/revolut_shop/data/service/IppShopService;", "", "", "Lcom/revolut/feature/revolut_shop/api/domain/model/Sku;", "sku", "ippProductType", "", "Lj3c/r;", "getProducts", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj3c/x;", "getUserCart", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addCart", "Lcom/revolut/feature/revolut_shop/data/model/IppCartId;", "cartId", "Lj3c/a;", "body", "Lretrofit2/Response;", "", "addCartItem", "(Ljava/lang/String;Lj3c/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj3c/d0;", "updateCartItemCount", "(Ljava/lang/String;Ljava/lang/String;Lj3c/d0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj3c/e0;", "updateVatSettings", "(Ljava/lang/String;Lj3c/e0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj3c/d;", "Lj3c/e;", "checkoutUserCart", "(Ljava/lang/String;Lj3c/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeCartItem", "", "limit", "", "to", "Lj3c/m;", "getOrders", "(ILjava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/revolut/feature/revolut_shop/api/domain/model/IppOrderId;", "orderId", "getOrder", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "type", "Lokhttp3/ResponseBody;", "getOrderInvoice", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IppShopService {
    @POST("acquiring/shop/carts")
    Object addCart(@NotNull Continuation<Object> continuation);

    @POST("acquiring/shop/carts/{cartId}/items")
    Object addCartItem(@Path("cartId") @NotNull String str, @Body @NotNull a aVar, @NotNull Continuation<? super Response<Unit>> continuation);

    @POST("acquiring/shop/carts/{cartId}/checkout")
    Object checkoutUserCart(@Path("cartId") @NotNull String str, @Body @NotNull d dVar, @NotNull Continuation<? super e> continuation);

    @GET("/acquiring/shop/orders/{orderId}")
    Object getOrder(@Path("orderId") @NotNull String str, @NotNull Continuation<? super m> continuation);

    @GET("/acquiring/shop/orders/{orderId}/invoice")
    Object getOrderInvoice(@Path("orderId") @NotNull String str, @Query("type") String str2, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @GET("/acquiring/shop/orders")
    Object getOrders(@Query("limit") int i, @Query("to") Long l2, @NotNull Continuation<? super List<m>> continuation);

    @GET("acquiring/shop/products")
    Object getProducts(@Query("sku") String str, @Query("productType") String str2, @NotNull Continuation<? super List<r>> continuation);

    @GET("acquiring/shop/user-cart")
    Object getUserCart(@NotNull Continuation<? super x> continuation);

    @DELETE("acquiring/shop/carts/{cartId}/items/{sku}")
    Object removeCartItem(@Path("cartId") @NotNull String str, @Path("sku") @NotNull String str2, @NotNull Continuation<? super Response<Unit>> continuation);

    @PATCH("acquiring/shop/carts/{cartId}/items/{sku}/count")
    Object updateCartItemCount(@Path("cartId") @NotNull String str, @Path("sku") @NotNull String str2, @Body @NotNull d0 d0Var, @NotNull Continuation<? super Response<Unit>> continuation);

    @PATCH("acquiring/shop/carts/{cartId}/vat-settings")
    Object updateVatSettings(@Path("cartId") @NotNull String str, @Body @NotNull e0 e0Var, @NotNull Continuation<? super Response<Unit>> continuation);
}
