package s65;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.LoanSelectNewRepaymentDayV2Screen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ LoanSelectNewRepaymentDayV2Screen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(LoanSelectNewRepaymentDayV2Screen loanSelectNewRepaymentDayV2Screen, Continuation continuation) {
        super(2, continuation);
        this.u = loanSelectNewRepaymentDayV2Screen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a) this.u.R2()).f70413q.a();
        return Unit.f186387a;
    }
}
