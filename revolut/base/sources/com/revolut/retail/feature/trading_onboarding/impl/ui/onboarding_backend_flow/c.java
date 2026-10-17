package com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow;

import dcl.q;
import efm.d0;
import efm.k;
import f1l.g;
import h0l.e;
import kotlin.jvm.internal.Intrinsics;
import mm.d;
import qc0.f1;
import qc0.h;
import rfm.j;
import te0.s;
import wli.x;
import xl2.f;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends f1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f104233m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f104234n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h presentationModel, e state, String flowName, q transitionsInteractor, am2.a backendFlowCountryInteractor, t70.b currencyLocalization, d actionsDispatcher, x deeplinkHandler, f backendFlowConfiguration, s70.a intentProvider, yc0.a addressFlowInputDataMapper, g tradingOnboardingPartNaviCommandProvider) {
        super(presentationModel, transitionsInteractor, backendFlowCountryInteractor, state, currencyLocalization, flowName, actionsDispatcher, deeplinkHandler, backendFlowConfiguration, intentProvider, addressFlowInputDataMapper);
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(transitionsInteractor, "transitionsInteractor");
        Intrinsics.checkNotNullParameter(backendFlowCountryInteractor, "backendFlowCountryInteractor");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(backendFlowConfiguration, "backendFlowConfiguration");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(addressFlowInputDataMapper, "addressFlowInputDataMapper");
        Intrinsics.checkNotNullParameter(tradingOnboardingPartNaviCommandProvider, "tradingOnboardingPartNaviCommandProvider");
        this.f104233m = state;
        this.f104234n = tradingOnboardingPartNaviCommandProvider;
    }

    @Override // qc0.f1
    public final k i() {
        d0 d0VarFirstOrError = ((h0l.h) this.f104233m).w0().c(s.f270018a).firstOrError();
        int i = 2;
        h0l.g gVar = new h0l.g(new gwe.d(this, 14), i);
        d0VarFirstOrError.getClass();
        j jVar = new j(d0VarFirstOrError, gVar, i);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        return jVar;
    }

    @Override // qc0.f1
    public final qc0.k j() {
        return this.f104233m;
    }
}
