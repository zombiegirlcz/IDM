package com.revolut.trading.orders.ui.flows.trading_asset_details;

import bhi.c;
import btd.e;
import btl.d;
import btl.f;
import cli.g;
import cli.y;
import com.revolut.trading.orders.ui.flows.trading_asset_details.RecurringBuyAssetDetailsFlowContract$Step;
import kdh.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements d {
    public final RecurringBuyAssetDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f106824p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gdh.a f106825q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d4h.b f106826r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f106827s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f106828t;

    public a(f stateMapper, RecurringBuyAssetDetailsFlowContract$InputData inputData, b instrumentActionsInteractor, gdh.a navigationExtension, d4h.b actionsToActionPanelStateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instrumentActionsInteractor, "instrumentActionsInteractor");
        Intrinsics.checkNotNullParameter(navigationExtension, "navigationExtension");
        Intrinsics.checkNotNullParameter(actionsToActionPanelStateMapper, "actionsToActionPanelStateMapper");
        this.o = inputData;
        this.f106824p = instrumentActionsInteractor;
        this.f106825q = navigationExtension;
        this.f106826r = actionsToActionPanelStateMapper;
        c cVar = new c(this, 24);
        this.f106827s = cp5.d.a(this, RecurringBuyAssetDetailsFlowContract$Step.DefaultStep.f106823a, f0.f322471a, cVar);
        this.f106828t = mra.d.b(this, new btl.c(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, b.b0(this.f106824p, this.o.f106822a, 4), null, new e(this, null, 4), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f106828t;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f106827s;
    }
}
