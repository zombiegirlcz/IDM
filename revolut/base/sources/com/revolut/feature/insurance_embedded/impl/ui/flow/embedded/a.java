package com.revolut.feature.insurance_embedded.impl.ui.flow.embedded;

import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vu7.b;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final InsuranceDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final si7.a f76079p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f76080q;

    public a(InsuranceDetailsFlowContract$InputData inputData, si7.a insuranceInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(insuranceInteractor, "insuranceInteractor");
        this.o = inputData;
        this.f76079p = insuranceInteractor;
        this.f76080q = d.a(this, inputData.f76070c, f0.f322471a, new vh9.b(this, 26));
    }

    public final void I2(InsuranceDetailsFlowContract$Step step) {
        Intrinsics.checkNotNullParameter(step, "step");
        h.t2(this, this.f76080q, step, true, null, false, 12);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f76080q;
    }
}
