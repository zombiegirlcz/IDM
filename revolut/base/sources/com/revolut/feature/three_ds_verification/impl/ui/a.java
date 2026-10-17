package com.revolut.feature.three_ds_verification.impl.ui;

import anc.b;
import ase.c;
import com.revolut.feature.three_ds_verification.impl.ui.ThreeDsVerificationFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements c {
    public final gte.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f90397p;

    public a(ThreeDsVerificationFlowContract$InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = featureToggleInteractor;
        this.f90397p = d.a(this, new ThreeDsVerificationFlowContract$Step.ThreeDsConfirmation(inputData.f90395a), f0.f322471a, new b(this, 12));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f90397p;
    }
}
