package cnk;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanPageLayoutTerms;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$InfoBottomSheet;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.info_bottom_sheet.PricingPlanInfoBottomSheetScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ox0.b0;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements cli.n {

    @NotNull
    private static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dnk.l f25463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dok.e f25464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanInfoBottomSheetScreenContract$InputData f25465c;

    public o(dnk.l iconMapper, dok.e backgroundMapper, com.revolut.retail.feature.pricing_plans.ui.impl.footer.e footerMapper, PricingPlanInfoBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(backgroundMapper, "backgroundMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f25463a = iconMapper;
        this.f25464b = backgroundMapper;
        this.f25465c = inputData;
    }

    public static n6 a(PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.Action action, boolean z) {
        return m6.c(n6.Companion, new TextClause(action.f102782b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), z ? LargeActionButton.ButtonStyle.f58725a : LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, action, 508);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PricingPlanInfoBottomSheetScreenContract$InputData pricingPlanInfoBottomSheetScreenContract$InputData = this.f25465c;
        aw0.i eVar = null;
        textClauseA = null;
        TextClause textClauseA = null;
        TextClause textClause = new TextClause(pricingPlanInfoBottomSheetScreenContract$InputData.f103620b.f102779b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        PlansDashboardLayout$PlanPageLayout$InfoBottomSheet plansDashboardLayout$PlanPageLayout$InfoBottomSheet = pricingPlanInfoBottomSheetScreenContract$InputData.f103620b;
        lw0.a aVar = new lw0.a(textClause, new TextClause(plansDashboardLayout$PlanPageLayout$InfoBottomSheet.f102780c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new lw0.c(new GlyphImage(this.f25463a.a(plansDashboardLayout$PlanPageLayout$InfoBottomSheet.f102778a), null, null, 6)), null, false, 24);
        PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.Background background = plansDashboardLayout$PlanPageLayout$InfoBottomSheet.f;
        AnimatedBackgroundType animatedBackgroundTypeA = background != null ? this.f25464b.a(background.f102784b) : null;
        List listV0 = d0.V0(plansDashboardLayout$PlanPageLayout$InfoBottomSheet.d, 2);
        if (!listV0.isEmpty()) {
            PlanPageLayoutTerms planPageLayoutTerms = plansDashboardLayout$PlanPageLayout$InfoBottomSheet.e;
            if (planPageLayoutTerms != null) {
                if (kotlin.text.d0.W(planPageLayoutTerms.f102710a)) {
                    planPageLayoutTerms = null;
                }
                if (planPageLayoutTerms != null) {
                    textClauseA = com.revolut.retail.feature.pricing_plans.ui.impl.footer.e.a(pricingPlanInfoBottomSheetScreenContract$InputData.f103619a, planPageLayoutTerms);
                }
            }
            TextClause textClause2 = textClauseA;
            eVar = listV0.size() == 1 ? new aw0.e(false, textClause2, b0.BELOW_BUTTONS, a((PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.Action) listV0.get(0), true), null, null, 49) : new aw0.h(false, a((PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.Action) listV0.get(0), true), a((PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.Action) listV0.get(1), false), textClause2, b0.BELOW_BUTTONS, null, 97);
        }
        return new k(aVar, animatedBackgroundTypeA, eVar);
    }
}
