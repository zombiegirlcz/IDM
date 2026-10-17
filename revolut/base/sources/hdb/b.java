package hdb;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductArticleParams f151402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsContext f151403b;

    public b(ProductArticleParams params, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f151402a = params;
        this.f151403b = analyticsContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f151402a, bVar.f151402a) && Intrinsics.f(this.f151403b, bVar.f151403b);
    }

    public final int hashCode() {
        int iHashCode = this.f151402a.hashCode() * 31;
        AnalyticsContext analyticsContext = this.f151403b;
        return iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }
}
