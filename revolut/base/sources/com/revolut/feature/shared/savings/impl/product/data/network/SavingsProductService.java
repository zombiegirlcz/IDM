package com.revolut.feature.shared.savings.impl.product.data.network;

import ecd.a3;
import ecd.d3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ncd.h;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000e\u0010\u000b¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/savings/impl/product/data/network/SavingsProductService;", "", "Lncd/h;", "savingsProductAccountType", "Lecd/a3;", "getSavingsOnboardingData", "(Lncd/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "productId", "Lecd/d3;", "getSavingsProductData", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Response;", "", "performProductMigration", "feature_shared_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SavingsProductService {
    @GET("/savings/onboarding")
    Object getSavingsOnboardingData(@Query("accountType") h hVar, @NotNull Continuation<a3> continuation);

    @GET("/savings/products/{productId}")
    Object getSavingsProductData(@Path("productId") @NotNull String str, @NotNull Continuation<? super d3> continuation);

    @POST("/savings/migration/{productId}")
    Object performProductMigration(@Path("productId") @NotNull String str, @NotNull Continuation<? super Response<Unit>> continuation);
}
