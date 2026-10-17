package knk;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.PlanSingleOfferScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ PlanSingleOfferScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PlanSingleOfferScreen planSingleOfferScreen, Continuation continuation) {
        super(2, continuation);
        this.u = planSingleOfferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a) this.u.d()).f103634t.a();
        return Unit.f186387a;
    }
}
