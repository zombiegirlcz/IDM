package com.revolut.feature.revpro.lite_pos.impl.data.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import zc1.a;
import zc1.b;
import zc1.f;
import zc1.g;
import zc1.h;
import zc1.i;
import zc1.j;
import zc1.k;
import zc1.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00102\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\b\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0018\u001a\u00020\u00142\b\b\u0001\u0010\u0017\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00102\b\b\u0001\u0010\u0017\u001a\u00020\fH§@¢\u0006\u0004\b\u001a\u0010\u0012J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH§@¢\u0006\u0004\b\u001d\u0010\u0004J\u001a\u0010\u001f\u001a\u00020\u001c2\b\b\u0001\u0010\b\u001a\u00020\u001eH§@¢\u0006\u0004\b\u001f\u0010 J$\u0010\"\u001a\u00020\u001c2\b\b\u0001\u0010!\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u001eH§@¢\u0006\u0004\b\"\u0010#J\"\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00102\b\b\u0001\u0010!\u001a\u00020\fH§@¢\u0006\u0004\b$\u0010\u0012J\u0010\u0010&\u001a\u00020%H§@¢\u0006\u0004\b&\u0010\u0004¨\u0006'À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/revpro/lite_pos/impl/data/network/CatalogueService;", "", "Lzc1/a;", "getCategories", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lzc1/g;", "getProducts", "Lzc1/j;", "request", "Lzc1/b;", "createCategory", "(Lzc1/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "categoryId", "updateCategory", "(Ljava/lang/String;Lzc1/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Response;", "deleteCategoryWithResponse", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lzc1/k;", "Lzc1/f;", "createProduct", "(Lzc1/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productId", "updateProduct", "(Ljava/lang/String;Lzc1/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteProductWithResponse", "", "Lzc1/h;", "getTaxRates", "Lzc1/l;", "createTaxRate", "(Lzc1/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "taxRateId", "updateTaxRate", "(Ljava/lang/String;Lzc1/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTaxRateWithResponse", "Lzc1/i;", "getTaxRatesSettings", "feature_revpro_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CatalogueService {
    @POST("acquiring/catalogue/categories")
    Object createCategory(@Body @NotNull j jVar, @NotNull Continuation<? super b> continuation);

    @POST("acquiring/catalogue/products")
    Object createProduct(@Body @NotNull k kVar, @NotNull Continuation<? super f> continuation);

    @POST("acquiring/catalogue/tax-rates")
    Object createTaxRate(@Body @NotNull l lVar, @NotNull Continuation<? super h> continuation);

    @DELETE("acquiring/catalogue/categories/{categoryId}")
    Object deleteCategoryWithResponse(@Path("categoryId") @NotNull String str, @NotNull Continuation<? super Response<Object>> continuation);

    @DELETE("acquiring/catalogue/products/{productId}")
    Object deleteProductWithResponse(@Path("productId") @NotNull String str, @NotNull Continuation<? super Response<Object>> continuation);

    @DELETE("acquiring/catalogue/tax-rates/{taxRateId}")
    Object deleteTaxRateWithResponse(@Path("taxRateId") @NotNull String str, @NotNull Continuation<? super Response<Object>> continuation);

    @GET("acquiring/catalogue/categories")
    Object getCategories(@NotNull Continuation<? super a> continuation);

    @GET("acquiring/catalogue/products")
    Object getProducts(@NotNull Continuation<? super g> continuation);

    @GET("acquiring/catalogue/tax-rates")
    Object getTaxRates(@NotNull Continuation<? super List<h>> continuation);

    @GET("acquiring/catalogue/tax-rates/settings")
    Object getTaxRatesSettings(@NotNull Continuation<? super i> continuation);

    @PUT("acquiring/catalogue/categories/{categoryId}")
    Object updateCategory(@Path("categoryId") @NotNull String str, @Body @NotNull j jVar, @NotNull Continuation<? super b> continuation);

    @PUT("acquiring/catalogue/products/{productId}")
    Object updateProduct(@Path("productId") @NotNull String str, @Body @NotNull k kVar, @NotNull Continuation<? super f> continuation);

    @PUT("acquiring/catalogue/tax-rates/{taxRateId}")
    Object updateTaxRate(@Path("taxRateId") @NotNull String str, @Body @NotNull l lVar, @NotNull Continuation<? super h> continuation);
}
