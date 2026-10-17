package svi;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f265930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f265931b;

    public k0(dj0.d originalPrice, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        this.f265930a = originalPrice;
        this.f265931b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f265930a, k0Var.f265930a) && Intrinsics.f(this.f265931b, k0Var.f265931b);
    }

    public final int hashCode() {
        int iHashCode = this.f265930a.hashCode() * 31;
        dj0.d dVar = this.f265931b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
