package xvg;

import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PerformanceChart f309262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PerformanceChart f309263b;

    public a(PerformanceChart performanceChart, PerformanceChart performanceChart2) {
        this.f309262a = performanceChart;
        this.f309263b = performanceChart2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f309262a, aVar.f309262a) && Intrinsics.f(this.f309263b, aVar.f309263b);
    }

    public final int hashCode() {
        PerformanceChart performanceChart = this.f309262a;
        int iHashCode = (performanceChart == null ? 0 : performanceChart.hashCode()) * 31;
        PerformanceChart performanceChart2 = this.f309263b;
        return iHashCode + (performanceChart2 != null ? performanceChart2.hashCode() : 0);
    }
}
