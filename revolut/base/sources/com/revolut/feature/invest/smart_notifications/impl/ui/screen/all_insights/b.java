package com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights;

import cli.y;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oih.j;
import oki.h;
import sx2.r;
import szb.g;
import t18.p;
import t18.q;
import t18.u;
import t18.w;
import yji.l;
import z0h.d;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements p {
    public final AllInsightsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t18.h f76433p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f76434q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q18.h f76435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f76436s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y08.a f76437t;
    public final j u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f76438w;

    public b(u stateMapper, AllInsightsScreenContract$InputData inputData, t18.h pagingSource, w insightsGrouper, q18.h destinationProvider, d dataProvider, y08.a compliancePopupModelExtension, j stocksAccountCommandProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(insightsGrouper, "insightsGrouper");
        Intrinsics.checkNotNullParameter(destinationProvider, "destinationProvider");
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        Intrinsics.checkNotNullParameter(compliancePopupModelExtension, "compliancePopupModelExtension");
        Intrinsics.checkNotNullParameter(stocksAccountCommandProvider, "stocksAccountCommandProvider");
        this.o = inputData;
        this.f76433p = pagingSource;
        this.f76434q = insightsGrouper;
        this.f76435r = destinationProvider;
        this.f76436s = dataProvider;
        this.f76437t = compliancePopupModelExtension;
        this.u = stocksAccountCommandProvider;
        this.v = mra.d.b(this, new q(6, inputData.f76427a.getF76423a()), stateMapper, null, false, 12);
        this.f76438w = e.a(this, new suf.a(this, 16));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, nim.a.u(new r(this, continuation, 4), this.f76433p.j(250L)), null, null, new t18.a(this, null, 1), 3);
        l2(new t18.b(this, continuation, 1), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f76438w;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, nim.a.v(this.f76436s.w0(), new g(19)), null, new t18.a(this, null, 0), 3);
        n2(new t18.b(this, null, 3), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
