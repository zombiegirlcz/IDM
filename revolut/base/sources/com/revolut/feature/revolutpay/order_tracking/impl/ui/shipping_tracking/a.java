package com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking;

import cli.y;
import hx7.e;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import q9c.v;
import r6f.i;
import rbc.g;
import rbc.o;
import rbc.q;
import rp0.l0;
import ukm.f;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements o {
    public final ShippingTrackingScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rbc.a f84635p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l0 f84636q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c70.a f84637r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f84638s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f84639t;
    public final y u;

    public a(ShippingTrackingScreenContract$InputData inputData, rbc.a popUpMenuProvider, l0 popupMenuDialogDisplayer, c70.a clipboard, q stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(popUpMenuProvider, "popUpMenuProvider");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f84635p = popUpMenuProvider;
        this.f84636q = popupMenuDialogDisplayer;
        this.f84637r = clipboard;
        this.f84638s = e.a(this, new i(this, 11));
        z1 z1VarB = vkm.q.b(0, 2, f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f84639t = z1VarB;
        this.u = d.b(this, new g(inputData.f84632b, false), stateMapper, null, false, 12);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f84638s;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, rd0.e.b(this.f84636q.f256113c), null, new v(2, this, a.class, "onPopupMenuItemClicked", "onPopupMenuItemClicked(Lcom/revolut/core/ui_kit/models/popup/PopupMenuItem;)V", 4, 11), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
