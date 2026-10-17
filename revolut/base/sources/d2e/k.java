package d2e;

import f2e.d2;
import f2e.d5;
import f2e.m0;
import f2e.z3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z3 f110800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2e.g f110801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d5 f110802c;
    public final d2 d;
    public final m0 e;

    public k() {
        this(null, null, null, null, null, 31);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f110800a, kVar.f110800a) && Intrinsics.f(this.f110801b, kVar.f110801b) && Intrinsics.f(this.f110802c, kVar.f110802c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        z3 z3Var = this.f110800a;
        int iHashCode = (z3Var == null ? 0 : z3Var.hashCode()) * 31;
        f2e.g gVar = this.f110801b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        d5 d5Var = this.f110802c;
        int iHashCode3 = (iHashCode2 + (d5Var == null ? 0 : d5Var.hashCode())) * 31;
        d2 d2Var = this.d;
        int iHashCode4 = (iHashCode3 + (d2Var == null ? 0 : d2Var.hashCode())) * 31;
        m0 m0Var = this.e;
        return iHashCode4 + (m0Var != null ? m0Var.hashCode() : 0);
    }

    public k(z3 z3Var, f2e.g gVar, d5 d5Var, d2 d2Var, m0 m0Var, int i) {
        z3Var = (i & 1) != 0 ? null : z3Var;
        gVar = (i & 2) != 0 ? null : gVar;
        d5Var = (i & 4) != 0 ? null : d5Var;
        d2Var = (i & 8) != 0 ? null : d2Var;
        m0Var = (i & 16) != 0 ? null : m0Var;
        this.f110800a = z3Var;
        this.f110801b = gVar;
        this.f110802c = d5Var;
        this.d = d2Var;
        this.e = m0Var;
    }
}
