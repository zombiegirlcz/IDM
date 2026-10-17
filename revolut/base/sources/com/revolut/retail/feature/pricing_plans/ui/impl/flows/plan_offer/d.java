package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer;

import a31.m;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.PlanOfferFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.PlanOfferFlowContract$Step;
import hx7.e;
import igk.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qz0.n;
import rgk.q;
import vkm.j2;
import yki.i;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends h implements aik.c {

    @NotNull
    public static final aik.h Companion = new aik.h();
    public final PlanOfferFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b f103204p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final aik.a f103205q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zfk.c f103206r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f103207s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qki.d f103208t;
    public final i u;

    public d(PlanOfferFlowContract$InputData inputData, com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b actionHandler, aik.a bottomSheetControllerFactory, zfk.c planSubscriberControllerModelExtension, n urlImagesRepository) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(bottomSheetControllerFactory, "bottomSheetControllerFactory");
        Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
        Intrinsics.checkNotNullParameter(urlImagesRepository, "urlImagesRepository");
        this.o = inputData;
        this.f103204p = actionHandler;
        this.f103205q = bottomSheetControllerFactory;
        this.f103206r = planSubscriberControllerModelExtension;
        this.f103207s = urlImagesRepository;
        this.f103208t = e.b(this, new PlanOfferFlowContract$DomainState(false));
        this.u = d8l.d.a(this, new aik.e(this, 0));
    }

    public final boolean I2() {
        PlanOfferFlowContract$InputData planOfferFlowContract$InputData = this.o;
        PlanOfferFlowContract$InputData.ByOfferType byOfferType = planOfferFlowContract$InputData instanceof PlanOfferFlowContract$InputData.ByOfferType ? (PlanOfferFlowContract$InputData.ByOfferType) planOfferFlowContract$InputData : null;
        if (byOfferType != null) {
            return byOfferType.f103192b;
        }
        return true;
    }

    public final void J2(PricingPlanAction pricingPlanAction, Function0 function0) {
        if (pricingPlanAction instanceof PricingPlanAction.Dismiss) {
            function0.invoke();
            return;
        }
        if (pricingPlanAction instanceof PricingPlanAction.Decline) {
            C2(u.f161273a);
            function0.invoke();
            return;
        }
        boolean z = pricingPlanAction instanceof PricingPlanAction.OpenUrl;
        com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b bVar = this.f103204p;
        if (z) {
            PricingPlanAction.OpenUrl action = (PricingPlanAction.OpenUrl) pricingPlanAction;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(action, "action");
            bVar.T2(new rgk.n(bVar, action, null), new yi5.b(27));
            return;
        }
        boolean z3 = pricingPlanAction instanceof PricingPlanAction.OpenBillingPicker;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        i iVar = this.u;
        if (z3) {
            PricingPlanAction.OpenBillingPicker openBillingPicker = (PricingPlanAction.OpenBillingPicker) pricingPlanAction;
            h.w2(iVar, new PlanOfferFlowContract$Step.BillingPicker(openBillingPicker.f102803b, openBillingPicker.f102802a, openBillingPicker.f102804c, openBillingPicker.d), bottom_dialog);
            return;
        }
        if (pricingPlanAction instanceof PricingPlanAction.SeeAllBenefits) {
            h.w2(iVar, new PlanOfferFlowContract$Step.PlanBenefits(((PricingPlanAction.SeeAllBenefits) pricingPlanAction).f102806a), ModalDestination.Style.POPUP.f98311a);
            return;
        }
        if (pricingPlanAction instanceof PricingPlanAction.Upgrade) {
            PricingPlanAction.Upgrade upgrade = (PricingPlanAction.Upgrade) pricingPlanAction;
            bVar.d3(upgrade, new m(upgrade, 15, this, function0));
            return;
        }
        if (pricingPlanAction instanceof PricingPlanAction.ApplyDiscount) {
            bVar.b3((PricingPlanAction.ApplyDiscount) pricingPlanAction, new agh.b(this, function0, 5));
            return;
        }
        if (pricingPlanAction instanceof PricingPlanAction.SeeAllDocuments) {
            h.w2(iVar, new PlanOfferFlowContract$Step.PlanDocuments(((PricingPlanAction.SeeAllDocuments) pricingPlanAction).f102807a), bottom_dialog);
        } else if (pricingPlanAction instanceof PricingPlanAction.FlowSpecific) {
            q.a((PricingPlanAction.FlowSpecific) pricingPlanAction, "PlanOfferFlowModel");
        } else {
            if (!(pricingPlanAction instanceof PricingPlanAction.Unsupported)) {
                throw new NoWhenBranchMatchedException();
            }
            q.b((PricingPlanAction.Unsupported) pricingPlanAction, "PlanOfferFlowModel");
        }
    }

    public final void K2() {
        C1(u0.c(new CardDesignFeatureConfig(b93.e.PHYSICAL, null, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 536870910)));
    }

    @Override // yki.j
    public final void M0() {
        PlanOfferFlowContract$InputData planOfferFlowContract$InputData = this.o;
        boolean z = planOfferFlowContract$InputData instanceof PlanOfferFlowContract$InputData.ByOfferType;
        i iVar = this.u;
        if (z) {
            h.t2(this, iVar, new PlanOfferFlowContract$Step.Prompt(((PlanOfferFlowContract$InputData.ByOfferType) planOfferFlowContract$InputData).f103191a), false, TransitionAnimation.NONE.f98393a, false, 8);
            return;
        }
        if (!(planOfferFlowContract$InputData instanceof PlanOfferFlowContract$InputData.ByPrompt)) {
            throw new NoWhenBranchMatchedException();
        }
        PlanOfferFlowContract$InputData.ByPrompt byPrompt = (PlanOfferFlowContract$InputData.ByPrompt) planOfferFlowContract$InputData;
        int i = b.f103203a[byPrompt.f103194b.ordinal()];
        if (i == 1) {
            l2(new c(this, null), new yi5.b(26));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            h.t2(this, iVar, new PlanOfferFlowContract$Step.FullScreenPromptOffer(byPrompt.f103193a), false, TransitionAnimation.NONE.f98393a, false, 8);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        qki.d dVar = this.f103208t;
        if (((PlanOfferFlowContract$DomainState) ((j2) dVar.f22677a).getValue()).f103190a) {
            H2(dVar, new aik.d(0));
            h.D2(this.u);
        }
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f103208t;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
