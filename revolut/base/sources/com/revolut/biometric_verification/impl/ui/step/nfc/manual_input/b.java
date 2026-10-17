package com.revolut.biometric_verification.impl.ui.step.nfc.manual_input;

import com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ BiometricVerificationManualInputViewController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BiometricVerificationManualInputViewController biometricVerificationManualInputViewController, Continuation continuation) {
        super(2, continuation);
        this.u = biometricVerificationManualInputViewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((c) this.u.d()).I2(BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent.SelectExpiryDate.f50647a);
        return Unit.f186387a;
    }
}
