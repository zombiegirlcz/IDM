package yj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f314376a;

    public b(d productType) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.f314376a = productType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f314376a == ((b) obj2).f314376a;
    }

    public final int hashCode() {
        return this.f314376a.hashCode();
    }
}
