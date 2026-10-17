package i85;

import com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.ReviewPaymentControllerContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import q35.g0;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class u extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.a f159468w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f159468w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.f159468w, continuation, 0);
            default:
                return new u(this.f159468w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((u) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.a aVar = this.f159468w;
                ReviewPaymentControllerContract$InputData reviewPaymentControllerContract$InputData = aVar.o;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ufm.n nVarI = ((y45.f) aVar.f70568p).i(reviewPaymentControllerContract$InputData.f70564a, new Long(reviewPaymentControllerContract$InputData.f70565b.f115082a), reviewPaymentControllerContract$InputData.f70566c);
                this.v = 1;
                Object objB = nim.a.b(nVarI, this);
                return objB == aVar2 ? aVar2 : objB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.reviewpayment.a aVar4 = this.f159468w;
                    m mVar = (m) zi0.c.I(((n) ((j2) aVar4.u.f22677a).getValue()).f159460a);
                    LoanRepaymentAccountModelExtension loanRepaymentAccountModelExtension = aVar4.f70571s;
                    LoanDetails loanDetails = mVar.f159457a;
                    g0 g0Var = aVar4.o.f70566c;
                    LoanRepaymentTerms loanRepaymentTerms = mVar.f159458b;
                    Object objZ2 = loanRepaymentAccountModelExtension.Z2(loanDetails, g0Var, loanRepaymentTerms, loanRepaymentTerms.f70084g, mVar.f159459c.a(), this);
                    if (objZ2 != aVar3) {
                        objZ2 = Unit.f186387a;
                    }
                    if (objZ2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
