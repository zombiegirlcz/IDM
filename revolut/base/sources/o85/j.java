package o85;

import com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymenttype.LoanRepaymentTypeControllerContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q35.g0;
import ufm.n;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function1 {
    public g0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f222941w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, Continuation continuation) {
        super(1, continuation);
        this.f222941w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.f222941w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g0 g0Var;
        m mVar = this.f222941w;
        LoanRepaymentTypeControllerContract$InputData loanRepaymentTypeControllerContract$InputData = mVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            q35.j jVar = loanRepaymentTypeControllerContract$InputData.f70581a.f70144a.f70120s;
            Long l2 = jVar != null ? new Long(jVar.f.f115082a) : null;
            if (l2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            long jLongValue = l2.longValue();
            g0 g0Var2 = g0.EARLY_REPAYMENT;
            n nVarI = ((y45.f) mVar.f222944p).i(loanRepaymentTypeControllerContract$InputData.f70581a.f70144a.f70108a, new Long(jLongValue), g0Var2);
            this.u = g0Var2;
            this.v = 1;
            Object objB = nim.a.b(nVarI, this);
            if (objB == aVar) {
                return aVar;
            }
            g0Var = g0Var2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0 g0Var3 = this.u;
            o.b(obj2);
            g0Var = g0Var3;
        }
        LoanRepaymentTerms loanRepaymentTerms = (LoanRepaymentTerms) obj2;
        String str = loanRepaymentTypeControllerContract$InputData.f70581a.f70144a.f70108a;
        Intrinsics.h(loanRepaymentTerms);
        return mVar.C1(new LoanKompotFeatureConfig.RepaymentBreakdownDestination(str, loanRepaymentTerms, loanRepaymentTypeControllerContract$InputData.f70581a, g0Var, true, null));
    }
}
