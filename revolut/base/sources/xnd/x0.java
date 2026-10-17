package xnd;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class x0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f307467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k71.q f307468b;

    public x0(a3 a3Var, k71.q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f307467a = a3Var;
        this.f307468b = transactionsExtraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f307467a, x0Var.f307467a) && Intrinsics.f(this.f307468b, x0Var.f307468b);
    }

    public final int hashCode() {
        a3 a3Var = this.f307467a;
        return this.f307468b.hashCode() + ((a3Var == null ? 0 : a3Var.hashCode()) * 31);
    }
}
