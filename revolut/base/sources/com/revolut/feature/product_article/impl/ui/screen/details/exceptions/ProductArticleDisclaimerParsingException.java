package com.revolut.feature.product_article.impl.ui.screen.details.exceptions;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/product_article/impl/ui/screen/details/exceptions/ProductArticleDisclaimerParsingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "feature_product_article_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProductArticleDisclaimerParsingException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81291a;

    public ProductArticleDisclaimerParsingException() {
        this(null);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f81291a;
    }

    public ProductArticleDisclaimerParsingException(String str) {
        super(str);
        this.f81291a = str;
    }
}
