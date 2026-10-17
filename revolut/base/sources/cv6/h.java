package cv6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.FreelancerAcquiringPaymentFiltersScreen;
import cul.n2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerAcquiringPaymentFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FreelancerAcquiringPaymentFiltersScreen freelancerAcquiringPaymentFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerAcquiringPaymentFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        String listId = model.f53228a;
        com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.a aVar2 = (com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.a) lVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ITEM_ID_SEE_ALL_CURRENCIES")) {
            aVar2.H2(aVar2.f73726t, new n2(11));
        }
        return Unit.f186387a;
    }
}
