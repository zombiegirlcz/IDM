package com.revolut.feature.store.core.impl.data.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import x1e.f;
import x1e.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/store/core/impl/data/network/StoreCoreService;", "", "", "productId", "", "isThirdPartyTargetingEnabled", "Lx1e/f;", "getProductStatus", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lx1e/j;", "getProduct", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_store_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StoreCoreService {
    @GET("exclusive-store/products/{productId}")
    Object getProduct(@Path("productId") @NotNull String str, @NotNull Continuation<? super j> continuation);

    @GET("exclusive-store/products/{productId}/status")
    Object getProductStatus(@Path("productId") @NotNull String str, @Query("isThirdPartyTargetingEnabled") boolean z, @NotNull Continuation<? super f> continuation);
}
