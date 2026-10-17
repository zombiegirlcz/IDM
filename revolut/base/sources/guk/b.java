package guk;

import ip0.m3;
import ip0.o3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3 f146971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o3 f146972b;

    public b(m3 barChartYAxisLabels, m3 m3Var) {
        Intrinsics.checkNotNullParameter(barChartYAxisLabels, "barChartYAxisLabels");
        this.f146971a = barChartYAxisLabels;
        this.f146972b = m3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f146971a.equals(bVar.f146971a) && Intrinsics.f(this.f146972b, bVar.f146972b);
    }

    public final int hashCode() {
        int iHashCode = this.f146971a.f165309a.hashCode() * 31;
        o3 o3Var = this.f146972b;
        return iHashCode + (o3Var == null ? 0 : o3Var.hashCode());
    }
}
