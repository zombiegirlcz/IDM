package com.revolut.feature.credit.application.plugins.impl.ui.visible_prequalification;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.visible_prequalification.VisiblePrequalificationFlowContract$Step;
import cp5.d;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import kze.h;
import lj4.b;
import xq3.j;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final VisiblePrequalificationFlowContract$InputData f68513p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f68514q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f68515r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(VisiblePrequalificationFlowContract$InputData inputData, j creditApplicationLifecycleInteractor, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditApplicationLifecycleInteractor, "creditApplicationLifecycleInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68513p = inputData;
        this.f68514q = creditApplicationLifecycleInteractor;
        l9j.j jVar = new l9j.j(26);
        this.f68515r = d.a(this, VisiblePrequalificationFlowContract$Step.Loading.f68512a, f0.f322471a, jVar);
    }

    @Override // yji.l
    public final void I1() {
        l2(new h(this, null, 20), new laj.b(this, 28));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68515r;
    }
}
