package rwc;

import com.revolut.feature.product_article.api.models.ProductArticleKey;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d {
    public static final ProductArticleParams a(ProductArticleKey productArticleKey) {
        Intrinsics.checkNotNullParameter(productArticleKey, "<this>");
        return new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(productArticleKey));
    }
}
