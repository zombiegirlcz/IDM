package com.revolut.feature.offboarding.impl.declaration;

import aii.u;
import com.revolut.feature.offboarding.api.navigation.OffboardingFeatureConfig$Home;
import com.revolut.feature.offboarding.impl.declaration.OffboardingFeatureFlowStep;
import com.revolut.feature.offboarding.impl.flow.RetailContainerFlow;
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
        OffboardingFeatureFlowStep step = (OffboardingFeatureFlowStep) featureFlowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (step.equals(OffboardingFeatureFlowStep.EntryStandalone.f78140a)) {
            return new RetailContainerFlow();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ohi.b
    public final c c(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (Intrinsics.f(destination, OffboardingFeatureConfig$Home.f78139a)) {
            return new c(OffboardingFeatureFlowStep.EntryStandalone.f78140a);
        }
        return null;
    }
}
