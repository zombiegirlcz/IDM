package kka;

import aka.o;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProductArticleParams.ArticleReference f184559a;

    public f(ProductArticleParams.ArticleReference articleReference, h hVar) {
        this.f184559a = articleReference;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Map map = ((o) obj2).f5767a;
        Intrinsics.checkNotNullParameter(map, "$v$c$com-revolut-feature-product_article-api-models-ProductArticlesConfig$-config$0");
        ProductArticleParams.ArticleReference articleReference = this.f184559a;
        String key = tz4.d.e(((ProductArticleParams.ArticleReference.Key) articleReference).f81277a);
        Intrinsics.checkNotNullParameter(key, "key");
        String str = (String) map.get(key);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException(j6.a.q("Product article not found: ", h.a(articleReference)));
    }
}
