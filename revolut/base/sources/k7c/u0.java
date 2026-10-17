package k7c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182009b;

    public u0(String orderToken, String shippingContactId) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(shippingContactId, "shippingContactId");
        this.f182008a = orderToken;
        this.f182009b = shippingContactId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f182008a, u0Var.f182008a) && Intrinsics.f(this.f182009b, u0Var.f182009b);
    }

    public final int hashCode() {
        return this.f182009b.hashCode() + (this.f182008a.hashCode() * 31);
    }
}
