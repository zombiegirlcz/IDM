package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class g4 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f4 f54178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qv0.c f54179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54180c;
    public int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f54181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f54182h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f54183j;

    public g4(f4 content) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter("COMPARISON_CELL_HEADER_LIST_ID", "listId");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f54178a = content;
        this.f54179b = c.d.f249513a;
        this.f54180c = i;
        this.d = i;
        this.e = i;
        this.f = i;
        this.f54181g = null;
        this.f54182h = null;
        this.i = null;
        this.f54183j = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new ComparisonCellHeadingDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF52249j() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52244a() {
        return "COMPARISON_CELL_HEADER_LIST_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj2;
        return this.f54178a.equals(g4Var.f54178a) && Intrinsics.f(this.f54179b, g4Var.f54179b) && this.f54180c == g4Var.f54180c && this.d == g4Var.d && this.e == g4Var.e && this.f == g4Var.f && Intrinsics.f(this.f54181g, g4Var.f54181g) && Intrinsics.f(this.f54182h, g4Var.f54182h) && Intrinsics.f(this.i, g4Var.i) && Intrinsics.f(this.f54183j, g4Var.f54183j);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF() {
        return this.f54180c;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f54180c = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f54180c, h30.l.i(this.f54179b, (this.f54178a.hashCode() + 778994223) * 961, 31), 31), 31), 31), 31);
        p31.c cVar = this.f54181g;
        int iHashCode = (iB + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f54182h;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f54183j;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52250l() {
        return this.f54181g;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f54179b = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52251m() {
        return this.f54182h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52247g() {
        return this.d;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getI() {
        return this.f;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.d = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52253p() {
        return this.f54179b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f54183j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52252n() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f54181g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52248h() {
        return this.e;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f54182h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f54183j = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof g4 ? (g4) oldItem : null) != null) {
            return new ip0.mb(!((g4) oldItem).f54178a.equals(this.f54178a), or0.b.l(this, (qv0.i) oldItem));
        }
        return null;
    }
}
