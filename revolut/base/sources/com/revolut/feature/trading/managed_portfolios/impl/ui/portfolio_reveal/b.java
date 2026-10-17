package com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal;

import b8f.t;
import b8f.v;
import cli.g;
import cli.y;
import d1h.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements v {
    public final PortfolioRevealScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f91433p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f91434q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f91435r;

    public b(PortfolioRevealScreenContract$InputData inputData, e remoteDisclaimersExtension, b8f.y stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(remoteDisclaimersExtension, "remoteDisclaimersExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f91433p = remoteDisclaimersExtension;
        this.f91434q = d.b(this, new t(null), stateMapper, null, false, 12);
        this.f91435r = hx7.e.a(this, new b6d.a(18));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f91435r;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, ((gah.e) this.f91433p).Z2(u.c(rdh.b.STRATEGIES_ONBOARDING_DISCLAIMER)), null, new b74.e(this, null, 6), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f91434q;
    }
}
