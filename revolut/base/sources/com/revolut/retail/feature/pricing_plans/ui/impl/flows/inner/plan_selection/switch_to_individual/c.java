package com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.PlanSelectionCoreFlowContract$PlanSelectionParams;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual.SwitchToIndividualPromptControllerModelExtension;
import ffk.h;
import hha.d;
import hha.i;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lha.g;
import n87.r;
import nc1.j;
import nhg.f0;
import rd0.e;
import vkm.j2;
import vkm.q;
import yji.n;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends SwitchToIndividualPromptControllerModelExtension {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cha.b f103103l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nhk.b f103104m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j2 f103105n;

    public c(cha.b familyPlansInteractor, nhk.b switchToIndividualPromptBuilder) {
        Intrinsics.checkNotNullParameter(familyPlansInteractor, "familyPlansInteractor");
        Intrinsics.checkNotNullParameter(switchToIndividualPromptBuilder, "switchToIndividualPromptBuilder");
        this.f103103l = familyPlansInteractor;
        this.f103104m = switchToIndividualPromptBuilder;
        this.f103105n = q.c(SwitchToIndividualPromptControllerModelExtension.SwitchToIndividualPromptState.NotRequired.f103100a);
    }

    @Override // yji.n
    public final void D2() {
        j2 j2Var;
        Object value;
        do {
            j2Var = this.f103105n;
            value = j2Var.getValue();
        } while (!j2Var.h(value, SwitchToIndividualPromptControllerModelExtension.SwitchToIndividualPromptState.Loading.f103099a));
        n.j2(this, e.e(mo3.a.g(nim.a.v(((h) this.f103103l).f(w4l.h.f294642c), new f0(4)), null, new r(29), 1), h0.f322473a, new a(3, null)), null, new b(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual.SwitchToIndividualPromptControllerModelExtension
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof nhk.e
            if (r0 == 0) goto L13
            r0 = r6
            nhk.e r0 = (nhk.e) r0
            int r1 = r0.f215509w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f215509w = r1
            goto L18
        L13:
            nhk.e r0 = new nhk.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f215509w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            lfg.d0 r6 = new lfg.d0
            r2 = 18
            vkm.j2 r4 = r5.f103105n
            r6.<init>(r4, r2)
            r0.f215509w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            boolean r0 = r6 instanceof com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual.SwitchToIndividualPromptControllerModelExtension.SwitchToIndividualPromptState.RequiredForUpgrade
            if (r0 != 0) goto L49
            r6 = 0
        L49:
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual.SwitchToIndividualPromptControllerModelExtension$SwitchToIndividualPromptState$RequiredForUpgrade r6 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual.SwitchToIndividualPromptControllerModelExtension.SwitchToIndividualPromptState.RequiredForUpgrade) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual.c.Z2(gim.c):java.lang.Object");
    }

    @Override // com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual.SwitchToIndividualPromptControllerModelExtension
    public final void b3(d currentPlan, PlanSelectionCoreFlowContract$PlanSelectionParams planSelectionParams, g familyPlanInfo, je2.d onResult) {
        Clause clauseP;
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(planSelectionParams, "planSelectionParams");
        Intrinsics.checkNotNullParameter(familyPlanInfo, "familyPlanInfo");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        this.f103104m.getClass();
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(familyPlanInfo, "familyPlanInfo");
        Intrinsics.checkNotNullParameter(planSelectionParams, "planSelectionParams");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.plan_upgrade_switch_to_individual_prompt_title, null, null, 14);
        d dVar = planSelectionParams.f103079a;
        i iVar = planSelectionParams.f103080b;
        int i = familyPlanInfo.f195207h ? R$string.plan_upgrade_switch_to_individual_prompt_subtitle : R$string.plan_upgrade_switch_to_individual_prompt_redesign_subtitle;
        Clause clauseD = dok.g.d(currentPlan, null);
        String str = familyPlanInfo.a().e;
        if (str == null) {
            str = "";
        }
        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Clause clauseD2 = dok.g.d(dVar, null);
        int i2 = nhk.a.f215507a[iVar.ordinal()];
        if (i2 == 1) {
            hha.g gVarC = dok.g.c(dVar);
            clauseP = c8g.c.p(gVarC != null ? dok.g.f(gVarC) : null);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            hha.g gVarB = dok.g.b(dVar);
            clauseP = c8g.c.p(gVarB != null ? dok.g.f(gVarB) : null);
        }
        String str2 = null;
        LargeActionButton.ButtonStyle buttonStyle = null;
        N2(new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("SWITCH_TO_INDIVIDUAL_PROMPT", textLocalisedClause, new TextLocalisedClause(i, v.k(clauseD, textClause, clauseD2, clauseP), null, 12), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D051", null, null, null, 30), null), PromptMarketingContentDelegate.Model.BackgroundType.Default.f53100a, pd.BLACK, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.plan_upgrade_switch_to_individual_prompt_switch_cta, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(familyPlanInfo.f195207h ? R$string.plan_upgrade_switch_to_individual_prompt_stay_cta : R$string.plan_upgrade_switch_to_individual_prompt_stay_on_plan, u.c(dok.g.d(currentPlan, null)), null, 12), (ResourceImage) null, buttonStyle, false, str2, 62), null, null, buttonStyle, null, str2, null, null, null, null, null, 2095488), null, true, false, null, 26)), ModalDestination.Style.POPUP.f98311a, new j(this, onResult, 9));
    }
}
