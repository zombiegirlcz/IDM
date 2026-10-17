package c65;

import c65.l;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.confirmation.CancelLoanConfirmationControllerContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;

/* JADX INFO: loaded from: classes21.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ t v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Continuation continuation) {
        super(2, continuation);
        this.v = tVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        t tVar = this.v;
        CancelLoanConfirmationControllerContract$InputData cancelLoanConfirmationControllerContract$InputData = tVar.o;
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (n1Var instanceof l1) {
            tVar.C2(new n(cancelLoanConfirmationControllerContract$InputData.f70360a.f70144a.f70108a));
        } else if ((n1Var instanceof m1) || (n1Var instanceof k1)) {
            Loan loan = cancelLoanConfirmationControllerContract$InputData.f70360a.f70144a;
            if (loan.i instanceof LoanState.Planned) {
                tVar.C2(l.a.f21665a);
            } else {
                tVar.C2(new k(loan.f70108a));
            }
        } else {
            if (!(n1Var instanceof j1)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = jli.h.f175850a;
        }
        return Unit.f186387a;
    }
}
