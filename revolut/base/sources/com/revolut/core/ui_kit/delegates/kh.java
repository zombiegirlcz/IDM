package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.dh;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.yg0;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class kh implements qv0.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dh f54389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54390c;
    public int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qv0.c f54391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f54392h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f54393j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qv0.k f54394l;

    public kh(String listId) {
        int i = R$attr.uikit_dp0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        dh.b columnsWidthsMode = dh.b.f54054a;
        Intrinsics.checkNotNullParameter(columnsWidthsMode, "columnsWidthsMode");
        qv0.k kVar = qv0.k.OutOfGroup;
        this.f54388a = listId;
        this.f54389b = columnsWidthsMode;
        this.f54390c = i;
        this.d = i;
        this.e = i;
        this.f = i;
        this.f54391g = c.d.f249513a;
        this.f54392h = null;
        this.i = null;
        this.f54393j = null;
        this.k = null;
        this.f54394l = kVar;
    }

    @Override // qv0.l
    /* JADX INFO: renamed from: C1 */
    public final boolean getE() {
        return false;
    }

    @Override // qv0.l
    public final void R0(qv0.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f54394l = kVar;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new SplitColumnCellLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getD() {
        return this.f54388a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof kh)) {
            return false;
        }
        kh khVar = (kh) obj2;
        return Intrinsics.f(this.f54388a, khVar.f54388a) && Intrinsics.f(this.f54389b, khVar.f54389b) && this.f54390c == khVar.f54390c && this.d == khVar.d && this.e == khVar.e && this.f == khVar.f && Intrinsics.f(this.f54391g, khVar.f54391g) && Intrinsics.f(this.f54392h, khVar.f54392h) && Intrinsics.f(this.i, khVar.i) && Intrinsics.f(this.f54393j, khVar.f54393j) && Intrinsics.f(this.k, khVar.k) && this.f54394l == khVar.f54394l;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF53013j() {
        return this.f54390c;
    }

    @Override // qv0.l
    /* JADX INFO: renamed from: f0 */
    public final qv0.k getU() {
        return this.f54394l;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f54390c = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f54391g, j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f54390c, (this.f54389b.hashCode() + (this.f54388a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31);
        p31.c cVar = this.f54392h;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.i;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f54393j;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.k;
        return this.f54394l.hashCode() + ((iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53018q() {
        return this.f54392h;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f54391g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53019r() {
        return this.i;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f54393j = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getK() {
        return this.d;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF53015m() {
        return this.f;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.d = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF53017p() {
        return this.f54391g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF53021t() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF53020s() {
        return this.f54393j;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f54392h = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF53014l() {
        return this.e;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.k = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof kh ? (kh) oldItem : null) != null) {
            return new yg0(!Intrinsics.f(((kh) oldItem).f54389b, this.f54389b), or0.b.m(this, (qv0.l) oldItem));
        }
        return null;
    }
}
