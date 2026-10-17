package vq5;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.CryptoSendConfirmationController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.CryptoSendConfirmationControllerContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoSendConfirmationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CryptoSendConfirmationController cryptoSendConfirmationController, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoSendConfirmationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar2 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a) fVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51832a, "CryptoSendConfirmation_Fees")) {
            oki.h.v2(aVar2.E, CryptoSendConfirmationControllerContract$Step.Fees.f71321a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
