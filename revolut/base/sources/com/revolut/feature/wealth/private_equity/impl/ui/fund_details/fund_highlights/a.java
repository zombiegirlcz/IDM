package com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fund_highlights;

import ael.d0;
import ael.k;
import c9f.c;
import cge.g;
import cgh.l;
import cgh.n;
import cgh.o;
import cgh.q;
import cgh.t;
import cli.y;
import com.revolut.data.model.Data;
import d1h.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import ybl.b;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements o {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0 f95801p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cgh.b f95802q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f95803r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f95804s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f95805t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(b instrumentTickerInteractor, d0 stocksInteractor, cgh.b dialogProvider, e disclaimersModelExtension, t stateMapper, n inputData) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(disclaimersModelExtension, "disclaimersModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = instrumentTickerInteractor;
        this.f95801p = stocksInteractor;
        this.f95802q = dialogProvider;
        this.f95803r = disclaimersModelExtension;
        this.f95804s = inputData;
        this.f95805t = d.b(this, new l(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new c(this, 15));
    }

    @Override // yji.l
    public final void I1() {
        n nVar = this.f95804s;
        yji.l.a1(this, rd0.e.b(((k) this.o).f(nVar.f23980a)), null, null, new q(this, null, 2), 3);
        yji.l.a1(this, nim.a.v(rd0.e.b(this.f95801p.a(nVar.f23980a, false)), new g(2)), null, null, new q(this, null, 1), 3);
        yji.l.a1(this, ((gah.e) this.f95803r).Z2(u.c(rdh.b.PRIVATE_MARKETS_RISK_WARNING)), null, null, new q(this, null, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f95805t;
    }
}
