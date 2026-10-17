package opd;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$CustomPeriodPicker$Destination;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$Details$Destination;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$ProSales$Destination;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$SelectTransaction$Destination;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$TotalWealthSelectType$Destination;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$TravelModeRemoveWidget$Destination;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.AnalyticsDashboardFlow;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.flow.AnalyticsDashboardFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.TripsFlow;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.TripsFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.CategoryManagementListContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.CategoryManagementListContract$Mode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.list.CategoryManagementListController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.CustomPeriodSelectContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.CustomPeriodSelectController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.IncomeSorterFlow;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.IncomeSorterFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.destinations.RevIQDestination;
import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.flow.RevIQFlow;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$SelectionMode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlow;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.TravelController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.flow.TravelRemoveWidgetFlow;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.remove.flow.TravelRemoveWidgetFlowContract$InputData;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import dki.g;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yld.d;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f227554a;

    public a(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f227554a = deeplinkGateways;
    }

    @Override // ohi.a, nhi.h, aii.p
    public final void b() {
    }

    @Override // nte.a
    public final List e() {
        return AnalyticsFeatureApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        CategoryManagementListContract$Mode select;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AnalyticsFeatureConfig.SpendingScreen.Destination) {
            d dVar = d.SPENDING;
            AnalyticsAccountsSelection.Companion companion = AnalyticsAccountsSelection.INSTANCE;
            AnalyticsFeatureConfig.SpendingScreen.Destination destination2 = (AnalyticsFeatureConfig.SpendingScreen.Destination) destination;
            AnalyticsAccount f87429c = destination2.getF87429c();
            if (f87429c == null) {
                f87429c = AnalyticsAccount.Personal.All.f99192a;
            }
            companion.getClass();
            return new AnalyticsDashboardFlow(new AnalyticsDashboardFlowContract$InputData(new AnalyticsDashboardFlowContract$InputData.DefaultScreen.AnalyticsDetails(dVar, AnalyticsAccountsSelection.Companion.a(f87429c), destination2.getF87427a(), destination2.getF87428b())));
        }
        if (destination instanceof AnalyticsFeatureConfig.Budget.Destination) {
            AnalyticsFeatureConfig.Budget.Destination destination3 = (AnalyticsFeatureConfig.Budget.Destination) destination;
            return new AnalyticsDashboardFlow(new AnalyticsDashboardFlowContract$InputData(new AnalyticsDashboardFlowContract$InputData.DefaultScreen.Budget(destination3.getF87401a(), destination3.getF87402b())));
        }
        if (destination instanceof AnalyticsFeatureConfig$TotalWealthSelectType$Destination) {
            AnalyticsFeatureConfig$TotalWealthSelectType$Destination analyticsFeatureConfig$TotalWealthSelectType$Destination = (AnalyticsFeatureConfig$TotalWealthSelectType$Destination) destination;
            return new TotalWealthFlow(new TotalWealthFlowContract$InputData.Selection(analyticsFeatureConfig$TotalWealthSelectType$Destination.getF87436c(), analyticsFeatureConfig$TotalWealthSelectType$Destination.getE(), analyticsFeatureConfig$TotalWealthSelectType$Destination.getF87435b(), analyticsFeatureConfig$TotalWealthSelectType$Destination.getD()));
        }
        if (destination instanceof AnalyticsFeatureConfig.TotalWealthScreen.Destination) {
            AnalyticsFeatureConfig.TotalWealthScreen.Destination destination4 = (AnalyticsFeatureConfig.TotalWealthScreen.Destination) destination;
            return new TotalWealthFlow(new TotalWealthFlowContract$InputData.Direct(destination4.getF87433b(), destination4.getF87434c(), destination4.getD(), destination4.getE()));
        }
        if (destination instanceof AnalyticsFeatureConfig.TotalWealthAddOtherAsset.Destination) {
            return new TotalWealthFlow(new TotalWealthFlowContract$InputData.AddOtherAsset(((AnalyticsFeatureConfig.TotalWealthAddOtherAsset.Destination) destination).getF87430b()));
        }
        if (destination instanceof AnalyticsFeatureConfig.TotalWealthCustomAssetDetails.Destination) {
            return new TotalWealthFlow(new TotalWealthFlowContract$InputData.CustomAssetDetails(((AnalyticsFeatureConfig.TotalWealthCustomAssetDetails.Destination) destination).getF87432a()));
        }
        if (destination instanceof AnalyticsFeatureConfig$CustomPeriodPicker$Destination) {
            AnalyticsFeatureConfig$CustomPeriodPicker$Destination analyticsFeatureConfig$CustomPeriodPicker$Destination = (AnalyticsFeatureConfig$CustomPeriodPicker$Destination) destination;
            return new CustomPeriodSelectController(new CustomPeriodSelectContract$InputData(analyticsFeatureConfig$CustomPeriodPicker$Destination.a(), analyticsFeatureConfig$CustomPeriodPicker$Destination.getF87408b(), analyticsFeatureConfig$CustomPeriodPicker$Destination.getF87409c(), analyticsFeatureConfig$CustomPeriodPicker$Destination.getD(), analyticsFeatureConfig$CustomPeriodPicker$Destination.getE()));
        }
        if (destination instanceof AnalyticsFeatureConfig$SelectTransaction$Destination) {
            AnalyticsFeatureConfig$SelectTransaction$Destination analyticsFeatureConfig$SelectTransaction$Destination = (AnalyticsFeatureConfig$SelectTransaction$Destination) destination;
            return new SelectTransactionController(new SelectTransactionContract$InputData(analyticsFeatureConfig$SelectTransaction$Destination.getF87424a(), analyticsFeatureConfig$SelectTransaction$Destination.getF87425b(), new SelectTransactionContract$SelectionMode.Single(false), (TextLocalisedClause) null, (TextLocalisedClause) null, 56));
        }
        if (destination instanceof AnalyticsFeatureConfig.IncomeSortersList.Destination) {
            return new IncomeSorterFlow(new IncomeSorterFlowContract$InputData(IncomeSorterFlowContract$InputData.InitialScreen.IncomeSortersList.f87782a));
        }
        if (destination instanceof AnalyticsFeatureConfig.IncomeSorterCreation.Destination) {
            String f87414a = ((AnalyticsFeatureConfig.IncomeSorterCreation.Destination) destination).getF87414a();
            return new IncomeSorterFlow(new IncomeSorterFlowContract$InputData(f87414a != null ? new IncomeSorterFlowContract$InputData.InitialScreen.IncomeSorterCreation(f87414a) : IncomeSorterFlowContract$InputData.InitialScreen.SelectIncome.f87783a));
        }
        if (destination instanceof AnalyticsFeatureConfig.IncomeSorterExecutionScreen.Destination) {
            return new IncomeSorterFlow(new IncomeSorterFlowContract$InputData(new IncomeSorterFlowContract$InputData.InitialScreen.IncomeSorterExecutionScreen(((AnalyticsFeatureConfig.IncomeSorterExecutionScreen.Destination) destination).getF87416a())));
        }
        if (destination instanceof AnalyticsFeatureConfig.IncomeSorterDetails.Destination) {
            return new IncomeSorterFlow(new IncomeSorterFlowContract$InputData(new IncomeSorterFlowContract$InputData.InitialScreen.IncomeSorterDetails(((AnalyticsFeatureConfig.IncomeSorterDetails.Destination) destination).getF87415a())));
        }
        if (destination instanceof AnalyticsFeatureConfig.CategoryManagement.Destination) {
            AnalyticsFeatureConfig.CategoryManagement.Destination destination5 = (AnalyticsFeatureConfig.CategoryManagement.Destination) destination;
            String f87403a = destination5.getF87403a();
            AnalyticsFeatureConfig.CategoryManagement.Mode f87404b = destination5.getF87404b();
            if (f87404b instanceof AnalyticsFeatureConfig.CategoryManagement.Mode.Manage) {
                select = CategoryManagementListContract$Mode.Manage.f87657a;
            } else {
                if (!(f87404b instanceof AnalyticsFeatureConfig.CategoryManagement.Mode.Select)) {
                    throw new NoWhenBranchMatchedException();
                }
                select = new CategoryManagementListContract$Mode.Select(((AnalyticsFeatureConfig.CategoryManagement.Mode.Select) f87404b).getF87406a());
            }
            return new CategoryManagementListController(new CategoryManagementListContract$InputData(f87403a, select));
        }
        if (destination instanceof AnalyticsFeatureConfig$ProSales$Destination) {
            d dVar2 = d.SALES;
            AnalyticsAccountsSelection.INSTANCE.getClass();
            return new AnalyticsDashboardFlow(new AnalyticsDashboardFlowContract$InputData(new AnalyticsDashboardFlowContract$InputData.DefaultScreen.AnalyticsDetails(dVar2, AnalyticsAccountsSelection.Companion.a(AnalyticsAccount.Pro.All.f99196a), null, null)));
        }
        if (destination instanceof AnalyticsFeatureConfig.Dashboard.Destination) {
            return new AnalyticsDashboardFlow(new AnalyticsDashboardFlowContract$InputData(new AnalyticsDashboardFlowContract$InputData.DefaultScreen.Dashboard(((AnalyticsFeatureConfig.Dashboard.Destination) destination).getF87410b())));
        }
        if (destination instanceof AnalyticsFeatureConfig$Details$Destination) {
            AnalyticsFeatureConfig$Details$Destination analyticsFeatureConfig$Details$Destination = (AnalyticsFeatureConfig$Details$Destination) destination;
            d f87413b = analyticsFeatureConfig$Details$Destination.getF87413b();
            AnalyticsAccountsSelection.Companion companion2 = AnalyticsAccountsSelection.INSTANCE;
            AnalyticsAccount f87412a = analyticsFeatureConfig$Details$Destination.getF87412a();
            companion2.getClass();
            return new AnalyticsDashboardFlow(new AnalyticsDashboardFlowContract$InputData(new AnalyticsDashboardFlowContract$InputData.DefaultScreen.AnalyticsDetails(f87413b, AnalyticsAccountsSelection.Companion.a(f87412a), null, null)));
        }
        if (destination instanceof AnalyticsFeatureConfig.Trips.Destination) {
            return new TripsFlow(new TripsFlowContract$InputData.List(((AnalyticsFeatureConfig.Trips.Destination) destination).getF87442b()));
        }
        if (destination instanceof AnalyticsFeatureConfig.SavingsAnalyticsDetails.Destination) {
            AnalyticsFeatureConfig.SavingsAnalyticsDetails.Destination destination6 = (AnalyticsFeatureConfig.SavingsAnalyticsDetails.Destination) destination;
            d f87421a = destination6.getF87421a();
            AnalyticsAccountsSelection.Companion companion3 = AnalyticsAccountsSelection.INSTANCE;
            AnalyticsAccount.Savings f87422b = destination6.getF87422b();
            companion3.getClass();
            return new AnalyticsDashboardFlow(new AnalyticsDashboardFlowContract$InputData(new AnalyticsDashboardFlowContract$InputData.DefaultScreen.AnalyticsDetails(f87421a, AnalyticsAccountsSelection.Companion.a(f87422b), null, null)));
        }
        if (destination instanceof AnalyticsFeatureConfig.TravelMode.Destination) {
            return new TravelController();
        }
        if (destination instanceof AnalyticsFeatureConfig$TravelModeRemoveWidget$Destination) {
            AnalyticsFeatureConfig$TravelModeRemoveWidget$Destination analyticsFeatureConfig$TravelModeRemoveWidget$Destination = (AnalyticsFeatureConfig$TravelModeRemoveWidget$Destination) destination;
            return new TravelRemoveWidgetFlow(new TravelRemoveWidgetFlowContract$InputData(analyticsFeatureConfig$TravelModeRemoveWidget$Destination.getF87440b(), analyticsFeatureConfig$TravelModeRemoveWidget$Destination.getF87439a()));
        }
        if (destination instanceof RevIQDestination) {
            return new RevIQFlow(new vqd.d(((RevIQDestination) destination).getF87876a()));
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f227554a;
    }
}
