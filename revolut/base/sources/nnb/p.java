package nnb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f217511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ncd.g f217512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f217513c;

    public p(String title, ncd.g productType, xi0.b currency) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f217511a = title;
        this.f217512b = productType;
        this.f217513c = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f217511a, pVar.f217511a) && this.f217512b == pVar.f217512b && Intrinsics.f(this.f217513c, pVar.f217513c);
    }

    public final int hashCode() {
        return this.f217513c.hashCode() + ((this.f217512b.hashCode() + (this.f217511a.hashCode() * 31)) * 31);
    }
}
