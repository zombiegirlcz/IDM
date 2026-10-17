package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f325820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f325821b;

    public n0(dj0.d renewalQuoteMonthlyPayment, dj0.d currentPolicyMonthlyPayment) {
        Intrinsics.checkNotNullParameter(renewalQuoteMonthlyPayment, "renewalQuoteMonthlyPayment");
        Intrinsics.checkNotNullParameter(currentPolicyMonthlyPayment, "currentPolicyMonthlyPayment");
        this.f325820a = renewalQuoteMonthlyPayment;
        this.f325821b = currentPolicyMonthlyPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f325820a, n0Var.f325820a) && Intrinsics.f(this.f325821b, n0Var.f325821b);
    }

    public final int hashCode() {
        return this.f325821b.hashCode() + (this.f325820a.hashCode() * 31);
    }
}
