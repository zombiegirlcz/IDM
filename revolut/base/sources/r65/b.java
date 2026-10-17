package r65;

import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday.LoanSelectNewRepaymentDayScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ LoanSelectNewRepaymentDayScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(LoanSelectNewRepaymentDayScreen loanSelectNewRepaymentDayScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = loanSelectNewRepaymentDayScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        LoanSelectNewRepaymentDayScreen loanSelectNewRepaymentDayScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                loanSelectNewRepaymentDayScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) loanSelectNewRepaymentDayScreen.X.getValue();
                if (((c) iVar.t2()).f251635b == iVar.f251644r.f251635b) {
                    iVar.n2(new h(iVar, null), new whi.b(6));
                } else {
                    iVar.v2(new e(((c) iVar.t2()).f251635b));
                }
                break;
        }
        return Unit.f186387a;
    }
}
