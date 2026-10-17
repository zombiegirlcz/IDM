package hmc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ilc.a f153630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f153631b;

    public c0(ilc.a roboContext, b0 b0Var) {
        Intrinsics.checkNotNullParameter(roboContext, "roboContext");
        this.f153630a = roboContext;
        this.f153631b = b0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f153630a == c0Var.f153630a && Intrinsics.f(this.f153631b, c0Var.f153631b);
    }

    public final int hashCode() {
        int iHashCode = this.f153630a.hashCode() * 31;
        b0 b0Var = this.f153631b;
        return iHashCode + (b0Var == null ? 0 : b0Var.hashCode());
    }
}
