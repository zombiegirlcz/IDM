package xka;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f306646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsContext f306647b;

    public r(Data productArticleContentData, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(productArticleContentData, "productArticleContentData");
        this.f306646a = productArticleContentData;
        this.f306647b = analyticsContext;
    }

    public static r a(r rVar, Data productArticleContentData, AnalyticsContext analyticsContext, int i) {
        if ((i & 1) != 0) {
            productArticleContentData = rVar.f306646a;
        }
        if ((i & 2) != 0) {
            analyticsContext = rVar.f306647b;
        }
        rVar.getClass();
        Intrinsics.checkNotNullParameter(productArticleContentData, "productArticleContentData");
        return new r(productArticleContentData, analyticsContext);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f306646a, rVar.f306646a) && Intrinsics.f(this.f306647b, rVar.f306647b);
    }

    public final int hashCode() {
        int iHashCode = this.f306646a.hashCode() * 31;
        AnalyticsContext analyticsContext = this.f306647b;
        return iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }
}
