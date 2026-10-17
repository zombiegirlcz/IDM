package svi;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f265921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f265922b;

    public i0(int i, g0 priceBreakdown) {
        Intrinsics.checkNotNullParameter(priceBreakdown, "priceBreakdown");
        this.f265921a = i;
        this.f265922b = priceBreakdown;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return this.f265921a == i0Var.f265921a && Intrinsics.f(this.f265922b, i0Var.f265922b);
    }

    public final int hashCode() {
        return this.f265922b.hashCode() + (Integer.hashCode(this.f265921a) * 31);
    }
}
