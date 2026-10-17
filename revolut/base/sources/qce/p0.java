package qce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f244756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f244757b;

    public p0(qua.p recurringPayment, q0 subscriptionLoanStatus) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(subscriptionLoanStatus, "subscriptionLoanStatus");
        this.f244756a = recurringPayment;
        this.f244757b = subscriptionLoanStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f244756a, p0Var.f244756a) && this.f244757b == p0Var.f244757b;
    }

    public final int hashCode() {
        return this.f244757b.hashCode() + (this.f244756a.hashCode() * 31);
    }
}
