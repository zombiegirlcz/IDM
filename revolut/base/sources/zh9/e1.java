package zh9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f322263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f322264b;

    public e1(d1 repayment, y instalmentWithPlan) {
        Intrinsics.checkNotNullParameter(repayment, "repayment");
        Intrinsics.checkNotNullParameter(instalmentWithPlan, "instalmentWithPlan");
        this.f322263a = repayment;
        this.f322264b = instalmentWithPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f322263a, e1Var.f322263a) && Intrinsics.f(this.f322264b, e1Var.f322264b);
    }

    public final int hashCode() {
        return this.f322264b.hashCode() + (this.f322263a.hashCode() * 31);
    }
}
