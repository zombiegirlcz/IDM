package com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund;

import at.r;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import dwi.k;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import om4.m1;
import or4.i;
import oyi.e;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends h implements e {
    public final oyi.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f99140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final oyi.a f99141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f99142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f99143s;

    public c(oyi.c inputData, k interactor, oyi.a dialogBuilder, r stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(dialogBuilder, "dialogBuilder");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f99140p = interactor;
        this.f99141q = dialogBuilder;
        this.f99142r = d.b(this, new oyi.b(new Data(null, null, true, 3, null), inputData.f231042b), stateMapper, null, false, 12);
        this.f99143s = hx7.e.a(this, new i(this, 16));
    }

    @Override // yji.l
    public final void I1() {
        l2(new oyi.i(this, null, 0), new m1(1, this, c.class, "handleLoadRefundBreakdown", "handleLoadRefundBreakdown(Ljava/lang/Throwable;)Z", 0, 10));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f99143s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f99142r;
    }
}
