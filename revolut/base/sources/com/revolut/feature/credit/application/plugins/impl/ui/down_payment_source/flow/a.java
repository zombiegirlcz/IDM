package com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow.DownPaymentSourceFlowContract$Step;
import cp5.d;
import e84.e;
import j2c.n;
import kotlin.jvm.internal.Intrinsics;
import o7.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements ja4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DownPaymentSourceFlowContract$InputData f67613p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f67614q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f67615r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DownPaymentSourceFlowContract$InputData inputData, b interactor, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67613p = inputData;
        this.f67614q = interactor;
        n nVar = new n(this, 22);
        this.f67615r = d.a(this, DownPaymentSourceFlowContract$Step.Sources.f67612a, f0.f322471a, nVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67615r;
    }
}
