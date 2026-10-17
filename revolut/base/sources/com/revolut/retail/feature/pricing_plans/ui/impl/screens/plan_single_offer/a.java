package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$Button;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$ClickAction;
import dnk.d;
import ffk.t;
import ggk.x0;
import gim.i;
import hx7.e;
import igk.o0;
import igk.p0;
import java.util.concurrent.CopyOnWriteArrayList;
import kj4.c;
import klf.a3;
import knk.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vii.b;
import vkm.j2;
import vkm.q;
import vkm.q0;
import wik.m;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements knk.h {
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f103630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f103631q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final dgk.a f103632r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f103633s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f103634t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(n stateMapper, m pricingPlanOffersInteractor, t pricingPlanInteractor, d benefitIdsMapper, dgk.a footerExtension, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pricingPlanOffersInteractor, "pricingPlanOffersInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(benefitIdsMapper, "benefitIdsMapper");
        Intrinsics.checkNotNullParameter(footerExtension, "footerExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = pricingPlanOffersInteractor;
        this.f103630p = pricingPlanInteractor;
        this.f103631q = benefitIdsMapper;
        this.f103632r = footerExtension;
        this.f103633s = featureToggleInteractor;
        this.f103634t = new b();
        this.u = mra.d.b(this, new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.v = e.a(this, new c(this, 8));
    }

    public static final Object I2(a aVar, PlansDashboardLayout$ClickAction plansDashboardLayout$ClickAction, i iVar) {
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.Upgrade) {
            Object objM2 = aVar.M2(iVar);
            return objM2 == fim.a.COROUTINE_SUSPENDED ? objM2 : Unit.f186387a;
        }
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.Skip) {
            aVar.C2(p0.f161269a);
        } else if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.OpenOnboardingPlanDashboard) {
            aVar.C2(o0.f161268a);
        } else if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.CancelDowngrade) {
            J2("CancelDowngrade");
        } else if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.Select) {
            J2("Select");
        } else if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.Expand) {
            J2("Expand");
        } else if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.OpenUrl) {
            J2("OpenUrl");
        } else if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.ShowPriceBreakdown) {
            J2("ShowPriceBreakdown");
        } else if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.CreditCardOrderCheckout) {
            J2("CreditCardOrderCheckout");
        } else {
            if (!(plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.ShowBottomSheet)) {
                throw new NoWhenBranchMatchedException();
            }
            J2("ShowBottomSheet");
        }
        return Unit.f186387a;
    }

    public static void J2(String str) {
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "PlanSingleOfferScreenModel", str.concat(" is not supported"), null, h0Var);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, nim.a.v(new q0(q.Q(this.f103634t, new a3(continuation, this, 1)), new knk.l(this, continuation, 1), 1), new knd.a(12)), null, null, new knk.l(this, continuation, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(ggk.f r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof knk.j
            if (r0 == 0) goto L13
            r0 = r6
            knk.j r0 = (knk.j) r0
            int r1 = r0.f186182w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f186182w = r1
            goto L18
        L13:
            knk.j r0 = new knk.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f186182w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            ffk.t r6 = r4.f103630p
            java.lang.String r5 = r5.f143711a
            efm.d0 r5 = r6.f(r5)
            r0.f186182w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            od0.i r6 = (od0.i) r6
            java.lang.Object r5 = r6.f224257a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a.K2(ggk.f, gim.c):java.lang.Object");
    }

    public final ggk.f L2() {
        return (ggk.f) ((f) ((j2) this.u.f22677a).getValue()).f186174a.getContent();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof knk.k
            if (r0 == 0) goto L13
            r0 = r5
            knk.k r0 = (knk.k) r0
            int r1 = r0.f186184x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f186184x = r1
            goto L18
        L13:
            knk.k r0 = new knk.k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f186184x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptionItem r0 = r0.u
            yhm.o.b(r5)
            goto L62
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            ggk.f r5 = r4.L2()
            if (r5 != 0) goto L3d
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L3d:
            cli.y r2 = r4.u
            java.lang.Object r2 = r2.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            knk.f r2 = (knk.f) r2
            com.revolut.data.model.Data r2 = r2.f186175b
            java.lang.Object r2 = r2.getContent()
            com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptionItem r2 = (com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptionItem) r2
            if (r2 != 0) goto L56
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L56:
            r0.u = r2
            r0.f186184x = r3
            java.lang.Object r5 = r4.K2(r5, r0)
            if (r5 != r1) goto L61
            return r1
        L61:
            r0 = r2
        L62:
            hha.d r5 = (hha.d) r5
            if (r5 != 0) goto L69
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L69:
            igk.n0 r1 = new igk.n0
            hha.i r2 = r0.f102747a
            com.revolut.feature.pricingplans.models.PricingPlanOffer r0 = r0.f102751h
            r1.<init>(r5, r2, r0)
            r4.C2(r1)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a.M2(gim.c):java.lang.Object");
    }

    public final void N2(String tag2) {
        PlansDashboardLayout$Button plansDashboardLayout$Button;
        PlansDashboardLayout$Button plansDashboardLayout$Button2;
        Intrinsics.checkNotNullParameter(tag2, "tag");
        ggk.f fVarL2 = L2();
        Continuation continuation = null;
        if (fVarL2 != null) {
            x0 x0Var = fVarL2.f;
            if (Intrinsics.f(tag2, "top_button")) {
                plansDashboardLayout$Button2 = x0Var.f143796a;
            } else {
                if (Intrinsics.f(tag2, "bottom_button")) {
                    plansDashboardLayout$Button2 = x0Var.f143797b;
                }
                plansDashboardLayout$Button = null;
            }
            plansDashboardLayout$Button = plansDashboardLayout$Button2;
        } else {
            plansDashboardLayout$Button = null;
        }
        if (plansDashboardLayout$Button != null) {
            l2(new knd.h0(this, tag2, plansDashboardLayout$Button, continuation, 3), new yi5.b(26));
            return;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "PlanSingleOfferScreenModel", p.a.p("button with ", tag2, " tag not found"), null, h0Var);
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
