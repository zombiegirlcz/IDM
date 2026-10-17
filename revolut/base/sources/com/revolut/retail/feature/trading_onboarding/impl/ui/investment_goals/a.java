package com.revolut.retail.feature.trading_onboarding.impl.ui.investment_goals;

import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.trading_onboarding.impl.ui.investment_goals.InvestmentGoalsFlowContract$Step;
import com.revolut.retail.feature.trading_onboarding.impl.ui.investment_goals.investment_goals_screen.InvestmentGoalsScreen;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oxd.m;
import ozk.b;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InvestmentGoalsFlowContract$Step.InvestmentGoalsOverviewStep f104184t = InvestmentGoalsFlowContract$Step.InvestmentGoalsOverviewStep.f104183a;
    public final InvestmentGoalsFlowContract$EmptyState u = InvestmentGoalsFlowContract$EmptyState.f104181a;

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        InvestmentGoalsFlowContract$Step step = (InvestmentGoalsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof InvestmentGoalsFlowContract$Step.InvestmentGoalsOverviewStep)) {
            throw new NoWhenBranchMatchedException();
        }
        InvestmentGoalsScreen investmentGoalsScreen = new InvestmentGoalsScreen();
        m mVar = new m(this, 10);
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        investmentGoalsScreen.H = mVar;
        return investmentGoalsScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f104184t;
    }
}
