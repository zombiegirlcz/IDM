package lnd;

import aw0.n2;
import aw0.r1;
import aw0.y1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1 f197167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n2 f197168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f197169c;
    public final boolean d;
    public final a0 e;

    public d0(y1 lineData, n2 style, r1 r1Var, boolean z, a0 a0Var) {
        Intrinsics.checkNotNullParameter(lineData, "lineData");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f197167a = lineData;
        this.f197168b = style;
        this.f197169c = r1Var;
        this.d = z;
        this.e = a0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f197167a, d0Var.f197167a) && Intrinsics.f(this.f197168b, d0Var.f197168b) && Intrinsics.f(this.f197169c, d0Var.f197169c) && this.d == d0Var.d && Intrinsics.f(this.e, d0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f197168b.hashCode() + (this.f197167a.hashCode() * 31)) * 31;
        r1 r1Var = this.f197169c;
        int iC = j6.a.c((iHashCode + (r1Var == null ? 0 : r1Var.hashCode())) * 31, 31, this.d);
        a0 a0Var = this.e;
        return iC + (a0Var != null ? a0Var.hashCode() : 0);
    }
}
