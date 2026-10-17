package com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow;

import c84.t;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.AutopayFlowContract$Step;
import e84.e;
import hw3.c;
import hw3.c0;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import mz3.r;
import py3.b;
import qki.d;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements n54.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AutopayFlowContract$InputData f67144p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wj4.a f67145q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f67146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c0 f67147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f67148t;
    public final uj4.a u;
    public final d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w0 f67149w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final yki.a f67150x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AutopayFlowContract$InputData flowInput, wj4.a autoPayStatusDialogFactory, c creditApplicationCommonInteractor, c0 autoPayInteractor, b creditApplicationErrorHandlerChecker, uj4.a autoPayExternalAccountFlowProvider, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(flowInput, "flowInput");
        Intrinsics.checkNotNullParameter(autoPayStatusDialogFactory, "autoPayStatusDialogFactory");
        Intrinsics.checkNotNullParameter(creditApplicationCommonInteractor, "creditApplicationCommonInteractor");
        Intrinsics.checkNotNullParameter(autoPayInteractor, "autoPayInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationErrorHandlerChecker, "creditApplicationErrorHandlerChecker");
        Intrinsics.checkNotNullParameter(autoPayExternalAccountFlowProvider, "autoPayExternalAccountFlowProvider");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67144p = flowInput;
        this.f67145q = autoPayStatusDialogFactory;
        this.f67146r = creditApplicationCommonInteractor;
        this.f67147s = autoPayInteractor;
        this.f67148t = creditApplicationErrorHandlerChecker;
        this.u = autoPayExternalAccountFlowProvider;
        this.v = hx7.e.b(this, new AutopayFlowContract$State(null));
        this.f67149w = v7.m(flowInput.f67139a, AnalyticsContext.INSTANCE);
        r rVar = new r(this, 18);
        this.f67150x = cp5.d.a(this, AutopayFlowContract$Step.SelectPaymentMethod.f67143a, f0.f322471a, rVar);
    }

    @Override // qki.e
    public final d getState() {
        return this.v;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67150x;
    }
}
