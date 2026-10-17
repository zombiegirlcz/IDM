package com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark;

import cli.g;
import cli.y;
import emc.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import x4l.c;
import x64.b;
import x6f.f;
import x6f.i;
import x6f.k;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements i {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ManagedPortfolioBenchmarkScreenContract$InputData f91330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f91331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f91332r;

    public a(e templatesInteractor, ManagedPortfolioBenchmarkScreenContract$InputData inputData, k stateMapper) {
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = templatesInteractor;
        this.f91330p = inputData;
        this.f91331q = d.b(this, new f(0), stateMapper, null, false, 12);
        this.f91332r = hx7.e.a(this, new x48.a(6));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f91332r;
    }

    @Override // yji.l
    public final void T1(long j2) {
        String templateId = this.f91330p.f91327a;
        e eVar = this.o;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        b9k.f fVar = eVar.f127649a;
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        l.b1(this, ((c) fVar.f13819g).b(templateId, w4l.h.f294642c), null, new b(this, null, 2), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f91331q;
    }
}
