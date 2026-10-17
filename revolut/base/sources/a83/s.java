package a83;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft3.q0 f2083a;

    public s(ft3.q0 product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f2083a = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f2083a, ((s) obj2).f2083a);
    }

    public final int hashCode() {
        return this.f2083a.hashCode();
    }
}
