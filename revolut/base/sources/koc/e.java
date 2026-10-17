package koc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pdh.a f186297a;

    public e(pdh.a performanceChartPoint) {
        Intrinsics.checkNotNullParameter(performanceChartPoint, "performanceChartPoint");
        this.f186297a = performanceChartPoint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f186297a, ((e) obj2).f186297a);
    }

    public final int hashCode() {
        return this.f186297a.hashCode();
    }
}
