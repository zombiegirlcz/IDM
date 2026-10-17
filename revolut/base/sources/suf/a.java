package suf;

import aii.r;
import android.content.Context;
import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.camerakit.revolut.ui.flow.steps.camera.CameraKitCameraScreenContract$ModalStep;
import com.revolut.camerakit.revolut.ui.flow.steps.camera.bottom_sheets.ListBottomSheetController;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.id;
import com.revolut.core.ui_kit.delegates.ld;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountScreen;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoCodeDetailsInputData;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.MultibancoWithdrawalFlowContract$Step;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.amount.WithdrawalAmountScreen;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.WithdrawalCodeDetailsScreen;
import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.card_design.impl.card_design.carousel.CardDesignCarouselController;
import com.revolut.feature.card_design.impl.card_design.carousel.CardDesignCarouselScreenContract$ModalStep;
import com.revolut.feature.card_design.impl.card_design.rev_points_price_breakdown.RevPointsPriceBreakdownController;
import com.revolut.feature.card_design.impl.card_design.rev_points_price_breakdown.RevPointsPriceBreakdownControllerContract$InputData;
import com.revolut.feature.external_accounts.api.MandateApi$Toggles$VrpSetupBottomSheet;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreenContract$SingleChoiceItem;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.InvoiceScheduleSettingsScreenContract$Step;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.AllInsightsScreenContract$ModalStep;
import com.revolut.feature.onboarding.impl.exchange_global_access.ExchangeGlobalAccessArticleKeyMx;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow.ExchangeGlobalAccessFlowContract$Step;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow.TransferOnlyChatFlow;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow.TransferOnlyChatFlowContract$InputData;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.TransferOnlyChatToTransferFlowContract$Step;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.pix.impl.flow.automatico.PixAutomaticoContract$Step;
import com.revolut.feature.pix.impl.flow.automatico.screens.details.PixAutomaticoPaymentDetailsScreen;
import com.revolut.feature.pix.impl.flow.automatico.screens.details.PixAutomaticoPaymentDetailsScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.automatico.screens.past_authorisations.PixAutomaticoPastAuthorisationsScreen;
import com.revolut.feature.pix.impl.flow.automatico.screens.recurring_payments.PixAutomaticoRecurringPaymentsScreen;
import com.revolut.feature.pix.impl.flow.qr.PixQrCodeFlow;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.impl.ui.RevPointsFlowContract$Step;
import com.revolut.feature.rev_points.impl.ui.challenges.details.RevPointsChallengeDetailsScreen;
import com.revolut.feature.rev_points.impl.ui.challenges.details.RevPointsChallengeDetailsScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.challenges.home.RevPointsChallengesHomeScreen;
import com.revolut.feature.rev_points.impl.ui.challenges.home.RevPointsChallengesHomeScreenContract$Action;
import com.revolut.feature.rev_points.impl.ui.challenges.home.RevPointsChallengesHomeScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.earn.RevPointsEarnScreen;
import com.revolut.feature.rev_points.impl.ui.earn.RevPointsEarnScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.earn.RevPointsEarnScreenContract$PendingAction;
import com.revolut.feature.rev_points.impl.ui.learn.RevPointsLearnScreen;
import com.revolut.feature.rev_points.impl.ui.learn.RevPointsLearnScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.points_expiry.home.RevPointsExpiryHomeScreen;
import com.revolut.feature.rev_points.impl.ui.redeem.RevPointsRedeemScreen;
import com.revolut.feature.rev_points.impl.ui.redeem.RevPointsRedeemScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.transactions.details.RevPointsTransactionDetailsScreen;
import com.revolut.feature.rev_points.impl.ui.transactions.details.RevPointsTransactionDetailsScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlow;
import com.revolut.feature.rev_points.impl.ui.transactions.flow.TransactionDetailsPagerFlowContract$InputData;
import com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreen;
import com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.transactions.related.RevPointsRelatedTransactionsBottomSheetController;
import com.revolut.feature.rev_points.impl.ui.transactions.related.RevPointsRelatedTransactionsBottomSheetControllerContract$InputData;
import com.revolut.feature.rev_points.impl.ui.upsell.select_plan.SelectPlanUpsellScreen;
import com.revolut.feature.rev_points.models.ChallengeId;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.feature.statements.impl.ui.crypto_statement.flow.CryptoStatementFlowContract$Step;
import com.revolut.feature.statements.impl.ui.crypto_statement.screen.CryptoStatementScreen;
import com.revolut.feature.store.api.R$string;
import com.revolut.feature.store.impl.ui.brand_detail.screen.earn.StoreBrandDetailEarnScreenContract$ModalStep;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.PerformanceTrackerFlowContract$InputData;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.PerformanceTrackerFlowContract$Page;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms.PerformanceTrackerTermsController;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms.PerformanceTrackerTermsControllerContract$InputData;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.underlying_assets.PerformanceTrackerUnderlyingAssetsController;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.underlying_assets.PerformanceTrackerUnderlyingAssetsControllerContract$InputData;
import com.revolut.feature.subaccount.impl.ui.create.flow.group.ContactsPickerFlow;
import com.revolut.feature.subaccount.impl.ui.create.flow.group.ContactsPickerFlowContract$InputData;
import com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$Step;
import com.revolut.feature.subaccount.impl.ui.create.screen.info.SubaccountInfoPickerScreen;
import com.revolut.feature.subaccount.impl.ui.create.screen.info.SubaccountInfoPickerScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.currency.SelectCurrencyOptionScreen;
import com.revolut.feature.subaccount.impl.ui.edit_name.SubAccountEditNameContract$InputData;
import com.revolut.feature.subaccount.impl.ui.edit_name.SubAccountEditNameScreen;
import com.revolut.feature.subaccount.impl.ui.qr_link.SubaccountQRLinkScreenContract$ModalStep;
import com.revolut.feature.topup_screen.api.descriptor.EditStoredMethodLabelDescriptor$InputData;
import com.revolut.feature.topup_screen.api.model.StoredMethod;
import com.revolut.feature.topup_screen.impl.flows.stored_method.flow.StoredMethodFlowContract$Step;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.details.StoredMethodDetailsScreen;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.details.StoredMethodDetailsScreenContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.india.details.IndiaStoredMethodDetailsScreen;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.india.details.IndiaStoredMethodDetailsScreenContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup.fee_bottom_sheet.TopUpFeesBottomSheetContract$ModalStep;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.buy_in_price.BuyInPriceScreen;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_details.TravelFlightsBookingDetailsScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.booking_details.TravelFlightsBookingDetailsScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.checkin.TravelFlightsCheckInScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.checkin.TravelFlightsCheckInScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.manage_booking.TravelFlightsManageBookingScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.manage_booking.TravelFlightsManageBookingScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.post_booking.TravelFlightsPostBookingScreenContract$Tab;
import com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.TimelineQuestionScreenContract$ModalStep;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.AsftTerminalSelectionScreenContract$ModalStep;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.price_info.AsftTerminalPriceInfoScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.price_info.AsftTerminalPriceInfoScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.scheme.SchemeLoungesFlowContract$Step;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.SchemeLoungesHomeScreen;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import com.revolut.retail.feature.balance.picker.impl.new_picker.CurrencyChooserFlow;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputReference;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.ui_kit.card_3d_scene_proxy.errors.CardSceneUnavailable;
import grl.k9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import kz9.d;
import kz9.e;
import m1c.e0;
import mii.k;
import nyb.m0;
import nyb.n0;
import oki.h;
import q09.g0;
import q18.j;
import qua.p;
import rp0.f1;
import sma.f;
import sx2.v0;
import t44.q;
import t5e.m;
import t5e.n;
import t5e.o;
import t73.w2;
import tof.a3;
import vkm.j2;
import we6.a1;
import we6.q0;
import we6.s0;
import wxe.i0;
import wxe.s;
import wxe.t;
import wxe.v;
import wxe.x;
import wxe.y;
import ybh.c0;
import yki.l;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f265744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f265745b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f265744a = i;
        this.f265745b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        com.revolut.feature.topup_screen.impl.flows.topup.fee_bottom_sheet.a aVar = (com.revolut.feature.topup_screen.impl.flows.topup.fee_bottom_sheet.a) this.f265745b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        TopUpFeesBottomSheetContract$ModalStep step = (TopUpFeesBottomSheetContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof TopUpFeesBottomSheetContract$ModalStep.BreakdownInfo)) {
            throw new NoWhenBranchMatchedException();
        }
        sye.a aVar2 = aVar.o;
        TopUpFeesBottomSheetContract$ModalStep.BreakdownInfo breakdownInfo = (TopUpFeesBottomSheetContract$ModalStep.BreakdownInfo) step;
        String title = breakdownInfo.f90825a;
        String description = breakdownInfo.f90826b;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        lw0.a aVar3 = new lw0.a(new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(description, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Topup;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar3, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }

    private final Object b(Object obj2, Object obj3) {
        final com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.a aVar = (com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.a) this.f265745b;
        l FlowCoordinator = (l) obj2;
        TransferOnlyChatToTransferFlowContract$Step step = (TransferOnlyChatToTransferFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof TransferOnlyChatToTransferFlowContract$Step.ChatScreen) {
            TransferOnlyChatFlow transferOnlyChatFlow = new TransferOnlyChatFlow(new TransferOnlyChatFlowContract$InputData(((TransferOnlyChatToTransferFlowContract$Step.ChatScreen) step).f79808a, n0a.c.DESCRIPTOR), aVar.f79810q);
            final int i = 0;
            Function1 block = new Function1() { // from class: t0a.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            e output = (e) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof d;
                            com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.a aVar2 = aVar;
                            if (z) {
                                d dVar = (d) output;
                                yki.a aVar3 = aVar2.f79811r;
                                ChatTransferRecipient chatTransferRecipient = dVar.f191077a;
                                if (chatTransferRecipient instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                                    ChatTransferRecipient.BeneficiaryRecipient beneficiaryRecipient = (ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient;
                                    h.t2(aVar2, aVar3, new TransferOnlyChatToTransferFlowContract$Step.BankTransfer(beneficiaryRecipient, beneficiaryRecipient.f79717b), true, null, false, 12);
                                } else if (chatTransferRecipient instanceof ChatTransferRecipient.CardRecipient) {
                                    h.t2(aVar2, aVar3, new TransferOnlyChatToTransferFlowContract$Step.CardTransfer((ChatTransferRecipient.CardRecipient) chatTransferRecipient, null), true, null, false, 12);
                                } else {
                                    aVar2.l2(new f(aVar2, chatTransferRecipient, dVar, (Continuation) null, 5), new yi5.b(26));
                                }
                            } else {
                                if (!(output instanceof kz9.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.C1(u0.b(aVar2.f79809p.a(((kz9.c) output).f191076a)));
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.a aVar4 = aVar;
                            yz9.c cVar = aVar4.f79810q;
                            d2k.f result = (d2k.f) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof d2k.e) {
                                a3 a3Var = ((d2k.e) result).f110877a;
                                cVar.b(a3Var);
                                aVar4.I2(a3Var.f272579a);
                            } else if (result instanceof d2k.d) {
                                cVar.b(null);
                                aVar4.I2(null);
                            } else {
                                if (!Intrinsics.f(result, d2k.b.f110872a) && !Intrinsics.f(result, d2k.c.f110873a)) {
                                    if (result instanceof d2k.a) {
                                        throw new IllegalStateException("Transfer-only chat-to-transfer flow doesn't support bank transfer data capture");
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar4.I2(null);
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.a aVar5 = aVar;
                            yz9.c cVar2 = aVar5.f79810q;
                            cqa.e result2 = (cqa.e) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 instanceof cqa.d) {
                                a3 a3Var2 = ((cqa.d) result2).f108063a;
                                cVar2.b(a3Var2);
                                aVar5.I2(a3Var2.f272579a);
                            } else if (result2 instanceof cqa.c) {
                                cVar2.b(null);
                                aVar5.I2(null);
                            } else {
                                if (!Intrinsics.f(result2, cqa.b.f108061a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar5.I2(null);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            transferOnlyChatFlow.H = block;
            return transferOnlyChatFlow;
        }
        if (step instanceof TransferOnlyChatToTransferFlowContract$Step.BankTransfer) {
            TransferOnlyChatToTransferFlowContract$Step.BankTransfer bankTransfer = (TransferOnlyChatToTransferFlowContract$Step.BankTransfer) step;
            f5j.a aVar2 = bankTransfer.f79804a.f79716a;
            TransferFlowType.Default r92 = TransferFlowType.Default.f92257b;
            TransferMoneyPocket transferMoneyPocket = bankTransfer.f79805b;
            if (transferMoneyPocket == null) {
                transferMoneyPocket = new TransferMoneyPocket(null, null, 3);
            }
            ViewController viewControllerE1 = aVar.e1(new com.revolut.retail.feature.payments.bank_transfer.api.navigation.a(new BankTransferInputData(aVar2, (TransferFlowType) r92, (BankTransferInputReference) null, transferMoneyPocket, m1l.a.SCHEDULE_ENABLED, new TransferScheduleData(0L, (jli.c) null, 7), (p) null, (FlowExtras) null, (Map) null, (UltimateDebtor) null, (kq2.g) null, (Set) null, false, (ScannedBillDetails) null, (TransferAppSource.AIR_WIDGET) null, 57216), null, 2));
            final int i2 = 1;
            Function1 block2 = new Function1() { // from class: t0a.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            e output = (e) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof d;
                            com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.a aVar22 = aVar;
                            if (z) {
                                d dVar = (d) output;
                                yki.a aVar3 = aVar22.f79811r;
                                ChatTransferRecipient chatTransferRecipient = dVar.f191077a;
                                if (chatTransferRecipient instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                                    ChatTransferRecipient.BeneficiaryRecipient beneficiaryRecipient = (ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient;
                                    h.t2(aVar22, aVar3, new TransferOnlyChatToTransferFlowContract$Step.BankTransfer(beneficiaryRecipient, beneficiaryRecipient.f79717b), true, null, false, 12);
                                } else if (chatTransferRecipient instanceof ChatTransferRecipient.CardRecipient) {
                                    h.t2(aVar22, aVar3, new TransferOnlyChatToTransferFlowContract$Step.CardTransfer((ChatTransferRecipient.CardRecipient) chatTransferRecipient, null), true, null, false, 12);
                                } else {
                                    aVar22.l2(new f(aVar22, chatTransferRecipient, dVar, (Continuation) null, 5), new yi5.b(26));
                                }
                            } else {
                                if (!(output instanceof kz9.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar22.C1(u0.b(aVar22.f79809p.a(((kz9.c) output).f191076a)));
                            }
                            return Unit.f186387a;
                        case 1:
                            com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.a aVar4 = aVar;
                            yz9.c cVar = aVar4.f79810q;
                            d2k.f result = (d2k.f) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof d2k.e) {
                                a3 a3Var = ((d2k.e) result).f110877a;
                                cVar.b(a3Var);
                                aVar4.I2(a3Var.f272579a);
                            } else if (result instanceof d2k.d) {
                                cVar.b(null);
                                aVar4.I2(null);
                            } else {
                                if (!Intrinsics.f(result, d2k.b.f110872a) && !Intrinsics.f(result, d2k.c.f110873a)) {
                                    if (result instanceof d2k.a) {
                                        throw new IllegalStateException("Transfer-only chat-to-transfer flow doesn't support bank transfer data capture");
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar4.I2(null);
                            }
                            return Unit.f186387a;
                        default:
                            com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.a aVar5 = aVar;
                            yz9.c cVar2 = aVar5.f79810q;
                            cqa.e result2 = (cqa.e) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 instanceof cqa.d) {
                                a3 a3Var2 = ((cqa.d) result2).f108063a;
                                cVar2.b(a3Var2);
                                aVar5.I2(a3Var2.f272579a);
                            } else if (result2 instanceof cqa.c) {
                                cVar2.b(null);
                                aVar5.I2(null);
                            } else {
                                if (!Intrinsics.f(result2, cqa.b.f108061a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar5.I2(null);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            viewControllerE1.H = block2;
            return viewControllerE1;
        }
        if (!(step instanceof TransferOnlyChatToTransferFlowContract$Step.CardTransfer)) {
            throw new NoWhenBranchMatchedException();
        }
        TransferOnlyChatToTransferFlowContract$Step.CardTransfer cardTransfer = (TransferOnlyChatToTransferFlowContract$Step.CardTransfer) step;
        PushToCardTransferInputData.Companion companion = PushToCardTransferInputData.INSTANCE;
        CardOwner cardOwner = cardTransfer.f79806a.f79718a;
        TransferMoneyPocket transferMoneyPocket2 = cardTransfer.f79807b;
        if (transferMoneyPocket2 == null) {
            transferMoneyPocket2 = new TransferMoneyPocket(null, null, 3);
        }
        ViewController viewControllerE12 = aVar.e1(new cqa.a(PushToCardTransferInputData.Companion.a(companion, cardOwner, transferMoneyPocket2, TransferFlowType.Default.f92257b, 8)));
        final int i3 = 2;
        Function1 block3 = new Function1() { // from class: t0a.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i3) {
                    case 0:
                        e output = (e) obj4;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z = output instanceof d;
                        com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.a aVar22 = aVar;
                        if (z) {
                            d dVar = (d) output;
                            yki.a aVar3 = aVar22.f79811r;
                            ChatTransferRecipient chatTransferRecipient = dVar.f191077a;
                            if (chatTransferRecipient instanceof ChatTransferRecipient.BeneficiaryRecipient) {
                                ChatTransferRecipient.BeneficiaryRecipient beneficiaryRecipient = (ChatTransferRecipient.BeneficiaryRecipient) chatTransferRecipient;
                                h.t2(aVar22, aVar3, new TransferOnlyChatToTransferFlowContract$Step.BankTransfer(beneficiaryRecipient, beneficiaryRecipient.f79717b), true, null, false, 12);
                            } else if (chatTransferRecipient instanceof ChatTransferRecipient.CardRecipient) {
                                h.t2(aVar22, aVar3, new TransferOnlyChatToTransferFlowContract$Step.CardTransfer((ChatTransferRecipient.CardRecipient) chatTransferRecipient, null), true, null, false, 12);
                            } else {
                                aVar22.l2(new f(aVar22, chatTransferRecipient, dVar, (Continuation) null, 5), new yi5.b(26));
                            }
                        } else {
                            if (!(output instanceof kz9.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar22.C1(u0.b(aVar22.f79809p.a(((kz9.c) output).f191076a)));
                        }
                        return Unit.f186387a;
                    case 1:
                        com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.a aVar4 = aVar;
                        yz9.c cVar = aVar4.f79810q;
                        d2k.f result = (d2k.f) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result instanceof d2k.e) {
                            a3 a3Var = ((d2k.e) result).f110877a;
                            cVar.b(a3Var);
                            aVar4.I2(a3Var.f272579a);
                        } else if (result instanceof d2k.d) {
                            cVar.b(null);
                            aVar4.I2(null);
                        } else {
                            if (!Intrinsics.f(result, d2k.b.f110872a) && !Intrinsics.f(result, d2k.c.f110873a)) {
                                if (result instanceof d2k.a) {
                                    throw new IllegalStateException("Transfer-only chat-to-transfer flow doesn't support bank transfer data capture");
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar4.I2(null);
                        }
                        return Unit.f186387a;
                    default:
                        com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.a aVar5 = aVar;
                        yz9.c cVar2 = aVar5.f79810q;
                        cqa.e result2 = (cqa.e) obj4;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        if (result2 instanceof cqa.d) {
                            a3 a3Var2 = ((cqa.d) result2).f108063a;
                            cVar2.b(a3Var2);
                            aVar5.I2(a3Var2.f272579a);
                        } else if (result2 instanceof cqa.c) {
                            cVar2.b(null);
                            aVar5.I2(null);
                        } else {
                            if (!Intrinsics.f(result2, cqa.b.f108061a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar5.I2(null);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block3, "block");
        viewControllerE12.H = block3;
        return viewControllerE12;
    }

    private final Object c(Object obj2, Object obj3) {
        com.revolut.feature.store.impl.ui.brand_detail.screen.earn.a aVar = (com.revolut.feature.store.impl.ui.brand_detail.screen.earn.a) this.f265745b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        StoreBrandDetailEarnScreenContract$ModalStep step = (StoreBrandDetailEarnScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof StoreBrandDetailEarnScreenContract$ModalStep.Countries)) {
            throw new NoWhenBranchMatchedException();
        }
        p2e.a aVar2 = aVar.f88682t;
        List countryCodes = ((StoreBrandDetailEarnScreenContract$ModalStep.Countries) step).f88677a;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
        lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.store_mega_offer_details_campaign_modal_countries_title, null, null, 14), null, null, null, false, 30);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.store_mega_offer_details_campaign_modal_countries_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        List<String> listU = d0.U(countryCodes);
        ArrayList arrayList = new ArrayList(w.t(listU, 10));
        for (String str : listU) {
            wi0.b.Companion.getClass();
            boolean z = false;
            arrayList.add(new eii.l((Clause) new CountryClause(wi0.a.a(str), null), (Clause) null, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new CountryImage(str, (Integer) null, (ez0.e) null, 14), z, z, 6), false, false, (RowDelegate.Model.c) null, (Object) null, 488));
        }
        k9 k9Var = k9.Shops;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new RowActionsBottomSheetController(new eii.c(aVar3, eVar, arrayList, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    private final Object d(Object obj2, Object obj3) {
        TransferAmountScreen transferAmountScreen = (TransferAmountScreen) this.f265745b;
        CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
        CenteredAmountView field = (CenteredAmountView) obj3;
        KProperty[] kPropertyArr = TransferAmountScreen.c0;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(field, "field");
        MaskedTextInputEditText editText = field.getEditText();
        Object obj4 = data.f51981p;
        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.transfer.core.api.mapper.TransferAmountInputPayload");
        return new zp0.d(editText, ((yof.b) obj4).f315672a, (u80.d) transferAmountScreen.P.getValue(), null, null, false, false, 0, false, null, 1944);
    }

    private final Object e(Object obj2, Object obj3) {
        t44.f fVar = (t44.f) this.f265745b;
        Function1 getDefaultErrorItems = (Function1) obj3;
        Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
        return q.a(fVar, false, (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)));
    }

    private final Object g(Object obj2, Object obj3) {
        PerformanceTrackerFlowContract$InputData performanceTrackerFlowContract$InputData = ((o) this.f265745b).o;
        ali.b PagerCoordinator = (ali.b) obj2;
        PerformanceTrackerFlowContract$Page page = (PerformanceTrackerFlowContract$Page) obj3;
        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
        Intrinsics.checkNotNullParameter(page, "page");
        int i = n.f268073a[page.ordinal()];
        if (i == 1) {
            return new PerformanceTrackerUnderlyingAssetsController(new PerformanceTrackerUnderlyingAssetsControllerContract$InputData(performanceTrackerFlowContract$InputData.f88905a));
        }
        if (i == 2) {
            return new PerformanceTrackerTermsController(new PerformanceTrackerTermsControllerContract$InputData(performanceTrackerFlowContract$InputData.f88905a));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object h(Object obj2, Object obj3) {
        com.revolut.feature.travel.flights.impl.ui.screen.post_booking.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.post_booking.b) this.f265745b;
        String str = bVar.f93393p;
        ali.b PagerCoordinator = (ali.b) obj2;
        TravelFlightsPostBookingScreenContract$Tab tab2 = (TravelFlightsPostBookingScreenContract$Tab) obj3;
        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
        Intrinsics.checkNotNullParameter(tab2, "tab");
        if (Intrinsics.f(tab2, TravelFlightsPostBookingScreenContract$Tab.Overview.f93392a)) {
            return new TravelFlightsBookingDetailsScreen(new TravelFlightsBookingDetailsScreenContract$InputData(str));
        }
        if (Intrinsics.f(tab2, TravelFlightsPostBookingScreenContract$Tab.CheckIn.f93390a)) {
            return new TravelFlightsCheckInScreen(new TravelFlightsCheckInScreenContract$InputData(str));
        }
        if (!Intrinsics.f(tab2, TravelFlightsPostBookingScreenContract$Tab.Manage.f93391a)) {
            throw new NoWhenBranchMatchedException();
        }
        TravelFlightsManageBookingScreen travelFlightsManageBookingScreen = new TravelFlightsManageBookingScreen(new TravelFlightsManageBookingScreenContract$InputData(str));
        m block = new m(bVar, 2);
        Intrinsics.checkNotNullParameter(block, "block");
        travelFlightsManageBookingScreen.H = block;
        return travelFlightsManageBookingScreen;
    }

    private final Object i(Object obj2, Object obj3) {
        w2 w2Var = (w2) this.f265745b;
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        return w2Var.a();
    }

    private final Object j(Object obj2, Object obj3) {
        com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar = (com.revolut.feature.subaccount.impl.ui.create.flow.main.c) this.f265745b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        CreateSubaccountFlowContract$Step step = (CreateSubaccountFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CreateSubaccountFlowContract$Step.InfoPickerScreen) {
            CreateSubaccountFlowContract$Step.InfoPickerScreen infoPickerScreen = (CreateSubaccountFlowContract$Step.InfoPickerScreen) step;
            SubaccountInfoPickerScreen subaccountInfoPickerScreen = new SubaccountInfoPickerScreen(new SubaccountInfoPickerScreenContract$InputData(infoPickerScreen.f89024a, infoPickerScreen.f89025b));
            t7e.c cVar2 = new t7e.c(cVar, 3);
            Intrinsics.checkNotNullParameter(cVar2, "<set-?>");
            subaccountInfoPickerScreen.H = cVar2;
            return subaccountInfoPickerScreen;
        }
        if (step instanceof CreateSubaccountFlowContract$Step.ChooseCurrencyType) {
            SelectCurrencyOptionScreen selectCurrencyOptionScreen = new SelectCurrencyOptionScreen();
            t7e.c cVar3 = new t7e.c(cVar, 1);
            Intrinsics.checkNotNullParameter(cVar3, "<set-?>");
            selectCurrencyOptionScreen.H = cVar3;
            return selectCurrencyOptionScreen;
        }
        if (step instanceof CreateSubaccountFlowContract$Step.ChooseCurrency) {
            CurrencyChooserFlow currencyChooserFlowA = cVar.f89040t.a(new CurrencyChooserFlowDestination.InputData(new CurrencyChooserFlowDestination.StartType.CurrencyChooser(null, null, null, ((CreateSubaccountFlowContract$Step.ChooseCurrency) step).f89020a, new TextLocalisedClause(com.revolut.retail.feature.balance.picker.api.R$string.balance_picker_currency_title, null, null, 14), null, 39)));
            t7e.c cVar4 = new t7e.c(cVar, 2);
            Intrinsics.checkNotNullParameter(cVar4, "<set-?>");
            currencyChooserFlowA.J = cVar4;
            return currencyChooserFlowA;
        }
        if (step instanceof CreateSubaccountFlowContract$Step.ContactsSelectorScreen) {
            ContactsPickerFlow contactsPickerFlow = new ContactsPickerFlow(new ContactsPickerFlowContract$InputData(f0.f322471a));
            su0.c block = new su0.c(1, cVar, com.revolut.feature.subaccount.impl.ui.create.flow.main.c.class, "handleContactsPickerResult", "handleContactsPickerResult(Lcom/revolut/feature/subaccount/impl/ui/create/flow/group/ContactsPickerFlowContract$OutputData;)V", 0, 13);
            Intrinsics.checkNotNullParameter(block, "block");
            contactsPickerFlow.H = block;
            return contactsPickerFlow;
        }
        if (!(step instanceof CreateSubaccountFlowContract$Step.ProductArticle.Intro) && !(step instanceof CreateSubaccountFlowContract$Step.ProductArticle.Subaccount)) {
            if (!(step instanceof CreateSubaccountFlowContract$Step.TaxPocketScreen)) {
                if (step instanceof CreateSubaccountFlowContract$Step.ChooseNewTypeScreen) {
                    return cVar.e1(new nf1.a(qf1.c.ORGANISE));
                }
                if (!(step instanceof CreateSubaccountFlowContract$Step.PendingJointAccount)) {
                    throw new NoWhenBranchMatchedException();
                }
                ActionsBottomSheetController actionsBottomSheetControllerA = cVar.f89042x.a(h38.d.JOINT_SUBACCOUNT);
                actionsBottomSheetControllerA.l2(new dld.c(cVar, LazyFlowCoordinator, 10));
                return actionsBottomSheetControllerA;
            }
            CreateSubaccountFlowContract$Step.TaxPocketScreen taxPocketScreen = (CreateSubaccountFlowContract$Step.TaxPocketScreen) step;
            ViewController viewControllerE1 = cVar.e1(new hr6.c(taxPocketScreen.f89030a, taxPocketScreen.f89032c, taxPocketScreen.f89031b));
            com.revolut.feature.subaccount.impl.ui.create.flow.main.a block2 = new com.revolut.feature.subaccount.impl.ui.create.flow.main.a(1, 0, com.revolut.feature.subaccount.impl.ui.create.flow.main.c.class, cVar, "handleCreateTaxPocketResult", "handleCreateTaxPocketResult(Lcom/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureDescriptor$CreateTaxPocketDescriptor$OutputData;)V");
            Intrinsics.checkNotNullParameter(block2, "block");
            viewControllerE1.H = block2;
            return viewControllerE1;
        }
        return cVar.K2((CreateSubaccountFlowContract$Step.ProductArticle) step);
    }

    private final Object k(Object obj2, Object obj3) {
        com.revolut.feature.apm.multibanco.impl.ui.withdrawal.a aVar = (com.revolut.feature.apm.multibanco.impl.ui.withdrawal.a) this.f265745b;
        l FlowCoordinator = (l) obj2;
        MultibancoWithdrawalFlowContract$Step step = (MultibancoWithdrawalFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof MultibancoWithdrawalFlowContract$Step.Amount)) {
            if (step instanceof MultibancoWithdrawalFlowContract$Step.Details) {
                return new WithdrawalCodeDetailsScreen(new MultibancoCodeDetailsInputData.ByCode(((MultibancoWithdrawalFlowContract$Step.Details) step).f62631a));
            }
            throw new NoWhenBranchMatchedException();
        }
        WithdrawalAmountScreen withdrawalAmountScreen = new WithdrawalAmountScreen(aVar.o);
        m block = new m(aVar, 14);
        Intrinsics.checkNotNullParameter(block, "block");
        withdrawalAmountScreen.H = block;
        return withdrawalAmountScreen;
    }

    private final Object l(Object obj2, Object obj3) {
        com.revolut.feature.subaccount.impl.ui.qr_link.a aVar = (com.revolut.feature.subaccount.impl.ui.qr_link.a) this.f265745b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        SubaccountQRLinkScreenContract$ModalStep step = (SubaccountQRLinkScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof SubaccountQRLinkScreenContract$ModalStep.ChangeName) {
            SubaccountQRLinkScreenContract$ModalStep.ChangeName changeName = (SubaccountQRLinkScreenContract$ModalStep.ChangeName) step;
            SubAccountEditNameScreen subAccountEditNameScreen = new SubAccountEditNameScreen(new SubAccountEditNameContract$InputData(changeName.f89105a, changeName.f89106b, changeName.f89107c, true));
            m block = new m(aVar, 15);
            Intrinsics.checkNotNullParameter(block, "block");
            subAccountEditNameScreen.H = block;
            return subAccountEditNameScreen;
        }
        if (!(step instanceof SubaccountQRLinkScreenContract$ModalStep.ChangeWallpaper)) {
            throw new NoWhenBranchMatchedException();
        }
        em2.b.Companion.getClass();
        ViewController viewControllerE1 = aVar.e1(new cm2.c(em2.a.a()));
        t8e.c block2 = new t8e.c(aVar, step, 0);
        Intrinsics.checkNotNullParameter(block2, "block");
        viewControllerE1.H = block2;
        return viewControllerE1;
    }

    private final Object m(Object obj2, Object obj3) {
        t95.e eVar = (t95.e) this.f265745b;
        List facilities = (List) obj3;
        Intrinsics.checkNotNullParameter((t95.d) obj2, "<unused var>");
        Intrinsics.checkNotNullParameter(facilities, "facilities");
        eVar.f268952b.b(t95.c.f268949a, facilities);
        return Unit.f186387a;
    }

    private final Object n(Object obj2, Object obj3) {
        com.revolut.feature.onboarding.impl.exchange_global_access.flow.a aVar = (com.revolut.feature.onboarding.impl.exchange_global_access.flow.a) this.f265745b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        ExchangeGlobalAccessFlowContract$Step step = (ExchangeGlobalAccessFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, ExchangeGlobalAccessFlowContract$Step.Article.f78264a)) {
            throw new NoWhenBranchMatchedException();
        }
        return aVar.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(new ExchangeGlobalAccessArticleKeyMx(0))), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, aVar.o.f78263c, null, false, 20));
    }

    private final Object o(Object obj2, Object obj3) {
        com.revolut.feature.pix.impl.flow.automatico.a aVar = (com.revolut.feature.pix.impl.flow.automatico.a) this.f265745b;
        l FlowCoordinator = (l) obj2;
        PixAutomaticoContract$Step step = (PixAutomaticoContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof PixAutomaticoContract$Step.RecurringPayments) {
            PixAutomaticoRecurringPaymentsScreen pixAutomaticoRecurringPaymentsScreen = new PixAutomaticoRecurringPaymentsScreen();
            t8e.c block = new t8e.c(aVar, FlowCoordinator, 3);
            Intrinsics.checkNotNullParameter(block, "block");
            pixAutomaticoRecurringPaymentsScreen.H = block;
            return pixAutomaticoRecurringPaymentsScreen;
        }
        if (step instanceof PixAutomaticoContract$Step.PastAuthorisations) {
            PixAutomaticoPastAuthorisationsScreen pixAutomaticoPastAuthorisationsScreen = new PixAutomaticoPastAuthorisationsScreen();
            baa.c block2 = new baa.c(aVar, FlowCoordinator, 20);
            Intrinsics.checkNotNullParameter(block2, "block");
            pixAutomaticoPastAuthorisationsScreen.H = block2;
            return pixAutomaticoPastAuthorisationsScreen;
        }
        if (step instanceof PixAutomaticoContract$Step.PaymentDetails) {
            return new PixAutomaticoPaymentDetailsScreen(new PixAutomaticoPaymentDetailsScreenContract$InputData(((PixAutomaticoContract$Step.PaymentDetails) step).f80607a));
        }
        if (step instanceof PixAutomaticoContract$Step.OpenQrScanner) {
            return new PixQrCodeFlow();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.revolut.core.ui_kit.delegates.jd, com.revolut.core.ui_kit.models.Clause, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r1v214, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws CardSceneUnavailable {
        ActionsBottomSheetController actionsBottomSheetController;
        Object next;
        String str;
        Object obj4;
        eub.l q0Var;
        RevPointsEarnScreenContract$PendingAction openPointsBuying;
        RevPointsEarnScreenContract$PendingAction revPointsEarnScreenContract$PendingAction;
        qd0.b bVarN;
        int i = this.f265744a;
        int i2 = 23;
        final int i3 = 2;
        final int i5 = 1;
        final int i6 = 0;
        fVar = null;
        ihm.f fVar = null;
        Object obj5 = this.f265745b;
        switch (i) {
            case 0:
                List ticket = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(ticket, "ticket");
                ((h) obj5).f265755c.f("USER_TRANSIT_TICKETS_KEY", ticket);
                return Unit.f186387a;
            case 1:
                final com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.b bVar = (com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.b) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                final TimelineQuestionScreenContract$ModalStep step = (TimelineQuestionScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof TimelineQuestionScreenContract$ModalStep.StartDatePicker) {
                    TimelineQuestionScreenContract$ModalStep.StartDatePicker startDatePicker = (TimelineQuestionScreenContract$ModalStep.StartDatePicker) step;
                    SimpleViewController simpleViewControllerA = bVar.f96574q.a(startDatePicker.f96568b, startDatePicker.f96569c, startDatePicker.d, startDatePicker.e, startDatePicker.f, startDatePicker.f96570g);
                    Function1 block = new Function1() { // from class: suh.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    return com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.b.J2(bVar, step, (r) obj6);
                                default:
                                    return com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.b.K2(bVar, step, (r) obj6);
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    simpleViewControllerA.H = block;
                    return simpleViewControllerA;
                }
                if (!(step instanceof TimelineQuestionScreenContract$ModalStep.EndDatePicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                TimelineQuestionScreenContract$ModalStep.EndDatePicker endDatePicker = (TimelineQuestionScreenContract$ModalStep.EndDatePicker) step;
                SimpleViewController simpleViewControllerA2 = bVar.f96574q.a(endDatePicker.f96564b, endDatePicker.f96565c, endDatePicker.d, endDatePicker.e, endDatePicker.f, endDatePicker.f96566g);
                Function1 block2 = new Function1() { // from class: suh.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i5) {
                            case 0:
                                return com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.b.J2(bVar, step, (r) obj6);
                            default:
                                return com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.b.K2(bVar, step, (r) obj6);
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block2, "block");
                simpleViewControllerA2.H = block2;
                return simpleViewControllerA2;
            case 2:
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.b bVar2 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.b) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AsftTerminalSelectionScreenContract$ModalStep step2 = (AsftTerminalSelectionScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (Intrinsics.f(step2, AsftTerminalSelectionScreenContract$ModalStep.RevPointsInfo.f98873a)) {
                    return bVar2.e1(new hub.c(e0.ASFT));
                }
                if (step2 instanceof AsftTerminalSelectionScreenContract$ModalStep.AboutPriceDialog) {
                    AsftTerminalSelectionScreenContract$ModalStep.AboutPriceDialog aboutPriceDialog = (AsftTerminalSelectionScreenContract$ModalStep.AboutPriceDialog) step2;
                    return new AsftTerminalPriceInfoScreen(new AsftTerminalPriceInfoScreenContract$InputData(aboutPriceDialog.f98869a, aboutPriceDialog.f98870b));
                }
                if (!(step2 instanceof AsftTerminalSelectionScreenContract$ModalStep.FreeAccessInfo)) {
                    throw new NoWhenBranchMatchedException();
                }
                uui.a aVar = bVar2.f98878s;
                AsftTerminalSelectionScreenContract$ModalStep.FreeAccessInfo freeAccessInfo = (AsftTerminalSelectionScreenContract$ModalStep.FreeAccessInfo) step2;
                String planName = freeAccessInfo.f98871a;
                boolean z = freeAccessInfo.f98872b;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(planName, "planName");
                PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("PROMPT_CONTENT_LIST_ID", new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_terminals_prompt_title, u.c(planName), null, 12), z ? new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_terminals_prompt_subtitle_booking_alternative, null, null, 14) : new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_terminals_prompt_subtitle_tap, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(new GlyphImage(R$drawable.uikit_icn_24_check_success, null, null, 6), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.e, false, (String) null, 54), z ? new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_terminals_prompt_book_passes, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58726b, false, (String) null, 54) : null, null, null, null, null, null, null, null, null, null, null, 2095536), null, false, false, null, 30));
                sl5.a block3 = new sl5.a(bVar2, i2);
                Intrinsics.checkNotNullParameter(block3, "block");
                promptMarketingScreen.H = block3;
                return promptMarketingScreen;
            case 3:
                swi.c cVar = (swi.c) obj5;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                SchemeLoungesFlowContract$Step step3 = (SchemeLoungesFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!(step3 instanceof SchemeLoungesFlowContract$Step.UnlockLounges)) {
                    if (step3 instanceof SchemeLoungesFlowContract$Step.Home) {
                        return new SchemeLoungesHomeScreen();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                cVar.f266227p.getClass();
                String str2 = null;
                PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("UNLOCK_LOUNGES_PROMPT_ID", new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_scheme_unlock_lounges_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_scheme_unlock_lounges_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(new UrlVideo("https://assets.revolut.com/mobile/lounges/scheme/unlock_prompt_background.mp4", (String) null, false, (oz0.b) null, false, (oz0.c) null, 122), str, str, 6), PromptMarketingContentDelegate.Model.BackgroundType.Default.f53100a, pd.REGULAR, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ld.CAPTION, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_scheme_unlock_lounges_button_title, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, str2, 62), false ? 1 : 0, id.VERTICAL, null, str2, null, null, null, null, null, null, null, 2094336), null, false, false, null, 30));
                su0.c block4 = new su0.c(1, cVar, swi.c.class, "handleUnlockLoungesResult", "handleUnlockLoungesResult(Lcom/revolut/feature/full_screen_prompt/PromptMarketingScreenContract$Output;)V", 0, 4);
                Intrinsics.checkNotNullParameter(block4, "block");
                promptMarketingScreen2.H = block4;
                return promptMarketingScreen2;
            case 4:
                Context context = (Context) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                CardDesignCarouselController.Companion aVar2 = CardDesignCarouselController.INSTANCE;
                Intrinsics.checkNotNullParameter(context, "context");
                exl.b bVarC = ((CardDesignCarouselController) obj5).R1().f147776b.k.c();
                int i21 = R$attr.uikit_windowBackground;
                Intrinsics.checkNotNullParameter(context, "context");
                a61.a aVar3 = bVarC.f130468b;
                if (((oi0.b) ((xg0.a) aVar3.f1531b)).d((Context) aVar3.f1532c, y0.b("ui_kit_card_3d_scene_retail")).f305464a.isEmpty()) {
                    return ((gxl.a) bVarC.d.getValue()).createCard3dCarouselViewRenderable(context, null, zBooleanValue, i21);
                }
                throw new CardSceneUnavailable(null);
            case 5:
                com.revolut.feature.card_design.impl.card_design.carousel.e eVar = (com.revolut.feature.card_design.impl.card_design.carousel.e) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CardDesignCarouselScreenContract$ModalStep step4 = (CardDesignCarouselScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof CardDesignCarouselScreenContract$ModalStep.CardLimits) {
                    CardDesignCarouselScreenContract$ModalStep.CardLimits cardLimits = (CardDesignCarouselScreenContract$ModalStep.CardLimits) step4;
                    return eVar.e1(new hx2.d(cardLimits.f64697a, cardLimits.f64698b, eVar.o.f64688m));
                }
                if (step4 instanceof CardDesignCarouselScreenContract$ModalStep.CardCustomisation) {
                    CardDesignCarouselScreenContract$ModalStep.CardCustomisation cardCustomisation = (CardDesignCarouselScreenContract$ModalStep.CardCustomisation) step4;
                    ViewController viewControllerE1 = eVar.e1(new hx2.g(cardCustomisation.f64695a, cardCustomisation.f64696b));
                    sx2.f block5 = new sx2.f(eVar, i3);
                    Intrinsics.checkNotNullParameter(block5, "block");
                    viewControllerE1.H = block5;
                    return viewControllerE1;
                }
                if (!(step4 instanceof CardDesignCarouselScreenContract$ModalStep.LocalGlobalCardInfo)) {
                    if (!(step4 instanceof CardDesignCarouselScreenContract$ModalStep.RevPointsPriceBreakdown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CardDesignCarouselScreenContract$ModalStep.RevPointsPriceBreakdown revPointsPriceBreakdown = (CardDesignCarouselScreenContract$ModalStep.RevPointsPriceBreakdown) step4;
                    return new RevPointsPriceBreakdownController(new RevPointsPriceBreakdownControllerContract$InputData(revPointsPriceBreakdown.f64702a, revPointsPriceBreakdown.f64703b, revPointsPriceBreakdown.f64704c));
                }
                CardDesignCarouselScreenContract$ModalStep.LocalGlobalCardInfo localGlobalCardInfo = (CardDesignCarouselScreenContract$ModalStep.LocalGlobalCardInfo) step4;
                ViewController viewControllerE12 = eVar.e1(new hx2.l(localGlobalCardInfo.f64699a, localGlobalCardInfo.f64700b, localGlobalCardInfo.f64701c, localGlobalCardInfo.d));
                sx2.f block6 = new sx2.f(eVar, 3);
                Intrinsics.checkNotNullParameter(block6, "block");
                viewControllerE12.H = block6;
                return viewControllerE12;
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ((v0) obj5).a();
            case 7:
                final com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar3 = (com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b) obj5;
                wxe.a aVar4 = bVar3.f90797q;
                i0 i0Var = bVar3.f90796p;
                l FlowCoordinator = (l) obj2;
                final StoredMethodFlowContract$Step step5 = (StoredMethodFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (Intrinsics.f(step5, StoredMethodFlowContract$Step.StoredMethodDetails.f90791a)) {
                    sxe.c cVar2 = bVar3.o;
                    yte.m mVar = cVar2.f266462b;
                    String str3 = cVar2.f266461a;
                    if (mVar != null) {
                        yte.m[] elements = {yte.m.MCY_UPI_APP, yte.m.MCY_NET_BANKING, yte.m.UPI_APP, yte.m.NET_BANKING};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        if (kotlin.collections.d.y0(elements).contains(mVar)) {
                            if (mVar != null) {
                                IndiaStoredMethodDetailsScreen indiaStoredMethodDetailsScreen = new IndiaStoredMethodDetailsScreen(new IndiaStoredMethodDetailsScreenContract$InputData(str3, mVar));
                                Function1 block7 = new Function1() { // from class: sxe.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        switch (i6) {
                                            case 0:
                                                aye.g result = (aye.g) obj6;
                                                Intrinsics.checkNotNullParameter(result, "result");
                                                boolean zF = Intrinsics.f(result, aye.e.f11138a);
                                                com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar4 = bVar3;
                                                if (zF) {
                                                    oki.h.D2(bVar4.v);
                                                } else {
                                                    if (!(result instanceof aye.f)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    yji.l.a1(bVar4, bVar4.X1(new k("SHOT_DIALOG_SUCCESS_REMOVAL_ID", new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_stored_method_details_shot_dialog_account_deleted, null, null, 14), null, null, null, 28)), null, null, new se4.c(bVar4, null, 24), 3);
                                                }
                                                return Unit.f186387a;
                                            default:
                                                com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar5 = bVar3;
                                                yki.a aVar5 = bVar5.v;
                                                y result2 = (y) obj6;
                                                Intrinsics.checkNotNullParameter(result2, "result");
                                                if (Intrinsics.f(result2, wxe.p.f300911a)) {
                                                    oki.h.D2(aVar5);
                                                } else {
                                                    boolean z3 = result2 instanceof wxe.r;
                                                    ModalDestination.Style style = ModalDestination.Style.POPUP.f98311a;
                                                    if (z3) {
                                                        wxe.r rVar = (wxe.r) result2;
                                                        oki.h.w2(aVar5, new StoredMethodFlowContract$Step.EditLabel(rVar.f300913a, rVar.f300914b, rVar.f300915c, rVar.d), style);
                                                    } else {
                                                        boolean z4 = result2 instanceof v;
                                                        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                                                        if (z4) {
                                                            v vVar = (v) result2;
                                                            oki.h.w2(aVar5, new StoredMethodFlowContract$Step.LinkedRevokeConfirmation(vVar.f300921a, vVar.f300922b, vVar.f300923c), bottom_dialog);
                                                        } else if (result2 instanceof wxe.u) {
                                                            bVar5.n2(new h(bVar5, result2, null), new whi.b(6));
                                                        } else if (result2 instanceof wxe.w) {
                                                            wxe.w wVar = (wxe.w) result2;
                                                            oki.h.w2(aVar5, new StoredMethodFlowContract$Step.MandateRevokeConfirmation(wVar.f300924a, wVar.f300925b, wVar.f300926c), bottom_dialog);
                                                        } else if (result2 instanceof x) {
                                                            x xVar = (x) result2;
                                                            oki.h.w2(aVar5, new StoredMethodFlowContract$Step.UpdateMandateLimits(xVar.f300928b, xVar.f300929c, xVar.f300927a), style);
                                                        } else if (result2 instanceof t) {
                                                            oki.h.w2(aVar5, new StoredMethodFlowContract$Step.RemoveMethodConfirmation(((t) result2).f300919a), bottom_dialog);
                                                        } else if (result2 instanceof wxe.q) {
                                                            if (((jte.d) bVar5.u).c(MandateApi$Toggles$VrpSetupBottomSheet.f72205c)) {
                                                                style = bottom_dialog;
                                                            }
                                                            oki.h.w2(aVar5, new StoredMethodFlowContract$Step.CreateMandate(((wxe.q) result2).f300912a), style);
                                                        } else {
                                                            if (!(result2 instanceof s)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            s sVar = (s) result2;
                                                            oki.h.w2(aVar5, new StoredMethodFlowContract$Step.RemovalNotAllowed(sVar.f300916a, sVar.f300917b, sVar.f300918c), bottom_dialog);
                                                        }
                                                    }
                                                }
                                                return Unit.f186387a;
                                        }
                                    }
                                };
                                Intrinsics.checkNotNullParameter(block7, "block");
                                indiaStoredMethodDetailsScreen.H = block7;
                                return indiaStoredMethodDetailsScreen;
                            }
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("India stored method detail require non null type");
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                            throw illegalArgumentException;
                        }
                    }
                    StoredMethodDetailsScreen storedMethodDetailsScreen = new StoredMethodDetailsScreen(new StoredMethodDetailsScreenContract$InputData(str3, mVar, cVar2.f266463c, cVar2.d));
                    Function1 block8 = new Function1() { // from class: sxe.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i5) {
                                case 0:
                                    aye.g result = (aye.g) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean zF = Intrinsics.f(result, aye.e.f11138a);
                                    com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar4 = bVar3;
                                    if (zF) {
                                        oki.h.D2(bVar4.v);
                                    } else {
                                        if (!(result instanceof aye.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        yji.l.a1(bVar4, bVar4.X1(new k("SHOT_DIALOG_SUCCESS_REMOVAL_ID", new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_stored_method_details_shot_dialog_account_deleted, null, null, 14), null, null, null, 28)), null, null, new se4.c(bVar4, null, 24), 3);
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar5 = bVar3;
                                    yki.a aVar5 = bVar5.v;
                                    y result2 = (y) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (Intrinsics.f(result2, wxe.p.f300911a)) {
                                        oki.h.D2(aVar5);
                                    } else {
                                        boolean z3 = result2 instanceof wxe.r;
                                        ModalDestination.Style style = ModalDestination.Style.POPUP.f98311a;
                                        if (z3) {
                                            wxe.r rVar = (wxe.r) result2;
                                            oki.h.w2(aVar5, new StoredMethodFlowContract$Step.EditLabel(rVar.f300913a, rVar.f300914b, rVar.f300915c, rVar.d), style);
                                        } else {
                                            boolean z4 = result2 instanceof v;
                                            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                                            if (z4) {
                                                v vVar = (v) result2;
                                                oki.h.w2(aVar5, new StoredMethodFlowContract$Step.LinkedRevokeConfirmation(vVar.f300921a, vVar.f300922b, vVar.f300923c), bottom_dialog);
                                            } else if (result2 instanceof wxe.u) {
                                                bVar5.n2(new h(bVar5, result2, null), new whi.b(6));
                                            } else if (result2 instanceof wxe.w) {
                                                wxe.w wVar = (wxe.w) result2;
                                                oki.h.w2(aVar5, new StoredMethodFlowContract$Step.MandateRevokeConfirmation(wVar.f300924a, wVar.f300925b, wVar.f300926c), bottom_dialog);
                                            } else if (result2 instanceof x) {
                                                x xVar = (x) result2;
                                                oki.h.w2(aVar5, new StoredMethodFlowContract$Step.UpdateMandateLimits(xVar.f300928b, xVar.f300929c, xVar.f300927a), style);
                                            } else if (result2 instanceof t) {
                                                oki.h.w2(aVar5, new StoredMethodFlowContract$Step.RemoveMethodConfirmation(((t) result2).f300919a), bottom_dialog);
                                            } else if (result2 instanceof wxe.q) {
                                                if (((jte.d) bVar5.u).c(MandateApi$Toggles$VrpSetupBottomSheet.f72205c)) {
                                                    style = bottom_dialog;
                                                }
                                                oki.h.w2(aVar5, new StoredMethodFlowContract$Step.CreateMandate(((wxe.q) result2).f300912a), style);
                                            } else {
                                                if (!(result2 instanceof s)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                s sVar = (s) result2;
                                                oki.h.w2(aVar5, new StoredMethodFlowContract$Step.RemovalNotAllowed(sVar.f300916a, sVar.f300917b, sVar.f300918c), bottom_dialog);
                                            }
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    storedMethodDetailsScreen.H = block8;
                    return storedMethodDetailsScreen;
                }
                if (step5 instanceof StoredMethodFlowContract$Step.EditLabel) {
                    StoredMethodFlowContract$Step.EditLabel editLabel = (StoredMethodFlowContract$Step.EditLabel) step5;
                    ViewController viewControllerE13 = bVar3.e1(new ste.f(new EditStoredMethodLabelDescriptor$InputData(editLabel.f90778a, editLabel.f90779b, editLabel.f90780c, editLabel.d, ste.d.Common)));
                    baa.c block9 = new baa.c(FlowCoordinator);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    viewControllerE13.H = block9;
                    return viewControllerE13;
                }
                if (step5 instanceof StoredMethodFlowContract$Step.UpdateMandateLimits) {
                    StoredMethodFlowContract$Step.UpdateMandateLimits updateMandateLimits = (StoredMethodFlowContract$Step.UpdateMandateLimits) step5;
                    return bVar3.e1(new a1(new we6.y0(updateMandateLimits.f90793b, updateMandateLimits.f90794c, updateMandateLimits.f90792a)));
                }
                if (step5 instanceof StoredMethodFlowContract$Step.CreateMandate) {
                    return ((jte.d) bVar3.u).c(MandateApi$Toggles$VrpSetupBottomSheet.f72205c) ? bVar3.e1(new s0(new q0(null, ((StoredMethodFlowContract$Step.CreateMandate) step5).f90777a))) : bVar3.e1(new we6.n(new we6.l(((StoredMethodFlowContract$Step.CreateMandate) step5).f90777a)));
                }
                if (step5 instanceof StoredMethodFlowContract$Step.RemoveMethodConfirmation) {
                    StoredMethod storedMethod = ((StoredMethodFlowContract$Step.RemoveMethodConfirmation) step5).f90790a;
                    k9 value = k9.OpenBanking;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    Intrinsics.checkNotNullParameter(value, "value");
                    AnalyticsProduct.Retail analyticsProduct = new AnalyticsProduct.Retail(value);
                    i0Var.getClass();
                    Intrinsics.checkNotNullParameter(storedMethod, "storedMethod");
                    Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_stored_account_details_remove_dialog_title, u.c(storedMethod.f90529a.f90539b), null, 12);
                    StoredMethod.LinkedAccount linkedAccount = storedMethod.d;
                    StoredMethod.Mandate mandate = storedMethod.f;
                    ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(new lw0.a(textLocalisedClause, new TextLocalisedClause((linkedAccount == null || mandate == null) ? linkedAccount != null ? com.revolut.feature.topup_screen.impl.R$string.topup_stored_account_details_remove_dialog_subtitle_with_linked : mandate instanceof StoredMethod.Mandate.OpenBanking ? com.revolut.feature.topup_screen.impl.R$string.topup_stored_account_details_remove_dialog_subtitle_with_vrp : mandate instanceof StoredMethod.Mandate.PayTo ? com.revolut.feature.topup_screen.impl.R$string.payto_linked_method_detail_remove_dialog_description : com.revolut.feature.topup_screen.impl.R$string.topup_stored_account_details_remove_dialog_regular_subtitle : com.revolut.feature.topup_screen.impl.R$string.topup_stored_account_details_remove_dialog_subtitle_with_vrp_and_linked, u.c(storedMethod.f90529a.f90539b), null, 12), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_stored_account_details_remove_dialog_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), analyticsProduct, null, null, 24));
                    Function1 block10 = new Function1() { // from class: sxe.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            dii.g outputData = (dii.g) obj6;
                            switch (i6) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        StoredMethod storedMethod2 = ((StoredMethodFlowContract$Step.RemoveMethodConfirmation) step5).f90790a;
                                        String str4 = storedMethod2.f90530b.f90532a;
                                        yte.m mVar2 = storedMethod2.f instanceof StoredMethod.Mandate.PayTo ? yte.m.PAY_TO : null;
                                        com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar4 = bVar3;
                                        bVar4.n2(new g(bVar4, str4, mVar2, (Continuation) null, 0), new whi.b(6));
                                    }
                                    break;
                                case 1:
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        StoredMethodFlowContract$Step.LinkedRevokeConfirmation linkedRevokeConfirmation = (StoredMethodFlowContract$Step.LinkedRevokeConfirmation) step5;
                                        String str5 = linkedRevokeConfirmation.f90781a;
                                        String str6 = linkedRevokeConfirmation.f90782b;
                                        String str7 = linkedRevokeConfirmation.f90783c;
                                        com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar5 = bVar3;
                                        bVar5.n2(new g(bVar5, str5, str6, str7, (Continuation) null), new whi.b(6));
                                    }
                                    break;
                                case 2:
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        StoredMethodFlowContract$Step.MandateRevokeConfirmation mandateRevokeConfirmation = (StoredMethodFlowContract$Step.MandateRevokeConfirmation) step5;
                                        String str8 = mandateRevokeConfirmation.f90784a;
                                        String str9 = mandateRevokeConfirmation.f90785b;
                                        com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar6 = bVar3;
                                        bVar6.n2(new sma.f(bVar6, str8, str9, (Continuation) null, 3), new whi.b(6));
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        StoredMethodFlowContract$Step storedMethodFlowContract$Step = step5;
                                        com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar7 = bVar3;
                                        bVar7.l2(new com.revolut.feature.topup_screen.impl.flows.stored_method.flow.a(storedMethodFlowContract$Step, bVar7, null), new yi5.b(26));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block10, "block");
                    actionsBottomSheetController2.H = block10;
                    return actionsBottomSheetController2;
                }
                if (step5 instanceof StoredMethodFlowContract$Step.LinkedRevokeConfirmation) {
                    String issuerInstitutionName = ((StoredMethodFlowContract$Step.LinkedRevokeConfirmation) step5).f90783c;
                    k9 value2 = k9.OpenBanking;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    Intrinsics.checkNotNullParameter(value2, "value");
                    AnalyticsProduct.Retail analyticsProduct2 = new AnalyticsProduct.Retail(value2);
                    aVar4.getClass();
                    Intrinsics.checkNotNullParameter(issuerInstitutionName, "issuerInstitutionName");
                    Intrinsics.checkNotNullParameter(analyticsProduct2, "analyticsProduct");
                    actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.open_banking_external_account_details_revoke_linked_dialog_title, u.c(issuerInstitutionName), null, 12), new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.open_banking_external_account_details_revoke_linked_dialog_subtitle, null, null, 14), null, null, false, 28), new aw0.h(false, wxe.a.b(), wxe.a.a(), null, null, null, 121), analyticsProduct2, null, null, 24));
                    Function1 block11 = new Function1() { // from class: sxe.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            dii.g outputData = (dii.g) obj6;
                            switch (i5) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        StoredMethod storedMethod2 = ((StoredMethodFlowContract$Step.RemoveMethodConfirmation) step5).f90790a;
                                        String str4 = storedMethod2.f90530b.f90532a;
                                        yte.m mVar2 = storedMethod2.f instanceof StoredMethod.Mandate.PayTo ? yte.m.PAY_TO : null;
                                        com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar4 = bVar3;
                                        bVar4.n2(new g(bVar4, str4, mVar2, (Continuation) null, 0), new whi.b(6));
                                    }
                                    break;
                                case 1:
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        StoredMethodFlowContract$Step.LinkedRevokeConfirmation linkedRevokeConfirmation = (StoredMethodFlowContract$Step.LinkedRevokeConfirmation) step5;
                                        String str5 = linkedRevokeConfirmation.f90781a;
                                        String str6 = linkedRevokeConfirmation.f90782b;
                                        String str7 = linkedRevokeConfirmation.f90783c;
                                        com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar5 = bVar3;
                                        bVar5.n2(new g(bVar5, str5, str6, str7, (Continuation) null), new whi.b(6));
                                    }
                                    break;
                                case 2:
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        StoredMethodFlowContract$Step.MandateRevokeConfirmation mandateRevokeConfirmation = (StoredMethodFlowContract$Step.MandateRevokeConfirmation) step5;
                                        String str8 = mandateRevokeConfirmation.f90784a;
                                        String str9 = mandateRevokeConfirmation.f90785b;
                                        com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar6 = bVar3;
                                        bVar6.n2(new sma.f(bVar6, str8, str9, (Continuation) null, 3), new whi.b(6));
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        StoredMethodFlowContract$Step storedMethodFlowContract$Step = step5;
                                        com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar7 = bVar3;
                                        bVar7.l2(new com.revolut.feature.topup_screen.impl.flows.stored_method.flow.a(storedMethodFlowContract$Step, bVar7, null), new yi5.b(26));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    actionsBottomSheetController.H = block11;
                } else {
                    if (!(step5 instanceof StoredMethodFlowContract$Step.MandateRevokeConfirmation)) {
                        if (!(step5 instanceof StoredMethodFlowContract$Step.RemovalNotAllowed)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        k9 value3 = k9.OpenBanking;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value3, "value");
                        AnalyticsProduct.Retail analyticsProduct3 = new AnalyticsProduct.Retail(value3);
                        i0Var.getClass();
                        Intrinsics.checkNotNullParameter(analyticsProduct3, "analyticsProduct");
                        ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.open_banking_external_account_details_remove_method_prompt_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.open_banking_external_account_details_remove_method_prompt_subtitle, null, null, 14), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.open_banking_external_account_details_remove_method_prompt_revoke, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), analyticsProduct3, null, null, 24));
                        final int i22 = 3;
                        Function1 block12 = new Function1() { // from class: sxe.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                dii.g outputData = (dii.g) obj6;
                                switch (i22) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        if (outputData instanceof dii.e) {
                                            StoredMethod storedMethod2 = ((StoredMethodFlowContract$Step.RemoveMethodConfirmation) step5).f90790a;
                                            String str4 = storedMethod2.f90530b.f90532a;
                                            yte.m mVar2 = storedMethod2.f instanceof StoredMethod.Mandate.PayTo ? yte.m.PAY_TO : null;
                                            com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar4 = bVar3;
                                            bVar4.n2(new g(bVar4, str4, mVar2, (Continuation) null, 0), new whi.b(6));
                                        }
                                        break;
                                    case 1:
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        if (outputData instanceof dii.e) {
                                            StoredMethodFlowContract$Step.LinkedRevokeConfirmation linkedRevokeConfirmation = (StoredMethodFlowContract$Step.LinkedRevokeConfirmation) step5;
                                            String str5 = linkedRevokeConfirmation.f90781a;
                                            String str6 = linkedRevokeConfirmation.f90782b;
                                            String str7 = linkedRevokeConfirmation.f90783c;
                                            com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar5 = bVar3;
                                            bVar5.n2(new g(bVar5, str5, str6, str7, (Continuation) null), new whi.b(6));
                                        }
                                        break;
                                    case 2:
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        if (outputData instanceof dii.e) {
                                            StoredMethodFlowContract$Step.MandateRevokeConfirmation mandateRevokeConfirmation = (StoredMethodFlowContract$Step.MandateRevokeConfirmation) step5;
                                            String str8 = mandateRevokeConfirmation.f90784a;
                                            String str9 = mandateRevokeConfirmation.f90785b;
                                            com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar6 = bVar3;
                                            bVar6.n2(new sma.f(bVar6, str8, str9, (Continuation) null, 3), new whi.b(6));
                                        }
                                        break;
                                    default:
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        if (outputData instanceof dii.e) {
                                            StoredMethodFlowContract$Step storedMethodFlowContract$Step = step5;
                                            com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar7 = bVar3;
                                            bVar7.l2(new com.revolut.feature.topup_screen.impl.flows.stored_method.flow.a(storedMethodFlowContract$Step, bVar7, null), new yi5.b(26));
                                        }
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        Intrinsics.checkNotNullParameter(block12, "block");
                        actionsBottomSheetController3.H = block12;
                        return actionsBottomSheetController3;
                    }
                    String issuerInstitutionName2 = ((StoredMethodFlowContract$Step.MandateRevokeConfirmation) step5).f90786c;
                    k9 value4 = k9.OpenBanking;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                    Intrinsics.checkNotNullParameter(value4, "value");
                    AnalyticsProduct.Retail analyticsProduct4 = new AnalyticsProduct.Retail(value4);
                    aVar4.getClass();
                    Intrinsics.checkNotNullParameter(issuerInstitutionName2, "issuerInstitutionName");
                    Intrinsics.checkNotNullParameter(analyticsProduct4, "analyticsProduct");
                    actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.open_banking_external_account_details_revoke_vrp_dialog_title, u.c(issuerInstitutionName2), null, 12), new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.open_banking_external_account_details_revoke_vrp_dialog_subtitle, null, null, 14), null, null, false, 28), new aw0.h(false, wxe.a.b(), wxe.a.a(), null, null, null, 121), analyticsProduct4, null, null, 24));
                    Function1 block13 = new Function1() { // from class: sxe.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            dii.g outputData = (dii.g) obj6;
                            switch (i3) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        StoredMethod storedMethod2 = ((StoredMethodFlowContract$Step.RemoveMethodConfirmation) step5).f90790a;
                                        String str4 = storedMethod2.f90530b.f90532a;
                                        yte.m mVar2 = storedMethod2.f instanceof StoredMethod.Mandate.PayTo ? yte.m.PAY_TO : null;
                                        com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar4 = bVar3;
                                        bVar4.n2(new g(bVar4, str4, mVar2, (Continuation) null, 0), new whi.b(6));
                                    }
                                    break;
                                case 1:
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        StoredMethodFlowContract$Step.LinkedRevokeConfirmation linkedRevokeConfirmation = (StoredMethodFlowContract$Step.LinkedRevokeConfirmation) step5;
                                        String str5 = linkedRevokeConfirmation.f90781a;
                                        String str6 = linkedRevokeConfirmation.f90782b;
                                        String str7 = linkedRevokeConfirmation.f90783c;
                                        com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar5 = bVar3;
                                        bVar5.n2(new g(bVar5, str5, str6, str7, (Continuation) null), new whi.b(6));
                                    }
                                    break;
                                case 2:
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        StoredMethodFlowContract$Step.MandateRevokeConfirmation mandateRevokeConfirmation = (StoredMethodFlowContract$Step.MandateRevokeConfirmation) step5;
                                        String str8 = mandateRevokeConfirmation.f90784a;
                                        String str9 = mandateRevokeConfirmation.f90785b;
                                        com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar6 = bVar3;
                                        bVar6.n2(new sma.f(bVar6, str8, str9, (Continuation) null, 3), new whi.b(6));
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof dii.e) {
                                        StoredMethodFlowContract$Step storedMethodFlowContract$Step = step5;
                                        com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar7 = bVar3;
                                        bVar7.l2(new com.revolut.feature.topup_screen.impl.flows.stored_method.flow.a(storedMethodFlowContract$Step, bVar7, null), new yi5.b(26));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    actionsBottomSheetController.H = block13;
                }
                return actionsBottomSheetController;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new sxi.h(null, ((com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.b) obj5).b(), false, null);
            case 9:
                final com.revolut.camerakit.revolut.ui.flow.steps.camera.a aVar5 = (com.revolut.camerakit.revolut.ui.flow.steps.camera.a) obj5;
                vy.a aVar6 = aVar5.f50805r;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CameraKitCameraScreenContract$ModalStep step6 = (CameraKitCameraScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (Intrinsics.f(step6, CameraKitCameraScreenContract$ModalStep.FrequentlyAskedQuestions.f50799a)) {
                    ty.c cVar3 = aVar6.d.f258194c;
                    if (cVar3 != null) {
                        return new ListBottomSheetController(cVar3);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (Intrinsics.f(step6, CameraKitCameraScreenContract$ModalStep.SignLanguageHintBottomSheet.f50801a)) {
                    ty.h hVar = aVar5.v;
                    hVar.getClass();
                    lw0.a aVar7 = new lw0.a(new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.selfie_active_liveness_sign_language_title, null, null, 14), new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.selfie_active_liveness_sign_language_description, null, null, 14), null, null, false, 28);
                    List list = hVar.f275444a;
                    yp0.b.k(list, 0, 0, 0, 0, 31);
                    m6 m6Var = n6.Companion;
                    ListBottomSheetController listBottomSheetController = new ListBottomSheetController(new ty.c(aVar7, new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.camera_capture_tips_dismiss, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.selfie_active_liveness_sign_language_secondary_button_title, null, null, 14), LargeActionButton.ButtonStyle.o, null, null, false, null, null, null, 1020), null, null, null, 121), list, AnalyticsProduct.Shared.Vision.f));
                    Function1 block14 = new Function1() { // from class: sy.v
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i5) {
                                case 0:
                                    com.revolut.camerakit.revolut.ui.flow.steps.camera.a aVar8 = aVar5;
                                    cli.y yVar = aVar8.z;
                                    s7a.a0 output = (s7a.a0) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    s7a.c0 c0Var = output.f260599a;
                                    zy.d dVar = c0Var instanceof zy.d ? (zy.d) c0Var : null;
                                    if (dVar == null) {
                                        return Unit.f186387a;
                                    }
                                    if (dVar instanceof zy.b) {
                                        aVar8.H2(yVar, new sx8.a(dVar, 4));
                                    } else {
                                        if (!dVar.equals(zy.c.f326354a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar8.H2(yVar, new sx2.g(24));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ty.f result = (ty.f) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof ty.e) {
                                        com.revolut.camerakit.revolut.ui.flow.steps.camera.a aVar9 = aVar5;
                                        aVar9.H2(aVar9.z, new sx2.g(25));
                                    }
                                    return Unit.f186387a;
                                default:
                                    dii.g result2 = (dii.g) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof dii.f) {
                                        com.revolut.camerakit.revolut.ui.flow.steps.camera.a aVar10 = aVar5;
                                        aVar10.H2(aVar10.z, new sx2.g(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block14, "block");
                    listBottomSheetController.H = block14;
                    return listBottomSheetController;
                }
                if (Intrinsics.f(step6, CameraKitCameraScreenContract$ModalStep.SpokenDigitsHintBottomSheet.f50802a)) {
                    aVar5.f50808w.getClass();
                    lw0.a aVar8 = new lw0.a(new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.selfie_active_liveness_spoken_digits_title, null, null, 14), new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.selfie_active_liveness_intro_hint_digits, null, null, 14), null, null, false, 28);
                    m6 m6Var2 = n6.Companion;
                    ActionsBottomSheetController actionsBottomSheetController4 = new ActionsBottomSheetController(new dii.a(aVar8, new aw0.h(false, m6.c(m6Var2, new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.camera_capture_tips_dismiss, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var2, new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.selfie_active_liveness_intro_hand_signs, null, null, 14), LargeActionButton.ButtonStyle.o, null, null, false, null, null, null, 1020), null, null, null, 121), AnalyticsProduct.Shared.Vision.f, null, null, 24));
                    Function1 block15 = new Function1() { // from class: sy.v
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i3) {
                                case 0:
                                    com.revolut.camerakit.revolut.ui.flow.steps.camera.a aVar82 = aVar5;
                                    cli.y yVar = aVar82.z;
                                    s7a.a0 output = (s7a.a0) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    s7a.c0 c0Var = output.f260599a;
                                    zy.d dVar = c0Var instanceof zy.d ? (zy.d) c0Var : null;
                                    if (dVar == null) {
                                        return Unit.f186387a;
                                    }
                                    if (dVar instanceof zy.b) {
                                        aVar82.H2(yVar, new sx8.a(dVar, 4));
                                    } else {
                                        if (!dVar.equals(zy.c.f326354a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar82.H2(yVar, new sx2.g(24));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    ty.f result = (ty.f) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof ty.e) {
                                        com.revolut.camerakit.revolut.ui.flow.steps.camera.a aVar9 = aVar5;
                                        aVar9.H2(aVar9.z, new sx2.g(25));
                                    }
                                    return Unit.f186387a;
                                default:
                                    dii.g result2 = (dii.g) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof dii.f) {
                                        com.revolut.camerakit.revolut.ui.flow.steps.camera.a aVar10 = aVar5;
                                        aVar10.H2(aVar10.z, new sx2.g(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block15, "block");
                    actionsBottomSheetController4.H = block15;
                    return actionsBottomSheetController4;
                }
                if (!Intrinsics.f(step6, CameraKitCameraScreenContract$ModalStep.LanguageSelector.f50800a)) {
                    throw new NoWhenBranchMatchedException();
                }
                zy.f fVar2 = aVar5.f50809x;
                Locale localeF0 = ((sy.e) ((j2) aVar5.z.f22677a).getValue()).f0();
                if (localeF0 == null || (languageTag = localeF0.toLanguageTag()) == null) {
                    c0 c0Var = fVar2.f326355a;
                    Iterator it8 = ez.a.f130877a.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((Locale) next).getLanguage(), ((s80.b) ((qd0.b) c0Var.f312297a)).a().getLanguage())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    Locale locale = (Locale) next;
                    if (locale != null) {
                        String languageTag = locale.toLanguageTag();
                        str = languageTag;
                    } else {
                        str = null;
                    }
                } else {
                    str = languageTag;
                }
                PickerController pickerController = new PickerController(new s7a.x(null, null, null, null, false, null, new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.selfie_active_liveness_language_selector_search_hint, null, null, 14), null, null, false, null, str, null, null, false, null, null, null, new AnalyticsContext(aVar6.f293110g), null, 1601568254), fVar2);
                Function1 block16 = new Function1() { // from class: sy.v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i6) {
                            case 0:
                                com.revolut.camerakit.revolut.ui.flow.steps.camera.a aVar82 = aVar5;
                                cli.y yVar = aVar82.z;
                                s7a.a0 output = (s7a.a0) obj6;
                                Intrinsics.checkNotNullParameter(output, "output");
                                s7a.c0 c0Var2 = output.f260599a;
                                zy.d dVar = c0Var2 instanceof zy.d ? (zy.d) c0Var2 : null;
                                if (dVar == null) {
                                    return Unit.f186387a;
                                }
                                if (dVar instanceof zy.b) {
                                    aVar82.H2(yVar, new sx8.a(dVar, 4));
                                } else {
                                    if (!dVar.equals(zy.c.f326354a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar82.H2(yVar, new sx2.g(24));
                                }
                                return Unit.f186387a;
                            case 1:
                                ty.f result = (ty.f) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof ty.e) {
                                    com.revolut.camerakit.revolut.ui.flow.steps.camera.a aVar9 = aVar5;
                                    aVar9.H2(aVar9.z, new sx2.g(25));
                                }
                                return Unit.f186387a;
                            default:
                                dii.g result2 = (dii.g) obj6;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof dii.f) {
                                    com.revolut.camerakit.revolut.ui.flow.steps.camera.a aVar10 = aVar5;
                                    aVar10.H2(aVar10.z, new sx2.g(26));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block16, "block");
                pickerController.H = block16;
                return pickerController;
            case 10:
                final com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a aVar9 = (com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a) obj5;
                cli.y yVar = aVar9.f73943r;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InvoiceScheduleSettingsScreenContract$Step step7 = (InvoiceScheduleSettingsScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (Intrinsics.f(step7, InvoiceScheduleSettingsScreenContract$Step.IssueDatePicker.f73939a)) {
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_payment_schedules_input_invoice_date_title, null, null, 14);
                    EnumEntries<sr6.a> enumEntriesA = sr6.a.a();
                    ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
                    for (sr6.a aVar10 : enumEntriesA) {
                        arrayList.add(new FreelancerSingleChoiceScreenContract$SingleChoiceItem(ofm.q.N(aVar10), aVar10.name()));
                    }
                    sr6.a aVar11 = ((sy6.f) ((j2) yVar.f22677a).getValue()).f266631b;
                    return com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a.I2(textLocalisedClause2, arrayList, aVar11 != null ? aVar11.name() : null, new Function1() { // from class: sy6.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            String selectedId = (String) obj6;
                            switch (i6) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                                    com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a aVar12 = aVar9;
                                    aVar12.H2(aVar12.f73943r, new sef.j(selectedId, 13));
                                    break;
                                case 1:
                                    Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                                    com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a aVar13 = aVar9;
                                    aVar13.H2(aVar13.f73943r, new sef.j(selectedId, 15));
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                                    com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a aVar14 = aVar9;
                                    aVar14.H2(aVar14.f73943r, new sef.j(selectedId, 14));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                }
                if (Intrinsics.f(step7, InvoiceScheduleSettingsScreenContract$Step.DueDatePicker.f73938a)) {
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_payment_schedules_input_due_date_title, null, null, 14);
                    EnumEntries<sr6.b> enumEntriesA2 = sr6.b.a();
                    ArrayList arrayList2 = new ArrayList(w.t(enumEntriesA2, 10));
                    for (sr6.b bVar4 : enumEntriesA2) {
                        arrayList2.add(new FreelancerSingleChoiceScreenContract$SingleChoiceItem(ofm.q.M(bVar4), bVar4.name()));
                    }
                    sr6.b bVar5 = ((sy6.f) ((j2) yVar.f22677a).getValue()).d;
                    return com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a.I2(textLocalisedClause3, arrayList2, bVar5 != null ? bVar5.name() : null, new Function1() { // from class: sy6.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            String selectedId = (String) obj6;
                            switch (i5) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                                    com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a aVar12 = aVar9;
                                    aVar12.H2(aVar12.f73943r, new sef.j(selectedId, 13));
                                    break;
                                case 1:
                                    Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                                    com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a aVar13 = aVar9;
                                    aVar13.H2(aVar13.f73943r, new sef.j(selectedId, 15));
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                                    com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a aVar14 = aVar9;
                                    aVar14.H2(aVar14.f73943r, new sef.j(selectedId, 14));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                }
                if (!Intrinsics.f(step7, InvoiceScheduleSettingsScreenContract$Step.SupplyDatePicker.f73940a)) {
                    throw new NoWhenBranchMatchedException();
                }
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_payment_schedules_input_supply_date_title, null, null, 14);
                EnumEntries<sr6.a> enumEntriesA3 = sr6.a.a();
                ArrayList arrayList3 = new ArrayList(w.t(enumEntriesA3, 10));
                for (sr6.a aVar12 : enumEntriesA3) {
                    arrayList3.add(new FreelancerSingleChoiceScreenContract$SingleChoiceItem(ofm.q.N(aVar12), aVar12.name()));
                }
                sr6.a aVar13 = ((sy6.f) ((j2) yVar.f22677a).getValue()).f266632c;
                return com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a.I2(textLocalisedClause4, arrayList3, aVar13 != null ? aVar13.name() : 0, new Function1() { // from class: sy6.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        String selectedId = (String) obj6;
                        switch (i3) {
                            case 0:
                                Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                                com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a aVar122 = aVar9;
                                aVar122.H2(aVar122.f73943r, new sef.j(selectedId, 13));
                                break;
                            case 1:
                                Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                                com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a aVar132 = aVar9;
                                aVar132.H2(aVar132.f73943r, new sef.j(selectedId, 15));
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                                com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a aVar14 = aVar9;
                                aVar14.H2(aVar14.f73943r, new sef.j(selectedId, 14));
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
            case 11:
                final com.revolut.feature.rev_points.impl.ui.c cVar4 = (com.revolut.feature.rev_points.impl.ui.c) obj5;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                RevPointsFlowContract$Step step8 = (RevPointsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof RevPointsFlowContract$Step.OpenChallengeDetails) {
                    ChallengeId challengeId = ((RevPointsFlowContract$Step.OpenChallengeDetails) step8).f83736a;
                    return new RevPointsChallengesHomeScreen(new RevPointsChallengesHomeScreenContract$InputData(challengeId != null ? new RevPointsChallengesHomeScreenContract$Action.OpenChallengeDetails(challengeId) : null));
                }
                if (step8 instanceof RevPointsFlowContract$Step.OpenChallengesGrid) {
                    ChallengeId challengeId2 = ((RevPointsFlowContract$Step.OpenChallengesGrid) step8).f83738a;
                    return new RevPointsChallengesHomeScreen(new RevPointsChallengesHomeScreenContract$InputData(challengeId2 != null ? new RevPointsChallengesHomeScreenContract$Action.OpenChallengeDetails(challengeId2) : null));
                }
                if (step8 instanceof RevPointsFlowContract$Step.OpenEarnHub) {
                    RevPointsFlowContract$Step.OpenEarnHub openEarnHub = (RevPointsFlowContract$Step.OpenEarnHub) step8;
                    boolean z3 = openEarnHub.f83739a;
                    RevPointsFlowDestination.EarnHubPendingAction earnHubPendingAction = openEarnHub.f83740b;
                    if (Intrinsics.f(earnHubPendingAction, RevPointsFlowDestination.EarnHubPendingAction.None.f83494a)) {
                        revPointsEarnScreenContract$PendingAction = RevPointsEarnScreenContract$PendingAction.None.f83793a;
                    } else {
                        if (earnHubPendingAction instanceof RevPointsFlowDestination.EarnHubPendingAction.OpenSpareChange) {
                            openPointsBuying = new RevPointsEarnScreenContract$PendingAction.OpenSpareChange(((RevPointsFlowDestination.EarnHubPendingAction.OpenSpareChange) earnHubPendingAction).f83497a);
                        } else {
                            if (!(earnHubPendingAction instanceof RevPointsFlowDestination.EarnHubPendingAction.OpenPointsBuying)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            RevPointsFlowDestination.EarnHubPendingAction.OpenPointsBuying openPointsBuying2 = (RevPointsFlowDestination.EarnHubPendingAction.OpenPointsBuying) earnHubPendingAction;
                            openPointsBuying = new RevPointsEarnScreenContract$PendingAction.OpenPointsBuying(openPointsBuying2.f83495a, openPointsBuying2.f83496b);
                        }
                        revPointsEarnScreenContract$PendingAction = openPointsBuying;
                    }
                    return new RevPointsEarnScreen(new RevPointsEarnScreenContract$InputData(z3, revPointsEarnScreenContract$PendingAction));
                }
                if (step8 instanceof RevPointsFlowContract$Step.OpenLearnScreen) {
                    return gc0.c.b(new RevPointsLearnScreen(new RevPointsLearnScreenContract$InputData(((RevPointsFlowContract$Step.OpenLearnScreen) step8).f83741a)), new ogk.b(i2));
                }
                if (step8 instanceof RevPointsFlowContract$Step.OpenRedeemHub) {
                    return new RevPointsRedeemScreen(new RevPointsRedeemScreenContract$InputData(((RevPointsFlowContract$Step.OpenRedeemHub) step8).f83742a));
                }
                if (step8 instanceof RevPointsFlowContract$Step.OpenTransactionDetails) {
                    return new RevPointsTransactionDetailsScreen(new RevPointsTransactionDetailsScreenContract$InputData.TransactionInput(((RevPointsFlowContract$Step.OpenTransactionDetails) step8).f83746a));
                }
                if (step8 instanceof RevPointsFlowContract$Step.OpenTransactionDetailsByTransactionId) {
                    return new RevPointsTransactionDetailsScreen(new RevPointsTransactionDetailsScreenContract$InputData.TransactionIdInput(((RevPointsFlowContract$Step.OpenTransactionDetailsByTransactionId) step8).f83747a));
                }
                if (step8 instanceof RevPointsFlowContract$Step.OpenTransactionDetailsPager) {
                    RevPointsFlowContract$Step.OpenTransactionDetailsPager openTransactionDetailsPager = (RevPointsFlowContract$Step.OpenTransactionDetailsPager) step8;
                    List list2 = openTransactionDetailsPager.f83748a;
                    RevPointsTransactionPageParams revPointsTransactionPageParams = openTransactionDetailsPager.d;
                    eub.l lVar = openTransactionDetailsPager.f;
                    if (lVar == null) {
                        if (openTransactionDetailsPager.f83751g) {
                            ihm.f fVar3 = new ihm.f();
                            m0 m0Var = cVar4.f83777r;
                            efm.c0 c0Var2 = hhm.f.f152431c;
                            Intrinsics.checkNotNullExpressionValue(c0Var2, "io(...)");
                            q0Var = new n0(m0Var, revPointsTransactionPageParams, c0Var2);
                            cVar4.l2(new sx2.r(q0Var, fVar3, str, i3), new yi5.b(26));
                            fVar = fVar3;
                        } else {
                            List listC = list2;
                            if (listC.isEmpty()) {
                                listC = u.c(openTransactionDetailsPager.f83750c);
                            }
                            q0Var = new nyb.q0(listC);
                        }
                        lVar = q0Var;
                    }
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    String str4 = openTransactionDetailsPager.f83749b;
                    ref$ObjectRef.f186409a = str4;
                    TransactionDetailsPagerFlow transactionDetailsPagerFlow = new TransactionDetailsPagerFlow(new TransactionDetailsPagerFlowContract$InputData(list2, str4, revPointsTransactionPageParams, openTransactionDetailsPager.e), lVar);
                    s06.e block17 = new s06.e(ref$ObjectRef, 21, fVar, cVar4);
                    Intrinsics.checkNotNullParameter(block17, "block");
                    transactionDetailsPagerFlow.H = block17;
                    transactionDetailsPagerFlow.k2(new qg7.k(step8, 7, ref$ObjectRef, cVar4));
                    return transactionDetailsPagerFlow;
                }
                if (step8 instanceof RevPointsFlowContract$Step.OpenTransactionsList) {
                    RevPointsFlowContract$Step.OpenTransactionsList openTransactionsList = (RevPointsFlowContract$Step.OpenTransactionsList) step8;
                    RevPointsTransactionPageParams revPointsTransactionPageParams2 = openTransactionsList.f83753a;
                    RevPointsFlowContract$Step.OpenTransactionsList.UiOverrides uiOverrides = openTransactionsList.f83754b;
                    ResourceId resourceId = uiOverrides.f83758a;
                    boolean z4 = uiOverrides.f83759b;
                    boolean z6 = uiOverrides.f83760c;
                    RevPointsFlowContract$Step.OpenTransactionsList.EmptyStateOverride emptyStateOverride = uiOverrides.d;
                    RevPointsTransactionsListScreen revPointsTransactionsListScreen = new RevPointsTransactionsListScreen(new RevPointsTransactionsListScreenContract$InputData(revPointsTransactionPageParams2, new RevPointsTransactionsListScreenContract$InputData.UiOverrides(resourceId, z4, z6, emptyStateOverride != null ? new RevPointsTransactionsListScreenContract$InputData.EmptyStateOverride(emptyStateOverride.f83755a, emptyStateOverride.f83756b, emptyStateOverride.f83757c, emptyStateOverride.d) : null)));
                    Function1 block18 = new Function1() { // from class: syb.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    q0c.o output = (q0c.o) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z11 = output instanceof q0c.n;
                                    com.revolut.feature.rev_points.impl.ui.c cVar5 = cVar4;
                                    if (z11) {
                                        h.t2(cVar5, cVar5.u, new RevPointsFlowContract$Step.OpenTransactionDetails(((q0c.n) output).f241240a), true, null, false, 12);
                                    } else {
                                        if (!(output instanceof q0c.m)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar5.C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P(((q0c.m) output).f241239a), null, null, null, 126))));
                                    }
                                    return Unit.f186387a;
                                default:
                                    dzb.e outputData = (dzb.e) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z12 = outputData instanceof dzb.d;
                                    com.revolut.feature.rev_points.impl.ui.c cVar6 = cVar4;
                                    if (z12) {
                                        yji.l.b1(cVar6, cVar6.X1(cVar6.f83775p.a(((dzb.d) outputData).f121302a)), null, new se4.c(cVar6, null, 26), 3);
                                    } else {
                                        if (!(outputData instanceof dzb.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar6.f83776q.getClass();
                                        yji.l.b1(cVar6, cVar6.X1(new mii.e("CHALLENGE_ACTIVATION_DIALOG_ID", new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_challenge_v3_activated, null, null, 14), f1.BOTTOM, 12)), null, new com.revolut.feature.rev_points.impl.ui.b(cVar6, outputData, null), 3);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    revPointsTransactionsListScreen.H = block18;
                    obj4 = revPointsTransactionsListScreen;
                } else {
                    if (Intrinsics.f(step8, RevPointsFlowContract$Step.OpenUpsellSelectPlan.f83761a)) {
                        return new SelectPlanUpsellScreen();
                    }
                    if (step8 instanceof RevPointsFlowContract$Step.OpenRelatedTransactionsBottomSheet) {
                        RevPointsFlowContract$Step.OpenRelatedTransactionsBottomSheet openRelatedTransactionsBottomSheet = (RevPointsFlowContract$Step.OpenRelatedTransactionsBottomSheet) step8;
                        RevPointsRelatedTransactionsBottomSheetController revPointsRelatedTransactionsBottomSheetController = new RevPointsRelatedTransactionsBottomSheetController(new RevPointsRelatedTransactionsBottomSheetControllerContract$InputData(openRelatedTransactionsBottomSheet.f83743a, openRelatedTransactionsBottomSheet.f83744b));
                        revPointsRelatedTransactionsBottomSheetController.k2(new sii.a(cVar4, 11));
                        return revPointsRelatedTransactionsBottomSheetController;
                    }
                    if (!(step8 instanceof RevPointsFlowContract$Step.OpenChallengeDetailsBottomSheet)) {
                        if (Intrinsics.f(step8, RevPointsFlowContract$Step.OpenRevPointsExpiryHome.f83745a)) {
                            return new RevPointsExpiryHomeScreen();
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    RevPointsChallengeDetailsScreen revPointsChallengeDetailsScreen = new RevPointsChallengeDetailsScreen(new RevPointsChallengeDetailsScreenContract$InputData(((RevPointsFlowContract$Step.OpenChallengeDetailsBottomSheet) step8).f83737a));
                    md6.s.F(revPointsChallengeDetailsScreen, new rch.o(2, cVar4, com.revolut.feature.rev_points.impl.ui.c.class, "tillFinish", "tillFinish(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 10), new jmc.e(cVar4, str, 18), new Function1() { // from class: syb.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i5) {
                                case 0:
                                    q0c.o output = (q0c.o) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z11 = output instanceof q0c.n;
                                    com.revolut.feature.rev_points.impl.ui.c cVar5 = cVar4;
                                    if (z11) {
                                        h.t2(cVar5, cVar5.u, new RevPointsFlowContract$Step.OpenTransactionDetails(((q0c.n) output).f241240a), true, null, false, 12);
                                    } else {
                                        if (!(output instanceof q0c.m)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar5.C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P(((q0c.m) output).f241239a), null, null, null, 126))));
                                    }
                                    return Unit.f186387a;
                                default:
                                    dzb.e outputData = (dzb.e) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z12 = outputData instanceof dzb.d;
                                    com.revolut.feature.rev_points.impl.ui.c cVar6 = cVar4;
                                    if (z12) {
                                        yji.l.b1(cVar6, cVar6.X1(cVar6.f83775p.a(((dzb.d) outputData).f121302a)), null, new se4.c(cVar6, null, 26), 3);
                                    } else {
                                        if (!(outputData instanceof dzb.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar6.f83776q.getClass();
                                        yji.l.b1(cVar6, cVar6.X1(new mii.e("CHALLENGE_ACTIVATION_DIALOG_ID", new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_challenge_v3_activated, null, null, 14), f1.BOTTOM, 12)), null, new com.revolut.feature.rev_points.impl.ui.b(cVar6, outputData, null), 3);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    }, 2);
                    obj4 = revPointsChallengeDetailsScreen;
                }
                return obj4;
            case 12:
                return a(obj2, obj3);
            case 13:
                com.revolut.feature.statements.impl.ui.crypto_statement.flow.a aVar14 = (com.revolut.feature.statements.impl.ui.crypto_statement.flow.a) obj5;
                CryptoStatementFlowContract$Step step9 = (CryptoStatementFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof CryptoStatementFlowContract$Step.CryptoStatementScreen) {
                    return new CryptoStatementScreen(new tzd.e(aVar14.o.f266800a));
                }
                throw new NoWhenBranchMatchedException();
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new g0(((t09.c) obj5).f266960b);
            case 15:
                return b(obj2, obj3);
            case 16:
                com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b bVar6 = (com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AllInsightsScreenContract$ModalStep step10 = (AllInsightsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (Intrinsics.f(step10, AllInsightsScreenContract$ModalStep.AddToWatchlist.f76428a)) {
                    ViewController viewControllerE14 = bVar6.e1(j.a());
                    su0.c block19 = new su0.c(1, bVar6, com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b.class, "reloadPagerIfNeed", "reloadPagerIfNeed(Lcom/revolut/feature/shared_separate_favourites/api/combined_watchlist/SelectedAssetOutputData;)V", 0, 6);
                    Intrinsics.checkNotNullParameter(block19, "block");
                    viewControllerE14.H = block19;
                    return viewControllerE14;
                }
                if (step10 instanceof AllInsightsScreenContract$ModalStep.PublicationPrice) {
                    return bVar6.e1(((AllInsightsScreenContract$ModalStep.PublicationPrice) step10).f76429a);
                }
                if (!(step10 instanceof AllInsightsScreenContract$ModalStep.ShowInsight)) {
                    throw new NoWhenBranchMatchedException();
                }
                AllInsightsScreenContract$ModalStep.ShowInsight showInsight = (AllInsightsScreenContract$ModalStep.ShowInsight) step10;
                return bVar6.e1(new w08.a(showInsight.f76430a, showInsight.f76431b, showInsight.f76432c));
            case 17:
                return c(obj2, obj3);
            case 18:
                return d(obj2, obj3);
            case 19:
                return e(obj2, obj3);
            case 20:
                return g(obj2, obj3);
            case 21:
                return h(obj2, obj3);
            case 22:
                return i(obj2, obj3);
            case 23:
                return j(obj2, obj3);
            case 24:
                return k(obj2, obj3);
            case 25:
                return l(obj2, obj3);
            case 26:
                return m(obj2, obj3);
            case 27:
                return n(obj2, obj3);
            case 28:
                return o(obj2, obj3);
            default:
                BuyInPriceScreen buyInPriceScreen = (BuyInPriceScreen) obj5;
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = BuyInPriceScreen.V;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                MaskedTextInputEditText editText = field.getEditText();
                xi0.b bVar7 = buyInPriceScreen.K.d;
                l9f.y yVar2 = (l9f.y) buyInPriceScreen.R.getValue();
                switch (yVar2.f193237a) {
                    case 0:
                        bVarN = yVar2.f193239c.f193185g.n();
                        vc.s.j(bVarN);
                        break;
                    default:
                        bVarN = yVar2.f193239c.f193185g.n();
                        vc.s.j(bVarN);
                        break;
                }
                return new zp0.d(editText, bVar7, new u80.d(((s80.b) bVarN).b()), null, null, false, false, 0, false, null, 1944);
        }
    }

    public /* synthetic */ a(q qVar, t44.f fVar) {
        this.f265744a = 19;
        this.f265745b = fVar;
    }
}
