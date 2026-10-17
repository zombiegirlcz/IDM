package com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.main;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_insights.flow.PortfolioInsightsFlowContract$InputData;
import cq9.m;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import s9b.n;
import t5e.j;
import t7f.e;
import t7f.i;
import v6l.b0;
import vii.b;
import vkm.q;
import w7f.f;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements e {
    public final PortfolioInsightsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final emc.e f91380p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v7f.e f91381q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f91382r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d1h.e f91383s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f91384t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(m stateMapper, PortfolioInsightsFlowContract$InputData inputData, emc.e templatesInteractor, v7f.e drawdownViewControllerModel, f riskLevelViewControllerModel, d1h.e disclaimersModelExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(drawdownViewControllerModel, "drawdownViewControllerModel");
        Intrinsics.checkNotNullParameter(riskLevelViewControllerModel, "riskLevelViewControllerModel");
        Intrinsics.checkNotNullParameter(disclaimersModelExtension, "disclaimersModelExtension");
        this.o = inputData;
        this.f91380p = templatesInteractor;
        this.f91381q = drawdownViewControllerModel;
        this.f91382r = riskLevelViewControllerModel;
        this.f91383s = disclaimersModelExtension;
        this.f91384t = new b();
        this.u = d.b(this, new t7f.d(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, null, null), stateMapper, null, false, 12);
        this.v = hx7.e.a(this, new j(10));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.f91384t, new n(continuation, this, 23)), null, null, 7);
        l.b1(this, this.f91381q.o.B(new b0(28)), null, new i(this, continuation, 0), 3);
        l.b1(this, this.f91382r.o.B(new w6h.f(6)), null, new i(this, continuation, 1), 3);
        l.b1(this, ((gah.e) this.f91383s).Z2(u.c(rdh.b.STRATEGIES_INSIGHTS_DISCLAIMER)), null, new i(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
