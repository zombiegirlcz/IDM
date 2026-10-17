package fb7;

import com.revolut.feature.hidden_accounts.impl.ui.utils.HiddenAccountProductArticleKey;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductArticleKey f133495a;

    public s(HiddenAccountProductArticleKey productArticleKey) {
        Intrinsics.checkNotNullParameter(productArticleKey, "productArticleKey");
        this.f133495a = productArticleKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f133495a, ((s) obj2).f133495a);
    }

    public final int hashCode() {
        return this.f133495a.hashCode();
    }
}
