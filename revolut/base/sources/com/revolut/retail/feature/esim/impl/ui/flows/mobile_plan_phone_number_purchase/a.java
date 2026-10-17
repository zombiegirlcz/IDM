package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_phone_number_purchase;

import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_phone_number_purchase.EsimMobilePlanPhoneNumberPurchaseFlowContract$Step;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lcc.c;
import lgj.b;
import lgj.g;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final EsimMobilePlanPhoneNumberPurchaseFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f100826p;

    public a(EsimMobilePlanPhoneNumberPurchaseFlowContract$InputData inputData) {
        FlowStep flowStep;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        int i = g.f195126a[inputData.f100815b.ordinal()];
        if (i == 1) {
            flowStep = EsimMobilePlanPhoneNumberPurchaseFlowContract$Step.MyNumbers.f100819a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            flowStep = EsimMobilePlanPhoneNumberPurchaseFlowContract$Step.AddNumber.f100817a;
        }
        this.f100826p = d.a(this, flowStep, f0.f322471a, new c(this, 9));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100826p;
    }
}
