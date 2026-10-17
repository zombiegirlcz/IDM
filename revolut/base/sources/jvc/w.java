package jvc;

import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f178850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductArticleKey f178851b;

    public w(boolean z, ProductArticleKey productArticleKey) {
        this.f178850a = z;
        this.f178851b = productArticleKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f178850a == wVar.f178850a && Intrinsics.f(this.f178851b, wVar.f178851b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f178850a) * 31;
        ProductArticleKey productArticleKey = this.f178851b;
        return iHashCode + (productArticleKey == null ? 0 : productArticleKey.hashCode());
    }
}
