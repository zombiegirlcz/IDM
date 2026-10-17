package com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.flow;

import com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.flow.PlanRewardsRevealFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import sdk.b;
import wli.x;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final PlanRewardsRevealFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f102574p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f102575q;

    public a(PlanRewardsRevealFlowContract$InputData inputData, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = inputData;
        this.f102574p = deeplinkHandler;
        scl.h hVar = new scl.h(this, 3);
        this.f102575q = d.a(this, PlanRewardsRevealFlowContract$Step.Reveal.f102573a, f0.f322471a, hVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f102575q;
    }
}
