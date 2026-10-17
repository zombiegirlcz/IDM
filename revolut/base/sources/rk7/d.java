package rk7;

import com.revolut.feature.insurance.api.models.CFACClaimExpense;
import com.revolut.feature.insurance.impl.ui.cfac.CFACInsuranceFlowContract$Step;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_details.CFACClaimDetailsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_expenses.CFACClaimExpensesScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.expense_details.CFACClaimExpenseDetailsScreenContract$InputData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import whf.p;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CFACClaimDetailsScreen f254752w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CFACClaimDetailsScreen cFACClaimDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f254752w = cFACClaimDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f254752w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f254752w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((CFACClaimExpense) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CFACClaimDetailsScreen cFACClaimDetailsScreen = this.f254752w;
        switch (i) {
            case 0:
                List cfacExpenses = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarI3 = cFACClaimDetailsScreen.i3();
                Intrinsics.h(cfacExpenses);
                l lVar = (l) iVarI3;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(cfacExpenses, "cfacExpenses");
                if (((p) ((e) lVar.t2()).f254754b.getContent()) != null) {
                    lVar.v2(new h(new CFACInsuranceFlowContract$Step.ClaimExpenses(new CFACClaimExpensesScreenContract$InputData(cfacExpenses))));
                }
                break;
            default:
                CFACClaimExpense selectedExpense = (CFACClaimExpense) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarI32 = cFACClaimDetailsScreen.i3();
                Intrinsics.h(selectedExpense);
                l lVar2 = (l) iVarI32;
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(selectedExpense, "selectedExpense");
                lVar2.v2(new h(new CFACInsuranceFlowContract$Step.ClaimExpenseDetails(new CFACClaimExpenseDetailsScreenContract$InputData(selectedExpense))));
                break;
        }
        return Unit.f186387a;
    }
}
