package com.revolut.core.ui_kit.internal.views.floatingbottombar;

import qv0.n;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements koi.j, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p31.c f57059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p31.c f57060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p31.c f57061c;
    public p31.c d;

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53082a() {
        return "dividerListId";
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof b);
    }

    public final int hashCode() {
        return 593203922;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getO() {
        return this.f57059a;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51599p() {
        return this.f57060b;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f57061c = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getF51601r() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51600q() {
        return this.f57061c;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.f57059a = cVar;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f57060b = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.d = cVar;
    }
}
