package q65;

import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.confirmnewday.LoanConfirmNewRepaymentDayScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import pwb.p;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ LoanConfirmNewRepaymentDayScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(LoanConfirmNewRepaymentDayScreen loanConfirmNewRepaymentDayScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = loanConfirmNewRepaymentDayScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
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

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        LoanConfirmNewRepaymentDayScreen loanConfirmNewRepaymentDayScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                loanConfirmNewRepaymentDayScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVar = (m) ((h) loanConfirmNewRepaymentDayScreen.X.getValue());
                mVar.getClass();
                mVar.n2(new p(mVar, null, 15), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
