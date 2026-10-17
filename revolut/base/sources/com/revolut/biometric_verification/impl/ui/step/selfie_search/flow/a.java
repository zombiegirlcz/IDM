package com.revolut.biometric_verification.impl.ui.step.selfie_search.flow;

import com.revolut.biometric_verification.impl.ui.step.selfie_search.flow.BiometricVerificationSelfieSearchFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import mnl.g;
import mu.b;
import mu.c;
import mu.d;
import mu.e;
import oki.h;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zr.l;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends h implements b {

    @NotNull
    public static final d Companion = new d();
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f50661p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f50662q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qki.d f50663r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f50664s;

    public a(c inputData, e biometricVerificationSelfieSearchStepResultMapper, l biometricVerificationMediaManager) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(biometricVerificationSelfieSearchStepResultMapper, "biometricVerificationSelfieSearchStepResultMapper");
        Intrinsics.checkNotNullParameter(biometricVerificationMediaManager, "biometricVerificationMediaManager");
        this.o = inputData;
        this.f50661p = biometricVerificationSelfieSearchStepResultMapper;
        this.f50662q = biometricVerificationMediaManager;
        this.f50663r = hx7.e.b(this, BiometricVerificationSelfieSearchFlowContract$State.f50659a);
        g gVar = new g(this, 18);
        this.f50664s = cp5.d.a(this, BiometricVerificationSelfieSearchFlowContract$Step.CaptureSelfie.f50660a, f0.f322471a, gVar);
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f50663r;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f50664s;
    }
}
