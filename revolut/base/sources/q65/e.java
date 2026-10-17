package q65;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.confirmnewday.LoanConfirmNewRepaymentDayScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ LoanConfirmNewRepaymentDayScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LoanConfirmNewRepaymentDayScreen loanConfirmNewRepaymentDayScreen, Continuation continuation) {
        super(2, continuation);
        this.u = loanConfirmNewRepaymentDayScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((m) ((h) this.u.X.getValue())).f242506s.b(false);
        return Unit.f186387a;
    }
}
