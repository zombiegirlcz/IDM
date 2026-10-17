package com.revolut.biometric_verification.impl.ui.step.active_liveness.flow;

import is.j;
import is.k;
import is.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        l p0 = (l) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        c cVar = (c) this.receiver;
        if (p0 instanceof j) {
            cVar.M2("BiometricVerificationActiveLivenessIntroScreenContract_BUTTON_TAG", false);
        } else {
            cVar.getClass();
            if (!Intrinsics.f(p0, k.f168074a)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar.M2("BiometricVerificationActiveLivenessIntroScreenContract_SPEECHLESS_MODE_BUTTON_TAG", true);
        }
        return Unit.f186387a;
    }
}
