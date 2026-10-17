package ho;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import ho.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f154172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f154173c;

    public j(String str, AnalyticsProduct product, AnalyticsContext analyticsContext) {
        mo.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(product, "product");
        this.f154171a = str;
        this.f154172b = product;
        this.f154173c = analyticsContext;
    }

    @Override // ho.n.a
    public final mo.e b() {
        return mo.e.a();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f154171a, jVar.f154171a) && this.f154172b.equals(jVar.f154172b) && Intrinsics.f(this.f154173c, jVar.f154173c);
    }

    public final int hashCode() {
        String str = this.f154171a;
        int iA = h30.l.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f154172b);
        AnalyticsContext analyticsContext = this.f154173c;
        return mo.e.b(521) + ((iA + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0)) * 31);
    }

    public final String toString() {
        return "ScreenshotCapture(screen=" + this.f154171a + ", product=" + this.f154172b + ")";
    }
}
