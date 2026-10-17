package com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.flow;

import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.flow.JuniorUpgradeFlowContract$Step;
import com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.screen.JuniorUpgradeScreen;
import com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.screen.JuniorUpgradeScreenContract$InputData;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends g implements cyj.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final JuniorUpgradeFlowContract$InputData f101759t;
    public final JuniorUpgradeFlowContract$Step.JuniorUpgrade u;
    public final JuniorUpgradeFlowContract$State v;

    public a(JuniorUpgradeFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f101759t = inputData;
        this.u = JuniorUpgradeFlowContract$Step.JuniorUpgrade.f101758a;
        this.v = JuniorUpgradeFlowContract$State.f101757a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        JuniorUpgradeFlowContract$Step step = (JuniorUpgradeFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, JuniorUpgradeFlowContract$Step.JuniorUpgrade.f101758a)) {
            throw new NoWhenBranchMatchedException();
        }
        JuniorUpgradeFlowContract$InputData juniorUpgradeFlowContract$InputData = this.f101759t;
        return new JuniorUpgradeScreen(new JuniorUpgradeScreenContract$InputData(juniorUpgradeFlowContract$InputData.f101753a, juniorUpgradeFlowContract$InputData.f101754b, juniorUpgradeFlowContract$InputData.f101755c, juniorUpgradeFlowContract$InputData.d, juniorUpgradeFlowContract$InputData.e, juniorUpgradeFlowContract$InputData.f, juniorUpgradeFlowContract$InputData.f101756g));
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
