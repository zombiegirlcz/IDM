package yj7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.insurance.api.models.CFACClaimExpense;
import com.revolut.feature.insurance.impl.ui.cfac.claim.CFACInsuranceClaimFlowContract$Step;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.manage_expenses.CFACInsuranceManageExpensesScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.shared.CFACInsuranceAddExpensesItemMapper;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CFACInsuranceManageExpensesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CFACInsuranceManageExpensesScreen cFACInsuranceManageExpensesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cFACInsuranceManageExpensesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? r06 = this.v.Y;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.u;
        if (obj3 instanceof a3) {
            g gVar = (g) r06.getValue();
            String transactionId = ((a3) obj3).f272579a;
            i iVar = (i) gVar;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            for (CFACClaimExpense cFACClaimExpense : ((e) iVar.t2()).f314428b) {
                if (Intrinsics.f(cFACClaimExpense.f74926a.f272579a, transactionId)) {
                    l.j2(iVar, new CFACInsuranceExpenseDetailsScreen(new CFACInsuranceExpenseDetailsScreenContract$InputData(cFACClaimExpense.f74926a, ((e) iVar.t2()).f314427a.d, cFACClaimExpense.f74927b, cFACClaimExpense.f74928c, Long.valueOf(cFACClaimExpense.d), Long.valueOf(cFACClaimExpense.e), cFACClaimExpense.f, cFACClaimExpense.f74929g, true)), null, new yj2.b(iVar, cFACClaimExpense, 2), 1);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (obj3 instanceof CFACInsuranceAddExpensesItemMapper.AddExpenses) {
            i iVar2 = (i) ((g) r06.getValue());
            iVar2.getClass();
            iVar2.v2(new f(new CFACInsuranceClaimFlowContract$Step.SelectExpenses(true)));
        }
        return Unit.f186387a;
    }
}
