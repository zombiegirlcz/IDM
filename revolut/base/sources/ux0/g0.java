package ux0;

import aw0.i8;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tnb.g0 f283746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f283747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f283748c;
    public final boolean d;
    public final tx0.q e;

    public g0(tnb.g0 productIntroStateProvider, List list, a0 a0Var, boolean z, tx0.q qVar) {
        Intrinsics.checkNotNullParameter(productIntroStateProvider, "productIntroStateProvider");
        this.f283746a = productIntroStateProvider;
        this.f283747b = list;
        this.f283748c = a0Var;
        this.d = z;
        this.e = qVar;
    }

    public static g0 p(g0 g0Var, List list, a0 a0Var, tx0.q qVar, int i) {
        tnb.g0 productIntroStateProvider = g0Var.f283746a;
        if ((i & 2) != 0) {
            list = g0Var.f283747b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            a0Var = g0Var.f283748c;
        }
        a0 a0Var2 = a0Var;
        boolean z = (i & 8) != 0 ? g0Var.d : true;
        if ((i & 16) != 0) {
            qVar = g0Var.e;
        }
        Intrinsics.checkNotNullParameter(productIntroStateProvider, "productIntroStateProvider");
        return new g0(productIntroStateProvider, list2, a0Var2, z, qVar);
    }

    @Override // ux0.l0
    public final l0 b(List models, tx0.q pagerIndicatorType) {
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(pagerIndicatorType, "pagerIndicatorType");
        a0 a0Var = this.f283748c;
        return a0Var != null ? q(models, a0Var, pagerIndicatorType) : p(this, models, null, pagerIndicatorType, 13);
    }

    @Override // ux0.l0
    public final l0 c(a0 pagingState) {
        tx0.q qVar;
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        List list = this.f283747b;
        return (list == null || (qVar = this.e) == null) ? p(this, null, pagingState, null, 27) : q(list, pagingState, qVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return this.f283746a.equals(g0Var.f283746a) && Intrinsics.f(this.f283747b, g0Var.f283747b) && Intrinsics.f(this.f283748c, g0Var.f283748c) && this.d == g0Var.d && Intrinsics.f(this.e, g0Var.e);
    }

    @Override // ux0.l0
    public final l0 h() {
        return p(this, null, null, null, 23);
    }

    public final int hashCode() {
        int iHashCode = this.f283746a.hashCode() * 31;
        List list = this.f283747b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        a0 a0Var = this.f283748c;
        int iC = j6.a.c((iHashCode2 + (a0Var == null ? 0 : a0Var.hashCode())) * 31, 31, this.d);
        tx0.q qVar = this.e;
        return iC + (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // ux0.l0
    public final List i() {
        return this.f283747b;
    }

    @Override // ux0.l0
    public final d1 n() {
        return this.f283746a;
    }

    public final l0 q(List list, a0 a0Var, tx0.q qVar) {
        aw0.b bVarE = l0.e(a0Var.f283733a, list);
        if (bVarE == null) {
            return p(this, list, a0Var, qVar, 9);
        }
        i8 i8Var = bVarE.f10239a;
        tnb.g0 g0Var = this.f283746a;
        return (l0.j(g0Var, i8Var) || g(i8Var)) ? new h0(a0Var.f283733a, list, this.d, g0Var, qVar) : l0.f(bVarE.f10239a, a0Var.f283733a, list, g0Var, qVar, this.d);
    }
}
