package com.revolut.feature.insurance_embedded.impl.ui.flow.coverage_activation;

import com.revolut.feature.insurance_embedded.impl.ui.flow.coverage_activation.InsuranceCoverageActivationFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import su7.b;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final InsuranceCoverageActivationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f76058p;

    public a(InsuranceCoverageActivationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        scl.h hVar = new scl.h(this, 29);
        this.f76058p = d.a(this, InsuranceCoverageActivationFlowContract$Step.CoverageActivation.f76056a, f0.f322471a, hVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f76058p;
    }
}
