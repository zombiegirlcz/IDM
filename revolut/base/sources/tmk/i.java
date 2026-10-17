package tmk;

import cli.y;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanOfferPromptPresentAction;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_bottom_sheet.PlanOfferBottomSheetScreenContract$InputData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wik.m;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends oki.h implements g {
    public final PlanOfferBottomSheetScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f272236p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f272237q;

    public i(l stateMapper, PlanOfferBottomSheetScreenContract$InputData inputData, m pricingPlanOffersInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanOffersInteractor, "pricingPlanOffersInteractor");
        this.o = inputData;
        this.f272236p = pricingPlanOffersInteractor;
        this.f272237q = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        List list = this.o.f103589a.f102847a.f;
        if (list != null) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                l2(new tgk.f(this, (PlanOfferPromptPresentAction) it8.next(), null, 18), new yi5.b(26));
            }
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f272237q;
    }
}
