package com.revolut.feature.onboarding.impl.onboarding.biometric;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.onboarding.impl.R$string;
import gld.e0;
import imk.p0;
import j2c.n;
import j87.m;
import ja9.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends h implements ja9.b {

    @NotNull
    public static final f Companion = new f();
    public final OnboardingBiometricFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mt8.d f78394p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bs.a f78395q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f78396r;

    public d(OnboardingBiometricFlowContract$InputData inputData, mt8.d kycInteractor, bs.a biometricVerificationFlowProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(biometricVerificationFlowProvider, "biometricVerificationFlowProvider");
        this.o = inputData;
        this.f78394p = kycInteractor;
        this.f78395q = biometricVerificationFlowProvider;
        this.f78396r = d8l.d.a(this, new n(this, 23));
    }

    public final void I2(Function0 function0) {
        l.a1(this, X1(new y0("RETRY_DIALOG_ID", new z(new TextLocalisedClause(R$string.onboarding_step_failed_title, null, null, 14), null, new TextLocalisedClause(R$string.onboarding_step_failed_try_again, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32502), false, 4)), null, null, new e0(1, null, function0), 3);
    }

    public final void J2() {
        l2(new p0(this, null, 22), new m(this, 7));
    }

    @Override // yki.j
    public final void M0() {
        J2();
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f78396r;
    }
}
