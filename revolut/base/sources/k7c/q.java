package k7c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u6c.t f181991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f181992c;
    public final u6c.u d;
    public final xi0.b e;

    public q(String paymentMethodId, u6c.t product, String str, u6c.u uVar, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f181990a = paymentMethodId;
        this.f181991b = product;
        this.f181992c = str;
        this.d = uVar;
        this.e = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f181990a, qVar.f181990a) && this.f181991b == qVar.f181991b && Intrinsics.f(this.f181992c, qVar.f181992c) && this.d == qVar.d && Intrinsics.f(this.e, qVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f181991b.hashCode() + (this.f181990a.hashCode() * 31)) * 31;
        String str = this.f181992c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        u6c.u uVar = this.d;
        int iHashCode3 = (iHashCode2 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        xi0.b bVar = this.e;
        return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }
}
