package ec5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f124441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f124442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f124443c;

    public k(i product, j status, l lVar) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f124441a = product;
        this.f124442b = status;
        this.f124443c = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f124441a == kVar.f124441a && this.f124442b == kVar.f124442b && Intrinsics.f(this.f124443c, kVar.f124443c);
    }

    public final int hashCode() {
        int iHashCode = (this.f124442b.hashCode() + (this.f124441a.hashCode() * 31)) * 31;
        l lVar = this.f124443c;
        return iHashCode + (lVar == null ? 0 : lVar.f124444a.hashCode());
    }
}
