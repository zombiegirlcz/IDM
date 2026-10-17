package du;

import com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.BiometricVerificationManualInputViewController;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BiometricVerificationManualInputViewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(BiometricVerificationManualInputViewController biometricVerificationManualInputViewController, Continuation continuation) {
        super(2, continuation);
        this.v = biometricVerificationManualInputViewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, continuation);
        rVar.u = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.c) this.v.d()).I2(new g(textData.f52598b.toString()));
        return Unit.f186387a;
    }
}
