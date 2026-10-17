package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class e9 implements qv0.i, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f54092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54093c;
    public final yv0.j d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f54094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f54095h;
    public qv0.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f54096j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f54097l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f54098m;

    public e9(String listId, List placeholder, boolean z, yv0.j mapHeight, int i) {
        if ((i & 4) != 0) {
            MapPlainLoadingDelegate.INSTANCE.getClass();
            placeholder = MapPlainLoadingDelegate.d;
        }
        z = (i & 8) != 0 ? false : z;
        mapHeight = (i & 16) != 0 ? yv0.j.DP_180 : mapHeight;
        int i2 = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(mapHeight, "mapHeight");
        this.f54091a = listId;
        this.f54092b = placeholder;
        this.f54093c = z;
        this.d = mapHeight;
        this.e = i2;
        this.f = i2;
        this.f54094g = i2;
        this.f54095h = i2;
        this.i = c.d.f249513a;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new MapPlainLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52926a() {
        return this.f54091a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e9)) {
            return false;
        }
        e9 e9Var = (e9) obj2;
        return Intrinsics.f(this.f54091a, e9Var.f54091a) && Intrinsics.f(this.f54092b, e9Var.f54092b) && this.f54093c == e9Var.f54093c && this.d == e9Var.d && this.e == e9Var.e && this.f == e9Var.f && this.f54094g == e9Var.f54094g && this.f54095h == e9Var.f54095h;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52937r() {
        return this.e;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.e = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54095h) + j6.a.b(this.f54094g, j6.a.b(this.f, j6.a.b(this.e, (this.d.hashCode() + j6.a.c(p.a.d(this.f54091a.hashCode() * 961, 31, this.f54092b), 31, this.f54093c)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52934n() {
        return this.f54096j;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.i = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.k;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f54097l = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52938s() {
        return this.f;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getU() {
        return this.f54095h;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52933m() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52936q() {
        return this.f54098m;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52935p() {
        return this.f54097l;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f54096j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52939t() {
        return this.f54094g;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f54098m = cVar;
    }
}
