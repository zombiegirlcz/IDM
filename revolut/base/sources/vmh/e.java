package vmh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f290584a;

    public e(f product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f290584a = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f290584a == ((e) obj2).f290584a;
    }

    public final int hashCode() {
        return this.f290584a.hashCode();
    }
}
