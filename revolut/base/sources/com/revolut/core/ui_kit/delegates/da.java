package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.OrderBookItemDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.rz;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class da implements qv0.i, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OrderBookItemDelegate.a f54026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f54027c;
    public qv0.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f54028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f54029h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f54030j;
    public final int k;

    public da(String listId, OrderBookItemDelegate.a priceData, ewk.a aVar) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(priceData, "priceData");
        int i = R$attr.uikit_dp2;
        int i2 = R$attr.uikit_dp8;
        this.f54025a = listId;
        this.f54026b = priceData;
        this.f54027c = aVar;
        this.d = c.d.f249513a;
        this.e = null;
        this.f = null;
        this.f54028g = null;
        this.f54029h = null;
        this.i = i;
        this.f54030j = i2;
        this.k = i2;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new OrderBookItemDelegate();
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getI() {
        return this.f54027c;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59198a() {
        return this.f54025a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof da)) {
            return false;
        }
        da daVar = (da) obj2;
        return Intrinsics.f(this.f54025a, daVar.f54025a) && Intrinsics.f(this.f54026b, daVar.f54026b) && Intrinsics.f(this.f54027c, daVar.f54027c) && Intrinsics.f(this.d, daVar.d) && Intrinsics.f(this.e, daVar.e) && Intrinsics.f(this.f, daVar.f) && Intrinsics.f(this.f54028g, daVar.f54028g) && Intrinsics.f(this.f54029h, daVar.f54029h) && this.i == daVar.i && this.f54030j == daVar.f54030j && this.k == daVar.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF52982p() {
        return this.i;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.i = i;
    }

    public final int hashCode() {
        int iHashCode = (this.f54026b.hashCode() + (this.f54025a.hashCode() * 31)) * 31;
        Object obj2 = this.f54027c;
        int i = h30.l.i(this.d, (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31);
        p31.c cVar = this.e;
        int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f54028g;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f54029h;
        return Integer.hashCode(this.k) + j6.a.b(this.f54030j, j6.a.b(this.i, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF52979l() {
        return this.e;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.d = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52980m() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f54028g = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52983q() {
        qv0.c cVar = this.d;
        return ((cVar instanceof c.a) || (cVar instanceof c.e)) ? R$attr.uikit_dp16 : R$attr.uikit_dp2;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52985s() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getK() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f54029h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52981n() {
        return this.f54028g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52984r() {
        return this.f54030j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f54029h = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof da)) {
            return null;
        }
        da daVar = (da) oldItem;
        return new rz(!Intrinsics.f(this.f54026b, daVar.f54026b), !Intrinsics.f(this.f54027c, daVar.f54027c), or0.b.l(this, (qv0.i) oldItem));
    }
}
