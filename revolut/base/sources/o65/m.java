package o65;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public final /* synthetic */ LoanDetails v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(LoanDetails loanDetails, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.v = loanDetails;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.v, continuation, 0);
            default:
                return new m(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        LoanDetails loanDetails = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
        }
        return new c(loanDetails);
    }
}
