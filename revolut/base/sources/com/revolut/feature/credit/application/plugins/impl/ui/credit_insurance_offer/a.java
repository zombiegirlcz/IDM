package com.revolut.feature.credit.application.plugins.impl.ui.credit_insurance_offer;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_insurance_offer.CreditInsuranceOfferFlowContract$Step;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import m84.d;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements m84.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CreditInsuranceOfferFlowContract$InputData f67402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f67403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f67404r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CreditInsuranceOfferFlowContract$InputData inputData, d flowInteractor, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(flowInteractor, "flowInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67402p = inputData;
        this.f67403q = flowInteractor;
        m84.e eVar = new m84.e(this, 0);
        this.f67404r = cp5.d.a(this, CreditInsuranceOfferFlowContract$Step.Insurance.f67401a, f0.f322471a, eVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f67404r;
    }
}
