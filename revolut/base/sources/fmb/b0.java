package fmb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136262a;

    public b0(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f136262a = productId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f136262a, ((b0) obj2).f136262a);
    }

    public final int hashCode() {
        return this.f136262a.hashCode();
    }
}
