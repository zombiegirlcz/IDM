package c0c;

import kotlin.jvm.internal.Intrinsics;
import m1c.i1;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f20205a;

    public c(i1 productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f20205a = productId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f20205a == ((c) obj2).f20205a;
    }

    public final int hashCode() {
        return this.f20205a.hashCode() * 31;
    }
}
