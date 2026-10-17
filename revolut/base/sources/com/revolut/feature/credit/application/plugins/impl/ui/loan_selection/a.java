package com.revolut.feature.credit.application.plugins.impl.ui.loan_selection;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.LoanSelectionFlowContract$Step;
import cp5.d;
import e84.e;
import k3k.k;
import kotlin.jvm.internal.Intrinsics;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements kd4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LoanSelectionFlowContract$InputData f67884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mx3.a f67885q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f67886r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LoanSelectionFlowContract$InputData inputData, mx3.a interactor, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67884p = inputData;
        this.f67885q = interactor;
        k kVar = new k(this, 20);
        this.f67886r = d.a(this, LoanSelectionFlowContract$Step.SelectLoan.f67883a, f0.f322471a, kVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f67886r;
    }
}
