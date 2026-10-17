package o9c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q6c.h f223212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pec.e f223213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s6c.k f223214c;

    public n0(q6c.h orderDetails, pec.e shippingAndDelivery, s6c.k amount) {
        Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
        Intrinsics.checkNotNullParameter(shippingAndDelivery, "shippingAndDelivery");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f223212a = orderDetails;
        this.f223213b = shippingAndDelivery;
        this.f223214c = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f223212a, n0Var.f223212a) && Intrinsics.f(this.f223213b, n0Var.f223213b) && Intrinsics.f(this.f223214c, n0Var.f223214c);
    }

    public final int hashCode() {
        return this.f223214c.hashCode() + ((this.f223213b.hashCode() + (this.f223212a.hashCode() * 31)) * 31);
    }
}
