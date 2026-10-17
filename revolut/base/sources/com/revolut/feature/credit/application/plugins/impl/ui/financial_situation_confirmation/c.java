package com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.FinancialSituationConfirmationFlowContract$Step;
import cp5.d;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends t implements xb4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ix3.a f67759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final FinancialSituationConfirmationFlowContract$InputData f67760q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f67761r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ix3.a interactor, FinancialSituationConfirmationFlowContract$InputData inputData, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67759p = interactor;
        this.f67760q = inputData;
        x2g.b bVar = new x2g.b(this, 15);
        this.f67761r = d.a(this, FinancialSituationConfirmationFlowContract$Step.Initial.f67756a, f0.f322471a, bVar);
    }

    @Override // yji.l
    public final void I1() {
        l2(new xb4.e(this, null, 0), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67761r;
    }
}
