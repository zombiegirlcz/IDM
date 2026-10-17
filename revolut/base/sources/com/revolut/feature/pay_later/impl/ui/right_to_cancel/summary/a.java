package com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import ej9.f0;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import rk9.i;
import rk9.u;
import ti9.l;
import ti9.n;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements rk9.h {
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SummaryControllerContract$InputData f78930p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f78931q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f78932r;

    public a(l interactor, SummaryControllerContract$InputData inputData, u stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f78930p = inputData;
        this.f78931q = d.b(this, new i(new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
        this.f78932r = e.a(this, new r6f.i(this, 28));
    }

    @Override // yji.l
    public final void I1() {
        String facilityId = this.f78930p.f78928a;
        n nVar = (n) this.o;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        f0 f0Var = nVar.f271471b;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, rd0.e.n(f0Var.d.a(new ej9.i(facilityId), loadingStrategy), h0.f322473a), null, null, new rk9.d(this, null, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f78932r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f78931q;
    }
}
