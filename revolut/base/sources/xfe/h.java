package xfe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6e.d f305252a;

    public h(h6e.d product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f305252a = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f305252a.equals(((h) obj2).f305252a);
    }

    public final int hashCode() {
        return this.f305252a.hashCode();
    }
}
