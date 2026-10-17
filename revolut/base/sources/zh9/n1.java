package zh9;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f322312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f322313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f322314c;

    public n1(dj0.d minPurchaseAmount, dj0.d maxPurchaseAmount, boolean z) {
        Intrinsics.checkNotNullParameter(minPurchaseAmount, "minPurchaseAmount");
        Intrinsics.checkNotNullParameter(maxPurchaseAmount, "maxPurchaseAmount");
        this.f322312a = minPurchaseAmount;
        this.f322313b = maxPurchaseAmount;
        this.f322314c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        return Intrinsics.f(this.f322312a, n1Var.f322312a) && Intrinsics.f(this.f322313b, n1Var.f322313b) && this.f322314c == n1Var.f322314c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f322314c) + v7.c(this.f322312a.hashCode() * 31, 31, this.f322313b);
    }
}
