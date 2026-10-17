package com.revolut.feature.credit.application.plugins.impl.ui.payment.flow;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.payment.flow.PaymentFlowContract$Step;
import cp5.d;
import cwj.h;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements dg4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PaymentFlowContract$InputData f68179p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f68180q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PaymentFlowContract$InputData inputData, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68179p = inputData;
        h hVar = new h(this, 28);
        this.f68180q = d.a(this, PaymentFlowContract$Step.Checkout.f68178a, f0.f322471a, hVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f68180q;
    }
}
