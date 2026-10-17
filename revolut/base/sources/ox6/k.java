package ox6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f230628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f230629b;

    public k(String invoiceId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        this.f230628a = currency;
        this.f230629b = invoiceId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f230628a, kVar.f230628a) && Intrinsics.f(this.f230629b, kVar.f230629b);
    }

    public final int hashCode() {
        return this.f230629b.hashCode() + (this.f230628a.hashCode() * 31);
    }
}
