package j49;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171329b;

    public i(String product, String accountId) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f171328a = product;
        this.f171329b = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f171328a, iVar.f171328a) && Intrinsics.f(this.f171329b, iVar.f171329b);
    }

    public final int hashCode() {
        return this.f171329b.hashCode() + (this.f171328a.hashCode() * 31);
    }
}
