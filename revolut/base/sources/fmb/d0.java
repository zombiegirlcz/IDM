package fmb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136265a;

    public d0(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f136265a = productId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f136265a, ((d0) obj2).f136265a);
    }

    public final int hashCode() {
        return this.f136265a.hashCode();
    }
}
