package zod;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f323990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f323991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final amd.a f323992c;

    public g0(List assetsBalances, List liabilitiesBalances, amd.a timeframe) {
        Intrinsics.checkNotNullParameter(assetsBalances, "assetsBalances");
        Intrinsics.checkNotNullParameter(liabilitiesBalances, "liabilitiesBalances");
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        this.f323990a = assetsBalances;
        this.f323991b = liabilitiesBalances;
        this.f323992c = timeframe;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f323990a, g0Var.f323990a) && Intrinsics.f(this.f323991b, g0Var.f323991b) && this.f323992c == g0Var.f323992c;
    }

    public final int hashCode() {
        return this.f323992c.hashCode() + p.a.d(this.f323990a.hashCode() * 31, 31, this.f323991b);
    }
}
