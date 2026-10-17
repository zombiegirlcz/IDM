package com.revolut.feature.credit.card.impl.ui.instalment.details.flow;

import com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.details.flow.CreditCardInstalmentDetailsFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import xif.k;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements xr4.b {
    public final CreditCardInstalmentDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f69361p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f69362q;

    public b(CreditCardInstalmentDetailsFlowContract$InputData inputData, gte.a featureToggleInteractor) {
        FlowStep flowStep;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f69361p = featureToggleInteractor;
        if (inputData instanceof CreditCardInstalmentDetailsFlowContract$InputData.PrePurchase) {
            flowStep = CreditCardInstalmentDetailsFlowContract$Step.PrePurchase.f69356a;
        } else if (inputData instanceof CreditCardInstalmentDetailsFlowContract$InputData.PostPurchase) {
            flowStep = CreditCardInstalmentDetailsFlowContract$Step.PostPurchase.f69355a;
        } else {
            if (!(inputData instanceof CreditCardInstalmentDetailsFlowContract$InputData.StatementFinancing)) {
                throw new NoWhenBranchMatchedException();
            }
            flowStep = CreditCardInstalmentDetailsFlowContract$Step.StatementFinancing.f69359a;
        }
        this.f69362q = d.a(this, flowStep, f0.f322471a, new k(this, 22));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f69362q;
    }
}
