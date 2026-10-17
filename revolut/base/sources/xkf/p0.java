package xkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f306745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ibd.i f306746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f306747c;
    public final qua.p d;

    public p0(boolean z, ibd.i standingOrder, Long l2, qua.p recurringPayment) {
        Intrinsics.checkNotNullParameter(standingOrder, "standingOrder");
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        this.f306745a = z;
        this.f306746b = standingOrder;
        this.f306747c = l2;
        this.d = recurringPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return this.f306745a == p0Var.f306745a && Intrinsics.f(this.f306746b, p0Var.f306746b) && Intrinsics.f(this.f306747c, p0Var.f306747c) && Intrinsics.f(this.d, p0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f306746b.hashCode() + (Boolean.hashCode(this.f306745a) * 31)) * 31;
        Long l2 = this.f306747c;
        return this.d.hashCode() + ((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31);
    }
}
