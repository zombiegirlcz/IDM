package com.revolut.feature.product_article.impl.network;

import aka.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import nka.o;
import nka.p;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J0\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/product_article/impl/network/ProductArticleService;", "", "", "articleId", "", "substitutionData", "Laka/i;", "getProductArticle", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnka/p;", "body", "Lnka/o;", "getProductArticleV2", "(Ljava/lang/String;Lnka/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_product_article_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProductArticleService {
    @GET("/product-articles/{articleId}")
    Object getProductArticle(@Path("articleId") @NotNull String str, @QueryMap @NotNull Map<String, String> map, @NotNull Continuation<? super i> continuation);

    @POST("/product-articles/{articleId}")
    Object getProductArticleV2(@Path("articleId") @NotNull String str, @Body @NotNull p pVar, @NotNull Continuation<? super o> continuation);
}
