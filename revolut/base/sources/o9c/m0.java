package o9c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od0.i f223209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q9c.r f223210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s6c.i f223211c;

    public m0(od0.i selectedPaymentMethod, q9c.r paymentOptionState, s6c.i amount) {
        Intrinsics.checkNotNullParameter(selectedPaymentMethod, "selectedPaymentMethod");
        Intrinsics.checkNotNullParameter(paymentOptionState, "paymentOptionState");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f223209a = selectedPaymentMethod;
        this.f223210b = paymentOptionState;
        this.f223211c = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f223209a, m0Var.f223209a) && Intrinsics.f(this.f223210b, m0Var.f223210b) && Intrinsics.f(this.f223211c, m0Var.f223211c);
    }

    public final int hashCode() {
        return this.f223211c.hashCode() + ((this.f223210b.hashCode() + (this.f223209a.hashCode() * 31)) * 31);
    }
}
