package o9c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od0.i f223215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q9c.r f223216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s6c.d f223217c;
    public final String d;
    public final String e;

    public o0(od0.i selectedPaymentMethod, q9c.r paymentOptionState, s6c.d amount, String orderToken, String merchantPublicKey) {
        Intrinsics.checkNotNullParameter(selectedPaymentMethod, "selectedPaymentMethod");
        Intrinsics.checkNotNullParameter(paymentOptionState, "paymentOptionState");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(merchantPublicKey, "merchantPublicKey");
        this.f223215a = selectedPaymentMethod;
        this.f223216b = paymentOptionState;
        this.f223217c = amount;
        this.d = orderToken;
        this.e = merchantPublicKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f223215a, o0Var.f223215a) && Intrinsics.f(this.f223216b, o0Var.f223216b) && Intrinsics.f(this.f223217c, o0Var.f223217c) && Intrinsics.f(this.d, o0Var.d) && Intrinsics.f(this.e, o0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c((this.f223217c.hashCode() + ((this.f223216b.hashCode() + (this.f223215a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
