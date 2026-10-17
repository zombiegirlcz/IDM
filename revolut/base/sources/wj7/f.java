package wj7;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CFACInsuranceExpenseDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CFACInsuranceExpenseDetailsScreen cFACInsuranceExpenseDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cFACInsuranceExpenseDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.e3();
        String listId = model.f51781a;
        com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b bVar = (com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b) mVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        switch (listId.hashCode()) {
            case -1875147229:
                if (listId.equals("ID_START_DATE_ITEM")) {
                    m.C0(bVar, nj7.a.ADD_START_DATE);
                }
                break;
            case -855774100:
                if (listId.equals("ID_CANCELLATION_DATE_ITEM")) {
                    m.C0(bVar, nj7.a.ADD_CANCELLATION_DATE);
                }
                break;
            case -512402801:
                if (listId.equals("ID_TRIP_EVENT_PURPOSE_ITEM")) {
                    m.C0(bVar, nj7.a.SELECT_PURPOSE);
                }
                break;
            case 1308811977:
                if (listId.equals("ID_CANCELLED_BY_ITEM")) {
                    m.C0(bVar, nj7.a.SELECT_CANCELLER);
                }
                break;
        }
        return Unit.f186387a;
    }
}
