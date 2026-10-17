package e85;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.AmountInputController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.AmountInputControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ AmountInputController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AmountInputController amountInputController, Continuation continuation) {
        super(2, continuation);
        this.u = amountInputController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.a aVar2 = (com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.a) this.u.k3();
        f fVar = (f) ((g) ((j2) aVar2.z.f22677a).getValue()).f123582b.getContent();
        if (fVar != null) {
            oki.h.v2(aVar2.A, new AmountInputControllerContract$ModalStep.AccountPicker(fVar.f123580b), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
