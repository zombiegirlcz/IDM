package fwc;

import com.revolut.feature.product_article.api.models.ProductArticleKey;
import com.revolut.feature.security_hub.impl.utils.SecurityHubProductArticleKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductArticleKey f138613a;

    public p(SecurityHubProductArticleKey productArticleKey) {
        Intrinsics.checkNotNullParameter(productArticleKey, "productArticleKey");
        this.f138613a = productArticleKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f138613a, ((p) obj2).f138613a);
    }

    public final int hashCode() {
        return this.f138613a.hashCode();
    }
}
