package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_resources.R$attr;
import ip0.ya0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class te implements qv0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f54776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f54777c;
    public int d;
    public int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f54778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f54779h;
    public p31.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p31.c f54780j;
    public p31.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qv0.c f54781l;

    public te(String listId, List rewards, int i) {
        boolean z = (i & 4) != 0;
        int i2 = R$attr.uikit_dp8;
        int i3 = R$attr.uikit_dp16;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        this.f54775a = listId;
        this.f54776b = rewards;
        this.f54777c = z;
        this.d = i2;
        this.e = i2;
        this.f = i3;
        this.f54778g = i3;
        this.f54781l = new c.e((qv0.h) null, 3);
    }

    @Override // koi.j
    public final koi.k T1() {
        return new RewardsGridDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59201a() {
        return this.f54775a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof te)) {
            return false;
        }
        te teVar = (te) obj2;
        return Intrinsics.f(this.f54775a, teVar.f54775a) && Intrinsics.f(this.f54776b, teVar.f54776b) && this.f54777c == teVar.f54777c && this.d == teVar.d && this.e == teVar.e && this.f == teVar.f && this.f54778g == teVar.f54778g;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getO() {
        return this.d;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.d = i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54778g) + j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, j6.a.c(p.a.d(this.f54775a.hashCode() * 31, 31, this.f54776b), 31, this.f54777c), 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getK() {
        return this.k;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f54781l = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF52330l() {
        return this.f54779h;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.i = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF52333p() {
        return this.e;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF52335r() {
        return this.f54778g;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.e = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF52329j() {
        return this.f54781l;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF52332n() {
        return this.f54780j;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF52331m() {
        return this.i;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.k = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF52334q() {
        return this.f;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f54779h = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f54780j = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof te ? (te) oldItem : null) == null) {
            return null;
        }
        return new ya0(!Intrinsics.f(r0.f54776b, this.f54776b), ((te) oldItem).f54777c != this.f54777c, or0.b.l((qv0.i) oldItem, this));
    }
}
