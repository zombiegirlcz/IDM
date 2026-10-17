package rl8;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import aw0.c7;
import aw0.n6;
import c2d.m0;
import ce9.n;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LabeledVerticalScrollView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.impl.ui.qr.details.screen.QrDetailsScreen;
import com.revolut.feature.apm.core.ui.impl.ui.qr.details.screen.QrDetailsScreenContract$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.qr.pager.QrFlowContract$Page;
import com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.QrScanningScreen;
import com.revolut.feature.backgroundpicker.impl.R$string;
import com.revolut.feature.backgroundpicker.impl.flow.catalogue.BackgroundCatalogControllerContract$ModalStep;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.BankAccountSwitchingSwitchOutFlowContract$Step;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.BankAccountSwitchingReviewOutScreen;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.BankAccountSwitchingReviewOutScreenContract$InputData;
import com.revolut.feature.credit.card.api.models.credit_limit_cap.CreditLimitCapImpact;
import com.revolut.feature.credit.card.api.models.credit_limit_cap.ImpactedCardholder;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreen;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreenContract$ModalStep;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.amount.CreditCardLimitDecreaseAmountScreen;
import com.revolut.feature.credit.card.impl.ui.credit_limit_decrease.amount.CreditCardLimitDecreaseAmountScreenContract$InputData;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingaddprovider.CryptoAddressHostingAddProviderController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingflow.CryptoAddressHostingFlowContract$Step;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingpicker.CryptoAddressHostingPickerContract$InputData;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingpicker.CryptoAddressHostingPickerController;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.TrendingContract$ModalStep;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.timeframe.TimeframePickerScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.timeframe.TimeframePickerScreenContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.standalone_symbol.screen.StandaloneSymbolCustomisationScreen;
import com.revolut.feature.external_accounts.impl.ui.india.upi.flow.UpiTransferFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.india.upi.flow.UpiTransferFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.india.upi.screen.applications.UpiApplicationsScreen;
import com.revolut.feature.foreign_currencies.impl.ui.details.ForeignCurrenciesDetailsController;
import com.revolut.feature.foreign_currencies.impl.ui.flow.ForeignCurrenciesFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.plan.a;
import com.revolut.feature.freelancer.impl.ui.invoice.list.InvoiceListScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.sales.filters.screen.sales_filters.FreelancerSalesFiltersScreen;
import com.revolut.feature.freelancer.impl.ui.sales.filters.screen.sales_filters.FreelancerSalesFiltersScreenContract$InputData;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.insurance_pet.impl.ui.add.step.breed.PetBreedDetailsFragment;
import com.revolut.feature.junior_remote_login.impl.ui.flow.add_phone_number.JuniorAddPhoneNumberFlow;
import com.revolut.feature.junior_remote_login.impl.ui.flow.add_phone_number.JuniorAddPhoneNumberFlowContract$InputData;
import com.revolut.feature.junior_remote_login.impl.ui.flow.update_phone_number.JuniorUpdatePhoneNumberFlowContract$Step;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow.ExchangeGlobalAccessFlow;
import com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.PaymentHistoryContract$ModalStep;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListContract$ModalStep;
import com.revolut.feature.revolut_shop.ui.flow.order_history.OrderHistoryFlowContract$Step;
import com.revolut.feature.revolut_shop.ui.screen.order_history.OrderHistoryScreen;
import com.revolut.feature.revolut_shop.ui.screen.orderconfirmation.OrderConfirmationScreen;
import com.revolut.feature.revolut_shop.ui.screen.orderconfirmation.OrderConfirmationScreenContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.budget.BudgetFlowContract$Step;
import com.revolut.feature.spending_analytics.impl.ui.budget.category_budgets.CategoryBudgetsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.budget.category_budgets.CategoryBudgetsController;
import com.revolut.feature.spending_analytics.impl.ui.budget.overview.BudgetOverviewContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.budget.overview.BudgetOverviewController;
import com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.SetupBudgetContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.SetupBudgetController;
import com.revolut.feature.spending_analytics.impl.ui.budget.upcoming_payments.BudgetUpcomingPaymentsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.budget.upcoming_payments.BudgetUpcomingPaymentsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.CategoryManagementCustomContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.CategoryManagementCustomContract$Mode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.category_management.custom.CategoryManagementCustomController;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.StoredMethodTopUpFlowContract$Step;
import com.revolut.feature.user_declarations.shared.flows.tracking.AnalyticsEventTrackingConsentControllerProvider;
import com.revolut.feature.user_declarations.shared.flows.tracking.flow.TrackingConsentFlowContract$Step;
import com.revolut.feature.wealth.analytics.insights.ui.dashboard.PortfolioInsightsDashboardContract$InputData;
import com.revolut.feature.wealth.analytics.insights.ui.dashboard.PortfolioInsightsDashboardController;
import com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.PortfolioInsightsAssetIndicatorController;
import com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.PortfolioInsightsAssetIndicatorControllerContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.allocation.WidgetisedAnalyticsAllocationScreen;
import com.revolut.feature.wealth.analytics.ui.widgetised.allocation.WidgetisedAnalyticsAllocationScreenContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.WidgetisedAnalyticsDashboardContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.WidgetisedAnalyticsDashboardScreen;
import com.revolut.feature.wealth.analytics.ui.widgetised.flow.WidgetisedAnalyticsFlowContract$Step;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceScreen;
import com.revolut.feature.wealth.analytics.ui.widgetised.pnl.WidgetisedAnalyticsPnLScreen;
import com.revolut.feature.wealth.analytics.ui.widgetised.pnl.WidgetisedAnalyticsPnLScreenContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.total_value.WidgetisedAnalyticsTotalValueScreen;
import com.revolut.feature.wealth.analytics.ui.widgetised.total_value.WidgetisedAnalyticsTotalValueScreenContract$InputData;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilterInfo;
import com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.ScreenerStatsFiltersControllerContract$ModalStep;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.api.navigation.EsimInstallationFlowDescriptor$InputData;
import com.revolut.retail.feature.esim.api.navigation.EsimInstallationFlowDescriptor$Start;
import com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.EsimConnectivityTroubleshootingScreenContract$ModalStep;
import com.revolut.retail.feature.learn.impl.ui.glossary.GlossaryHomeScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.IndiaWithdrawalFlowContract$Step;
import com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.screen.account.IndiaWithdrawalChooseAccountScreen;
import com.revolut.sso.impl.ui.country_selection.CountrySelectionScreen;
import com.revolut.sso.impl.ui.post_authentication.PostAuthenticationFlowContract$Step;
import com.youTransactor.uCube.rpc.Constants;
import efm.r;
import grl.k9;
import iyg.d;
import iyg.e;
import iyg.f;
import iyg.g;
import iyg.h;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mic.a0;
import rgf.m;
import rlh.d0;
import rp1.j;
import rsl.p;
import rtl.y;
import ry5.o;
import ryd.i;
import sm6.k;
import tof.i3;
import vkm.j2;
import we6.f0;
import we6.s;
import yki.l;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f254933b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f254932a = i;
        this.f254933b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        final com.revolut.feature.wealth.analytics.ui.widgetised.flow.a aVar = (com.revolut.feature.wealth.analytics.ui.widgetised.flow.a) this.f254933b;
        final l FlowCoordinator = (l) obj2;
        WidgetisedAnalyticsFlowContract$Step step = (WidgetisedAnalyticsFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsDashboardStep) {
            WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsDashboardStep widgetisedAnalyticsDashboardStep = (WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsDashboardStep) step;
            WidgetisedAnalyticsDashboardScreen widgetisedAnalyticsDashboardScreen = new WidgetisedAnalyticsDashboardScreen(new WidgetisedAnalyticsDashboardContract$InputData(widgetisedAnalyticsDashboardStep.f95084a, widgetisedAnalyticsDashboardStep.f95085b, widgetisedAnalyticsDashboardStep.f95086c, widgetisedAnalyticsDashboardStep.d));
            final int i = 0;
            Function1 block = new Function1() { // from class: ryg.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            h output = (h) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof g;
                            com.revolut.feature.wealth.analytics.ui.widgetised.flow.a aVar2 = aVar;
                            l lVar = FlowCoordinator;
                            if (z) {
                                g gVar = (g) output;
                                WidgetisedAnalyticsType widgetisedAnalyticsType = gVar.f169732a;
                                vyg.c cVar = gVar.f169733b;
                                oki.h.t2(aVar2, lVar, new WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsTotalValueStep(widgetisedAnalyticsType, gVar.d, gVar.f169734c, cVar), true, null, false, 12);
                            } else if (output instanceof d) {
                                d dVar = (d) output;
                                oki.h.t2(aVar2, lVar, new WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsPnLStep(dVar.f169723a, dVar.f169724b, dVar.f169725c, dVar.d, dVar.e), true, null, false, 12);
                            } else if (output instanceof iyg.c) {
                                iyg.c cVar2 = (iyg.c) output;
                                WidgetisedAnalyticsType widgetisedAnalyticsType2 = cVar2.f169719a;
                                vyg.c cVar3 = cVar2.f169720b;
                                oki.h.t2(aVar2, lVar, new WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsPerformanceStep(widgetisedAnalyticsType2, cVar2.d, cVar2.f169721c, cVar3), true, null, false, 12);
                            } else if (output instanceof iyg.b) {
                                iyg.b bVar = (iyg.b) output;
                                oki.h.t2(aVar2, lVar, new WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsAllocationStep(bVar.f169714a, bVar.f169715b, bVar.f169716c), true, null, false, 12);
                            } else if (output instanceof e) {
                                e eVar = (e) output;
                                String str = eVar.f169727a;
                                oki.h.t2(aVar2, lVar, new WidgetisedAnalyticsFlowContract$Step.PortfolioInsightsDashboardStep(eVar.f169728b, eVar.d, eVar.f169729c, str), true, null, false, 12);
                            } else {
                                if (!(output instanceof f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.D2(lVar);
                            }
                            return Unit.f186387a;
                        default:
                            ywg.d outputResult = (ywg.d) obj4;
                            Intrinsics.checkNotNullParameter(outputResult, "outputResult");
                            if (outputResult == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.t2(aVar, FlowCoordinator, new WidgetisedAnalyticsFlowContract$Step.PortfolioInsightsIndicatorStep(outputResult.f317428b, outputResult.f317427a), true, null, false, 12);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            widgetisedAnalyticsDashboardScreen.H = block;
            return widgetisedAnalyticsDashboardScreen;
        }
        if (step instanceof WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsPerformanceStep) {
            WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsPerformanceStep widgetisedAnalyticsPerformanceStep = (WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsPerformanceStep) step;
            WidgetisedAnalyticsType widgetisedAnalyticsType = widgetisedAnalyticsPerformanceStep.f95088b;
            vyg.c cVar = widgetisedAnalyticsPerformanceStep.f95087a;
            return new WidgetisedAnalyticsPerformanceScreen(new WidgetisedAnalyticsPerformanceContract$InputData(widgetisedAnalyticsType, widgetisedAnalyticsPerformanceStep.d, widgetisedAnalyticsPerformanceStep.f95089c, cVar));
        }
        if (step instanceof WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsTotalValueStep) {
            WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsTotalValueStep widgetisedAnalyticsTotalValueStep = (WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsTotalValueStep) step;
            WidgetisedAnalyticsType widgetisedAnalyticsType2 = widgetisedAnalyticsTotalValueStep.f95093a;
            vyg.c cVar2 = widgetisedAnalyticsTotalValueStep.f95094b;
            return new WidgetisedAnalyticsTotalValueScreen(new WidgetisedAnalyticsTotalValueScreenContract$InputData(widgetisedAnalyticsType2, widgetisedAnalyticsTotalValueStep.d, widgetisedAnalyticsTotalValueStep.f95095c, cVar2));
        }
        if (step instanceof WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsPnLStep) {
            WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsPnLStep widgetisedAnalyticsPnLStep = (WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsPnLStep) step;
            return new WidgetisedAnalyticsPnLScreen(new WidgetisedAnalyticsPnLScreenContract$InputData(widgetisedAnalyticsPnLStep.f95090a, widgetisedAnalyticsPnLStep.f95091b, widgetisedAnalyticsPnLStep.f95092c, widgetisedAnalyticsPnLStep.d, widgetisedAnalyticsPnLStep.e));
        }
        if (step instanceof WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsAllocationStep) {
            WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsAllocationStep widgetisedAnalyticsAllocationStep = (WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsAllocationStep) step;
            return new WidgetisedAnalyticsAllocationScreen(new WidgetisedAnalyticsAllocationScreenContract$InputData(widgetisedAnalyticsAllocationStep.f95081a, widgetisedAnalyticsAllocationStep.f95082b, widgetisedAnalyticsAllocationStep.f95083c));
        }
        if (!(step instanceof WidgetisedAnalyticsFlowContract$Step.PortfolioInsightsDashboardStep)) {
            if (!(step instanceof WidgetisedAnalyticsFlowContract$Step.PortfolioInsightsIndicatorStep)) {
                throw new NoWhenBranchMatchedException();
            }
            WidgetisedAnalyticsFlowContract$Step.PortfolioInsightsIndicatorStep portfolioInsightsIndicatorStep = (WidgetisedAnalyticsFlowContract$Step.PortfolioInsightsIndicatorStep) step;
            return new PortfolioInsightsAssetIndicatorController(new PortfolioInsightsAssetIndicatorControllerContract$InputData(portfolioInsightsIndicatorStep.f95079a, portfolioInsightsIndicatorStep.f95080b));
        }
        WidgetisedAnalyticsFlowContract$Step.PortfolioInsightsDashboardStep portfolioInsightsDashboardStep = (WidgetisedAnalyticsFlowContract$Step.PortfolioInsightsDashboardStep) step;
        String str = portfolioInsightsDashboardStep.f95076a;
        PortfolioInsightsDashboardController portfolioInsightsDashboardController = new PortfolioInsightsDashboardController(new PortfolioInsightsDashboardContract$InputData(portfolioInsightsDashboardStep.f95077b, portfolioInsightsDashboardStep.d, portfolioInsightsDashboardStep.f95078c, str));
        final int i2 = 1;
        Function1 block2 = new Function1() { // from class: ryg.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        h output = (h) obj4;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z = output instanceof g;
                        com.revolut.feature.wealth.analytics.ui.widgetised.flow.a aVar2 = aVar;
                        l lVar = FlowCoordinator;
                        if (z) {
                            g gVar = (g) output;
                            WidgetisedAnalyticsType widgetisedAnalyticsType3 = gVar.f169732a;
                            vyg.c cVar3 = gVar.f169733b;
                            oki.h.t2(aVar2, lVar, new WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsTotalValueStep(widgetisedAnalyticsType3, gVar.d, gVar.f169734c, cVar3), true, null, false, 12);
                        } else if (output instanceof d) {
                            d dVar = (d) output;
                            oki.h.t2(aVar2, lVar, new WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsPnLStep(dVar.f169723a, dVar.f169724b, dVar.f169725c, dVar.d, dVar.e), true, null, false, 12);
                        } else if (output instanceof iyg.c) {
                            iyg.c cVar22 = (iyg.c) output;
                            WidgetisedAnalyticsType widgetisedAnalyticsType22 = cVar22.f169719a;
                            vyg.c cVar32 = cVar22.f169720b;
                            oki.h.t2(aVar2, lVar, new WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsPerformanceStep(widgetisedAnalyticsType22, cVar22.d, cVar22.f169721c, cVar32), true, null, false, 12);
                        } else if (output instanceof iyg.b) {
                            iyg.b bVar = (iyg.b) output;
                            oki.h.t2(aVar2, lVar, new WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsAllocationStep(bVar.f169714a, bVar.f169715b, bVar.f169716c), true, null, false, 12);
                        } else if (output instanceof e) {
                            e eVar = (e) output;
                            String str2 = eVar.f169727a;
                            oki.h.t2(aVar2, lVar, new WidgetisedAnalyticsFlowContract$Step.PortfolioInsightsDashboardStep(eVar.f169728b, eVar.d, eVar.f169729c, str2), true, null, false, 12);
                        } else {
                            if (!(output instanceof f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            oki.h.D2(lVar);
                        }
                        return Unit.f186387a;
                    default:
                        ywg.d outputResult = (ywg.d) obj4;
                        Intrinsics.checkNotNullParameter(outputResult, "outputResult");
                        if (outputResult == null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.t2(aVar, FlowCoordinator, new WidgetisedAnalyticsFlowContract$Step.PortfolioInsightsIndicatorStep(outputResult.f317428b, outputResult.f317427a), true, null, false, 12);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        portfolioInsightsDashboardController.H = block2;
        return portfolioInsightsDashboardController;
    }

    private final Object b(Object obj2, Object obj3) {
        com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a aVar = (com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a) this.f254933b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        StoredMethodTopUpFlowContract$Step step = (StoredMethodTopUpFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof StoredMethodTopUpFlowContract$Step.EarlyCredit) {
            StoredMethodTopUpFlowContract$Step.EarlyCredit earlyCredit = (StoredMethodTopUpFlowContract$Step.EarlyCredit) step;
            ViewController viewControllerE1 = aVar.e1(new s(earlyCredit.f91021a, earlyCredit.f91022b));
            viewControllerE1.k2(new y(aVar, 6));
            return viewControllerE1;
        }
        if (!(step instanceof StoredMethodTopUpFlowContract$Step.Instructions)) {
            throw new NoWhenBranchMatchedException();
        }
        StoredMethodTopUpFlowContract$Step.Instructions instructions = (StoredMethodTopUpFlowContract$Step.Instructions) step;
        ViewController viewControllerE12 = aVar.e1(new f0(instructions.f91024b, instructions.f91023a, new r25.a(aVar, LazyFlowCoordinator, null, 17)));
        p block = new p(aVar, LazyFlowCoordinator, 19);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerE12.H = block;
        return viewControllerE12;
    }

    private final Object c(Object obj2, Object obj3) {
        com.revolut.feature.apm.core.ui.impl.ui.qr.pager.a aVar = (com.revolut.feature.apm.core.ui.impl.ui.qr.pager.a) this.f254933b;
        ali.b PagerCoordinator = (ali.b) obj2;
        QrFlowContract$Page item = (QrFlowContract$Page) obj3;
        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
        Intrinsics.checkNotNullParameter(item, "item");
        if (!Intrinsics.f(item, QrFlowContract$Page.Scanner.f62373b)) {
            if (Intrinsics.f(item, QrFlowContract$Page.Details.f62372b)) {
                return new QrDetailsScreen(new QrDetailsScreenContract$InputData(aVar.o.e));
            }
            throw new NoWhenBranchMatchedException();
        }
        QrScanningScreen qrScanningScreen = new QrScanningScreen(new s32.h());
        i block = new i(aVar, 18);
        Intrinsics.checkNotNullParameter(block, "block");
        qrScanningScreen.H = block;
        return qrScanningScreen;
    }

    /* JADX WARN: Type inference failed for: r1v80, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        TextLocalisedClause textLocalisedClause;
        int i;
        int i2 = this.f254932a;
        int i3 = 17;
        int i5 = 3;
        int i6 = 2;
        final int i21 = 1;
        Object obj4 = this.f254933b;
        switch (i2) {
            case 0:
                com.revolut.feature.junior_remote_login.impl.ui.flow.update_phone_number.b bVar = (com.revolut.feature.junior_remote_login.impl.ui.flow.update_phone_number.b) obj4;
                l FlowCoordinator = (l) obj2;
                JuniorUpdatePhoneNumberFlowContract$Step step = (JuniorUpdatePhoneNumberFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof JuniorUpdatePhoneNumberFlowContract$Step.AddPhoneNumber)) {
                    if (!(step instanceof JuniorUpdatePhoneNumberFlowContract$Step.InvitationSuccessPrompt)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    JuniorUpdatePhoneNumberFlowContract$Step.InvitationSuccessPrompt invitationSuccessPrompt = (JuniorUpdatePhoneNumberFlowContract$Step.InvitationSuccessPrompt) step;
                    return ((tl8.b) bVar.f77198r).a(invitationSuccessPrompt.f77193a, invitationSuccessPrompt.f77194b, new m(bVar, step, 7));
                }
                JuniorAddPhoneNumberFlow juniorAddPhoneNumberFlow = new JuniorAddPhoneNumberFlow(new JuniorAddPhoneNumberFlowContract$InputData(bVar.o.f77230a));
                e block = new e(1, 0, com.revolut.feature.junior_remote_login.impl.ui.flow.update_phone_number.b.class, bVar, "handleJuniorAddPhoneNumberResult", "handleJuniorAddPhoneNumberResult(Lcom/revolut/feature/junior_remote_login/navigation/JuniorAddPhoneNumberFlowPublicContract$OutputData;)V");
                Intrinsics.checkNotNullParameter(block, "block");
                juniorAddPhoneNumberFlow.H = block;
                return juniorAddPhoneNumberFlow;
            case 1:
                com.revolut.feature.backgroundpicker.impl.flow.catalogue.b bVar2 = (com.revolut.feature.backgroundpicker.impl.flow.catalogue.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                BackgroundCatalogControllerContract$ModalStep step2 = (BackgroundCatalogControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof BackgroundCatalogControllerContract$ModalStep.DeleteConfirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2.u.getClass();
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(R$string.background_picker_label_delete_image, null, null, 14), new TextLocalisedClause(R$string.background_picker_label_delete_are_you_sure, null, null, 14), null, null, false, 28), new aw0.g(new n6(new TextLocalisedClause(R$string.background_picker_button_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.background_picker_button_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25), AnalyticsProduct.Shared.RevolutUIKit.f, null, null, 24));
                m block2 = new m(bVar2, step2, 10);
                Intrinsics.checkNotNullParameter(block2, "block");
                actionsBottomSheetController.H = block2;
                return actionsBottomSheetController;
            case 2:
                com.revolut.feature.external_accounts.impl.ui.india.upi.flow.a aVar = (com.revolut.feature.external_accounts.impl.ui.india.upi.flow.a) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                UpiTransferFlowContract$Step step3 = (UpiTransferFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!Intrinsics.f(step3, UpiTransferFlowContract$Step.UpiApplications.f72939a)) {
                    throw new NoWhenBranchMatchedException();
                }
                UpiTransferFlowContract$InputData upiTransferFlowContract$InputData = aVar.o;
                UpiApplicationsScreen upiApplicationsScreen = new UpiApplicationsScreen(new k(upiTransferFlowContract$InputData.f72934a, upiTransferFlowContract$InputData.f72935b, upiTransferFlowContract$InputData.f72936c));
                d0 block3 = new d0(aVar, i5);
                Intrinsics.checkNotNullParameter(block3, "block");
                upiApplicationsScreen.H = block3;
                return upiApplicationsScreen;
            case 3:
                final com.revolut.feature.spending_analytics.impl.ui.budget.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.budget.a) obj4;
                l FlowCoordinator2 = (l) obj2;
                BudgetFlowContract$Step step4 = (BudgetFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof BudgetFlowContract$Step.SetupBudget) {
                    return new SetupBudgetController(new SetupBudgetContract$InputData(((BudgetFlowContract$Step.SetupBudget) step4).f87507a));
                }
                if (step4 instanceof BudgetFlowContract$Step.BudgetOverview) {
                    return new BudgetOverviewController(new BudgetOverviewContract$InputData(((BudgetFlowContract$Step.BudgetOverview) step4).f87504a));
                }
                if (step4 instanceof BudgetFlowContract$Step.CategoryBudgets) {
                    CategoryBudgetsController categoryBudgetsController = new CategoryBudgetsController(new CategoryBudgetsContract$InputData(((BudgetFlowContract$Step.CategoryBudgets) step4).f87505a));
                    final int i22 = 0;
                    Function1 block4 = new Function1() { // from class: rmd.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i22) {
                                case 0:
                                    smd.k it8 = (smd.k) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    com.revolut.feature.spending_analytics.impl.ui.budget.a aVar3 = aVar2;
                                    aVar3.f87509p.e(true);
                                    yji.l.b1(aVar3, aVar3.X1(new mii.k("category_budgets_updated", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_budget_categories_success, null, null, 14), null, null, null, 28)), null, null, 7);
                                    break;
                                default:
                                    epd.e result = (epd.e) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    i3 i3Var = result.f128162a;
                                    if (i3Var != null) {
                                        com.revolut.feature.spending_analytics.impl.ui.budget.a aVar4 = aVar2;
                                        aVar4.l2(new rm6.c(aVar4, i3Var, null, 2), new yi5.b(26));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block4, "block");
                    categoryBudgetsController.H = block4;
                    return categoryBudgetsController;
                }
                if (!(step4 instanceof BudgetFlowContract$Step.CreateCategory)) {
                    if (step4 instanceof BudgetFlowContract$Step.UpcomingPayments) {
                        return new BudgetUpcomingPaymentsController(new BudgetUpcomingPaymentsContract$InputData(((BudgetFlowContract$Step.UpcomingPayments) step4).f87508a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                CategoryManagementCustomController categoryManagementCustomController = new CategoryManagementCustomController(new CategoryManagementCustomContract$InputData(((BudgetFlowContract$Step.CreateCategory) step4).f87506a, null, CategoryManagementCustomContract$Mode.AddNew.f87645a));
                Function1 block5 = new Function1() { // from class: rmd.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i21) {
                            case 0:
                                smd.k it8 = (smd.k) obj5;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                com.revolut.feature.spending_analytics.impl.ui.budget.a aVar3 = aVar2;
                                aVar3.f87509p.e(true);
                                yji.l.b1(aVar3, aVar3.X1(new mii.k("category_budgets_updated", new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_budget_categories_success, null, null, 14), null, null, null, 28)), null, null, 7);
                                break;
                            default:
                                epd.e result = (epd.e) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                i3 i3Var = result.f128162a;
                                if (i3Var != null) {
                                    com.revolut.feature.spending_analytics.impl.ui.budget.a aVar4 = aVar2;
                                    aVar4.l2(new rm6.c(aVar4, i3Var, null, 2), new yi5.b(26));
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block5, "block");
                categoryManagementCustomController.H = block5;
                return categoryManagementCustomController;
            case 4:
                com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.a aVar3 = (com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EsimConnectivityTroubleshootingScreenContract$ModalStep step5 = (EsimConnectivityTroubleshootingScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (!(step5 instanceof EsimConnectivityTroubleshootingScreenContract$ModalStep.ResetConfirmation)) {
                    if (!(step5 instanceof EsimConnectivityTroubleshootingScreenContract$ModalStep.EsimInstallation)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EsimConnectivityTroubleshootingScreenContract$ModalStep.EsimInstallation esimInstallation = (EsimConnectivityTroubleshootingScreenContract$ModalStep.EsimInstallation) step5;
                    ViewController viewControllerE1 = aVar3.e1(new fej.c(new EsimInstallationFlowDescriptor$InputData(esimInstallation.f101478a, EsimInstallationFlowDescriptor$Start.DirectInstallation, esimInstallation.f101479b)));
                    rnj.g block6 = new rnj.g(aVar3, i6);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    viewControllerE1.H = block6;
                    return viewControllerE1;
                }
                unj.i iVar = aVar3.f101481p;
                Instant instant = ((EsimConnectivityTroubleshootingScreenContract$ModalStep.ResetConfirmation) step5).f101480a;
                iVar.getClass();
                lw0.a aVar4 = new lw0.a(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_reset_esim_bottom_sheet_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_reset_esim_bottom_sheet_subtitle, null, null, 14), null, null, false, 28);
                n6 n6Var = new n6(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_reset_esim_bottom_sheet_reset_button_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, instant == null, null, null, 988);
                if (instant != null) {
                    int i32 = com.revolut.retail.feature.esim.impl.R$string.esim_reset_esim_bottom_sheet_caption;
                    iVar.f281445a.getClass();
                    textLocalisedClause = new TextLocalisedClause(i32, u.c(tnj.a.a(instant)), null, 12);
                } else {
                    textLocalisedClause = null;
                }
                aw0.e eVar = new aw0.e(false, textLocalisedClause, null, n6Var, null, null, 53);
                k9 k9Var = k9.ESim;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar4, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                rnj.g block7 = new rnj.g(aVar3, i21);
                Intrinsics.checkNotNullParameter(block7, "block");
                actionsBottomSheetController2.H = block7;
                return actionsBottomSheetController2;
            case 5:
                com.revolut.feature.user_declarations.shared.flows.tracking.flow.a aVar5 = (com.revolut.feature.user_declarations.shared.flows.tracking.flow.a) obj4;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                TrackingConsentFlowContract$Step step6 = (TrackingConsentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof TrackingConsentFlowContract$Step.Consent) {
                    AnalyticsEventTrackingConsentControllerProvider analyticsEventTrackingConsentControllerProvider = aVar5.f94686q;
                    d0 d0Var = new d0(aVar5, 12);
                    analyticsEventTrackingConsentControllerProvider.getClass();
                    return AnalyticsEventTrackingConsentControllerProvider.a(d0Var, false);
                }
                if (!Intrinsics.f(step6, TrackingConsentFlowContract$Step.LearnMore.f94684a)) {
                    throw new NoWhenBranchMatchedException();
                }
                AnalyticsEventTrackingConsentControllerProvider.Companion.getClass();
                return aVar5.e1(AnalyticsEventTrackingConsentControllerProvider.Companion.a());
            case 6:
                com.revolut.sso.impl.ui.post_authentication.a aVar6 = (com.revolut.sso.impl.ui.post_authentication.a) obj4;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                PostAuthenticationFlowContract$Step step7 = (PostAuthenticationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!(step7 instanceof PostAuthenticationFlowContract$Step.CountrySelection)) {
                    throw new NoWhenBranchMatchedException();
                }
                CountrySelectionScreen countrySelectionScreen = new CountrySelectionScreen(((PostAuthenticationFlowContract$Step.CountrySelection) step7).f106680a);
                d0 block8 = new d0(aVar6, 14);
                Intrinsics.checkNotNullParameter(block8, "block");
                countrySelectionScreen.H = block8;
                return countrySelectionScreen;
            case 7:
                xo1.d params = (xo1.d) obj2;
                List data = (List) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(data, "data");
                ((j) obj4).f256246c.f(j.a(params), data);
                return Unit.f186387a;
            case 8:
                com.revolut.feature.bank_account_switching.impl.ui.switch_out.a aVar7 = (com.revolut.feature.bank_account_switching.impl.ui.switch_out.a) obj4;
                l FlowCoordinator3 = (l) obj2;
                BankAccountSwitchingSwitchOutFlowContract$Step step8 = (BankAccountSwitchingSwitchOutFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (!(step8 instanceof BankAccountSwitchingSwitchOutFlowContract$Step.Confirmation)) {
                    if (!(step8 instanceof BankAccountSwitchingSwitchOutFlowContract$Step.Review)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    BankAccountSwitchingReviewOutScreen bankAccountSwitchingReviewOutScreen = new BankAccountSwitchingReviewOutScreen(new BankAccountSwitchingReviewOutScreenContract$InputData(((BankAccountSwitchingSwitchOutFlowContract$Step.Review) step8).f64048a));
                    d0 block9 = new d0(aVar7, 19);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    bankAccountSwitchingReviewOutScreen.H = block9;
                    return bankAccountSwitchingReviewOutScreen;
                }
                BankAccountSwitchingSwitchOutFlowContract$Step.Confirmation confirmation = (BankAccountSwitchingSwitchOutFlowContract$Step.Confirmation) step8;
                String str = confirmation.f64045a;
                mn2.a aVar8 = confirmation.f64046b;
                LocalDate switchDate = confirmation.f64047c;
                aVar7.f64050q.getClass();
                Intrinsics.checkNotNullParameter(switchDate, "switchDate");
                d67.e eVar2 = d67.g.Companion;
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_account_closure_confirmation_title, null, null, 14);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_account_closure_confirmation_description, u.c(new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_account_closure_confirmation_description_customer_privacy_notice, null, new Click(14, Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, "ID_PRIVACY_NOTICE", false), 10)), null, 12);
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                int i33 = com.revolut.feature.bank_account_switching.api.R$string.account_switch_account_closure_confirmation_action;
                com.revolut.core.ui_kit.models.j jVar = c7.Companion;
                LocalDateClause$DateFormat.INSTANCE.getClass();
                FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(d67.e.a(eVar2, textLocalisedClause2, textLocalisedClause3, null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D174", null, null, null, 30), resourceImage, null, null, null, null, new TextLocalisedClause(i33, u.c(com.revolut.core.ui_kit.models.j.b(jVar, switchDate, LocalDateClause$DateFormat.Companion.f57815b)), null, 12), null, true, null, null, null, false, 16743372));
                q2k.b block10 = new q2k.b(19, str, aVar7, aVar8, switchDate);
                Intrinsics.checkNotNullParameter(block10, "block");
                fullScreenPromptScreen.H = block10;
                return fullScreenPromptScreen;
            case 9:
                CreditLimitCapChangeScreen creditLimitCapChangeScreen = (CreditLimitCapChangeScreen) obj4;
                CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = CreditLimitCapChangeScreen.X;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj5 = model.f51981p;
                xi0.b bVar3 = obj5 instanceof xi0.b ? (xi0.b) obj5 : null;
                if (bVar3 != null) {
                    return new zp0.d(field.getEditText(), bVar3, (u80.d) creditLimitCapChangeScreen.O.getValue(), null, new ogm.i(creditLimitCapChangeScreen, 19), false, false, 0, false, null, 1928);
                }
                return null;
            case 10:
                com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c cVar = (com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c) obj4;
                rq4.a aVar9 = cVar.f69186r;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CreditLimitCapChangeScreenContract$ModalStep step9 = (CreditLimitCapChangeScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                int i43 = 6;
                if (step9 instanceof CreditLimitCapChangeScreenContract$ModalStep.LimitManagement) {
                    boolean z = ((CreditLimitCapChangeScreenContract$ModalStep.LimitManagement) step9).f69183a;
                    aVar9.getClass();
                    lw0.a aVar10 = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_limit_management_title, null, null, 14), null, null, null, false, 30);
                    Object obj6 = null;
                    aw0.e eVar3 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_limit_management_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                    aim.e eVarB = u.b();
                    RowDelegate.Model.c cVar2 = null;
                    boolean z3 = false;
                    boolean z4 = false;
                    eVarB.addAll(v.k(new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_limit_management_info_spending_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_limit_management_info_spending_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_limit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, i43), false, false, cVar2, obj6, 488), new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_limit_management_info_change_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_limit_management_info_change_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_draw_parallel_channel, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, i43), false, false, cVar2, obj6, 488)));
                    if (z) {
                        boolean z6 = false;
                        eVarB.add(new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_limit_management_info_update_title, null, null, 14), (Clause) new HtmlLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_limit_management_info_update_subtitle, (List) null, (Integer) null, (Object) null, 30), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_cfd, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z6, z6, i43), false, false, (RowDelegate.Model.c) null, (Object) null, 488));
                    }
                    Unit unit = Unit.f186387a;
                    aim.e eVarA = u.a(eVarB);
                    k9 k9Var2 = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar10, eVar3, eVarA, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null));
                    rq4.m block11 = new rq4.m(cVar, 0);
                    Intrinsics.checkNotNullParameter(block11, "block");
                    rowActionsBottomSheetController.H = block11;
                    return rowActionsBottomSheetController;
                }
                if (Intrinsics.f(step9, CreditLimitCapChangeScreenContract$ModalStep.AvailableLessThanZero.f69174a)) {
                    aVar9.getClass();
                    lw0.a aVar11 = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_limit_confirmation_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_limit_confirmation_subtitle, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_exclamation_mark, null, null, 6)), null, false, 24);
                    aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_limit_confirmation_button_primary, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_limit_confirmation_button_secondary, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                    k9 k9Var3 = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar11, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                    rq4.m block12 = new rq4.m(cVar, i21);
                    Intrinsics.checkNotNullParameter(block12, "block");
                    actionsBottomSheetController3.H = block12;
                    return actionsBottomSheetController3;
                }
                if (step9 instanceof CreditLimitCapChangeScreenContract$ModalStep.ImpactedCardholders) {
                    CreditLimitCapImpact impactedCardholders = ((CreditLimitCapChangeScreenContract$ModalStep.ImpactedCardholders) step9).f69179a;
                    aVar9.getClass();
                    Intrinsics.checkNotNullParameter(impactedCardholders, "impactedCardholders");
                    lw0.a aVar12 = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_cardholder_impact_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_cardholder_impact_subtitle, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_exclamation_mark, null, null, 6)), null, false, 24);
                    aw0.h hVar2 = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_limit_confirmation_button_primary, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_limit_confirmation_button_secondary, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                    ArrayList<ImpactedCardholder> arrayList = impactedCardholders.f68720a;
                    ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                    for (ImpactedCardholder impactedCardholder : arrayList) {
                        NewBadgeContent newBadgeContent = null;
                        arrayList2.add(new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_cardholder_impact_cardholder_name, u.c(impactedCardholder.f68722b), null, 12), (Clause) new CompositeClause(v.k(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_cardholder_impact_cardholder_newCap, u.c(sx4.f.b(3, null, null, impactedCardholder.e)), new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 8), sx4.f.b(1, new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), null, impactedCardholder.d)), sx4.g.e(1), null, null, 12), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(new ContactImage(impactedCardholder.f68721a, (String) null, (String) null, (String) null, (String) null, impactedCardholder.f, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4062), new WarningCircleBadge(dw0.a.Info), null, false, newBadgeContent, false, 60), false, false, (RowDelegate.Model.c) null, (Object) newBadgeContent, 488));
                    }
                    k9 k9Var4 = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                    RowActionsBottomSheetController rowActionsBottomSheetController2 = new RowActionsBottomSheetController(new eii.c(aVar12, hVar2, arrayList2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null));
                    rq4.m block13 = new rq4.m(cVar, i6);
                    Intrinsics.checkNotNullParameter(block13, "block");
                    rowActionsBottomSheetController2.H = block13;
                    return rowActionsBottomSheetController2;
                }
                if (step9 instanceof CreditLimitCapChangeScreenContract$ModalStep.LimitDecreaseSheet) {
                    CreditLimitCapChangeScreenContract$ModalStep.LimitDecreaseSheet limitDecreaseSheet = (CreditLimitCapChangeScreenContract$ModalStep.LimitDecreaseSheet) step9;
                    CreditCardLimitDecreaseAmountScreen creditCardLimitDecreaseAmountScreen = new CreditCardLimitDecreaseAmountScreen(new CreditCardLimitDecreaseAmountScreenContract$InputData(cVar.o.f69172a, limitDecreaseSheet.f69181b, limitDecreaseSheet.f69180a, limitDecreaseSheet.f69182c));
                    rq4.m block14 = new rq4.m(cVar, i5);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    creditCardLimitDecreaseAmountScreen.H = block14;
                    return creditCardLimitDecreaseAmountScreen;
                }
                if (!(step9 instanceof CreditLimitCapChangeScreenContract$ModalStep.AvailableToSpend)) {
                    if (!(step9 instanceof CreditLimitCapChangeScreenContract$ModalStep.CreditLimitDecreaseIneligibleExplainer)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar9.getClass();
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_decrease_dialog_unavailable_title, null, null, 14);
                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_decrease_dialog_unavailable_description, null, null, 14);
                    BottomSheet.ActionItem actionItem = new BottomSheet.ActionItem(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_got_it, null, null, 14), null);
                    k9 k9Var5 = k9.Credit;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                    return BottomSheet.b(textLocalisedClause4, textLocalisedClause5, null, null, actionItem, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), 172);
                }
                CreditLimitCapChangeScreenContract$ModalStep.AvailableToSpend availableToSpend = (CreditLimitCapChangeScreenContract$ModalStep.AvailableToSpend) step9;
                dj0.d creditCardLimit = availableToSpend.f69175a;
                dj0.d spent = availableToSpend.f69176b;
                dj0.d available = availableToSpend.f69177c;
                dj0.d maxCap = availableToSpend.d;
                aVar9.getClass();
                Intrinsics.checkNotNullParameter(creditCardLimit, "creditCardLimit");
                Intrinsics.checkNotNullParameter(spent, "spent");
                Intrinsics.checkNotNullParameter(available, "available");
                Intrinsics.checkNotNullParameter(maxCap, "maxCap");
                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_available_to_spend_title, null, null, 14);
                TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_available_to_spend_info_limit, null, null, 14);
                TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_available_to_spend_info_limit_value, u.c(sx4.f.b(3, null, null, creditCardLimit)), null, 12);
                int i59 = 0;
                int i66 = SyslogConstants.LOG_CLOCK;
                Clause clause = null;
                boolean z11 = false;
                com.revolut.feature.credit.core.ui.bottom_sheet.a aVar13 = null;
                List listK = v.k(new BottomSheet.Item.CellItem("credit_limit_cap_credit_card_limit", textLocalisedClause7, textLocalisedClause8, clause, z11, aVar13, i59, i66), new BottomSheet.Item.CellItem("credit_limit_cap_credit_card_spent", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_available_to_spend_info_spent, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_available_to_spend_info_spent_value, u.c(sx4.f.b(3, null, null, spent.l())), null, 12), clause, z11, aVar13, i59, i66), new BottomSheet.Item.CellItem("credit_limit_cap_credit_card_available", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_available_to_spend_info_available, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_available_to_spend_info_available_value, u.c(sx4.f.b(3, null, null, l9.l.p(available, maxCap))), null, 12), null, false, com.revolut.feature.credit.core.ui.bottom_sheet.a.H3, 0, 88));
                BottomSheet.ActionItem actionItem2 = new BottomSheet.ActionItem(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_limit_cap_change_dialog_available_to_spend_button, null, null, 14), null);
                k9 k9Var6 = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                return BottomSheet.b(textLocalisedClause6, null, null, listK, actionItem2, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var6, "value", k9Var6), Constants.TAG_GPI_VERSION);
            case 11:
                com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingflow.a aVar14 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingflow.a) obj4;
                l FlowCoordinator4 = (l) obj2;
                CryptoAddressHostingFlowContract$Step step10 = (CryptoAddressHostingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof CryptoAddressHostingFlowContract$Step.AddressHostingPicker) {
                    CryptoAddressHostingPickerController cryptoAddressHostingPickerController = new CryptoAddressHostingPickerController(new CryptoAddressHostingPickerContract$InputData(aVar14.o.f71077b));
                    m block15 = new m(aVar14, FlowCoordinator4, 22);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    cryptoAddressHostingPickerController.H = block15;
                    return cryptoAddressHostingPickerController;
                }
                if (!(step10 instanceof CryptoAddressHostingFlowContract$Step.AddProvider)) {
                    throw new NoWhenBranchMatchedException();
                }
                CryptoAddressHostingAddProviderController cryptoAddressHostingAddProviderController = new CryptoAddressHostingAddProviderController();
                d0 block16 = new d0(aVar14, 26);
                Intrinsics.checkNotNullParameter(block16, "block");
                cryptoAddressHostingAddProviderController.H = block16;
                return cryptoAddressHostingAddProviderController;
            case 12:
                com.revolut.feature.foreign_currencies.impl.ui.flow.a aVar15 = (com.revolut.feature.foreign_currencies.impl.ui.flow.a) obj4;
                l FlowCoordinator5 = (l) obj2;
                ForeignCurrenciesFlowContract$Step step11 = (ForeignCurrenciesFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (Intrinsics.f(step11, ForeignCurrenciesFlowContract$Step.Details.f73164a)) {
                    ForeignCurrenciesDetailsController foreignCurrenciesDetailsController = new ForeignCurrenciesDetailsController();
                    m block17 = new m(aVar15, FlowCoordinator5, 23);
                    Intrinsics.checkNotNullParameter(block17, "block");
                    foreignCurrenciesDetailsController.H = block17;
                    return foreignCurrenciesDetailsController;
                }
                if (!Intrinsics.f(step11, ForeignCurrenciesFlowContract$Step.Activation.f73163a)) {
                    throw new NoWhenBranchMatchedException();
                }
                t99.k kVar = aVar15.o;
                k9 k9Var7 = k9.SecurityHub;
                Parcelable.Creator<AnalyticsProduct.Retail> creator7 = AnalyticsProduct.Retail.CREATOR;
                ExchangeGlobalAccessFlow exchangeGlobalAccessFlowB = t99.k.b(kVar, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var7, "value", k9Var7), 3);
                d0 block18 = new d0(aVar15, 27);
                Intrinsics.checkNotNullParameter(block18, "block");
                exchangeGlobalAccessFlowB.H = block18;
                return exchangeGlobalAccessFlowB;
            case 13:
                com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.a aVar16 = (com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ScreenerStatsFiltersControllerContract$ModalStep step12 = (ScreenerStatsFiltersControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof ScreenerStatsFiltersControllerContract$ModalStep.InfoDialog) {
                    sph.m mVar = aVar16.f96282r;
                    ScreenerFilterInfo.Dialog dialog = ((ScreenerStatsFiltersControllerContract$ModalStep.InfoDialog) step12).f96279a;
                    mVar.getClass();
                    return new ActionsBottomSheetController(sph.m.a(dialog));
                }
                if (!(step12 instanceof ScreenerStatsFiltersControllerContract$ModalStep.ControllerDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                vph.d dVar = aVar16.f96283s;
                com.revolut.feature.wealth_discovery.impl.screener.domain.model.a info = ((ScreenerStatsFiltersControllerContract$ModalStep.ControllerDialog) step12).f96278a;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(info, "info");
                if (vph.c.f291210a[info.ordinal()] == 1) {
                    return aVar16.e1(new j3h.a());
                }
                throw new NoWhenBranchMatchedException();
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                ((com.revolut.feature.freelancer.impl.ui.cashback.screen.plan.b) obj4).getClass();
                return a.C0489a.f73757a;
            case 15:
                com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.a aVar17 = (com.revolut.feature.recurringbuys.impl.ui.kompot.payment_history.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PaymentHistoryContract$ModalStep step13 = (PaymentHistoryContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!(step13 instanceof PaymentHistoryContract$ModalStep.TransactionsPager)) {
                    throw new NoWhenBranchMatchedException();
                }
                PaymentHistoryContract$ModalStep.TransactionsPager transactionsPager = (PaymentHistoryContract$ModalStep.TransactionsPager) step13;
                return aVar17.e1(aVar17.f81669r.a(transactionsPager.f81666b, transactionsPager.f81665a, ""));
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new aw0.e(false, null, null, rwb.l.a((rwb.l) obj4, new TextLocalisedClause(com.revolut.feature.rev_points.giftcards.api.R$string.gift_cards_details_cta_insufficient_balance, null, null, 14), null, "EMPTY_BUTTON", 2), null, null, 55);
            case 17:
                com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.a aVar18 = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter((TrendingContract$ModalStep) obj3, "step");
                TimeframePickerScreen timeframePickerScreen = new TimeframePickerScreen(new TimeframePickerScreenContract$InputData(((rx5.a) ((j2) aVar18.f71578s.f22677a).getValue()).f258025a));
                rrd.l block19 = new rrd.l(aVar18, 19);
                Intrinsics.checkNotNullParameter(block19, "block");
                timeframePickerScreen.H = block19;
                return timeframePickerScreen;
            case 18:
                com.revolut.feature.freelancer.impl.ui.invoice.list.a aVar19 = (com.revolut.feature.freelancer.impl.ui.invoice.list.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InvoiceListScreenContract$ModalStep step14 = (InvoiceListScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (!(step14 instanceof InvoiceListScreenContract$ModalStep.Filters)) {
                    throw new NoWhenBranchMatchedException();
                }
                FreelancerSalesFiltersScreen freelancerSalesFiltersScreen = new FreelancerSalesFiltersScreen(new FreelancerSalesFiltersScreenContract$InputData(((InvoiceListScreenContract$ModalStep.Filters) step14).f73875a));
                rrd.l lVar = new rrd.l(aVar19, 22);
                Intrinsics.checkNotNullParameter(lVar, "<set-?>");
                freelancerSalesFiltersScreen.H = lVar;
                return freelancerSalesFiltersScreen;
            case 19:
                PetBreedDetailsFragment petBreedDetailsFragment = (PetBreedDetailsFragment) obj4;
                InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                InputText field2 = (InputText) obj3;
                int i74 = PetBreedDetailsFragment.m0;
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(field2, "field");
                if (!Intrinsics.f(model2.f52580a, "AMOUNT_INPUT_TEXT_LIST_ID")) {
                    return null;
                }
                qd0.b languageProvider = ((ox7.e) petBreedDetailsFragment.f0.getValue()).f230682a.f230661b.n();
                vc.s.j(languageProvider);
                Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
                ihm.f amountInputSubject = petBreedDetailsFragment.g0;
                Intrinsics.checkNotNullParameter(field2, "field");
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(amountInputSubject, "amountInputSubject");
                MaskedTextInputEditText innerEditText = field2.getInnerEditText();
                Object obj7 = model2.P;
                Intrinsics.i(obj7, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                return new zp0.d(innerEditText, (xi0.b) obj7, new u80.d(((s80.b) languageProvider).b()), null, new sz7.c(amountInputSubject, model2), false, true, 0, false, null, 1960);
            case 20:
                int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                KProperty[] kPropertyArr2 = StandaloneSymbolCustomisationScreen.S;
                ((o) ((StandaloneSymbolCustomisationScreen) obj4).R2()).I2(new ry5.k(iIntValue, iIntValue2));
                return Unit.f186387a;
            case 21:
                o oVar = (o) obj4;
                ce9.p pVar = (ce9.p) obj2;
                n action = (n) obj3;
                Intrinsics.checkNotNullParameter(action, "action");
                ce9.o oVar2 = pVar != null ? pVar.f : null;
                hw5.a aVar20 = oVar2 instanceof hw5.a ? (hw5.a) oVar2 : null;
                int i92 = aVar20 != null ? aVar20.f156099a : 0;
                int i96 = ry5.n.f258235a[action.ordinal()];
                if (i96 == 1 || i96 == 2) {
                    i = 0;
                } else if (i96 == 3) {
                    i = i92 + 1;
                } else {
                    if (i96 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = i92;
                }
                nw5.i iVar2 = oVar.o;
                String query = ((ry5.f) ((j2) oVar.f258236p.f22677a).getValue()).f258228b;
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                r map = xv5.c.b(iVar2.f219781b).map(new a0(2, nw5.g.f219779a));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return nim.a.w(rd0.e.c(new m0(xam.a.h(new nn7.d(iVar2, null, 29), rd0.e.b(map)), iVar2, query, i, 4), kotlin.coroutines.g.f186406a), new l2c.l(i, i3));
            case 22:
                com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.a aVar21 = (com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator8 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InvitesListContract$ModalStep step15 = (InvitesListContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator8, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (!(step15 instanceof InvitesListContract$ModalStep.IneligibilityDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                cya.g gVar = aVar21.f81898r;
                String str2 = ((InvitesListContract$ModalStep.IneligibilityDialog) step15).f81893a;
                rnb.u uVar = new rnb.u(1, aVar21.f81900t, cya.f.class, "handleDeeplink", "handleDeeplink(Ljava/lang/String;)V", 0, 15);
                gVar.getClass();
                return cya.g.a(str2, uVar);
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new rya.j(((com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.b) obj4).b());
            case 24:
                return a(obj2, obj3);
            case 25:
                GlossaryHomeScreen glossaryHomeScreen = (GlossaryHomeScreen) obj4;
                RecyclerView recyclerView = (RecyclerView) obj2;
                Integer num = (Integer) obj3;
                int iIntValue3 = num.intValue();
                KProperty[] kPropertyArr3 = GlossaryHomeScreen.Y;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                glossaryHomeScreen.T.put(num, recyclerView);
                if (glossaryHomeScreen.Z2().e.getCurrentItem() == iIntValue3) {
                    ArrayList arrayList3 = glossaryHomeScreen.P;
                    LabeledVerticalScrollView labeledVerticalScrollView = glossaryHomeScreen.Z2().f200844b;
                    Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                    labeledVerticalScrollView.d = recyclerView;
                    labeledVerticalScrollView.setLabels(arrayList3);
                }
                return Unit.f186387a;
            case 26:
                return b(obj2, obj3);
            case 27:
                com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a aVar22 = (com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.a) obj4;
                l FlowCoordinator6 = (l) obj2;
                IndiaWithdrawalFlowContract$Step step16 = (IndiaWithdrawalFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator6, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (Intrinsics.f(step16, IndiaWithdrawalFlowContract$Step.Initial.f102006a)) {
                    return new LayoutViewerScreen(R$layout.screen_transparent);
                }
                if (!(step16 instanceof IndiaWithdrawalFlowContract$Step.Choose)) {
                    throw new NoWhenBranchMatchedException();
                }
                IndiaWithdrawalChooseAccountScreen indiaWithdrawalChooseAccountScreen = new IndiaWithdrawalChooseAccountScreen(new t2k.c(((IndiaWithdrawalFlowContract$Step.Choose) step16).f102005a));
                i block20 = new i(aVar22, i3);
                Intrinsics.checkNotNullParameter(block20, "block");
                indiaWithdrawalChooseAccountScreen.H = block20;
                return indiaWithdrawalChooseAccountScreen;
            case 28:
                return c(obj2, obj3);
            default:
                com.revolut.feature.revolut_shop.ui.flow.order_history.a aVar23 = (com.revolut.feature.revolut_shop.ui.flow.order_history.a) obj4;
                l FlowCoordinator7 = (l) obj2;
                OrderHistoryFlowContract$Step step17 = (OrderHistoryFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator7, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step17, "step");
                if (step17 instanceof OrderHistoryFlowContract$Step.OrderHistory) {
                    OrderHistoryScreen orderHistoryScreen = new OrderHistoryScreen();
                    s3c.c block21 = new s3c.c(aVar23, FlowCoordinator7);
                    Intrinsics.checkNotNullParameter(block21, "block");
                    orderHistoryScreen.H = block21;
                    return orderHistoryScreen;
                }
                if (!(step17 instanceof OrderHistoryFlowContract$Step.OrderConfirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                OrderHistoryFlowContract$Step.OrderConfirmation orderConfirmation = (OrderHistoryFlowContract$Step.OrderConfirmation) step17;
                OrderConfirmationScreen orderConfirmationScreen = new OrderConfirmationScreen(new OrderConfirmationScreenContract$InputData(orderConfirmation.f84220a, orderConfirmation.f84221b));
                s3c.c block22 = new s3c.c(FlowCoordinator7, aVar23);
                Intrinsics.checkNotNullParameter(block22, "block");
                orderConfirmationScreen.H = block22;
                return orderConfirmationScreen;
        }
    }
}
