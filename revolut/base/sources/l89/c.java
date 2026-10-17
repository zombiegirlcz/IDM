package l89;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsProduct.Retail f192809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bla.c f192810b;

    public c(bla.c cVar, AnalyticsProduct.Retail analyticsProduct) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f192809a = analyticsProduct;
        this.f192810b = cVar;
    }

    public final AnalyticsProduct b() {
        return this.f192809a;
    }

    public final bla.c c() {
        return this.f192810b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f192809a.equals(cVar.f192809a) && this.f192810b == cVar.f192810b;
    }

    public final int hashCode() {
        int iHashCode = this.f192809a.f50300a.hashCode() * 31;
        bla.c cVar = this.f192810b;
        return j6.a.c((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, false);
    }
}
