package com.revolut.feature.product_article.impl.network;

import aka.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/product_article/impl/network/ProductArticleConfigService;", "", "Laka/o;", "getProductArticlesConfig-kPRr1Fs", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductArticlesConfig", "feature_product_article_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProductArticleConfigService {
    @GET("/config/product-articles")
    /* JADX INFO: renamed from: getProductArticlesConfig-kPRr1Fs, reason: not valid java name */
    Object m3761getProductArticlesConfigkPRr1Fs(@NotNull Continuation<? super o> continuation);
}
