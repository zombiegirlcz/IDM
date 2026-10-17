package dbd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112725a;

    public d(String product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f112725a = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f112725a, ((d) obj2).f112725a);
    }

    public final int hashCode() {
        return this.f112725a.hashCode() + (Integer.hashCode(1) * 31);
    }
}
