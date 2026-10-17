package fmk;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreenContract$Action;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanRevPointsCardsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PlanRevPointsCardsScreen planRevPointsCardsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planRevPointsCardsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.S.getValue();
        Object obj3 = model.i;
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.a aVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.a) gVar;
        aVar2.getClass();
        if (obj3 instanceof PlanRevPointsCardsScreenContract$Action) {
            PlanRevPointsCardsScreenContract$Action planRevPointsCardsScreenContract$Action = (PlanRevPointsCardsScreenContract$Action) obj3;
            if (planRevPointsCardsScreenContract$Action instanceof PlanRevPointsCardsScreenContract$Action.IncreaseRate) {
                aVar2.n2(new k(aVar2, ((PlanRevPointsCardsScreenContract$Action.IncreaseRate) obj3).f103529a, null), new whi.b(6));
            } else {
                if (!planRevPointsCardsScreenContract$Action.equals(PlanRevPointsCardsScreenContract$Action.NavigateRevPoints.f103530a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2.n2(new l(aVar2, null), new whi.b(6));
            }
        }
        return Unit.f186387a;
    }
}
