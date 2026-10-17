package v17;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.impl.ui.sales.filters.screen.sales_filters.FreelancerSalesFiltersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerSalesFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(FreelancerSalesFiltersScreen freelancerSalesFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerSalesFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarH3 = this.v.T2();
        String listId = model.f53228a;
        r rVar = (r) mVarH3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "SEE_ALL_CURRENCIES_BUTTON")) {
            rVar.x2(new v0k.g(12));
        }
        return Unit.f186387a;
    }
}
