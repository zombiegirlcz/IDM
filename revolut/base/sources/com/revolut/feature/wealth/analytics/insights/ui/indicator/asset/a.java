package com.revolut.feature.wealth.analytics.insights.ui.indicator.asset;

import bw4.s;
import bxg.f;
import bxg.j;
import bxg.x;
import cli.g;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import hx7.e;
import jul.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vii.b;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements f {
    public final AnalyticsProduct o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PortfolioInsightsAssetIndicatorControllerContract$InputData f95026p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f95027q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wwg.a f95028r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f95029s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f95030t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(x stateMapper, j saveStateDelegate, AnalyticsProduct analyticsProduct, PortfolioInsightsAssetIndicatorControllerContract$InputData inputData, o portfolioInsightsInteractor, wwg.a infoBottomSheetFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(portfolioInsightsInteractor, "portfolioInsightsInteractor");
        Intrinsics.checkNotNullParameter(infoBottomSheetFactory, "infoBottomSheetFactory");
        this.o = analyticsProduct;
        this.f95026p = inputData;
        this.f95027q = portfolioInsightsInteractor;
        this.f95028r = infoBottomSheetFactory;
        this.f95029s = new b();
        this.f95030t = d.b(this, new bxg.h(null, null), stateMapper, saveStateDelegate, false, 8);
        this.u = e.a(this, new bwd.a(this, 4));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, c6d.b.i(q.Q(this.f95029s, new s(continuation, this, 2)), new bq7.j(this, 25)), null, null, new btd.e(this, continuation, 18), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f95030t;
    }
}
