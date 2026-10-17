package com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report;

import cli.g;
import cli.y;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import okf.m;
import oki.h;
import ox5.r;
import p7f.i;
import p7f.j;
import p7f.o;
import p7f.q;
import t1j.b;
import vkm.j2;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements j {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f91372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j2 f91373q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f91374r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f91375s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f91376t;

    public a(StrategyReportScreenContract$InputData inputData, b investorUpdateInteractor, x deeplinkHandler, q stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(investorUpdateInteractor, "investorUpdateInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = investorUpdateInteractor;
        this.f91372p = deeplinkHandler;
        this.f91373q = vkm.q.c(inputData.f91370a);
        this.f91374r = new vii.b();
        this.f91375s = d.b(this, new i(null), stateMapper, null, false, 12);
        this.f91376t = e.a(this, new o(this, 0));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f91376t;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, vkm.q.Q(new t38.e(this.f91374r, 24, this.f91373q, new lld.a(3, 1, null)), new m(continuation, this, 18)), null, new r(this, continuation, 14), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f91375s;
    }
}
