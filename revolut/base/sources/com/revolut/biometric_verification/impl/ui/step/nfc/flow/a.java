package com.revolut.biometric_verification.impl.ui.step.nfc.flow;

import com.revolut.biometric_verification.impl.ui.step.nfc.flow.BiometricVerificationNfcFlowContract$Step;
import com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.BiometricVerificationNfcV2ConsolidatedScreen;
import com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.BiometricVerificationNfcV2ConsolidatedScreenContract$InputData;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import zhm.f0;
import zt.b;
import zt.c;
import zt.g;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f50626p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f50627q;

    public a(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f50626p = e.b(this, BiometricVerificationNfcFlowContract$State.f50620a);
        zo2.h hVar = new zo2.h(this, 12);
        this.f50627q = cp5.d.a(this, BiometricVerificationNfcFlowContract$Step.IntroStep.f50622a, f0.f322471a, hVar);
    }

    public final BiometricVerificationNfcV2ConsolidatedScreen I2(BiometricVerificationNfcFlowContract$AuthData biometricVerificationNfcFlowContract$AuthData) {
        c cVar = this.o;
        BiometricVerificationNfcV2ConsolidatedScreen biometricVerificationNfcV2ConsolidatedScreen = new BiometricVerificationNfcV2ConsolidatedScreen(new BiometricVerificationNfcV2ConsolidatedScreenContract$InputData(cVar.f324995c, cVar.d.f50375a, biometricVerificationNfcFlowContract$AuthData, cVar.f324994b, cVar.e));
        g block = new g(this, 1);
        Intrinsics.checkNotNullParameter(block, "block");
        biometricVerificationNfcV2ConsolidatedScreen.H = block;
        return biometricVerificationNfcV2ConsolidatedScreen;
    }

    @Override // qki.e
    public final d getState() {
        return this.f50626p;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f50627q;
    }
}
