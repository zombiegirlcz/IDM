package ft;

import com.revolut.biometric_verification.impl.ui.step.document.document_picker.BiometricVerificationDocumentSelectionScreen;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BiometricVerificationDocumentSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BiometricVerificationDocumentSelectionScreen biometricVerificationDocumentSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = biometricVerificationDocumentSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVar = (k) this.v.Q.getValue();
        Intrinsics.h(model);
        ((m) kVar).I2(new h(model));
        return Unit.f186387a;
    }
}
