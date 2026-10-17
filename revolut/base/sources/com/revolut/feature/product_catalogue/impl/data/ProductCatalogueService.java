package com.revolut.feature.product_catalogue.impl.data;

import fla.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/product_catalogue/impl/data/ProductCatalogueService;", "", "", "Lfla/j;", "getCatalogue", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_product_catalogue_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProductCatalogueService {
    @GET("/config/products")
    Object getCatalogue(@NotNull Continuation<? super List<j>> continuation);
}
