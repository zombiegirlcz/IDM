package com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$ClickAction;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptionItem;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptions;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$InfoBottomSheet;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlowContract$ModalStep;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlowContract$PlanPagerItem;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.c;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_error_page.PlanErrorPageScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_loading_page.PlanLoadingPageScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_loading_page.PlanLoadingPageScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.PlanPageScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.PlanPageScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.info_bottom_sheet.PricingPlanInfoBottomSheetScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.info_bottom_sheet.PricingPlanInfoBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_price_breakdown.PlanPriceBreakdownScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_price_breakdown.PlanPriceBreakdownScreenContract$InputData;
import enk.f;
import enk.o;
import ffk.t;
import ggk.g1;
import ghk.a0;
import ghk.b0;
import ghk.i;
import ghk.j;
import ghk.m;
import ghk.n;
import ghk.r;
import ghk.v;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import oki.h;
import vkm.j2;
import vkm.q;
import vkm.q0;
import wli.x;
import yji.l;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends h implements i {
    public final ajk.b A;
    public final gte.a B;
    public final vii.b C;
    public final y D;
    public final ali.b E;
    public final com.revolut.kompot.navigable.vc.modal.a F;
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PlanPagerFlowContract$InputData f103068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f103069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f103070r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final egk.e f103071s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b0 f103072t;
    public final o u;
    public final o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o f103073w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.a f103074x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final yik.d f103075y;
    public final dgk.a z;

    public d(e stateMapper, PlanPagerFlowContract$InputData inputData, x deeplinkHandler, t pricingPlanInteractor, egk.e pricingPlansUiInteractor, b0 planSelector, o planPageScrollEventsDispatcher, o planPageVisibilityEventsObserver, o planPageVisibilityEventsDispatcher, com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.a planFilter, yik.d sourceMapper, dgk.a footerExtension, ajk.b outOfAppNavigationProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlansUiInteractor, "pricingPlansUiInteractor");
        Intrinsics.checkNotNullParameter(planSelector, "planSelector");
        Intrinsics.checkNotNullParameter(planPageScrollEventsDispatcher, "planPageScrollEventsDispatcher");
        Intrinsics.checkNotNullParameter(planPageVisibilityEventsObserver, "planPageVisibilityEventsObserver");
        Intrinsics.checkNotNullParameter(planPageVisibilityEventsDispatcher, "planPageVisibilityEventsDispatcher");
        Intrinsics.checkNotNullParameter(planFilter, "planFilter");
        Intrinsics.checkNotNullParameter(sourceMapper, "sourceMapper");
        Intrinsics.checkNotNullParameter(footerExtension, "footerExtension");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = stateMapper;
        this.f103068p = inputData;
        this.f103069q = deeplinkHandler;
        this.f103070r = pricingPlanInteractor;
        this.f103071s = pricingPlansUiInteractor;
        this.f103072t = planSelector;
        this.u = planPageScrollEventsDispatcher;
        this.v = planPageVisibilityEventsObserver;
        this.f103073w = planPageVisibilityEventsDispatcher;
        this.f103074x = planFilter;
        this.f103075y = sourceMapper;
        this.z = footerExtension;
        this.A = outOfAppNavigationProvider;
        this.B = featureToggleInteractor;
        this.C = new vii.b();
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        Data data3 = new Data(null, null, true, 3, null);
        Data data4 = new Data(null, null, true, 3, null);
        Data data5 = new Data(null, null, true, 3, null);
        PlanPagerFlowContract$PlanPagerItem.PlanLoadingItem planLoadingItem = PlanPagerFlowContract$PlanPagerItem.PlanLoadingItem.f103058a;
        this.D = mra.d.b(this, new j(u.c(planLoadingItem), planLoadingItem.getF103057c(), data, data2, data3, data4, data5, true), stateMapper, null, false, 12);
        final int i = 0;
        this.E = s.b(this, new Function2(this) { // from class: ghk.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d f143979b;

            {
                this.f143979b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar = this.f143979b;
                        PlanPagerFlowContract$InputData planPagerFlowContract$InputData = dVar.f103068p;
                        ali.b PagerCoordinator = (ali.b) obj2;
                        PlanPagerFlowContract$PlanPagerItem planPage = (PlanPagerFlowContract$PlanPagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(planPage, "planPage");
                        if (planPage instanceof PlanPagerFlowContract$PlanPagerItem.PlanLoadingItem) {
                            return new PlanLoadingPageScreen(new PlanLoadingPageScreenContract$InputData(planPagerFlowContract$InputData.f103048g));
                        }
                        if (!(planPage instanceof PlanPagerFlowContract$PlanPagerItem.PlanItem)) {
                            if (!(planPage instanceof PlanPagerFlowContract$PlanPagerItem.PlanErrorItem)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            PlanErrorPageScreen planErrorPageScreen = new PlanErrorPageScreen();
                            q block = new q(dVar, 3);
                            Intrinsics.checkNotNullParameter(block, "block");
                            planErrorPageScreen.H = block;
                            return planErrorPageScreen;
                        }
                        PlanPagerFlowContract$PlanPagerItem.PlanItem planItem = (PlanPagerFlowContract$PlanPagerItem.PlanItem) planPage;
                        PlanPageScreen planPageScreen = new PlanPageScreen(new PlanPageScreenContract$InputData(planItem.f103055a, planPagerFlowContract$InputData.f103047c, planItem.f103056b, planPagerFlowContract$InputData.d.f103060b, planPagerFlowContract$InputData.f103048g, planPagerFlowContract$InputData.i, ((jte.d) dVar.B).c(PricingPlansUiApi$Toggles.PlanDashboardInterimRevamp.f102635c)));
                        q block2 = new q(dVar, 2);
                        Intrinsics.checkNotNullParameter(block2, "block");
                        planPageScreen.H = block2;
                        return planPageScreen;
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        PlanPagerFlowContract$ModalStep step = (PlanPagerFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (step instanceof PlanPagerFlowContract$ModalStep.PlanPriceBreakdown) {
                            PlanPagerFlowContract$ModalStep.PlanPriceBreakdown planPriceBreakdown = (PlanPagerFlowContract$ModalStep.PlanPriceBreakdown) step;
                            return new PlanPriceBreakdownScreen(new PlanPriceBreakdownScreenContract$InputData(planPriceBreakdown.f103053b, planPriceBreakdown.f103052a));
                        }
                        if (!(step instanceof PlanPagerFlowContract$ModalStep.InfoBottomSheet)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PlanPagerFlowContract$ModalStep.InfoBottomSheet infoBottomSheet = (PlanPagerFlowContract$ModalStep.InfoBottomSheet) step;
                        String str = infoBottomSheet.f103050a;
                        PlansDashboardLayout$PlanPageLayout$InfoBottomSheet plansDashboardLayout$PlanPageLayout$InfoBottomSheet = infoBottomSheet.f103051b;
                        com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar2 = this.f143979b;
                        PricingPlanInfoBottomSheetScreen pricingPlanInfoBottomSheetScreen = new PricingPlanInfoBottomSheetScreen(new PricingPlanInfoBottomSheetScreenContract$InputData(str, plansDashboardLayout$PlanPageLayout$InfoBottomSheet, dVar2.f103068p.f103048g));
                        q block3 = new q(dVar2, 1);
                        Intrinsics.checkNotNullParameter(block3, "block");
                        pricingPlanInfoBottomSheetScreen.H = block3;
                        return pricingPlanInfoBottomSheetScreen;
                }
            }
        });
        final int i2 = 1;
        this.F = hx7.e.a(this, new Function2(this) { // from class: ghk.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d f143979b;

            {
                this.f143979b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar = this.f143979b;
                        PlanPagerFlowContract$InputData planPagerFlowContract$InputData = dVar.f103068p;
                        ali.b PagerCoordinator = (ali.b) obj2;
                        PlanPagerFlowContract$PlanPagerItem planPage = (PlanPagerFlowContract$PlanPagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(planPage, "planPage");
                        if (planPage instanceof PlanPagerFlowContract$PlanPagerItem.PlanLoadingItem) {
                            return new PlanLoadingPageScreen(new PlanLoadingPageScreenContract$InputData(planPagerFlowContract$InputData.f103048g));
                        }
                        if (!(planPage instanceof PlanPagerFlowContract$PlanPagerItem.PlanItem)) {
                            if (!(planPage instanceof PlanPagerFlowContract$PlanPagerItem.PlanErrorItem)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            PlanErrorPageScreen planErrorPageScreen = new PlanErrorPageScreen();
                            q block = new q(dVar, 3);
                            Intrinsics.checkNotNullParameter(block, "block");
                            planErrorPageScreen.H = block;
                            return planErrorPageScreen;
                        }
                        PlanPagerFlowContract$PlanPagerItem.PlanItem planItem = (PlanPagerFlowContract$PlanPagerItem.PlanItem) planPage;
                        PlanPageScreen planPageScreen = new PlanPageScreen(new PlanPageScreenContract$InputData(planItem.f103055a, planPagerFlowContract$InputData.f103047c, planItem.f103056b, planPagerFlowContract$InputData.d.f103060b, planPagerFlowContract$InputData.f103048g, planPagerFlowContract$InputData.i, ((jte.d) dVar.B).c(PricingPlansUiApi$Toggles.PlanDashboardInterimRevamp.f102635c)));
                        q block2 = new q(dVar, 2);
                        Intrinsics.checkNotNullParameter(block2, "block");
                        planPageScreen.H = block2;
                        return planPageScreen;
                    default:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        PlanPagerFlowContract$ModalStep step = (PlanPagerFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (step instanceof PlanPagerFlowContract$ModalStep.PlanPriceBreakdown) {
                            PlanPagerFlowContract$ModalStep.PlanPriceBreakdown planPriceBreakdown = (PlanPagerFlowContract$ModalStep.PlanPriceBreakdown) step;
                            return new PlanPriceBreakdownScreen(new PlanPriceBreakdownScreenContract$InputData(planPriceBreakdown.f103053b, planPriceBreakdown.f103052a));
                        }
                        if (!(step instanceof PlanPagerFlowContract$ModalStep.InfoBottomSheet)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PlanPagerFlowContract$ModalStep.InfoBottomSheet infoBottomSheet = (PlanPagerFlowContract$ModalStep.InfoBottomSheet) step;
                        String str = infoBottomSheet.f103050a;
                        PlansDashboardLayout$PlanPageLayout$InfoBottomSheet plansDashboardLayout$PlanPageLayout$InfoBottomSheet = infoBottomSheet.f103051b;
                        com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar2 = this.f143979b;
                        PricingPlanInfoBottomSheetScreen pricingPlanInfoBottomSheetScreen = new PricingPlanInfoBottomSheetScreen(new PricingPlanInfoBottomSheetScreenContract$InputData(str, plansDashboardLayout$PlanPageLayout$InfoBottomSheet, dVar2.f103068p.f103048g));
                        q block3 = new q(dVar2, 1);
                        Intrinsics.checkNotNullParameter(block3, "block");
                        pricingPlanInfoBottomSheetScreen.H = block3;
                        return pricingPlanInfoBottomSheetScreen;
                }
            }
        });
    }

    public static q0 N2(vkm.d dVar, String str) {
        return com.revolut.data.database.models.openbanking.d.y("PlanPagerFlowModel", str, dVar);
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.E;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.C, new g6f.l(continuation, this, 5)), null, null, new ghk.y(this, continuation, 0), 3);
    }

    public final hha.d I2() {
        String strK2 = K2();
        List list = (List) ((j) ((j2) this.D.f22677a).getValue()).f143961c.getContent();
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((hha.d) next).f152287a, strK2)) {
                obj2 = next;
                break;
            }
        }
        return (hha.d) obj2;
    }

    public final PlansDashboardLayout$PlanPageLayout$BillingOptionItem J2() {
        od0.i iVar = (od0.i) ((j) ((j2) this.D.f22677a).getValue()).f.getContent();
        PlansDashboardLayout$PlanPageLayout$BillingOptionItem plansDashboardLayout$PlanPageLayout$BillingOptionItem = iVar != null ? (PlansDashboardLayout$PlanPageLayout$BillingOptionItem) iVar.f224257a : null;
        if (plansDashboardLayout$PlanPageLayout$BillingOptionItem == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "PlanPagerFlowModel", "no billing option selected", null, h0Var);
        }
        return plansDashboardLayout$PlanPageLayout$BillingOptionItem;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.F;
    }

    public final String K2() {
        String str;
        g1 g1Var = (g1) ((j) ((j2) this.D.f22677a).getValue()).e.getContent();
        if (g1Var == null || (str = g1Var.f143718a) == null) {
            throw new IllegalStateException("no plan selected");
        }
        return str;
    }

    public final g1 L2() {
        g1 g1Var = (g1) ((j) ((j2) this.D.f22677a).getValue()).e.getContent();
        if (g1Var == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "PlanPagerFlowModel", "no plan selected", null, h0Var);
        }
        return g1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.revolut.feature.pricingplans.models.PricingPlanOffer] */
    public final void M2(PlansDashboardLayout$ClickAction plansDashboardLayout$ClickAction) {
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.Select) {
            hha.d dVarI2 = I2();
            if (dVarI2 != null) {
                PlansDashboardLayout$PlanPageLayout$BillingOptionItem plansDashboardLayout$PlanPageLayout$BillingOptionItemJ2 = J2();
                C2(new n(dVarI2, plansDashboardLayout$PlanPageLayout$BillingOptionItemJ2 != null ? plansDashboardLayout$PlanPageLayout$BillingOptionItemJ2.f102747a : null, plansDashboardLayout$PlanPageLayout$BillingOptionItemJ2 != null ? plansDashboardLayout$PlanPageLayout$BillingOptionItemJ2.f102751h : null));
                return;
            }
            return;
        }
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.Upgrade) {
            g1 g1VarL2 = L2();
            if (g1VarL2 != null) {
                C2(new m(g1VarL2.f143718a, g1VarL2));
                return;
            }
            return;
        }
        boolean z = plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.ShowBottomSheet;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.F;
        if (z) {
            PlansDashboardLayout$ClickAction.ShowBottomSheet showBottomSheet = (PlansDashboardLayout$ClickAction.ShowBottomSheet) plansDashboardLayout$ClickAction;
            g1 g1VarL22 = L2();
            if (g1VarL22 != null) {
                h.v2(aVar, new PlanPagerFlowContract$ModalStep.InfoBottomSheet(g1VarL22.f143718a, showBottomSheet.f102741a), bottom_dialog);
                return;
            }
            return;
        }
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.Expand) {
            String planId = K2();
            o oVar = this.u;
            oVar.getClass();
            Intrinsics.checkNotNullParameter(planId, "planId");
            oVar.f127847c.k(new f(planId));
            H2(this.D, new r(0));
            return;
        }
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.OpenUrl) {
            l2(new v(this, ((PlansDashboardLayout$ClickAction.OpenUrl) plansDashboardLayout$ClickAction).f102739a, pricingPlanOffer, 1), new yi5.b(26));
            return;
        }
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.Skip) {
            C2(c.b.f103067a);
            return;
        }
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.CancelDowngrade) {
            C2(c.a.f103066a);
            return;
        }
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.ShowPriceBreakdown) {
            g1 g1VarL23 = L2();
            if (g1VarL23 == null) {
                throw new IllegalStateException("No plan layout available when handling click on PlanPriceBreakdown");
            }
            PlansDashboardLayout$PlanPageLayout$BillingOptionItem plansDashboardLayout$PlanPageLayout$BillingOptionItemJ22 = J2();
            if (plansDashboardLayout$PlanPageLayout$BillingOptionItemJ22 == null) {
                throw new IllegalStateException("No selected billing when handling click on PlanPriceBreakdown");
            }
            hha.o oVar2 = plansDashboardLayout$PlanPageLayout$BillingOptionItemJ22.f102749c;
            if (oVar2 == null) {
                throw new IllegalStateException("No charge when handling click on PlanPriceBreakdown");
            }
            h.v2(aVar, new PlanPagerFlowContract$ModalStep.PlanPriceBreakdown(oVar2, g1VarL23.f143719b), bottom_dialog);
            return;
        }
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.CreditCardOrderCheckout) {
            hha.d dVarI22 = I2();
            if (dVarI22 != null) {
                PlansDashboardLayout$PlanPageLayout$BillingOptionItem plansDashboardLayout$PlanPageLayout$BillingOptionItemJ23 = J2();
                C2(new ghk.l(dVarI22, plansDashboardLayout$PlanPageLayout$BillingOptionItemJ23 != null ? plansDashboardLayout$PlanPageLayout$BillingOptionItemJ23.f102747a : null, plansDashboardLayout$PlanPageLayout$BillingOptionItemJ23 != null ? plansDashboardLayout$PlanPageLayout$BillingOptionItemJ23.f102751h : 0));
                return;
            }
            return;
        }
        if (!(plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.OpenOnboardingPlanDashboard)) {
            throw new NoWhenBranchMatchedException();
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "PlanPagerFlowModel", "OpenOnboardingPlanDashboard is not supported", null, h0Var);
    }

    public final q0 O2() {
        efm.r rVarV;
        boolean z = this.f103068p.e;
        t tVar = this.f103070r;
        if (z) {
            rVarV = new ufm.i(tVar.y(), new ge6.j(13, new r(2)), 1).x();
        } else {
            rVarV = tVar.v(w4l.h.f294642c);
        }
        Intrinsics.h(rVarV);
        return N2(rd0.e.b(rVarV), "observeSubscription");
    }

    public final void P2() {
        PlansDashboardLayout$PlanPageLayout$BillingOptions plansDashboardLayout$PlanPageLayout$BillingOptions;
        y yVar = this.D;
        g1 g1Var = (g1) ((j) ((j2) yVar.f22677a).getValue()).e.getContent();
        Object obj2 = null;
        List list = (g1Var == null || (plansDashboardLayout$PlanPageLayout$BillingOptions = g1Var.k) == null) ? null : plansDashboardLayout$PlanPageLayout$BillingOptions.d;
        if (list == null) {
            list = f0.f322471a;
        }
        if (list.isEmpty()) {
            H2(yVar, new r(3));
            return;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (((PlansDashboardLayout$PlanPageLayout$BillingOptionItem) next).f102750g) {
                obj2 = next;
                break;
            }
        }
        PlansDashboardLayout$PlanPageLayout$BillingOptionItem plansDashboardLayout$PlanPageLayout$BillingOptionItem = (PlansDashboardLayout$PlanPageLayout$BillingOptionItem) obj2;
        if (plansDashboardLayout$PlanPageLayout$BillingOptionItem == null) {
            plansDashboardLayout$PlanPageLayout$BillingOptionItem = (PlansDashboardLayout$PlanPageLayout$BillingOptionItem) d0.b0(list);
        }
        H2(yVar, new ghk.s(plansDashboardLayout$PlanPageLayout$BillingOptionItem, 0));
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, q.q(new a0(this.v.f127846b, this, 0)), null, new ghk.y(this, null, 1), 3);
    }

    @Override // ali.h, cli.z
    public final g getState() {
        return this.D;
    }
}
