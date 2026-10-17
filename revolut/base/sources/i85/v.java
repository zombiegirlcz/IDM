package i85;

import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.ReviewPaymentControllerContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.v1;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class v extends gim.i implements Function1 {
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.a aVar, Continuation continuation) {
        super(1, continuation);
        this.u = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new v(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((v) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.a aVar2 = this.u;
        vkm.d dVarB = rd0.e.b(aVar2.f70572t.b(aVar2.o.f70564a, w4l.h.f294642c));
        v1 v1VarK = ngm.n.K(new u(aVar2, null, 0));
        LoanRepaymentAccountModelExtension loanRepaymentAccountModelExtension = aVar2.f70571s;
        ReviewPaymentControllerContract$InputData reviewPaymentControllerContract$InputData = aVar2.o;
        return yji.l.a1(aVar2, rd0.e.n(nim.a.v(u0.i(dVarB, v1VarK, loanRepaymentAccountModelExtension.c3(reviewPaymentControllerContract$InputData.f70564a, reviewPaymentControllerContract$InputData.d)), new i6j.p(12)), h0.f322473a), null, null, new i13.d(aVar2, (Continuation) null, 24), 3);
    }
}
