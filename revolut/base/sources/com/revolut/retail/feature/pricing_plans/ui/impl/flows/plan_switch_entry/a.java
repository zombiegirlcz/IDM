package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry;

import d8l.d;
import ffk.t;
import jgk.v;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pe2.l;
import pij.d1;
import pik.b;
import pik.c;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements b {
    public final t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pik.h f103253p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f103254q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f103255r;

    public a(t pricingPlanInteractor, pik.h promptScreenProvider, v termsNavigationCommandsProvider) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(promptScreenProvider, "promptScreenProvider");
        Intrinsics.checkNotNullParameter(termsNavigationCommandsProvider, "termsNavigationCommandsProvider");
        this.o = pricingPlanInteractor;
        this.f103253p = promptScreenProvider;
        this.f103254q = termsNavigationCommandsProvider;
        this.f103255r = d.a(this, new c(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a r4, com.revolut.feature.pricingplans.models.PricingPlanSubscription r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof pik.e
            if (r0 == 0) goto L13
            r0 = r6
            pik.e r0 = (pik.e) r0
            int r1 = r0.f236611x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f236611x = r1
            goto L18
        L13:
            pik.e r0 = new pik.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f236611x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.pricingplans.models.PricingPlanSubscription r5 = r0.u
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            pik.h r6 = r4.f103253p
            r0.u = r5
            r0.f236611x = r3
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData r6 = (com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData) r6
            yki.i r4 = r4.f103255r
            com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.PlanSwitchToAnnualEntryFlowContract$Step$Prompt r0 = new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.PlanSwitchToAnnualEntryFlowContract$Step$Prompt
            hha.d r1 = r5.f81129a
            lha.o r5 = r5.f81142t
            if (r5 == 0) goto L4e
            goto L4f
        L4e:
            r3 = 0
        L4f:
            r0.<init>(r6, r1, r3)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r5 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.z2(r4, r0, r5)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a.I2(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a, com.revolut.feature.pricingplans.models.PricingPlanSubscription, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new l(this, null, 8), new d1(this, 1));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103255r;
    }
}
