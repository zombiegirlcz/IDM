package ho;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import ho.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k extends n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f154179c;
    public final mo.e d;

    public k(String query, String screen, AnalyticsProduct product, mo.e eVar) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f154177a = query;
        this.f154178b = screen;
        this.f154179c = product;
        this.d = eVar;
    }

    @Override // ho.n.a
    public final mo.e b() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f154177a, kVar.f154177a) && Intrinsics.f(this.f154178b, kVar.f154178b) && Intrinsics.f(this.f154179c, kVar.f154179c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iA = h30.l.a(p.a.c(this.f154177a.hashCode() * 31, 31, this.f154178b), 31, this.f154179c);
        mo.e eVar = this.d;
        return iA + (eVar == null ? 0 : mo.e.b(eVar.c()));
    }

    public final String toString() {
        return "Search(screen=" + this.f154178b + ", product=" + this.f154179c + ")";
    }
}
