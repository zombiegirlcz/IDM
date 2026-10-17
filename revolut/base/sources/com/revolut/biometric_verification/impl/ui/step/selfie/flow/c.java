package com.revolut.biometric_verification.impl.ui.step.selfie.flow;

import com.revolut.biometric_verification.api.navigation.BiometricVerificationSelfieStepFlowProvider$InputData;
import com.revolut.biometric_verification.impl.ui.step.selfie.flow.BiometricVerificationSelfieStepFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import ku.e;
import oki.h;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zr.l;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends h implements ku.b {

    @NotNull
    public static final ku.c Companion = new ku.c();
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f50653p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final uq.a f50654q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lu.a f50655r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i5j.a f50656s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ju.a f50657t;
    public final iy.b u;
    public final BiometricVerificationSelfieStepFlowProvider$InputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yki.a f50658w;

    public c(e biometricVerificationSelfieStepResultMapper, l biometricVerificationMediaManager, uq.a biometricVerificationSelfieIntroScreenFactory, lu.a validatorConfigsProvider, i5j.a biometricVerificationSelfieIntroScreenProvider, ju.a selfieFaqBottomSheetInputDataMapper, iy.b experimentsInteractor, BiometricVerificationSelfieStepFlowProvider$InputData inputData) {
        Intrinsics.checkNotNullParameter(biometricVerificationSelfieStepResultMapper, "biometricVerificationSelfieStepResultMapper");
        Intrinsics.checkNotNullParameter(biometricVerificationMediaManager, "biometricVerificationMediaManager");
        Intrinsics.checkNotNullParameter(biometricVerificationSelfieIntroScreenFactory, "biometricVerificationSelfieIntroScreenFactory");
        Intrinsics.checkNotNullParameter(validatorConfigsProvider, "validatorConfigsProvider");
        Intrinsics.checkNotNullParameter(biometricVerificationSelfieIntroScreenProvider, "biometricVerificationSelfieIntroScreenProvider");
        Intrinsics.checkNotNullParameter(selfieFaqBottomSheetInputDataMapper, "selfieFaqBottomSheetInputDataMapper");
        Intrinsics.checkNotNullParameter(experimentsInteractor, "experimentsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = biometricVerificationSelfieStepResultMapper;
        this.f50653p = biometricVerificationMediaManager;
        this.f50654q = biometricVerificationSelfieIntroScreenFactory;
        this.f50655r = validatorConfigsProvider;
        this.f50656s = biometricVerificationSelfieIntroScreenProvider;
        this.f50657t = selfieFaqBottomSheetInputDataMapper;
        this.u = experimentsInteractor;
        this.v = inputData;
        this.f50658w = d.a(this, new BiometricVerificationSelfieStepFlowContract$Step.Intro(inputData.f50461c), f0.f322471a, new kj4.c(this, 15));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f50658w;
    }
}
