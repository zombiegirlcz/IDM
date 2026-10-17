package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.RewardLoadingDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.sa0;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class pe implements koi.j, qv0.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RewardLoadingDelegate.b f54586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qv0.c f54587c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f54588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f54589h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f54590j;
    public final int k;

    public pe(String listId, RewardLoadingDelegate.b background) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(background, "background");
        int i = R$attr.uikit_dp0;
        this.f54585a = listId;
        this.f54586b = background;
        this.f54587c = c.d.f249513a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f54588g = null;
        this.f54589h = i;
        this.i = i;
        this.f54590j = i;
        this.k = i;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new RewardLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF57029a() {
        return this.f54585a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof pe)) {
            return false;
        }
        pe peVar = (pe) obj2;
        return Intrinsics.f(this.f54585a, peVar.f54585a) && Intrinsics.f(this.f54586b, peVar.f54586b) && Intrinsics.f(this.f54587c, peVar.f54587c) && Intrinsics.f(this.d, peVar.d) && Intrinsics.f(this.e, peVar.e) && Intrinsics.f(this.f, peVar.f) && Intrinsics.f(this.f54588g, peVar.f54588g) && this.f54589h == peVar.f54589h && this.i == peVar.i && this.f54590j == peVar.f54590j && this.k == peVar.k;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: f */
    public final int getF51762q() {
        return this.f54589h;
    }

    @Override // qv0.o
    public final void g(int i) {
        this.f54589h = i;
    }

    public final int hashCode() {
        int i = h30.l.i(this.f54587c, (this.f54586b.hashCode() + (this.f54585a.hashCode() * 31)) * 31, 31);
        p31.c cVar = this.d;
        int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f54588g;
        return Integer.hashCode(this.k) + j6.a.b(this.f54590j, j6.a.b(this.i, j6.a.b(this.f54589h, (iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF() {
        return this.d;
    }

    @Override // qv0.i
    public final void j(qv0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f54587c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF57032g() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: m */
    public final int getF51763r() {
        return this.i;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: n */
    public final int getF51765t() {
        return this.k;
    }

    @Override // qv0.o
    public final void o(int i) {
        this.i = i;
    }

    @Override // qv0.i
    /* JADX INFO: renamed from: p1 */
    public final qv0.c getF51758l() {
        return this.f54587c;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getI() {
        return this.f54588g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF57033h() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // qv0.o
    /* JADX INFO: renamed from: t */
    public final int getF51764s() {
        return this.f54590j;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f54588g = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof pe ? (pe) oldItem : null) == null) {
            return null;
        }
        return new sa0(!Intrinsics.f(this.f54586b, r3.f54586b));
    }

    public /* synthetic */ pe(String str) {
        this(str, RewardLoadingDelegate.b.C0421b.f53199a);
    }
}
