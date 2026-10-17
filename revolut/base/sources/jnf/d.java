package jnf;

import android.os.Parcelable;
import aw0.n6;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountScreen;
import com.revolut.feature.apm.breb.impl.ui.qr_request.BrebQrRequestFlowContract$Step;
import com.revolut.feature.apm.breb.impl.ui.qr_request.add_details.BrebQrRequestAddDetailsScreen;
import com.revolut.feature.apm.breb.impl.ui.qr_request.add_details.BrebQrRequestAddDetailsScreenContract$InputData;
import com.revolut.feature.apm.breb.impl.ui.qr_request.key_selection.BrebQrRequestKeySelectionScreen;
import com.revolut.feature.apm.breb.impl.ui.qr_request.request.BrebQrRequestScreen;
import com.revolut.feature.apm.breb.impl.ui.qr_request.request.BrebQrRequestScreenContract$InputData;
import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentChangeTermQuote;
import com.revolut.feature.credit.card.impl.ui.bottom_sheet.picket.PickerBottomSheetController;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep;
import com.revolut.feature.credit.card.impl.ui.repay.pse.CreditCardPseRepayScreen;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.ui.bottom_sheet.BottomSheet;
import com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.flow.CryptoTradeFlowContract$Step;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.RetailCryptoTradeFlow;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.TrendingScreen;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.CrossBorderInstitutionsScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.cashback.flow.FreelancerCashbackFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.FreelancerCashbackBoosterScreen;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.details.FreelancerCashbackDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.plan.FreelancerCashbackPlanScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.TaxHubPaymentAssessmentScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.recipient_picker.TaxHubPaymentRecipientPickerScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.recipient_picker.TaxHubPaymentRecipientPickerScreenContract$InputData;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.navigation.AdditionalConfig$StraightToCardTransferDisabled;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionInputData;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.RecipientSelectionScreen;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.retail.savings.api.documents.navigation.SavingsAccountsSelectionControllerDescriptor$InputData;
import com.revolut.feature.security_hub.impl.repository.LimitValue;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimitGroupConfig;
import com.revolut.feature.security_hub.impl.ui.security_hub.SecurityHubScreenContract$Step;
import com.revolut.feature.security_hub.impl.ui.transactions_limits_change.TransactionsLimitsChangeScreen;
import com.revolut.feature.security_hub.impl.ui.transactions_limits_change.TransactionsLimitsChangeScreenContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.transfer.IncomeSorterTransferDestinationsFlowContract$Step;
import com.revolut.feature.statements.api.navigation.SavingsAccountsStatementFeatureConfig$SavingsAccountInfo;
import com.revolut.feature.statements.impl.ui.savings.SavingsStatementsScreenContract$ModalStep;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.card.CardTopupFlow;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.CardDeferredCvvFlow;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.card_facade.FacadeCardTopupFlowContract$Step;
import com.revolut.feature.transactions.impl.ui.pending.revert.PendingTransactionRevertControllerContract$ShowDialogStep;
import com.revolut.feature.transactions.impl.ui.pending.revert.dialog.PendingTransactionRecallController;
import com.revolut.feature.transactions.impl.ui.pending.revert.dialog.PendingTransactionRecallControllerContract$InputData;
import com.revolut.feature.transfer.core.models.SourceAccount;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.feature.travel.experiences.impl.ui.flow.tabs.TravelExperiencesTabsFlowContract$PagerItem;
import com.revolut.feature.travel.experiences.impl.ui.screen.bookings.TravelExperiencesBookingsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.home.TravelExperiencesHomeScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.home.TravelExperiencesHomeScreenContract$InputData;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_assets_list.AllAssetsListScreenContract$ModalStep;
import com.revolut.feature.wealth_discovery.impl.screener.screens.new_screener.NewScreenerScreenContract$Input;
import com.revolut.feature.wealth_discovery.impl.screener.screens.new_screener.SaveScreenerCollectionScreen;
import com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreenContract$ModalStep;
import com.revolut.feature_crypto_order_flow.impl.order_summary.account_balance_limit.AccountBalanceLimitBottomSheetController;
import com.revolut.feature_crypto_order_flow.impl.order_summary.firm_price_deviance.FirmPriceDevianceBottomSheetController;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Permission;
import com.revolut.kompot.common.flow.permissions.a;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.AirportLoungesHomeScreenContract$ModalStep;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.breakdown.AirportLoungesPassBreakdownScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.giftes_passes_breakdown.AirportLoungesGiftedPassesBreakdownScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.help.AirportLoungesHomeHelpScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.help.AirportLoungesHomeHelpScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.unlimited_profiles.AirportLoungesUnlimitedProfileSwitchScreen;
import com.revolut.retail.feature.impl.userauth.location_enforce.ui.flow.LocationEnforceFlowContract$Step;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferExtraConfiguration;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputReference;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.BankTransferNavigatingEntryFlow;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.CurrencyPickerMode;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.LaunchMode;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerExtraConfiguration$NoBalanceValidation;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import eii.l;
import fmc.z;
import fnc.s;
import grl.k9;
import gs4.i;
import ip0.yc0;
import j0d.h;
import j2g.k;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jta.m;
import jta.o;
import jtj.n;
import jvc.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m0;
import kotlin.reflect.KProperty;
import p1g.g;
import qua.p;
import s7a.t;
import s7a.x;
import skm.e0;
import vkm.j2;
import vkm.q;
import vtc.a0;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;
import zhm.y0;
import zhm.z0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f176735b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f176734a = i;
        this.f176735b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        jze.b bVar = (jze.b) this.f176735b;
        FacadeCardTopupFlowDescriptor$InputData facadeCardTopupFlowDescriptor$InputData = bVar.o;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        FacadeCardTopupFlowContract$Step step = (FacadeCardTopupFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof FacadeCardTopupFlowContract$Step.DeferredCvv) {
            CardDeferredCvvFlow cardDeferredCvvFlow = new CardDeferredCvvFlow(facadeCardTopupFlowDescriptor$InputData);
            yc0 block = new yc0(1, bVar, jze.b.class, "handleResult", "handleResult(Lcom/revolut/feature/topup_screen/api/descriptor/FacadeCardTopupFlowDescriptor$OutputData;)V", 0, 22);
            Intrinsics.checkNotNullParameter(block, "block");
            cardDeferredCvvFlow.H = block;
            return cardDeferredCvvFlow;
        }
        if (!(step instanceof FacadeCardTopupFlowContract$Step.ForcedCvv)) {
            throw new NoWhenBranchMatchedException();
        }
        CardTopupFlow cardTopupFlow = new CardTopupFlow(facadeCardTopupFlowDescriptor$InputData);
        yc0 block2 = new yc0(1, bVar, jze.b.class, "handleResult", "handleResult(Lcom/revolut/feature/topup_screen/api/descriptor/FacadeCardTopupFlowDescriptor$OutputData;)V", 0, 23);
        Intrinsics.checkNotNullParameter(block2, "block");
        cardTopupFlow.H = block2;
        return cardTopupFlow;
    }

    private final Object b(Object obj2, Object obj3) {
        com.revolut.feature_crypto_order_flow.impl.order_summary.a aVar = (com.revolut.feature_crypto_order_flow.impl.order_summary.a) this.f176735b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        OrderSummaryScreenContract$ModalStep step = (OrderSummaryScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof OrderSummaryScreenContract$ModalStep.FirmPriceDeviance)) {
            if (step instanceof OrderSummaryScreenContract$ModalStep.AccountBalanceLimit) {
                return new AccountBalanceLimitBottomSheetController(((OrderSummaryScreenContract$ModalStep.AccountBalanceLimit) step).f96776a);
            }
            throw new NoWhenBranchMatchedException();
        }
        FirmPriceDevianceBottomSheetController firmPriceDevianceBottomSheetController = new FirmPriceDevianceBottomSheetController(((OrderSummaryScreenContract$ModalStep.FirmPriceDeviance) step).f96777a);
        jud.d block = new jud.d(aVar, 28);
        Intrinsics.checkNotNullParameter(block, "block");
        firmPriceDevianceBottomSheetController.H = block;
        return firmPriceDevianceBottomSheetController;
    }

    private final Object c(Object obj2, Object obj3) {
        k0d.b bVar = (k0d.b) this.f176735b;
        h value = (h) obj3;
        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
        Intrinsics.checkNotNullParameter(value, "value");
        bVar.f180013b.f("MEMORY_CACHE_KEY_SUPERVISION_CONFIG", value);
        return Unit.f186387a;
    }

    private final Object d(Object obj2, Object obj3) {
        k0d.f fVar = (k0d.f) this.f176735b;
        String teenUserId = (String) obj2;
        List value = (List) obj3;
        Intrinsics.checkNotNullParameter(teenUserId, "teenUserId");
        Intrinsics.checkNotNullParameter(value, "value");
        fVar.f180020b.f(k0d.f.a(teenUserId), value);
        return Unit.f186387a;
    }

    private final Object e(Object obj2, Object obj3) {
        com.revolut.feature.statements.impl.ui.savings.a aVar = (com.revolut.feature.statements.impl.ui.savings.a) this.f176735b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        SavingsStatementsScreenContract$ModalStep step = (SavingsStatementsScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof SavingsStatementsScreenContract$ModalStep.AccountSelection)) {
            throw new NoWhenBranchMatchedException();
        }
        List list = ((k0e.e) ((j2) aVar.f88381x.f22677a).getValue()).f180025b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((SavingsAccountsStatementFeatureConfig$SavingsAccountInfo) it8.next()).f88261a);
        }
        ViewController viewControllerE1 = aVar.e1(new cjb.b(new SavingsAccountsSelectionControllerDescriptor$InputData(aVar.o.f88373b, d0.i1(arrayList))));
        k0d.c block = new k0d.c(aVar, 1);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerE1.H = block;
        return viewControllerE1;
    }

    private final Object g(Object obj2, Object obj3) {
        final com.revolut.feature.travel.experiences.impl.ui.flow.tabs.a aVar = (com.revolut.feature.travel.experiences.impl.ui.flow.tabs.a) this.f176735b;
        ali.b PagerCoordinator = (ali.b) obj2;
        TravelExperiencesTabsFlowContract$PagerItem pagerItem = (TravelExperiencesTabsFlowContract$PagerItem) obj3;
        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
        Intrinsics.checkNotNullParameter(pagerItem, "pagerItem");
        if (pagerItem instanceof TravelExperiencesTabsFlowContract$PagerItem.Bookings) {
            TravelExperiencesBookingsScreen travelExperiencesBookingsScreen = new TravelExperiencesBookingsScreen(0);
            final int i = 0;
            Function1 block = new Function1() { // from class: k1g.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            p1g.g outputData = (p1g.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean z = outputData instanceof p1g.f;
                            com.revolut.feature.travel.experiences.impl.ui.flow.tabs.a aVar2 = aVar;
                            if (z || (outputData instanceof g.b)) {
                                aVar2.C2(new f(outputData));
                            } else {
                                if (!(outputData instanceof g.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.H2(aVar2.f93008s, new jyk.d0(29));
                            }
                            return Unit.f186387a;
                        default:
                            j2g.k outputData2 = (j2g.k) obj4;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean z3 = outputData2 instanceof k.b;
                            com.revolut.feature.travel.experiences.impl.ui.flow.tabs.a aVar3 = aVar;
                            if (z3) {
                                String tabId = TravelExperiencesTabsFlowContract$PagerItem.Bookings.f93003a.getF94249a();
                                Intrinsics.checkNotNullParameter(tabId, "tabId");
                                aVar3.H2(aVar3.f93008s, new jb8.a(tabId, 18));
                            } else if (outputData2 instanceof j2g.j) {
                                j2g.j jVar = (j2g.j) outputData2;
                                String str = jVar.f170872a;
                                aVar3.C2(new h(jVar.f170874c, jVar.f170873b, str));
                            } else {
                                aVar3.C2(new g(outputData2));
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            travelExperiencesBookingsScreen.H = block;
            return travelExperiencesBookingsScreen;
        }
        if (!(pagerItem instanceof TravelExperiencesTabsFlowContract$PagerItem.Discover)) {
            throw new NoWhenBranchMatchedException();
        }
        TravelExperiencesHomeScreen travelExperiencesHomeScreen = new TravelExperiencesHomeScreen(new TravelExperiencesHomeScreenContract$InputData(((TravelExperiencesTabsFlowContract$PagerItem.Discover) pagerItem).f93004a));
        final int i2 = 1;
        Function1 block2 = new Function1() { // from class: k1g.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        p1g.g outputData = (p1g.g) obj4;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        boolean z = outputData instanceof p1g.f;
                        com.revolut.feature.travel.experiences.impl.ui.flow.tabs.a aVar2 = aVar;
                        if (z || (outputData instanceof g.b)) {
                            aVar2.C2(new f(outputData));
                        } else {
                            if (!(outputData instanceof g.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2.H2(aVar2.f93008s, new jyk.d0(29));
                        }
                        return Unit.f186387a;
                    default:
                        j2g.k outputData2 = (j2g.k) obj4;
                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                        boolean z3 = outputData2 instanceof k.b;
                        com.revolut.feature.travel.experiences.impl.ui.flow.tabs.a aVar3 = aVar;
                        if (z3) {
                            String tabId = TravelExperiencesTabsFlowContract$PagerItem.Bookings.f93003a.getF94249a();
                            Intrinsics.checkNotNullParameter(tabId, "tabId");
                            aVar3.H2(aVar3.f93008s, new jb8.a(tabId, 18));
                        } else if (outputData2 instanceof j2g.j) {
                            j2g.j jVar = (j2g.j) outputData2;
                            String str = jVar.f170872a;
                            aVar3.C2(new h(jVar.f170874c, jVar.f170873b, str));
                        } else {
                            aVar3.C2(new g(outputData2));
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        travelExperiencesHomeScreen.H = block2;
        return travelExperiencesHomeScreen;
    }

    /* JADX WARN: Type inference failed for: r1v95, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v82, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        xi0.b bVar;
        l lVar;
        int i = this.f176734a;
        int i2 = 25;
        int i3 = 8;
        final int i5 = 2;
        final int i6 = 1;
        Object obj4 = this.f176735b;
        switch (i) {
            case 0:
                f fVar = (f) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter((PendingTransactionRevertControllerContract$ShowDialogStep) obj3, "step");
                PendingTransactionRecallController pendingTransactionRecallController = new PendingTransactionRecallController(new PendingTransactionRecallControllerContract$InputData(fVar.o.f92073a));
                je2.d block = new je2.d(fVar, FlowCoordinator, i2);
                Intrinsics.checkNotNullParameter(block, "block");
                pendingTransactionRecallController.H = block;
                return pendingTransactionRecallController;
            case 1:
                com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.b bVar2 = (com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CrossBorderInstitutionsScreenContract$ModalStep step = (CrossBorderInstitutionsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof CrossBorderInstitutionsScreenContract$ModalStep.CountryPicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                CrossBorderInstitutionsScreenContract$ModalStep.CountryPicker countryPicker = (CrossBorderInstitutionsScreenContract$ModalStep.CountryPicker) step;
                List list = countryPicker.f73074a;
                wi0.a aVar = wi0.b.Companion;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    kii.e.B(aVar, (String) it8.next(), arrayList);
                }
                PickerController pickerController = new PickerController(new x(new t(1790, new TextLocalisedClause(R$string.external_institutions_cross_border_country_selection_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.picker.R$string.picker_country_picker_search_hint, null, null, 14)), new jo6.a(arrayList), null, z0.h(countryPicker.f73075b), 1045500), bVar2.f73078q);
                jlh.g block2 = new jlh.g(bVar2, 6);
                Intrinsics.checkNotNullParameter(block2, "block");
                pickerController.H = block2;
                return pickerController;
            case 2:
                com.revolut.feature.wealth_discovery.impl.screener.screens.all_assets_list.a aVar2 = (com.revolut.feature.wealth_discovery.impl.screener.screens.all_assets_list.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AllAssetsListScreenContract$ModalStep step2 = (AllAssetsListScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof AllAssetsListScreenContract$ModalStep.SaveScreener)) {
                    throw new NoWhenBranchMatchedException();
                }
                AllAssetsListScreenContract$ModalStep.SaveScreener saveScreener = (AllAssetsListScreenContract$ModalStep.SaveScreener) step2;
                SaveScreenerCollectionScreen saveScreenerCollectionScreen = new SaveScreenerCollectionScreen(new NewScreenerScreenContract$Input(saveScreener.f96195a, saveScreener.f96196b, saveScreener.f96197c));
                jlh.g block3 = new jlh.g(aVar2, 9);
                Intrinsics.checkNotNullParameter(block3, "block");
                saveScreenerCollectionScreen.H = block3;
                return saveScreenerCollectionScreen;
            case 3:
                ((m0) obj4).f186427a = Math.min(((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                return Unit.f186387a;
            case 4:
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.transfer.a aVar3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.transfer.a) obj4;
                jqd.d dVar = aVar3.o;
                IncomeSorterTransferDestinationsFlowContract$Step step3 = (IncomeSorterTransferDestinationsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof IncomeSorterTransferDestinationsFlowContract$Step.SelectRecipient) {
                    r3a.b bVar3 = aVar3.f87775p;
                    WhoToTransferFilter[] elements = {WhoToTransferFilter.Revolut.f80005a, WhoToTransferFilter.Accounts.f79984a};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    RecipientSelectionInputData inputData = new RecipientSelectionInputData(null, true, true, kotlin.collections.d.y0(elements), null, null, null, y0.b(AdditionalConfig$StraightToCardTransferDisabled.f80010a), 113);
                    bVar3.getClass();
                    Intrinsics.checkNotNullParameter(inputData, "inputData");
                    RecipientSelectionScreen recipientSelectionScreen = new RecipientSelectionScreen(inputData);
                    jlh.g gVar = new jlh.g(aVar3, 11);
                    Intrinsics.checkNotNullParameter(gVar, "<set-?>");
                    recipientSelectionScreen.H = gVar;
                    return recipientSelectionScreen;
                }
                if (step3 instanceof IncomeSorterTransferDestinationsFlowContract$Step.PeerToPeer) {
                    IncomeSorterTransferDestinationsFlowContract$Step.PeerToPeer peerToPeer = (IncomeSorterTransferDestinationsFlowContract$Step.PeerToPeer) step3;
                    ViewController viewControllerE1 = aVar3.e1(new s8k.e(PeerToPeerTransferInputData.Companion.a(PeerToPeerTransferInputData.INSTANCE, new PeerToPeerRecipient(peerToPeer.f87773a), hrf.f.OUTGOING, TransferFlowType.Default.f92257b, new TransferMoneyPocket(new dj0.d(0L, dVar.f177702b), new SourceAccount.Pocket(dVar.f177701a, null, null, 6)), new TransferScheduleData(0L, (jli.c) null, 7), m1l.a.SCHEDULE_DISABLED, false, null, null, null, null, new LaunchMode.AsController(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.a.SILENT_COMPLETION), new CurrencyPickerMode.CurrencyOnly(true), y0.b(PeerToPeerExtraConfiguration$NoBalanceValidation.f102269a), null, 65536)));
                    jp3.b block4 = new jp3.b(aVar3, peerToPeer, 7);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    viewControllerE1.H = block4;
                    return viewControllerE1;
                }
                if (!(step3 instanceof IncomeSorterTransferDestinationsFlowContract$Step.BankTransfer)) {
                    throw new NoWhenBranchMatchedException();
                }
                IncomeSorterTransferDestinationsFlowContract$Step.BankTransfer bankTransfer = (IncomeSorterTransferDestinationsFlowContract$Step.BankTransfer) step3;
                x2k.a aVar4 = aVar3.f87776q;
                f5j.a aVar5 = bankTransfer.f87772a;
                TransferFlowType.Default r252 = TransferFlowType.Default.f92257b;
                TransferMoneyPocket transferMoneyPocket = new TransferMoneyPocket(null, new SourceAccount.Pocket(dVar.f177701a, null, null, 6), 1);
                TransferScheduleData transferScheduleData = new TransferScheduleData(0L, (jli.c) null, 7);
                m1l.a aVar6 = m1l.a.SCHEDULE_DISABLED;
                BankTransferExtraConfiguration[] elements2 = {BankTransferExtraConfiguration.NoCurrencyPicker.f101939a, BankTransferExtraConfiguration.NoBalanceValidation.f101938a};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                BankTransferInputData inputData2 = new BankTransferInputData(aVar5, (TransferFlowType) r252, (BankTransferInputReference) null, transferMoneyPocket, aVar6, transferScheduleData, (p) null, (FlowExtras) null, (Map) null, (UltimateDebtor) null, (kq2.g) null, kotlin.collections.d.y0(elements2), true, (ScannedBillDetails) null, (TransferAppSource.AIR_WIDGET) null, 53120);
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(inputData2, "inputData");
                BankTransferNavigatingEntryFlow bankTransferNavigatingEntryFlow = new BankTransferNavigatingEntryFlow(new BankTransferFlowInputData.NewTransfer(inputData2, false));
                jp3.b block5 = new jp3.b(aVar3, bankTransfer, 8);
                Intrinsics.checkNotNullParameter(block5, "block");
                bankTransferNavigatingEntryFlow.H = block5;
                return bankTransferNavigatingEntryFlow;
            case 5:
                jr0.g gVar2 = (jr0.g) obj4;
                ((Float) obj2).getClass();
                float fFloatValue = ((Float) obj3).floatValue();
                ?? r2 = gVar2.f177906c;
                int size = r2.size();
                for (int i21 = 0; i21 < size; i21++) {
                    ((jr0.l) r2.get(i21)).a(fFloatValue);
                }
                jr0.d dVar2 = gVar2.e;
                if (dVar2 != null) {
                    dVar2.invalidate();
                }
                return Unit.f186387a;
            case 6:
                com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a aVar7 = (com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a) obj4;
                i iVar = aVar7.f69429p;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep step4 = (CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep.EstimatedInterestInfo) {
                    CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep.EstimatedInterestInfo estimatedInterestInfo = (CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep.EstimatedInterestInfo) step4;
                    dj0.d estimatedInterest = estimatedInterestInfo.f69426a;
                    BigDecimal bigDecimal = estimatedInterestInfo.f69427b;
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(estimatedInterest, "estimatedInterest");
                    return i.c(sx4.f.b(3, null, null, estimatedInterest), bigDecimal);
                }
                if (step4 instanceof CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep.EstimatedDailyInterestInfo) {
                    CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep.EstimatedDailyInterestInfo estimatedDailyInterestInfo = (CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep.EstimatedDailyInterestInfo) step4;
                    dj0.d dailyInterest = estimatedDailyInterestInfo.f69424a;
                    BigDecimal bigDecimal2 = estimatedDailyInterestInfo.f69425b;
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(dailyInterest, "dailyInterest");
                    return i.c(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_dialog_estimated_interest_per_day, u.c(sx4.f.b(3, null, null, dailyInterest)), null, 12), bigDecimal2);
                }
                if (step4 instanceof CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep.SelectTerm) {
                    lw0.a aVar8 = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_anticipation_select_instalment_select_instalment, null, null, 14), null, null, null, false, 30);
                    yp4.a aVar9 = new yp4.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_select, null, null, 14));
                    ArrayList<CreditCardInstalmentChangeTermQuote.UpdatedInstalment> arrayList2 = aVar7.I2().f178121a.f68792b;
                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                    for (CreditCardInstalmentChangeTermQuote.UpdatedInstalment updatedInstalment : arrayList2) {
                        int i22 = R$plurals.credit_card_statement_financing_setup_dialog_select_instalments_item;
                        int i32 = updatedInstalment.f68796a;
                        arrayList3.add(new yp4.b(new TextLocalisedQuantityClause(i22, Integer.valueOf(i32), v.k(Integer.valueOf(i32), sx4.f.b(3, null, null, updatedInstalment.e)), (Style) null, 24), Integer.valueOf(i32)));
                    }
                    PickerBottomSheetController pickerBottomSheetController = new PickerBottomSheetController(new yp4.c(aVar8, aVar9, arrayList3, aVar7.I2().f178121a.f68792b.indexOf(aVar7.I2().f178122b)));
                    js4.i block6 = new js4.i(ModalCoordinator3, aVar7);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    pickerBottomSheetController.H = block6;
                    return pickerBottomSheetController;
                }
                if (!(step4 instanceof CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep.Confirm)) {
                    throw new NoWhenBranchMatchedException();
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_edit_quote_dialog_confirm_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_edit_quote_dialog_confirm_description, null, null, 14);
                int i33 = com.revolut.feature.credit.core.R$string.credit_card_instalment_edit_quote_dialog_confirm_item_amount_due;
                CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep.Confirm confirm = (CreditCardEditPostPurchaseInstalmentTermScreenContract$ModalStep.Confirm) step4;
                dj0.d dVar3 = confirm.f69423c;
                dj0.d dVar4 = confirm.f69422b;
                List listC = u.c(new BottomSheet.ItemSection(u.c(new BottomSheet.Item.CellItem("id_credit_card_edit_instalment_term_", new TextLocalisedClause(i33, u.c(sx4.g.b(confirm.f69421a, null)), null, 12), sx4.f.b(3, null, null, dVar4), !dVar4.equals(dVar3) ? sx4.f.b(1, new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), null, dVar3) : null, false, null, 0, 112))));
                BottomSheet.ActionBlock.DualAction dualAction = new BottomSheet.ActionBlock.DualAction(new BottomSheet.ActionBlockItem(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_edit_quote_dialog_confirm_action_confirm, null, null, 14), BottomSheet.ActionStyle.Accent.f69824a), new BottomSheet.ActionBlockItem(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_instalment_edit_quote_dialog_confirm_action_decline, null, null, 14), BottomSheet.ActionStyle.SemiAccent.f69825a), null);
                k9 k9Var = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetControllerA = BottomSheet.a(textLocalisedClause, textLocalisedClause2, null, listC, dualAction, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, 68);
                js4.i block7 = new js4.i(aVar7);
                Intrinsics.checkNotNullParameter(block7, "block");
                actionsBottomSheetControllerA.H = block7;
                return actionsBottomSheetControllerA;
            case 7:
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = BizumTransferAmountScreen.l0;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                MaskedTextInputEditText editText = field.getEditText();
                Object obj5 = data.f51981p;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.transfer.core.api.mapper.TransferAmountInputPayload");
                return new zp0.d(editText, ((yof.b) obj5).f315672a, (u80.d) ((BizumTransferAmountScreen) obj4).f61607a0.getValue(), null, null, false, false, 0, false, null, 1944);
            case 8:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                aim.e eVarB = u.b();
                eVarB.add(((jt2.b) obj4).a(null));
                eVarB.addAll((Collection) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)));
                return u.a(eVarB);
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ((s) obj4).e();
            case 10:
                jt2.g gVar3 = (jt2.g) obj4;
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return tj0.a.a((Throwable) obj2) ? gVar3.f178320a.a() : (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new o(m.f178451a, ((jta.w) obj4).f178469b.b());
            case 12:
                String walletId = (String) obj2;
                List value = (List) obj3;
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                Intrinsics.checkNotNullParameter(value, "value");
                ((jtj.k) obj4).f178520c.f("INCOME_SORTER_EXECUTIONS_KEY" + walletId, value);
                return Unit.f186387a;
            case 13:
                String walletId2 = (String) obj2;
                List value2 = (List) obj3;
                Intrinsics.checkNotNullParameter(walletId2, "walletId");
                Intrinsics.checkNotNullParameter(value2, "value");
                ((n) obj4).f178522b.f(walletId2, value2);
                return Unit.f186387a;
            case 14:
                CreditCardPseRepayScreen creditCardPseRepayScreen = (CreditCardPseRepayScreen) obj4;
                CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field2 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr2 = CreditCardPseRepayScreen.X;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field2, "field");
                Object obj6 = model.f51981p;
                xi0.b bVar4 = obj6 instanceof xi0.b ? (xi0.b) obj6 : null;
                if (bVar4 != null) {
                    return new zp0.d(field2.getEditText(), bVar4, (u80.d) creditCardPseRepayScreen.N.getValue(), null, new z(creditCardPseRepayScreen, i2), false, false, 0, false, null, 1928);
                }
                return null;
            case 15:
                com.revolut.feature.freelancer.impl.ui.cashback.flow.c cVar = (com.revolut.feature.freelancer.impl.ui.cashback.flow.c) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                FreelancerCashbackFlowContract$Step step5 = (FreelancerCashbackFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (Intrinsics.f(step5, FreelancerCashbackFlowContract$Step.Details.f73741a)) {
                    FreelancerCashbackDetailsScreen freelancerCashbackDetailsScreen = new FreelancerCashbackDetailsScreen();
                    yc0 block8 = new yc0(1, cVar, com.revolut.feature.freelancer.impl.ui.cashback.flow.c.class, "handleDetailsOutput", "handleDetailsOutput(Lcom/revolut/feature/freelancer/impl/ui/cashback/screen/details/FreelancerCashbackDetailsScreenContract$OutputData;)V", 0, 13);
                    Intrinsics.checkNotNullParameter(block8, "block");
                    freelancerCashbackDetailsScreen.H = block8;
                    return freelancerCashbackDetailsScreen;
                }
                if (Intrinsics.f(step5, FreelancerCashbackFlowContract$Step.Booster.f73739a)) {
                    FreelancerCashbackBoosterScreen freelancerCashbackBoosterScreen = new FreelancerCashbackBoosterScreen();
                    yc0 block9 = new yc0(1, cVar, com.revolut.feature.freelancer.impl.ui.cashback.flow.c.class, "handleBoosterOutput", "handleBoosterOutput(Lcom/revolut/feature/freelancer/impl/ui/cashback/screen/booster/FreelancerCashbackBoosterScreenContract$OutputData;)V", 0, 14);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    freelancerCashbackBoosterScreen.H = block9;
                    return freelancerCashbackBoosterScreen;
                }
                if (Intrinsics.f(step5, FreelancerCashbackFlowContract$Step.Plan.f73742a)) {
                    FreelancerCashbackPlanScreen freelancerCashbackPlanScreen = new FreelancerCashbackPlanScreen();
                    yc0 block10 = new yc0(1, cVar, com.revolut.feature.freelancer.impl.ui.cashback.flow.c.class, "handlePlanOutput", "handlePlanOutput(Lcom/revolut/feature/freelancer/impl/ui/cashback/screen/plan/FreelancerCashbackPlanScreenContract$OutputData;)V", 0, 15);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    freelancerCashbackPlanScreen.H = block10;
                    return freelancerCashbackPlanScreen;
                }
                if (!(step5 instanceof FreelancerCashbackFlowContract$Step.BoosterProductArticle)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE12 = cVar.e1(new ProductArticleDescriptor(((FreelancerCashbackFlowContract$Step.BoosterProductArticle) step5).f73740a, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                jud.d block11 = new jud.d(cVar, 4);
                Intrinsics.checkNotNullParameter(block11, "block");
                viewControllerE12.H = block11;
                return viewControllerE12;
            case 16:
                com.revolut.feature.security_hub.impl.ui.security_hub.c cVar2 = (com.revolut.feature.security_hub.impl.ui.security_hub.c) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SecurityHubScreenContract$Step step6 = (SecurityHubScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof SecurityHubScreenContract$Step.SecurityHubChecklist) {
                    SecurityHubScreenContract$Step.SecurityHubChecklist securityHubChecklist = (SecurityHubScreenContract$Step.SecurityHubChecklist) step6;
                    return cVar2.e1(new jkd.a(securityHubChecklist.f85639a, securityHubChecklist.f85640b));
                }
                if (!(step6 instanceof SecurityHubScreenContract$Step.GlobalAccountsInfo)) {
                    if (!(step6 instanceof SecurityHubScreenContract$Step.HiddenTransactionsAuthentication)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ViewController viewControllerE13 = cVar2.e1(qa7.a.f243970a);
                    c0 block12 = new c0(cVar2, i5);
                    Intrinsics.checkNotNullParameter(block12, "block");
                    viewControllerE13.H = block12;
                    return viewControllerE13;
                }
                lw0.a aVar10 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_global_account_info_title, u.c(new CountryClause(((SecurityHubScreenContract$Step.GlobalAccountsInfo) step6).f85637a, null)), null, 12), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_global_account_info_subtitle, null, null, 14), null, null, false, 28);
                aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.d, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var2 = k9.SecurityHub;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetController = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(new dii.a(aVar10, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                c0 block13 = new c0(cVar2, i6);
                Intrinsics.checkNotNullParameter(block13, "block");
                actionsBottomSheetController.H = block13;
                return actionsBottomSheetController;
            case 17:
                com.revolut.feature.apm.breb.impl.ui.qr_request.a aVar11 = (com.revolut.feature.apm.breb.impl.ui.qr_request.a) obj4;
                j2 j2Var = aVar11.f61757q;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                BrebQrRequestFlowContract$Step step7 = (BrebQrRequestFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof BrebQrRequestFlowContract$Step.Request) {
                    BrebQrRequestScreen brebQrRequestScreen = new BrebQrRequestScreen(j2Var);
                    jw1.c block14 = new jw1.c(aVar11, FlowCoordinator2);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    brebQrRequestScreen.H = block14;
                    return brebQrRequestScreen;
                }
                if (step7 instanceof BrebQrRequestFlowContract$Step.Amount) {
                    BrebQrRequestAddDetailsScreen brebQrRequestAddDetailsScreen = new BrebQrRequestAddDetailsScreen(new BrebQrRequestAddDetailsScreenContract$InputData(((BrebQrRequestScreenContract$InputData) j2Var.getValue()).f61761b));
                    jw1.c block15 = new jw1.c(FlowCoordinator2, aVar11);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    brebQrRequestAddDetailsScreen.H = block15;
                    return brebQrRequestAddDetailsScreen;
                }
                if (!(step7 instanceof BrebQrRequestFlowContract$Step.KeySelection)) {
                    throw new NoWhenBranchMatchedException();
                }
                BrebQrRequestKeySelectionScreen brebQrRequestKeySelectionScreen = new BrebQrRequestKeySelectionScreen(new mw1.f(((BrebQrRequestScreenContract$InputData) j2Var.getValue()).f61760a, aVar11.o.f61750c));
                jud.d block16 = new jud.d(aVar11, i3);
                Intrinsics.checkNotNullParameter(block16, "block");
                brebQrRequestKeySelectionScreen.H = block16;
                return brebQrRequestKeySelectionScreen;
            case 18:
                TransactionsLimitsChangeScreen transactionsLimitsChangeScreen = (TransactionsLimitsChangeScreen) obj4;
                CenteredAmountDelegate.Model model2 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field3 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr3 = TransactionsLimitsChangeScreen.W;
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(field3, "field");
                MaskedTextInputEditText editText2 = field3.getEditText();
                Object obj7 = model2.f51981p;
                Intrinsics.i(obj7, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.repository.LimitValue");
                LimitValue limitValue = (LimitValue) obj7;
                if (limitValue instanceof LimitValue.Amount) {
                    bVar = ((LimitValue.Amount) limitValue).f85473c.f115083b;
                } else {
                    if (!(limitValue instanceof LimitValue.Counter)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xi0.b.Companion.getClass();
                    bVar = xi0.b.f306271c;
                }
                xi0.b bVar5 = bVar;
                qd0.b bVarN = ((a0) transactionsLimitsChangeScreen.U.getValue()).f291949b.f292075r.n();
                vc.s.j(bVarN);
                return new zp0.d(editText2, bVar5, new u80.d(((s80.b) bVarN).b()), null, new f61.a(transactionsLimitsChangeScreen, 27), false, false, 0, false, null, 1960);
            case 19:
                final com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a aVar12 = (com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a) obj4;
                lwc.d dVar5 = aVar12.u;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TransactionsLimitsChangeScreenContract$ModalStep step8 = (TransactionsLimitsChangeScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof TransactionsLimitsChangeScreenContract$ModalStep.PixAutomatedLimitConfirmation) {
                    dVar5.getClass();
                    lw0.a aVar13 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_amount_dialog_enough_to_cover_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_amount_dialog_enough_to_cover_subtitle, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6)), null, false, 24);
                    aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_amount_dialog_enough_to_cover_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_amount_dialog_enough_to_cover_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                    k9 k9Var3 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                    com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetController2 = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(new dii.a(aVar13, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                    Function1 block17 = new Function1() { // from class: jwc.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i5) {
                                case 0:
                                    dii.g it9 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if (it9 instanceof dii.e) {
                                        aVar12.I2();
                                    }
                                    break;
                                case 1:
                                    com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a aVar14 = aVar12;
                                    y yVar = aVar14.v;
                                    eii.k result = (eii.k) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof eii.i) {
                                        Object obj9 = ((eii.i) result).f126655a;
                                        Intrinsics.i(obj9, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimitGroupConfig");
                                        OutboundTransactionLimitGroupConfig outboundTransactionLimitGroupConfig = (OutboundTransactionLimitGroupConfig) obj9;
                                        aVar14.H2(yVar, new jud.d(OutboundTransactionLimit.a(((f) ((j2) yVar.f22677a).getValue()).f178956b, null, outboundTransactionLimitGroupConfig.f85491a, outboundTransactionLimitGroupConfig.f85492b, 2096879), 9));
                                    }
                                    break;
                                case 2:
                                    dii.g result2 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof dii.e) {
                                        aVar12.I2();
                                    }
                                    break;
                                case 3:
                                    dii.g result3 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof dii.e) {
                                        aVar12.I2();
                                    }
                                    break;
                                default:
                                    dii.g it10 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    if (it10 instanceof dii.e) {
                                        aVar12.I2();
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block17, "block");
                    actionsBottomSheetController2.H = block17;
                    return actionsBottomSheetController2;
                }
                if (Intrinsics.f(step8, TransactionsLimitsChangeScreenContract$ModalStep.LimitDecrease.f85761a)) {
                    dVar5.getClass();
                    lw0.a aVar14 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_amount_dialog_decrease_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_amount_dialog_decrease_subtitle, null, null, 14), null, null, false, 28);
                    aw0.h hVar2 = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_amount_dialog_decrease_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_amount_dialog_decrease_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), null, null, null, 121);
                    k9 k9Var4 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                    com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetController3 = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(new dii.a(aVar14, hVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
                    final int i43 = 0;
                    Function1 block18 = new Function1() { // from class: jwc.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i43) {
                                case 0:
                                    dii.g it9 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if (it9 instanceof dii.e) {
                                        aVar12.I2();
                                    }
                                    break;
                                case 1:
                                    com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a aVar142 = aVar12;
                                    y yVar = aVar142.v;
                                    eii.k result = (eii.k) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof eii.i) {
                                        Object obj9 = ((eii.i) result).f126655a;
                                        Intrinsics.i(obj9, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimitGroupConfig");
                                        OutboundTransactionLimitGroupConfig outboundTransactionLimitGroupConfig = (OutboundTransactionLimitGroupConfig) obj9;
                                        aVar142.H2(yVar, new jud.d(OutboundTransactionLimit.a(((f) ((j2) yVar.f22677a).getValue()).f178956b, null, outboundTransactionLimitGroupConfig.f85491a, outboundTransactionLimitGroupConfig.f85492b, 2096879), 9));
                                    }
                                    break;
                                case 2:
                                    dii.g result2 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof dii.e) {
                                        aVar12.I2();
                                    }
                                    break;
                                case 3:
                                    dii.g result3 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof dii.e) {
                                        aVar12.I2();
                                    }
                                    break;
                                default:
                                    dii.g it10 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    if (it10 instanceof dii.e) {
                                        aVar12.I2();
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    actionsBottomSheetController3.H = block18;
                    return actionsBottomSheetController3;
                }
                if (Intrinsics.f(step8, TransactionsLimitsChangeScreenContract$ModalStep.LimitExceeded.f85762a)) {
                    dVar5.getClass();
                    lw0.a aVar15 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_amount_dialog_limit_reached_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_amount_dialog_limit_reached_subtitle, null, null, 14), null, null, false, 28);
                    aw0.h hVar3 = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_amount_dialog_limit_reached_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_amount_dialog_limit_reached_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), null, null, null, 121);
                    k9 k9Var5 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                    com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetController4 = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(new dii.a(aVar15, hVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null, null, 24));
                    final int i59 = 4;
                    Function1 block19 = new Function1() { // from class: jwc.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i59) {
                                case 0:
                                    dii.g it9 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if (it9 instanceof dii.e) {
                                        aVar12.I2();
                                    }
                                    break;
                                case 1:
                                    com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a aVar142 = aVar12;
                                    y yVar = aVar142.v;
                                    eii.k result = (eii.k) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof eii.i) {
                                        Object obj9 = ((eii.i) result).f126655a;
                                        Intrinsics.i(obj9, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimitGroupConfig");
                                        OutboundTransactionLimitGroupConfig outboundTransactionLimitGroupConfig = (OutboundTransactionLimitGroupConfig) obj9;
                                        aVar142.H2(yVar, new jud.d(OutboundTransactionLimit.a(((f) ((j2) yVar.f22677a).getValue()).f178956b, null, outboundTransactionLimitGroupConfig.f85491a, outboundTransactionLimitGroupConfig.f85492b, 2096879), 9));
                                    }
                                    break;
                                case 2:
                                    dii.g result2 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof dii.e) {
                                        aVar12.I2();
                                    }
                                    break;
                                case 3:
                                    dii.g result3 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof dii.e) {
                                        aVar12.I2();
                                    }
                                    break;
                                default:
                                    dii.g it10 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    if (it10 instanceof dii.e) {
                                        aVar12.I2();
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block19, "block");
                    actionsBottomSheetController4.H = block19;
                    return actionsBottomSheetController4;
                }
                if (!Intrinsics.f(step8, TransactionsLimitsChangeScreenContract$ModalStep.FrequencyChange.f85760a)) {
                    if (!Intrinsics.f(step8, TransactionsLimitsChangeScreenContract$ModalStep.SepaLimitSetToZero.f85764a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar5.getClass();
                    lw0.a aVar16 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_sepa_dialog_zero_limit_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_sepa_dialog_zero_limit_subtitle, null, null, 14), null, null, false, 28);
                    aw0.h hVar4 = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_sepa_dialog_zero_limit_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_sepa_dialog_zero_limit_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), null, null, null, 121);
                    k9 k9Var6 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                    com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController actionsBottomSheetController5 = new com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController(new dii.a(aVar16, hVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var6, "value", k9Var6), null, null, 24));
                    final int i66 = 3;
                    Function1 block20 = new Function1() { // from class: jwc.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i66) {
                                case 0:
                                    dii.g it9 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if (it9 instanceof dii.e) {
                                        aVar12.I2();
                                    }
                                    break;
                                case 1:
                                    com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a aVar142 = aVar12;
                                    y yVar = aVar142.v;
                                    eii.k result = (eii.k) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof eii.i) {
                                        Object obj9 = ((eii.i) result).f126655a;
                                        Intrinsics.i(obj9, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimitGroupConfig");
                                        OutboundTransactionLimitGroupConfig outboundTransactionLimitGroupConfig = (OutboundTransactionLimitGroupConfig) obj9;
                                        aVar142.H2(yVar, new jud.d(OutboundTransactionLimit.a(((f) ((j2) yVar.f22677a).getValue()).f178956b, null, outboundTransactionLimitGroupConfig.f85491a, outboundTransactionLimitGroupConfig.f85492b, 2096879), 9));
                                    }
                                    break;
                                case 2:
                                    dii.g result2 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof dii.e) {
                                        aVar12.I2();
                                    }
                                    break;
                                case 3:
                                    dii.g result3 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof dii.e) {
                                        aVar12.I2();
                                    }
                                    break;
                                default:
                                    dii.g it10 = (dii.g) obj8;
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    if (it10 instanceof dii.e) {
                                        aVar12.I2();
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block20, "block");
                    actionsBottomSheetController5.H = block20;
                    return actionsBottomSheetController5;
                }
                y yVar = aVar12.v;
                List groupConfig = ((jwc.f) ((j2) yVar.f22677a).getValue()).f178956b.f85484p;
                if (groupConfig == null) {
                    throw new IllegalArgumentException("Frequency change should only be available for SEPA limits");
                }
                cuc.h selectedType = ((jwc.f) ((j2) yVar.f22677a).getValue()).f178956b.i;
                dVar5.getClass();
                Intrinsics.checkNotNullParameter(selectedType, "selectedType");
                Intrinsics.checkNotNullParameter(groupConfig, "groupConfig");
                lw0.a aVar17 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_sepa_frequency_dialog_title, null, null, 14), null, null, null, false, 30);
                List<OutboundTransactionLimitGroupConfig> list2 = groupConfig;
                ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                for (OutboundTransactionLimitGroupConfig outboundTransactionLimitGroupConfig : list2) {
                    cuc.h hVar5 = outboundTransactionLimitGroupConfig.f85492b;
                    int i74 = lwc.c.f200440a[hVar5.ordinal()];
                    if (i74 == 1) {
                        lVar = new l((Clause) new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_sepa_cell_frequency_subtitle_daily, null, null, 14), (Clause) null, (RowDelegate.Model.MainImage) lwc.d.a(hVar5, selectedType), true, false, (RowDelegate.Model.c) null, (Object) outboundTransactionLimitGroupConfig, 232);
                    } else {
                        if (i74 != 2) {
                            throw new IllegalStateException("Limit type " + outboundTransactionLimitGroupConfig.f85492b + " is not currently supported");
                        }
                        lVar = new l((Clause) new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_sepa_cell_frequency_subtitle_transaction, null, null, 14), (Clause) null, (RowDelegate.Model.MainImage) lwc.d.a(hVar5, selectedType), true, false, (RowDelegate.Model.c) null, (Object) outboundTransactionLimitGroupConfig, 232);
                    }
                    arrayList4.add(lVar);
                }
                k9 k9Var7 = k9.SecurityHub;
                Parcelable.Creator<AnalyticsProduct.Retail> creator7 = AnalyticsProduct.Retail.CREATOR;
                RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar17, null, arrayList4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var7, "value", k9Var7), null));
                Function1 block21 = new Function1() { // from class: jwc.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        switch (i6) {
                            case 0:
                                dii.g it9 = (dii.g) obj8;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                if (it9 instanceof dii.e) {
                                    aVar12.I2();
                                }
                                break;
                            case 1:
                                com.revolut.feature.security_hub.impl.ui.transactions_limits_change.a aVar142 = aVar12;
                                y yVar2 = aVar142.v;
                                eii.k result = (eii.k) obj8;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof eii.i) {
                                    Object obj9 = ((eii.i) result).f126655a;
                                    Intrinsics.i(obj9, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimitGroupConfig");
                                    OutboundTransactionLimitGroupConfig outboundTransactionLimitGroupConfig2 = (OutboundTransactionLimitGroupConfig) obj9;
                                    aVar142.H2(yVar2, new jud.d(OutboundTransactionLimit.a(((f) ((j2) yVar2.f22677a).getValue()).f178956b, null, outboundTransactionLimitGroupConfig2.f85491a, outboundTransactionLimitGroupConfig2.f85492b, 2096879), 9));
                                }
                                break;
                            case 2:
                                dii.g result2 = (dii.g) obj8;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof dii.e) {
                                    aVar12.I2();
                                }
                                break;
                            case 3:
                                dii.g result3 = (dii.g) obj8;
                                Intrinsics.checkNotNullParameter(result3, "result");
                                if (result3 instanceof dii.e) {
                                    aVar12.I2();
                                }
                                break;
                            default:
                                dii.g it10 = (dii.g) obj8;
                                Intrinsics.checkNotNullParameter(it10, "it");
                                if (it10 instanceof dii.e) {
                                    aVar12.I2();
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block21, "block");
                rowActionsBottomSheetController.H = block21;
                return rowActionsBottomSheetController;
            case 20:
                final com.revolut.retail.feature.impl.userauth.location_enforce.ui.flow.b bVar6 = (com.revolut.retail.feature.impl.userauth.location_enforce.ui.flow.b) obj4;
                LocationEnforceFlowContract$Step step9 = (LocationEnforceFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof LocationEnforceFlowContract$Step.Permission) {
                    PermissionsFlow permissionsFlow = new PermissionsFlow(u.c(new PermissionsFlowContract$Permission("android.permission.ACCESS_FINE_LOCATION", new PermissionsFlowContract$Explanation.PromptScreen(new TextLocalisedClause(com.revolut.retail.feature.impl.userauth.R$string.location_enforce_introduction_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.impl.userauth.R$string.location_enforce_introduction_message, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.impl.userauth.R$string.location_enforce_introduction_action, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D027", null, null, null, 30), (TextClause) null, 48), new PermissionsFlowContract$Explanation.PromptScreen(new TextLocalisedClause(com.revolut.retail.feature.impl.userauth.R$string.location_enforce_explanation_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.impl.userauth.R$string.location_enforce_explanation_message, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.impl.userauth.R$string.location_enforce_explanation_action, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D027", null, null, null, 30), (TextClause) null, 48), true)));
                    final int i92 = 0;
                    Function1 function1 = new Function1() { // from class: jwj.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i92) {
                                case 0:
                                    com.revolut.kompot.common.flow.permissions.a outputData = (com.revolut.kompot.common.flow.permissions.a) obj8;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof a.C0596a) {
                                        com.revolut.retail.feature.impl.userauth.location_enforce.ui.flow.b bVar7 = bVar6;
                                        iwj.a aVar18 = bVar7.f101685p;
                                        e0.C(aVar18.f169173g, null, null, new ikf.g(aVar18, (Continuation) null, 24), 3);
                                        yji.l.a1(bVar7, q.q(rd0.e.b(((z39.b) bVar7.f101686q).f319221b.j())), null, null, new com.revolut.retail.feature.impl.userauth.location_enforce.ui.flow.a(bVar7, null), 3);
                                    }
                                    break;
                                default:
                                    d67.u outputData2 = (d67.u) obj8;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (outputData2 instanceof d67.s) {
                                        com.revolut.retail.feature.impl.userauth.location_enforce.ui.flow.b bVar8 = bVar6;
                                        bVar8.C1(new ExternalDestination.ByIntent(((s70.b) bVar8.o).c(), null));
                                    } else {
                                        int i96 = jli.h.f175850a;
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(function1, "<set-?>");
                    permissionsFlow.J = function1;
                    return permissionsFlow;
                }
                if (!(step9 instanceof LocationEnforceFlowContract$Step.LocationToggle)) {
                    throw new NoWhenBranchMatchedException();
                }
                PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("LOCATION_TOGGLE_PROMPT_ID", new TextLocalisedClause(com.revolut.retail.feature.impl.userauth.R$string.location_enforce_device_toggle_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.impl.userauth.R$string.location_enforce_device_toggle_message, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D027", null, null, null, 30), null), null, null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.feature.impl.userauth.R$string.location_enforce_device_toggle_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096560), null, false, false, null, 30));
                Function1 block22 = new Function1() { // from class: jwj.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        switch (i6) {
                            case 0:
                                com.revolut.kompot.common.flow.permissions.a outputData = (com.revolut.kompot.common.flow.permissions.a) obj8;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                if (outputData instanceof a.C0596a) {
                                    com.revolut.retail.feature.impl.userauth.location_enforce.ui.flow.b bVar7 = bVar6;
                                    iwj.a aVar18 = bVar7.f101685p;
                                    e0.C(aVar18.f169173g, null, null, new ikf.g(aVar18, (Continuation) null, 24), 3);
                                    yji.l.a1(bVar7, q.q(rd0.e.b(((z39.b) bVar7.f101686q).f319221b.j())), null, null, new com.revolut.retail.feature.impl.userauth.location_enforce.ui.flow.a(bVar7, null), 3);
                                }
                                break;
                            default:
                                d67.u outputData2 = (d67.u) obj8;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                if (outputData2 instanceof d67.s) {
                                    com.revolut.retail.feature.impl.userauth.location_enforce.ui.flow.b bVar8 = bVar6;
                                    bVar8.C1(new ExternalDestination.ByIntent(((s70.b) bVar8.o).c(), null));
                                } else {
                                    int i96 = jli.h.f175850a;
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block22, "block");
                promptMarketingScreen.H = block22;
                return promptMarketingScreen;
            case 21:
                com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.flow.a aVar18 = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.flow.a) obj4;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                CryptoTradeFlowContract$Step step10 = (CryptoTradeFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!(step10 instanceof CryptoTradeFlowContract$Step.CryptoTradeStep)) {
                    if (step10 instanceof CryptoTradeFlowContract$Step.TrendingStep) {
                        return new TrendingScreen();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                RetailCryptoTradeFlow retailCryptoTradeFlow = new RetailCryptoTradeFlow();
                jp3.b block23 = new jp3.b(aVar18, FlowCoordinator3, i2);
                Intrinsics.checkNotNullParameter(block23, "block");
                retailCryptoTradeFlow.H = block23;
                return retailCryptoTradeFlow;
            case 22:
                com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c cVar3 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AirportLoungesHomeScreenContract$ModalStep step11 = (AirportLoungesHomeScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof AirportLoungesHomeScreenContract$ModalStep.RevPointsBottomSheet) {
                    return cVar3.e1(new hub.c(m1c.e0.LOUNGES));
                }
                if (step11 instanceof AirportLoungesHomeScreenContract$ModalStep.UnlimitedProfileSwitchBottomSheet) {
                    AirportLoungesUnlimitedProfileSwitchScreen airportLoungesUnlimitedProfileSwitchScreen = new AirportLoungesUnlimitedProfileSwitchScreen(((AirportLoungesHomeScreenContract$ModalStep.UnlimitedProfileSwitchBottomSheet) step11).f99083a);
                    jxi.z block24 = new jxi.z(cVar3, i6);
                    Intrinsics.checkNotNullParameter(block24, "block");
                    airportLoungesUnlimitedProfileSwitchScreen.H = block24;
                    return airportLoungesUnlimitedProfileSwitchScreen;
                }
                if (step11 instanceof AirportLoungesHomeScreenContract$ModalStep.PassBreakdown) {
                    return new AirportLoungesPassBreakdownScreen(((AirportLoungesHomeScreenContract$ModalStep.PassBreakdown) step11).f99080a);
                }
                if (step11 instanceof AirportLoungesHomeScreenContract$ModalStep.GiftedPassesBreakdown) {
                    return new AirportLoungesGiftedPassesBreakdownScreen(((AirportLoungesHomeScreenContract$ModalStep.GiftedPassesBreakdown) step11).f99077a);
                }
                if (!(step11 instanceof AirportLoungesHomeScreenContract$ModalStep.HelpBottomSheet)) {
                    if (step11 instanceof AirportLoungesHomeScreenContract$ModalStep.ProductArticle) {
                        return cVar3.e1(new ProductArticleDescriptor(((AirportLoungesHomeScreenContract$ModalStep.ProductArticle) step11).f99081a, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                AirportLoungesHomeScreenContract$ModalStep.HelpBottomSheet helpBottomSheet = (AirportLoungesHomeScreenContract$ModalStep.HelpBottomSheet) step11;
                AirportLoungesHomeHelpScreen airportLoungesHomeHelpScreen = new AirportLoungesHomeHelpScreen(new AirportLoungesHomeHelpScreenContract$InputData(helpBottomSheet.f99078a, helpBottomSheet.f99079b));
                jxi.z block25 = new jxi.z(cVar3, i5);
                Intrinsics.checkNotNullParameter(block25, "block");
                airportLoungesHomeHelpScreen.H = block25;
                return airportLoungesHomeHelpScreen;
            case 23:
                return a(obj2, obj3);
            case 24:
                return b(obj2, obj3);
            case 25:
                return c(obj2, obj3);
            case 26:
                return d(obj2, obj3);
            case 27:
                return e(obj2, obj3);
            case 28:
                return g(obj2, obj3);
            default:
                com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b bVar7 = (com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TaxHubPaymentAssessmentScreenContract$ModalStep step12 = (TaxHubPaymentAssessmentScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof TaxHubPaymentAssessmentScreenContract$ModalStep.RecipientPicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                TaxHubPaymentAssessmentScreenContract$ModalStep.RecipientPicker recipientPicker = (TaxHubPaymentAssessmentScreenContract$ModalStep.RecipientPicker) step12;
                TaxHubPaymentRecipientPickerScreen taxHubPaymentRecipientPickerScreen = new TaxHubPaymentRecipientPickerScreen(new TaxHubPaymentRecipientPickerScreenContract$InputData(recipientPicker.f74303b, recipientPicker.f74302a));
                k0d.c block26 = new k0d.c(bVar7, i3);
                Intrinsics.checkNotNullParameter(block26, "block");
                taxHubPaymentRecipientPickerScreen.H = block26;
                return taxHubPaymentRecipientPickerScreen;
        }
    }
}
