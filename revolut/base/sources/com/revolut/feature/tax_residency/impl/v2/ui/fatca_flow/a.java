package com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow;

import com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow.FatcaFlowContract$Step;
import jpe.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l10.m;
import oki.h;
import su0.c;
import tb4.t;
import tp8.l;
import tpe.b;
import tpe.i;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final FatcaFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f90258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f90259q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lpe.d f90260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a61.a f90261s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t f90262t;
    public final yki.a u;

    public a(FatcaFlowContract$InputData inputData, i fatcaQuestionScreenProvider, d taxResidencyInteractor, lpe.d dialogProvider, a61.a errorParser, t idempotencyKeyManager) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(fatcaQuestionScreenProvider, "fatcaQuestionScreenProvider");
        Intrinsics.checkNotNullParameter(taxResidencyInteractor, "taxResidencyInteractor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(errorParser, "errorParser");
        Intrinsics.checkNotNullParameter(idempotencyKeyManager, "idempotencyKeyManager");
        this.o = inputData;
        this.f90258p = fatcaQuestionScreenProvider;
        this.f90259q = taxResidencyInteractor;
        this.f90260r = dialogProvider;
        this.f90261s = errorParser;
        this.f90262t = idempotencyKeyManager;
        this.u = cp5.d.a(this, inputData.f90251a ? FatcaFlowContract$Step.FatcaQuestion.f90256a : new FatcaFlowContract$Step.TinInput(inputData.f90255h), f0.f322471a, new l(this, 1));
    }

    public final void I2(boolean z, Function0 function0) {
        Boolean boolValueOf = Boolean.valueOf(z);
        t tVar = this.f90262t;
        if (!boolValueOf.equals((Boolean) tVar.f269457c)) {
            tVar.f269457c = Boolean.valueOf(z);
            ((wj0.a) tVar.f269456b).a("tax_self_certification_submit");
        }
        l2(new m(this, function0, z, (Continuation) null, 25), new c(1, this, a.class, "handleSubmissionError", "handleSubmissionError(Ljava/lang/Throwable;)Z", 0, 20));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
