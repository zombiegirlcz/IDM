package com.revolut.biometric_verification.impl.ui.step.selfie.flow;

import com.revolut.biometric_verification.impl.ui.step.selfie.flow.BiometricVerificationSelfieStepFlowContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import oki.h;
import pu.e;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        e p0 = (e) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        c cVar = (c) this.receiver;
        if (p0 instanceof e) {
            h.t2(cVar, cVar.f50658w, new BiometricVerificationSelfieStepFlowContract$Step.Camera(true), true, null, false, 12);
            return Unit.f186387a;
        }
        cVar.getClass();
        throw new NoWhenBranchMatchedException();
    }
}
