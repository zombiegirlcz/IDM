package com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1;

import c84.t;
import cli.y;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.CreditApplicationAgreementsFlowContract$Step;
import cp5.d;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w72.g;
import x2g.b;
import x44.c;
import x44.e;
import x44.h;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements h {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f66998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CreditApplicationAgreementsFlowContract$InputData f66999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sp3.a f67000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w0 f67001s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f67002t;
    public final y u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c interactor, CreditApplicationAgreementsFlowContract$InputData inputData, sp3.a creditDataMonitoringFacade, e84.e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditDataMonitoringFacade, "creditDataMonitoringFacade");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f66998p = interactor;
        this.f66999q = inputData;
        this.f67000r = creditDataMonitoringFacade;
        this.f67001s = v7.m(inputData.f66992a, AnalyticsContext.INSTANCE);
        b bVar = new b(this, 4);
        this.f67002t = d.a(this, CreditApplicationAgreementsFlowContract$Step.Documents.f66997a, f0.f322471a, bVar);
        this.u = mra.d.b(this, new CreditApplicationAgreementsFlowContract$State(null), new g(2), null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new x44.g(this, null, 2), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67002t;
    }
}
