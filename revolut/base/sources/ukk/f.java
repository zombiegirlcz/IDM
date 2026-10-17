package ukk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.offers.PlanPartnersOffersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ PlanPartnersOffersScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PlanPartnersOffersScreen planPartnersOffersScreen, Continuation continuation) {
        super(2, continuation);
        this.u = planPartnersOffersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVar = (p) this.u.d();
        pVar.getClass();
        pVar.n2(new u83.f(pVar, null, 11), new whi.b(6));
        return Unit.f186387a;
    }
}
