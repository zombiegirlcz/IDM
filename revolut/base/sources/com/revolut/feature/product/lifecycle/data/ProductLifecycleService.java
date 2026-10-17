package com.revolut.feature.product.lifecycle.data;

import fja.a;
import fja.b;
import fja.f;
import fja.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/product/lifecycle/data/ProductLifecycleService;", "", "Lfja/a;", "body", "Lfja/b;", "createProductLifecycle", "(Lfja/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "processId", "Lretrofit2/Response;", "Lfja/g;", "getProductLifecycleInteractions", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "interactionId", "Lfja/f;", "", "submitInteractionResult", "(Ljava/lang/String;Lfja/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_product_lifecycle_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProductLifecycleService {
    @POST("/product-lifecycle")
    Object createProductLifecycle(@Body @NotNull a aVar, @NotNull Continuation<? super b> continuation);

    @GET("/product-lifecycle/{processId}/interactions")
    Object getProductLifecycleInteractions(@Path("processId") @NotNull String str, @NotNull Continuation<? super Response<g>> continuation);

    @POST("/product-lifecycle/interactions/{interactionId}")
    Object submitInteractionResult(@Path("interactionId") @NotNull String str, @Body @NotNull f fVar, @NotNull Continuation<? super Unit> continuation);
}
