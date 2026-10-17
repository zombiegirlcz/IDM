package xkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f306741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ibd.i f306742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f306743c;

    public o0(boolean z, ibd.i standingOrder, Long l2) {
        Intrinsics.checkNotNullParameter(standingOrder, "standingOrder");
        this.f306741a = z;
        this.f306742b = standingOrder;
        this.f306743c = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return this.f306741a == o0Var.f306741a && Intrinsics.f(this.f306742b, o0Var.f306742b) && Intrinsics.f(this.f306743c, o0Var.f306743c);
    }

    public final int hashCode() {
        int iHashCode = (this.f306742b.hashCode() + (Boolean.hashCode(this.f306741a) * 31)) * 31;
        Long l2 = this.f306743c;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }
}
