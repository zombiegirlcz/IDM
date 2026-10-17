package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v implements qv0.n, koi.j, qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ip0.i0 f54837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ip0.i0 f54838c;
    public final ip0.k0 d;
    public final boolean e;
    public final xi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xi0.b f54839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ip0.n0 f54840h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f54841j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p31.c f54842l;

    public v(String listId, ip0.i0 amount1, ip0.i0 amount2, ip0.k0 direction, boolean z, xi0.b firstCurrency, xi0.b secondCurrency, ip0.n0 style) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(amount1, "amount1");
        Intrinsics.checkNotNullParameter(amount2, "amount2");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(firstCurrency, "firstCurrency");
        Intrinsics.checkNotNullParameter(secondCurrency, "secondCurrency");
        Intrinsics.checkNotNullParameter(style, "style");
        sq0.m mVar = new sq0.m(R$attr.uikit_dp8);
        sq0.b bVar = new sq0.b(R$attr.uikit_dp8);
        sq0.l lVar = new sq0.l(R$attr.uikit_dp16);
        sq0.h hVar = new sq0.h(R$attr.uikit_dp16);
        this.f54836a = listId;
        this.f54837b = amount1;
        this.f54838c = amount2;
        this.d = direction;
        this.e = z;
        this.f = firstCurrency;
        this.f54839g = secondCurrency;
        this.f54840h = style;
        this.i = mVar;
        this.f54841j = bVar;
        this.k = lVar;
        this.f54842l = hVar;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new AmountDualEditDelegate(null);
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getK() {
        return null;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51573a() {
        return this.f54836a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f54836a, vVar.f54836a) && Intrinsics.f(this.f54837b, vVar.f54837b) && Intrinsics.f(this.f54838c, vVar.f54838c) && this.d == vVar.d && this.e == vVar.e && Intrinsics.f(this.f, vVar.f) && Intrinsics.f(this.f54839g, vVar.f54839g) && this.f54840h == vVar.f54840h && Intrinsics.f(this.i, vVar.i) && Intrinsics.f(this.f54841j, vVar.f54841j) && Intrinsics.f(this.k, vVar.k) && Intrinsics.f(this.f54842l, vVar.f54842l);
    }

    public final int hashCode() {
        int iHashCode = (this.f54840h.hashCode() + h30.l.j(this.f54839g, h30.l.j(this.f, j6.a.c((this.d.hashCode() + ((this.f54838c.hashCode() + ((this.f54837b.hashCode() + (this.f54836a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31), 31)) * 961;
        p31.c cVar = this.i;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f54841j;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.k;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f54842l;
        return iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51581n() {
        return this.i;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getO() {
        return this.f54841j;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f54842l = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51583q() {
        return this.k;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51582p() {
        return this.f54842l;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.i = cVar;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f54841j = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.k = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        ip0.i0 i0Var;
        boolean z;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        v vVar = oldItem instanceof v ? (v) oldItem : null;
        if (vVar == null) {
            return null;
        }
        v vVar2 = (v) oldItem;
        ip0.i0 i0Var2 = vVar2.f54837b;
        ip0.i0 i0Var3 = vVar2.f54838c;
        ip0.i0 i0Var4 = this.f54837b;
        ip0.j0 j0VarA = i0Var4.a(i0Var2);
        Intrinsics.i(j0VarA, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.AmountDualEditDelegate.AmountEditPayload");
        ip0.i0 i0Var5 = this.f54838c;
        ip0.j0 j0VarA2 = i0Var5.a(i0Var3);
        Intrinsics.i(j0VarA2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.AmountDualEditDelegate.AmountEditPayload");
        boolean z6 = false;
        boolean z11 = vVar.d != this.d;
        boolean z12 = !Intrinsics.f(vVar.f, this.f);
        boolean z29 = !Intrinsics.f(vVar.f54839g, this.f54839g);
        if (vVar.e != this.e) {
            i0Var = i0Var5;
            z = z12;
            z3 = true;
        } else {
            i0Var = i0Var5;
            z = z12;
            z3 = false;
        }
        if (Intrinsics.f(vVar2.f54837b.f164615a, i0Var.f164615a) && Intrinsics.f(i0Var3.f164615a, i0Var4.f164615a)) {
            z4 = false;
            z6 = true;
        } else {
            z4 = false;
        }
        return new ip0.m0(j0VarA, j0VarA2, z11, z, z29, z3, z6, vVar.f54840h == this.f54840h ? z4 : true);
    }
}
