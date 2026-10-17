package pt;

import com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.BiometricVerificationManualDocumentSelectionScreen;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BiometricVerificationManualDocumentSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BiometricVerificationManualDocumentSelectionScreen biometricVerificationManualDocumentSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = biometricVerificationManualDocumentSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52580a;
        boolean zF = Intrinsics.f(str, "DOCUMENT_INPUT_ID");
        BiometricVerificationManualDocumentSelectionScreen biometricVerificationManualDocumentSelectionScreen = this.v;
        if (zF) {
            ((com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.a) biometricVerificationManualDocumentSelectionScreen.R2()).I2(i.f239560a);
        } else if (Intrinsics.f(str, "COUNTRY_INPUT_ID")) {
            ((com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.a) biometricVerificationManualDocumentSelectionScreen.R2()).I2(h.f239559a);
        }
        return Unit.f186387a;
    }
}
