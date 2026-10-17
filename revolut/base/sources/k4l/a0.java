package k4l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180944b;

    public a0(String orderId, String orderCompoundId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(orderCompoundId, "orderCompoundId");
        this.f180943a = orderId;
        this.f180944b = orderCompoundId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f180943a, a0Var.f180943a) && Intrinsics.f(this.f180944b, a0Var.f180944b);
    }

    public final int hashCode() {
        return this.f180944b.hashCode() + (this.f180943a.hashCode() * 31);
    }
}
