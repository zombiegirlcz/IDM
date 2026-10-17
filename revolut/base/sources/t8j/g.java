package t8j;

import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthNewsArticle f268902a;

    public g(WealthNewsArticle article) {
        Intrinsics.checkNotNullParameter(article, "article");
        this.f268902a = article;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f268902a, ((g) obj2).f268902a);
    }

    public final int hashCode() {
        return this.f268902a.hashCode();
    }
}
