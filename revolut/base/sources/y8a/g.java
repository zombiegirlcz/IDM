package y8a;

import aii.q;
import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.feature.acquiring.lite_pos.api.navigation.SelectTaxRateScreenProvider$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.manage_tax_rates.ManageTaxRatesFlow;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.CategoryDetailsScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.CategoryDetailsScreenContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.CatalogueProductDetailsScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.ProductDetailsScreenContract$ModalStep;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.select_tax_rate.SelectTaxRateScreen;
import com.revolut.feature.apm.bills.core.api.model.form.MoneyField;
import com.revolut.feature.apm.bills.core.api.model.form.TextField;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoFlowInputData;
import com.revolut.feature.apm.upi.impl.flow.pending_payment.UpiPendingPaymentFlowContract$Step;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmation.ConfirmationScreen;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmed.ConfirmedScreen;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmed.ConfirmedScreenContract$InputData;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.subscription.UpiConfirmationScreen;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.subscription.UpiConfirmationScreenContract$InputData;
import com.revolut.feature.cash_topup.api.models.BarcodeDetails;
import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import com.revolut.feature.cash_topup.impl.data.repository.CashTopUpBarcodeRepository$Companion;
import com.revolut.feature.cash_topup.impl.ui.barcode.CashTopUpBarcodeScreen;
import com.revolut.feature.cash_topup.impl.ui.details.CashTopUpDetailsScreen;
import com.revolut.feature.cash_topup.impl.ui.details.CashTopUpDetailsScreenContract$InputData;
import com.revolut.feature.cash_topup.impl.ui.flow.barcode.CashTopUpBarcodeFlowContract$Step;
import com.revolut.feature.cash_topup.impl.ui.flow.barcode.dialog.CashTopupReportAnIssueBottomSheetScreen;
import com.revolut.feature.cash_topup.impl.ui.flow.delete_barcode.DeleteBarcodeConfirmationFlow;
import com.revolut.feature.cash_topup.impl.ui.flow.select_store.CashTopUpSelectStoreFlow;
import com.revolut.feature.cash_topup.impl.ui.instructions.CashTopupInstructionsScreen;
import com.revolut.feature.cash_topup.impl.ui.map.CashTopUpLocationsMapScreen;
import com.revolut.feature.cash_topup.impl.ui.map.CashTopUpLocationsMapScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.KontomatikSignInControllerContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.repayment_day.ChangeRepaymentDayScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.SepaDirectDebitSetUpContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.SepaDirectDebitSetUpContract$ModalStep;
import com.revolut.feature.credit.loan.autopay.api.account_selector.AccountSelectorV2$InputData;
import com.revolut.feature.credit.post_termination_plan.impl.ui.repay.PostTerminationPlanManualRepaymentController;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination;
import com.revolut.feature.junior_onboarding.impl.ui.app_invite.JuniorAppInviteFlowContract$Step;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow.ExchangeGlobalAccessFlow;
import com.revolut.feature.pay_bills_taxes.impl.ui.flow.PayBillsAndTaxesFlowContract$Step;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.PayBillsAndTaxesScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreen;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.pix.impl.flow.alias_registration.AliasRegistrationContract$Step;
import com.revolut.feature.pix.impl.flow.alias_registration.screens.input_alias.InputAliasScreen;
import com.revolut.feature.pix.impl.flow.alias_registration.screens.registration_status.AliasRegistrationStatusScreen;
import com.revolut.feature.pix.impl.flow.alias_registration.screens.select_type.SelectTypeScreen;
import com.revolut.feature.pix.impl.flow.migrate_alias.MigrateAliasContract$InputData;
import com.revolut.feature.pix.impl.flow.migrate_alias.MigrateAliasFlow;
import com.revolut.feature.pix.screens.token_verification.TokenVerificationScreen;
import com.revolut.feature.pix.screens.transfer_input_key.PixTransferInputKeyScreen;
import com.revolut.feature.pockets.api.ui.add_new.AddNewPocketContract$InputData;
import com.revolut.feature.pockets.impl.ui.add_new.AddNewPocketFlow;
import com.revolut.feature.pockets.impl.ui.add_new.AddNewPocketFlowContract$Step;
import com.revolut.feature.pockets.impl.ui.add_new.OpenNewPocketFlowContract$InputData;
import com.revolut.feature.pockets.impl.ui.add_new.OpenNewPocketFlowContract$Step;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.referrals.code.data.api.ReferrerDetails;
import com.revolut.feature.referrals.code.data.api.ReferrerDetailsState;
import com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow.DepositAssetsFlowContract$Step;
import com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.screen.DepositAssetsScreen;
import com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.screen.DepositAssetsScreenContract$Input;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertRevampedScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreen;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsBookingDetailsParams;
import com.revolut.feature.travel.hotels.impl.model.property.HotelsPropertyInputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.TravelHotelsBookingAmendmentFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.TravelHotelsBookingAmendmentFlowContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.checkout.TravelHotelsCheckoutFlowContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlowContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlowContract$PagerItem;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.TravelHotelsFlowContract$Step;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.TravelHotelsFlowContract$Step$DatesPicker$InFlow;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.TravelHotelsFlowContract$Step$DatesPicker$Modal;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.TravelHotelsHomeBookingsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.TravelHotelsHomeBookingsScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.TravelHotelsBookingDetailsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.pastcancelled.TravelHotelsBookingsPastAndCancelledScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.TravelHotelsCampaignsHubScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.TravelHotelsCampaignsHubScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$Mode;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid.TravelHotelsFavoritesGridScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.TravelHotelsLocationPickerScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.TravelHotelsLocationPickerScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.map_preview.TravelHotelsPropertyMapPreviewScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.map_preview.TravelHotelsPropertyMapPreviewScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.dates.TravelHotelsDatesPickerScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.TravelHotelsGuestPickerScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.TravelHotelsGuestPickerScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.TravelHotelsPriceBreakdownScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.policies.TravelHotelsPropertyPoliciesScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.policies.TravelHotelsPropertyPoliciesScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.details.common.TravelHotelsRoomDetailsScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.suggested_experiences.TravelHotelsSuggestedExperiencesScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.suggested_experiences.TravelHotelsSuggestedExperiencesScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.TravelHotelsTravellerInformationEditScreen;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.CompositeAddMoneyScreenContract$FlowStep;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.WealthAddMoneyScreen;
import com.revolut.feature_retail_user_declarations.email.screen.EmailScreenContract$ModalStep;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositFlowContract$Step;
import com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.CryptoDirectDepositProductArticleKey;
import com.revolut.retail.feature.pending_payments.impl.common.PendingPaymentBottomSheetInputData;
import com.revolut.retail.feature.pending_payments.impl.ui.bottom_sheet.PendingPaymentBottomSheetFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlowContract$UiConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending.PlanGiftSendingFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending.PlanGiftSendingFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.PlanLayoutType;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import dd1.a;
import defpackage.e1;
import ebg.g;
import grl.k9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import mii.k;
import mx0.c7;
import oc3.m;
import og2.h;
import sb3.i;
import skm.a2;
import tg2.f;
import uag.j;
import uag.n;
import v62.e;
import vb3.l;
import vc.s;
import vfg.p;
import vkm.j2;
import xlb.o;
import y20.a1;
import y7k.g0;
import ybh.x;
import yff.m;
import yji.l;
import yki.i;
import zhm.d0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;
import zp0.y;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f311648b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f311647a = i;
        this.f311648b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        final com.revolut.feature.apm.upi.impl.flow.pending_payment.a aVar = (com.revolut.feature.apm.upi.impl.flow.pending_payment.a) this.f311648b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        UpiPendingPaymentFlowContract$Step step = (UpiPendingPaymentFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof UpiPendingPaymentFlowContract$Step.ConfirmationScreen) {
            ConfirmationScreen confirmationScreen = new ConfirmationScreen(((UpiPendingPaymentFlowContract$Step.ConfirmationScreen) step).f62994a);
            final int i = 0;
            Function1 block = new Function1() { // from class: yf2.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            h result = (h) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof og2.e;
                            com.revolut.feature.apm.upi.impl.flow.pending_payment.a aVar2 = aVar;
                            if (z) {
                                oki.h.t2(aVar2, aVar2.f62999r, new UpiPendingPaymentFlowContract$Step.ConfirmedScreen(((og2.e) result).f224999a), false, null, false, 12);
                            } else if (Intrinsics.f(result, og2.f.f225000a)) {
                                l.a1(aVar2, aVar2.X1(new k("REJECTED_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.apm_payment_confirmation_status_title_rejected, null, null, 14), null, null, null, 28)), null, null, new g(aVar2, null, 1), 3);
                            } else {
                                if (!Intrinsics.f(result, og2.g.f225001a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.D2(aVar2.f62999r);
                            }
                            return Unit.f186387a;
                        default:
                            tg2.f result2 = (tg2.f) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean z3 = result2 instanceof tg2.e;
                            com.revolut.feature.apm.upi.impl.flow.pending_payment.a aVar3 = aVar;
                            if (z3) {
                                oki.h.t2(aVar3, aVar3.f62999r, new UpiPendingPaymentFlowContract$Step.ConfirmedScreen(((tg2.e) result2).f271043a), false, null, false, 12);
                            } else {
                                if (!Intrinsics.f(result2, f.a.f271044a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.D2(aVar3.f62999r);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            confirmationScreen.H = block;
            return confirmationScreen;
        }
        if (step instanceof UpiPendingPaymentFlowContract$Step.SubscriptionConfirmationScreen) {
            UpiConfirmationScreen upiConfirmationScreen = new UpiConfirmationScreen(new UpiConfirmationScreenContract$InputData(((UpiPendingPaymentFlowContract$Step.SubscriptionConfirmationScreen) step).f62996a));
            final int i2 = 1;
            Function1 block2 = new Function1() { // from class: yf2.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i2) {
                        case 0:
                            h result = (h) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z = result instanceof og2.e;
                            com.revolut.feature.apm.upi.impl.flow.pending_payment.a aVar2 = aVar;
                            if (z) {
                                oki.h.t2(aVar2, aVar2.f62999r, new UpiPendingPaymentFlowContract$Step.ConfirmedScreen(((og2.e) result).f224999a), false, null, false, 12);
                            } else if (Intrinsics.f(result, og2.f.f225000a)) {
                                l.a1(aVar2, aVar2.X1(new k("REJECTED_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.apm_payment_confirmation_status_title_rejected, null, null, 14), null, null, null, 28)), null, null, new g(aVar2, null, 1), 3);
                            } else {
                                if (!Intrinsics.f(result, og2.g.f225001a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.D2(aVar2.f62999r);
                            }
                            return Unit.f186387a;
                        default:
                            tg2.f result2 = (tg2.f) obj4;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            boolean z3 = result2 instanceof tg2.e;
                            com.revolut.feature.apm.upi.impl.flow.pending_payment.a aVar3 = aVar;
                            if (z3) {
                                oki.h.t2(aVar3, aVar3.f62999r, new UpiPendingPaymentFlowContract$Step.ConfirmedScreen(((tg2.e) result2).f271043a), false, null, false, 12);
                            } else {
                                if (!Intrinsics.f(result2, f.a.f271044a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.D2(aVar3.f62999r);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            upiConfirmationScreen.H = block2;
            return upiConfirmationScreen;
        }
        if (!(step instanceof UpiPendingPaymentFlowContract$Step.ConfirmedScreen)) {
            throw new NoWhenBranchMatchedException();
        }
        ConfirmedScreen confirmedScreen = new ConfirmedScreen(new ConfirmedScreenContract$InputData(((UpiPendingPaymentFlowContract$Step.ConfirmedScreen) step).f62995a));
        dph.c block3 = new dph.c(aVar, LazyFlowCoordinator, 28);
        Intrinsics.checkNotNullParameter(block3, "block");
        confirmedScreen.H = block3;
        return confirmedScreen;
    }

    private final Object b(Object obj2, Object obj3) {
        yf4.l lVar = (yf4.l) this.f311648b;
        Function1 getDefaultErrorItems = (Function1) obj3;
        Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
        List list = (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null));
        int i = com.revolut.feature.credit.core.R$string.credit_application_offer_change_repayment_day_title;
        ChangeRepaymentDayScreenContract$InputData changeRepaymentDayScreenContract$InputData = lVar.f313184b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(changeRepaymentDayScreenContract$InputData.f68157a.f155547a), null, 12);
        hu3.a aVar = changeRepaymentDayScreenContract$InputData.f68157a;
        return new yf4.h(textLocalisedClause, new TextClause(aVar.f155548b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_offer_change_repayment_day_confirm, u.c(aVar.f155550g), null, 12), new c7(new TextClause(aVar.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 6), false, false, list);
    }

    private final Object c(Object obj2, Object obj3) {
        final com.revolut.feature.pay_bills_taxes.impl.ui.flow.b bVar = (com.revolut.feature.pay_bills_taxes.impl.ui.flow.b) this.f311648b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        PayBillsAndTaxesFlowContract$Step step = (PayBillsAndTaxesFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof PayBillsAndTaxesFlowContract$Step.Screen) {
            PayBillsAndTaxesScreen payBillsAndTaxesScreen = new PayBillsAndTaxesScreen();
            final int i = 1;
            Function1 block = new Function1() { // from class: yf9.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            com.revolut.feature.pay_bills_taxes.impl.ui.flow.b bVar2 = bVar;
                            i iVar = bVar2.f78695q;
                            v62.f output = (v62.f) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof v62.d) {
                                oki.h.D2(iVar);
                            } else {
                                if (!(output instanceof e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((e) output).f286317a instanceof MultibancoRegistrationStatus.Registered) {
                                    oki.h.u2(bVar2, iVar, PayBillsAndTaxesFlowContract$Step.Screen.f78693a, null, 6);
                                } else {
                                    oki.h.D2(iVar);
                                }
                            }
                            return Unit.f186387a;
                        default:
                            q it8 = (q) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            oki.h.D2(bVar.f78695q);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            payBillsAndTaxesScreen.H = block;
            return payBillsAndTaxesScreen;
        }
        if (!(step instanceof PayBillsAndTaxesFlowContract$Step.Registration)) {
            throw new NoWhenBranchMatchedException();
        }
        if (yf9.c.f313203a[((PayBillsAndTaxesFlowContract$Step.Registration) step).f78692a.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        ViewController viewControllerE1 = bVar.e1(new v62.c(new MultibancoFlowInputData(MultibancoFlowInputData.StartType.CheckRegistration.f62548a)));
        final int i2 = 0;
        Function1 block2 = new Function1() { // from class: yf9.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        com.revolut.feature.pay_bills_taxes.impl.ui.flow.b bVar2 = bVar;
                        i iVar = bVar2.f78695q;
                        v62.f output = (v62.f) obj4;
                        Intrinsics.checkNotNullParameter(output, "output");
                        if (output instanceof v62.d) {
                            oki.h.D2(iVar);
                        } else {
                            if (!(output instanceof e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (((e) output).f286317a instanceof MultibancoRegistrationStatus.Registered) {
                                oki.h.u2(bVar2, iVar, PayBillsAndTaxesFlowContract$Step.Screen.f78693a, null, 6);
                            } else {
                                oki.h.D2(iVar);
                            }
                        }
                        return Unit.f186387a;
                    default:
                        q it8 = (q) obj4;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        oki.h.D2(bVar.f78695q);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        viewControllerE1.H = block2;
        return viewControllerE1;
    }

    private final Object d(Object obj2, Object obj3) {
        yff.g gVar = (yff.g) this.f311648b;
        Throwable th10 = (Throwable) obj2;
        Function1 defaultItemsFactory = (Function1) obj3;
        Intrinsics.checkNotNullParameter(defaultItemsFactory, "defaultItemsFactory");
        return th10 != null ? (List) defaultItemsFactory.invoke(new iii.d(14, null, true, false, null)) : m.c(gVar.f313337a, gVar.f313338b, gVar.f);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    private final Object e(Object obj2, Object obj3) throws IOException {
        SubformScreen subformScreen = (SubformScreen) this.f311648b;
        InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
        InputText field = (InputText) obj3;
        KProperty[] kPropertyArr = SubformScreen.V;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(field, "field");
        Object obj4 = model.P;
        if (!(obj4 instanceof TextField)) {
            if (obj4 instanceof MoneyField) {
                return new zp0.d(field.getInnerEditText(), ((MoneyField) obj4).e, (u80.d) subformScreen.Q.getValue(), null, new yg9.c(subformScreen, model), false, true, 0, false, null, 1960);
            }
            return null;
        }
        String str = ((TextField) obj4).f;
        if (str == null) {
            return null;
        }
        String str2 = model.f52580a;
        return new y(field.getInnerEditText(), null, str, new e1(subformScreen, model, 12), str2, of9.h.a(model, str), false, 66);
    }

    private final Object g(Object obj2, Object obj3) {
        final com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.a) this.f311648b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        SepaDirectDebitSetUpContract$ModalStep step = (SepaDirectDebitSetUpContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof SepaDirectDebitSetUpContract$ModalStep.SelectAccount) {
            SepaDirectDebitSetUpContract$InputData sepaDirectDebitSetUpContract$InputData = aVar.o;
            cli.y yVar = aVar.f68370s;
            w0 w0Var = sepaDirectDebitSetUpContract$InputData.f68364b;
            yh4.a aVar2 = (yh4.a) ((yh4.c) ((j2) yVar.f22677a).getValue()).f313751a.getContent();
            x35.e eVar = aVar2 != null ? aVar2.f313750b : null;
            yh4.a aVar3 = (yh4.a) ((yh4.c) ((j2) yVar.f22677a).getValue()).f313751a.getContent();
            dz3.c cVar = aVar3 != null ? aVar3.f313749a : null;
            ViewController viewControllerE1 = aVar.e1(new v35.a(new AccountSelectorV2$InputData(eVar, d0.i1(v.l(cVar != null ? cVar.f121234h.f306286a : null)), null, null, null, new AnalyticsContext(w0Var), 112)));
            final int i = 0;
            Function1 block = new Function1() { // from class: yh4.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            v35.b result = (v35.b) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.a aVar4 = aVar;
                            aVar4.H2(aVar4.f68370s, new wh4.v(result, 1));
                            return Unit.f186387a;
                        default:
                            dii.g outputData = (dii.g) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (outputData instanceof dii.e) {
                                aVar.C2(m.f313761a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (!(step instanceof SepaDirectDebitSetUpContract$ModalStep.WaitForCoBorrowerExplainer)) {
            throw new NoWhenBranchMatchedException();
        }
        uh4.a aVar4 = aVar.f68369r;
        dz3.a popup = ((SepaDirectDebitSetUpContract$ModalStep.WaitForCoBorrowerExplainer) step).f68366a;
        aVar4.getClass();
        Intrinsics.checkNotNullParameter(popup, "popup");
        int i2 = com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_popup_title;
        String str = popup.f121225a;
        String str2 = popup.d;
        lw0.a aVar5 = new lw0.a(new TextLocalisedClause(i2, u.c(str), null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_popup_description, u.c(popup.f121226b), null, 12), null, null, false, 28);
        String str3 = popup.f121227c;
        aw0.i eVar2 = (str3 == null || str3.length() == 0 || str2 == null || str2.length() == 0) ? (str3 == null || str3.length() == 0) ? null : new aw0.e(false, null, null, uh4.a.a(str3), null, null, 55) : new aw0.h(false, uh4.a.a(str3), new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_sepa_direct_debit_set_up_popup_secondary_button, u.c(str2), null, 12), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar5, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        final int i3 = 1;
        Function1 block2 = new Function1() { // from class: yh4.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i3) {
                    case 0:
                        v35.b result = (v35.b) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result == null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.a aVar42 = aVar;
                        aVar42.H2(aVar42.f68370s, new wh4.v(result, 1));
                        return Unit.f186387a;
                    default:
                        dii.g outputData = (dii.g) obj4;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        if (outputData instanceof dii.e) {
                            aVar.C2(m.f313761a);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        actionsBottomSheetController.H = block2;
        return actionsBottomSheetController;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object h(Object obj2, Object obj3) {
        eii.l lVar;
        eii.l lVar2;
        com.revolut.feature.junior_onboarding.impl.ui.app_invite.b bVar = (com.revolut.feature.junior_onboarding.impl.ui.app_invite.b) this.f311648b;
        JuniorOnboardingDestination.AppInvite.InputData inputData = bVar.o;
        yki.l FlowCoordinator = (yki.l) obj2;
        JuniorAppInviteFlowContract$Step step = (JuniorAppInviteFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, JuniorAppInviteFlowContract$Step.Prompt.f76982a)) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_app_sharing_prompt_title, u.c(inputData.f76961a), null, 12);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_app_sharing_prompt_subtitle, u.c(inputData.f76961a), null, 12);
            CdnImage cdnImageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D023", null, null, null, 30);
            PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_app_sharing_prompt_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
            PromptMarketingContentDelegate.Model.Button button2 = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_app_sharing_prompt_action_copy_link, null, null, 14), (ResourceImage) (0 == true ? 1 : 0), (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_app_sharing_prompt_hint, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
            k9 value = k9.Junior;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value, "value");
            PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(textLocalisedClause, textLocalisedClause2, cdnImageC, null, null, null, null, button, button2, null, null, null, new AnalyticsProduct.Retail(value), textLocalisedClause3, 52824));
            yh8.d block = new yh8.d(1, 0, com.revolut.feature.junior_onboarding.impl.ui.app_invite.b.class, bVar, "handlePromptMarketingControllerResult", "handlePromptMarketingControllerResult(Lcom/revolut/feature/full_screen_prompt/PromptMarketingScreenContract$Output;)V");
            Intrinsics.checkNotNullParameter(block, "block");
            promptMarketingScreen.H = block;
            return promptMarketingScreen;
        }
        if (Intrinsics.f(step, JuniorAppInviteFlowContract$Step.AppAccess.f76974a)) {
            return bVar.e1(new com.revolut.feature.junior_settings.api.navigation.a(inputData.f76962b));
        }
        if (!(step instanceof JuniorAppInviteFlowContract$Step.Description)) {
            throw new NoWhenBranchMatchedException();
        }
        lw0.a aVar = new lw0.a(new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_app_sharing_app_details_title, null, null, 14), null, null, null, false, 30);
        ai8.a aVar2 = bVar.f76987t;
        JuniorAppInviteFlowContract$Step.Description description = (JuniorAppInviteFlowContract$Step.Description) step;
        JuniorAppInviteFlowContract$Step.Description.CardProductState cardProductState = description.f76975a;
        JuniorAppInviteFlowContract$Step.Description.AdditionalProductState additionalProductState = description.f76976b;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(cardProductState, "cardProductState");
        Intrinsics.checkNotNullParameter(additionalProductState, "additionalProductState");
        int i = 6;
        boolean z = false;
        if (Intrinsics.f(cardProductState, JuniorAppInviteFlowContract$Step.Description.CardProductState.Enabled.f76981a)) {
            lVar = new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_app_sharing_app_details_item_card_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_app_sharing_app_details_item_card_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), false, false, (RowDelegate.Model.c) null, (Object) null, 488);
        } else {
            if (!Intrinsics.f(cardProductState, JuniorAppInviteFlowContract$Step.Description.CardProductState.Disabled.f76980a)) {
                throw new NoWhenBranchMatchedException();
            }
            lVar = new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_app_sharing_app_details_item_card_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_app_sharing_app_details_item_card_subtitle_alternative, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), false, false, (RowDelegate.Model.c) null, (Object) null, 488);
        }
        if (Intrinsics.f(additionalProductState, JuniorAppInviteFlowContract$Step.Description.AdditionalProductState.SavingsEnabled.f76978a)) {
            lVar2 = new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_app_sharing_app_details_item_saving_goal_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_app_sharing_app_details_item_saving_goal_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_savings_vault, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), false, false, (RowDelegate.Model.c) null, (Object) null, 488);
        } else if (Intrinsics.f(additionalProductState, JuniorAppInviteFlowContract$Step.Description.AdditionalProductState.VaultsEnabled.f76979a)) {
            lVar2 = new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_app_sharing_app_details_item_saving_goal_title_alternative, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_app_sharing_app_details_item_saving_goal_subtitle_alternative, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_wallet, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), false, false, (RowDelegate.Model.c) null, (Object) null, 488);
        } else {
            if (!Intrinsics.f(additionalProductState, JuniorAppInviteFlowContract$Step.Description.AdditionalProductState.Disabled.f76977a)) {
                throw new NoWhenBranchMatchedException();
            }
            lVar2 = null;
        }
        eii.l[] elements = {lVar, new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_app_sharing_app_details_item_analytics_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.junior_onboarding.impl.R$string.junior_app_sharing_app_details_item_analytics_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_pie_chart_circle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), false, false, (RowDelegate.Model.c) null, (Object) null, 488), lVar2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        k9 k9Var = k9.Junior;
        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
        return new RowActionsBottomSheetController(new eii.c(aVar, null, listL, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null));
    }

    /* JADX WARN: Type inference failed for: r1v162, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v179, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v187, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.q] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ReferrerDetails referrerDetails;
        Object obj4;
        qd0.b bVarN;
        Object obj5;
        int i = this.f311647a;
        int i2 = 12;
        final int i3 = 0;
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z6 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z29 = false;
        Object obj6 = this.f311648b;
        switch (i) {
            case 0:
                com.revolut.feature.pix.impl.flow.alias_registration.a aVar = (com.revolut.feature.pix.impl.flow.alias_registration.a) obj6;
                yki.l FlowCoordinator = (yki.l) obj2;
                AliasRegistrationContract$Step step = (AliasRegistrationContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, AliasRegistrationContract$Step.SelectType.f80580a)) {
                    SelectTypeScreen selectTypeScreen = new SelectTypeScreen();
                    o block = new o(1, aVar, com.revolut.feature.pix.impl.flow.alias_registration.a.class, "onSelectTypeResult", "onSelectTypeResult(Lcom/revolut/feature/pix/impl/flow/alias_registration/screens/select_type/SelectTypeScreenContract$Output;)V", 0, 20);
                    Intrinsics.checkNotNullParameter(block, "block");
                    selectTypeScreen.H = block;
                    return selectTypeScreen;
                }
                if (step instanceof AliasRegistrationContract$Step.InputAlias) {
                    InputAliasScreen inputAliasScreen = new InputAliasScreen(((AliasRegistrationContract$Step.InputAlias) step).f80577a);
                    o block2 = new o(1, aVar, com.revolut.feature.pix.impl.flow.alias_registration.a.class, "nextStepForType", "nextStepForType(Lcom/revolut/feature/pix/api/model/AliasRegistrationType;)V", 0, 21);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    inputAliasScreen.H = block2;
                    return inputAliasScreen;
                }
                if (step instanceof AliasRegistrationContract$Step.VerifyOwnership) {
                    TokenVerificationScreen tokenVerificationScreen = new TokenVerificationScreen(((AliasRegistrationContract$Step.VerifyOwnership) step).f80581a);
                    o block3 = new o(1, aVar, com.revolut.feature.pix.impl.flow.alias_registration.a.class, "onOtpInput", "onOtpInput(Lcom/revolut/feature/pix/screens/token_verification/TokenVerificationScreenContract$Output;)V", 0, 22);
                    Intrinsics.checkNotNullParameter(block3, "block");
                    tokenVerificationScreen.H = block3;
                    return tokenVerificationScreen;
                }
                if (step instanceof AliasRegistrationContract$Step.RegisterAlias) {
                    AliasRegistrationStatusScreen aliasRegistrationStatusScreen = new AliasRegistrationStatusScreen(((AliasRegistrationContract$Step.RegisterAlias) step).f80578a);
                    o block4 = new o(1, aVar, com.revolut.feature.pix.impl.flow.alias_registration.a.class, "handleAliasRegistrationResult", "handleAliasRegistrationResult(Lcom/revolut/feature/pix/api/model/AliasRegistrationResult;)V", 0, 23);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    aliasRegistrationStatusScreen.H = block4;
                    return aliasRegistrationStatusScreen;
                }
                if (!(step instanceof AliasRegistrationContract$Step.RequestPortability)) {
                    throw new NoWhenBranchMatchedException();
                }
                MigrateAliasFlow migrateAliasFlow = new MigrateAliasFlow(new MigrateAliasContract$InputData(aVar.o.f80574a, ((AliasRegistrationContract$Step.RequestPortability) step).f80579a));
                o block5 = new o(1, aVar, com.revolut.feature.pix.impl.flow.alias_registration.a.class, "onPortabilityRequestResult", "onPortabilityRequestResult(Lcom/revolut/feature/pix/impl/flow/migrate_alias/MigrateAliasContract$Output;)V", 0, 24);
                Intrinsics.checkNotNullParameter(block5, "block");
                migrateAliasFlow.H = block5;
                return migrateAliasFlow;
            case 1:
                ?? r62 = (kotlin.jvm.internal.q) obj6;
                lk0.f params = (lk0.f) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(params, "params");
                return rd0.e.c((Flow) r62.invoke(params, zBooleanValue ? w4l.i.f294643c : w4l.h.f294642c), kotlin.coroutines.g.f186406a);
            case 2:
                PostTerminationPlanManualRepaymentController postTerminationPlanManualRepaymentController = (PostTerminationPlanManualRepaymentController) obj6;
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = PostTerminationPlanManualRepaymentController.T;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj7 = data.f51981p;
                xi0.b bVar = obj7 instanceof ya5.g ? ((ya5.g) obj7).f311935a : null;
                if (bVar == null) {
                    return null;
                }
                return new zp0.d(field.getEditText(), bVar, (u80.d) postTerminationPlanManualRepaymentController.Q.getValue(), null, new ugc.a(postTerminationPlanManualRepaymentController, 20), false, false, 0, false, null, 1928);
            case 3:
                final com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b) obj6;
                final yki.b LazyFlowCoordinator = (yki.b) obj2;
                TravelHotelsFlowContract$Step step2 = (TravelHotelsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof TravelHotelsFlowContract$Step.Home) {
                    TravelHotelsFlowContract$Step.Home home = (TravelHotelsFlowContract$Step.Home) step2;
                    TravelHotelsHomeFlow travelHotelsHomeFlow = new TravelHotelsHomeFlow(new TravelHotelsHomeFlowContract$InputData(home.f93786a, home.f93787b));
                    final int i5 = 1;
                    Function1 block6 = new Function1() { // from class: yag.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i5) {
                                case 0:
                                    g output = (g) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof ebg.f) {
                                        oki.h.t2(bVar2, LazyFlowCoordinator, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((ebg.f) output).f124338a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else if (!(output instanceof g.b) && !(output instanceof g.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar3 = bVar2;
                                    i iVar = bVar3.f93798q;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a output2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z31 = output2 instanceof a.c;
                                    yki.b bVar4 = LazyFlowCoordinator;
                                    if (z31) {
                                        oki.h.t2(bVar3, bVar4, TravelHotelsFlowContract$Step.PastAndCancelledBookings.f93792a, true, null, false, 12);
                                    } else if (output2 instanceof a.b) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.LocationPicker(true), true, null, false, 12);
                                    } else if (output2 instanceof uag.o) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((uag.o) output2).f278648a, null, null, null, null, 30), false, false, 30)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else if (output2 instanceof uag.h) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((uag.h) output2).f278641a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else {
                                        boolean z41 = output2 instanceof a.d;
                                        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                        if (z41) {
                                            TravelHotelsFlowContract$Step.CheckoutFlow checkoutFlow = new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(null, 31, false, false));
                                            if (((a.d) output2).f93730a) {
                                                oki.h.w2(iVar, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), checkoutFlow), popup);
                                            } else {
                                                oki.h.t2(bVar3, bVar4, checkoutFlow, true, null, false, 12);
                                            }
                                        } else if (output2 instanceof uag.i) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step$DatesPicker$InFlow(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(((uag.i) output2).f278642a, false, false, 30))), true, null, false, 12);
                                        } else if (output2 instanceof n) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(((n) output2).f278647a, false, false, 30)), true, null, false, 12);
                                        } else if (output2 instanceof uag.k) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.DropOff(((uag.k) output2).f278644a, null)), true, null, false, 12);
                                        } else if (output2 instanceof a.C0566a) {
                                            oki.h.w2(iVar, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), 2), popup);
                                        } else if (output2 instanceof uag.m) {
                                            oki.h.w2(iVar, new TravelHotelsFlowContract$Step.GuestPicker(new TravelHotelsGuestPickerScreenContract$InputData(((uag.m) output2).f278646a)), popup);
                                        } else if (output2 instanceof uag.l) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.OpenFavoritesGrid(((uag.l) output2).f278645a), true, null, false, 12);
                                        } else {
                                            if (!(output2 instanceof j)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CampaignHub(new TravelHotelsCampaignsHubScreenContract$InputData.Campaign(((j) output2).f278643a)), true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    rcg.k output3 = (rcg.k) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z49 = output3 instanceof rcg.i;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar5 = bVar2;
                                    yki.b bVar6 = LazyFlowCoordinator;
                                    if (z49) {
                                        oki.h.t2(bVar5, bVar6, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((rcg.i) output3).f253258a, null, null, null, null, 30), false, false, 30)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else {
                                        if (!Intrinsics.f(output3, rcg.j.f253259a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.r2(bVar6);
                                        oki.h.t2(bVar5, bVar6, new TravelHotelsFlowContract$Step.Home(TravelHotelsHomeFlowContract$PagerItem.DISCOVER, 1), false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    mbg.d output4 = (mbg.d) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (!(output4 instanceof mbg.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(bVar2, LazyFlowCoordinator, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((mbg.c) output4).f204209a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    return Unit.f186387a;
                                case 4:
                                    tcg.m output5 = (tcg.m) obj8;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    boolean z54 = output5 instanceof tcg.j;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar7 = bVar2;
                                    yki.b bVar8 = LazyFlowCoordinator;
                                    if (z54) {
                                        oki.h.t2(bVar7, bVar8, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((tcg.j) output5).f269792a, null, null, null, null, 30), false, false, 30)), true, null, false, 12);
                                    } else if ((output5 instanceof tcg.k) || (output5 instanceof tcg.g) || (output5 instanceof tcg.i) || (output5 instanceof tcg.h)) {
                                        bVar7.B2();
                                        oki.h.w2(bVar7.f93798q, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), 2), ModalDestination.Style.POPUP.f98311a);
                                    } else {
                                        if (!(output5 instanceof tcg.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar7, bVar8, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(((tcg.l) output5).f269795a, 15, false, false)), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    sag.f output6 = (sag.f) obj8;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    boolean z74 = output6 instanceof sag.d;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar9 = bVar2;
                                    yki.b bVar10 = LazyFlowCoordinator;
                                    if (z74) {
                                        oki.h.t2(bVar9, bVar10, new TravelHotelsFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode.ManageCancellation(((sag.d) output6).f261399a))), true, null, false, 12);
                                    } else if (output6 instanceof sag.c) {
                                        sag.c cVar = (sag.c) output6;
                                        oki.h.t2(bVar9, bVar10, new TravelHotelsFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData(cVar.f261397a, cVar.f261398b))), true, null, false, 12);
                                    } else {
                                        if (!(output6 instanceof sag.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.w2(bVar9.f93798q, new TravelHotelsFlowContract$Step.PriceBreakdown(((sag.e) output6).f261400a), ModalDestination.Style.POPUP.f98311a);
                                    }
                                    return Unit.f186387a;
                                case 6:
                                    obg.i output7 = (obg.i) obj8;
                                    Intrinsics.checkNotNullParameter(output7, "output");
                                    boolean z83 = output7 instanceof obg.h;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar11 = bVar2;
                                    yki.b bVar12 = LazyFlowCoordinator;
                                    if (z83) {
                                        oki.h.t2(bVar11, bVar12, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(null, 31, false, false)), true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(output7, obg.g.f223942a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (bVar12.c()) {
                                            bVar11.B2();
                                        } else {
                                            oki.h.t2(bVar11, bVar12, new TravelHotelsFlowContract$Step.Home((TravelHotelsHomeFlowContract$PagerItem) null, 3), false, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    tag.i output8 = (tag.i) obj8;
                                    Intrinsics.checkNotNullParameter(output8, "output");
                                    boolean z89 = output8 instanceof tag.f;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar13 = bVar2;
                                    yki.b bVar14 = LazyFlowCoordinator;
                                    if (z89) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.Policies(((tag.f) output8).f269330a), true, null, false, 12);
                                    } else if (output8 instanceof tag.h) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.TravellerInfo(((tag.h) output8).f269332a), true, null, false, 12);
                                    } else if (output8 instanceof tag.g) {
                                        oki.h.w2(bVar13.f93798q, new TravelHotelsFlowContract$Step.PriceBreakdown(((tag.g) output8).f269331a), ModalDestination.Style.POPUP.f98311a);
                                    } else if (output8 instanceof tag.d) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.BookingDetails(((tag.d) output8).f269328a), false, null, false, 12);
                                    } else {
                                        if (!(output8 instanceof tag.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.MapPreview(((tag.e) output8).f269329a), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    travelHotelsHomeFlow.H = block6;
                    return travelHotelsHomeFlow;
                }
                if (step2 instanceof TravelHotelsFlowContract$Step.PastAndCancelledBookings) {
                    TravelHotelsBookingsPastAndCancelledScreen travelHotelsBookingsPastAndCancelledScreen = new TravelHotelsBookingsPastAndCancelledScreen();
                    final int i6 = 3;
                    Function1 function1 = new Function1() { // from class: yag.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i6) {
                                case 0:
                                    g output = (g) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof ebg.f) {
                                        oki.h.t2(bVar2, LazyFlowCoordinator, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((ebg.f) output).f124338a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else if (!(output instanceof g.b) && !(output instanceof g.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar3 = bVar2;
                                    i iVar = bVar3.f93798q;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a output2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z31 = output2 instanceof a.c;
                                    yki.b bVar4 = LazyFlowCoordinator;
                                    if (z31) {
                                        oki.h.t2(bVar3, bVar4, TravelHotelsFlowContract$Step.PastAndCancelledBookings.f93792a, true, null, false, 12);
                                    } else if (output2 instanceof a.b) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.LocationPicker(true), true, null, false, 12);
                                    } else if (output2 instanceof uag.o) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((uag.o) output2).f278648a, null, null, null, null, 30), false, false, 30)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else if (output2 instanceof uag.h) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((uag.h) output2).f278641a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else {
                                        boolean z41 = output2 instanceof a.d;
                                        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                        if (z41) {
                                            TravelHotelsFlowContract$Step.CheckoutFlow checkoutFlow = new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(null, 31, false, false));
                                            if (((a.d) output2).f93730a) {
                                                oki.h.w2(iVar, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), checkoutFlow), popup);
                                            } else {
                                                oki.h.t2(bVar3, bVar4, checkoutFlow, true, null, false, 12);
                                            }
                                        } else if (output2 instanceof uag.i) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step$DatesPicker$InFlow(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(((uag.i) output2).f278642a, false, false, 30))), true, null, false, 12);
                                        } else if (output2 instanceof n) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(((n) output2).f278647a, false, false, 30)), true, null, false, 12);
                                        } else if (output2 instanceof uag.k) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.DropOff(((uag.k) output2).f278644a, null)), true, null, false, 12);
                                        } else if (output2 instanceof a.C0566a) {
                                            oki.h.w2(iVar, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), 2), popup);
                                        } else if (output2 instanceof uag.m) {
                                            oki.h.w2(iVar, new TravelHotelsFlowContract$Step.GuestPicker(new TravelHotelsGuestPickerScreenContract$InputData(((uag.m) output2).f278646a)), popup);
                                        } else if (output2 instanceof uag.l) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.OpenFavoritesGrid(((uag.l) output2).f278645a), true, null, false, 12);
                                        } else {
                                            if (!(output2 instanceof j)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CampaignHub(new TravelHotelsCampaignsHubScreenContract$InputData.Campaign(((j) output2).f278643a)), true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    rcg.k output3 = (rcg.k) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z49 = output3 instanceof rcg.i;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar5 = bVar2;
                                    yki.b bVar6 = LazyFlowCoordinator;
                                    if (z49) {
                                        oki.h.t2(bVar5, bVar6, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((rcg.i) output3).f253258a, null, null, null, null, 30), false, false, 30)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else {
                                        if (!Intrinsics.f(output3, rcg.j.f253259a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.r2(bVar6);
                                        oki.h.t2(bVar5, bVar6, new TravelHotelsFlowContract$Step.Home(TravelHotelsHomeFlowContract$PagerItem.DISCOVER, 1), false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    mbg.d output4 = (mbg.d) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (!(output4 instanceof mbg.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(bVar2, LazyFlowCoordinator, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((mbg.c) output4).f204209a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    return Unit.f186387a;
                                case 4:
                                    tcg.m output5 = (tcg.m) obj8;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    boolean z54 = output5 instanceof tcg.j;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar7 = bVar2;
                                    yki.b bVar8 = LazyFlowCoordinator;
                                    if (z54) {
                                        oki.h.t2(bVar7, bVar8, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((tcg.j) output5).f269792a, null, null, null, null, 30), false, false, 30)), true, null, false, 12);
                                    } else if ((output5 instanceof tcg.k) || (output5 instanceof tcg.g) || (output5 instanceof tcg.i) || (output5 instanceof tcg.h)) {
                                        bVar7.B2();
                                        oki.h.w2(bVar7.f93798q, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), 2), ModalDestination.Style.POPUP.f98311a);
                                    } else {
                                        if (!(output5 instanceof tcg.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar7, bVar8, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(((tcg.l) output5).f269795a, 15, false, false)), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    sag.f output6 = (sag.f) obj8;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    boolean z74 = output6 instanceof sag.d;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar9 = bVar2;
                                    yki.b bVar10 = LazyFlowCoordinator;
                                    if (z74) {
                                        oki.h.t2(bVar9, bVar10, new TravelHotelsFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode.ManageCancellation(((sag.d) output6).f261399a))), true, null, false, 12);
                                    } else if (output6 instanceof sag.c) {
                                        sag.c cVar = (sag.c) output6;
                                        oki.h.t2(bVar9, bVar10, new TravelHotelsFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData(cVar.f261397a, cVar.f261398b))), true, null, false, 12);
                                    } else {
                                        if (!(output6 instanceof sag.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.w2(bVar9.f93798q, new TravelHotelsFlowContract$Step.PriceBreakdown(((sag.e) output6).f261400a), ModalDestination.Style.POPUP.f98311a);
                                    }
                                    return Unit.f186387a;
                                case 6:
                                    obg.i output7 = (obg.i) obj8;
                                    Intrinsics.checkNotNullParameter(output7, "output");
                                    boolean z83 = output7 instanceof obg.h;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar11 = bVar2;
                                    yki.b bVar12 = LazyFlowCoordinator;
                                    if (z83) {
                                        oki.h.t2(bVar11, bVar12, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(null, 31, false, false)), true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(output7, obg.g.f223942a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (bVar12.c()) {
                                            bVar11.B2();
                                        } else {
                                            oki.h.t2(bVar11, bVar12, new TravelHotelsFlowContract$Step.Home((TravelHotelsHomeFlowContract$PagerItem) null, 3), false, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    tag.i output8 = (tag.i) obj8;
                                    Intrinsics.checkNotNullParameter(output8, "output");
                                    boolean z89 = output8 instanceof tag.f;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar13 = bVar2;
                                    yki.b bVar14 = LazyFlowCoordinator;
                                    if (z89) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.Policies(((tag.f) output8).f269330a), true, null, false, 12);
                                    } else if (output8 instanceof tag.h) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.TravellerInfo(((tag.h) output8).f269332a), true, null, false, 12);
                                    } else if (output8 instanceof tag.g) {
                                        oki.h.w2(bVar13.f93798q, new TravelHotelsFlowContract$Step.PriceBreakdown(((tag.g) output8).f269331a), ModalDestination.Style.POPUP.f98311a);
                                    } else if (output8 instanceof tag.d) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.BookingDetails(((tag.d) output8).f269328a), false, null, false, 12);
                                    } else {
                                        if (!(output8 instanceof tag.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.MapPreview(((tag.e) output8).f269329a), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function1, "<set-?>");
                    travelHotelsBookingsPastAndCancelledScreen.H = function1;
                    return travelHotelsBookingsPastAndCancelledScreen;
                }
                if (step2 instanceof TravelHotelsFlowContract$Step.SuggestedExperiences) {
                    return new TravelHotelsSuggestedExperiencesScreen(new TravelHotelsSuggestedExperiencesScreenContract$InputData(((TravelHotelsFlowContract$Step.SuggestedExperiences) step2).f93795a));
                }
                if (step2 instanceof TravelHotelsFlowContract$Step.Policies) {
                    return new TravelHotelsPropertyPoliciesScreen(new TravelHotelsPropertyPoliciesScreenContract$InputData(((TravelHotelsFlowContract$Step.Policies) step2).f93793a));
                }
                if (step2 instanceof TravelHotelsFlowContract$Step.LocationPicker) {
                    TravelHotelsLocationPickerScreen travelHotelsLocationPickerScreen = new TravelHotelsLocationPickerScreen(new TravelHotelsLocationPickerScreenContract$InputData(((TravelHotelsFlowContract$Step.LocationPicker) step2).f93788a, false));
                    final int i21 = 4;
                    Function1 block7 = new Function1() { // from class: yag.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i21) {
                                case 0:
                                    g output = (g) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof ebg.f) {
                                        oki.h.t2(bVar2, LazyFlowCoordinator, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((ebg.f) output).f124338a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else if (!(output instanceof g.b) && !(output instanceof g.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar3 = bVar2;
                                    i iVar = bVar3.f93798q;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a output2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z31 = output2 instanceof a.c;
                                    yki.b bVar4 = LazyFlowCoordinator;
                                    if (z31) {
                                        oki.h.t2(bVar3, bVar4, TravelHotelsFlowContract$Step.PastAndCancelledBookings.f93792a, true, null, false, 12);
                                    } else if (output2 instanceof a.b) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.LocationPicker(true), true, null, false, 12);
                                    } else if (output2 instanceof uag.o) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((uag.o) output2).f278648a, null, null, null, null, 30), false, false, 30)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else if (output2 instanceof uag.h) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((uag.h) output2).f278641a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else {
                                        boolean z41 = output2 instanceof a.d;
                                        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                        if (z41) {
                                            TravelHotelsFlowContract$Step.CheckoutFlow checkoutFlow = new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(null, 31, false, false));
                                            if (((a.d) output2).f93730a) {
                                                oki.h.w2(iVar, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), checkoutFlow), popup);
                                            } else {
                                                oki.h.t2(bVar3, bVar4, checkoutFlow, true, null, false, 12);
                                            }
                                        } else if (output2 instanceof uag.i) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step$DatesPicker$InFlow(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(((uag.i) output2).f278642a, false, false, 30))), true, null, false, 12);
                                        } else if (output2 instanceof n) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(((n) output2).f278647a, false, false, 30)), true, null, false, 12);
                                        } else if (output2 instanceof uag.k) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.DropOff(((uag.k) output2).f278644a, null)), true, null, false, 12);
                                        } else if (output2 instanceof a.C0566a) {
                                            oki.h.w2(iVar, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), 2), popup);
                                        } else if (output2 instanceof uag.m) {
                                            oki.h.w2(iVar, new TravelHotelsFlowContract$Step.GuestPicker(new TravelHotelsGuestPickerScreenContract$InputData(((uag.m) output2).f278646a)), popup);
                                        } else if (output2 instanceof uag.l) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.OpenFavoritesGrid(((uag.l) output2).f278645a), true, null, false, 12);
                                        } else {
                                            if (!(output2 instanceof j)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CampaignHub(new TravelHotelsCampaignsHubScreenContract$InputData.Campaign(((j) output2).f278643a)), true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    rcg.k output3 = (rcg.k) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z49 = output3 instanceof rcg.i;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar5 = bVar2;
                                    yki.b bVar6 = LazyFlowCoordinator;
                                    if (z49) {
                                        oki.h.t2(bVar5, bVar6, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((rcg.i) output3).f253258a, null, null, null, null, 30), false, false, 30)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else {
                                        if (!Intrinsics.f(output3, rcg.j.f253259a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.r2(bVar6);
                                        oki.h.t2(bVar5, bVar6, new TravelHotelsFlowContract$Step.Home(TravelHotelsHomeFlowContract$PagerItem.DISCOVER, 1), false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    mbg.d output4 = (mbg.d) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (!(output4 instanceof mbg.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(bVar2, LazyFlowCoordinator, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((mbg.c) output4).f204209a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    return Unit.f186387a;
                                case 4:
                                    tcg.m output5 = (tcg.m) obj8;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    boolean z54 = output5 instanceof tcg.j;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar7 = bVar2;
                                    yki.b bVar8 = LazyFlowCoordinator;
                                    if (z54) {
                                        oki.h.t2(bVar7, bVar8, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((tcg.j) output5).f269792a, null, null, null, null, 30), false, false, 30)), true, null, false, 12);
                                    } else if ((output5 instanceof tcg.k) || (output5 instanceof tcg.g) || (output5 instanceof tcg.i) || (output5 instanceof tcg.h)) {
                                        bVar7.B2();
                                        oki.h.w2(bVar7.f93798q, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), 2), ModalDestination.Style.POPUP.f98311a);
                                    } else {
                                        if (!(output5 instanceof tcg.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar7, bVar8, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(((tcg.l) output5).f269795a, 15, false, false)), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    sag.f output6 = (sag.f) obj8;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    boolean z74 = output6 instanceof sag.d;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar9 = bVar2;
                                    yki.b bVar10 = LazyFlowCoordinator;
                                    if (z74) {
                                        oki.h.t2(bVar9, bVar10, new TravelHotelsFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode.ManageCancellation(((sag.d) output6).f261399a))), true, null, false, 12);
                                    } else if (output6 instanceof sag.c) {
                                        sag.c cVar = (sag.c) output6;
                                        oki.h.t2(bVar9, bVar10, new TravelHotelsFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData(cVar.f261397a, cVar.f261398b))), true, null, false, 12);
                                    } else {
                                        if (!(output6 instanceof sag.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.w2(bVar9.f93798q, new TravelHotelsFlowContract$Step.PriceBreakdown(((sag.e) output6).f261400a), ModalDestination.Style.POPUP.f98311a);
                                    }
                                    return Unit.f186387a;
                                case 6:
                                    obg.i output7 = (obg.i) obj8;
                                    Intrinsics.checkNotNullParameter(output7, "output");
                                    boolean z83 = output7 instanceof obg.h;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar11 = bVar2;
                                    yki.b bVar12 = LazyFlowCoordinator;
                                    if (z83) {
                                        oki.h.t2(bVar11, bVar12, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(null, 31, false, false)), true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(output7, obg.g.f223942a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (bVar12.c()) {
                                            bVar11.B2();
                                        } else {
                                            oki.h.t2(bVar11, bVar12, new TravelHotelsFlowContract$Step.Home((TravelHotelsHomeFlowContract$PagerItem) null, 3), false, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    tag.i output8 = (tag.i) obj8;
                                    Intrinsics.checkNotNullParameter(output8, "output");
                                    boolean z89 = output8 instanceof tag.f;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar13 = bVar2;
                                    yki.b bVar14 = LazyFlowCoordinator;
                                    if (z89) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.Policies(((tag.f) output8).f269330a), true, null, false, 12);
                                    } else if (output8 instanceof tag.h) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.TravellerInfo(((tag.h) output8).f269332a), true, null, false, 12);
                                    } else if (output8 instanceof tag.g) {
                                        oki.h.w2(bVar13.f93798q, new TravelHotelsFlowContract$Step.PriceBreakdown(((tag.g) output8).f269331a), ModalDestination.Style.POPUP.f98311a);
                                    } else if (output8 instanceof tag.d) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.BookingDetails(((tag.d) output8).f269328a), false, null, false, 12);
                                    } else {
                                        if (!(output8 instanceof tag.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.MapPreview(((tag.e) output8).f269329a), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    travelHotelsLocationPickerScreen.H = block7;
                    return travelHotelsLocationPickerScreen;
                }
                if (step2 instanceof TravelHotelsFlowContract$Step.TravellerInfo) {
                    return new TravelHotelsTravellerInformationEditScreen(((TravelHotelsFlowContract$Step.TravellerInfo) step2).f93796a);
                }
                if (step2 instanceof TravelHotelsFlowContract$Step.BookingDetails) {
                    TravelHotelsBookingDetailsScreen travelHotelsBookingDetailsScreen = new TravelHotelsBookingDetailsScreen(((TravelHotelsFlowContract$Step.BookingDetails) step2).f93777a);
                    yag.c block8 = new yag.c(bVar2, LazyFlowCoordinator, step2);
                    Intrinsics.checkNotNullParameter(block8, "block");
                    travelHotelsBookingDetailsScreen.H = block8;
                    return travelHotelsBookingDetailsScreen;
                }
                if (step2 instanceof TravelHotelsFlowContract$Step.BookingAmendment) {
                    TravelHotelsBookingAmendmentFlow travelHotelsBookingAmendmentFlow = new TravelHotelsBookingAmendmentFlow(new TravelHotelsBookingAmendmentFlowContract$InputData(((TravelHotelsFlowContract$Step.BookingAmendment) step2).f93776a));
                    final int i22 = 5;
                    Function1 block9 = new Function1() { // from class: yag.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i22) {
                                case 0:
                                    g output = (g) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof ebg.f) {
                                        oki.h.t2(bVar2, LazyFlowCoordinator, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((ebg.f) output).f124338a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else if (!(output instanceof g.b) && !(output instanceof g.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar3 = bVar2;
                                    i iVar = bVar3.f93798q;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a output2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z31 = output2 instanceof a.c;
                                    yki.b bVar4 = LazyFlowCoordinator;
                                    if (z31) {
                                        oki.h.t2(bVar3, bVar4, TravelHotelsFlowContract$Step.PastAndCancelledBookings.f93792a, true, null, false, 12);
                                    } else if (output2 instanceof a.b) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.LocationPicker(true), true, null, false, 12);
                                    } else if (output2 instanceof uag.o) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((uag.o) output2).f278648a, null, null, null, null, 30), false, false, 30)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else if (output2 instanceof uag.h) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((uag.h) output2).f278641a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else {
                                        boolean z41 = output2 instanceof a.d;
                                        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                        if (z41) {
                                            TravelHotelsFlowContract$Step.CheckoutFlow checkoutFlow = new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(null, 31, false, false));
                                            if (((a.d) output2).f93730a) {
                                                oki.h.w2(iVar, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), checkoutFlow), popup);
                                            } else {
                                                oki.h.t2(bVar3, bVar4, checkoutFlow, true, null, false, 12);
                                            }
                                        } else if (output2 instanceof uag.i) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step$DatesPicker$InFlow(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(((uag.i) output2).f278642a, false, false, 30))), true, null, false, 12);
                                        } else if (output2 instanceof n) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(((n) output2).f278647a, false, false, 30)), true, null, false, 12);
                                        } else if (output2 instanceof uag.k) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.DropOff(((uag.k) output2).f278644a, null)), true, null, false, 12);
                                        } else if (output2 instanceof a.C0566a) {
                                            oki.h.w2(iVar, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), 2), popup);
                                        } else if (output2 instanceof uag.m) {
                                            oki.h.w2(iVar, new TravelHotelsFlowContract$Step.GuestPicker(new TravelHotelsGuestPickerScreenContract$InputData(((uag.m) output2).f278646a)), popup);
                                        } else if (output2 instanceof uag.l) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.OpenFavoritesGrid(((uag.l) output2).f278645a), true, null, false, 12);
                                        } else {
                                            if (!(output2 instanceof j)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CampaignHub(new TravelHotelsCampaignsHubScreenContract$InputData.Campaign(((j) output2).f278643a)), true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    rcg.k output3 = (rcg.k) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z49 = output3 instanceof rcg.i;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar5 = bVar2;
                                    yki.b bVar6 = LazyFlowCoordinator;
                                    if (z49) {
                                        oki.h.t2(bVar5, bVar6, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((rcg.i) output3).f253258a, null, null, null, null, 30), false, false, 30)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else {
                                        if (!Intrinsics.f(output3, rcg.j.f253259a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.r2(bVar6);
                                        oki.h.t2(bVar5, bVar6, new TravelHotelsFlowContract$Step.Home(TravelHotelsHomeFlowContract$PagerItem.DISCOVER, 1), false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    mbg.d output4 = (mbg.d) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (!(output4 instanceof mbg.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(bVar2, LazyFlowCoordinator, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((mbg.c) output4).f204209a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    return Unit.f186387a;
                                case 4:
                                    tcg.m output5 = (tcg.m) obj8;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    boolean z54 = output5 instanceof tcg.j;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar7 = bVar2;
                                    yki.b bVar8 = LazyFlowCoordinator;
                                    if (z54) {
                                        oki.h.t2(bVar7, bVar8, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((tcg.j) output5).f269792a, null, null, null, null, 30), false, false, 30)), true, null, false, 12);
                                    } else if ((output5 instanceof tcg.k) || (output5 instanceof tcg.g) || (output5 instanceof tcg.i) || (output5 instanceof tcg.h)) {
                                        bVar7.B2();
                                        oki.h.w2(bVar7.f93798q, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), 2), ModalDestination.Style.POPUP.f98311a);
                                    } else {
                                        if (!(output5 instanceof tcg.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar7, bVar8, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(((tcg.l) output5).f269795a, 15, false, false)), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    sag.f output6 = (sag.f) obj8;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    boolean z74 = output6 instanceof sag.d;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar9 = bVar2;
                                    yki.b bVar10 = LazyFlowCoordinator;
                                    if (z74) {
                                        oki.h.t2(bVar9, bVar10, new TravelHotelsFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode.ManageCancellation(((sag.d) output6).f261399a))), true, null, false, 12);
                                    } else if (output6 instanceof sag.c) {
                                        sag.c cVar = (sag.c) output6;
                                        oki.h.t2(bVar9, bVar10, new TravelHotelsFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData(cVar.f261397a, cVar.f261398b))), true, null, false, 12);
                                    } else {
                                        if (!(output6 instanceof sag.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.w2(bVar9.f93798q, new TravelHotelsFlowContract$Step.PriceBreakdown(((sag.e) output6).f261400a), ModalDestination.Style.POPUP.f98311a);
                                    }
                                    return Unit.f186387a;
                                case 6:
                                    obg.i output7 = (obg.i) obj8;
                                    Intrinsics.checkNotNullParameter(output7, "output");
                                    boolean z83 = output7 instanceof obg.h;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar11 = bVar2;
                                    yki.b bVar12 = LazyFlowCoordinator;
                                    if (z83) {
                                        oki.h.t2(bVar11, bVar12, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(null, 31, false, false)), true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(output7, obg.g.f223942a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (bVar12.c()) {
                                            bVar11.B2();
                                        } else {
                                            oki.h.t2(bVar11, bVar12, new TravelHotelsFlowContract$Step.Home((TravelHotelsHomeFlowContract$PagerItem) null, 3), false, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    tag.i output8 = (tag.i) obj8;
                                    Intrinsics.checkNotNullParameter(output8, "output");
                                    boolean z89 = output8 instanceof tag.f;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar13 = bVar2;
                                    yki.b bVar14 = LazyFlowCoordinator;
                                    if (z89) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.Policies(((tag.f) output8).f269330a), true, null, false, 12);
                                    } else if (output8 instanceof tag.h) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.TravellerInfo(((tag.h) output8).f269332a), true, null, false, 12);
                                    } else if (output8 instanceof tag.g) {
                                        oki.h.w2(bVar13.f93798q, new TravelHotelsFlowContract$Step.PriceBreakdown(((tag.g) output8).f269331a), ModalDestination.Style.POPUP.f98311a);
                                    } else if (output8 instanceof tag.d) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.BookingDetails(((tag.d) output8).f269328a), false, null, false, 12);
                                    } else {
                                        if (!(output8 instanceof tag.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.MapPreview(((tag.e) output8).f269329a), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block9, "block");
                    travelHotelsBookingAmendmentFlow.H = block9;
                    return travelHotelsBookingAmendmentFlow;
                }
                if (step2 instanceof TravelHotelsFlowContract$Step.CancellationPolicy) {
                    return new TravelHotelsCancellationPolicyScreen(((TravelHotelsFlowContract$Step.CancellationPolicy) step2).f93779a);
                }
                if (step2 instanceof TravelHotelsFlowContract$Step.CampaignHub) {
                    TravelHotelsCampaignsHubScreen travelHotelsCampaignsHubScreen = new TravelHotelsCampaignsHubScreen(((TravelHotelsFlowContract$Step.CampaignHub) step2).f93778a);
                    final int i32 = 6;
                    Function1 block10 = new Function1() { // from class: yag.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i32) {
                                case 0:
                                    g output = (g) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof ebg.f) {
                                        oki.h.t2(bVar2, LazyFlowCoordinator, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((ebg.f) output).f124338a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else if (!(output instanceof g.b) && !(output instanceof g.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar3 = bVar2;
                                    i iVar = bVar3.f93798q;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a output2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z31 = output2 instanceof a.c;
                                    yki.b bVar4 = LazyFlowCoordinator;
                                    if (z31) {
                                        oki.h.t2(bVar3, bVar4, TravelHotelsFlowContract$Step.PastAndCancelledBookings.f93792a, true, null, false, 12);
                                    } else if (output2 instanceof a.b) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.LocationPicker(true), true, null, false, 12);
                                    } else if (output2 instanceof uag.o) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((uag.o) output2).f278648a, null, null, null, null, 30), false, false, 30)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else if (output2 instanceof uag.h) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((uag.h) output2).f278641a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else {
                                        boolean z41 = output2 instanceof a.d;
                                        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                        if (z41) {
                                            TravelHotelsFlowContract$Step.CheckoutFlow checkoutFlow = new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(null, 31, false, false));
                                            if (((a.d) output2).f93730a) {
                                                oki.h.w2(iVar, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), checkoutFlow), popup);
                                            } else {
                                                oki.h.t2(bVar3, bVar4, checkoutFlow, true, null, false, 12);
                                            }
                                        } else if (output2 instanceof uag.i) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step$DatesPicker$InFlow(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(((uag.i) output2).f278642a, false, false, 30))), true, null, false, 12);
                                        } else if (output2 instanceof n) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(((n) output2).f278647a, false, false, 30)), true, null, false, 12);
                                        } else if (output2 instanceof uag.k) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.DropOff(((uag.k) output2).f278644a, null)), true, null, false, 12);
                                        } else if (output2 instanceof a.C0566a) {
                                            oki.h.w2(iVar, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), 2), popup);
                                        } else if (output2 instanceof uag.m) {
                                            oki.h.w2(iVar, new TravelHotelsFlowContract$Step.GuestPicker(new TravelHotelsGuestPickerScreenContract$InputData(((uag.m) output2).f278646a)), popup);
                                        } else if (output2 instanceof uag.l) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.OpenFavoritesGrid(((uag.l) output2).f278645a), true, null, false, 12);
                                        } else {
                                            if (!(output2 instanceof j)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CampaignHub(new TravelHotelsCampaignsHubScreenContract$InputData.Campaign(((j) output2).f278643a)), true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    rcg.k output3 = (rcg.k) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z49 = output3 instanceof rcg.i;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar5 = bVar2;
                                    yki.b bVar6 = LazyFlowCoordinator;
                                    if (z49) {
                                        oki.h.t2(bVar5, bVar6, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((rcg.i) output3).f253258a, null, null, null, null, 30), false, false, 30)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else {
                                        if (!Intrinsics.f(output3, rcg.j.f253259a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.r2(bVar6);
                                        oki.h.t2(bVar5, bVar6, new TravelHotelsFlowContract$Step.Home(TravelHotelsHomeFlowContract$PagerItem.DISCOVER, 1), false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    mbg.d output4 = (mbg.d) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (!(output4 instanceof mbg.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(bVar2, LazyFlowCoordinator, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((mbg.c) output4).f204209a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    return Unit.f186387a;
                                case 4:
                                    tcg.m output5 = (tcg.m) obj8;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    boolean z54 = output5 instanceof tcg.j;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar7 = bVar2;
                                    yki.b bVar8 = LazyFlowCoordinator;
                                    if (z54) {
                                        oki.h.t2(bVar7, bVar8, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((tcg.j) output5).f269792a, null, null, null, null, 30), false, false, 30)), true, null, false, 12);
                                    } else if ((output5 instanceof tcg.k) || (output5 instanceof tcg.g) || (output5 instanceof tcg.i) || (output5 instanceof tcg.h)) {
                                        bVar7.B2();
                                        oki.h.w2(bVar7.f93798q, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), 2), ModalDestination.Style.POPUP.f98311a);
                                    } else {
                                        if (!(output5 instanceof tcg.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar7, bVar8, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(((tcg.l) output5).f269795a, 15, false, false)), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    sag.f output6 = (sag.f) obj8;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    boolean z74 = output6 instanceof sag.d;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar9 = bVar2;
                                    yki.b bVar10 = LazyFlowCoordinator;
                                    if (z74) {
                                        oki.h.t2(bVar9, bVar10, new TravelHotelsFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode.ManageCancellation(((sag.d) output6).f261399a))), true, null, false, 12);
                                    } else if (output6 instanceof sag.c) {
                                        sag.c cVar = (sag.c) output6;
                                        oki.h.t2(bVar9, bVar10, new TravelHotelsFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData(cVar.f261397a, cVar.f261398b))), true, null, false, 12);
                                    } else {
                                        if (!(output6 instanceof sag.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.w2(bVar9.f93798q, new TravelHotelsFlowContract$Step.PriceBreakdown(((sag.e) output6).f261400a), ModalDestination.Style.POPUP.f98311a);
                                    }
                                    return Unit.f186387a;
                                case 6:
                                    obg.i output7 = (obg.i) obj8;
                                    Intrinsics.checkNotNullParameter(output7, "output");
                                    boolean z83 = output7 instanceof obg.h;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar11 = bVar2;
                                    yki.b bVar12 = LazyFlowCoordinator;
                                    if (z83) {
                                        oki.h.t2(bVar11, bVar12, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(null, 31, false, false)), true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(output7, obg.g.f223942a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (bVar12.c()) {
                                            bVar11.B2();
                                        } else {
                                            oki.h.t2(bVar11, bVar12, new TravelHotelsFlowContract$Step.Home((TravelHotelsHomeFlowContract$PagerItem) null, 3), false, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    tag.i output8 = (tag.i) obj8;
                                    Intrinsics.checkNotNullParameter(output8, "output");
                                    boolean z89 = output8 instanceof tag.f;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar13 = bVar2;
                                    yki.b bVar14 = LazyFlowCoordinator;
                                    if (z89) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.Policies(((tag.f) output8).f269330a), true, null, false, 12);
                                    } else if (output8 instanceof tag.h) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.TravellerInfo(((tag.h) output8).f269332a), true, null, false, 12);
                                    } else if (output8 instanceof tag.g) {
                                        oki.h.w2(bVar13.f93798q, new TravelHotelsFlowContract$Step.PriceBreakdown(((tag.g) output8).f269331a), ModalDestination.Style.POPUP.f98311a);
                                    } else if (output8 instanceof tag.d) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.BookingDetails(((tag.d) output8).f269328a), false, null, false, 12);
                                    } else {
                                        if (!(output8 instanceof tag.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.MapPreview(((tag.e) output8).f269329a), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block10, "block");
                    travelHotelsCampaignsHubScreen.H = block10;
                    return travelHotelsCampaignsHubScreen;
                }
                if (step2 instanceof TravelHotelsFlowContract$Step.CheckoutFlow) {
                    TravelHotelsCheckoutFlow travelHotelsCheckoutFlow = new TravelHotelsCheckoutFlow(((TravelHotelsFlowContract$Step.CheckoutFlow) step2).f93780a);
                    final int i33 = 7;
                    Function1 block11 = new Function1() { // from class: yag.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i33) {
                                case 0:
                                    g output = (g) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof ebg.f) {
                                        oki.h.t2(bVar2, LazyFlowCoordinator, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((ebg.f) output).f124338a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else if (!(output instanceof g.b) && !(output instanceof g.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar3 = bVar2;
                                    i iVar = bVar3.f93798q;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a output2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z31 = output2 instanceof a.c;
                                    yki.b bVar4 = LazyFlowCoordinator;
                                    if (z31) {
                                        oki.h.t2(bVar3, bVar4, TravelHotelsFlowContract$Step.PastAndCancelledBookings.f93792a, true, null, false, 12);
                                    } else if (output2 instanceof a.b) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.LocationPicker(true), true, null, false, 12);
                                    } else if (output2 instanceof uag.o) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((uag.o) output2).f278648a, null, null, null, null, 30), false, false, 30)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else if (output2 instanceof uag.h) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((uag.h) output2).f278641a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else {
                                        boolean z41 = output2 instanceof a.d;
                                        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                        if (z41) {
                                            TravelHotelsFlowContract$Step.CheckoutFlow checkoutFlow = new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(null, 31, false, false));
                                            if (((a.d) output2).f93730a) {
                                                oki.h.w2(iVar, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), checkoutFlow), popup);
                                            } else {
                                                oki.h.t2(bVar3, bVar4, checkoutFlow, true, null, false, 12);
                                            }
                                        } else if (output2 instanceof uag.i) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step$DatesPicker$InFlow(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(((uag.i) output2).f278642a, false, false, 30))), true, null, false, 12);
                                        } else if (output2 instanceof n) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(((n) output2).f278647a, false, false, 30)), true, null, false, 12);
                                        } else if (output2 instanceof uag.k) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.DropOff(((uag.k) output2).f278644a, null)), true, null, false, 12);
                                        } else if (output2 instanceof a.C0566a) {
                                            oki.h.w2(iVar, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), 2), popup);
                                        } else if (output2 instanceof uag.m) {
                                            oki.h.w2(iVar, new TravelHotelsFlowContract$Step.GuestPicker(new TravelHotelsGuestPickerScreenContract$InputData(((uag.m) output2).f278646a)), popup);
                                        } else if (output2 instanceof uag.l) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.OpenFavoritesGrid(((uag.l) output2).f278645a), true, null, false, 12);
                                        } else {
                                            if (!(output2 instanceof j)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CampaignHub(new TravelHotelsCampaignsHubScreenContract$InputData.Campaign(((j) output2).f278643a)), true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    rcg.k output3 = (rcg.k) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z49 = output3 instanceof rcg.i;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar5 = bVar2;
                                    yki.b bVar6 = LazyFlowCoordinator;
                                    if (z49) {
                                        oki.h.t2(bVar5, bVar6, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((rcg.i) output3).f253258a, null, null, null, null, 30), false, false, 30)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else {
                                        if (!Intrinsics.f(output3, rcg.j.f253259a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.r2(bVar6);
                                        oki.h.t2(bVar5, bVar6, new TravelHotelsFlowContract$Step.Home(TravelHotelsHomeFlowContract$PagerItem.DISCOVER, 1), false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    mbg.d output4 = (mbg.d) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (!(output4 instanceof mbg.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(bVar2, LazyFlowCoordinator, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((mbg.c) output4).f204209a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    return Unit.f186387a;
                                case 4:
                                    tcg.m output5 = (tcg.m) obj8;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    boolean z54 = output5 instanceof tcg.j;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar7 = bVar2;
                                    yki.b bVar8 = LazyFlowCoordinator;
                                    if (z54) {
                                        oki.h.t2(bVar7, bVar8, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((tcg.j) output5).f269792a, null, null, null, null, 30), false, false, 30)), true, null, false, 12);
                                    } else if ((output5 instanceof tcg.k) || (output5 instanceof tcg.g) || (output5 instanceof tcg.i) || (output5 instanceof tcg.h)) {
                                        bVar7.B2();
                                        oki.h.w2(bVar7.f93798q, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), 2), ModalDestination.Style.POPUP.f98311a);
                                    } else {
                                        if (!(output5 instanceof tcg.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar7, bVar8, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(((tcg.l) output5).f269795a, 15, false, false)), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    sag.f output6 = (sag.f) obj8;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    boolean z74 = output6 instanceof sag.d;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar9 = bVar2;
                                    yki.b bVar10 = LazyFlowCoordinator;
                                    if (z74) {
                                        oki.h.t2(bVar9, bVar10, new TravelHotelsFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode.ManageCancellation(((sag.d) output6).f261399a))), true, null, false, 12);
                                    } else if (output6 instanceof sag.c) {
                                        sag.c cVar = (sag.c) output6;
                                        oki.h.t2(bVar9, bVar10, new TravelHotelsFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData(cVar.f261397a, cVar.f261398b))), true, null, false, 12);
                                    } else {
                                        if (!(output6 instanceof sag.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.w2(bVar9.f93798q, new TravelHotelsFlowContract$Step.PriceBreakdown(((sag.e) output6).f261400a), ModalDestination.Style.POPUP.f98311a);
                                    }
                                    return Unit.f186387a;
                                case 6:
                                    obg.i output7 = (obg.i) obj8;
                                    Intrinsics.checkNotNullParameter(output7, "output");
                                    boolean z83 = output7 instanceof obg.h;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar11 = bVar2;
                                    yki.b bVar12 = LazyFlowCoordinator;
                                    if (z83) {
                                        oki.h.t2(bVar11, bVar12, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(null, 31, false, false)), true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(output7, obg.g.f223942a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (bVar12.c()) {
                                            bVar11.B2();
                                        } else {
                                            oki.h.t2(bVar11, bVar12, new TravelHotelsFlowContract$Step.Home((TravelHotelsHomeFlowContract$PagerItem) null, 3), false, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    tag.i output8 = (tag.i) obj8;
                                    Intrinsics.checkNotNullParameter(output8, "output");
                                    boolean z89 = output8 instanceof tag.f;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar13 = bVar2;
                                    yki.b bVar14 = LazyFlowCoordinator;
                                    if (z89) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.Policies(((tag.f) output8).f269330a), true, null, false, 12);
                                    } else if (output8 instanceof tag.h) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.TravellerInfo(((tag.h) output8).f269332a), true, null, false, 12);
                                    } else if (output8 instanceof tag.g) {
                                        oki.h.w2(bVar13.f93798q, new TravelHotelsFlowContract$Step.PriceBreakdown(((tag.g) output8).f269331a), ModalDestination.Style.POPUP.f98311a);
                                    } else if (output8 instanceof tag.d) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.BookingDetails(((tag.d) output8).f269328a), false, null, false, 12);
                                    } else {
                                        if (!(output8 instanceof tag.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.MapPreview(((tag.e) output8).f269329a), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    travelHotelsCheckoutFlow.H = block11;
                    return travelHotelsCheckoutFlow;
                }
                if (step2 instanceof TravelHotelsFlowContract$Step$DatesPicker$InFlow) {
                    TravelHotelsDatesPickerScreen travelHotelsDatesPickerScreen = new TravelHotelsDatesPickerScreen(((TravelHotelsFlowContract$Step$DatesPicker$InFlow) step2).f93781a);
                    yag.c block12 = new yag.c(step2, bVar2, LazyFlowCoordinator, 2);
                    Intrinsics.checkNotNullParameter(block12, "block");
                    travelHotelsDatesPickerScreen.H = block12;
                    return travelHotelsDatesPickerScreen;
                }
                if (step2 instanceof TravelHotelsFlowContract$Step$DatesPicker$Modal) {
                    TravelHotelsDatesPickerScreen travelHotelsDatesPickerScreen2 = new TravelHotelsDatesPickerScreen(((TravelHotelsFlowContract$Step$DatesPicker$Modal) step2).f93783a);
                    yag.c block13 = new yag.c(step2, bVar2, LazyFlowCoordinator, z3 ? 1 : 0);
                    Intrinsics.checkNotNullParameter(block13, "block");
                    travelHotelsDatesPickerScreen2.H = block13;
                    return travelHotelsDatesPickerScreen2;
                }
                if (step2 instanceof TravelHotelsFlowContract$Step.GuestPicker) {
                    return new TravelHotelsGuestPickerScreen(((TravelHotelsFlowContract$Step.GuestPicker) step2).f93785a);
                }
                if (step2 instanceof TravelHotelsFlowContract$Step.MapPreview) {
                    return new TravelHotelsPropertyMapPreviewScreen(new TravelHotelsPropertyMapPreviewScreenContract$InputData(((TravelHotelsFlowContract$Step.MapPreview) step2).f93789a));
                }
                if (step2 instanceof TravelHotelsFlowContract$Step.ActiveBookings) {
                    TravelHotelsHomeBookingsScreen travelHotelsHomeBookingsScreen = new TravelHotelsHomeBookingsScreen(new TravelHotelsHomeBookingsScreenContract$InputData(true));
                    final boolean z31 = z ? 1 : 0;
                    Function1 block14 = new Function1() { // from class: yag.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (z31) {
                                case 0:
                                    g output = (g) obj8;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof ebg.f) {
                                        oki.h.t2(bVar2, LazyFlowCoordinator, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((ebg.f) output).f124338a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else if (!(output instanceof g.b) && !(output instanceof g.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar3 = bVar2;
                                    i iVar = bVar3.f93798q;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a output2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a) obj8;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z312 = output2 instanceof a.c;
                                    yki.b bVar4 = LazyFlowCoordinator;
                                    if (z312) {
                                        oki.h.t2(bVar3, bVar4, TravelHotelsFlowContract$Step.PastAndCancelledBookings.f93792a, true, null, false, 12);
                                    } else if (output2 instanceof a.b) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.LocationPicker(true), true, null, false, 12);
                                    } else if (output2 instanceof uag.o) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((uag.o) output2).f278648a, null, null, null, null, 30), false, false, 30)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else if (output2 instanceof uag.h) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((uag.h) output2).f278641a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else {
                                        boolean z41 = output2 instanceof a.d;
                                        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                        if (z41) {
                                            TravelHotelsFlowContract$Step.CheckoutFlow checkoutFlow = new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(null, 31, false, false));
                                            if (((a.d) output2).f93730a) {
                                                oki.h.w2(iVar, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), checkoutFlow), popup);
                                            } else {
                                                oki.h.t2(bVar3, bVar4, checkoutFlow, true, null, false, 12);
                                            }
                                        } else if (output2 instanceof uag.i) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step$DatesPicker$InFlow(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(((uag.i) output2).f278642a, false, false, 30))), true, null, false, 12);
                                        } else if (output2 instanceof n) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(((n) output2).f278647a, false, false, 30)), true, null, false, 12);
                                        } else if (output2 instanceof uag.k) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.DropOff(((uag.k) output2).f278644a, null)), true, null, false, 12);
                                        } else if (output2 instanceof a.C0566a) {
                                            oki.h.w2(iVar, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), 2), popup);
                                        } else if (output2 instanceof uag.m) {
                                            oki.h.w2(iVar, new TravelHotelsFlowContract$Step.GuestPicker(new TravelHotelsGuestPickerScreenContract$InputData(((uag.m) output2).f278646a)), popup);
                                        } else if (output2 instanceof uag.l) {
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.OpenFavoritesGrid(((uag.l) output2).f278645a), true, null, false, 12);
                                        } else {
                                            if (!(output2 instanceof j)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CampaignHub(new TravelHotelsCampaignsHubScreenContract$InputData.Campaign(((j) output2).f278643a)), true, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    rcg.k output3 = (rcg.k) obj8;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    boolean z49 = output3 instanceof rcg.i;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar5 = bVar2;
                                    yki.b bVar6 = LazyFlowCoordinator;
                                    if (z49) {
                                        oki.h.t2(bVar5, bVar6, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((rcg.i) output3).f253258a, null, null, null, null, 30), false, false, 30)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    } else {
                                        if (!Intrinsics.f(output3, rcg.j.f253259a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.r2(bVar6);
                                        oki.h.t2(bVar5, bVar6, new TravelHotelsFlowContract$Step.Home(TravelHotelsHomeFlowContract$PagerItem.DISCOVER, 1), false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    mbg.d output4 = (mbg.d) obj8;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    if (!(output4 instanceof mbg.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(bVar2, LazyFlowCoordinator, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((mbg.c) output4).f204209a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                    return Unit.f186387a;
                                case 4:
                                    tcg.m output5 = (tcg.m) obj8;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    boolean z54 = output5 instanceof tcg.j;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar7 = bVar2;
                                    yki.b bVar8 = LazyFlowCoordinator;
                                    if (z54) {
                                        oki.h.t2(bVar7, bVar8, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((tcg.j) output5).f269792a, null, null, null, null, 30), false, false, 30)), true, null, false, 12);
                                    } else if ((output5 instanceof tcg.k) || (output5 instanceof tcg.g) || (output5 instanceof tcg.i) || (output5 instanceof tcg.h)) {
                                        bVar7.B2();
                                        oki.h.w2(bVar7.f93798q, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), 2), ModalDestination.Style.POPUP.f98311a);
                                    } else {
                                        if (!(output5 instanceof tcg.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar7, bVar8, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(((tcg.l) output5).f269795a, 15, false, false)), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 5:
                                    sag.f output6 = (sag.f) obj8;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    boolean z74 = output6 instanceof sag.d;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar9 = bVar2;
                                    yki.b bVar10 = LazyFlowCoordinator;
                                    if (z74) {
                                        oki.h.t2(bVar9, bVar10, new TravelHotelsFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode.ManageCancellation(((sag.d) output6).f261399a))), true, null, false, 12);
                                    } else if (output6 instanceof sag.c) {
                                        sag.c cVar = (sag.c) output6;
                                        oki.h.t2(bVar9, bVar10, new TravelHotelsFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData(cVar.f261397a, cVar.f261398b))), true, null, false, 12);
                                    } else {
                                        if (!(output6 instanceof sag.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.w2(bVar9.f93798q, new TravelHotelsFlowContract$Step.PriceBreakdown(((sag.e) output6).f261400a), ModalDestination.Style.POPUP.f98311a);
                                    }
                                    return Unit.f186387a;
                                case 6:
                                    obg.i output7 = (obg.i) obj8;
                                    Intrinsics.checkNotNullParameter(output7, "output");
                                    boolean z83 = output7 instanceof obg.h;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar11 = bVar2;
                                    yki.b bVar12 = LazyFlowCoordinator;
                                    if (z83) {
                                        oki.h.t2(bVar11, bVar12, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(null, 31, false, false)), true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(output7, obg.g.f223942a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (bVar12.c()) {
                                            bVar11.B2();
                                        } else {
                                            oki.h.t2(bVar11, bVar12, new TravelHotelsFlowContract$Step.Home((TravelHotelsHomeFlowContract$PagerItem) null, 3), false, null, false, 12);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    tag.i output8 = (tag.i) obj8;
                                    Intrinsics.checkNotNullParameter(output8, "output");
                                    boolean z89 = output8 instanceof tag.f;
                                    com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar13 = bVar2;
                                    yki.b bVar14 = LazyFlowCoordinator;
                                    if (z89) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.Policies(((tag.f) output8).f269330a), true, null, false, 12);
                                    } else if (output8 instanceof tag.h) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.TravellerInfo(((tag.h) output8).f269332a), true, null, false, 12);
                                    } else if (output8 instanceof tag.g) {
                                        oki.h.w2(bVar13.f93798q, new TravelHotelsFlowContract$Step.PriceBreakdown(((tag.g) output8).f269331a), ModalDestination.Style.POPUP.f98311a);
                                    } else if (output8 instanceof tag.d) {
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.BookingDetails(((tag.d) output8).f269328a), false, null, false, 12);
                                    } else {
                                        if (!(output8 instanceof tag.e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.MapPreview(((tag.e) output8).f269329a), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block14, "block");
                    travelHotelsHomeBookingsScreen.H = block14;
                    return travelHotelsHomeBookingsScreen;
                }
                if (step2 instanceof TravelHotelsFlowContract$Step.PriceBreakdown) {
                    return new TravelHotelsPriceBreakdownScreen(((TravelHotelsFlowContract$Step.PriceBreakdown) step2).f93794a);
                }
                if (step2 instanceof TravelHotelsFlowContract$Step.OptIn) {
                    ViewController viewControllerE1 = bVar2.e1(new hub.a(new LifestyleRevPointsOptInController$InputData((RevPointsOptInSource) RevPointsOptInSource.Stays.f84006a, false, 6)));
                    h block15 = new h(bVar2, 9);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    viewControllerE1.H = block15;
                    return viewControllerE1;
                }
                if (!(step2 instanceof TravelHotelsFlowContract$Step.OpenFavoritesGrid)) {
                    throw new NoWhenBranchMatchedException();
                }
                TravelHotelsFavoritesGridScreen travelHotelsFavoritesGridScreen = new TravelHotelsFavoritesGridScreen(((TravelHotelsFlowContract$Step.OpenFavoritesGrid) step2).f93790a);
                final int i43 = 2;
                Function1 block16 = new Function1() { // from class: yag.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        switch (i43) {
                            case 0:
                                g output = (g) obj8;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (output instanceof ebg.f) {
                                    oki.h.t2(bVar2, LazyFlowCoordinator, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((ebg.f) output).f124338a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                } else if (!(output instanceof g.b) && !(output instanceof g.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.f186387a;
                            case 1:
                                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar3 = bVar2;
                                i iVar = bVar3.f93798q;
                                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a output2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a) obj8;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                boolean z312 = output2 instanceof a.c;
                                yki.b bVar4 = LazyFlowCoordinator;
                                if (z312) {
                                    oki.h.t2(bVar3, bVar4, TravelHotelsFlowContract$Step.PastAndCancelledBookings.f93792a, true, null, false, 12);
                                } else if (output2 instanceof a.b) {
                                    oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.LocationPicker(true), true, null, false, 12);
                                } else if (output2 instanceof uag.o) {
                                    oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((uag.o) output2).f278648a, null, null, null, null, 30), false, false, 30)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                } else if (output2 instanceof uag.h) {
                                    oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((uag.h) output2).f278641a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                } else {
                                    boolean z41 = output2 instanceof a.d;
                                    ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                    if (z41) {
                                        TravelHotelsFlowContract$Step.CheckoutFlow checkoutFlow = new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(null, 31, false, false));
                                        if (((a.d) output2).f93730a) {
                                            oki.h.w2(iVar, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), checkoutFlow), popup);
                                        } else {
                                            oki.h.t2(bVar3, bVar4, checkoutFlow, true, null, false, 12);
                                        }
                                    } else if (output2 instanceof uag.i) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step$DatesPicker$InFlow(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(((uag.i) output2).f278642a, false, false, 30))), true, null, false, 12);
                                    } else if (output2 instanceof n) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(((n) output2).f278647a, false, false, 30)), true, null, false, 12);
                                    } else if (output2 instanceof uag.k) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.DropOff(((uag.k) output2).f278644a, null)), true, null, false, 12);
                                    } else if (output2 instanceof a.C0566a) {
                                        oki.h.w2(iVar, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), 2), popup);
                                    } else if (output2 instanceof uag.m) {
                                        oki.h.w2(iVar, new TravelHotelsFlowContract$Step.GuestPicker(new TravelHotelsGuestPickerScreenContract$InputData(((uag.m) output2).f278646a)), popup);
                                    } else if (output2 instanceof uag.l) {
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.OpenFavoritesGrid(((uag.l) output2).f278645a), true, null, false, 12);
                                    } else {
                                        if (!(output2 instanceof j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar3, bVar4, new TravelHotelsFlowContract$Step.CampaignHub(new TravelHotelsCampaignsHubScreenContract$InputData.Campaign(((j) output2).f278643a)), true, null, false, 12);
                                    }
                                }
                                return Unit.f186387a;
                            case 2:
                                rcg.k output3 = (rcg.k) obj8;
                                Intrinsics.checkNotNullParameter(output3, "output");
                                boolean z49 = output3 instanceof rcg.i;
                                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar5 = bVar2;
                                yki.b bVar6 = LazyFlowCoordinator;
                                if (z49) {
                                    oki.h.t2(bVar5, bVar6, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((rcg.i) output3).f253258a, null, null, null, null, 30), false, false, 30)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                } else {
                                    if (!Intrinsics.f(output3, rcg.j.f253259a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.r2(bVar6);
                                    oki.h.t2(bVar5, bVar6, new TravelHotelsFlowContract$Step.Home(TravelHotelsHomeFlowContract$PagerItem.DISCOVER, 1), false, null, false, 12);
                                }
                                return Unit.f186387a;
                            case 3:
                                mbg.d output4 = (mbg.d) obj8;
                                Intrinsics.checkNotNullParameter(output4, "output");
                                if (!(output4 instanceof mbg.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(bVar2, LazyFlowCoordinator, new TravelHotelsFlowContract$Step.BookingDetails(new TravelHotelsBookingDetailsParams(((mbg.c) output4).f204209a, false)), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                                return Unit.f186387a;
                            case 4:
                                tcg.m output5 = (tcg.m) obj8;
                                Intrinsics.checkNotNullParameter(output5, "output");
                                boolean z54 = output5 instanceof tcg.j;
                                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar7 = bVar2;
                                yki.b bVar8 = LazyFlowCoordinator;
                                if (z54) {
                                    oki.h.t2(bVar7, bVar8, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.Property(new HotelsPropertyInputData.BookableProperty(((tcg.j) output5).f269792a, null, null, null, null, 30), false, false, 30)), true, null, false, 12);
                                } else if ((output5 instanceof tcg.k) || (output5 instanceof tcg.g) || (output5 instanceof tcg.i) || (output5 instanceof tcg.h)) {
                                    bVar7.B2();
                                    oki.h.w2(bVar7.f93798q, new TravelHotelsFlowContract$Step$DatesPicker$Modal(new TravelHotelsDatesPickerScreenContract$InputData.CurrentSelectedDates(0), 2), ModalDestination.Style.POPUP.f98311a);
                                } else {
                                    if (!(output5 instanceof tcg.l)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(bVar7, bVar8, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(((tcg.l) output5).f269795a, 15, false, false)), true, null, false, 12);
                                }
                                return Unit.f186387a;
                            case 5:
                                sag.f output6 = (sag.f) obj8;
                                Intrinsics.checkNotNullParameter(output6, "output");
                                boolean z74 = output6 instanceof sag.d;
                                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar9 = bVar2;
                                yki.b bVar10 = LazyFlowCoordinator;
                                if (z74) {
                                    oki.h.t2(bVar9, bVar10, new TravelHotelsFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode.ManageCancellation(((sag.d) output6).f261399a))), true, null, false, 12);
                                } else if (output6 instanceof sag.c) {
                                    sag.c cVar = (sag.c) output6;
                                    oki.h.t2(bVar9, bVar10, new TravelHotelsFlowContract$Step.CancellationPolicy(new TravelHotelsCancellationPolicyScreenContract$InputData(new TravelHotelsCancellationPolicyScreenContract$Mode$ViewPolicy$ByPolicyData(cVar.f261397a, cVar.f261398b))), true, null, false, 12);
                                } else {
                                    if (!(output6 instanceof sag.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.w2(bVar9.f93798q, new TravelHotelsFlowContract$Step.PriceBreakdown(((sag.e) output6).f261400a), ModalDestination.Style.POPUP.f98311a);
                                }
                                return Unit.f186387a;
                            case 6:
                                obg.i output7 = (obg.i) obj8;
                                Intrinsics.checkNotNullParameter(output7, "output");
                                boolean z83 = output7 instanceof obg.h;
                                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar11 = bVar2;
                                yki.b bVar12 = LazyFlowCoordinator;
                                if (z83) {
                                    oki.h.t2(bVar11, bVar12, new TravelHotelsFlowContract$Step.CheckoutFlow(new TravelHotelsCheckoutFlowContract$InputData.SearchResults(null, 31, false, false)), true, null, false, 12);
                                } else {
                                    if (!Intrinsics.f(output7, obg.g.f223942a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (bVar12.c()) {
                                        bVar11.B2();
                                    } else {
                                        oki.h.t2(bVar11, bVar12, new TravelHotelsFlowContract$Step.Home((TravelHotelsHomeFlowContract$PagerItem) null, 3), false, null, false, 12);
                                    }
                                }
                                return Unit.f186387a;
                            default:
                                tag.i output8 = (tag.i) obj8;
                                Intrinsics.checkNotNullParameter(output8, "output");
                                boolean z89 = output8 instanceof tag.f;
                                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.root.b bVar13 = bVar2;
                                yki.b bVar14 = LazyFlowCoordinator;
                                if (z89) {
                                    oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.Policies(((tag.f) output8).f269330a), true, null, false, 12);
                                } else if (output8 instanceof tag.h) {
                                    oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.TravellerInfo(((tag.h) output8).f269332a), true, null, false, 12);
                                } else if (output8 instanceof tag.g) {
                                    oki.h.w2(bVar13.f93798q, new TravelHotelsFlowContract$Step.PriceBreakdown(((tag.g) output8).f269331a), ModalDestination.Style.POPUP.f98311a);
                                } else if (output8 instanceof tag.d) {
                                    oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.BookingDetails(((tag.d) output8).f269328a), false, null, false, 12);
                                } else {
                                    if (!(output8 instanceof tag.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(bVar13, bVar14, new TravelHotelsFlowContract$Step.MapPreview(((tag.e) output8).f269329a), true, null, false, 12);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block16, "block");
                travelHotelsFavoritesGridScreen.H = block16;
                return travelHotelsFavoritesGridScreen;
            case 4:
                com.revolut.feature_retail_user_declarations.email.screen.a aVar2 = (com.revolut.feature_retail_user_declarations.email.screen.a) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EmailScreenContract$ModalStep step3 = (EmailScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!Intrinsics.f(step3, EmailScreenContract$ModalStep.ReferralUnlinkDialog.f97587a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ReferrerDetailsState referrerDetailsState = ((yai.k) ((j2) aVar2.f97593w.f22677a).getValue()).e;
                ReferrerDetailsState.Enabled enabled = referrerDetailsState instanceof ReferrerDetailsState.Enabled ? (ReferrerDetailsState.Enabled) referrerDetailsState : null;
                if (enabled == null || (referrerDetails = enabled.f81681a) == null) {
                    throw new IllegalStateException("Referrer details must be present when opening referral unlink dialog");
                }
                ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.referrals.code.api.R$string.referrals_referral_code_email_details_title, u.c(referrerDetails.f81677a), null, 12), new TextLocalisedClause(com.revolut.feature.referrals.code.api.R$string.referrals_referral_code_email_dialog_subtitle, u.c(referrerDetails.f81678b), null, 12), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.referrals.code.api.R$string.referrals_referral_code_email_dialog_unlink_association, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), aVar2.o.e, null, null, 24));
                o block17 = new o(1, aVar2, com.revolut.feature_retail_user_declarations.email.screen.a.class, "onBottomSheetResult", "onBottomSheetResult(Lcom/revolut/kompot/common/bottom_sheet/actions/ActionsBottomSheetController$OutputData;)V", 0, 28);
                Intrinsics.checkNotNullParameter(block17, "block");
                actionsBottomSheetController.H = block17;
                return actionsBottomSheetController;
            case 5:
                com.revolut.retail.feature.pending_payments.impl.ui.bottom_sheet.a aVar3 = (com.revolut.retail.feature.pending_payments.impl.ui.bottom_sheet.a) obj6;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                PendingPaymentBottomSheetFlowContract$Step step4 = (PendingPaymentBottomSheetFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof PendingPaymentBottomSheetFlowContract$Step.Dialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                xak.a aVar4 = aVar3.f102429p;
                PendingPaymentBottomSheetInputData pendingPaymentBottomSheetInputData = aVar3.o;
                aVar4.getClass();
                ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(xak.a.a(pendingPaymentBottomSheetInputData));
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                xwd.o block18 = new xwd.o(ref$BooleanRef, 9, aVar3, LazyFlowCoordinator2);
                Intrinsics.checkNotNullParameter(block18, "block");
                actionsBottomSheetController2.H = block18;
                actionsBottomSheetController2.l2(new qg7.k(ref$BooleanRef, 26, aVar3, LazyFlowCoordinator2));
                return actionsBottomSheetController2;
            case 6:
                final com.revolut.feature.cash_topup.impl.ui.flow.barcode.a aVar5 = (com.revolut.feature.cash_topup.impl.ui.flow.barcode.a) obj6;
                final yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                CashTopUpBarcodeFlowContract$Step step5 = (CashTopUpBarcodeFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof CashTopUpBarcodeFlowContract$Step.Barcode) {
                    CashTopUpBarcodeScreen cashTopUpBarcodeScreen = new CashTopUpBarcodeScreen();
                    final boolean z41 = z6 ? 1 : 0;
                    Function1 block19 = new Function1() { // from class: yb3.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (z41) {
                                case 0:
                                    sb3.i result = (sb3.i) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z49 = result instanceof i.a;
                                    ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                    yki.b bVar3 = LazyFlowCoordinator3;
                                    if (z49) {
                                        oki.h.w2(bVar3, CashTopUpBarcodeFlowContract$Step.DeleteConfirmation.f65645a, popup);
                                    } else if (result instanceof sb3.k) {
                                        BarcodeDetails barcodeDetails = ((sb3.k) result).f261487a;
                                        oki.h.w2(bVar3, new CashTopUpBarcodeFlowContract$Step.ModalStep.ReportIssue(barcodeDetails != null ? barcodeDetails.f65584a : null), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else if (result instanceof i.d) {
                                        oki.h.w2(bVar3, CashTopUpBarcodeFlowContract$Step.Instructions.f65646a, popup);
                                    } else {
                                        boolean z54 = result instanceof i.e;
                                        com.revolut.feature.cash_topup.impl.ui.flow.barcode.a aVar6 = aVar5;
                                        if (z54) {
                                            oki.h.t2(aVar6, bVar3, CashTopUpBarcodeFlowContract$Step.Map.f65648a, true, null, false, 12);
                                        } else if ((result instanceof i.c) || (result instanceof i.b)) {
                                            oki.h.D2(bVar3);
                                        } else {
                                            if (!(result instanceof sb3.j)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar6.C1(new ExternalDestination.Browser(((sb3.j) result).f261486a, null));
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    oc3.m result2 = (oc3.m) obj8;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z74 = result2 instanceof oc3.j;
                                    com.revolut.feature.cash_topup.impl.ui.flow.barcode.a aVar7 = aVar5;
                                    if (z74) {
                                        oki.h.t2(aVar7, LazyFlowCoordinator3, new CashTopUpBarcodeFlowContract$Step.LocationDetails(((oc3.j) result2).f224069a), true, null, false, 12);
                                    } else if (result2 instanceof oc3.k) {
                                        CashTopUpLocationInfo cashTopUpLocationInfo = ((oc3.k) result2).f224070a;
                                        aVar7.C1(new BridgeDestination(((ri3.a) aVar7.o).a(cashTopUpLocationInfo.d, cashTopUpLocationInfo.e)));
                                    } else if (result2 instanceof oc3.i) {
                                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Unexpected output DepositCashClicked(locationId=", ((oc3.i) result2).f224068a, ")"));
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                                    } else if (result2 instanceof m.a) {
                                        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Unexpected output ShowBarcode");
                                        h0 h0Var2 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                                    } else {
                                        if (!(result2 instanceof oc3.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException(p.a.p("Unexpected output SelectLocationClicked(locationId=", ((oc3.l) result2).f224071a, ")"));
                                        h0 h0Var3 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var3);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block19, "block");
                    cashTopUpBarcodeScreen.H = block19;
                    return cashTopUpBarcodeScreen;
                }
                if (step5 instanceof CashTopUpBarcodeFlowContract$Step.DeleteConfirmation) {
                    DeleteBarcodeConfirmationFlow deleteBarcodeConfirmationFlow = new DeleteBarcodeConfirmationFlow();
                    dph.c block20 = new dph.c(aVar5, LazyFlowCoordinator3, 27);
                    Intrinsics.checkNotNullParameter(block20, "block");
                    deleteBarcodeConfirmationFlow.H = block20;
                    return deleteBarcodeConfirmationFlow;
                }
                if (step5 instanceof CashTopUpBarcodeFlowContract$Step.Instructions) {
                    CashTopupInstructionsScreen cashTopupInstructionsScreen = new CashTopupInstructionsScreen();
                    final boolean z49 = z4 ? 1 : 0;
                    Function1 block21 = new Function1() { // from class: yb3.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            int i59 = z49;
                            com.revolut.feature.cash_topup.impl.ui.flow.barcode.a aVar6 = aVar5;
                            switch (i59) {
                                case 0:
                                    q it8 = (q) obj8;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    aVar6.B2();
                                    return Unit.f186387a;
                                default:
                                    vb3.l result = (vb3.l) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof vb3.k) {
                                        IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Unexpected output SelectLocationClicked(locationId=", ((vb3.k) result).f287386a, ")"));
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                    } else if (result instanceof vb3.h) {
                                        IllegalStateException illegalStateException2 = new IllegalStateException(p.a.p("Unexpected output DepositCashClicked(locationId=", ((vb3.h) result).f287383a, ")"));
                                        h0 h0Var2 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                                    } else if (result instanceof l.a) {
                                        IllegalStateException illegalStateException3 = new IllegalStateException("Unexpected output ShowBarcode");
                                        h0 h0Var3 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                                    } else if (result instanceof vb3.i) {
                                        CashTopUpLocationInfo cashTopUpLocationInfo = ((vb3.i) result).f287384a;
                                        aVar6.C1(new BridgeDestination(((ri3.a) aVar6.o).a(cashTopUpLocationInfo.d, cashTopUpLocationInfo.e)));
                                    } else {
                                        if (!(result instanceof vb3.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        nd.o oVar = aVar6.f65651p;
                                        String str = ((vb3.j) result).f287385a;
                                        oVar.getClass();
                                        aVar6.C1(new BridgeDestination(nd.o.h(str)));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block21, "block");
                    cashTopupInstructionsScreen.H = block21;
                    return cashTopupInstructionsScreen;
                }
                if (step5 instanceof CashTopUpBarcodeFlowContract$Step.Map) {
                    CashTopUpLocationsMapScreen cashTopUpLocationsMapScreen = new CashTopUpLocationsMapScreen(new CashTopUpLocationsMapScreenContract$InputData(cb3.a.EU_FLOW, ub3.k.NoEuActions));
                    final int i59 = 1;
                    Function1 function12 = new Function1() { // from class: yb3.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            switch (i59) {
                                case 0:
                                    sb3.i result = (sb3.i) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z492 = result instanceof i.a;
                                    ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                                    yki.b bVar3 = LazyFlowCoordinator3;
                                    if (z492) {
                                        oki.h.w2(bVar3, CashTopUpBarcodeFlowContract$Step.DeleteConfirmation.f65645a, popup);
                                    } else if (result instanceof sb3.k) {
                                        BarcodeDetails barcodeDetails = ((sb3.k) result).f261487a;
                                        oki.h.w2(bVar3, new CashTopUpBarcodeFlowContract$Step.ModalStep.ReportIssue(barcodeDetails != null ? barcodeDetails.f65584a : null), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else if (result instanceof i.d) {
                                        oki.h.w2(bVar3, CashTopUpBarcodeFlowContract$Step.Instructions.f65646a, popup);
                                    } else {
                                        boolean z54 = result instanceof i.e;
                                        com.revolut.feature.cash_topup.impl.ui.flow.barcode.a aVar6 = aVar5;
                                        if (z54) {
                                            oki.h.t2(aVar6, bVar3, CashTopUpBarcodeFlowContract$Step.Map.f65648a, true, null, false, 12);
                                        } else if ((result instanceof i.c) || (result instanceof i.b)) {
                                            oki.h.D2(bVar3);
                                        } else {
                                            if (!(result instanceof sb3.j)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar6.C1(new ExternalDestination.Browser(((sb3.j) result).f261486a, null));
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    oc3.m result2 = (oc3.m) obj8;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z74 = result2 instanceof oc3.j;
                                    com.revolut.feature.cash_topup.impl.ui.flow.barcode.a aVar7 = aVar5;
                                    if (z74) {
                                        oki.h.t2(aVar7, LazyFlowCoordinator3, new CashTopUpBarcodeFlowContract$Step.LocationDetails(((oc3.j) result2).f224069a), true, null, false, 12);
                                    } else if (result2 instanceof oc3.k) {
                                        CashTopUpLocationInfo cashTopUpLocationInfo = ((oc3.k) result2).f224070a;
                                        aVar7.C1(new BridgeDestination(((ri3.a) aVar7.o).a(cashTopUpLocationInfo.d, cashTopUpLocationInfo.e)));
                                    } else if (result2 instanceof oc3.i) {
                                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Unexpected output DepositCashClicked(locationId=", ((oc3.i) result2).f224068a, ")"));
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                                    } else if (result2 instanceof m.a) {
                                        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Unexpected output ShowBarcode");
                                        h0 h0Var2 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                                    } else {
                                        if (!(result2 instanceof oc3.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException(p.a.p("Unexpected output SelectLocationClicked(locationId=", ((oc3.l) result2).f224071a, ")"));
                                        h0 h0Var3 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var3);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function12, "<set-?>");
                    cashTopUpLocationsMapScreen.H = function12;
                    return cashTopUpLocationsMapScreen;
                }
                if (step5 instanceof CashTopUpBarcodeFlowContract$Step.LocationDetails) {
                    CashTopUpDetailsScreen cashTopUpDetailsScreen = new CashTopUpDetailsScreen(new CashTopUpDetailsScreenContract$InputData(((CashTopUpBarcodeFlowContract$Step.LocationDetails) step5).f65647a, ub3.k.NoEuActions));
                    final int i66 = 1;
                    Function1 function13 = new Function1() { // from class: yb3.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            int i592 = i66;
                            com.revolut.feature.cash_topup.impl.ui.flow.barcode.a aVar6 = aVar5;
                            switch (i592) {
                                case 0:
                                    q it8 = (q) obj8;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    aVar6.B2();
                                    return Unit.f186387a;
                                default:
                                    vb3.l result = (vb3.l) obj8;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof vb3.k) {
                                        IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Unexpected output SelectLocationClicked(locationId=", ((vb3.k) result).f287386a, ")"));
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                    } else if (result instanceof vb3.h) {
                                        IllegalStateException illegalStateException2 = new IllegalStateException(p.a.p("Unexpected output DepositCashClicked(locationId=", ((vb3.h) result).f287383a, ")"));
                                        h0 h0Var2 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                                    } else if (result instanceof l.a) {
                                        IllegalStateException illegalStateException3 = new IllegalStateException("Unexpected output ShowBarcode");
                                        h0 h0Var3 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                                    } else if (result instanceof vb3.i) {
                                        CashTopUpLocationInfo cashTopUpLocationInfo = ((vb3.i) result).f287384a;
                                        aVar6.C1(new BridgeDestination(((ri3.a) aVar6.o).a(cashTopUpLocationInfo.d, cashTopUpLocationInfo.e)));
                                    } else {
                                        if (!(result instanceof vb3.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        nd.o oVar = aVar6.f65651p;
                                        String str = ((vb3.j) result).f287385a;
                                        oVar.getClass();
                                        aVar6.C1(new BridgeDestination(nd.o.h(str)));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function13, "<set-?>");
                    cashTopUpDetailsScreen.H = function13;
                    obj4 = cashTopUpDetailsScreen;
                } else {
                    if (!(step5 instanceof CashTopUpBarcodeFlowContract$Step.SelectStoreToReportIssue)) {
                        if (!(step5 instanceof CashTopUpBarcodeFlowContract$Step.ModalStep.ReportIssue)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        CashTopupReportAnIssueBottomSheetScreen cashTopupReportAnIssueBottomSheetScreen = new CashTopupReportAnIssueBottomSheetScreen();
                        xwd.o block22 = new xwd.o(aVar5, 10, step5, LazyFlowCoordinator3);
                        Intrinsics.checkNotNullParameter(block22, "block");
                        cashTopupReportAnIssueBottomSheetScreen.H = block22;
                        cashTopupReportAnIssueBottomSheetScreen.k2(new y1a.a(LazyFlowCoordinator3, aVar5, 15));
                        return cashTopupReportAnIssueBottomSheetScreen;
                    }
                    xe0.e eVar = ((jb3.d) aVar5.f65652q.f185240b).f172580b;
                    jb3.b.Companion.getClass();
                    ib3.a aVar6 = (ib3.a) eVar.T2("BARCODE_DETAILS_KEY", CashTopUpBarcodeRepository$Companion.f65605b);
                    CashTopUpSelectStoreFlow cashTopUpSelectStoreFlow = new CashTopUpSelectStoreFlow(new ic3.c(aVar6 != null ? aVar6.getStoreId() : null));
                    g0 block23 = new g0(aVar5, step5, 6);
                    Intrinsics.checkNotNullParameter(block23, "block");
                    cashTopUpSelectStoreFlow.H = block23;
                    obj4 = cashTopUpSelectStoreFlow;
                }
                return obj4;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ybh.y.b(((x) obj6).f312365c);
            case 8:
                com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b bVar3 = (com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CompositeAddMoneyScreenContract$FlowStep step6 = (CompositeAddMoneyScreenContract$FlowStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (!(step6 instanceof CompositeAddMoneyScreenContract$FlowStep.ScaPrompt)) {
                    if (!(step6 instanceof CompositeAddMoneyScreenContract$FlowStep.PreActionPrompt)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ViewController viewControllerE12 = bVar3.e1(((CompositeAddMoneyScreenContract$FlowStep.PreActionPrompt) step6).f95579a);
                    g0 block24 = new g0(bVar3, step6, 7);
                    Intrinsics.checkNotNullParameter(block24, "block");
                    viewControllerE12.H = block24;
                    return viewControllerE12;
                }
                CompositeAddMoneyScreenContract$FlowStep.ScaPrompt scaPrompt = (CompositeAddMoneyScreenContract$FlowStep.ScaPrompt) step6;
                String string = scaPrompt.f95581a.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                k9 k9Var = k9.Trading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                ViewController viewControllerE13 = bVar3.e1(new wrc.a(string, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 10));
                g0 block25 = new g0(bVar3, scaPrompt, 10);
                Intrinsics.checkNotNullParameter(block25, "block");
                viewControllerE13.H = block25;
                return viewControllerE13;
            case 9:
                CenteredAmountDelegate.Model data2 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field2 = (CenteredAmountView) obj3;
                WealthAddMoneyScreen.Companion aVar7 = WealthAddMoneyScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(data2, "data");
                Intrinsics.checkNotNullParameter(field2, "field");
                MaskedTextInputEditText editText = field2.getEditText();
                Object obj8 = data2.f51981p;
                Intrinsics.i(obj8, "null cannot be cast to non-null type com.revolut.feature.retail.wealth.money_input.common.widgets.contribution_selection.ContributionSelectionWidgetContract.AmountParcel");
                xi0.b bVar4 = ((usb.a) obj8).f282862a;
                z9h.o oVar = (z9h.o) ((WealthAddMoneyScreen) obj6).M.getValue();
                switch (oVar.f320481a) {
                    case 0:
                        bVarN = oVar.e.f320404n.n();
                        s.j(bVarN);
                        break;
                    default:
                        bVarN = oVar.e.f320404n.n();
                        s.j(bVarN);
                        break;
                }
                return new zp0.d(editText, bVar4, new u80.d(((s80.b) bVarN).b()), null, null, false, false, 0, false, null, 1944);
            case 10:
                com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b bVar5 = (com.revolut.retail.feature.crypto_deposits.impl.ui.directdeposit.b) obj6;
                CryptoDirectDepositFlowContract$Step step7 = (CryptoDirectDepositFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!Intrinsics.f(step7, CryptoDirectDepositFlowContract$Step.ProductArticle.f100065a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ProductArticleParams productArticleParams = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(CryptoDirectDepositProductArticleKey.f100066a));
                k9 k9Var2 = k9.Crypto;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                ViewController viewControllerE14 = bVar5.e1(new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, false, 48));
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                g0 block26 = new g0(ref$ObjectRef, bVar5, 11);
                Intrinsics.checkNotNullParameter(block26, "block");
                viewControllerE14.H = block26;
                viewControllerE14.l2(new y1a.a(ref$ObjectRef, bVar5, 16));
                return viewControllerE14;
            case 11:
                com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.a aVar8 = (com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.a) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                KontomatikSignInControllerContract$ModalStep step8 = (KontomatikSignInControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (!(step8 instanceof KontomatikSignInControllerContract$ModalStep.KontomatikSelection)) {
                    throw new NoWhenBranchMatchedException();
                }
                w0 w0Var = aVar8.o.f67820b;
                lw0.a aVar9 = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.kontomatik_other_bank_popup_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.kontomatik_other_bank_popup_subtitle, null, null, 14), null, null, false, 28);
                aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.kontomatik_other_bank_popup_button_to_manual_underwriting, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.kontomatik_other_bank_popup_button_to_kontomatik, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), null, null, null, 121);
                k9 value = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(new dii.a(aVar9, hVar, new AnalyticsProduct.Retail(value), new AnalyticsContext(w0Var), null, 16));
                h block27 = new h(aVar8, 21);
                Intrinsics.checkNotNullParameter(block27, "block");
                actionsBottomSheetController3.H = block27;
                return actionsBottomSheetController3;
            case 12:
                PixTransferInputKeyScreen pixTransferInputKeyScreen = (PixTransferInputKeyScreen) obj6;
                InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
                InputText field3 = (InputText) obj3;
                KProperty[] kPropertyArr2 = PixTransferInputKeyScreen.W;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field3, "field");
                Object obj9 = model.P;
                String str = obj9 instanceof String ? (String) obj9 : null;
                if (str != null) {
                    a2 a2Var = pixTransferInputKeyScreen.T;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    pixTransferInputKeyScreen.T = null;
                    pixTransferInputKeyScreen.U = null;
                } else if (pixTransferInputKeyScreen.U == null) {
                    pixTransferInputKeyScreen.U = rd0.e.b(pixTransferInputKeyScreen.R.e.f121375b);
                    pixTransferInputKeyScreen.f3();
                }
                if (str != null) {
                    return new y(field3.getInnerEditText(), null, str, new ya6.f(pixTransferInputKeyScreen, i2), model.f52580a, null, false, 98);
                }
                return null;
            case 13:
                com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow.b bVar6 = (com.revolut.feature.retail.private_banking.impl.ui.deposit_assets.flow.b) obj6;
                yki.b LazyFlowCoordinator4 = (yki.b) obj2;
                DepositAssetsFlowContract$Step step9 = (DepositAssetsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator4, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!(step9 instanceof DepositAssetsFlowContract$Step.DepositAssets)) {
                    throw new NoWhenBranchMatchedException();
                }
                DepositAssetsScreen depositAssetsScreen = new DepositAssetsScreen(new DepositAssetsScreenContract$Input(((DepositAssetsFlowContract$Step.DepositAssets) step9).f82793a));
                g0 block28 = new g0(bVar6, LazyFlowCoordinator4, 15);
                Intrinsics.checkNotNullParameter(block28, "block");
                depositAssetsScreen.H = block28;
                return depositAssetsScreen;
            case 14:
                ydg.g gVar = (ydg.g) obj6;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelHotelsRoomDetailsScreenContract$ModalStep step10 = (TravelHotelsRoomDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof TravelHotelsRoomDetailsScreenContract$ModalStep.GridGallery) {
                    return gVar.e1(new rd7.e(new rd7.j(((TravelHotelsRoomDetailsScreenContract$ModalStep.GridGallery) step10).f94000a)));
                }
                throw new NoWhenBranchMatchedException();
            case 15:
                AmountEditDelegate.Model model2 = (AmountEditDelegate.Model) obj2;
                AmountEditView field4 = (AmountEditView) obj3;
                KProperty[] kPropertyArr3 = CatalogueProductDetailsScreen.W;
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(field4, "field");
                Object obj10 = model2.f51629j;
                Intrinsics.i(obj10, "null cannot be cast to non-null type com.revolut.feature.acquiring.lite_pos.impl.domain.model.AmountParcel");
                od1.a aVar10 = (od1.a) obj10;
                return new zp0.d(field4.getEditText(), aVar10.f224260b, new u80.d(aVar10.f224259a), null, new p((CatalogueProductDetailsScreen) obj6, 16), false, false, 0, false, null, 1960);
            case 16:
                final com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a aVar11 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a) obj6;
                cli.y yVar = aVar11.f60829t;
                rd1.a aVar12 = aVar11.f60828s;
                final com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ProductDetailsScreenContract$ModalStep it8 = (ProductDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                if (Intrinsics.f(it8, ProductDetailsScreenContract$ModalStep.DeleteConfirmation.f60821a)) {
                    aVar12.getClass();
                    ActionsBottomSheetController actionsBottomSheetController4 = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_cart_delete_item_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_products_delete_product_subtitle, null, null, 14), null, null, false, 28), new aw0.g(new n6(new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_common_action_delete, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25), aVar12.f253314b, null, null, 24));
                    Function1 block29 = new Function1() { // from class: ye1.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj11) {
                            switch (i3) {
                                case 0:
                                    dii.g output = (dii.g) obj11;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof dii.f) {
                                        com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a aVar13 = aVar11;
                                        CatalogueProduct catalogueProduct = aVar13.o.f60817a;
                                        if (catalogueProduct == null) {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        aVar13.l2(new a1(aVar13, catalogueProduct, null, 22), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                default:
                                    je1.g output2 = (je1.g) obj11;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a aVar14 = aVar11;
                                    aVar14.H2(aVar14.f60829t, new y8a.h(output2, 26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block29, "block");
                    actionsBottomSheetController4.H = block29;
                    return actionsBottomSheetController4;
                }
                if (Intrinsics.f(it8, ProductDetailsScreenContract$ModalStep.SelectTaxRate.f60824a)) {
                    SelectTaxRateScreen selectTaxRateScreen = new SelectTaxRateScreen(new SelectTaxRateScreenProvider$InputData(((ye1.i) ((j2) yVar.f22677a).getValue()).c(), true, true));
                    final boolean z54 = z29 ? 1 : 0;
                    Function1 block30 = new Function1() { // from class: ye1.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj11) {
                            switch (z54) {
                                case 0:
                                    com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a aVar13 = aVar11;
                                    cli.y yVar2 = aVar13.f60829t;
                                    dd1.a result = (dd1.a) obj11;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof dd1.b) {
                                        aVar13.H2(yVar2, new oe1.k(result, 1));
                                    } else if (Intrinsics.f(result, a.C0672a.f113082a)) {
                                        aVar13.H2(yVar2, new m(1));
                                    } else {
                                        if (!Intrinsics.f(result, a.b.f113083a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(ModalCoordinator5, ProductDetailsScreenContract$ModalStep.ManageTaxRates.f60823a, ModalDestination.Style.POPUP.f98311a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    eii.k it9 = (eii.k) obj11;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if ((it9 instanceof eii.f) && Intrinsics.f(((eii.f) it9).f126652a.a(), "CATEGORY_PICKER_ADD_PRODUCT_LIST_ID")) {
                                        oki.h.v2(ModalCoordinator5, ProductDetailsScreenContract$ModalStep.AddCategory.f60819a, ModalDestination.Style.POPUP.f98311a);
                                    }
                                    if (it9 instanceof eii.i) {
                                        Object obj12 = ((eii.i) it9).f126655a;
                                        if (obj12 instanceof CatalogueCategory) {
                                            com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a aVar14 = aVar11;
                                            aVar14.H2(aVar14.f60829t, new sx4.b(obj12, 18));
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block30, "block");
                    selectTaxRateScreen.H = block30;
                    obj5 = selectTaxRateScreen;
                } else {
                    if (Intrinsics.f(it8, ProductDetailsScreenContract$ModalStep.ManageTaxRates.f60823a)) {
                        return new ManageTaxRatesFlow();
                    }
                    if (Intrinsics.f(it8, ProductDetailsScreenContract$ModalStep.AddCategory.f60819a)) {
                        CategoryDetailsScreen categoryDetailsScreen = new CategoryDetailsScreen(new CategoryDetailsScreenContract$InputData(null));
                        final int i74 = 1;
                        Function1 block31 = new Function1() { // from class: ye1.n
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj11) {
                                switch (i74) {
                                    case 0:
                                        dii.g output = (dii.g) obj11;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        if (output instanceof dii.f) {
                                            com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a aVar13 = aVar11;
                                            CatalogueProduct catalogueProduct = aVar13.o.f60817a;
                                            if (catalogueProduct == null) {
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                            aVar13.l2(new a1(aVar13, catalogueProduct, null, 22), new yi5.b(26));
                                        }
                                        return Unit.f186387a;
                                    default:
                                        je1.g output2 = (je1.g) obj11;
                                        Intrinsics.checkNotNullParameter(output2, "output");
                                        com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a aVar14 = aVar11;
                                        aVar14.H2(aVar14.f60829t, new y8a.h(output2, 26));
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block31, "block");
                        categoryDetailsScreen.H = block31;
                        return categoryDetailsScreen;
                    }
                    if (Intrinsics.f(it8, ProductDetailsScreenContract$ModalStep.EmptyCategories.f60822a)) {
                        aVar12.getClass();
                        ActionsBottomSheetController actionsBottomSheetController5 = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_categories_category_picker_empty_state_title, null, null, 14), null, new lw0.b(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30), null), new lw0.j("CATEGORY_PICKER_ADD_PRODUCT_LIST_ID", new fw0.b(new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_catalogue_category_items_header_button_new, null, null, 14))), false, 18), null, aVar12.f253314b, null, null, 24));
                        h block32 = new h(aVar11, ModalCoordinator5, 27);
                        Intrinsics.checkNotNullParameter(block32, "block");
                        actionsBottomSheetController5.H = block32;
                        return actionsBottomSheetController5;
                    }
                    if (!Intrinsics.f(it8, ProductDetailsScreenContract$ModalStep.Categories.f60820a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List categories = ((ye1.i) ((j2) yVar.f22677a).getValue()).i;
                    String str2 = ((ye1.i) ((j2) yVar.f22677a).getValue()).f312748g;
                    aVar12.getClass();
                    Intrinsics.checkNotNullParameter(categories, "categories");
                    lw0.a aVar13 = new lw0.a(new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_categories_category_picker_title, null, null, 14), null, null, new lw0.j("CATEGORY_PICKER_ADD_PRODUCT_LIST_ID", new fw0.b(new TextLocalisedClause(com.revolut.feature.acquiring.lite_pos.impl.R$string.product_catalogue_flow_catalogue_category_items_header_button_new, null, null, 14))), false, 22);
                    List<CatalogueCategory> list = categories;
                    ArrayList arrayList = new ArrayList(w.t(list, 10));
                    for (CatalogueCategory catalogueCategory : list) {
                        arrayList.add(new eii.l((Clause) new TextClause(catalogueCategory.f60670b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) null, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_dot, (Integer) null, Integer.valueOf(((pd1.c) aVar12.f253313a).c(catalogueCategory.f60671c)), (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_SUPPORTED_LOCALE_LIST), z12 ? 1 : 0, z11 ? 1 : 0, 6), true, false, (RowDelegate.Model.c) (Intrinsics.f(catalogueCategory.f60669a, str2) ? new tf(6, new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false) : null), (Object) catalogueCategory, 168));
                    }
                    RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar13, null, arrayList, aVar12.f253314b, null));
                    final int i92 = 1;
                    Function1 block33 = new Function1() { // from class: ye1.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj11) {
                            switch (i92) {
                                case 0:
                                    com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a aVar132 = aVar11;
                                    cli.y yVar2 = aVar132.f60829t;
                                    dd1.a result = (dd1.a) obj11;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof dd1.b) {
                                        aVar132.H2(yVar2, new oe1.k(result, 1));
                                    } else if (Intrinsics.f(result, a.C0672a.f113082a)) {
                                        aVar132.H2(yVar2, new m(1));
                                    } else {
                                        if (!Intrinsics.f(result, a.b.f113083a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(ModalCoordinator5, ProductDetailsScreenContract$ModalStep.ManageTaxRates.f60823a, ModalDestination.Style.POPUP.f98311a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    eii.k it9 = (eii.k) obj11;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if ((it9 instanceof eii.f) && Intrinsics.f(((eii.f) it9).f126652a.a(), "CATEGORY_PICKER_ADD_PRODUCT_LIST_ID")) {
                                        oki.h.v2(ModalCoordinator5, ProductDetailsScreenContract$ModalStep.AddCategory.f60819a, ModalDestination.Style.POPUP.f98311a);
                                    }
                                    if (it9 instanceof eii.i) {
                                        Object obj12 = ((eii.i) it9).f126655a;
                                        if (obj12 instanceof CatalogueCategory) {
                                            com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a aVar14 = aVar11;
                                            aVar14.H2(aVar14.f60829t, new sx4.b(obj12, 18));
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block33, "block");
                    rowActionsBottomSheetController.H = block33;
                    obj5 = rowActionsBottomSheetController;
                }
                return obj5;
            case 17:
                com.revolut.feature.pockets.impl.ui.add_new.c cVar = (com.revolut.feature.pockets.impl.ui.add_new.c) obj6;
                AddNewPocketFlowContract$Step step11 = (AddNewPocketFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof AddNewPocketFlowContract$Step.ChooseCurrency) {
                    AddNewPocketFlowContract$Step.ChooseCurrency chooseCurrency = (AddNewPocketFlowContract$Step.ChooseCurrency) step11;
                    s7a.x xVar = new s7a.x(chooseCurrency.f80884a, null, null, chooseCurrency.f80885b, false, s7a.w.SHOWN, new TextLocalisedClause(com.revolut.retail.feature.balance.picker.api.R$string.balance_picker_search_hint, null, null, 14), null, null, false, null, null, null, null, false, null, null, null, null, null, 2147478746);
                    Object obj11 = cVar.u.get();
                    Intrinsics.checkNotNullExpressionValue(obj11, "get(...)");
                    PickerController pickerController = new PickerController(xVar, (x7a.d) obj11);
                    o block34 = new o(1, cVar, com.revolut.feature.pockets.impl.ui.add_new.c.class, "handleChooserOutput", "handleChooserOutput(Lcom/revolut/feature/picker/PickerControllerContract$OutputData;)V", 0, 29);
                    Intrinsics.checkNotNullParameter(block34, "block");
                    pickerController.H = block34;
                    return pickerController;
                }
                if (!(step11 instanceof AddNewPocketFlowContract$Step.McyFlowStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                t99.k kVar = cVar.f80899t;
                bla.c cVar2 = ((AddNewPocketFlowContract$Step.McyFlowStep) step11).f80887b;
                k9 k9Var3 = k9.Accounts;
                Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                ExchangeGlobalAccessFlow exchangeGlobalAccessFlowB = t99.k.b(kVar, cVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), 1);
                g0 block35 = new g0(cVar, step11, 18);
                Intrinsics.checkNotNullParameter(block35, "block");
                exchangeGlobalAccessFlowB.H = block35;
                return exchangeGlobalAccessFlowB;
            case 18:
                com.revolut.feature.pockets.impl.ui.add_new.d dVar = (com.revolut.feature.pockets.impl.ui.add_new.d) obj6;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                OpenNewPocketFlowContract$Step step12 = (OpenNewPocketFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof OpenNewPocketFlowContract$Step.AddNewPocket)) {
                    throw new NoWhenBranchMatchedException();
                }
                OpenNewPocketFlowContract$InputData openNewPocketFlowContract$InputData = dVar.o;
                AddNewPocketFlow addNewPocketFlow = new AddNewPocketFlow(new AddNewPocketContract$InputData(openNewPocketFlowContract$InputData.f80888a, openNewPocketFlowContract$InputData.f80889b));
                yea.l block36 = new yea.l(1, dVar, com.revolut.feature.pockets.impl.ui.add_new.d.class, "handleAddNewPocketResult", "handleAddNewPocketResult(Lcom/revolut/feature/pockets/api/ui/add_new/AddNewPocketContract$OutputData;)V", 0, 0);
                Intrinsics.checkNotNullParameter(block36, "block");
                addNewPocketFlow.H = block36;
                return addNewPocketFlow;
            case 19:
                SharedCreateAlertRevampedScreen sharedCreateAlertRevampedScreen = (SharedCreateAlertRevampedScreen) obj6;
                CenteredAmountDelegate.Model model3 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field5 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr4 = SharedCreateAlertRevampedScreen.f0;
                Intrinsics.checkNotNullParameter(model3, "model");
                Intrinsics.checkNotNullParameter(field5, "field");
                Object obj12 = model3.f51981p;
                String str3 = obj12 instanceof String ? (String) obj12 : null;
                if (str3 == null) {
                    return null;
                }
                MaskedTextInputEditText editText2 = field5.getEditText();
                xi0.b bVar7 = new xi0.b(6, str3, null);
                qd0.b bVarN2 = ((ned.l) sharedCreateAlertRevampedScreen.X.getValue()).f214477c.f214444b.n();
                s.j(bVarN2);
                return new zp0.d(editText2, bVar7, new u80.d(((s80.b) bVarN2).b()), null, new usc.a(sharedCreateAlertRevampedScreen, 20), false, false, ((com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) sharedCreateAlertRevampedScreen.T2()).A2(), true, null, 1192);
            case 20:
                SharedCreateAlertScreen sharedCreateAlertScreen = (SharedCreateAlertScreen) obj6;
                AmountEditDelegate.Model model4 = (AmountEditDelegate.Model) obj2;
                AmountEditView field6 = (AmountEditView) obj3;
                KProperty[] kPropertyArr5 = SharedCreateAlertScreen.f0;
                Intrinsics.checkNotNullParameter(model4, "model");
                Intrinsics.checkNotNullParameter(field6, "field");
                Object obj13 = model4.f51629j;
                String str4 = obj13 instanceof String ? (String) obj13 : null;
                if (str4 == null) {
                    return null;
                }
                MaskedTextInputEditText editText3 = field6.getEditText();
                xi0.b bVar8 = new xi0.b(6, str4, null);
                qd0.b bVarN3 = ((ned.l) sharedCreateAlertScreen.Y.getValue()).f214477c.f214444b.n();
                s.j(bVarN3);
                return new zp0.d(editText3, bVar8, new u80.d(((s80.b) bVarN3).b()), null, new tul.b(sharedCreateAlertScreen, 21), false, false, ((com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) ((yed.q) sharedCreateAlertScreen.Z.getValue())).A2(), false, null, 1704);
            case 21:
                return a(obj2, obj3);
            case 22:
                return b(obj2, obj3);
            case 23:
                return c(obj2, obj3);
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                List list2 = ((com.revolut.feature.shared_separate_favourites.common.screen.add_asset.b) obj6).f86816c;
                yp0.b.k(list2, 0, 0, 0, 0, 31);
                return list2;
            case 25:
                return d(obj2, obj3);
            case 26:
                return e(obj2, obj3);
            case 27:
                return g(obj2, obj3);
            case 28:
                return h(obj2, obj3);
            default:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending.a aVar14 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending.a) obj6;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                PlanGiftSendingFlowContract$Step step13 = (PlanGiftSendingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (step13 instanceof PlanGiftSendingFlowContract$Step.SelectPlanToGive) {
                    xfa.b bVar9 = xfa.b.PLAN_GIFTING;
                    int i96 = com.revolut.retail.feature.pricing_plans.ui.impl.R$string.dashboard_item_gifting_title;
                    PlanGiftSendingFlowContract$InputData planGiftSendingFlowContract$InputData = aVar14.o;
                    PlanPagerFlow planPagerFlow = new PlanPagerFlow(new PlanPagerFlowContract$InputData(bVar9, new PlanPagerFlowContract$UiConfig(new PlanPagerFlowContract$UiConfig.TitleConfig.Custom(new TextLocalisedClause(i96, u.c(new TextClause(planGiftSendingFlowContract$InputData.f103176b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12)), new PlanLayoutType.Gifting(planGiftSendingFlowContract$InputData.f103175a), Integer.valueOf(R$drawable.uikit_icn_24_back), false), aVar14.f103182q.a(PricingPlansUiApi$Toggles.RevampedPlanBackgrounds.f102640c)));
                    yed.g0 block37 = new yed.g0(aVar14, 11);
                    Intrinsics.checkNotNullParameter(block37, "block");
                    planPagerFlow.H = block37;
                    return planPagerFlow;
                }
                if (!(step13 instanceof PlanGiftSendingFlowContract$Step.BillingPicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                PlanGiftSendingFlowContract$Step.BillingPicker billingPicker = (PlanGiftSendingFlowContract$Step.BillingPicker) step13;
                PlanBillingPickerFlow planBillingPickerFlow = new PlanBillingPickerFlow(billingPicker.f103179c);
                g0 block38 = new g0(aVar14, billingPicker, 26);
                Intrinsics.checkNotNullParameter(block38, "block");
                planBillingPickerFlow.H = block38;
                return planBillingPickerFlow;
        }
    }

    public /* synthetic */ g(Object obj2, Object obj3, int i) {
        this.f311647a = i;
        this.f311648b = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g(Function2 function2) {
        this.f311647a = 1;
        this.f311648b = (kotlin.jvm.internal.q) function2;
    }
}
