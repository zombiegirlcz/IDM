package com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.order_tracking.api.declaration.RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayTrackingWidget;
import jkh.g;
import kac.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import lbc.c0;
import lbc.m;
import lbc.s;
import nbc.c;
import oki.h;
import rp0.l0;
import tul.b;
import ukm.f;
import vkm.q;
import vkm.z1;
import wac.d;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements s {
    public final OrderDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f84623p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l0 f84624q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f84625r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f84626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ryc.a f84627t;
    public final lsh.b u;
    public final c70.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f84628w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f84629x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f84630y;
    public final z1 z;

    public a(OrderDetailsScreenContract$InputData inputData, c popUpMenuMapper, l0 popupMenuDialogDisplayer, b trackingInteractor, d widgetTipInteractor, ryc.a transactionInteractor, gte.a featureToggleInteractor, lsh.b widgetCarouselFlowProvider, c70.a clipboard, e flightBookingUiMapper, c0 stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(popUpMenuMapper, "popUpMenuMapper");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(trackingInteractor, "trackingInteractor");
        Intrinsics.checkNotNullParameter(widgetTipInteractor, "widgetTipInteractor");
        Intrinsics.checkNotNullParameter(transactionInteractor, "transactionInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(widgetCarouselFlowProvider, "widgetCarouselFlowProvider");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(flightBookingUiMapper, "flightBookingUiMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f84623p = popUpMenuMapper;
        this.f84624q = popupMenuDialogDisplayer;
        this.f84625r = trackingInteractor;
        this.f84626s = widgetTipInteractor;
        this.f84627t = transactionInteractor;
        this.u = widgetCarouselFlowProvider;
        this.v = clipboard;
        this.f84628w = flightBookingUiMapper;
        this.f84629x = hx7.e.a(this, new v(this, 28));
        this.f84630y = mra.d.b(this, new m(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), h0.f322473a, ((jte.d) featureToggleInteractor).c(RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayTrackingWidget.f84601c), false), stateMapper, null, false, 12);
        z1 z1VarB = q.b(0, 2, f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.z = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        lbc.y yVar = new lbc.y(0, this, continuation);
        z1 z1Var = this.z;
        l.a1(this, q.Q(z1Var, yVar), null, null, new jl6.b(2, this, a.class, "updatedOrderDetails", "updatedOrderDetails(Lcom/revolut/data/model/Data;)V", 4, 20), 3);
        l.a1(this, q.Q(z1Var, new lbc.y(1, this, continuation)), null, null, new g(this, continuation, 6), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f84629x;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, rd0.e.b(this.f84624q.f256113c), null, new jl6.b(2, this, a.class, "onPopupMenuItemClicked", "onPopupMenuItemClicked(Lcom/revolut/core/ui_kit/models/popup/PopupMenuItem;)V", 4, 21), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f84630y;
    }
}
