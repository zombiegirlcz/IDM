package xzg;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f310004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f310005c;
    public final ej0.b d;

    public k0(String ref2, j0 assetType, dj0.d basePrice, ej0.b bVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(basePrice, "basePrice");
        this.f310003a = ref2;
        this.f310004b = assetType;
        this.f310005c = basePrice;
        this.d = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f310003a, k0Var.f310003a) && this.f310004b == k0Var.f310004b && Intrinsics.f(this.f310005c, k0Var.f310005c) && Intrinsics.f(this.d, k0Var.d);
    }

    public final int hashCode() {
        int iC = v7.c((this.f310004b.hashCode() + (this.f310003a.hashCode() * 31)) * 31, 31, this.f310005c);
        ej0.b bVar = this.d;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }
}
