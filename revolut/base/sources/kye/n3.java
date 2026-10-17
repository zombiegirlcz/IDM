package kye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f190800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f190801b;

    public n3(double d, xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.f190800a = d;
        this.f190801b = baseCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj2;
        return Double.compare(this.f190800a, n3Var.f190800a) == 0 && Intrinsics.f(this.f190801b, n3Var.f190801b);
    }

    public final int hashCode() {
        return this.f190801b.hashCode() + (Double.hashCode(this.f190800a) * 31);
    }
}
