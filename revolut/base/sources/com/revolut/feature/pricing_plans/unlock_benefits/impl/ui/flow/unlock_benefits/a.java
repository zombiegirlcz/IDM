package com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.flow.unlock_benefits;

import com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.flow.unlock_benefits.UnlockBenefitsFlowContract$Step;
import cp5.d;
import hga.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import til.m;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f80969p;

    public a(UnlockBenefitsFlowContract$InputData inputData, m workflowFlowProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        this.o = workflowFlowProvider;
        this.f80969p = d.a(this, new UnlockBenefitsFlowContract$Step.UnlockBenefits(inputData.f80966a), f0.f322471a, new hfb.d(this, 1));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f80969p;
    }
}
