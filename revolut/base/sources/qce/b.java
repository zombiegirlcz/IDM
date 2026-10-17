package qce;

import android.content.Context;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import aw0.o9;
import aw0.q1;
import bbg.k;
import bbg.m;
import bbg.n;
import bbg.o;
import bbg.p;
import beg.i;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.k3;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.TransactionsPerformanceTracker$Scenario;
import com.revolut.feature.apm.bills.core.api.model.search.tapi.BillSearchTapiResult;
import com.revolut.feature.apm.bills.tapi.impl.flow.transfer.TapiTransferFlowContract$State;
import com.revolut.feature.apm.bills.tapi.impl.flow.transfer.TapiTransferFlowContract$Step;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.amount.TapiTransferAmountScreen;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.amount.TapiTransferAmountScreenContract$Input;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.fee_breakdown.TapiFeeBreakdownScreen;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.fee_breakdown.TapiFeeBreakdownScreenContract$InputData;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.review.TapiTransferReviewScreen;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.transfer_breakdown.TapiTransferBreakdownScreen;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.transfer_breakdown.TapiTransferBreakdownScreenContract$InputData;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.card_design.api.CardDesignCatalogueDestination;
import com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow.LoanDocumentsFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow.LoanDocumentsFlowContract$Step;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.list.LoanDocumentsController;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.list.LoanDocumentsControllerContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.section.LoanDocumentSectionController;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.section.LoanDocumentSectionControllerContract$InputData;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.feature.crypto.remittance.impl.ui.currency_picker.CurrencyChooserScreen;
import com.revolut.feature.crypto.remittance.impl.ui.currency_picker.flow.CurrencyChooserFlowContractInternal$Step;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.payments.transfers.personalisation.api.navigation.StyleScreenInput;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.flow.TransfersPersonalisationFlowContract$InputData;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.flow.TransfersPersonalisationFlowContract$Step;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.gallery.TransferPersonalisationGallerySelector;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.gallery.TransferPersonalisationGallerySelectorContract$InputData;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.gif.TransferPersonalisationGifSelector;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.style.TransferPersonalisationStyleSelector;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.style.TransferPersonalisationStyleSelectorContract$InputData;
import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$FlowState;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreen;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreenContract$InputData;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInInstrument;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInSelectedAsset;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.TransferInAssetSelectionFlowContract$InputData;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.TransferInAssetSelectionFlowContract$Step;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.buy_in_price.BuyInPriceScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.instruments_list.InstrumentsListScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.number_of_shares.NumberOfSharesScreen;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.TravelHotelsBookingAmendmentFlowContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.TravelHotelsBookingAmendmentFlowContract$Step;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.room.selection.TravelHotelsRoomsSelectionFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.room.selection.TravelHotelsRoomsSelectionFlowContract$InputData$Amendment;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment.TravelHotelsBookingAmendmentDatesPickerScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.details.amendment.TravelHotelsRoomDetailsAmendmentScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.details.amendment.TravelHotelsRoomDetailsAmendmentScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.amendment.TravelHotelsRoomsSelectionAmendmentScreenContract$InputData;
import com.revolut.feature.wealth_discovery.impl.screener.widget.chat_instrument_list.ScreenerChatWidgetParcel$Retry;
import com.revolut.feature_rev_points_pocket_impl.ui.add_money.RevPointsAddMoneyFlowContract$InputData;
import com.revolut.feature_rev_points_pocket_impl.ui.add_money.RevPointsAddMoneyFlowContract$Step;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.a;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import cs1.f;
import cs1.g;
import ip0.q3;
import ip0.r3;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import qsk.e;
import sa6.y;
import tt7.k;
import vkm.j2;
import wnk.i;
import wr1.j;
import yki.l;
import zh9.u0;
import zhm.h0;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f244717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f244718c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f244716a = i;
        this.f244717b = obj2;
        this.f244718c = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object params, Object value) {
        Object next;
        Object next2;
        ri6.d dVar;
        TransferInSelectedAsset transferInSelectedAsset;
        TransferInSelectedAsset transferInSelectedAsset2;
        ViewController transferPersonalisationGallerySelector;
        int i = this.f244716a;
        Object obj2 = this.f244718c;
        Object obj3 = this.f244717b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) value, "<unused var>");
                zhm.f0 f0Var = zhm.f0.f322471a;
                return ((d) obj3).b(f0Var, f0Var, (k71.q) obj2);
            case 1:
                com.revolut.feature_rev_points_pocket_impl.ui.add_money.a aVar = (com.revolut.feature_rev_points_pocket_impl.ui.add_money.a) obj3;
                RevPointsAddMoneyFlowContract$InputData revPointsAddMoneyFlowContract$InputData = (RevPointsAddMoneyFlowContract$InputData) obj2;
                yki.l FlowCoordinator = (yki.l) params;
                RevPointsAddMoneyFlowContract$Step step = (RevPointsAddMoneyFlowContract$Step) value;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof RevPointsAddMoneyFlowContract$Step.MoveMoney)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE1 = aVar.e1(new y5i.a(((RevPointsAddMoneyFlowContract$Step.MoveMoney) step).f97809a, null, 14));
                a block = new a(aVar, revPointsAddMoneyFlowContract$InputData, 2);
                Intrinsics.checkNotNullParameter(block, "block");
                viewControllerE1.H = block;
                return viewControllerE1;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) value, "<unused var>");
                return new qdk.r0(qdk.z.f244998a, ((m5e.o) obj3).a((qdk.x) obj2), zhm.f0.f322471a, null, iii.c.b(null, null, 6, true));
            case 3:
                Intrinsics.checkNotNullParameter((Function1) value, "<unused var>");
                return ((qje.v) obj3).a((TabCryptoFlowContract$FlowState) obj2);
            case 4:
                CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData inputData = (CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData) obj3;
                com.revolut.feature.crypto.remittance.impl.ui.currency_picker.flow.a aVar2 = (com.revolut.feature.crypto.remittance.impl.ui.currency_picker.flow.a) obj2;
                yki.l FlowCoordinator2 = (yki.l) params;
                CurrencyChooserFlowContractInternal$Step step2 = (CurrencyChooserFlowContractInternal$Step) value;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof CurrencyChooserFlowContractInternal$Step.CurrencyChooser)) {
                    throw new NoWhenBranchMatchedException();
                }
                CurrencyChooserScreen currencyChooserScreen = new CurrencyChooserScreen(inputData);
                a block2 = new a(aVar2, inputData, 17);
                Intrinsics.checkNotNullParameter(block2, "block");
                currencyChooserScreen.H = block2;
                return currencyChooserScreen;
            case 5:
                qsk.e eVar = (qsk.e) obj3;
                int iIntValue = ((Integer) params).intValue();
                e.a series = (e.a) value;
                Intrinsics.checkNotNullParameter(series, "series");
                q3 q3Var = r3.Companion;
                q3Var.getClass();
                List list = r3.f166086r;
                q3Var.getClass();
                int iIntValue2 = ((Number) list.get(iIntValue % list.size())).intValue();
                return new q1(iIntValue2, Integer.valueOf(iIntValue2), eVar.s(series), eVar.m((uqk.d) obj2, series));
            case 6:
                Function1 getDefaultErrorItems = (Function1) value;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new qu4.n((List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), ((qu4.x) obj3).a((qu4.i) obj2, false));
            case 7:
                AlertsWidgetContext alertsWidgetContext = (AlertsWidgetContext) obj2;
                Intrinsics.checkNotNullParameter((Function1) value, "<unused var>");
                ((r2d.k) obj3).getClass();
                RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), null, null, false, null, false, 62);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.shared_watchlist_watchlist_screen_asset_section_error_state_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                int i2 = R$drawable.uikit_icn_24_retry;
                Integer numValueOf = Integer.valueOf(R$attr.uikit_colorAccent);
                Float fValueOf = Float.valueOf(16.0f);
                return zhm.u.c(new RowDelegate.Model("ALERTS_WIDGET_ERROR_STATE", image40, textLocalisedClause, null, 0, yoj.b.w(yoj.b.w(new ImageClause(i2, numValueOf, fValueOf, fValueOf, 16), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextLocalisedClause(R$string.shared_watchlist_watchlist_screen_asset_section_buttons_try_again, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10)), null, null, 0, null, false, null, false, null, null, null, null, null, null, alertsWidgetContext, null, 0, 0, 0, 0, 532676568));
            case 8:
                Intrinsics.checkNotNullParameter((Function1) value, "<unused var>");
                return rd3.o.j((od3.l) obj3, (TextLocalisedClause) obj2);
            case 9:
                re0.d dVar2 = (re0.d) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(value, "domain");
                String key = (String) ((Function1) obj2).invoke(params);
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                dVar2.f253484a.f(key, value);
                return Unit.f186387a;
            case 10:
                ri6.c cVar = (ri6.c) obj3;
                x61.i iVar = (x61.i) obj2;
                List personalPockets = (List) params;
                List jointPockets = (List) value;
                Intrinsics.checkNotNullParameter(personalPockets, "personalPockets");
                Intrinsics.checkNotNullParameter(jointPockets, "jointPockets");
                Iterator it8 = personalPockets.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        Intrinsics.h(iVar);
                        cVar.getClass();
                        if (ri6.c.a((io3.d) next, iVar)) {
                        }
                    } else {
                        next = null;
                    }
                }
                io3.d dVar3 = (io3.d) next;
                if (dVar3 != null) {
                    dVar = new ri6.d(dVar3, false);
                } else {
                    Iterator it9 = jointPockets.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next2 = it9.next();
                            Intrinsics.h(iVar);
                            cVar.getClass();
                            if (ri6.c.a((io3.d) next2, iVar)) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    io3.d dVar4 = (io3.d) next2;
                    dVar = dVar4 != null ? new ri6.d(dVar4, true) : null;
                }
                od0.i.Companion.getClass();
                return od0.h.a(dVar);
            case 11:
                TaxNumberInputScreenContract$InputData taxNumberInputScreenContract$InputData = (TaxNumberInputScreenContract$InputData) obj3;
                TaxNumberInputScreen taxNumberInputScreen = (TaxNumberInputScreen) obj2;
                InputTextDelegate.Model model = (InputTextDelegate.Model) params;
                InputText field = (InputText) value;
                TaxNumberInputScreen.Companion aVar3 = TaxNumberInputScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                if (Intrinsics.f(model.f52580a, "TIN_LIST_ID")) {
                    return new zp0.y(field.getInnerEditText(), zhm.u.c(zp0.m.a()), taxNumberInputScreenContract$InputData.f90123b.a().f323488g, new rea.j(taxNumberInputScreen, 25), model.f52580a, null, false, 96);
                }
                return null;
            case 12:
                Function1 getDefaultErrorItems2 = (Function1) value;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new jsl.j0(((rsl.s) obj3).a((jsl.y) obj2), (List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null)));
            case 13:
                TransferInAssetSelectionFlowContract$InputData transferInAssetSelectionFlowContract$InputData = (TransferInAssetSelectionFlowContract$InputData) obj3;
                com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.a aVar4 = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.a) obj2;
                yki.l FlowCoordinator3 = (yki.l) params;
                TransferInAssetSelectionFlowContract$Step step3 = (TransferInAssetSelectionFlowContract$Step) value;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (Intrinsics.f(step3, TransferInAssetSelectionFlowContract$Step.SelectInstrument.f91564a)) {
                    Intrinsics.i(transferInAssetSelectionFlowContract$InputData, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.TransferInAssetSelectionFlowContract.InputData.NewTransferAssetSelection");
                    TransferInAssetSelectionFlowContract$InputData.NewTransferAssetSelection newTransferAssetSelection = (TransferInAssetSelectionFlowContract$InputData.NewTransferAssetSelection) transferInAssetSelectionFlowContract$InputData;
                    InstrumentsListScreen instrumentsListScreen = new InstrumentsListScreen(newTransferAssetSelection.f91557b, newTransferAssetSelection.f91558c);
                    s31.a block3 = new s31.a(aVar4, FlowCoordinator3, 16);
                    Intrinsics.checkNotNullParameter(block3, "block");
                    instrumentsListScreen.H = block3;
                    return instrumentsListScreen;
                }
                if (step3 instanceof TransferInAssetSelectionFlowContract$Step.NumberOfShares) {
                    TransferInInstrument transferInInstrument = ((TransferInAssetSelectionFlowContract$Step.NumberOfShares) step3).f91563a;
                    TransferInAssetSelectionFlowContract$InputData.EditTransferAssetSelection editTransferAssetSelection = transferInAssetSelectionFlowContract$InputData instanceof TransferInAssetSelectionFlowContract$InputData.EditTransferAssetSelection ? (TransferInAssetSelectionFlowContract$InputData.EditTransferAssetSelection) transferInAssetSelectionFlowContract$InputData : null;
                    NumberOfSharesScreen numberOfSharesScreen = new NumberOfSharesScreen(transferInInstrument, (editTransferAssetSelection == null || (transferInSelectedAsset2 = editTransferAssetSelection.f91555b) == null) ? null : Integer.valueOf(transferInSelectedAsset2.f91511b));
                    q2k.b block4 = new q2k.b(aVar4, transferInAssetSelectionFlowContract$InputData, FlowCoordinator3, step3, 27);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    numberOfSharesScreen.H = block4;
                    return numberOfSharesScreen;
                }
                if (!(step3 instanceof TransferInAssetSelectionFlowContract$Step.BuyInPrice)) {
                    throw new NoWhenBranchMatchedException();
                }
                TransferInInstrument transferInInstrument2 = ((TransferInAssetSelectionFlowContract$Step.BuyInPrice) step3).f91562a;
                TransferInAssetSelectionFlowContract$InputData.EditTransferAssetSelection editTransferAssetSelection2 = transferInAssetSelectionFlowContract$InputData instanceof TransferInAssetSelectionFlowContract$InputData.EditTransferAssetSelection ? (TransferInAssetSelectionFlowContract$InputData.EditTransferAssetSelection) transferInAssetSelectionFlowContract$InputData : null;
                BuyInPriceScreen buyInPriceScreen = new BuyInPriceScreen(transferInInstrument2, (editTransferAssetSelection2 == null || (transferInSelectedAsset = editTransferAssetSelection2.f91555b) == null) ? null : transferInSelectedAsset.f91512c, true);
                s78.d block5 = new s78.d(aVar4, 7);
                Intrinsics.checkNotNullParameter(block5, "block");
                buyInPriceScreen.H = block5;
                return buyInPriceScreen;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) value, "<unused var>");
                return ((s9h.h) obj3).i((String) obj2);
            case 15:
                final com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.a aVar5 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.a) obj3;
                TravelHotelsBookingAmendmentFlowContract$InputData travelHotelsBookingAmendmentFlowContract$InputData = (TravelHotelsBookingAmendmentFlowContract$InputData) obj2;
                final yki.l FlowCoordinator4 = (yki.l) params;
                final TravelHotelsBookingAmendmentFlowContract$Step step4 = (TravelHotelsBookingAmendmentFlowContract$Step) value;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof TravelHotelsBookingAmendmentFlowContract$Step.DatesPicker) {
                    TravelHotelsBookingAmendmentDatesPickerScreen travelHotelsBookingAmendmentDatesPickerScreen = new TravelHotelsBookingAmendmentDatesPickerScreen(new TravelHotelsBookingAmendmentDatesPickerScreenContract$InputData(((TravelHotelsBookingAmendmentFlowContract$Step.DatesPicker) step4).f93685a));
                    q2k.b block6 = new q2k.b(aVar5, FlowCoordinator4, travelHotelsBookingAmendmentFlowContract$InputData, step4, 29);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    travelHotelsBookingAmendmentDatesPickerScreen.H = block6;
                    return travelHotelsBookingAmendmentDatesPickerScreen;
                }
                if (step4 instanceof TravelHotelsBookingAmendmentFlowContract$Step.RoomsSelection) {
                    TravelHotelsBookingAmendmentFlowContract$Step.RoomsSelection roomsSelection = (TravelHotelsBookingAmendmentFlowContract$Step.RoomsSelection) step4;
                    TravelHotelsRoomsSelectionFlow travelHotelsRoomsSelectionFlow = new TravelHotelsRoomsSelectionFlow(new TravelHotelsRoomsSelectionFlowContract$InputData$Amendment(new TravelHotelsRoomsSelectionAmendmentScreenContract$InputData(roomsSelection.f93689a, roomsSelection.f93690b, roomsSelection.f93691c)));
                    final int i3 = 0;
                    Function1 block7 = new Function1() { // from class: sag.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            int i5 = i3;
                            TravelHotelsBookingAmendmentFlowContract$Step travelHotelsBookingAmendmentFlowContract$Step = step4;
                            switch (i5) {
                                case 0:
                                    wag.e output = (wag.e) obj4;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof wag.c) {
                                        i iVar2 = ((wag.c) output).f295939a;
                                        boolean z = iVar2 instanceof beg.g;
                                        com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.a aVar6 = aVar5;
                                        l lVar = FlowCoordinator4;
                                        if (z) {
                                            TravelHotelsBookingAmendmentFlowContract$Step.RoomsSelection roomsSelection2 = (TravelHotelsBookingAmendmentFlowContract$Step.RoomsSelection) travelHotelsBookingAmendmentFlowContract$Step;
                                            h.t2(aVar6, lVar, new TravelHotelsBookingAmendmentFlowContract$Step.Confirmation(roomsSelection2.f93689a, roomsSelection2.f93690b, roomsSelection2.f93691c, ((beg.g) iVar2).f14830a), false, null, false, 14);
                                        } else {
                                            if (!(iVar2 instanceof beg.h)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            TravelHotelsBookingAmendmentFlowContract$Step.RoomsSelection roomsSelection3 = (TravelHotelsBookingAmendmentFlowContract$Step.RoomsSelection) travelHotelsBookingAmendmentFlowContract$Step;
                                            h.t2(aVar6, lVar, new TravelHotelsBookingAmendmentFlowContract$Step.RoomDetails(roomsSelection3.f93689a, roomsSelection3.f93690b, roomsSelection3.f93691c, ((beg.h) iVar2).f14831a, true), false, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 10);
                                        }
                                    } else {
                                        if (!(output instanceof wag.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IllegalStateException illegalStateException = new IllegalStateException("Unexpected result: Booking instead of Amendment");
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    p output2 = (p) obj4;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z3 = output2 instanceof k;
                                    l lVar2 = FlowCoordinator4;
                                    if (z3) {
                                        h.D2(lVar2);
                                    } else {
                                        boolean z4 = output2 instanceof n;
                                        com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.a aVar7 = aVar5;
                                        if (z4) {
                                            TravelHotelsBookingAmendmentFlowContract$Step.Confirmation confirmation = (TravelHotelsBookingAmendmentFlowContract$Step.Confirmation) travelHotelsBookingAmendmentFlowContract$Step;
                                            h.t2(aVar7, lVar2, new TravelHotelsBookingAmendmentFlowContract$Step.RoomDetails(confirmation.f93682a, confirmation.f93683b, confirmation.f93684c, ((n) output2).f14292a, false), false, null, false, 14);
                                        } else if (output2 instanceof bbg.l) {
                                            bbg.l lVar3 = (bbg.l) output2;
                                            aVar7.C2(new c(lVar3.f14289a, lVar3.f14290b));
                                        } else if (output2 instanceof o) {
                                            if (!h.E2(lVar2, new y(3))) {
                                                aVar7.B2();
                                            }
                                        } else {
                                            if (!(output2 instanceof m)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar7.C2(new e(((m) output2).f14291a));
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    ydg.e output3 = (ydg.e) obj4;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!(output3 instanceof ydg.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    TravelHotelsBookingAmendmentFlowContract$Step.RoomDetails roomDetails = (TravelHotelsBookingAmendmentFlowContract$Step.RoomDetails) travelHotelsBookingAmendmentFlowContract$Step;
                                    h.t2(aVar5, FlowCoordinator4, new TravelHotelsBookingAmendmentFlowContract$Step.Confirmation(roomDetails.f93686a, roomDetails.f93687b, roomDetails.f93688c, u.c(roomDetails.d)), false, null, false, 14);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    travelHotelsRoomsSelectionFlow.H = block7;
                    return travelHotelsRoomsSelectionFlow;
                }
                if (step4 instanceof TravelHotelsBookingAmendmentFlowContract$Step.Confirmation) {
                    TravelHotelsBookingAmendmentFlowContract$Step.Confirmation confirmation = (TravelHotelsBookingAmendmentFlowContract$Step.Confirmation) step4;
                    TravelHotelsAmendmentConfirmationScreen travelHotelsAmendmentConfirmationScreen = new TravelHotelsAmendmentConfirmationScreen(new TravelHotelsAmendmentConfirmationScreenContract$InputData(confirmation.f93682a, confirmation.f93683b, confirmation.f93684c, confirmation.d));
                    final int i5 = 1;
                    Function1 block8 = new Function1() { // from class: sag.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            int i59 = i5;
                            TravelHotelsBookingAmendmentFlowContract$Step travelHotelsBookingAmendmentFlowContract$Step = step4;
                            switch (i59) {
                                case 0:
                                    wag.e output = (wag.e) obj4;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof wag.c) {
                                        i iVar2 = ((wag.c) output).f295939a;
                                        boolean z = iVar2 instanceof beg.g;
                                        com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.a aVar6 = aVar5;
                                        l lVar = FlowCoordinator4;
                                        if (z) {
                                            TravelHotelsBookingAmendmentFlowContract$Step.RoomsSelection roomsSelection2 = (TravelHotelsBookingAmendmentFlowContract$Step.RoomsSelection) travelHotelsBookingAmendmentFlowContract$Step;
                                            h.t2(aVar6, lVar, new TravelHotelsBookingAmendmentFlowContract$Step.Confirmation(roomsSelection2.f93689a, roomsSelection2.f93690b, roomsSelection2.f93691c, ((beg.g) iVar2).f14830a), false, null, false, 14);
                                        } else {
                                            if (!(iVar2 instanceof beg.h)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            TravelHotelsBookingAmendmentFlowContract$Step.RoomsSelection roomsSelection3 = (TravelHotelsBookingAmendmentFlowContract$Step.RoomsSelection) travelHotelsBookingAmendmentFlowContract$Step;
                                            h.t2(aVar6, lVar, new TravelHotelsBookingAmendmentFlowContract$Step.RoomDetails(roomsSelection3.f93689a, roomsSelection3.f93690b, roomsSelection3.f93691c, ((beg.h) iVar2).f14831a, true), false, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 10);
                                        }
                                    } else {
                                        if (!(output instanceof wag.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IllegalStateException illegalStateException = new IllegalStateException("Unexpected result: Booking instead of Amendment");
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    p output2 = (p) obj4;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z3 = output2 instanceof k;
                                    l lVar2 = FlowCoordinator4;
                                    if (z3) {
                                        h.D2(lVar2);
                                    } else {
                                        boolean z4 = output2 instanceof n;
                                        com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.a aVar7 = aVar5;
                                        if (z4) {
                                            TravelHotelsBookingAmendmentFlowContract$Step.Confirmation confirmation2 = (TravelHotelsBookingAmendmentFlowContract$Step.Confirmation) travelHotelsBookingAmendmentFlowContract$Step;
                                            h.t2(aVar7, lVar2, new TravelHotelsBookingAmendmentFlowContract$Step.RoomDetails(confirmation2.f93682a, confirmation2.f93683b, confirmation2.f93684c, ((n) output2).f14292a, false), false, null, false, 14);
                                        } else if (output2 instanceof bbg.l) {
                                            bbg.l lVar3 = (bbg.l) output2;
                                            aVar7.C2(new c(lVar3.f14289a, lVar3.f14290b));
                                        } else if (output2 instanceof o) {
                                            if (!h.E2(lVar2, new y(3))) {
                                                aVar7.B2();
                                            }
                                        } else {
                                            if (!(output2 instanceof m)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar7.C2(new e(((m) output2).f14291a));
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    ydg.e output3 = (ydg.e) obj4;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!(output3 instanceof ydg.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    TravelHotelsBookingAmendmentFlowContract$Step.RoomDetails roomDetails = (TravelHotelsBookingAmendmentFlowContract$Step.RoomDetails) travelHotelsBookingAmendmentFlowContract$Step;
                                    h.t2(aVar5, FlowCoordinator4, new TravelHotelsBookingAmendmentFlowContract$Step.Confirmation(roomDetails.f93686a, roomDetails.f93687b, roomDetails.f93688c, u.c(roomDetails.d)), false, null, false, 14);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    travelHotelsAmendmentConfirmationScreen.H = block8;
                    return travelHotelsAmendmentConfirmationScreen;
                }
                if (!(step4 instanceof TravelHotelsBookingAmendmentFlowContract$Step.RoomDetails)) {
                    throw new NoWhenBranchMatchedException();
                }
                TravelHotelsBookingAmendmentFlowContract$Step.RoomDetails roomDetails = (TravelHotelsBookingAmendmentFlowContract$Step.RoomDetails) step4;
                TravelHotelsRoomDetailsAmendmentScreen travelHotelsRoomDetailsAmendmentScreen = new TravelHotelsRoomDetailsAmendmentScreen(new TravelHotelsRoomDetailsAmendmentScreenContract$InputData(roomDetails.f93686a, roomDetails.f93687b, roomDetails.f93688c, roomDetails.d, roomDetails.e));
                final int i6 = 2;
                Function1 block9 = new Function1() { // from class: sag.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i59 = i6;
                        TravelHotelsBookingAmendmentFlowContract$Step travelHotelsBookingAmendmentFlowContract$Step = step4;
                        switch (i59) {
                            case 0:
                                wag.e output = (wag.e) obj4;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (output instanceof wag.c) {
                                    i iVar2 = ((wag.c) output).f295939a;
                                    boolean z = iVar2 instanceof beg.g;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.a aVar6 = aVar5;
                                    l lVar = FlowCoordinator4;
                                    if (z) {
                                        TravelHotelsBookingAmendmentFlowContract$Step.RoomsSelection roomsSelection2 = (TravelHotelsBookingAmendmentFlowContract$Step.RoomsSelection) travelHotelsBookingAmendmentFlowContract$Step;
                                        h.t2(aVar6, lVar, new TravelHotelsBookingAmendmentFlowContract$Step.Confirmation(roomsSelection2.f93689a, roomsSelection2.f93690b, roomsSelection2.f93691c, ((beg.g) iVar2).f14830a), false, null, false, 14);
                                    } else {
                                        if (!(iVar2 instanceof beg.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        TravelHotelsBookingAmendmentFlowContract$Step.RoomsSelection roomsSelection3 = (TravelHotelsBookingAmendmentFlowContract$Step.RoomsSelection) travelHotelsBookingAmendmentFlowContract$Step;
                                        h.t2(aVar6, lVar, new TravelHotelsBookingAmendmentFlowContract$Step.RoomDetails(roomsSelection3.f93689a, roomsSelection3.f93690b, roomsSelection3.f93691c, ((beg.h) iVar2).f14831a, true), false, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 10);
                                    }
                                } else {
                                    if (!(output instanceof wag.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    IllegalStateException illegalStateException = new IllegalStateException("Unexpected result: Booking instead of Amendment");
                                    h0 h0Var = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                }
                                return Unit.f186387a;
                            case 1:
                                p output2 = (p) obj4;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                boolean z3 = output2 instanceof k;
                                l lVar2 = FlowCoordinator4;
                                if (z3) {
                                    h.D2(lVar2);
                                } else {
                                    boolean z4 = output2 instanceof n;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.a aVar7 = aVar5;
                                    if (z4) {
                                        TravelHotelsBookingAmendmentFlowContract$Step.Confirmation confirmation2 = (TravelHotelsBookingAmendmentFlowContract$Step.Confirmation) travelHotelsBookingAmendmentFlowContract$Step;
                                        h.t2(aVar7, lVar2, new TravelHotelsBookingAmendmentFlowContract$Step.RoomDetails(confirmation2.f93682a, confirmation2.f93683b, confirmation2.f93684c, ((n) output2).f14292a, false), false, null, false, 14);
                                    } else if (output2 instanceof bbg.l) {
                                        bbg.l lVar3 = (bbg.l) output2;
                                        aVar7.C2(new c(lVar3.f14289a, lVar3.f14290b));
                                    } else if (output2 instanceof o) {
                                        if (!h.E2(lVar2, new y(3))) {
                                            aVar7.B2();
                                        }
                                    } else {
                                        if (!(output2 instanceof m)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar7.C2(new e(((m) output2).f14291a));
                                    }
                                }
                                return Unit.f186387a;
                            default:
                                ydg.e output3 = (ydg.e) obj4;
                                Intrinsics.checkNotNullParameter(output3, "output");
                                if (!(output3 instanceof ydg.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                TravelHotelsBookingAmendmentFlowContract$Step.RoomDetails roomDetails2 = (TravelHotelsBookingAmendmentFlowContract$Step.RoomDetails) travelHotelsBookingAmendmentFlowContract$Step;
                                h.t2(aVar5, FlowCoordinator4, new TravelHotelsBookingAmendmentFlowContract$Step.Confirmation(roomDetails2.f93686a, roomDetails2.f93687b, roomDetails2.f93688c, u.c(roomDetails2.d)), false, null, false, 14);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block9, "block");
                travelHotelsRoomDetailsAmendmentScreen.H = block9;
                return travelHotelsRoomDetailsAmendmentScreen;
            case 16:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g gVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g) obj3;
                String str = (String) obj2;
                wnk.i output = (wnk.i) params;
                oki.g handle = (oki.g) value;
                Intrinsics.checkNotNullParameter(output, "output");
                Intrinsics.checkNotNullParameter(handle, "handle");
                if (output instanceof i.c) {
                    handle.pop();
                    yki.i iVar2 = gVar.f103298x;
                    if (iVar2.d() == null || !(iVar2.d() instanceof StudentVerificationFlowContract$Step.EmailValidation)) {
                        oki.h.t2(gVar, iVar2, new StudentVerificationFlowContract$Step.EmailValidation(str, 6), false, null, false, 12);
                    }
                } else if (output instanceof i.a) {
                    handle.pop();
                } else if (output instanceof wnk.j) {
                    gVar.l2(new sik.h(gVar, ((wnk.j) output).f298851a, handle, null, 1), new yi5.b(26));
                } else if (output instanceof i.d) {
                    gVar.C2(a.C0635a.f103287a);
                } else if (!(output instanceof wnk.h) && !(output instanceof i.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 17:
                String str2 = (String) obj3;
                sjf.c cVar2 = (sjf.c) value;
                Intrinsics.checkNotNullParameter((TransactionsPerformanceTracker$Scenario) params, "<unused var>");
                if (cVar2 != null) {
                    return sjf.c.a(cVar2, zhm.r0.q(cVar2.f263724b, new Pair(str2, obj2)));
                }
                return null;
            case 18:
                sr1.c cVar3 = (sr1.c) obj3;
                final com.revolut.feature.apm.bills.tapi.impl.flow.transfer.a aVar6 = (com.revolut.feature.apm.bills.tapi.impl.flow.transfer.a) obj2;
                qki.d dVar5 = aVar6.f61545p;
                final yki.l FlowCoordinator5 = (yki.l) params;
                TapiTransferFlowContract$Step step5 = (TapiTransferFlowContract$Step) value;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof TapiTransferFlowContract$Step.Amount) {
                    BillSearchTapiResult billSearchTapiResult = cVar3.f265104a;
                    dj0.d dVar6 = billSearchTapiResult.f61451b;
                    BillSearchTapiResult.PaymentMethodDetails paymentMethodDetails = billSearchTapiResult.i;
                    TapiTransferAmountScreen tapiTransferAmountScreen = new TapiTransferAmountScreen(new TapiTransferAmountScreenContract$Input(dVar6, paymentMethodDetails != null ? paymentMethodDetails.d : null, paymentMethodDetails != null ? paymentMethodDetails.e : null, billSearchTapiResult));
                    final int i21 = 0;
                    Function1 block10 = new Function1() { // from class: sr1.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            int i22 = i21;
                            l lVar = FlowCoordinator5;
                            com.revolut.feature.apm.bills.tapi.impl.flow.transfer.a aVar7 = aVar6;
                            ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                            switch (i22) {
                                case 0:
                                    wr1.k result = (wr1.k) obj4;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof wr1.i;
                                    l lVar2 = FlowCoordinator5;
                                    if (z) {
                                        wr1.i iVar3 = (wr1.i) result;
                                        h.t2(aVar6, lVar2, new TapiTransferFlowContract$Step.Review(iVar3.f299491a, iVar3.f299492b, iVar3.f299493c, iVar3.d), true, null, false, 12);
                                    } else if (result instanceof wr1.h) {
                                        h.w2(lVar2, new TapiTransferFlowContract$Step.FeeBreakdown(((wr1.h) result).f299490a), popup);
                                    } else {
                                        if (!(result instanceof j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        j jVar = (j) result;
                                        h.w2(lVar2, new TapiTransferFlowContract$Step.TransferBreakdown(jVar.f299494a, jVar.f299495b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    as1.l result2 = (as1.l) obj4;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof as1.k) {
                                        aVar7.C1(u0.b(com.revolut.retail.core.navigation.a.c(gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6))), new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(((as1.k) result2).f8768a), null, null, null, 126)))));
                                    } else if (result2 instanceof as1.j) {
                                        h.w2(lVar, new TapiTransferFlowContract$Step.FeeBreakdown(((as1.j) result2).f8767a), popup);
                                        Unit unit = Unit.f186387a;
                                    } else {
                                        if (!(result2 instanceof as1.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        qpk.b bVar = aVar7.o;
                                        xi0.b bVar2 = ((as1.i) result2).f8766a;
                                        xi0.b.Companion.getClass();
                                        aVar7.C1(new BridgeDestination(new FeatureCommand(dpk.a.a(bVar, bVar2, xi0.b.z, false, false))));
                                    }
                                    return Unit.f186387a;
                                default:
                                    g result3 = (g) obj4;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof cs1.e) {
                                        qpk.b bVar3 = aVar7.o;
                                        xi0.b bVar4 = ((cs1.e) result3).f108434a;
                                        xi0.b.Companion.getClass();
                                        aVar7.C1(new BridgeDestination(new FeatureCommand(dpk.a.a(bVar3, bVar4, xi0.b.z, false, false))));
                                    } else if (result3 instanceof f) {
                                        h.w2(lVar, new TapiTransferFlowContract$Step.FeeBreakdown(((f) result3).f108435a), popup);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block10, "block");
                    tapiTransferAmountScreen.H = block10;
                    return tapiTransferAmountScreen;
                }
                if (step5 instanceof TapiTransferFlowContract$Step.Review) {
                    TapiTransferFlowContract$Step.Review review = (TapiTransferFlowContract$Step.Review) step5;
                    TapiTransferReviewScreen tapiTransferReviewScreen = new TapiTransferReviewScreen(new as1.h(((TapiTransferFlowContract$State) ((j2) dVar5.f22677a).getValue()).f61537a, review.f61540a, ((TapiTransferFlowContract$State) ((j2) dVar5.f22677a).getValue()).f61537a.f, review.f61541b, review.f61542c, review.d));
                    final int i22 = 1;
                    Function1 block11 = new Function1() { // from class: sr1.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            int i222 = i22;
                            l lVar = FlowCoordinator5;
                            com.revolut.feature.apm.bills.tapi.impl.flow.transfer.a aVar7 = aVar6;
                            ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                            switch (i222) {
                                case 0:
                                    wr1.k result = (wr1.k) obj4;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof wr1.i;
                                    l lVar2 = FlowCoordinator5;
                                    if (z) {
                                        wr1.i iVar3 = (wr1.i) result;
                                        h.t2(aVar6, lVar2, new TapiTransferFlowContract$Step.Review(iVar3.f299491a, iVar3.f299492b, iVar3.f299493c, iVar3.d), true, null, false, 12);
                                    } else if (result instanceof wr1.h) {
                                        h.w2(lVar2, new TapiTransferFlowContract$Step.FeeBreakdown(((wr1.h) result).f299490a), popup);
                                    } else {
                                        if (!(result instanceof j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        j jVar = (j) result;
                                        h.w2(lVar2, new TapiTransferFlowContract$Step.TransferBreakdown(jVar.f299494a, jVar.f299495b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    as1.l result2 = (as1.l) obj4;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof as1.k) {
                                        aVar7.C1(u0.b(com.revolut.retail.core.navigation.a.c(gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6))), new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(((as1.k) result2).f8768a), null, null, null, 126)))));
                                    } else if (result2 instanceof as1.j) {
                                        h.w2(lVar, new TapiTransferFlowContract$Step.FeeBreakdown(((as1.j) result2).f8767a), popup);
                                        Unit unit = Unit.f186387a;
                                    } else {
                                        if (!(result2 instanceof as1.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        qpk.b bVar = aVar7.o;
                                        xi0.b bVar2 = ((as1.i) result2).f8766a;
                                        xi0.b.Companion.getClass();
                                        aVar7.C1(new BridgeDestination(new FeatureCommand(dpk.a.a(bVar, bVar2, xi0.b.z, false, false))));
                                    }
                                    return Unit.f186387a;
                                default:
                                    g result3 = (g) obj4;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof cs1.e) {
                                        qpk.b bVar3 = aVar7.o;
                                        xi0.b bVar4 = ((cs1.e) result3).f108434a;
                                        xi0.b.Companion.getClass();
                                        aVar7.C1(new BridgeDestination(new FeatureCommand(dpk.a.a(bVar3, bVar4, xi0.b.z, false, false))));
                                    } else if (result3 instanceof f) {
                                        h.w2(lVar, new TapiTransferFlowContract$Step.FeeBreakdown(((f) result3).f108435a), popup);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    tapiTransferReviewScreen.H = block11;
                    return tapiTransferReviewScreen;
                }
                if (step5 instanceof TapiTransferFlowContract$Step.FeeBreakdown) {
                    return new TapiFeeBreakdownScreen(new TapiFeeBreakdownScreenContract$InputData(((TapiTransferFlowContract$Step.FeeBreakdown) step5).f61539a));
                }
                if (!(step5 instanceof TapiTransferFlowContract$Step.TransferBreakdown)) {
                    throw new NoWhenBranchMatchedException();
                }
                TapiTransferFlowContract$Step.TransferBreakdown transferBreakdown = (TapiTransferFlowContract$Step.TransferBreakdown) step5;
                ApmQuote apmQuote = transferBreakdown.f61544b;
                TapiTransferBreakdownScreen tapiTransferBreakdownScreen = new TapiTransferBreakdownScreen(new TapiTransferBreakdownScreenContract$InputData(apmQuote != null ? apmQuote.f62210b : null, transferBreakdown.f61543a, apmQuote != null ? apmQuote.f62211c : null, apmQuote != null ? apmQuote.d : null));
                final int i32 = 2;
                Function1 block12 = new Function1() { // from class: sr1.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i222 = i32;
                        l lVar = FlowCoordinator5;
                        com.revolut.feature.apm.bills.tapi.impl.flow.transfer.a aVar7 = aVar6;
                        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                        switch (i222) {
                            case 0:
                                wr1.k result = (wr1.k) obj4;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean z = result instanceof wr1.i;
                                l lVar2 = FlowCoordinator5;
                                if (z) {
                                    wr1.i iVar3 = (wr1.i) result;
                                    h.t2(aVar6, lVar2, new TapiTransferFlowContract$Step.Review(iVar3.f299491a, iVar3.f299492b, iVar3.f299493c, iVar3.d), true, null, false, 12);
                                } else if (result instanceof wr1.h) {
                                    h.w2(lVar2, new TapiTransferFlowContract$Step.FeeBreakdown(((wr1.h) result).f299490a), popup);
                                } else {
                                    if (!(result instanceof j)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    j jVar = (j) result;
                                    h.w2(lVar2, new TapiTransferFlowContract$Step.TransferBreakdown(jVar.f299494a, jVar.f299495b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                }
                                return Unit.f186387a;
                            case 1:
                                as1.l result2 = (as1.l) obj4;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof as1.k) {
                                    aVar7.C1(u0.b(com.revolut.retail.core.navigation.a.c(gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6))), new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(((as1.k) result2).f8768a), null, null, null, 126)))));
                                } else if (result2 instanceof as1.j) {
                                    h.w2(lVar, new TapiTransferFlowContract$Step.FeeBreakdown(((as1.j) result2).f8767a), popup);
                                    Unit unit = Unit.f186387a;
                                } else {
                                    if (!(result2 instanceof as1.i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    qpk.b bVar = aVar7.o;
                                    xi0.b bVar2 = ((as1.i) result2).f8766a;
                                    xi0.b.Companion.getClass();
                                    aVar7.C1(new BridgeDestination(new FeatureCommand(dpk.a.a(bVar, bVar2, xi0.b.z, false, false))));
                                }
                                return Unit.f186387a;
                            default:
                                g result3 = (g) obj4;
                                Intrinsics.checkNotNullParameter(result3, "result");
                                if (result3 instanceof cs1.e) {
                                    qpk.b bVar3 = aVar7.o;
                                    xi0.b bVar4 = ((cs1.e) result3).f108434a;
                                    xi0.b.Companion.getClass();
                                    aVar7.C1(new BridgeDestination(new FeatureCommand(dpk.a.a(bVar3, bVar4, xi0.b.z, false, false))));
                                } else if (result3 instanceof f) {
                                    h.w2(lVar, new TapiTransferFlowContract$Step.FeeBreakdown(((f) result3).f108435a), popup);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block12, "block");
                tapiTransferBreakdownScreen.H = block12;
                return tapiTransferBreakdownScreen;
            case 19:
                com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a aVar7 = (com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a) obj3;
                CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData = (CreditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData) obj2;
                oki.g onResult = (oki.g) params;
                zx4.d result = (zx4.d) value;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof zx4.a) {
                    if (Intrinsics.f(((zx4.a) result).f326039a, "exchange_rate")) {
                        aVar7.C1(u0.b(aVar7.u.g(creditCardRepayPaymentReviewScreenContract$DomainState$ExchangeQuoteData.e)));
                    }
                } else if (Intrinsics.f(result, zx4.b.f326040a)) {
                    onResult.pop();
                } else if (!Intrinsics.f(result, zx4.c.f326041a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 20:
                TransfersPersonalisationFlowContract$InputData transfersPersonalisationFlowContract$InputData = (TransfersPersonalisationFlowContract$InputData) obj3;
                final com.revolut.feature.payments.transfers.personalisation.impl.ui.flow.a aVar8 = (com.revolut.feature.payments.transfers.personalisation.impl.ui.flow.a) obj2;
                yki.l FlowCoordinator6 = (yki.l) params;
                TransfersPersonalisationFlowContract$Step step6 = (TransfersPersonalisationFlowContract$Step) value;
                Intrinsics.checkNotNullParameter(FlowCoordinator6, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (Intrinsics.f(step6, TransfersPersonalisationFlowContract$Step.Gif.f79963a)) {
                    TransferPersonalisationGifSelector transferPersonalisationGifSelector = new TransferPersonalisationGifSelector();
                    final int i33 = 0;
                    Function1 block13 = new Function1() { // from class: t2a.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            g2a.f it10 = (g2a.f) obj4;
                            switch (i33) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    aVar8.C2(it10);
                                    break;
                                case 1:
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    aVar8.C2(it10);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    aVar8.C2(it10);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    transferPersonalisationGifSelector.H = block13;
                    return transferPersonalisationGifSelector;
                }
                if (!Intrinsics.f(step6, TransfersPersonalisationFlowContract$Step.Style.f79964a)) {
                    throw new NoWhenBranchMatchedException();
                }
                StyleScreenInput styleScreenInput = transfersPersonalisationFlowContract$InputData.f79962b;
                int i43 = t2a.j.f267526b[styleScreenInput.e.ordinal()];
                if (i43 != 1) {
                    final int i59 = 2;
                    if (i43 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    transferPersonalisationGallerySelector = new TransferPersonalisationStyleSelector(new TransferPersonalisationStyleSelectorContract$InputData(styleScreenInput));
                    Function1 block14 = new Function1() { // from class: t2a.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            g2a.f it10 = (g2a.f) obj4;
                            switch (i59) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    aVar8.C2(it10);
                                    break;
                                case 1:
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    aVar8.C2(it10);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    aVar8.C2(it10);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block14, "block");
                    transferPersonalisationGallerySelector.H = block14;
                } else {
                    transferPersonalisationGallerySelector = new TransferPersonalisationGallerySelector(new TransferPersonalisationGallerySelectorContract$InputData(styleScreenInput));
                    final int i66 = 1;
                    Function1 block15 = new Function1() { // from class: t2a.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            g2a.f it10 = (g2a.f) obj4;
                            switch (i66) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    aVar8.C2(it10);
                                    break;
                                case 1:
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    aVar8.C2(it10);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(it10, "it");
                                    aVar8.C2(it10);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block15, "block");
                    transferPersonalisationGallerySelector.H = block15;
                }
                return transferPersonalisationGallerySelector;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) value, "<unused var>");
                return ((h5b.n) ((t3b.l) obj3).f267732a).a((Data) obj2);
            case 22:
                t4h.e eVar2 = (t4h.e) obj3;
                t4h.a aVar9 = (t4h.a) obj2;
                ybl.h bondsGroup = (ybl.h) params;
                nel.n instrument = (nel.n) value;
                Intrinsics.checkNotNullParameter(bondsGroup, "bondsGroup");
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                return (!io3.h.i(instrument.f214597c) || bondsGroup.d(TradingAccountType.Gia.f105270a)) ? new AssetDetailsDestination(instrument.f214596b, aVar9.f267995c, false, "AssetDetailsDeeplink", aVar9.d, null, 36) : new BridgeDestination((NaviCommand) eVar2.f.getValue());
            case 23:
                LoanDocumentsFlowContract$InputData loanDocumentsFlowContract$InputData = (LoanDocumentsFlowContract$InputData) obj3;
                com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow.a aVar10 = (com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow.a) obj2;
                yki.l FlowCoordinator7 = (yki.l) params;
                LoanDocumentsFlowContract$Step step7 = (LoanDocumentsFlowContract$Step) value;
                Intrinsics.checkNotNullParameter(FlowCoordinator7, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof LoanDocumentsFlowContract$Step.SectionsList) {
                    LoanDocumentsController loanDocumentsController = new LoanDocumentsController(new LoanDocumentsControllerContract$InputData(loanDocumentsFlowContract$InputData.f70416a));
                    sx2.h block16 = new sx2.h(aVar10, FlowCoordinator7, 23);
                    Intrinsics.checkNotNullParameter(block16, "block");
                    loanDocumentsController.H = block16;
                    return loanDocumentsController;
                }
                if (!(step7 instanceof LoanDocumentsFlowContract$Step.SectionDocuments)) {
                    throw new NoWhenBranchMatchedException();
                }
                LoanDocumentsFlowContract$Step.SectionDocuments sectionDocuments = (LoanDocumentsFlowContract$Step.SectionDocuments) step7;
                LoanDocumentSectionController loanDocumentSectionController = new LoanDocumentSectionController(new LoanDocumentSectionControllerContract$InputData.PaymentReceipts(sectionDocuments.f70418b, sectionDocuments.f70417a));
                t5e.m block17 = new t5e.m(aVar10, 1);
                Intrinsics.checkNotNullParameter(block17, "block");
                loanDocumentSectionController.H = block17;
                return loanDocumentSectionController;
            case 24:
                w4l.f DataObservableDelegate = (w4l.f) params;
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(value, "params");
                ufm.i iVar3 = new ufm.i(new ufm.c(new pu9.a((ryc.a) obj3, value, 26), 2), new t45.a(new s06.e((v6l.y) obj2, 24, DataObservableDelegate, value), 11), 2);
                Intrinsics.checkNotNullExpressionValue(iVar3, "onErrorResumeNext(...)");
                return iVar3;
            case 25:
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar2 = (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) obj3;
                cli.y yVar = gVar2.f65434h0;
                h93.f0 f0Var2 = (h93.f0) obj2;
                oki.g onResult2 = (oki.g) params;
                r73.a result2 = (r73.a) value;
                Intrinsics.checkNotNullParameter(onResult2, "$this$onResult");
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!Intrinsics.f(result2, r73.a.f251975a)) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar2.H2(yVar, new avc.o(f0Var2, 14));
                onResult2.pop();
                c93.e eVar3 = c93.e.VIRTUAL;
                h93.j0 j0Var = f0Var2.H;
                if (j0Var == null) {
                    j0Var = h93.j0.RETAIL;
                }
                h93.j0 j0Var2 = j0Var;
                h93.l0 l0Var = f0Var2.G;
                if (l0Var == null) {
                    l0Var = h93.l0.DEBIT;
                }
                gVar2.C1(new CardDesignCatalogueDestination(null, eVar3, j0Var2, l0Var, ((t73.q0) ((j2) yVar.f22677a).getValue()).i, f0Var2.f150110a, null, null, false, true, null, null, null, f0Var2.f150114h.f13640b, null, null, null, y0.b(eVar3), false, null, null, 14933440));
                return Unit.f186387a;
            case 26:
                String str3 = (String) obj2;
                Intrinsics.checkNotNullParameter((Function1) value, "<unused var>");
                uqh.d dVar7 = ((tqh.g) obj3).f273584b;
                TextLocalisedClause errorText = new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14);
                TextLocalisedClause mainActionText = new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14);
                ComplexImage.Regular image = new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30));
                Intrinsics.checkNotNullParameter(errorText, "errorText");
                Intrinsics.checkNotNullParameter(mainActionText, "mainActionText");
                Intrinsics.checkNotNullParameter(image, "image");
                return new ChatItemsDelegate.Model(new k3(errorText, mainActionText, image, ScreenerChatWidgetParcel$Retry.f96287a, 8), str3, tqh.g.f273582c, null, gw0.l.LARGE, null, null, 131048);
            case 27:
                tt7.r rVar = (tt7.r) obj3;
                Function1 getDefaultErrorItems3 = (Function1) value;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                List list2 = (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
                hha.d dVar8 = ((tt7.i) obj2).f274244b;
                return new tt7.o(list2, k.a.f274248a, dVar8 != null ? fgk.a.a(rVar.e, dVar8) : AnimatedBackgroundType.DEFAULT.f51471a);
            case 28:
                cw5.f domain = (cw5.f) value;
                Intrinsics.checkNotNullParameter((Unit) params, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((tw5.i) obj3).f274929b.f((String) obj2, domain);
                return Unit.f186387a;
            default:
                return TextFieldSelectionManager_androidKt.addBasicTextFieldTextContextMenuComponents$lambda$0((TextFieldSelectionManager) obj3, (CoroutineScope) obj2, (TextContextMenuBuilderScope) params, (Context) value);
        }
    }

    public /* synthetic */ b(rd3.o oVar, od3.l lVar, TextLocalisedClause textLocalisedClause) {
        this.f244716a = 8;
        this.f244717b = lVar;
        this.f244718c = textLocalisedClause;
    }
}
