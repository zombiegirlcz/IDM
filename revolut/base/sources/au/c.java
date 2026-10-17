package au;

import com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.BiometricVerificationNfcV2ConsolidatedScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BiometricVerificationNfcV2ConsolidatedScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(BiometricVerificationNfcV2ConsolidatedScreen biometricVerificationNfcV2ConsolidatedScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = biometricVerificationNfcV2ConsolidatedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BiometricVerificationNfcV2ConsolidatedScreen biometricVerificationNfcV2ConsolidatedScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a) ((u) biometricVerificationNfcV2ConsolidatedScreen.N.getValue())).N2(m.f9123a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a) ((u) biometricVerificationNfcV2ConsolidatedScreen.N.getValue())).N2(biometricVerificationNfcV2ConsolidatedScreen.Q ? o.f9125a : r.f9128a);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a) ((u) biometricVerificationNfcV2ConsolidatedScreen.N.getValue())).N2(p.f9126a);
                break;
        }
        return Unit.f186387a;
    }
}
