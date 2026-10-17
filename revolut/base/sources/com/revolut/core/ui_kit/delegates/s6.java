package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_resources.R$attr;
import ip0.bl;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class s6 implements koi.j, o31.c, qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f54688c;
    public final List d;
    public final List e;
    public qv0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f54689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f54690h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f54691j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f54692l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f54693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f54694n;

    public s6(String listId, int i, List items, Integer num, List filters, int i2) {
        num = (i2 & 16) != 0 ? null : num;
        filters = (i2 & 32) != 0 ? zhm.f0.f322471a : filters;
        int i3 = R$attr.uikit_dp0;
        int i5 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(filters, "filters");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        this.f54686a = listId;
        this.f54687b = i;
        this.f54688c = num;
        this.d = items;
        this.e = filters;
        this.f = positionInBox;
        this.f54689g = i3;
        this.f54690h = i3;
        this.i = i5;
        this.f54691j = i5;
        this.k = null;
        this.f54692l = null;
        this.f54693m = null;
        this.f54694n = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new GridSingleChoiceDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55076n() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF55265b() {
        return this.f54686a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj2;
        return this.f54686a.equals(s6Var.f54686a) && this.f54687b == s6Var.f54687b && Intrinsics.f(this.f54688c, s6Var.f54688c) && Intrinsics.f(this.d, s6Var.d) && Intrinsics.f(this.e, s6Var.e) && Intrinsics.f(this.f, s6Var.f) && this.f54689g == s6Var.f54689g && this.f54690h == s6Var.f54690h && this.i == s6Var.i && this.f54691j == s6Var.f54691j && Intrinsics.f(this.k, s6Var.k) && Intrinsics.f(this.f54692l, s6Var.f54692l) && Intrinsics.f(this.f54693m, s6Var.f54693m) && Intrinsics.f(this.f54694n, s6Var.f54694n);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52633g() {
        return this.f54689g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f54689g = i;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f54687b, this.f54686a.hashCode() * 31, 31);
        Integer num = this.f54688c;
        int iB2 = j6.a.b(this.f54691j, j6.a.b(this.i, j6.a.b(this.f54690h, j6.a.b(this.f54689g, h30.l.i(this.f, p.a.d(j6.a.b(7, p.a.d((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.d), 31), 961, this.e), 31), 31), 31), 31), 31);
        p31.c cVar = this.k;
        int iHashCode = (iB2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f54692l;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f54693m;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f54694n;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52638n() {
        return this.f54694n;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getK() {
        return this.k;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f54692l = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52634h() {
        return this.f54690h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52635j() {
        return this.f54691j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f54690h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getO() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52637m() {
        return this.f54693m;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52636l() {
        return this.f54692l;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f54694n = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getI() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f54693m = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof s6 ? (s6) oldItem : null) == null) {
            return null;
        }
        return new bl(((s6) oldItem).f54687b != this.f54687b, !Intrinsics.f(r5.d, this.d), false);
    }
}
