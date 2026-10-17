package com.revolut.feature.credit.application.plugins.impl.ui.failure.flow;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.failure.flow.FailureRootFlowContract$Step;
import cp5.d;
import e84.e;
import eul.f;
import fb4.b;
import hw3.c;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FailureRootFlowContract$InputData f67668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f67669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f67670r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FailureRootFlowContract$InputData inputData, c interactor, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67668p = inputData;
        this.f67669q = interactor;
        f fVar = new f(this, 25);
        this.f67670r = d.a(this, FailureRootFlowContract$Step.FailureBottomSheet.f67667a, f0.f322471a, fVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67670r;
    }
}
