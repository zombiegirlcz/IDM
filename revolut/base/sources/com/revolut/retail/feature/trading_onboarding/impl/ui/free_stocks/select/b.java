package com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select;

import cli.g;
import cli.y;
import dz6.n;
import eul.f;
import ezk.d;
import hx7.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import twg.c;
import vkm.q;
import ybl.l;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends h implements ezk.b {
    public final fzk.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f104168p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final usc.a f104169q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f104170r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f104171s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ybl.b f104172t;
    public final vii.c u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f104173w;

    public b(d stateMapper, fzk.a freeStocksTermsAndConditionsControllerProvider, c instrumentsInteractor, usc.a freeStocksInteractor, l tradingConfigInteractor, gte.a featureToggleInteractor, ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(freeStocksTermsAndConditionsControllerProvider, "freeStocksTermsAndConditionsControllerProvider");
        Intrinsics.checkNotNullParameter(instrumentsInteractor, "instrumentsInteractor");
        Intrinsics.checkNotNullParameter(freeStocksInteractor, "freeStocksInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.o = freeStocksTermsAndConditionsControllerProvider;
        this.f104168p = instrumentsInteractor;
        this.f104169q = freeStocksInteractor;
        this.f104170r = tradingConfigInteractor;
        this.f104171s = featureToggleInteractor;
        this.f104172t = instrumentTickerInteractor;
        this.u = new vii.c();
        this.v = mra.d.b(this, new ezk.a(0), stateMapper, null, false, 12);
        this.f104173w = e.a(this, new f(this, 11));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.u.a(Unit.f186387a, w4l.h.f294642c), new n(continuation, this, 24)), null, null, new ew1.d(this, continuation, 16), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f104173w;
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
