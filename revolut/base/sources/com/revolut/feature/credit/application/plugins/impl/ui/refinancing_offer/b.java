package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer;

import c84.t;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.RefinancingOfferFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import e84.e;
import k3k.k;
import kh4.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends t implements kh4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RefinancingOfferFlowContract$InputData f68292p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f68293q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ff4.t f68294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f68295s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RefinancingOfferFlowContract$InputData inputData, g refinancingOfferFlowInteractor, ff4.t offerContentScreenInteractor, e pluginControllerResolver) {
        FlowStep creditToRefinanceSelection;
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(refinancingOfferFlowInteractor, "refinancingOfferFlowInteractor");
        Intrinsics.checkNotNullParameter(offerContentScreenInteractor, "offerContentScreenInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68292p = inputData;
        this.f68293q = refinancingOfferFlowInteractor;
        this.f68294r = offerContentScreenInteractor;
        CreditApplicationKompotFeatureConfig.RefinancingOffer.Config config = inputData.f68285b;
        if (config instanceof CreditApplicationKompotFeatureConfig.RefinancingOffer.Config.Setup) {
            creditToRefinanceSelection = new RefinancingOfferFlowContract$Step.CreditToRefinanceSelection(!((CreditApplicationKompotFeatureConfig.RefinancingOffer.Config.Setup) config).f66806a);
        } else {
            if (!(config instanceof CreditApplicationKompotFeatureConfig.RefinancingOffer.Config.FinalOffer)) {
                throw new NoWhenBranchMatchedException();
            }
            creditToRefinanceSelection = RefinancingOfferFlowContract$Step.FinalOffer.f68287a;
        }
        this.f68295s = d.a(this, creditToRefinanceSelection, f0.f322471a, new k(this, 25));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68295s;
    }
}
