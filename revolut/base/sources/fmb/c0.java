package fmb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136263a;

    public c0(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f136263a = productId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && Intrinsics.f(this.f136263a, ((c0) obj2).f136263a);
    }

    public final int hashCode() {
        return this.f136263a.hashCode();
    }
}
