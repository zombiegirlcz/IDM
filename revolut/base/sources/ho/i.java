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
public final class i extends n.a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f154168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f154169c;
    public final w0 d;
    public final mo.e e;

    public i(String screen, AnalyticsProduct product, AnalyticsContext analyticsContext, w0 w0Var, mo.e eVar) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f154167a = screen;
        this.f154168b = product;
        this.f154169c = analyticsContext;
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
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f154167a, iVar.f154167a) && Intrinsics.f(this.f154168b, iVar.f154168b) && Intrinsics.f(this.f154169c, iVar.f154169c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iA = h30.l.a(this.f154167a.hashCode() * 31, 31, this.f154168b);
        AnalyticsContext analyticsContext = this.f154169c;
        int iA2 = (iA + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
        w0 w0Var = this.d;
        int iHashCode = ((w0Var == null ? 0 : w0Var.hashCode()) + iA2) * 31;
        mo.e eVar = this.e;
        return iHashCode + (eVar != null ? mo.e.b(eVar.c()) : 0);
    }

    public final String toString() {
        return "ScreenView(screen=" + this.f154167a + ", product=" + this.f154168b + ")";
    }
}
