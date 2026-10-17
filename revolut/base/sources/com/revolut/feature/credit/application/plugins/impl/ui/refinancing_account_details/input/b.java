package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input;

import c84.a0;
import c84.g;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputFlowContract$Step;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import qki.d;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends a0 implements fh4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RefinancingAccountDetailsInputFlowContract$InputData f68274p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ch4.b f68275q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ay3.a f68276r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f68277s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f68278t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RefinancingAccountDetailsInputFlowContract$InputData inputData, ch4.b bankAccountDetailsNotFoundErrorHandler, ay3.a refinancingAccountDetailsInteractor, g pluginControllerModelExtension) {
        super(pluginControllerModelExtension);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bankAccountDetailsNotFoundErrorHandler, "bankAccountDetailsNotFoundErrorHandler");
        Intrinsics.checkNotNullParameter(refinancingAccountDetailsInteractor, "refinancingAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerModelExtension, "pluginControllerModelExtension");
        this.f68274p = inputData;
        this.f68275q = bankAccountDetailsNotFoundErrorHandler;
        this.f68276r = refinancingAccountDetailsInteractor;
        this.f68277s = e.b(this, new RefinancingAccountDetailsInputFlowContract$State(inputData.f68261b));
        this.f68278t = cp5.d.a(this, new RefinancingAccountDetailsInputFlowContract$Step.InputStep(0), f0.f322471a, new fgj.g(this, 1));
    }

    @Override // qki.e
    public final d getState() {
        return this.f68277s;
    }

    @Override // c84.a0, yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ch4.b bVar = this.f68275q;
        if (!bVar.a(throwable)) {
            return super.o1(throwable);
        }
        y0 y0VarB = bVar.b(throwable);
        if (y0VarB == null) {
            return true;
        }
        X1(y0VarB);
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68278t;
    }
}
