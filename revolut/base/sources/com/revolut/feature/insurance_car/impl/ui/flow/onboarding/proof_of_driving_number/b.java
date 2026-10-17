package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number;

import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number.ProofOfDrivingNumberFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oa4.c;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements om7.b {
    public final ProofOfDrivingNumberFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f75441p;

    public b(ProofOfDrivingNumberFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        c cVar = new c(this, 25);
        this.f75441p = d.a(this, ProofOfDrivingNumberFlowContract$Step.Prompt.f75439a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f75441p;
    }
}
