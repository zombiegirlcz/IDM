package q75;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ LoanPartialRepaymentController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LoanPartialRepaymentController loanPartialRepaymentController, Continuation continuation) {
        super(2, continuation);
        this.u = loanPartialRepaymentController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        oki.h.v2(((com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a) ((k) this.u.O.getValue())).z, LoanPartialRepaymentControllerContract$ModalStep.Picker.f70493a, ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
