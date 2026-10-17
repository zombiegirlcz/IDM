package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation;

import b7d.c;
import bgj.b;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$Step;
import d8l.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final EsimMobilePlanCancellationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f100708p;

    public a(EsimMobilePlanCancellationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f100708p = d.a(this, new c(this, 28));
    }

    @Override // yki.j
    public final void M0() {
        FlowStep cancellation;
        EsimMobilePlanCancellationFlowContract$InputData esimMobilePlanCancellationFlowContract$InputData = this.o;
        EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType = esimMobilePlanCancellationFlowContract$InputData.f100700b;
        if (Intrinsics.f(esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType, EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType.Cancellation.f100697a)) {
            cancellation = EsimMobilePlanCancellationFlowContract$Step.CancellationReasonForm.f100705a;
        } else {
            if (!Intrinsics.f(esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType, EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType.Withdrawal.f100698a)) {
                throw new NoWhenBranchMatchedException();
            }
            cancellation = new EsimMobilePlanCancellationFlowContract$Step.Cancellation(null, null, null, esimMobilePlanCancellationFlowContract$InputData.f100700b, esimMobilePlanCancellationFlowContract$InputData.f100701c, esimMobilePlanCancellationFlowContract$InputData.d);
        }
        h.t2(this, this.f100708p, cancellation, true, null, false, 12);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100708p;
    }
}
