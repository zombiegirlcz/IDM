package q75;

import com.revolut.feature.credit.loan.api.models.LoanRepaymentAccountData;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentControllerContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a f242757w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dj0.d f242758x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a aVar, dj0.d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f242757w = aVar;
        this.f242758x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f242757w, this.f242758x, continuation, 0);
            case 1:
                return new q(this.f242757w, this.f242758x, continuation, 1);
            default:
                return new q(this.f242757w, this.f242758x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((q) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objZ2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a aVar2 = this.f242757w;
                l35.b bVar = aVar2.f70496p;
                LoanPartialRepaymentControllerContract$InputData loanPartialRepaymentControllerContract$InputData = aVar2.o;
                ufm.n nVarI = ((y45.f) bVar).i(loanPartialRepaymentControllerContract$InputData.f70488a, new Long(this.f242758x.f115082a), loanPartialRepaymentControllerContract$InputData.f70489b);
                this.v = 1;
                Object objB = nim.a.b(nVarI, this);
                return objB == aVar ? aVar : objB;
            case 1:
                com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a aVar3 = this.f242757w;
                LoanPartialRepaymentControllerContract$InputData loanPartialRepaymentControllerContract$InputData2 = aVar3.o;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ufm.n nVarI2 = ((y45.f) aVar3.f70496p).i(loanPartialRepaymentControllerContract$InputData2.f70488a, new Long(this.f242758x.f115082a), loanPartialRepaymentControllerContract$InputData2.f70489b);
                this.v = 1;
                Object objB2 = nim.a.b(nVarI2, this);
                return objB2 == aVar4 ? aVar4 : objB2;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a aVar6 = this.f242757w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a.I2(aVar6, this.f242758x, this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                LoanRepaymentTerms loanRepaymentTerms = (LoanRepaymentTerms) obj2;
                int i5 = s.f242760a[loanRepaymentTerms.d.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LoanDetails loanDetailsJ2 = aVar6.J2();
                    if (loanDetailsJ2 != null) {
                        LoanPartialRepaymentControllerContract$InputData loanPartialRepaymentControllerContract$InputData3 = aVar6.o;
                        aVar6.C1(new LoanKompotFeatureConfig.RepaymentBreakdownDestination(loanPartialRepaymentControllerContract$InputData3.f70488a, loanRepaymentTerms, loanDetailsJ2, loanPartialRepaymentControllerContract$InputData3.f70489b, true, new LoanRepaymentAccountData(aVar6.K2().f70504a.getId(), yoj.b.y(aVar6.K2().f70504a.f97224a))));
                    }
                    return Unit.f186387a;
                }
                dj0.d dVar = loanRepaymentTerms.f70084g;
                this.v = 2;
                LoanDetails loanDetailsJ22 = aVar6.J2();
                if (loanDetailsJ22 == null || (objZ2 = aVar6.f70502x.Z2(loanDetailsJ22, aVar6.o.f70489b, loanRepaymentTerms, dVar, aVar6.K2().a(), this)) != aVar5) {
                    objZ2 = Unit.f186387a;
                }
                if (objZ2 == aVar5) {
                    return aVar5;
                }
                return Unit.f186387a;
        }
    }
}
