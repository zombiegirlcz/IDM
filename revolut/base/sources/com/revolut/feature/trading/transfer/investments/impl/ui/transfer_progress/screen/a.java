package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.screen;

import cli.y;
import h1h.b;
import hbf.c0;
import hbf.i;
import hbf.n;
import hbf.t;
import hbf.v;
import hbf.w;
import hx7.e;
import ip0.v7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import o9f.g;
import oki.h;
import prk.o;
import vii.c;
import vkm.q;
import vkm.t0;
import ybl.k;
import ybl.l;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements n {
    public final TransferProgressScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f91655p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f91656q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f91657r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hbf.a f91658s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f91659t;
    public final c u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f91660w;

    public a(c0 stateMapper, TransferProgressScreenContract$InputData inputData, g transferProgressInteractor, k tradingAccountsInteractor, l tradingConfigInteractor, hbf.a modalProvider, b transactionsWidgetControllerModelExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transferProgressInteractor, "transferProgressInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(modalProvider, "modalProvider");
        Intrinsics.checkNotNullParameter(transactionsWidgetControllerModelExtension, "transactionsWidgetControllerModelExtension");
        this.o = inputData;
        this.f91655p = transferProgressInteractor;
        this.f91656q = tradingAccountsInteractor;
        this.f91657r = tradingConfigInteractor;
        this.f91658s = modalProvider;
        this.f91659t = transactionsWidgetControllerModelExtension;
        this.u = new c();
        this.v = d.b(this, new i(0), stateMapper, null, false, 12);
        this.f91660w = e.a(this, new h1c.c(this, 24));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f91660w;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Unit unit = Unit.f186387a;
        c cVar = this.u;
        w4l.h hVar = w4l.h.f294642c;
        Continuation continuation = null;
        yji.l.b1(this, o.w("TransferProgressScreenModel", "observeTransferRequest", q.Q(cVar.a(unit, hVar), new w(1, this, continuation))), null, new v(3, this, continuation), 3);
        hb4.k kVar = new hb4.k(3);
        y yVar = this.v;
        yji.l.b1(this, v7.y("TransferProgressScreenModel", "observeTradingAccount", xam.a.h(new v(0, this, continuation), new t0(yVar.B(kVar), 1))), null, new v(1, this, continuation), 3);
        yji.l.b1(this, q.Q(cVar.a(unit, hVar), new w(0, this, continuation)), null, new v(2, this, continuation), 3);
        yji.l.b1(this, this.f91659t.d3(c6d.b.i(new t0(yVar.B(new hb4.k(4)), 1), new t(this, 1)), true), null, new v(4, this, continuation), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
