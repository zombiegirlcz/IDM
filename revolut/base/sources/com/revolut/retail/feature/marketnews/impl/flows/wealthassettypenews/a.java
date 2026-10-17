package com.revolut.retail.feature.marketnews.impl.flows.wealthassettypenews;

import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.marketnews.impl.flows.wealthassettypenews.WealthAssetTypeNewsFlowContract$Step;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.assettype.WealthAssetTypeNewsScreen;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.assettype.WealthAssetTypeNewsScreenContract$InputData;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q0k.b;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final WealthAssetTypeNewsFlowContract$InputData f101828t;
    public final WealthAssetTypeNewsFlowContract$Step.Overview u;
    public final WealthAssetTypeNewsFlowContract$State v;

    public a(WealthAssetTypeNewsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f101828t = inputData;
        this.u = WealthAssetTypeNewsFlowContract$Step.Overview.f101827a;
        this.v = WealthAssetTypeNewsFlowContract$State.f101826a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        WealthAssetTypeNewsFlowContract$Step step = (WealthAssetTypeNewsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, WealthAssetTypeNewsFlowContract$Step.Overview.f101827a)) {
            throw new NoWhenBranchMatchedException();
        }
        WealthAssetTypeNewsFlowContract$InputData wealthAssetTypeNewsFlowContract$InputData = this.f101828t;
        return new WealthAssetTypeNewsScreen(new WealthAssetTypeNewsScreenContract$InputData(wealthAssetTypeNewsFlowContract$InputData.f101824a, wealthAssetTypeNewsFlowContract$InputData.f101825b));
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
