package j4c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171342b;

    public i(String orderId, String orderNumber) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        this.f171341a = orderId;
        this.f171342b = orderNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f171341a, iVar.f171341a) && Intrinsics.f(this.f171342b, iVar.f171342b);
    }

    public final int hashCode() {
        return this.f171342b.hashCode() + (this.f171341a.hashCode() * 31);
    }
}
