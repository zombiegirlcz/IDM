package com.revolut.feature.stock_lending.impl.declaration;

import aii.u;
import com.revolut.feature.stock_lending.api.navigation.StockLendingDetailsFeatureConfig;
import com.revolut.feature.stock_lending.impl.declaration.StockLendingFeatureFlowStep;
import com.revolut.feature.stock_lending.impl.ui.screens.details.StockLendingDetailsScreen;
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
        StockLendingFeatureFlowStep step = (StockLendingFeatureFlowStep) featureFlowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (step instanceof StockLendingFeatureFlowStep.LendingDetails) {
            return new StockLendingDetailsScreen();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ohi.b
    public final c c(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination instanceof StockLendingDetailsFeatureConfig.LendingDetailsDestination) {
            return new c(StockLendingFeatureFlowStep.LendingDetails.f88400a);
        }
        return null;
    }
}
