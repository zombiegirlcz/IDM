package gwc;

import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductArticleKey f147309a;

    public e(ProductArticleKey productArticleKey) {
        Intrinsics.checkNotNullParameter(productArticleKey, "productArticleKey");
        this.f147309a = productArticleKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f147309a, ((e) obj2).f147309a);
    }

    public final int hashCode() {
        return this.f147309a.hashCode();
    }
}
