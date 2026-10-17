package com.revolut.feature.add.new_product.impl.repository;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import xf1.i;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/add/new_product/impl/repository/AddNewProductTrackingService;", "", "Lxf1/i;", "recommendedProducts", "", "trackRecommendedProducts", "(Lxf1/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_add_new_product_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AddNewProductTrackingService {
    @POST("/recommended-products-log")
    Object trackRecommendedProducts(@Body @NotNull i iVar, @NotNull Continuation<? super Unit> continuation);
}
