package hha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f152373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f152374b;

    public y0(double d, dj0.d cashForCardSpend) {
        Intrinsics.checkNotNullParameter(cashForCardSpend, "cashForCardSpend");
        this.f152373a = d;
        this.f152374b = cashForCardSpend;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Double.compare(this.f152373a, y0Var.f152373a) == 0 && Intrinsics.f(this.f152374b, y0Var.f152374b);
    }

    public final int hashCode() {
        return this.f152374b.hashCode() + (Double.hashCode(this.f152373a) * 31);
    }
}
