package o9k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f223309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q9k.a f223310b;

    public g(qua.p recurringPayment, q9k.a juniorWithPockets) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(juniorWithPockets, "juniorWithPockets");
        this.f223309a = recurringPayment;
        this.f223310b = juniorWithPockets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f223309a, gVar.f223309a) && Intrinsics.f(this.f223310b, gVar.f223310b);
    }

    public final int hashCode() {
        return this.f223310b.hashCode() + (this.f223309a.hashCode() * 31);
    }
}
