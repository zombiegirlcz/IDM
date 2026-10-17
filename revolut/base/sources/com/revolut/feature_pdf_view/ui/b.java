package com.revolut.feature_pdf_view.ui;

import g9i.k;
import g9i.n;
import g9i.r;
import g9i.u;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends nri.a implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hk0.a f97466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f97467c;
    public final ifm.b d;
    public final ihm.b e;

    public b(hk0.a networkFileRepository, n state, ifm.b flowDisposable) {
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(flowDisposable, "flowDisposable");
        this.f97466b = networkFileRepository;
        this.f97467c = state;
        this.d = flowDisposable;
        ihm.b bVarE = ihm.b.e(Unit.f186387a);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.e = bVarE;
    }

    @Override // nri.a
    public final void i3() {
        this.d.a(this.e.switchMap(new g48.k(21, new r(this, 1))).subscribe(new g48.k(22, new r(this, 2))));
    }

    public final boolean j3() {
        u uVar = (u) this.f97467c;
        return (uVar.z0().isInitialized() && ((Boolean) uVar.z0().get()).booleanValue()) ? false : true;
    }
}
