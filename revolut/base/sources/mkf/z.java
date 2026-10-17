package mkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f206284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ibd.i f206285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f206286c;
    public final qua.p d;

    public z(boolean z, ibd.i standingOrder, Long l2, qua.p recurringPayment) {
        Intrinsics.checkNotNullParameter(standingOrder, "standingOrder");
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        this.f206284a = z;
        this.f206285b = standingOrder;
        this.f206286c = l2;
        this.d = recurringPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f206284a == zVar.f206284a && Intrinsics.f(this.f206285b, zVar.f206285b) && Intrinsics.f(this.f206286c, zVar.f206286c) && Intrinsics.f(this.d, zVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f206285b.hashCode() + (Boolean.hashCode(this.f206284a) * 31)) * 31;
        Long l2 = this.f206286c;
        return this.d.hashCode() + ((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31);
    }
}
