package tmk;

import aw0.n6;
import aw0.o9;
import cli.n;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanOfferPromptLayout;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutButton;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutFooter;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutHyperText;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_bottom_sheet.PlanOfferBottomSheetScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nd.o;
import ox0.b0;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanOfferBottomSheetScreenContract$InputData f272239a;

    public l(o footerMapper, tjk.d hyperTextClauseBuilder, PlanOfferBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        Intrinsics.checkNotNullParameter(hyperTextClauseBuilder, "hyperTextClauseBuilder");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f272239a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        PricingPlanLayoutHyperText pricingPlanLayoutHyperText;
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PlanOfferPromptLayout planOfferPromptLayout = this.f272239a.f103589a.f102847a;
        PricingPlanLayoutFooter pricingPlanLayoutFooter = planOfferPromptLayout.d;
        PlanOfferPromptLayout.Content content = planOfferPromptLayout.f102691b;
        aw0.i hVar = null;
        hVar = null;
        hVar = null;
        List list = pricingPlanLayoutFooter != null ? pricingPlanLayoutFooter.f102834a : null;
        eyl.a aVar = new eyl.a(new TextClause(content.f102699b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), eyl.b.HEADING_3, R$attr.uikit_colorForeground, 2, 32);
        eyl.a aVar2 = new eyl.a(tjk.d.a(content.f102700c), eyl.b.BODY_2, R$attr.uikit_colorForeground, 5, 32);
        PricingPlanLayoutFooter pricingPlanLayoutFooter2 = planOfferPromptLayout.d;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            TextClause textClauseA = (pricingPlanLayoutFooter2 == null || (pricingPlanLayoutHyperText = pricingPlanLayoutFooter2.f102835b) == null) ? null : tjk.d.a(pricingPlanLayoutHyperText);
            PricingPlanLayoutButton pricingPlanLayoutButton = (PricingPlanLayoutButton) d0.e0(0, list);
            if (pricingPlanLayoutButton != null) {
                n6 n6VarA = k.a(pricingPlanLayoutButton);
                PricingPlanLayoutButton pricingPlanLayoutButton2 = (PricingPlanLayoutButton) d0.e0(1, list);
                n6 n6VarA2 = pricingPlanLayoutButton2 != null ? k.a(pricingPlanLayoutButton2) : null;
                hVar = n6VarA2 != null ? new aw0.h(false, n6VarA, n6VarA2, textClauseA, b0.BELOW_BUTTONS, null, 97) : new aw0.e(false, textClauseA, b0.BELOW_BUTTONS, n6VarA, null, null, 49);
            }
        }
        return new h(aVar, aVar2, hVar);
    }
}
