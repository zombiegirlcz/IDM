package ukk;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.offers.PlanPartnersOffersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanPartnersOffersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PlanPartnersOffersScreen planPartnersOffersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planPartnersOffersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.d();
        String listId = model.f52708a;
        p pVar = (p) iVarE3;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "id_subheader_student_blocked")) {
            pVar.C1(new KompotPricingPlanFeatureConfig.StudentDestination(0));
        }
        return Unit.f186387a;
    }
}
