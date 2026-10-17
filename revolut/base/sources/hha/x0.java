package hha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f152371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f152372b;

    public x0(dj0.d fee2, i period) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f152371a = period;
        this.f152372b = fee2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return this.f152371a == x0Var.f152371a && Intrinsics.f(this.f152372b, x0Var.f152372b);
    }

    public final int hashCode() {
        return this.f152372b.hashCode() + (this.f152371a.hashCode() * 31);
    }
}
