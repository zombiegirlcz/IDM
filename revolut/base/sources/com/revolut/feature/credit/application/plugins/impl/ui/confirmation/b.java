package com.revolut.feature.credit.application.plugins.impl.ui.confirmation;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.confirmation.ConfirmationFlowContract$Step;
import e84.e;
import hw3.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v48.d;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends t implements v64.a {

    @NotNull
    private static final v64.b Companion = new v64.b();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f67248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ConfirmationFlowContract$InputData f67249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sp3.a f67250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f67251s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c interactor, ConfirmationFlowContract$InputData inputData, sp3.a creditDataMonitoringFacade, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditDataMonitoringFacade, "creditDataMonitoringFacade");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67248p = interactor;
        this.f67249q = inputData;
        this.f67250r = creditDataMonitoringFacade;
        d dVar = new d(this, 6);
        this.f67251s = cp5.d.a(this, ConfirmationFlowContract$Step.Confirmation.f67246a, f0.f322471a, dVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67251s;
    }
}
