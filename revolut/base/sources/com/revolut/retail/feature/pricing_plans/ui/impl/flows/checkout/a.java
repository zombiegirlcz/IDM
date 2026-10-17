package com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout;

import ang.f;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout.CheckoutPlanSelectionFlowContract$Step;
import hha.i;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import s06.e;
import tgk.c;
import tgk.d;
import z43.b;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements c {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qh3.c f102975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f102976q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tgk.a f102977r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final bgk.a f102978s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wik.d f102979t;
    public final tfk.a u;
    public final f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yki.a f102980w;

    public a(d inputData, qh3.c processCheckoutExtension, b unlockedFreePersonalisedCardPromptProvider, tgk.a checkoutDeliveryOptionsNaviCommandProvider, bgk.a planTermsWorkflowControllerExtension, wik.d creditPlansUiInteractor, tfk.a planPrepareTermsSender, f userInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(processCheckoutExtension, "processCheckoutExtension");
        Intrinsics.checkNotNullParameter(unlockedFreePersonalisedCardPromptProvider, "unlockedFreePersonalisedCardPromptProvider");
        Intrinsics.checkNotNullParameter(checkoutDeliveryOptionsNaviCommandProvider, "checkoutDeliveryOptionsNaviCommandProvider");
        Intrinsics.checkNotNullParameter(planTermsWorkflowControllerExtension, "planTermsWorkflowControllerExtension");
        Intrinsics.checkNotNullParameter(creditPlansUiInteractor, "creditPlansUiInteractor");
        Intrinsics.checkNotNullParameter(planPrepareTermsSender, "planPrepareTermsSender");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = inputData;
        this.f102975p = processCheckoutExtension;
        this.f102976q = unlockedFreePersonalisedCardPromptProvider;
        this.f102977r = checkoutDeliveryOptionsNaviCommandProvider;
        this.f102978s = planTermsWorkflowControllerExtension;
        this.f102979t = creditPlansUiInteractor;
        this.u = planPrepareTermsSender;
        this.v = userInteractor;
        ta8.a aVar = new ta8.a(this, 14);
        this.f102980w = cp5.d.a(this, CheckoutPlanSelectionFlowContract$Step.SelectPlan.f102974a, f0.f322471a, aVar);
    }

    public static final void I2(a aVar, hha.d dVar, i iVar, PricingPlanOffer pricingPlanOffer, boolean z) {
        aVar.f102978s.b3(dVar, new e(aVar, 26, aVar.o.f271191c, new pi3.h(dVar, iVar, pricingPlanOffer, z, 48)));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f102980w;
    }
}
