package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f10367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1 f10369c;

    public j1(h1 h1Var, Clause displayValue, g1 g1Var) {
        Intrinsics.checkNotNullParameter(displayValue, "displayValue");
        this.f10367a = h1Var;
        this.f10368b = displayValue;
        this.f10369c = g1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return Intrinsics.f(this.f10367a, j1Var.f10367a) && this.f10368b.equals(j1Var.f10368b) && Intrinsics.f(this.f10369c, j1Var.f10369c);
    }

    public final int hashCode() {
        i1 i1Var = this.f10367a;
        int iB = p.a.b((i1Var == null ? 0 : ((h1) i1Var).f10333a.hashCode()) * 31, 31, this.f10368b);
        g1 g1Var = this.f10369c;
        return iB + (g1Var != null ? g1Var.hashCode() : 0);
    }
}
