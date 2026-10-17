package xfe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6e.d f305243a;

    public b(h6e.d product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f305243a = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f305243a.equals(((b) obj2).f305243a);
    }

    public final int hashCode() {
        return this.f305243a.hashCode();
    }
}
