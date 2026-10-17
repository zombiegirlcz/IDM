package com.revolut.core.ui_kit.delegates;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b1 implements koi.j, qv0.n, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p31.c f53702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f53703c;
    public p31.c d;
    public p31.c e;

    public b1(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f53701a = listId;
        this.f53702b = null;
        this.f53703c = null;
        this.d = null;
        this.e = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new AttributeWideLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51684a() {
        return this.f53701a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f53701a, b1Var.f53701a) && Intrinsics.f(this.f53702b, b1Var.f53702b) && Intrinsics.f(this.f53703c, b1Var.f53703c) && Intrinsics.f(this.d, b1Var.d) && Intrinsics.f(this.e, b1Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f53701a.hashCode() * 961;
        p31.c cVar = this.f53702b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f53703c;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.d;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.e;
        return iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getI() {
        return this.f53702b;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51689j() {
        return this.f53703c;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.d = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51690l() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getK() {
        return this.d;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f53702b = cVar;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f53703c = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.e = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof b1 ? (b1) oldItem : null) != null) {
            return new ip0.x1(!true);
        }
        return null;
    }
}
