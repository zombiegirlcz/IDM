package m3g;

import com.revolut.core.ui_kit.delegates.NewProductSmallDelegate;
import com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.u1;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesSearchResultsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TravelExperiencesSearchResultsScreen travelExperiencesSearchResultsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesSearchResultsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((NewProductSmallDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        NewProductSmallDelegate.Model model = (NewProductSmallDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarI3 = this.v.T2();
        Intrinsics.h(model);
        com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b bVar = (com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b) rVarI3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.e;
        u1 u1Var = obj3 instanceof u1 ? (u1) obj3 : null;
        if (model.f52792a.equals("REV_POINTS_BANNER_ID") && u1Var != null) {
            Intrinsics.checkNotNullParameter(u1Var, "<this>");
            if (u1Var.d != null && u1Var.f201462c != null) {
                bVar.C1(new BridgeDestination(new FeatureCommand(new PricingPlanFeatureConfig.UpgradeToAnyPlan(xfa.b.REV_POINTS, null, 14))));
            }
        }
        return Unit.f186387a;
    }
}
