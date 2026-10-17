package a2b;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsProduct f721a;

    public c(AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f721a = analyticsProduct;
    }

    public final AnalyticsProduct b() {
        return this.f721a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f721a, ((c) obj2).f721a);
    }

    public final int hashCode() {
        return this.f721a.hashCode();
    }
}
