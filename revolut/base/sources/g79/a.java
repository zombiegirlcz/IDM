package g79;

import com.revolut.data.model.Data;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import kotlin.jvm.internal.Intrinsics;
import s69.d;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f141133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductArticleParams f141134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f141135c;

    public a(d inboxItem, ProductArticleParams productArticleParams, Data productArticle) {
        Intrinsics.checkNotNullParameter(inboxItem, "inboxItem");
        Intrinsics.checkNotNullParameter(productArticle, "productArticle");
        this.f141133a = inboxItem;
        this.f141134b = productArticleParams;
        this.f141135c = productArticle;
    }

    public static a a(a aVar, d inboxItem, Data productArticle, int i) {
        if ((i & 1) != 0) {
            inboxItem = aVar.f141133a;
        }
        ProductArticleParams productArticleParams = aVar.f141134b;
        if ((i & 4) != 0) {
            productArticle = aVar.f141135c;
        }
        Intrinsics.checkNotNullParameter(inboxItem, "inboxItem");
        Intrinsics.checkNotNullParameter(productArticle, "productArticle");
        return new a(inboxItem, productArticleParams, productArticle);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f141133a, aVar.f141133a) && Intrinsics.f(this.f141134b, aVar.f141134b) && Intrinsics.f(this.f141135c, aVar.f141135c);
    }

    public final int hashCode() {
        int iHashCode = this.f141133a.hashCode() * 31;
        ProductArticleParams productArticleParams = this.f141134b;
        return this.f141135c.hashCode() + ((iHashCode + (productArticleParams == null ? 0 : productArticleParams.hashCode())) * 31);
    }
}
