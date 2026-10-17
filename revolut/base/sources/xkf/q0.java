package xkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f306750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ibd.i f306751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f306752c;

    public q0(boolean z, ibd.i standingOrder, Long l2) {
        Intrinsics.checkNotNullParameter(standingOrder, "standingOrder");
        this.f306750a = z;
        this.f306751b = standingOrder;
        this.f306752c = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return this.f306750a == q0Var.f306750a && Intrinsics.f(this.f306751b, q0Var.f306751b) && Intrinsics.f(this.f306752c, q0Var.f306752c);
    }

    public final int hashCode() {
        int iHashCode = (this.f306751b.hashCode() + (Boolean.hashCode(this.f306750a) * 31)) * 31;
        Long l2 = this.f306752c;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }
}
