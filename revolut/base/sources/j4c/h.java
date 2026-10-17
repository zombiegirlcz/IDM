package j4c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171340b;

    public h(String orderId, String orderNumber) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        this.f171339a = orderId;
        this.f171340b = orderNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f171339a, hVar.f171339a) && Intrinsics.f(this.f171340b, hVar.f171340b);
    }

    public final int hashCode() {
        return this.f171340b.hashCode() + (this.f171339a.hashCode() * 31);
    }
}
