package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.ValuatorDetailsScreenContract$Action;
import ip0.ww;
import ip0.yw;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class d9 implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MapPlainDelegate.b f54015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54016c;
    public final MapPlainDelegate.c d;
    public final ww e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f54017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f54018h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f54019j;
    public final yv0.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f54020l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public qv0.c f54021m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f54022n;
    public p31.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p31.c f54023p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p31.c f54024q;

    public d9(String listId, MapPlainDelegate.b mapConfig, boolean z, MapPlainDelegate.c markers, ww wwVar, ValuatorDetailsScreenContract$Action.ShowMap showMap, yv0.j mapHeight, boolean z3, int i) {
        z = (i & 4) != 0 ? false : z;
        wwVar = (i & 16) != 0 ? null : wwVar;
        showMap = (i & 32) != 0 ? null : showMap;
        int i2 = R$attr.uikit_dp0;
        mapHeight = (i & 1024) != 0 ? yv0.j.DP_180 : mapHeight;
        z3 = (i & 2048) != 0 ? true : z3;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(mapConfig, "mapConfig");
        Intrinsics.checkNotNullParameter(markers, "markers");
        Intrinsics.checkNotNullParameter(mapHeight, "mapHeight");
        this.f54014a = listId;
        this.f54015b = mapConfig;
        this.f54016c = z;
        this.d = markers;
        this.e = wwVar;
        this.f = showMap;
        this.f54017g = i2;
        this.f54018h = i2;
        this.i = i2;
        this.f54019j = i2;
        this.k = mapHeight;
        this.f54020l = z3;
        this.f54021m = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new MapPlainDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF55203g() {
        return this.f;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF57029a() {
        return this.f54014a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d9)) {
            return false;
        }
        d9 d9Var = (d9) obj2;
        return Intrinsics.f(this.f54014a, d9Var.f54014a) && Intrinsics.f(this.f54015b, d9Var.f54015b) && this.f54016c == d9Var.f54016c && Intrinsics.f(this.d, d9Var.d) && Intrinsics.f(this.e, d9Var.e) && Intrinsics.f(this.f, d9Var.f) && this.f54017g == d9Var.f54017g && this.f54018h == d9Var.f54018h && this.i == d9Var.i && this.f54019j == d9Var.f54019j && this.k == d9Var.k && this.f54020l == d9Var.f54020l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f54017g;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f54017g = i;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + j6.a.c((this.f54015b.hashCode() + (this.f54014a.hashCode() * 31)) * 31, 31, this.f54016c)) * 31;
        ww wwVar = this.e;
        int iHashCode2 = (iHashCode + (wwVar == null ? 0 : wwVar.hashCode())) * 31;
        Object obj2 = this.f;
        return Boolean.hashCode(this.f54020l) + ((this.k.hashCode() + j6.a.b(this.f54019j, j6.a.b(this.i, j6.a.b(this.f54018h, j6.a.b(this.f54017g, (iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31, 31), 31), 31), 31)) * 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.f54022n;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f54021m = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF57032g() {
        return this.o;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f54023p = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.f54018h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.f54019j;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f54018h = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f54021m;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.f54024q;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF57033h() {
        return this.f54023p;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f54022n = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51764s() {
        return this.i;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.o = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f54024q = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        d9 d9Var = oldItem instanceof d9 ? (d9) oldItem : null;
        if (d9Var != null) {
            return new yw(!Intrinsics.f(this.f54015b, d9Var.f54015b), !Intrinsics.f(this.d, d9Var.d), this.f54016c != d9Var.f54016c, !Intrinsics.f(this.e, d9Var.e), this.f54020l != d9Var.f54020l);
        }
        return null;
    }
}
