package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import dsd.f;
import frd.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import r10.t;
import ufm.d;
import vkm.j2;
import vkm.q;
import vkm.t0;
import vkm.z1;
import wli.x;
import wsg.n;
import yji.l;
import zjh.j;
import zr2.o;
import zrd.b;
import zrd.r;
import zrd.v;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b {
    public final j2 A;
    public final j2 B;
    public final TotalWealthContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f88021p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dsd.i f88022q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f88023r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f88024s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final lmd.a f88025t;
    public final t u;
    public final f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x f88026w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j f88027x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f88028y;
    public final z1 z;

    public a(cli.n stateMapper, TotalWealthContract$InputData inputData, i totalWealthEventRouter, dsd.i totalWealthGroupsProvider, d juniorNetWorthGroupProvider, n walletInteractor, lmd.a analyticsInteractor, t balanceHistoryProvider, f balanceSourceMapper, x deeplinkHandler, j totalWealthLegalEntityProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(totalWealthEventRouter, "totalWealthEventRouter");
        Intrinsics.checkNotNullParameter(totalWealthGroupsProvider, "totalWealthGroupsProvider");
        Intrinsics.checkNotNullParameter(juniorNetWorthGroupProvider, "juniorNetWorthGroupProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(balanceHistoryProvider, "balanceHistoryProvider");
        Intrinsics.checkNotNullParameter(balanceSourceMapper, "balanceSourceMapper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(totalWealthLegalEntityProvider, "totalWealthLegalEntityProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f88021p = totalWealthEventRouter;
        this.f88022q = totalWealthGroupsProvider;
        this.f88023r = juniorNetWorthGroupProvider;
        this.f88024s = walletInteractor;
        this.f88025t = analyticsInteractor;
        this.u = balanceHistoryProvider;
        this.v = balanceSourceMapper;
        this.f88026w = deeplinkHandler;
        this.f88027x = totalWealthLegalEntityProvider;
        amd.a aVar = inputData.d;
        if (aVar == null) {
            aVar = ((jte.d) featureToggleInteractor).c(AnalyticsFeatureApi$Toggles.AnalyticsNewTotalWealthWidget.f87387c) ? amd.a.MONTH : amd.a.YEAR;
        }
        this.f88028y = mra.d.b(this, new zrd.a(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), inputData.f88016a, inputData.f88018c, aVar, -1, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.z = z1VarB;
        this.A = q.c(aVar);
        this.B = q.c(inputData.f88018c);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.z, new r(1, this, continuation)), null, new v(0, this, continuation), 3);
        l.b1(this, q.q(q.Q(new t0(this.f88028y.B(new o(5)), 1), new r(2, this, continuation))), null, new v(1, this, continuation), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f88028y;
    }
}
