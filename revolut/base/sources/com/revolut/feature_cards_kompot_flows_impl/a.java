package com.revolut.feature_cards_kompot_flows_impl;

import aii.u;
import com.revolut.feature_cards_kompot_flows_api.navigation.CardDetailsFlowDestination;
import com.revolut.feature_cards_kompot_flows_impl.CardsFeatureFlowStep;
import com.revolut.feature_cards_kompot_flows_impl.flow.CardDetailsFlow;
import com.revolut.kompot.FeatureFlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nhi.c;
import ohi.b;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends b {
    @Override // ohi.b
    public final com.revolut.kompot.navigable.a a(FeatureFlowStep featureFlowStep, g flowModel) {
        CardsFeatureFlowStep step = (CardsFeatureFlowStep) featureFlowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (step instanceof CardsFeatureFlowStep.ShowPin) {
            return new CardDetailsFlow(((CardsFeatureFlowStep.ShowPin) step).getF96646a());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ohi.b
    public final c c(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination instanceof CardDetailsFlowDestination) {
            return new c(new CardsFeatureFlowStep.ShowPin((CardDetailsFlowDestination.InputData) ((CardDetailsFlowDestination) destination).f98300a));
        }
        return null;
    }
}
