package v2b;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsProduct f285689a;

    public c(AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f285689a = analyticsProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f285689a, ((c) obj2).f285689a);
    }

    public final int hashCode() {
        return this.f285689a.hashCode();
    }
}
