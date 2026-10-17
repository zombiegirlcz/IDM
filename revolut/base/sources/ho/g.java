package ho;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import ho.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class g extends n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f154162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f154163c;

    public g(String str, AnalyticsProduct product, w0 w0Var) {
        mo.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(product, "product");
        this.f154161a = str;
        this.f154162b = product;
        this.f154163c = w0Var;
    }

    @Override // ho.n.a
    public final mo.e b() {
        return new mo.e(521);
    }

    public final w0 c() {
        return this.f154163c;
    }

    public final AnalyticsProduct d() {
        return this.f154162b;
    }

    public final String e() {
        return this.f154161a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f154161a, gVar.f154161a) && this.f154162b.equals(gVar.f154162b) && Intrinsics.f(this.f154163c, gVar.f154163c);
    }

    public final int hashCode() {
        String str = this.f154161a;
        return Integer.hashCode(521) + ((AnalyticsContext.a(this.f154163c) + h30.l.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f154162b)) * 31);
    }

    public final String toString() {
        return "PushNotification(screen=" + this.f154161a + ", product=" + this.f154162b + ")";
    }
}
