package com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow;

import aii.u;
import com.revolut.feature.trading_add_ons.TradingAddOnsApi$Toggles;
import com.revolut.feature.trading_add_ons.impl.navigation.GoodbyeDestination;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.flow.TradingAddOnsFlowContract$Step;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.goodbye_screen.AddOnsGoodbyeScreen;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.main_screen.TradingAddOnsMainScreen;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.main_screen.TradingAddOnsMainScreenRevamp;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends g implements bcf.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f91669t;
    public final TradingAddOnsFlowContract$Step.MainScreen u;
    public final TradingAddOnsFlowContract$State v;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f91669t = featureToggleInteractor;
        this.u = TradingAddOnsFlowContract$Step.MainScreen.f91668a;
        this.v = TradingAddOnsFlowContract$State.f91666a;
    }

    @Override // dki.g
    public final boolean C2(u navigationDestination) {
        Intrinsics.checkNotNullParameter(navigationDestination, "navigationDestination");
        if (navigationDestination instanceof GoodbyeDestination) {
            E2(new TradingAddOnsFlowContract$Step.GoodbyeStep(((GoodbyeDestination) navigationDestination).f91664a), true, null, false);
            return true;
        }
        super.C2(navigationDestination);
        return false;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        TradingAddOnsFlowContract$Step step = (TradingAddOnsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, TradingAddOnsFlowContract$Step.MainScreen.f91668a)) {
            return ((d) this.f91669t).c(TradingAddOnsApi$Toggles.TradingProRevamp.f91661c) ? new TradingAddOnsMainScreenRevamp() : new TradingAddOnsMainScreen();
        }
        if (step instanceof TradingAddOnsFlowContract$Step.GoodbyeStep) {
            return new AddOnsGoodbyeScreen(((TradingAddOnsFlowContract$Step.GoodbyeStep) step).f91667a);
        }
        throw new NoWhenBranchMatchedException();
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
