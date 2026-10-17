package wj7;

import cli.y;
import com.revolut.feature.insurance.api.models.CFACClaimExpense;
import com.revolut.feature.insurance.api.models.details.CFACPaymentCanceller;
import com.revolut.feature.insurance.api.models.details.CFACPaymentPurpose;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CFACInsuranceExpenseDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CFACInsuranceExpenseDetailsScreen cFACInsuranceExpenseDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cFACInsuranceExpenseDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CFACInsuranceExpenseDetailsScreen cFACInsuranceExpenseDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cFACInsuranceExpenseDetailsScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                knm.b.j(cFACInsuranceExpenseDetailsScreen, ik7.f.a());
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b bVar = (com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b) cFACInsuranceExpenseDetailsScreen.e3();
                y yVar = bVar.f75086t;
                CFACPaymentPurpose cFACPaymentPurpose = ((i) ((j2) yVar.f22677a).getValue()).f297980c;
                j2 j2Var = (j2) yVar.f22677a;
                Long l2 = ((i) j2Var.getValue()).d;
                Long l3 = ((i) j2Var.getValue()).e;
                CFACPaymentCanceller cFACPaymentCanceller = ((i) j2Var.getValue()).f;
                if (cFACPaymentPurpose != null && l2 != null && l3 != null && cFACPaymentCanceller != null) {
                    bVar.f75083q.Q();
                    bVar.C2(new k(new CFACClaimExpense(((i) j2Var.getValue()).f297978a, ((i) j2Var.getValue()).f297979b, cFACPaymentPurpose, l2.longValue(), l3.longValue(), cFACPaymentCanceller, ((i) j2Var.getValue()).f297981g)));
                }
                break;
        }
        return Unit.f186387a;
    }
}
