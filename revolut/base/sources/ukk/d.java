package ukk;

import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetDescriptor;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.dialog.PricingPlanBottomSheetBEDrivenScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.dialog.PricingPlanBottomSheetBEDrivenScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.partner_offers.kompot.offers.PlanPartnersOffersScreen;
import ggc.g0;
import ggc.h0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanPartnersOffersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PlanPartnersOffersScreen planPartnersOffersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planPartnersOffersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CenteredContentTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CenteredContentTileDelegate.Model model = (CenteredContentTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.d();
        Object obj3 = model.i;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.rewards.api.model.rewards.RewardsPreview");
        g0 rewardsPreview = (g0) obj3;
        p pVar = (p) iVarE3;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(rewardsPreview, "partner");
        h0 h0VarA = rewardsPreview.a();
        boolean z = h0VarA.f;
        if (rewardsPreview.b() && !z) {
            pVar.C1(new KompotPricingPlanFeatureConfig.StudentDestination(0));
        } else if (z) {
            pVar.f280789s.getClass();
            Intrinsics.checkNotNullParameter(rewardsPreview, "rewardsPreview");
            pVar.C1(u0.b(skk.a.a(rewardsPreview.a().f143631a)));
        } else {
            yji.l.j2(pVar, new PricingPlanBottomSheetBEDrivenScreen(new PricingPlanBottomSheetBEDrivenScreenContract$InputData(new PricingPlanBottomSheetDescriptor.PartnerOfferDetail(h0VarA.f143631a), pVar.o.f103456a)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
            Unit unit = Unit.f186387a;
        }
        return Unit.f186387a;
    }
}
