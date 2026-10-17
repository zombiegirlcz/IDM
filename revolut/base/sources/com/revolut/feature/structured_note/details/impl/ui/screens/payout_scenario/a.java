package com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario;

import ael.d0;
import cli.y;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import qm2.c;
import r40.y0;
import r5e.f;
import r5e.g;
import r5e.j;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements g {
    public final PayoutScenarioScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0 f88901p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f88902q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f88903r;

    public a(PayoutScenarioScreenContract$InputData inputData, j mapper, d0 stocksInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        this.o = inputData;
        this.f88901p = stocksInteractor;
        this.f88902q = d.b(this, new f(0), mapper, null, false, 12);
        this.f88903r = e.a(this, new c(this, 29));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f88903r;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, nim.a.v(rd0.e.b(this.f88901p.a(this.o.f88899a, false)), new y0(21)), null, new r5e.e(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f88902q;
    }
}
