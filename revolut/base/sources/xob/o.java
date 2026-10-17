package xob;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ncd.g f307777a;

    public o(ncd.g productType) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.f307777a = productType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f307777a == ((o) obj2).f307777a;
    }

    public final int hashCode() {
        return this.f307777a.hashCode();
    }
}
