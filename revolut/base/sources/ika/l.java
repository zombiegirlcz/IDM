package ika;

import com.revolut.feature.product_article.impl.network.ProductArticleService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Converter;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l implements e4m.e {
    public static ProductArticleService a(Retrofit retrofit, Converter.Factory converterFactory) {
        k.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        List<Converter.Factory> listConverterFactories = builderNewBuilder.converterFactories();
        listConverterFactories.clear();
        listConverterFactories.add(converterFactory);
        Retrofit retrofitBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        Object objCreate = retrofitBuild.create(ProductArticleService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        ProductArticleService productArticleService = (ProductArticleService) objCreate;
        s.k(productArticleService);
        return productArticleService;
    }
}
