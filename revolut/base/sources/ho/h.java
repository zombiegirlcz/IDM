package ho;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsMetadata;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.analytics.tracking.v3.UnsupportedMetadataType;
import com.revolut.tracking.v3.ScreenMetadata;
import ho.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h extends n.a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f154165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f154166c;
    public final w0 d;
    public final mo.e e;

    public h(String screen, AnalyticsProduct product, AnalyticsContext analyticsContext, w0 w0Var, mo.e eVar) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f154164a = screen;
        this.f154165b = product;
        this.f154166c = analyticsContext;
        this.d = w0Var;
        this.e = eVar;
        if (!(w0Var instanceof ScreenMetadata)) {
            throw new UnsupportedMetadataType(w0Var);
        }
    }

    @Override // ho.f0
    public final AnalyticsMetadata a() {
        return new AnalyticsMetadata(this.d);
    }

    @Override // ho.n.a
    public final mo.e b() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f154164a, hVar.f154164a) && Intrinsics.f(this.f154165b, hVar.f154165b) && Intrinsics.f(this.f154166c, hVar.f154166c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iA = h30.l.a(this.f154164a.hashCode() * 31, 31, this.f154165b);
        AnalyticsContext analyticsContext = this.f154166c;
        int iA2 = (iA + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
        w0 w0Var = this.d;
        int iHashCode = ((w0Var == null ? 0 : w0Var.hashCode()) + iA2) * 31;
        mo.e eVar = this.e;
        return iHashCode + (eVar != null ? mo.e.b(eVar.c()) : 0);
    }

    public final String toString() {
        return "ScreenDisappear(screen=" + this.f154164a + ", product=" + this.f154165b + ")";
    }
}
