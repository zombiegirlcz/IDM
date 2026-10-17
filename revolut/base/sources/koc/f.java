package koc;

import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalValueChartPoint f186298a;

    public f(TotalValueChartPoint totalValueChartPoint) {
        Intrinsics.checkNotNullParameter(totalValueChartPoint, "totalValueChartPoint");
        this.f186298a = totalValueChartPoint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f186298a, ((f) obj2).f186298a);
    }

    public final int hashCode() {
        return this.f186298a.hashCode();
    }
}
