package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.nc0;
import ip0.oc0;
import ip0.pc0;
import ip0.qc0;
import ip0.rc0;
import ip0.tc0;
import ip0.wc0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class hg implements qv0.i, o31.c, qv0.m, qv0.o, ny0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f54247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54248c;
    public final aw0.x4 d;
    public final tc0 e;
    public final gg f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f54249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final oc0 f54250h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f54251j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rc0 f54252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p31.c f54253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p31.c f54254n;
    public p31.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p31.c f54255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f54256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f54257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f54258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f54259t;
    public qv0.c u;

    public hg(String str, List list, int i, aw0.x4 x4Var, tc0 tc0Var, gg ggVar, boolean z, oc0 oc0Var, Object obj2, boolean z3, boolean z4, rc0 rc0Var, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, int i2, int i3, int i5, int i6, qv0.c cVar5) {
        this.f54246a = str;
        this.f54247b = list;
        this.f54248c = i;
        this.d = x4Var;
        this.e = tc0Var;
        this.f = ggVar;
        this.f54249g = z;
        this.f54250h = oc0Var;
        this.i = obj2;
        this.f54251j = z3;
        this.k = z4;
        this.f54252l = rc0Var;
        this.f54253m = cVar;
        this.f54254n = cVar2;
        this.o = cVar3;
        this.f54255p = cVar4;
        this.f54256q = i2;
        this.f54257r = i3;
        this.f54258s = i5;
        this.f54259t = i6;
        this.u = cVar5;
    }

    public static hg a(hg hgVar, ArrayList arrayList, tc0 tc0Var, int i) {
        String listId = hgVar.f54246a;
        List items = (i & 2) != 0 ? hgVar.f54247b : arrayList;
        int i2 = hgVar.f54248c;
        aw0.x4 heightMode = hgVar.d;
        tc0 tc0Var2 = (i & 16) != 0 ? hgVar.e : tc0Var;
        gg snapStyle = hgVar.f;
        boolean z = hgVar.f54249g;
        oc0 autoPlay = hgVar.f54250h;
        Object obj2 = hgVar.i;
        boolean z3 = hgVar.f54251j;
        boolean z4 = hgVar.k;
        rc0 pageTransformation = hgVar.f54252l;
        p31.c cVar = hgVar.f54253m;
        p31.c cVar2 = hgVar.f54254n;
        p31.c cVar3 = hgVar.o;
        p31.c cVar4 = hgVar.f54255p;
        int i3 = hgVar.f54256q;
        int i5 = hgVar.f54257r;
        int i6 = hgVar.f54258s;
        int i21 = hgVar.f54259t;
        qv0.c positionInBox = hgVar.u;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        Intrinsics.checkNotNullParameter(snapStyle, "snapStyle");
        Intrinsics.checkNotNullParameter(autoPlay, "autoPlay");
        Intrinsics.checkNotNullParameter(pageTransformation, "pageTransformation");
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        return new hg(listId, items, i2, heightMode, tc0Var2, snapStyle, z, autoPlay, obj2, z3, z4, pageTransformation, cVar, cVar2, cVar3, cVar4, i3, i5, i6, i21, positionInBox);
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53039a() {
        return this.f54246a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof hg)) {
            return false;
        }
        hg hgVar = (hg) obj2;
        return Intrinsics.f(this.f54246a, hgVar.f54246a) && Intrinsics.f(this.f54247b, hgVar.f54247b) && this.f54248c == hgVar.f54248c && Intrinsics.f(this.d, hgVar.d) && Intrinsics.f(this.e, hgVar.e) && Intrinsics.f(this.f, hgVar.f) && this.f54249g == hgVar.f54249g && Intrinsics.f(this.f54250h, hgVar.f54250h) && Intrinsics.f(this.i, hgVar.i) && this.f54251j == hgVar.f54251j && this.k == hgVar.k && Intrinsics.f(this.f54252l, hgVar.f54252l) && Intrinsics.f(this.f54253m, hgVar.f54253m) && Intrinsics.f(this.f54254n, hgVar.f54254n) && Intrinsics.f(this.o, hgVar.o) && Intrinsics.f(this.f54255p, hgVar.f54255p) && this.f54256q == hgVar.f54256q && this.f54257r == hgVar.f54257r && this.f54258s == hgVar.f54258s && this.f54259t == hgVar.f54259t && Intrinsics.f(this.u, hgVar.u);
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getK() {
        return this.f54256q;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f54256q = i;
    }

    @Override // ny0.h
    public final boolean getFitsReadableArea() {
        return !Intrinsics.f(this.u, c.d.f249513a);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + j6.a.b(this.f54248c, p.a.d(this.f54246a.hashCode() * 31, 31, this.f54247b), 31)) * 31;
        tc0 tc0Var = this.e;
        int iC = j6.a.c((this.f54250h.hashCode() + j6.a.c((this.f.hashCode() + ((iHashCode + (tc0Var == null ? 0 : tc0Var.hashCode())) * 31)) * 31, 31, this.f54249g)) * 31, 31, false);
        Object obj2 = this.i;
        int iHashCode2 = (this.f54252l.hashCode() + j6.a.c(j6.a.c((iC + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31, this.f54251j), 31, this.k)) * 31;
        p31.c cVar = this.f54253m;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f54254n;
        int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.o;
        int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f54255p;
        return this.u.hashCode() + j6.a.b(this.f54259t, j6.a.b(this.f54258s, j6.a.b(this.f54257r, j6.a.b(this.f54256q, (iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getO() {
        return this.f54253m;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.u = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53048p() {
        return this.f54254n;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.o = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF53045l() {
        return this.f54257r;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53047n() {
        return this.f54259t;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.f54257r = i;
    }

    public final List p() {
        return this.f54247b;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53051s() {
        return this.u;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53050r() {
        return this.f54255p;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53049q() {
        return this.o;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f54253m = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53046m() {
        return this.f54258s;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f54254n = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f54255p = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof hg ? (hg) oldItem : null) == null) {
            return null;
        }
        hg hgVar = (hg) oldItem;
        boolean z11 = !Intrinsics.f(this.f54247b, hgVar.f54247b);
        boolean z12 = this.f54248c != hgVar.f54248c;
        boolean z29 = !Intrinsics.f(this.d, hgVar.d);
        boolean z31 = !Intrinsics.f(this.e, hgVar.e);
        boolean z41 = !Intrinsics.f(this.f, hgVar.f);
        if (this.f54249g != hgVar.f54249g) {
            z = false;
            z3 = z31;
            z4 = z41;
            z6 = true;
        } else {
            z = false;
            z3 = z31;
            z4 = z41;
            z6 = false;
        }
        return new wc0(z11, z12, z29, z3, z4, z6, false, or0.b.l(this, (qv0.i) oldItem), this.f54251j != hgVar.f54251j ? true : z, this.k != hgVar.k ? true : z, this.f54252l != hgVar.f54252l ? true : z, !Intrinsics.f(this.f54250h, hgVar.f54250h));
    }

    public /* synthetic */ hg(String str, List list, int i, aw0.x4 x4Var, tc0 tc0Var, gg ggVar, boolean z, oc0 oc0Var, Object obj2, boolean z3, boolean z4, rc0 rc0Var, int i2, int i3, int i5, int i6) {
        this(str, list, i, x4Var, tc0Var, ggVar, z, oc0Var, obj2, z3, z4, rc0Var, null, null, null, null, i2, i3, i5, i6, c.d.f249513a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hg(String listId, List items, int i, aw0.x4 heightMode, tc0 tc0Var, gg ggVar, boolean z, boolean z3, pc0 pc0Var, Object obj2, int i2, int i3, int i5, int i6, int i21) {
        tc0 tc0Var2 = (i21 & 16) != 0 ? null : tc0Var;
        gg snapStyle = (i21 & 32) != 0 ? new gg.c(0) : ggVar;
        boolean z4 = (i21 & 64) != 0 ? false : z;
        boolean z6 = (i21 & 256) != 0 ? true : z3;
        rc0 pageTransformation = (i21 & 512) != 0 ? qc0.f165963a : pc0Var;
        Object obj3 = (i21 & 1024) != 0 ? null : obj2;
        int i22 = (i21 & 2048) != 0 ? R$attr.uikit_dp0 : i2;
        int i32 = (i21 & 4096) != 0 ? R$attr.uikit_dp0 : i3;
        int i33 = (i21 & 8192) != 0 ? R$attr.uikit_dp0 : i5;
        int i43 = (i21 & 16384) != 0 ? R$attr.uikit_dp0 : i6;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        Intrinsics.checkNotNullParameter(snapStyle, "snapStyle");
        Intrinsics.checkNotNullParameter(pageTransformation, "pageTransformation");
        this(listId, items, i, heightMode, tc0Var2, snapStyle, z4, nc0.f165491a, obj3, false, z6, pageTransformation, i22, i32, i33, i43);
    }
}
