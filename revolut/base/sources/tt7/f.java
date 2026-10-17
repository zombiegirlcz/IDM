package tt7;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.insurance_credit.impl.ui.screen.details.InsuranceDetailsScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.details.InsuranceDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InsuranceDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InsuranceDetailsScreen insuranceDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = insuranceDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xs7.e eVar;
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        String listId = model.f51832a;
        Object obj3 = model.o;
        com.revolut.feature.insurance_credit.impl.ui.screen.details.b bVar = (com.revolut.feature.insurance_credit.impl.ui.screen.details.b) nVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        xs7.c cVar = obj3 instanceof xs7.c ? (xs7.c) obj3 : null;
        if (cVar != null && (eVar = cVar.f308429a) != null) {
            if (!(eVar instanceof xs7.d)) {
                throw new NoWhenBranchMatchedException();
            }
            oki.h.v2(bVar.u, new InsuranceDetailsScreenContract$ModalStep.PolicyInfo(((xs7.d) eVar).f308431a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
