package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.flow;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.flow.MortgageValuationFlowContract$Step;
import cp5.d;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements ze4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MortgageValuationFlowContract$InputData f68057p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f68058q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MortgageValuationFlowContract$InputData inputData, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68057p = inputData;
        zba.a aVar = new zba.a(this, 5);
        this.f68058q = d.a(this, MortgageValuationFlowContract$Step.Summary.f68056a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f68058q;
    }
}
