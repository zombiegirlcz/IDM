package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class y3 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f55618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f55619c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f55620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f55621h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f55622j;
    public final int k;

    public y3(List buttons, String listId, int i, int i2, int i3) {
        i = (i3 & 16) != 0 ? R$attr.uikit_dp0 : i;
        i2 = (i3 & 32) != 0 ? R$attr.uikit_dp0 : i2;
        int i5 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f55617a = listId;
        this.f55618b = buttons;
        this.f55619c = c.d.f249513a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f55620g = null;
        this.f55621h = i;
        this.i = i2;
        this.f55622j = i5;
        this.k = i5;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new CircleActionButtonsBarDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55076n() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return this.f55617a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj2;
        return this.f55617a.equals(y3Var.f55617a) && Intrinsics.f(this.f55618b, y3Var.f55618b) && Intrinsics.f(this.f55619c, y3Var.f55619c) && Intrinsics.f(this.d, y3Var.d) && Intrinsics.f(this.e, y3Var.e) && Intrinsics.f(this.f, y3Var.f) && Intrinsics.f(this.f55620g, y3Var.f55620g) && this.f55621h == y3Var.f55621h && this.i == y3Var.i && this.f55622j == y3Var.f55622j && this.k == y3Var.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52633g() {
        return this.f55621h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f55621h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f55619c, j6.a.c(p.a.d(this.f55617a.hashCode() * 31, 31, this.f55618b), 961, false), 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f55620g;
        return Integer.hashCode(this.k) + j6.a.b(this.f55622j, j6.a.b(this.i, j6.a.b(this.f55621h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52638n() {
        return this.f55620g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f55619c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.d;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52634h() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52635j() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.f55619c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52637m() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52636l() {
        return this.e;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f55620g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
        return this.f55622j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f = cVar;
    }
}
