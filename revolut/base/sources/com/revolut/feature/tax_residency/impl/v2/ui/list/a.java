package com.revolut.feature.tax_residency.impl.v2.ui.list;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.tax_residency.impl.v2.models.TaxResidencyFlowContext;
import joe.o;
import jpe.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lpe.e;
import oki.h;
import rp0.l0;
import umd.n;
import upe.g;
import upe.m;
import upe.q;
import upe.r;
import upe.t;
import w4l.i;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements m {
    public final TaxResidencyListScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f90269p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f90270q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l0 f90271r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f90272s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f90273t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(r stateMapper, TaxResidencyListScreenContract$InputData inputData, d taxResidencyInteractor, t taxResidencyRowActionsProvider, l0 popupMenuDialogDisplayer, e dialogProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(taxResidencyInteractor, "taxResidencyInteractor");
        Intrinsics.checkNotNullParameter(taxResidencyRowActionsProvider, "taxResidencyRowActionsProvider");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.o = inputData;
        this.f90269p = taxResidencyInteractor;
        this.f90270q = taxResidencyRowActionsProvider;
        this.f90271r = popupMenuDialogDisplayer;
        this.f90272s = dialogProvider;
        this.f90273t = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new n(this, 9));
    }

    @Override // yji.l
    public final void I1() {
        TaxResidencyFlowContext flowContext = this.o.f90264b;
        d dVar = this.f90269p;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
        o oVar = (o) dVar.f177266a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(flowContext, "flowContext");
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        l.a1(this, oVar.i.b(flowContext, loadingStrategy), null, null, new q(this, continuation, 0), 3);
        l.a1(this, rd0.e.b(this.f90271r.f256113c), null, null, new q(this, continuation, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f90273t;
    }
}
