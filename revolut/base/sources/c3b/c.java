package c3b;

import a2b.h;
import a2b.i;
import a2b.j;
import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.retail.cfd.api.CfdApi$Toggles;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingDescriptor$Withdraw;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig$CashTradeDetails$Destination;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig$MaintenanceMargin$Destination;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig$OvernightFeeTradeDetails$Destination;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig$Settings$Destination;
import com.revolut.feature.retail.cfd.impl.flows.onboarding.CfdOnboardingFlow;
import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderFlow;
import com.revolut.feature.retail.cfd.impl.flows.position.CfdPositionFlow;
import com.revolut.feature.retail.cfd.impl.flows.withdraw.CfdWithdrawFlow;
import com.revolut.feature.retail.cfd.impl.flows.withdraw.CfdWithdrawFlowContract$InputData;
import com.revolut.feature.retail.cfd.impl.screens.cash_balance.CfdCashBalanceController;
import com.revolut.feature.retail.cfd.impl.screens.cash_balance.CfdCashBalanceControllerContract$InputData;
import com.revolut.feature.retail.cfd.impl.screens.cash_trade.CfdCashTradeDetailsContract$InputData;
import com.revolut.feature.retail.cfd.impl.screens.cash_trade.CfdCashTradeDetailsController;
import com.revolut.feature.retail.cfd.impl.screens.exposure.CfdExposureBreakdownController;
import com.revolut.feature.retail.cfd.impl.screens.home.CfdTradingHomeScreen;
import com.revolut.feature.retail.cfd.impl.screens.home.CfdTradingHomeScreenContract$InputData;
import com.revolut.feature.retail.cfd.impl.screens.maintenance_margin.CfdMaintenanceMarginController;
import com.revolut.feature.retail.cfd.impl.screens.maintenance_margin.CfdMaintenanceMarginControllerContract$InputData;
import com.revolut.feature.retail.cfd.impl.screens.overnight_fee.CfdOvernightFeeBreakdownController;
import com.revolut.feature.retail.cfd.impl.screens.riskwarning.CfdRiskWarningController;
import com.revolut.feature.retail.cfd.impl.screens.settings.CfdSettingsController;
import com.revolut.feature.retail.cfd.impl.screens.whatarecfds.WhatAreCfdsController;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p3b.f;
import w2b.d;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20926a = 0;

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof a2b.e) {
            a2b.e eVar = (a2b.e) descriptor;
            return eVar.a(new CfdRiskWarningController(new m4b.e(eVar.c(), eVar.b())));
        }
        if (descriptor instanceof a2b.a) {
            a2b.a aVar = (a2b.a) descriptor;
            return aVar.a(new CfdExposureBreakdownController(new f(aVar.c(), aVar.e(), aVar.f(), aVar.d(), aVar.b())));
        }
        if (descriptor instanceof j) {
            return ((j) descriptor).a(new WhatAreCfdsController());
        }
        if (!(descriptor instanceof i)) {
            if (descriptor instanceof a2b.c) {
                a2b.c cVar = (a2b.c) descriptor;
                return cVar.a(new CfdOnboardingFlow(new v2b.c(cVar.b())));
            }
            super.c(descriptor);
            return null;
        }
        i iVar = (i) descriptor;
        if (iVar instanceof a2b.g) {
            a2b.g gVar = (a2b.g) iVar;
            return gVar.a(new CfdCashTradeDetailsController(new CfdCashTradeDetailsContract$InputData(gVar.b())));
        }
        if (iVar instanceof h) {
            h hVar = (h) iVar;
            return hVar.a(new CfdOvernightFeeBreakdownController(new e4b.i(hVar.b())));
        }
        if (!(iVar instanceof CfdTradingDescriptor$Withdraw)) {
            throw new NoWhenBranchMatchedException();
        }
        CfdTradingDescriptor$Withdraw cfdTradingDescriptor$Withdraw = (CfdTradingDescriptor$Withdraw) iVar;
        return cfdTradingDescriptor$Withdraw.a(new CfdWithdrawFlow(new CfdWithdrawFlowContract$InputData(cfdTradingDescriptor$Withdraw.getF82124a(), cfdTradingDescriptor$Withdraw.getF82125b()), cfdTradingDescriptor$Withdraw.getF82126c()));
    }

    @Override // nte.a
    public final List e() {
        return CfdApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        CfdTradingFeatureConfig.CfdTradingDestination cfdTradingDestination = destination instanceof CfdTradingFeatureConfig.CfdTradingDestination ? (CfdTradingFeatureConfig.CfdTradingDestination) destination : null;
        if (cfdTradingDestination == null) {
            return null;
        }
        if (cfdTradingDestination instanceof CfdTradingFeatureConfig.HomeScreen.Destination) {
            return new CfdTradingHomeScreen(new CfdTradingHomeScreenContract$InputData(((CfdTradingFeatureConfig.HomeScreen.Destination) cfdTradingDestination).getF82142a()));
        }
        if (cfdTradingDestination instanceof CfdTradingFeatureConfig.OrderFlow.Destination) {
            CfdTradingFeatureConfig.OrderFlow.Destination destination2 = (CfdTradingFeatureConfig.OrderFlow.Destination) cfdTradingDestination;
            return new CfdOrderFlow(new d(destination2.getF82148a(), destination2.getF82150c(), destination2.getD(), destination2.getF82149b(), destination2.getE()));
        }
        if (cfdTradingDestination instanceof CfdTradingFeatureConfig.PositionDetails.Destination) {
            CfdTradingFeatureConfig.PositionDetails.Destination destination3 = (CfdTradingFeatureConfig.PositionDetails.Destination) cfdTradingDestination;
            return new CfdPositionFlow(new y2b.d(true, destination3.getF82154a().a(), destination3.getF82154a().g(), destination3.getF82154a().getId()));
        }
        if (cfdTradingDestination instanceof CfdTradingFeatureConfig$CashTradeDetails$Destination) {
            return new CfdCashTradeDetailsController(new CfdCashTradeDetailsContract$InputData(((CfdTradingFeatureConfig$CashTradeDetails$Destination) cfdTradingDestination).getF82130a()));
        }
        if (cfdTradingDestination instanceof CfdTradingFeatureConfig$OvernightFeeTradeDetails$Destination) {
            return new CfdOvernightFeeBreakdownController(new e4b.i(((CfdTradingFeatureConfig$OvernightFeeTradeDetails$Destination) cfdTradingDestination).getF82151a()));
        }
        if (cfdTradingDestination instanceof CfdTradingFeatureConfig.CashBalance.Destination) {
            return new CfdCashBalanceController(new CfdCashBalanceControllerContract$InputData(((CfdTradingFeatureConfig.CashBalance.Destination) cfdTradingDestination).getF82129a()));
        }
        if (cfdTradingDestination instanceof CfdTradingFeatureConfig.Withdraw.Destination) {
            CfdTradingFeatureConfig.Withdraw.Destination destination4 = (CfdTradingFeatureConfig.Withdraw.Destination) cfdTradingDestination;
            return new CfdWithdrawFlow(new CfdWithdrawFlowContract$InputData(destination4.getF82159a(), destination4.getF82160b()));
        }
        if (cfdTradingDestination.equals(CfdTradingFeatureConfig$Settings$Destination.f82155a)) {
            return new CfdSettingsController();
        }
        if (cfdTradingDestination instanceof CfdTradingFeatureConfig$MaintenanceMargin$Destination) {
            return new CfdMaintenanceMarginController(new CfdMaintenanceMarginControllerContract$InputData(((CfdTradingFeatureConfig$MaintenanceMargin$Destination) cfdTradingDestination).getF82143a()));
        }
        if (cfdTradingDestination instanceof CfdTradingFeatureConfig.CfdRiskWarningFlowDestination) {
            CfdTradingFeatureConfig.CfdRiskWarningFlowDestination cfdRiskWarningFlowDestination = (CfdTradingFeatureConfig.CfdRiskWarningFlowDestination) cfdTradingDestination;
            return gc0.c.b(new CfdRiskWarningController(new m4b.e(cfdRiskWarningFlowDestination.getF82138b(), cfdRiskWarningFlowDestination.getF82139c())), new b(cfdTradingDestination, 0));
        }
        if (cfdTradingDestination instanceof CfdTradingFeatureConfig.CfdPositionsDestination) {
            CfdTradingFeatureConfig.CfdPositionsDestination cfdPositionsDestination = (CfdTradingFeatureConfig.CfdPositionsDestination) cfdTradingDestination;
            return new CfdPositionFlow(new y2b.d(cfdPositionsDestination.getF82136c(), cfdPositionsDestination.getF82134a(), cfdPositionsDestination.getF82135b(), cfdPositionsDestination.getD()));
        }
        if (cfdTradingDestination instanceof CfdTradingFeatureConfig.WhatAreCfdDestination) {
            return new WhatAreCfdsController();
        }
        if (!(cfdTradingDestination instanceof CfdTradingFeatureConfig.CfdClosePositionReviewDestination)) {
            throw new NoWhenBranchMatchedException();
        }
        CfdTradingFeatureConfig.CfdClosePositionReviewDestination cfdClosePositionReviewDestination = (CfdTradingFeatureConfig.CfdClosePositionReviewDestination) cfdTradingDestination;
        return new CfdPositionFlow(new y2b.c(cfdClosePositionReviewDestination.getF82131a(), cfdClosePositionReviewDestination.getF82133c(), cfdClosePositionReviewDestination.getD(), cfdClosePositionReviewDestination.getF82132b()));
    }
}
