package k7c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182005b;

    public t0(String orderToken, String deliveryMethodId) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(deliveryMethodId, "deliveryMethodId");
        this.f182004a = orderToken;
        this.f182005b = deliveryMethodId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f182004a, t0Var.f182004a) && Intrinsics.f(this.f182005b, t0Var.f182005b);
    }

    public final int hashCode() {
        return this.f182005b.hashCode() + (this.f182004a.hashCode() * 31);
    }
}
