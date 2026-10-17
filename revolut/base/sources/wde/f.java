package wde;

import aee.k;
import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import b79.i;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.api.navigation.BackendFlowDestination;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.bills.core.api.model.form.MoneyField;
import com.revolut.feature.apm.bills.core.api.model.form.TextField;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.amount.TapiTransferAmountScreen;
import com.revolut.feature.atm.impl.ui.redesign.details.AtmDetailsBottomSheetContract$InputData;
import com.revolut.feature.atm.impl.ui.redesign.details.AtmDetailsBottomSheetController;
import com.revolut.feature.atm.impl.ui.redesign.error.AtmErrorController;
import com.revolut.feature.atm.impl.ui.redesign.v2.atm_list.AtmListScreen;
import com.revolut.feature.atm.impl.ui.redesign.v2.map.AtmMapScreenContract$ModalStep;
import com.revolut.feature.contacts.api.navigation.AddContactInputData;
import com.revolut.feature.contacts_chooser.api.models.ContactsFilter;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserBannerContent;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserEmptyState;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserMode;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsPrimaryButtonClause;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.SepaDirectDebitRepaymentMethodContract$ModalStep;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_amount.CreditCardInstalmentRepayChooseAmountScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_amount.CreditCardInstalmentRepayChooseAmountScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.custom_amount.CreditCardRepayCustomAmountFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.custom_amount.CreditCardRepayCustomAmountFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreenContract$InputData;
import com.revolut.feature.credit.loan.autopay.api.account_selector.AccountSelectorV2$InputData;
import com.revolut.feature.crypto.gift.asset.impl.ui.flow.CryptoGiftAssetFlowContract$Step;
import com.revolut.feature.crypto.gift.asset.impl.ui.screen.claim.CryptoGiftAssetClaimScreen;
import com.revolut.feature.crypto.gift.asset.impl.ui.screen.not_eligible.CryptoGiftAssetNotEligibleScreen;
import com.revolut.feature.esim.instructions.navigation.EsimInstructionsControllerDescriptor$InputData;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreen;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.insurance.impl.ui.cfac.claim.bottom_sheet.screen.CFACInsuranceBottomSheetScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.bottom_sheet.screen.CFACInsuranceBottomSheetScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreenContract$ModalStep;
import com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.JuniorContactPickerScreenContract$ModalStep;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.error.FormErrorsScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.error.FormErrorsScreenContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreenContract$ModalStep;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.feature.product_article.api.flow.ProductArticleFlowContract$InputData;
import com.revolut.feature.product_article.api.flow.ProductArticleFlowContract$Step;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.product_article.impl.ui.screen.details.ProductArticleDetailsController;
import com.revolut.feature.product_article.impl.ui.screen.details.ProductArticleDetailsControllerContract$InputData;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.AdditionalFieldsScreen;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.AdditionalFieldsScreenContract$InputData;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$Step;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.d;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.CardOwnerMainInfoScreen;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.CardOwnerMainInfoScreenContract$InputData;
import com.revolut.feature.retail.salary_account.impl.promotion_inactive.PromotionInactivePromptController;
import com.revolut.feature.retail.salary_account.impl.promotion_inactive.PromotionInactivePromptControllerContract$InputData;
import com.revolut.feature.retail.salary_account.impl.salary_promotion.SalaryPromotionControllerContract$ModalStep;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import com.revolut.feature.rewards.impl.R$plurals;
import com.revolut.feature.rewards.impl.R$string;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.RentAndBillsFlowContract$Step;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.home.RentAndBillsHomeScreen;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.manage.RentAndBillsManageLinkedPaymentsScreen;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.manage.RentAndBillsManageLinkedPaymentsScreenContract$InputData;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.rev_points_earned.RentAndBillsRevPointsEarnedScreen;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.rev_points_earned.RentAndBillsRevPointsEarnedScreenContract$InputData;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.select_payment.RentAndBillsSelectPaymentScreen;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.select_payment.RentAndBillsSelectPaymentScreenContract$InputData;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.unlink_payment.RentAndBillsUnlinkPaymentsBottomSheetScreen;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.unlink_payment.RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.unlink_payment.RentAndBillsUnlinkPaymentsStatusDialogFactory;
import com.revolut.feature.rewards.impl.utils.RentAndBillsProductArticleKey;
import com.revolut.feature.shared_separate_favourites.combined_watchlist.flow.CombinedWatchlistHomeFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.combined_watchlist.flow.CombinedWatchlistHomeFlowContract$Step;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.WatchlistHomeScreen;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.WatchlistHomeScreenContract$InputData;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest;
import com.revolut.feature.support.impl.transfer_tracker.ui.InboundTransferTrackerFlowContract$Step;
import com.revolut.feature.support.impl.transfer_tracker.ui.estimation_result.TransferTrackerEstimationResultScreen;
import com.revolut.feature.support.impl.transfer_tracker.ui.estimation_result.TransferTrackerEstimationResultScreenContract$InputData;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_swift_transfer_status.InboundSwiftTransferStatusScreen;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_swift_transfer_status.InboundSwiftTransferStatusScreenContract$InputData;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.InboundTransactionListScreen;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.InboundTransactionListScreenContract$InputData;
import com.revolut.feature.support.impl.transfer_tracker.ui.input_form.TransferTrackerInputFormScreen;
import com.revolut.feature.support.impl.transfer_tracker.ui.unique_transaction_reference.UniqueTransactionReferenceInputScreen;
import com.revolut.feature.tab.crypto.impl.ui.settings.CryptoSettingsScreenContract$ModalStep;
import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.stamp_duty.flow.StampDutyFlowContract$Step;
import com.revolut.feature.tax_residency.impl.stamp_duty.ui.pay.PayStampDutyScreen;
import com.revolut.feature.tax_residency.impl.stamp_duty.ui.pay.PayStampDutyScreenContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow.AddDeclarationFlow;
import com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow.AddDeclarationFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlow;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.list.TaxResidencyListScreen;
import com.revolut.feature.tax_residency.impl.v2.ui.list.TaxResidencyListScreenContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.multi_residency_flow.MultiResidencyFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.multi_residency_flow.MultiResidencyFlowContract$Step;
import com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.FundDetailsScreenContract$ModalStep;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.FundInvestmentDetailsScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.FundInvestmentDetailsScreenContract$InputData;
import com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.EditScreenerScreenContract$ModalStep;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.AsftWidgetFlowContract$Step;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.modal.available_soon.AsftPassAvailableSoonScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.modal.available_soon.AsftPassAvailableSoonScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking.AsftManageBookingPayload;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking.AsftManageBookingScreen;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.impl.ui.flows.help.EsimHelpFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.EsimConnectivityTroubleshootingFlow;
import com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.EsimConnectivityTroubleshootingFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.help.EsimHelpScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.terms.EsimTermsScreen;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.FamilyPlanContactSelectionFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.upgrade_to_invite.UpgradeToInviteFamilyMemberScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.upgrade_to_invite.UpgradeToInviteFamilyMemberScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$ModalStep;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet.PlanPageBottomSheetContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.bottom_sheet.PlanPageBottomSheetScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import d9.e1;
import dee.o;
import eii.g;
import eii.k;
import eii.l;
import grl.k9;
import hee.m;
import hee.n;
import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import lui.e;
import lui.f;
import lzi.q;
import nii.y0;
import nii.z;
import oki.h;
import pqa.j;
import u3a.p;
import vkm.j2;
import wk2.w;
import wk2.x;
import wp9.e0;
import yhm.r;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zp0.y;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f296554b;

    public /* synthetic */ f(Object obj2, int i) {
        this.f296553a = i;
        this.f296554b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        Clause textLocalisedQuantityClause;
        TextLocalisedQuantityClause textLocalisedQuantityClause2;
        TextLocalisedQuantityClause textLocalisedQuantityClause3;
        final com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c cVar = (com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c) this.f296554b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        final RentAndBillsFlowContract$Step step = (RentAndBillsFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        int i = 1;
        boolean z = false;
        if (step instanceof RentAndBillsFlowContract$Step.RevPointsOptIn) {
            ViewController viewControllerE1 = cVar.e1(new hub.a(new LifestyleRevPointsOptInController$InputData((RevPointsOptInSource) RevPointsOptInSource.RentAndBills.f84001a, false, false)));
            wic.c block = new wic.c(cVar, i);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        int i2 = 2;
        if (step instanceof RentAndBillsFlowContract$Step.ProductArticle) {
            ViewController viewControllerE12 = cVar.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(RentAndBillsProductArticleKey.INTRO)), SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, null, null, false, 60));
            wic.c block2 = new wic.c(cVar, i2);
            Intrinsics.checkNotNullParameter(block2, "block");
            viewControllerE12.H = block2;
            return viewControllerE12;
        }
        int i3 = 3;
        if (step instanceof RentAndBillsFlowContract$Step.Home) {
            RentAndBillsHomeScreen rentAndBillsHomeScreen = new RentAndBillsHomeScreen();
            wic.c block3 = new wic.c(cVar, i3);
            Intrinsics.checkNotNullParameter(block3, "block");
            rentAndBillsHomeScreen.H = block3;
            return rentAndBillsHomeScreen;
        }
        if (step instanceof RentAndBillsFlowContract$Step.LinkPaymentInfo) {
            zic.b bVar = cVar.f84974p;
            RentAndBillsFlowContract$Step.LinkPaymentInfo linkPaymentInfo = (RentAndBillsFlowContract$Step.LinkPaymentInfo) step;
            egc.a categoryType = linkPaymentInfo.f84961a;
            RentAndBillsConfigurations.Configuration perkConfiguration = linkPaymentInfo.f84962b;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(categoryType, "categoryType");
            Intrinsics.checkNotNullParameter(perkConfiguration, "perkConfiguration");
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(mra.d.E(categoryType, R$string.rent_and_bills_link_payment_details_rent_title, R$string.rent_and_bills_link_payment_details_bills_title), null, null, 14);
            int iE = mra.d.E(categoryType, R$string.rent_and_bills_link_payment_details_rent_subtitle, R$string.rent_and_bills_link_payment_details_bills_subtitle);
            dj0.d dVar = perkConfiguration.f84780b;
            int i5 = perkConfiguration.f84781c;
            lw0.a aVar = new lw0.a(textLocalisedClause, new TextLocalisedClause(iE, v.k(sx4.f.b(3, null, null, dVar), nub.a.q(qvb.a.a(perkConfiguration.f84779a), null, null, null, 7)), null, 12), null, null, false, 28);
            int[] iArr = zic.a.f322517a;
            int i6 = iArr[categoryType.ordinal()];
            if (i6 == 1) {
                textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.rent_and_bills_link_payment_details_rent_cells_link_title, Integer.valueOf(i5), (List) null, (Style) null, 28);
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedQuantityClause = new TextLocalisedClause(R$string.rent_and_bills_link_payment_details_bills_cells_link_title, null, null, 14);
            }
            Clause clause = textLocalisedQuantityClause;
            int i21 = iArr[categoryType.ordinal()];
            if (i21 == 1) {
                dj0.d dVar2 = perkConfiguration.d.f84782a;
                if (dVar2 == null) {
                    textLocalisedQuantityClause2 = new TextLocalisedQuantityClause(R$plurals.rent_and_bills_link_payment_details_common_cells_link_subtitle2, Integer.valueOf(i5), (List) null, (Style) null, 28);
                    int i22 = 6;
                    RowDelegate.Model.c cVar2 = null;
                    Object obj4 = null;
                    boolean z3 = false;
                    boolean z4 = false;
                    List listK = v.k(new l(clause, (Clause) textLocalisedQuantityClause2, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_link, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i22), false, false, (RowDelegate.Model.c) null, (Object) null, 488), new l((Clause) new TextLocalisedClause(R$string.rent_and_bills_link_payment_details_common_cells_qualifying_payments_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.rent_and_bills_link_payment_details_common_cells_qualifying_payments_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_recurring_payment, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, i22), false, false, cVar2, obj4, 488), new l((Clause) new TextLocalisedClause(R$string.rent_and_bills_link_payment_details_common_cells_earn_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.rent_and_bills_link_payment_details_common_cells_earn_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_rev_points_mono, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, i22), false, false, cVar2, obj4, 488));
                    aw0.e eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(mra.d.E(categoryType, R$string.rent_and_bills_link_payment_details_rent_footer_button_text, R$string.rent_and_bills_link_payment_details_bills_footer_button_text), null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
                    k9 value = k9.Premium;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    Intrinsics.checkNotNullParameter(value, "value");
                    RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar, eVar, listK, new AnalyticsProduct.Retail(value), null));
                    final int i32 = 0;
                    Function1 block4 = new Function1() { // from class: wic.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i32) {
                                case 0:
                                    k output = (k) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (Intrinsics.f(output, g.f126653a)) {
                                        RentAndBillsFlowContract$Step.LinkPaymentInfo linkPaymentInfo2 = (RentAndBillsFlowContract$Step.LinkPaymentInfo) step;
                                        egc.a aVar2 = linkPaymentInfo2.f84961a;
                                        RentAndBillsConfigurations.Configuration configuration = linkPaymentInfo2.f84962b;
                                        com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c cVar3 = cVar;
                                        h.t2(cVar3, cVar3.u, new RentAndBillsFlowContract$Step.SelectPayment(aVar2, configuration), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    pjc.g output2 = (pjc.g) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    boolean z6 = output2 instanceof pjc.e;
                                    com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c cVar4 = cVar;
                                    RentAndBillsFlowContract$Step rentAndBillsFlowContract$Step = step;
                                    if (z6) {
                                        egc.a aVar3 = ((RentAndBillsFlowContract$Step.UnlinkPayments) rentAndBillsFlowContract$Step).f84970a;
                                        int i33 = ((pjc.e) output2).f236726a;
                                        yji.l.a1(cVar4, cVar4.X1(new mii.k("UNLINK_PAYMENTS_SUCCESS_TOAST_ID", mra.d.G(aVar3, R$string.rent_and_bills_unlink_linked_payments_success_rent_title, R$plurals.rent_and_bills_unlink_linked_payments_success_bills_title, i33, u.c(Integer.valueOf(i33))), null, null, null, 28)), null, null, null, 7);
                                    } else {
                                        if (!(output2 instanceof pjc.f)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        RentAndBillsFlowContract$Step.UnlinkPayments unlinkPayments = (RentAndBillsFlowContract$Step.UnlinkPayments) rentAndBillsFlowContract$Step;
                                        int i43 = ((pjc.f) output2).f236727a;
                                        RentAndBillsUnlinkPaymentsStatusDialogFactory rentAndBillsUnlinkPaymentsStatusDialogFactory = cVar4.f84978t;
                                        egc.a categoryType2 = unlinkPayments.f84970a;
                                        rentAndBillsUnlinkPaymentsStatusDialogFactory.getClass();
                                        Intrinsics.checkNotNullParameter(categoryType2, "categoryType");
                                        yji.l.a1(cVar4, cVar4.X1(new y0("UNLINK_PAYMENTS_FAILED_DIALOG_ID", new z(mra.d.G(categoryType2, R$string.rent_and_bills_unlink_linked_payments_failure_rent_title, R$plurals.rent_and_bills_unlink_linked_payments_failure_bills_title, i43, f0.f322471a), null, new TextLocalisedClause(R$string.rent_and_bills_unlink_linked_payments_failure_footer_try_again, null, null, 14), null, null, RentAndBillsUnlinkPaymentsStatusDialogFactory.UnlinkPaymentErrorDialogPayload.PaymentUnlinkingFailed.f84988a, true, null, null, null, null, null, null, 32374), false, 4)), null, null, new com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.b(cVar4, unlinkPayments, null), 3);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block4, "block");
                    rowActionsBottomSheetController.H = block4;
                    return rowActionsBottomSheetController;
                }
                textLocalisedQuantityClause3 = new TextLocalisedQuantityClause(R$plurals.rent_and_bills_link_payment_details_common_cells_link_subtitle_limit2, Integer.valueOf(i5), v.k(Integer.valueOf(i5), sx4.f.b(3, null, null, dVar2)), (Style) null, 24);
            } else {
                if (i21 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedQuantityClause3 = new TextLocalisedQuantityClause(R$plurals.rent_and_bills_link_payment_details_common_cells_link_subtitle2, Integer.valueOf(i5), (List) null, (Style) null, 28);
            }
            textLocalisedQuantityClause2 = textLocalisedQuantityClause3;
            int i222 = 6;
            RowDelegate.Model.c cVar22 = null;
            Object obj42 = null;
            boolean z310 = false;
            boolean z49 = false;
            List listK2 = v.k(new l(clause, (Clause) textLocalisedQuantityClause2, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_link, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i222), false, false, (RowDelegate.Model.c) null, (Object) null, 488), new l((Clause) new TextLocalisedClause(R$string.rent_and_bills_link_payment_details_common_cells_qualifying_payments_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.rent_and_bills_link_payment_details_common_cells_qualifying_payments_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_recurring_payment, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z310, z310, i222), false, false, cVar22, obj42, 488), new l((Clause) new TextLocalisedClause(R$string.rent_and_bills_link_payment_details_common_cells_earn_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.rent_and_bills_link_payment_details_common_cells_earn_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_rev_points_mono, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z49, z49, i222), false, false, cVar22, obj42, 488));
            aw0.e eVar2 = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(mra.d.E(categoryType, R$string.rent_and_bills_link_payment_details_rent_footer_button_text, R$string.rent_and_bills_link_payment_details_bills_footer_button_text), null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
            k9 value2 = k9.Premium;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value2, "value");
            RowActionsBottomSheetController rowActionsBottomSheetController2 = new RowActionsBottomSheetController(new eii.c(aVar, eVar2, listK2, new AnalyticsProduct.Retail(value2), null));
            final int i322 = 0;
            Function1 block42 = new Function1() { // from class: wic.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    switch (i322) {
                        case 0:
                            k output = (k) obj5;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (Intrinsics.f(output, g.f126653a)) {
                                RentAndBillsFlowContract$Step.LinkPaymentInfo linkPaymentInfo2 = (RentAndBillsFlowContract$Step.LinkPaymentInfo) step;
                                egc.a aVar2 = linkPaymentInfo2.f84961a;
                                RentAndBillsConfigurations.Configuration configuration = linkPaymentInfo2.f84962b;
                                com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c cVar3 = cVar;
                                h.t2(cVar3, cVar3.u, new RentAndBillsFlowContract$Step.SelectPayment(aVar2, configuration), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        default:
                            pjc.g output2 = (pjc.g) obj5;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z6 = output2 instanceof pjc.e;
                            com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c cVar4 = cVar;
                            RentAndBillsFlowContract$Step rentAndBillsFlowContract$Step = step;
                            if (z6) {
                                egc.a aVar3 = ((RentAndBillsFlowContract$Step.UnlinkPayments) rentAndBillsFlowContract$Step).f84970a;
                                int i33 = ((pjc.e) output2).f236726a;
                                yji.l.a1(cVar4, cVar4.X1(new mii.k("UNLINK_PAYMENTS_SUCCESS_TOAST_ID", mra.d.G(aVar3, R$string.rent_and_bills_unlink_linked_payments_success_rent_title, R$plurals.rent_and_bills_unlink_linked_payments_success_bills_title, i33, u.c(Integer.valueOf(i33))), null, null, null, 28)), null, null, null, 7);
                            } else {
                                if (!(output2 instanceof pjc.f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                RentAndBillsFlowContract$Step.UnlinkPayments unlinkPayments = (RentAndBillsFlowContract$Step.UnlinkPayments) rentAndBillsFlowContract$Step;
                                int i43 = ((pjc.f) output2).f236727a;
                                RentAndBillsUnlinkPaymentsStatusDialogFactory rentAndBillsUnlinkPaymentsStatusDialogFactory = cVar4.f84978t;
                                egc.a categoryType2 = unlinkPayments.f84970a;
                                rentAndBillsUnlinkPaymentsStatusDialogFactory.getClass();
                                Intrinsics.checkNotNullParameter(categoryType2, "categoryType");
                                yji.l.a1(cVar4, cVar4.X1(new y0("UNLINK_PAYMENTS_FAILED_DIALOG_ID", new z(mra.d.G(categoryType2, R$string.rent_and_bills_unlink_linked_payments_failure_rent_title, R$plurals.rent_and_bills_unlink_linked_payments_failure_bills_title, i43, f0.f322471a), null, new TextLocalisedClause(R$string.rent_and_bills_unlink_linked_payments_failure_footer_try_again, null, null, 14), null, null, RentAndBillsUnlinkPaymentsStatusDialogFactory.UnlinkPaymentErrorDialogPayload.PaymentUnlinkingFailed.f84988a, true, null, null, null, null, null, null, 32374), false, 4)), null, null, new com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.b(cVar4, unlinkPayments, null), 3);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block42, "block");
            rowActionsBottomSheetController2.H = block42;
            return rowActionsBottomSheetController2;
        }
        if (step instanceof RentAndBillsFlowContract$Step.ManageLinkedPayments) {
            RentAndBillsFlowContract$Step.ManageLinkedPayments manageLinkedPayments = (RentAndBillsFlowContract$Step.ManageLinkedPayments) step;
            RentAndBillsManageLinkedPaymentsScreen rentAndBillsManageLinkedPaymentsScreen = new RentAndBillsManageLinkedPaymentsScreen(new RentAndBillsManageLinkedPaymentsScreenContract$InputData(manageLinkedPayments.f84963a, manageLinkedPayments.f84964b));
            cVar.a(rentAndBillsManageLinkedPaymentsScreen, new p(cVar, step, 16));
            return rentAndBillsManageLinkedPaymentsScreen;
        }
        if (step instanceof RentAndBillsFlowContract$Step.AllowanceDetails) {
            ejc.a aVar2 = cVar.f84976r;
            RentAndBillsFlowContract$Step.AllowanceDetails allowanceDetails = (RentAndBillsFlowContract$Step.AllowanceDetails) step;
            egc.a categoryType2 = allowanceDetails.f84955a;
            RentAndBillsConfigurations.Configuration perkConfiguration2 = allowanceDetails.f84956b;
            double d = allowanceDetails.f84957c;
            xi0.b currency = perkConfiguration2.f84780b.f115083b;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(categoryType2, "categoryType");
            Intrinsics.checkNotNullParameter(perkConfiguration2, "perkConfiguration");
            Intrinsics.checkNotNullParameter(currency, "currency");
            double d5 = perkConfiguration2.f84779a;
            int i33 = perkConfiguration2.f84781c;
            double d6 = perkConfiguration2.f84780b.f115082a;
            double d10 = d5 * d6;
            double d15 = d * d6;
            double d41 = d10 - d15;
            if (d41 < 0.0d) {
                d41 = 0.0d;
            }
            lw0.a aVar3 = new lw0.a(new TextLocalisedClause(mra.d.E(categoryType2, R$string.rent_and_bills_allowance_details_rent_title, R$string.rent_and_bills_allowance_details_bills_title), null, null, 14), new TextLocalisedQuantityClause(mra.d.E(categoryType2, R$plurals.rent_and_bills_allowance_details_rent_subtitle, R$plurals.rent_and_bills_allowance_details_bills_subtitle), Integer.valueOf(i33), v.k(Integer.valueOf(i33), sx4.f.b(3, null, null, new dj0.d(rim.d.d(d10), currency))), (Style) null, 24), null, null, false, 28);
            List listK3 = v.k(ejc.a.a("TOTAL_ALLOWANCE_CELL_DETAILS_ID", R$string.rent_and_bills_allowance_details_cell_total_title, d10, currency), ejc.a.a("LINKED_CELL_DETAILS_ID", mra.d.E(categoryType2, R$string.rent_and_bills_allowance_details_cell_rent_linked_title, R$string.rent_and_bills_allowance_details_cell_bills_linked_title), d15, currency), ejc.a.a("REMAINING_CELL_DETAILS_ID", R$string.rent_and_bills_allowance_details_cell_remaining_title, d41, currency));
            k9 k9Var = k9.Premium;
            Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
            return new RowActionsBottomSheetController(new eii.c(aVar3, null, listK3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null));
        }
        if (step instanceof RentAndBillsFlowContract$Step.EarnRateDetails) {
            ejc.b bVar2 = cVar.f84977s;
            RentAndBillsFlowContract$Step.EarnRateDetails earnRateDetails = (RentAndBillsFlowContract$Step.EarnRateDetails) step;
            egc.a categoryType3 = earnRateDetails.f84958a;
            RentAndBillsConfigurations.Configuration perkConfiguration3 = earnRateDetails.f84959b;
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(categoryType3, "categoryType");
            Intrinsics.checkNotNullParameter(perkConfiguration3, "perkConfiguration");
            lw0.a aVar4 = new lw0.a(new TextLocalisedClause(R$string.rent_and_bills_earn_rate_details_title, null, null, 14), new TextLocalisedClause(mra.d.E(categoryType3, R$string.rent_and_bills_earn_rate_details_rent_subtitle, R$string.rent_and_bills_earn_rate_details_bills_subtitle), v.k(nub.a.q(qvb.a.a(perkConfiguration3.f84779a), null, null, null, 7), sx4.f.b(3, null, null, new dj0.d(rim.d.d(perkConfiguration3.f84779a * r0.f115082a), perkConfiguration3.f84780b.f115083b))), null, 12), null, null, false, 28);
            f0 f0Var = f0.f322471a;
            aw0.e eVar3 = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.rent_and_bills_earn_rate_details_primary_button_text, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
            k9 value3 = k9.Premium;
            Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value3, "value");
            return new RowActionsBottomSheetController(new eii.c(aVar4, eVar3, f0Var, new AnalyticsProduct.Retail(value3), null));
        }
        if (step instanceof RentAndBillsFlowContract$Step.UnlinkPayments) {
            RentAndBillsFlowContract$Step.UnlinkPayments unlinkPayments = (RentAndBillsFlowContract$Step.UnlinkPayments) step;
            RentAndBillsUnlinkPaymentsBottomSheetScreen rentAndBillsUnlinkPaymentsBottomSheetScreen = new RentAndBillsUnlinkPaymentsBottomSheetScreen(new RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData(unlinkPayments.f84970a, unlinkPayments.f84971b, unlinkPayments.f84972c));
            final int i43 = 1;
            Function1 block5 = new Function1() { // from class: wic.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    switch (i43) {
                        case 0:
                            k output = (k) obj5;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (Intrinsics.f(output, g.f126653a)) {
                                RentAndBillsFlowContract$Step.LinkPaymentInfo linkPaymentInfo2 = (RentAndBillsFlowContract$Step.LinkPaymentInfo) step;
                                egc.a aVar22 = linkPaymentInfo2.f84961a;
                                RentAndBillsConfigurations.Configuration configuration = linkPaymentInfo2.f84962b;
                                com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c cVar3 = cVar;
                                h.t2(cVar3, cVar3.u, new RentAndBillsFlowContract$Step.SelectPayment(aVar22, configuration), true, null, false, 12);
                            }
                            return Unit.f186387a;
                        default:
                            pjc.g output2 = (pjc.g) obj5;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z6 = output2 instanceof pjc.e;
                            com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c cVar4 = cVar;
                            RentAndBillsFlowContract$Step rentAndBillsFlowContract$Step = step;
                            if (z6) {
                                egc.a aVar32 = ((RentAndBillsFlowContract$Step.UnlinkPayments) rentAndBillsFlowContract$Step).f84970a;
                                int i332 = ((pjc.e) output2).f236726a;
                                yji.l.a1(cVar4, cVar4.X1(new mii.k("UNLINK_PAYMENTS_SUCCESS_TOAST_ID", mra.d.G(aVar32, R$string.rent_and_bills_unlink_linked_payments_success_rent_title, R$plurals.rent_and_bills_unlink_linked_payments_success_bills_title, i332, u.c(Integer.valueOf(i332))), null, null, null, 28)), null, null, null, 7);
                            } else {
                                if (!(output2 instanceof pjc.f)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                RentAndBillsFlowContract$Step.UnlinkPayments unlinkPayments2 = (RentAndBillsFlowContract$Step.UnlinkPayments) rentAndBillsFlowContract$Step;
                                int i432 = ((pjc.f) output2).f236727a;
                                RentAndBillsUnlinkPaymentsStatusDialogFactory rentAndBillsUnlinkPaymentsStatusDialogFactory = cVar4.f84978t;
                                egc.a categoryType22 = unlinkPayments2.f84970a;
                                rentAndBillsUnlinkPaymentsStatusDialogFactory.getClass();
                                Intrinsics.checkNotNullParameter(categoryType22, "categoryType");
                                yji.l.a1(cVar4, cVar4.X1(new y0("UNLINK_PAYMENTS_FAILED_DIALOG_ID", new z(mra.d.G(categoryType22, R$string.rent_and_bills_unlink_linked_payments_failure_rent_title, R$plurals.rent_and_bills_unlink_linked_payments_failure_bills_title, i432, f0.f322471a), null, new TextLocalisedClause(R$string.rent_and_bills_unlink_linked_payments_failure_footer_try_again, null, null, 14), null, null, RentAndBillsUnlinkPaymentsStatusDialogFactory.UnlinkPaymentErrorDialogPayload.PaymentUnlinkingFailed.f84988a, true, null, null, null, null, null, null, 32374), false, 4)), null, null, new com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.b(cVar4, unlinkPayments2, null), 3);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block5, "block");
            rentAndBillsUnlinkPaymentsBottomSheetScreen.H = block5;
            return rentAndBillsUnlinkPaymentsBottomSheetScreen;
        }
        if (step instanceof RentAndBillsFlowContract$Step.SelectPayment) {
            RentAndBillsFlowContract$Step.SelectPayment selectPayment = (RentAndBillsFlowContract$Step.SelectPayment) step;
            RentAndBillsSelectPaymentScreen rentAndBillsSelectPaymentScreen = new RentAndBillsSelectPaymentScreen(new RentAndBillsSelectPaymentScreenContract$InputData(selectPayment.f84968a, selectPayment.f84969b));
            vx9.v block6 = new vx9.v(LazyFlowCoordinator, 15, cVar, step);
            Intrinsics.checkNotNullParameter(block6, "block");
            rentAndBillsSelectPaymentScreen.H = block6;
            return rentAndBillsSelectPaymentScreen;
        }
        if (!(step instanceof RentAndBillsFlowContract$Step.RevPointsEarnedPrompt)) {
            throw new NoWhenBranchMatchedException();
        }
        RentAndBillsRevPointsEarnedScreen rentAndBillsRevPointsEarnedScreen = new RentAndBillsRevPointsEarnedScreen(new RentAndBillsRevPointsEarnedScreenContract$InputData(((RentAndBillsFlowContract$Step.RevPointsEarnedPrompt) step).f84966a));
        wic.c block7 = new wic.c(cVar, 4);
        Intrinsics.checkNotNullParameter(block7, "block");
        rentAndBillsRevPointsEarnedScreen.H = block7;
        return rentAndBillsRevPointsEarnedScreen;
    }

    private final Object b(Object obj2, Object obj3) {
        com.revolut.feature.atm.impl.ui.redesign.v2.map.a aVar = (com.revolut.feature.atm.impl.ui.redesign.v2.map.a) this.f296554b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        AtmMapScreenContract$ModalStep step = (AtmMapScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof AtmMapScreenContract$ModalStep.RequestLocationPermissions) {
            sk2.a aVar2 = aVar.f63184q;
            w onSuccess = new w(aVar, 0);
            w onDenied = new w(aVar, 1);
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
            Intrinsics.checkNotNullParameter(onDenied, "onDenied");
            PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(v.k(new PermissionsControllerContract$Permission("android.permission.ACCESS_FINE_LOCATION", null, null, true, 6), new PermissionsControllerContract$Permission("android.permission.ACCESS_COARSE_LOCATION", null, null, true, 6))));
            sdi.k block = new sdi.k(onSuccess, onDenied, aVar2);
            Intrinsics.checkNotNullParameter(block, "block");
            permissionsController.H = block;
            return permissionsController;
        }
        if (step instanceof AtmMapScreenContract$ModalStep.ShowError) {
            AtmErrorController atmErrorController = new AtmErrorController();
            x block2 = new x(aVar, 0);
            Intrinsics.checkNotNullParameter(block2, "block");
            atmErrorController.H = block2;
            return atmErrorController;
        }
        if (step instanceof AtmMapScreenContract$ModalStep.ShowAtmList) {
            AtmListScreen atmListScreen = new AtmListScreen();
            atmListScreen.k2(new w(aVar, 2));
            return atmListScreen;
        }
        if (!(step instanceof AtmMapScreenContract$ModalStep.ShowAtmDetails)) {
            throw new NoWhenBranchMatchedException();
        }
        AtmDetailsBottomSheetController atmDetailsBottomSheetController = new AtmDetailsBottomSheetController(new AtmDetailsBottomSheetContract$InputData(((AtmMapScreenContract$ModalStep.ShowAtmDetails) step).f63180a, aVar.A));
        atmDetailsBottomSheetController.k2(new w(aVar, 3));
        return atmDetailsBottomSheetController;
    }

    private final Object c(Object obj2, Object obj3) {
        wka.h hVar = (wka.h) this.f296554b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        ProductArticleFlowContract$Step step = (ProductArticleFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, ProductArticleFlowContract$Step.Details.f81267a)) {
            throw new NoWhenBranchMatchedException();
        }
        ProductArticleFlowContract$InputData productArticleFlowContract$InputData = hVar.o;
        ProductArticleDetailsController productArticleDetailsController = new ProductArticleDetailsController(new ProductArticleDetailsControllerContract$InputData(productArticleFlowContract$InputData.f81264a, productArticleFlowContract$InputData.f81266c, productArticleFlowContract$InputData.d, productArticleFlowContract$InputData.e, productArticleFlowContract$InputData.f));
        if (!hVar.f298267q) {
            wka.b block = new wka.b(hVar, 1);
            Intrinsics.checkNotNullParameter(block, "block");
            productArticleDetailsController.H = block;
            return productArticleDetailsController;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        productArticleDetailsController.l2(new w83.a(hVar, ref$ObjectRef, 18));
        i block2 = new i(ref$ObjectRef, hVar);
        Intrinsics.checkNotNullParameter(block2, "block");
        productArticleDetailsController.H = block2;
        return productArticleDetailsController;
    }

    private final Object d(Object obj2, Object obj3) {
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.a aVar = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.a) this.f296554b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        PlanBenefitsScreenContract$ModalStep step = (PlanBenefitsScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof PlanBenefitsScreenContract$ModalStep.PlanPagerBottomSheet) {
            return new PlanPageBottomSheetScreen(new PlanPageBottomSheetContract$InputData(((PlanBenefitsScreenContract$ModalStep.PlanPagerBottomSheet) step).f103460a, aVar.f103468t.a(PricingPlansUiApi$Toggles.RevampedPlanBackgrounds.f102640c), null));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object e(Object obj2, Object obj3) {
        com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.a aVar = (com.revolut.feature.junior_remote_login.impl.ui.screen.contact_picker.a) this.f296554b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        JuniorContactPickerScreenContract$ModalStep step = (JuniorContactPickerScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, JuniorContactPickerScreenContract$ModalStep.AddNewContact.f77213a)) {
            ViewController viewControllerE1 = aVar.e1(new el3.a(new AddContactInputData(new AddContactInputData.InputMode.Phone(0), el3.b.FINISH, R$drawable.uikit_icn_24_cross)));
            x block = new x(aVar, 7);
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (!(step instanceof JuniorContactPickerScreenContract$ModalStep.PersonalDataConsentConfirmation)) {
            throw new NoWhenBranchMatchedException();
        }
        ViewController viewControllerE12 = aVar.e1(new kl8.a(aVar.o.f77211a));
        wg2.g block2 = new wg2.g(ModalCoordinator, 18, aVar, step);
        Intrinsics.checkNotNullParameter(block2, "block");
        viewControllerE12.H = block2;
        return viewControllerE12;
    }

    private final Object g(Object obj2, Object obj3) {
        com.revolut.feature.tax_residency.impl.stamp_duty.flow.a aVar = (com.revolut.feature.tax_residency.impl.stamp_duty.flow.a) this.f296554b;
        yki.l FlowCoordinator = (yki.l) obj2;
        StampDutyFlowContract$Step step = (StampDutyFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof StampDutyFlowContract$Step.PayDialog)) {
            throw new NoWhenBranchMatchedException();
        }
        woe.c cVar = aVar.o;
        PayStampDutyScreen payStampDutyScreen = new PayStampDutyScreen(new PayStampDutyScreenContract$InputData(cVar.f298935b, cVar.f298934a));
        wg2.g block = new wg2.g(aVar, FlowCoordinator, 27);
        Intrinsics.checkNotNullParameter(block, "block");
        payStampDutyScreen.H = block;
        return payStampDutyScreen;
    }

    private final Object h(Object obj2, Object obj3) {
        com.revolut.feature.tax_residency.impl.v2.ui.multi_residency_flow.c cVar = (com.revolut.feature.tax_residency.impl.v2.ui.multi_residency_flow.c) this.f296554b;
        MultiResidencyFlowContract$InputData multiResidencyFlowContract$InputData = cVar.o;
        yki.l FlowCoordinator = (yki.l) obj2;
        MultiResidencyFlowContract$Step step = (MultiResidencyFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, MultiResidencyFlowContract$Step.TaxResidencyList.f90286a)) {
            TaxResidencyListScreen taxResidencyListScreen = new TaxResidencyListScreen(new TaxResidencyListScreenContract$InputData(multiResidencyFlowContract$InputData.f90274a, multiResidencyFlowContract$InputData.f90277g, multiResidencyFlowContract$InputData.i, multiResidencyFlowContract$InputData.f90279j));
            x block = new x(cVar, 28);
            Intrinsics.checkNotNullParameter(block, "block");
            taxResidencyListScreen.H = block;
            return taxResidencyListScreen;
        }
        if (step instanceof MultiResidencyFlowContract$Step.AddTaxResidencyDeclaration) {
            MultiResidencyFlowContract$Step.AddTaxResidencyDeclaration addTaxResidencyDeclaration = (MultiResidencyFlowContract$Step.AddTaxResidencyDeclaration) step;
            AddDeclarationFlow addDeclarationFlow = new AddDeclarationFlow(new AddDeclarationFlowContract$InputData(addTaxResidencyDeclaration.f90281b == null ? mpe.g.DEFAULT : mpe.g.PRIMARY_RESIDENCY_DECLARATION, multiResidencyFlowContract$InputData.f90275b, addTaxResidencyDeclaration.f90282c, multiResidencyFlowContract$InputData.d, multiResidencyFlowContract$InputData.e, multiResidencyFlowContract$InputData.i, multiResidencyFlowContract$InputData.f90277g.f90181c, multiResidencyFlowContract$InputData.f90278h, addTaxResidencyDeclaration.d));
            wp5.v block2 = new wp5.v(addTaxResidencyDeclaration, cVar, 9);
            Intrinsics.checkNotNullParameter(block2, "block");
            addDeclarationFlow.H = block2;
            return addDeclarationFlow;
        }
        if (!(step instanceof MultiResidencyFlowContract$Step.EditTaxResidencyDeclaration)) {
            throw new NoWhenBranchMatchedException();
        }
        MultiResidencyFlowContract$Step.EditTaxResidencyDeclaration editTaxResidencyDeclaration = (MultiResidencyFlowContract$Step.EditTaxResidencyDeclaration) step;
        wi0.b bVar = editTaxResidencyDeclaration.f90283a;
        TaxResidencyDeclarationFlow taxResidencyDeclarationFlow = new TaxResidencyDeclarationFlow(new TaxResidencyDeclarationFlowContract$InputData(bVar, editTaxResidencyDeclaration.f90284b, com.revolut.feature.tax_residency.impl.v2.models.a.a(multiResidencyFlowContract$InputData.e, bVar), editTaxResidencyDeclaration.f90285c, multiResidencyFlowContract$InputData.i, multiResidencyFlowContract$InputData.f90277g.f90181c, multiResidencyFlowContract$InputData.f90278h, BackNavigationType.BACK, true));
        wp5.v block3 = new wp5.v(cVar, editTaxResidencyDeclaration, 8);
        Intrinsics.checkNotNullParameter(block3, "block");
        taxResidencyDeclarationFlow.H = block3;
        return taxResidencyDeclarationFlow;
    }

    private final Object i(Object obj2, Object obj3) {
        com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a aVar = (com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a) this.f296554b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        EditScreenerScreenContract$ModalStep step = (EditScreenerScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof EditScreenerScreenContract$ModalStep.DeleteConfirmation)) {
            throw new NoWhenBranchMatchedException();
        }
        aVar.f96238r.getClass();
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.screener_edit_screen_delete_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.screener_edit_screen_delete_dialog_description, null, null, 14), null, null, false, 28);
        aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.screener_edit_screen_delete_dialog_no, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.screener_edit_screen_delete_dialog_yes, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        wph.a block = new wph.a(aVar, 1);
        Intrinsics.checkNotNullParameter(block, "block");
        actionsBottomSheetController.H = block;
        return actionsBottomSheetController;
    }

    private final Object j(Object obj2, Object obj3) {
        wpj.e eVar = (wpj.e) this.f296554b;
        q value = (q) obj3;
        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
        Intrinsics.checkNotNullParameter(value, "value");
        eVar.f299348b.f("budget_suggestion_config", value);
        return Unit.f186387a;
    }

    private final Object k(Object obj2, Object obj3) {
        wq8.c cVar = (wq8.c) this.f296554b;
        String juniorId = (String) obj2;
        List settings = (List) obj3;
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(settings, "settings");
        cVar.f299422b.f(wq8.c.b(juniorId), settings);
        return Unit.f186387a;
    }

    private final Object l(Object obj2, Object obj3) {
        final com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.d dVar = (com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.d) this.f296554b;
        yki.l FlowCoordinator = (yki.l) obj2;
        final CardOwnerCreationFlowContract$Step step = (CardOwnerCreationFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CardOwnerCreationFlowContract$Step.CardOwnerMainInfo) {
            CardOwnerMainInfoScreen cardOwnerMainInfoScreen = new CardOwnerMainInfoScreen(new CardOwnerMainInfoScreenContract$InputData(dVar.f81575q.f81547c));
            wpj.b block = new wpj.b(dVar, 2);
            Intrinsics.checkNotNullParameter(block, "block");
            cardOwnerMainInfoScreen.H = block;
            return cardOwnerMainInfoScreen;
        }
        if (step instanceof CardOwnerCreationFlowContract$Step.Address) {
            ViewController viewControllerE1 = dVar.e1(new th1.a(new AddressFlowContract$InputData(new Address(null, null, null, null, null, ((CardOwnerCreationFlowContract$Step.Address) step).f81571b.f297794a, null, null, null, null, null, null, null, null, null, 32735, null), new TextLocalisedClause(com.revolut.feature.push_to_card.impl.R$string.push2card_screening_address_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.push_to_card.impl.R$string.push2card_screening_address_description, null, null, 14), false, null, null, null, null, false, null, 2097140), null, null, 6));
            final int i = 0;
            Function1 block2 = new Function1() { // from class: wqa.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            AddressFlowContract$OutputData output = (AddressFlowContract$OutputData) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.a aVar = new com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.a(step, output, null);
                            String str = output.d;
                            if (str == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            d dVar2 = dVar;
                            dVar2.l2(new wih.c(dVar2, str, aVar, (Continuation) null), new yi5.b(26));
                            return Unit.f186387a;
                        default:
                            j output2 = (j) obj4;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.b bVar = new com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.b(step, output2, null);
                            output2.getClass();
                            d dVar3 = dVar;
                            dVar3.l2(new wih.c(dVar3, "AdditionalFieldsScreenContract_BUTTON_TAG", bVar, (Continuation) null), new yi5.b(26));
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            viewControllerE1.H = block2;
            return viewControllerE1;
        }
        if (!(step instanceof CardOwnerCreationFlowContract$Step.AdditionalFields)) {
            throw new NoWhenBranchMatchedException();
        }
        AdditionalFieldsScreen additionalFieldsScreen = new AdditionalFieldsScreen(new AdditionalFieldsScreenContract$InputData(((CardOwnerCreationFlowContract$Step.AdditionalFields) step).f81569b));
        final int i2 = 1;
        Function1 block3 = new Function1() { // from class: wqa.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        AddressFlowContract$OutputData output = (AddressFlowContract$OutputData) obj4;
                        Intrinsics.checkNotNullParameter(output, "output");
                        com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.a aVar = new com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.a(step, output, null);
                        String str = output.d;
                        if (str == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        d dVar2 = dVar;
                        dVar2.l2(new wih.c(dVar2, str, aVar, (Continuation) null), new yi5.b(26));
                        return Unit.f186387a;
                    default:
                        j output2 = (j) obj4;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.b bVar = new com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.b(step, output2, null);
                        output2.getClass();
                        d dVar3 = dVar;
                        dVar3.l2(new wih.c(dVar3, "AdditionalFieldsScreenContract_BUTTON_TAG", bVar, (Continuation) null), new yi5.b(26));
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block3, "block");
        additionalFieldsScreen.H = block3;
        return additionalFieldsScreen;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    private final Object m(Object obj2, Object obj3) {
        TapiTransferAmountScreen tapiTransferAmountScreen = (TapiTransferAmountScreen) this.f296554b;
        CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
        CenteredAmountView field = (CenteredAmountView) obj3;
        TapiTransferAmountScreen.Companion aVar = TapiTransferAmountScreen.INSTANCE;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(field, "field");
        MaskedTextInputEditText editText = field.getEditText();
        Object obj4 = data.f51981p;
        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.transfer.core.api.mapper.TransferAmountInputPayload");
        return new zp0.d(editText, ((yof.b) obj4).f315672a, (u80.d) tapiTransferAmountScreen.Q.getValue(), null, null, false, false, 0, false, null, 1944);
    }

    private final Object n(Object obj2, Object obj3) {
        com.revolut.feature.credit.card.impl.ui.instalment.repay.custom_amount.a aVar = (com.revolut.feature.credit.card.impl.ui.instalment.repay.custom_amount.a) this.f296554b;
        CreditCardRepayCustomAmountFlowContract$InputData creditCardRepayCustomAmountFlowContract$InputData = aVar.o;
        yki.l FlowCoordinator = (yki.l) obj2;
        CreditCardRepayCustomAmountFlowContract$Step step = (CreditCardRepayCustomAmountFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CreditCardRepayCustomAmountFlowContract$Step.ChooseAmount) {
            CreditCardInstalmentRepayChooseAmountScreen creditCardInstalmentRepayChooseAmountScreen = new CreditCardInstalmentRepayChooseAmountScreen(new CreditCardInstalmentRepayChooseAmountScreenContract$InputData(creditCardRepayCustomAmountFlowContract$InputData.f69471a, creditCardRepayCustomAmountFlowContract$InputData.f69472b, creditCardRepayCustomAmountFlowContract$InputData.f69473c));
            wp5.v block = new wp5.v(aVar, FlowCoordinator, 14);
            Intrinsics.checkNotNullParameter(block, "block");
            creditCardInstalmentRepayChooseAmountScreen.H = block;
            return creditCardInstalmentRepayChooseAmountScreen;
        }
        if (!(step instanceof CreditCardRepayCustomAmountFlowContract$Step.PaymentDetails)) {
            throw new NoWhenBranchMatchedException();
        }
        CreditCardRepayCustomAmountFlowContract$Step.PaymentDetails paymentDetails = (CreditCardRepayCustomAmountFlowContract$Step.PaymentDetails) step;
        CreditCardRepayDetailsControllerScreen creditCardRepayDetailsControllerScreen = new CreditCardRepayDetailsControllerScreen(new CreditCardRepayDetailsControllerScreenContract$InputData(creditCardRepayCustomAmountFlowContract$InputData.f69471a, creditCardRepayCustomAmountFlowContract$InputData.f69472b, new CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails.CustomAmount(paymentDetails.f69475a, paymentDetails.f69476b), creditCardRepayCustomAmountFlowContract$InputData.f69473c));
        wpj.b block2 = new wpj.b(aVar, 6);
        Intrinsics.checkNotNullParameter(block2, "block");
        creditCardRepayDetailsControllerScreen.H = block2;
        return creditCardRepayDetailsControllerScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v138, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v77, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        l lVar;
        int i;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Object dVar;
        int i2;
        TextLocalisedClause textLocalisedClause3;
        dz3.c cVar;
        long jLongValue;
        int i3 = this.f296553a;
        int i5 = 6;
        final int i6 = 2;
        final int i21 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        String str = null;
        final int i22 = 1;
        Object obj4 = this.f296554b;
        switch (i3) {
            case 0:
                final com.revolut.feature.support.impl.transfer_tracker.ui.a aVar = (com.revolut.feature.support.impl.transfer_tracker.ui.a) obj4;
                final yki.l FlowCoordinator = (yki.l) obj2;
                InboundTransferTrackerFlowContract$Step step = (InboundTransferTrackerFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, InboundTransferTrackerFlowContract$Step.InputForm.f89393a)) {
                    TransferTrackerInputFormScreen transferTrackerInputFormScreen = new TransferTrackerInputFormScreen();
                    final Object[] objArr9 = objArr7 == true ? 1 : 0;
                    Function1 block = new Function1() { // from class: wde.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (objArr9) {
                                case 0:
                                    n outputData = (n) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z = outputData instanceof hee.k;
                                    com.revolut.feature.support.impl.transfer_tracker.ui.a aVar2 = aVar;
                                    yki.l lVar2 = FlowCoordinator;
                                    if (z) {
                                        hee.k kVar = (hee.k) outputData;
                                        h.t2(aVar2, lVar2, new InboundTransferTrackerFlowContract$Step.EstimationResult(kVar.f151692a, kVar.f151693b), true, null, false, 12);
                                    } else if (outputData instanceof m) {
                                        h.t2(aVar2, aVar2.f89400r, new InboundTransferTrackerFlowContract$Step.InboundTransactionList(((m) outputData).f151697a), true, null, false, 12);
                                    } else {
                                        if (!(outputData instanceof hee.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        hee.l lVar3 = (hee.l) outputData;
                                        h.t2(aVar2, lVar2, new InboundTransferTrackerFlowContract$Step.SwiftTransactionReferenceInput(lVar3.f151694a, lVar3.f151695b, lVar3.f151696c), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    o outputData2 = (o) obj5;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean zF = Intrinsics.f(outputData2, o.a.f113416a);
                                    yki.l lVar4 = FlowCoordinator;
                                    if (zF) {
                                        h.D2(lVar4);
                                    } else if (Intrinsics.f(outputData2, o.b.f113417a)) {
                                        h.w2(lVar4, InboundTransferTrackerFlowContract$Step.DelayedTransferLearnMore.f89386a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else {
                                        if (!(outputData2 instanceof dee.p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar.C1(new TransactionDetailsDestination(ofm.q.P(((dee.p) outputData2).f113418a), (rhf.d) null, 6));
                                    }
                                    return Unit.f186387a;
                                default:
                                    aee.k outputData3 = (aee.k) obj5;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    if (outputData3 instanceof k.a) {
                                        h.D2(FlowCoordinator);
                                    } else {
                                        if (!(outputData3 instanceof aee.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.support.impl.transfer_tracker.ui.a aVar3 = aVar;
                                        a aVar4 = aVar3.o;
                                        TransferArrivalRequest request = ((aee.l) outputData3).f3565a;
                                        aVar4.getClass();
                                        Intrinsics.checkNotNullParameter(request, "request");
                                        BackendFlowInput.Companion companion = BackendFlowInput.INSTANCE;
                                        dj0.d dVar2 = request.f89381a;
                                        aVar3.C1(new BackendFlowDestination(BackendFlowInput.Companion.a(companion, "0a747112-a3e6-43fe-98c8-afc5a4c87bae", r0.k(new Pair("amount", dVar2.f115083b.f306286a + dVar2.f115082a), new Pair("salary", String.valueOf(request.d)), new Pair("wire_transfer", String.valueOf(request.e)), new Pair("sentOn", request.f89383c.format(DateTimeFormatter.ISO_LOCAL_DATE)), new Pair("senderBankCountry", request.f89382b)), null, 4)));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    transferTrackerInputFormScreen.H = block;
                    return transferTrackerInputFormScreen;
                }
                if (step instanceof InboundTransferTrackerFlowContract$Step.SwiftTransactionReferenceInput) {
                    UniqueTransactionReferenceInputScreen uniqueTransactionReferenceInputScreen = new UniqueTransactionReferenceInputScreen();
                    vx9.v block2 = new vx9.v(aVar, 12, FlowCoordinator, step);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    uniqueTransactionReferenceInputScreen.H = block2;
                    return uniqueTransactionReferenceInputScreen;
                }
                if (step instanceof InboundTransferTrackerFlowContract$Step.InboundSwiftTransferStatus) {
                    InboundTransferTrackerFlowContract$Step.InboundSwiftTransferStatus inboundSwiftTransferStatus = (InboundTransferTrackerFlowContract$Step.InboundSwiftTransferStatus) step;
                    InboundSwiftTransferStatusScreen inboundSwiftTransferStatusScreen = new InboundSwiftTransferStatusScreen(new InboundSwiftTransferStatusScreenContract$InputData(inboundSwiftTransferStatus.f89389a, inboundSwiftTransferStatus.f89390b, inboundSwiftTransferStatus.f89391c));
                    Function1 block3 = new Function1() { // from class: wde.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i22) {
                                case 0:
                                    n outputData = (n) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z = outputData instanceof hee.k;
                                    com.revolut.feature.support.impl.transfer_tracker.ui.a aVar2 = aVar;
                                    yki.l lVar2 = FlowCoordinator;
                                    if (z) {
                                        hee.k kVar = (hee.k) outputData;
                                        h.t2(aVar2, lVar2, new InboundTransferTrackerFlowContract$Step.EstimationResult(kVar.f151692a, kVar.f151693b), true, null, false, 12);
                                    } else if (outputData instanceof m) {
                                        h.t2(aVar2, aVar2.f89400r, new InboundTransferTrackerFlowContract$Step.InboundTransactionList(((m) outputData).f151697a), true, null, false, 12);
                                    } else {
                                        if (!(outputData instanceof hee.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        hee.l lVar3 = (hee.l) outputData;
                                        h.t2(aVar2, lVar2, new InboundTransferTrackerFlowContract$Step.SwiftTransactionReferenceInput(lVar3.f151694a, lVar3.f151695b, lVar3.f151696c), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    o outputData2 = (o) obj5;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean zF = Intrinsics.f(outputData2, o.a.f113416a);
                                    yki.l lVar4 = FlowCoordinator;
                                    if (zF) {
                                        h.D2(lVar4);
                                    } else if (Intrinsics.f(outputData2, o.b.f113417a)) {
                                        h.w2(lVar4, InboundTransferTrackerFlowContract$Step.DelayedTransferLearnMore.f89386a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else {
                                        if (!(outputData2 instanceof dee.p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar.C1(new TransactionDetailsDestination(ofm.q.P(((dee.p) outputData2).f113418a), (rhf.d) null, 6));
                                    }
                                    return Unit.f186387a;
                                default:
                                    aee.k outputData3 = (aee.k) obj5;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    if (outputData3 instanceof k.a) {
                                        h.D2(FlowCoordinator);
                                    } else {
                                        if (!(outputData3 instanceof aee.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.support.impl.transfer_tracker.ui.a aVar3 = aVar;
                                        a aVar4 = aVar3.o;
                                        TransferArrivalRequest request = ((aee.l) outputData3).f3565a;
                                        aVar4.getClass();
                                        Intrinsics.checkNotNullParameter(request, "request");
                                        BackendFlowInput.Companion companion = BackendFlowInput.INSTANCE;
                                        dj0.d dVar2 = request.f89381a;
                                        aVar3.C1(new BackendFlowDestination(BackendFlowInput.Companion.a(companion, "0a747112-a3e6-43fe-98c8-afc5a4c87bae", r0.k(new Pair("amount", dVar2.f115083b.f306286a + dVar2.f115082a), new Pair("salary", String.valueOf(request.d)), new Pair("wire_transfer", String.valueOf(request.e)), new Pair("sentOn", request.f89383c.format(DateTimeFormatter.ISO_LOCAL_DATE)), new Pair("senderBankCountry", request.f89382b)), null, 4)));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block3, "block");
                    inboundSwiftTransferStatusScreen.H = block3;
                    return inboundSwiftTransferStatusScreen;
                }
                if (step instanceof InboundTransferTrackerFlowContract$Step.EstimationResult) {
                    InboundTransferTrackerFlowContract$Step.EstimationResult estimationResult = (InboundTransferTrackerFlowContract$Step.EstimationResult) step;
                    TransferTrackerEstimationResultScreen transferTrackerEstimationResultScreen = new TransferTrackerEstimationResultScreen(new TransferTrackerEstimationResultScreenContract$InputData(estimationResult.f89387a, estimationResult.f89388b));
                    Function1 block4 = new Function1() { // from class: wde.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    n outputData = (n) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z = outputData instanceof hee.k;
                                    com.revolut.feature.support.impl.transfer_tracker.ui.a aVar2 = aVar;
                                    yki.l lVar2 = FlowCoordinator;
                                    if (z) {
                                        hee.k kVar = (hee.k) outputData;
                                        h.t2(aVar2, lVar2, new InboundTransferTrackerFlowContract$Step.EstimationResult(kVar.f151692a, kVar.f151693b), true, null, false, 12);
                                    } else if (outputData instanceof m) {
                                        h.t2(aVar2, aVar2.f89400r, new InboundTransferTrackerFlowContract$Step.InboundTransactionList(((m) outputData).f151697a), true, null, false, 12);
                                    } else {
                                        if (!(outputData instanceof hee.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        hee.l lVar3 = (hee.l) outputData;
                                        h.t2(aVar2, lVar2, new InboundTransferTrackerFlowContract$Step.SwiftTransactionReferenceInput(lVar3.f151694a, lVar3.f151695b, lVar3.f151696c), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    o outputData2 = (o) obj5;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean zF = Intrinsics.f(outputData2, o.a.f113416a);
                                    yki.l lVar4 = FlowCoordinator;
                                    if (zF) {
                                        h.D2(lVar4);
                                    } else if (Intrinsics.f(outputData2, o.b.f113417a)) {
                                        h.w2(lVar4, InboundTransferTrackerFlowContract$Step.DelayedTransferLearnMore.f89386a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    } else {
                                        if (!(outputData2 instanceof dee.p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar.C1(new TransactionDetailsDestination(ofm.q.P(((dee.p) outputData2).f113418a), (rhf.d) null, 6));
                                    }
                                    return Unit.f186387a;
                                default:
                                    aee.k outputData3 = (aee.k) obj5;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    if (outputData3 instanceof k.a) {
                                        h.D2(FlowCoordinator);
                                    } else {
                                        if (!(outputData3 instanceof aee.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.support.impl.transfer_tracker.ui.a aVar3 = aVar;
                                        a aVar4 = aVar3.o;
                                        TransferArrivalRequest request = ((aee.l) outputData3).f3565a;
                                        aVar4.getClass();
                                        Intrinsics.checkNotNullParameter(request, "request");
                                        BackendFlowInput.Companion companion = BackendFlowInput.INSTANCE;
                                        dj0.d dVar2 = request.f89381a;
                                        aVar3.C1(new BackendFlowDestination(BackendFlowInput.Companion.a(companion, "0a747112-a3e6-43fe-98c8-afc5a4c87bae", r0.k(new Pair("amount", dVar2.f115083b.f306286a + dVar2.f115082a), new Pair("salary", String.valueOf(request.d)), new Pair("wire_transfer", String.valueOf(request.e)), new Pair("sentOn", request.f89383c.format(DateTimeFormatter.ISO_LOCAL_DATE)), new Pair("senderBankCountry", request.f89382b)), null, 4)));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block4, "block");
                    transferTrackerEstimationResultScreen.H = block4;
                    return transferTrackerEstimationResultScreen;
                }
                if (step instanceof InboundTransferTrackerFlowContract$Step.InboundTransactionList) {
                    InboundTransactionListScreen inboundTransactionListScreen = new InboundTransactionListScreen(new InboundTransactionListScreenContract$InputData(((InboundTransferTrackerFlowContract$Step.InboundTransactionList) step).f89392a));
                    wdb.b block5 = new wdb.b(aVar, i6);
                    Intrinsics.checkNotNullParameter(block5, "block");
                    inboundTransactionListScreen.H = block5;
                    return inboundTransactionListScreen;
                }
                if (Intrinsics.f(step, InboundTransferTrackerFlowContract$Step.TransactionReferenceInfo.f89397a)) {
                    lee.a aVar2 = aVar.f89398p;
                    k9 value = k9.OpenBanking;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    Intrinsics.checkNotNullParameter(value, "value");
                    AnalyticsProduct.Retail analyticsProduct = new AnalyticsProduct.Retail(value);
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                    return new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(com.revolut.feature.support.impl.R$string.locate_inbound_transfer_uetr_info_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.support.impl.R$string.locate_inbound_transfer_uetr_info_description, null, null, 14), null, null, false, 28), new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), analyticsProduct, null, null, 24));
                }
                if (!Intrinsics.f(step, InboundTransferTrackerFlowContract$Step.DelayedTransferLearnMore.f89386a)) {
                    throw new NoWhenBranchMatchedException();
                }
                dee.e eVar = aVar.f89399q;
                k9 value2 = k9.OpenBanking;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value2, "value");
                AnalyticsProduct.Retail analyticsProduct2 = new AnalyticsProduct.Retail(value2);
                eVar.getClass();
                Intrinsics.checkNotNullParameter(analyticsProduct2, "analyticsProduct");
                Object obj5 = null;
                RowDelegate.Model.c cVar2 = null;
                return new RowActionsBottomSheetController(new eii.c(new lw0.a(new TextLocalisedClause(com.revolut.feature.support.impl.R$string.locate_inbound_transfer_status_delayed_learn_more_title, null, null, 14), null, null, null, false, 30), new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), v.k(new l((Clause) new TextLocalisedClause(com.revolut.feature.support.impl.R$string.locate_inbound_transfer_status_delayed_learn_more_intermediary_processing_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.support.impl.R$string.locate_inbound_transfer_status_delayed_learn_more_intermediary_processing_description, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, i5), false, false, cVar2, obj5, 488), new l((Clause) new TextLocalisedClause(com.revolut.feature.support.impl.R$string.locate_inbound_transfer_status_delayed_learn_more_incorrect_details_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.support.impl.R$string.locate_inbound_transfer_status_delayed_learn_more_incorrect_details_description, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, i5), false, false, cVar2, obj5, 488), new l((Clause) new TextLocalisedClause(com.revolut.feature.support.impl.R$string.locate_inbound_transfer_status_delayed_learn_more_time_zones_and_cut_off_times_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.support.impl.R$string.locate_inbound_transfer_status_delayed_learn_more_time_zones_and_cut_off_times_description, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_globe, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, i5), false, false, cVar2, obj5, 488)), analyticsProduct2, null));
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                ((weg.p) obj4).getClass();
                return weg.p.a("ERROR_STATE_GENERAL_ITEM_ID");
            case 2:
                wf0.c cVar3 = (wf0.c) obj2;
                jg0.a response = (jg0.a) obj3;
                Intrinsics.checkNotNullParameter(cVar3, "<destruct>");
                Intrinsics.checkNotNullParameter(response, "response");
                String str2 = cVar3.f296870a;
                String str3 = cVar3.f296871b;
                ((wf0.f) obj4).f296881b.f(str2 + "_" + str3, response);
                return Unit.f186387a;
            case 3:
                com.revolut.feature.shared_separate_favourites.combined_watchlist.flow.a aVar3 = (com.revolut.feature.shared_separate_favourites.combined_watchlist.flow.a) obj4;
                CombinedWatchlistHomeFlowContract$Step step2 = (CombinedWatchlistHomeFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof CombinedWatchlistHomeFlowContract$Step.Home)) {
                    throw new NoWhenBranchMatchedException();
                }
                Set watchlistAssetTypeKeys = ((CombinedWatchlistHomeFlowContract$Step.Home) step2).f86800a;
                CombinedWatchlistHomeFlowContract$InputData combinedWatchlistHomeFlowContract$InputData = aVar3.o;
                CombinedWatchlistContext combinedWatchlistContext = combinedWatchlistHomeFlowContract$InputData.f86797a;
                String orderingKey = combinedWatchlistContext.f86889a;
                Set alertsAssetTypeKeys = combinedWatchlistContext.f86891c;
                Intrinsics.checkNotNullParameter(orderingKey, "orderingKey");
                Intrinsics.checkNotNullParameter(watchlistAssetTypeKeys, "watchlistAssetTypeKeys");
                Intrinsics.checkNotNullParameter(alertsAssetTypeKeys, "alertsAssetTypeKeys");
                WatchlistHomeScreen watchlistHomeScreen = new WatchlistHomeScreen(new WatchlistHomeScreenContract$InputData(new CombinedWatchlistContext(orderingKey, watchlistAssetTypeKeys, alertsAssetTypeKeys), combinedWatchlistHomeFlowContract$InputData.f86798b, combinedWatchlistHomeFlowContract$InputData.f86799c));
                wdb.b bVar = new wdb.b(aVar3, 11);
                Intrinsics.checkNotNullParameter(bVar, "<set-?>");
                watchlistHomeScreen.H = bVar;
                return watchlistHomeScreen;
            case 4:
                com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d dVar2 = (com.revolut.feature.wealth.private_equity.impl.ui.fund_details.d) obj4;
                wfh.b bVar2 = dVar2.A;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                FundDetailsScreenContract$ModalStep step3 = (FundDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof FundDetailsScreenContract$ModalStep.ShowHighRiskWarningInfo) {
                    return dVar2.e1(new j3h.b(((FundDetailsScreenContract$ModalStep.ShowHighRiskWarningInfo) step3).f95765a ? j3h.c.PRIVATE_BANK_FUND : j3h.c.RETAIL_FUND));
                }
                if (step3 instanceof FundDetailsScreenContract$ModalStep.ShowFundClassInfo) {
                    jel.w fundClass = ((FundDetailsScreenContract$ModalStep.ShowFundClassInfo) step3).f95764a;
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(fundClass, "fundClass");
                    int[] iArr = wfh.a.f297113a;
                    switch (iArr[fundClass.ordinal()]) {
                        case 1:
                            i = 14;
                            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_trade_private_markets_fund_class_multi_asset_info_title, null, null, 14);
                            break;
                        case 2:
                            i = 14;
                            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_trade_private_markets_fund_class_private_equity_info_title, null, null, 14);
                            break;
                        case 3:
                            i = 14;
                            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_trade_private_markets_fund_class_venture_capital, null, null, 14);
                            break;
                        case 4:
                            i = 14;
                            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_trade_private_markets_fund_class_private_credit_info_title, null, null, 14);
                            break;
                        case 5:
                            i = 14;
                            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_trade_private_markets_fund_class_infrastructure_info_title, null, null, 14);
                            break;
                        case 6:
                            i = 14;
                            textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_trade_private_markets_fund_class_real_estate_info_title, null, null, 14);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    switch (iArr[fundClass.ordinal()]) {
                        case 1:
                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_trade_private_markets_fund_class_multi_asset_info_description, null, null, i);
                            break;
                        case 2:
                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_trade_private_markets_fund_class_private_equity_info_description, null, null, i);
                            break;
                        case 3:
                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_trade_private_markets_fund_class_venture_capital_info_description, null, null, i);
                            break;
                        case 4:
                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_trade_private_markets_fund_class_private_credit_info_description, null, null, i);
                            break;
                        case 5:
                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_trade_private_markets_fund_class_infrastructure_info_description, null, null, i);
                            break;
                        case 6:
                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_trade_private_markets_fund_class_real_estate_info_description, null, null, i);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    lw0.a aVar4 = new lw0.a(textLocalisedClause, textLocalisedClause2, null, null, false, 28);
                    aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, i), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                    k9 k9Var = k9.Wealth;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar4, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                }
                if (step3 instanceof FundDetailsScreenContract$ModalStep.ShowHoldingInfo) {
                    FundDetailsScreenContract$ModalStep.ShowHoldingInfo showHoldingInfo = (FundDetailsScreenContract$ModalStep.ShowHoldingInfo) step3;
                    String name = showHoldingInfo.f95766a;
                    BigDecimal allocation = showHoldingInfo.f95767b;
                    Image logo = showHoldingInfo.f95768c;
                    String str4 = showHoldingInfo.d;
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(allocation, "allocation");
                    Intrinsics.checkNotNullParameter(logo, "logo");
                    lw0.a aVar5 = new lw0.a(yoj.b.m(new DotDividerClause(new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254)), v.k(new TextClause(name, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_top_holdings_info_title, u.c(new PercentageClause(e1.Z(allocation), (PercentageClause.Format) null, (Style) null, 6)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8))), str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_top_holdings_info_no_description, null, null, 14), new lw0.b(logo, null), null, false, 24);
                    aw0.e eVar3 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_dismiss, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                    k9 k9Var2 = k9.Wealth;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar5, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                }
                if (step3 instanceof FundDetailsScreenContract$ModalStep.ShowInvestmentDetails) {
                    return new FundInvestmentDetailsScreen(new FundInvestmentDetailsScreenContract$InputData(((FundDetailsScreenContract$ModalStep.ShowInvestmentDetails) step3).f95769a));
                }
                if (Intrinsics.f(step3, FundDetailsScreenContract$ModalStep.ShowBuyFrequencyInfo.f95763a)) {
                    bVar2.getClass();
                    lw0.a aVar6 = new lw0.a(new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_buy_frequency_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_buy_frequency_dialog_description, null, null, 14), null, null, false, 28);
                    aw0.e eVar4 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                    k9 k9Var3 = k9.Wealth;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar6, eVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                }
                if (Intrinsics.f(step3, FundDetailsScreenContract$ModalStep.ShowSellFrequencyInfo.f95770a)) {
                    bVar2.getClass();
                    lw0.a aVar7 = new lw0.a(new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_sell_frequency_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_sell_frequency_dialog_description, null, null, 14), null, null, false, 28);
                    aw0.e eVar5 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                    k9 k9Var4 = k9.Wealth;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar7, eVar5, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
                }
                if (!(step3 instanceof FundDetailsScreenContract$ModalStep.ShowSellTimelineInfo)) {
                    if (!(step3 instanceof FundDetailsScreenContract$ModalStep.ShowAllocationInfo)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2.getClass();
                    lw0.a aVar8 = new lw0.a(new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_allocation_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_allocation_dialog_description, null, null, 14), null, null, false, 28);
                    aw0.e eVar6 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                    k9 k9Var5 = k9.Wealth;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator7 = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar8, eVar6, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null, null, 24));
                }
                FundDetailsScreenContract$ModalStep.ShowSellTimelineInfo showSellTimelineInfo = (FundDetailsScreenContract$ModalStep.ShowSellTimelineInfo) step3;
                boolean z = showSellTimelineInfo.f95771a;
                boolean z3 = showSellTimelineInfo.f95772b;
                boolean z4 = showSellTimelineInfo.f95773c;
                BigDecimal bigDecimal = showSellTimelineInfo.d;
                bVar2.getClass();
                lw0.a aVar9 = new lw0.a(new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_sell_timeline_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_sell_timeline_dialog_description, null, null, 14), null, null, false, 28);
                l lVar2 = z ? new l((Clause) new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_sell_timeline_dialog_locked_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_sell_timeline_dialog_locked_description, null, null, 14), (RowDelegate.Model.MainImage) null, false, false, (RowDelegate.Model.c) null, (Object) null, 488) : null;
                if (z3) {
                    lVar = bigDecimal != null ? new l((Clause) new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_sell_timeline_dialog_soft_lockup_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_sell_timeline_dialog_soft_lockup_description, u.c(new PercentageClause(e1.Z(bigDecimal), (PercentageClause.Format) null, (Style) null, 6)), null, 12), (RowDelegate.Model.MainImage) null, false, false, (RowDelegate.Model.c) null, (Object) null, 488) : null;
                } else {
                    lVar = null;
                }
                l[] elements = {lVar2, lVar, z4 ? new l((Clause) new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_sell_timeline_dialog_no_fees_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_sell_timeline_dialog_no_fees_description, null, null, 14), (RowDelegate.Model.MainImage) null, false, false, (RowDelegate.Model.c) null, (Object) null, 488) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                aw0.e eVar7 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                k9 value3 = k9.Wealth;
                Parcelable.Creator<AnalyticsProduct.Retail> creator8 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value3, "value");
                return new RowActionsBottomSheetController(new eii.c(aVar9, eVar7, listL, new AnalyticsProduct.Retail(value3), null));
            case 5:
                com.revolut.retail.feature.esim.impl.ui.flows.help.a aVar10 = (com.revolut.retail.feature.esim.impl.ui.flows.help.a) obj4;
                EsimHelpFlowContract$Step step4 = (EsimHelpFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof EsimHelpFlowContract$Step.Help) {
                    if (((jte.d) aVar10.f100642p).c(EsimApi$Toggles.EsimHelpSectionRework.f100176c)) {
                        return new EsimHelpScreen(new xhj.f(aVar10.o.f100636a));
                    }
                    com.revolut.retail.feature.esim.impl.ui.screens.help_legacy.EsimHelpScreen esimHelpScreen = new com.revolut.retail.feature.esim.impl.ui.screens.help_legacy.EsimHelpScreen();
                    wdb.b block6 = new wdb.b(aVar10, 15);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    esimHelpScreen.H = block6;
                    return esimHelpScreen;
                }
                if (step4 instanceof EsimHelpFlowContract$Step.Terms) {
                    return new EsimTermsScreen();
                }
                if (step4 instanceof EsimHelpFlowContract$Step.ConnectivityTroubleshooting) {
                    return new EsimConnectivityTroubleshootingFlow(new EsimConnectivityTroubleshootingFlowContract$InputData(((EsimHelpFlowContract$Step.ConnectivityTroubleshooting) step4).f100637a));
                }
                if (!(step4 instanceof EsimHelpFlowContract$Step.Instructions)) {
                    throw new NoWhenBranchMatchedException();
                }
                EsimHelpFlowContract$Step.Instructions instructions = (EsimHelpFlowContract$Step.Instructions) step4;
                return aVar10.e1(new sd6.b(new EsimInstructionsControllerDescriptor$InputData(instructions.f100639a, instructions.f100640b)));
            case 6:
                com.revolut.feature.crypto.gift.asset.impl.ui.flow.a aVar11 = (com.revolut.feature.crypto.gift.asset.impl.ui.flow.a) obj4;
                CryptoGiftAssetFlowContract$Step step5 = (CryptoGiftAssetFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof CryptoGiftAssetFlowContract$Step.ClaimScreen) {
                    CryptoGiftAssetClaimScreen cryptoGiftAssetClaimScreen = new CryptoGiftAssetClaimScreen();
                    vsl.f block7 = new vsl.f(1, aVar11, com.revolut.feature.crypto.gift.asset.impl.ui.flow.a.class, "onClaimScreenResult", "onClaimScreenResult(Lcom/revolut/feature/crypto/gift/asset/impl/ui/screen/claim/CryptoGiftAssetClaimScreenContract$OutputData;)V", 0, 26);
                    Intrinsics.checkNotNullParameter(block7, "block");
                    cryptoGiftAssetClaimScreen.H = block7;
                    return cryptoGiftAssetClaimScreen;
                }
                if (!(step5 instanceof CryptoGiftAssetFlowContract$Step.NotEligibleScreen)) {
                    throw new NoWhenBranchMatchedException();
                }
                CryptoGiftAssetNotEligibleScreen cryptoGiftAssetNotEligibleScreen = new CryptoGiftAssetNotEligibleScreen();
                wdb.b block8 = new wdb.b(aVar11, 16);
                Intrinsics.checkNotNullParameter(block8, "block");
                cryptoGiftAssetNotEligibleScreen.H = block8;
                return cryptoGiftAssetNotEligibleScreen;
            case 7:
                FormScreen formScreen = (FormScreen) obj4;
                InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
                InputText field = (InputText) obj3;
                KProperty[] kPropertyArr = FormScreen.V;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj6 = model.P;
                if (obj6 instanceof TextField) {
                    String str5 = ((TextField) obj6).f;
                    if (str5 == null) {
                        return null;
                    }
                    dVar = new y(field.getInnerEditText(), null, str5, new defpackage.e1(formScreen, model, 10), model.f52580a, of9.h.a(model, str5), false, 66);
                } else {
                    if (!(obj6 instanceof MoneyField)) {
                        return null;
                    }
                    dVar = new zp0.d(field.getInnerEditText(), ((MoneyField) obj6).e, (u80.d) formScreen.Q.getValue(), null, new wg9.c(formScreen, model), false, true, 0, false, null, 1960);
                }
                return dVar;
            case 8:
                com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a aVar12 = (com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                FormScreenContract$ModalStep step6 = (FormScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (!(step6 instanceof FormScreenContract$ModalStep.Errors)) {
                    throw new NoWhenBranchMatchedException();
                }
                FormScreenContract$ModalStep.Errors errors = (FormScreenContract$ModalStep.Errors) step6;
                FormErrorsScreen formErrorsScreen = new FormErrorsScreen(new FormErrorsScreenContract$InputData(errors.f78719a, aVar12.J2(), errors.f78720b));
                wg9.o block9 = new wg9.o(aVar12, 3);
                Intrinsics.checkNotNullParameter(block9, "block");
                formErrorsScreen.H = block9;
                return formErrorsScreen;
            case 9:
                com.revolut.feature.retail.salary_account.impl.salary_promotion.b bVar3 = (com.revolut.feature.retail.salary_account.impl.salary_promotion.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SalaryPromotionControllerContract$ModalStep step7 = (SalaryPromotionControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!(step7 instanceof SalaryPromotionControllerContract$ModalStep.ProductArticle)) {
                    if (!Intrinsics.f(step7, SalaryPromotionControllerContract$ModalStep.InactivePrompt.f83018a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r rVar = Intrinsics.f(bVar3.f83026t.f83017b, "PARTNER") ? new r(Integer.valueOf(com.revolut.feature.retail.salary_account.impl.R$string.salaried_growth_work_email_verification_ended_prompt_title), Integer.valueOf(com.revolut.feature.retail.salary_account.impl.R$string.salaried_growth_work_email_verification_ended_prompt_subtitle), Integer.valueOf(com.revolut.feature.retail.salary_account.impl.R$string.salaried_growth_work_email_verification_ended_prompt_got_it)) : new r(Integer.valueOf(com.revolut.feature.retail.salary_account.impl.R$string.salary_promotion_ended_prompt_title), Integer.valueOf(com.revolut.feature.retail.salary_account.impl.R$string.salary_promotion_ended_prompt_subtitle), Integer.valueOf(com.revolut.feature.retail.salary_account.impl.R$string.salary_promotion_ended_prompt_got_it));
                    PromotionInactivePromptController promotionInactivePromptController = new PromotionInactivePromptController(new PromotionInactivePromptControllerContract$InputData(new TextLocalisedClause(((Number) rVar.f314201a).intValue(), null, null, 14), new TextLocalisedClause(((Number) rVar.f314202b).intValue(), null, null, 14), new TextLocalisedClause(((Number) rVar.f314203c).intValue(), null, null, 14)));
                    promotionInactivePromptController.l2(new wgb.n(bVar3, objArr8 == true ? 1 : 0));
                    return promotionInactivePromptController;
                }
                SalaryPromotionControllerContract$ModalStep.ProductArticle productArticle = (SalaryPromotionControllerContract$ModalStep.ProductArticle) step7;
                ViewController viewControllerE1 = bVar3.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Id(productArticle.f83019a), productArticle.f83020b), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                rch.o tillHide = new rch.o(2, bVar3, com.revolut.feature.retail.salary_account.impl.salary_promotion.b.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 23);
                wgb.n onDismiss = new wgb.n(bVar3, i22);
                wdb.b onResult = new wdb.b(bVar3, 18);
                Intrinsics.checkNotNullParameter(viewControllerE1, "<this>");
                Intrinsics.checkNotNullParameter(tillHide, "tillHide");
                Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
                Intrinsics.checkNotNullParameter(onResult, "onResult");
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                viewControllerE1.l2(new bib.b(tillHide, ref$ObjectRef, onResult, onDismiss, 0));
                i block10 = new i(ref$ObjectRef, i22);
                Intrinsics.checkNotNullParameter(block10, "block");
                viewControllerE1.H = block10;
                return viewControllerE1;
            case 10:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.d dVar3 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.d) obj4;
                wgk.c cVar4 = dVar3.o;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                FamilyPlanContactSelectionFlowContract$Step step8 = (FamilyPlanContactSelectionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (!(step8 instanceof FamilyPlanContactSelectionFlowContract$Step.SelectContact)) {
                    if (!(step8 instanceof FamilyPlanContactSelectionFlowContract$Step.ShowUpgradeToInvite)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FamilyPlanContactSelectionFlowContract$Step.ShowUpgradeToInvite showUpgradeToInvite = (FamilyPlanContactSelectionFlowContract$Step.ShowUpgradeToInvite) step8;
                    UpgradeToInviteFamilyMemberScreen upgradeToInviteFamilyMemberScreen = new UpgradeToInviteFamilyMemberScreen(new UpgradeToInviteFamilyMemberScreenContract$InputData(showUpgradeToInvite.f102998a, showUpgradeToInvite.f102999b, cVar4.f297332a));
                    wg2.g block11 = new wg2.g(dVar3, step8, 4);
                    Intrinsics.checkNotNullParameter(block11, "block");
                    upgradeToInviteFamilyMemberScreen.H = block11;
                    return upgradeToInviteFamilyMemberScreen;
                }
                hha.d dVar4 = ((FamilyPlanContactSelectionFlowContract$Step.SelectContact) step8).f102997a;
                ln3.b bVar4 = dVar3.f103002p;
                if (cVar4.f297332a) {
                    i2 = 14;
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_invite_member_title, null, null, 14);
                } else {
                    i2 = 14;
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_invite_member_contact_chooser_title, null, null, 14);
                }
                ContactsChooserInputData contactsChooserInputData = new ContactsChooserInputData((Clause) textLocalisedClause3, (Clause) new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_invite_member_search_hint, null, null, i2), v.k(ContactType.RevolutContact.Local.f66038a, new ContactType.RevolutContact.Remote(zhm.y0.b(zm3.k.INDIVIDUAL)), ContactType.UsernameContact.f66040a), (List) null, (ContactsChooserMode) ContactsChooserMode.SingleSelect.f66078a, false, false, false, false, (ContactsFilter) null, (ContactsChooserBannerContent) null, (ContactsChooserEmptyState) null, (AnalyticsProduct) null, (Clause) null, (Set) null, (ContactsPrimaryButtonClause) new ContactsPrimaryButtonClause.Plain(cVar4.f297332a ? new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_invite_member_action_invite, u.c(dok.g.d(dVar4, null)), null, 12) : new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.family_plans_invite_member_contact_chooser_title, null, null, 14)), (cn3.h) null, R$drawable.uikit_icn_24_cross, (Set) null, 720840);
                xgk.d dVar5 = dVar3.f103005s;
                bVar4.getClass();
                ContactsChooserScreen contactsChooserScreenB = ln3.b.b(contactsChooserInputData, dVar5);
                wg2.g block12 = new wg2.g(dVar3, LazyFlowCoordinator, 3);
                Intrinsics.checkNotNullParameter(block12, "block");
                contactsChooserScreenB.H = block12;
                return contactsChooserScreenB;
            case 11:
                com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.a aVar13 = (com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.a) obj4;
                cli.y yVar = aVar13.f68361q;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SepaDirectDebitRepaymentMethodContract$ModalStep step9 = (SepaDirectDebitRepaymentMethodContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!(step9 instanceof SepaDirectDebitRepaymentMethodContract$ModalStep.SelectAccount)) {
                    throw new NoWhenBranchMatchedException();
                }
                w0 w0Var = aVar13.o.f68358c;
                wh4.a aVar14 = (wh4.a) ((wh4.c) ((j2) yVar.f22677a).getValue()).f297396a.getContent();
                x35.e eVar8 = aVar14 != null ? aVar14.f297395b : null;
                wh4.a aVar15 = (wh4.a) ((wh4.c) ((j2) yVar.f22677a).getValue()).f297396a.getContent();
                if (aVar15 != null && (cVar = aVar15.f297394a) != null) {
                    str = cVar.f121234h.f306286a;
                }
                ViewController viewControllerE12 = aVar13.e1(new v35.a(new AccountSelectorV2$InputData(eVar8, d0.i1(v.l(str)), null, null, null, new AnalyticsContext(w0Var), 116)));
                wdb.b block13 = new wdb.b(aVar13, 22);
                Intrinsics.checkNotNullParameter(block13, "block");
                viewControllerE12.H = block13;
                return viewControllerE12;
            case 12:
                return a(obj2, obj3);
            case 13:
                BrPaymentLimitsUpdateScreen brPaymentLimitsUpdateScreen = (BrPaymentLimitsUpdateScreen) obj4;
                CenteredAmountView field2 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr2 = BrPaymentLimitsUpdateScreen.U;
                Intrinsics.checkNotNullParameter((CenteredAmountDelegate.Model) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(field2, "field");
                return new zp0.d(field2.getEditText(), brPaymentLimitsUpdateScreen.S, (u80.d) brPaymentLimitsUpdateScreen.R.getValue(), null, new t1j.b(brPaymentLimitsUpdateScreen, 17), false, false, 0, false, null, 1928);
            case 14:
                com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b bVar5 = (com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b) obj4;
                l80.e dateProvider = bVar5.f75084r;
                cli.y yVar2 = bVar5.f75086t;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CFACInsuranceExpenseDetailsScreenContract$ModalStep step10 = (CFACInsuranceExpenseDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!(step10 instanceof CFACInsuranceExpenseDetailsScreenContract$ModalStep.BottomSheet)) {
                    throw new NoWhenBranchMatchedException();
                }
                CFACInsuranceExpenseDetailsScreenContract$ModalStep.BottomSheet bottomSheet = (CFACInsuranceExpenseDetailsScreenContract$ModalStep.BottomSheet) step10;
                nj7.a aVar16 = bottomSheet.f75079a;
                int i32 = wj7.q.f297992a[aVar16.ordinal()];
                if (i32 == 1) {
                    wj7.i iVar = (wj7.i) ((j2) yVar2.f22677a).getValue();
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                    Long l2 = iVar.d;
                    jLongValue = l2 != null ? l2.longValue() : ((l80.f) dateProvider).b().toEpochMilli();
                } else if (i32 != 2) {
                    jLongValue = ((l80.f) dateProvider).b().toEpochMilli();
                } else {
                    wj7.i iVar2 = (wj7.i) ((j2) yVar2.f22677a).getValue();
                    iVar2.getClass();
                    Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                    Long l3 = iVar2.e;
                    jLongValue = l3 != null ? l3.longValue() : ((l80.f) dateProvider).b().toEpochMilli();
                }
                CFACInsuranceBottomSheetScreen cFACInsuranceBottomSheetScreen = new CFACInsuranceBottomSheetScreen(new CFACInsuranceBottomSheetScreenContract$InputData(jLongValue, aVar16, bVar5.o.f75075b, ((wj7.i) ((j2) yVar2.f22677a).getValue()).f297980c, ((wj7.i) ((j2) yVar2.f22677a).getValue()).f, bottomSheet.f75080b));
                vsl.f block14 = new vsl.f(1, bVar5, com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b.class, "handleModalOutput", "handleModalOutput(Lcom/revolut/feature/insurance/impl/ui/cfac/claim/bottom_sheet/screen/CFACInsuranceBottomSheetScreenContract$OutputData;)V", 0, 27);
                Intrinsics.checkNotNullParameter(block14, "block");
                cFACInsuranceBottomSheetScreen.H = block14;
                return cFACInsuranceBottomSheetScreen;
            case 15:
                com.revolut.feature.tab.crypto.impl.ui.settings.a aVar17 = (com.revolut.feature.tab.crypto.impl.ui.settings.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CryptoSettingsScreenContract$ModalStep step11 = (CryptoSettingsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof CryptoSettingsScreenContract$ModalStep.FlexibleModalStep) {
                    ViewController viewControllerE13 = aVar17.e1(new aq6.f(new aq6.b(true)));
                    wje.j block15 = new wje.j(aVar17, i22);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    viewControllerE13.H = block15;
                    return viewControllerE13;
                }
                if (!(step11 instanceof CryptoSettingsScreenContract$ModalStep.FlexibleDisableModalStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                ActionsBottomSheetController actionsBottomSheetControllerA = aVar17.E.a();
                wje.j block16 = new wje.j(aVar17, i6);
                Intrinsics.checkNotNullParameter(block16, "block");
                actionsBottomSheetControllerA.H = block16;
                return actionsBottomSheetControllerA;
            case 16:
                return b(obj2, obj3);
            case 17:
                return c(obj2, obj3);
            case 18:
                return d(obj2, obj3);
            case 19:
                return e(obj2, obj3);
            case 20:
                return g(obj2, obj3);
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new e0(iii.c.b(null, null, 6, false), ((wp9.v) obj4).f);
            case 22:
                return h(obj2, obj3);
            case 23:
                return i(obj2, obj3);
            case 24:
                return j(obj2, obj3);
            case 25:
                return k(obj2, obj3);
            case 26:
                return l(obj2, obj3);
            case 27:
                return m(obj2, obj3);
            case 28:
                return n(obj2, obj3);
            default:
                final com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.a aVar18 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.a) obj4;
                AsftWidgetFlowContract$Step step12 = (AsftWidgetFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof AsftWidgetFlowContract$Step.PassAvailableSoonModal) {
                    AsftWidgetFlowContract$Step.PassAvailableSoonModal passAvailableSoonModal = (AsftWidgetFlowContract$Step.PassAvailableSoonModal) step12;
                    AsftManageBookingPayload asftManageBookingPayload = passAvailableSoonModal.f98798b;
                    AsftPassAvailableSoonScreen asftPassAvailableSoonScreen = new AsftPassAvailableSoonScreen(new AsftPassAvailableSoonScreenContract$InputData(passAvailableSoonModal.f98797a, asftManageBookingPayload.d));
                    wp5.v block17 = new wp5.v(aVar18, asftManageBookingPayload, 20);
                    Intrinsics.checkNotNullParameter(block17, "block");
                    asftPassAvailableSoonScreen.H = block17;
                    return asftPassAvailableSoonScreen;
                }
                if (step12 instanceof AsftWidgetFlowContract$Step.ManageBooking) {
                    AsftManageBookingScreen asftManageBookingScreen = new AsftManageBookingScreen(((AsftWidgetFlowContract$Step.ManageBooking) step12).f98796a);
                    Function1 block18 = new Function1() { // from class: wti.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i22) {
                                case 0:
                                    lui.g result = (lui.g) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z6 = result instanceof f;
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.a aVar19 = aVar18;
                                    if (z6) {
                                        aVar19.B2();
                                    } else {
                                        if (!(result instanceof e)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar19.l2(new wgb.v(aVar19, (e) result, null, 29), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                default:
                                    qui.e result2 = (qui.e) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    boolean z11 = result2 instanceof qui.c;
                                    com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.a aVar20 = aVar18;
                                    if (z11) {
                                        aVar20.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("36f20c89-a61c-4ee1-99b5-6c7b492297b9", 2))));
                                    } else if (result2 instanceof qui.d) {
                                        aVar20.C1(new ExternalDestination.Browser(((qui.d) result2).f249458a, null));
                                    } else {
                                        if (!(result2 instanceof qui.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        qui.b bVar6 = (qui.b) result2;
                                        h.u2(aVar20, aVar20.f98801r, new AsftWidgetFlowContract$Step.CancelBooking(new AsftCancelBookingScreenContract$InputData(bVar6.f249454a, bVar6.f249455b, bVar6.f249456c, bVar6.d)), TransitionAnimation.REPLACE.f98394a, 4);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    asftManageBookingScreen.H = block18;
                    return asftManageBookingScreen;
                }
                if (!(step12 instanceof AsftWidgetFlowContract$Step.CancelBooking)) {
                    throw new NoWhenBranchMatchedException();
                }
                AsftCancelBookingScreen asftCancelBookingScreen = new AsftCancelBookingScreen(((AsftWidgetFlowContract$Step.CancelBooking) step12).f98795a);
                Function1 block19 = new Function1() { // from class: wti.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (i21) {
                            case 0:
                                lui.g result = (lui.g) obj7;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean z6 = result instanceof f;
                                com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.a aVar19 = aVar18;
                                if (z6) {
                                    aVar19.B2();
                                } else {
                                    if (!(result instanceof e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar19.l2(new wgb.v(aVar19, (e) result, null, 29), new yi5.b(26));
                                }
                                return Unit.f186387a;
                            default:
                                qui.e result2 = (qui.e) obj7;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                boolean z11 = result2 instanceof qui.c;
                                com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.a aVar20 = aVar18;
                                if (z11) {
                                    aVar20.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("36f20c89-a61c-4ee1-99b5-6c7b492297b9", 2))));
                                } else if (result2 instanceof qui.d) {
                                    aVar20.C1(new ExternalDestination.Browser(((qui.d) result2).f249458a, null));
                                } else {
                                    if (!(result2 instanceof qui.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    qui.b bVar6 = (qui.b) result2;
                                    h.u2(aVar20, aVar20.f98801r, new AsftWidgetFlowContract$Step.CancelBooking(new AsftCancelBookingScreenContract$InputData(bVar6.f249454a, bVar6.f249455b, bVar6.f249456c, bVar6.d)), TransitionAnimation.REPLACE.f98394a, 4);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block19, "block");
                asftCancelBookingScreen.H = block19;
                return asftCancelBookingScreen;
        }
    }
}
