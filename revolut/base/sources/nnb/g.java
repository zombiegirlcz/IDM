package nnb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f217492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ncd.g f217493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f217494c;

    public g(String moneyBoxId, ncd.g productType, xi0.b currency) {
        Intrinsics.checkNotNullParameter(moneyBoxId, "moneyBoxId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f217492a = moneyBoxId;
        this.f217493b = productType;
        this.f217494c = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f217492a, gVar.f217492a) && this.f217493b == gVar.f217493b && Intrinsics.f(this.f217494c, gVar.f217494c);
    }

    public final int hashCode() {
        return this.f217494c.hashCode() + ((this.f217493b.hashCode() + (this.f217492a.hashCode() * 31)) * 31);
    }
}
