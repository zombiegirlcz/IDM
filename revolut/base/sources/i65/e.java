package i65;

import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.confirmation.LoanConfirmWithdrawalController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LoanConfirmWithdrawalController f158861w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(LoanConfirmWithdrawalController loanConfirmWithdrawalController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f158861w = loanConfirmWithdrawalController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f158861w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f158861w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        z45.a aVar = (z45.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        LoanConfirmWithdrawalController loanConfirmWithdrawalController = this.f158861w;
        switch (i) {
            case 0:
                z45.a aVar = (z45.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((s) loanConfirmWithdrawalController.e3()).J2(new g(aVar));
                break;
            default:
                z45.a aVar3 = (z45.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((s) loanConfirmWithdrawalController.e3()).J2(new h(aVar3));
                break;
        }
        return Unit.f186387a;
    }
}
