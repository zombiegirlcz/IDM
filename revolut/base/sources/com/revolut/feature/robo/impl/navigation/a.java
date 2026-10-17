package com.revolut.feature.robo.impl.navigation;

import cnc.e;
import com.revolut.feature.robo.impl.navigation.RoboInternalDestination;
import com.revolut.feature.robo.impl.ui.screen.manage_goal.ManageGoalScreen;
import com.revolut.feature.robo.impl.ui.screen.portfolio_details.PortfolioDetailsScreen;
import com.revolut.feature.robo.impl.ui.screen.portfolio_details.PortfolioDetailsScreenContract$InputData;
import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreen;
import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreenContract$Input;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static ManageGoalScreen a(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return new ManageGoalScreen(new e(portfolioId));
    }

    public static PortfolioDetailsScreen b(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return new PortfolioDetailsScreen(new PortfolioDetailsScreenContract$InputData(portfolioId));
    }

    public static PortfolioSpareChangeScreen c(RoboInternalDestination.SetPortfolioSpareChangeDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return new PortfolioSpareChangeScreen(new PortfolioSpareChangeScreenContract$Input(destination.f85094a));
    }
}
