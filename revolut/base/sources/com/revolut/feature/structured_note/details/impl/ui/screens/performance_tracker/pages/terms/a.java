package com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms;

import ael.d0;
import cli.y;
import dli.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import v2g.i;
import v5e.d;
import v5e.e;
import v5e.g;
import vkm.j2;
import x4e.k;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b, d {
    public final PerformanceTrackerTermsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x4e.b f88909p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d0 f88910q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f88911r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f88912s;

    public a(PerformanceTrackerTermsControllerContract$InputData inputData, g stateMapper, x4e.b payoutChartWidgetControllerModelExtension, d0 stocksInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(payoutChartWidgetControllerModelExtension, "payoutChartWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        this.o = inputData;
        this.f88909p = payoutChartWidgetControllerModelExtension;
        this.f88910q = stocksInteractor;
        this.f88911r = mra.d.b(this, new e((x4e.d) ((j2) ((k) payoutChartWidgetControllerModelExtension).o.f22677a).getValue(), 2), stateMapper, null, false, 12);
        this.f88912s = hx7.e.a(this, new v48.d(this, 4));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f88912s;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, (j2) ((k) this.f88909p).o.f22677a, null, new v5e.h(this, null, 0), 3);
        l.b1(this, nim.a.v(rd0.e.b(this.f88910q.a(this.o.f88907a, false)), new i(29)), null, new v5e.h(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f88911r;
    }
}
