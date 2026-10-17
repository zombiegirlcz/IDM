package plb;

import aii.q;
import alc.n;
import android.os.Parcelable;
import android.text.method.DigitsKeyListener;
import aw0.k7;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.api.models.BiometricVerificationAcceptedDocument;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.BiometricVerificationManualDocumentSelectionScreenContract$ModalStep;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.bank_account_switching.impl.articles.BankAccountSwitchingArticle;
import com.revolut.feature.bank_account_switching.impl.ui.form.BankAccountSwitchingFormScreen;
import com.revolut.feature.bank_account_switching.impl.ui.form.BankAccountSwitchingFormScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.request_list.RequestListScreen;
import com.revolut.feature.bank_account_switching.impl.ui.request_list.RequestListScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.request_status.BankAccountSwitchingRequestStatusScreen;
import com.revolut.feature.bank_account_switching.impl.ui.request_status.BankAccountSwitchingRequestStatusScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.review.BankAccountSwitchingReviewScreen;
import com.revolut.feature.bank_account_switching.impl.ui.review.BankAccountSwitchingReviewScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.BankAccountSwitchingStartDateSelectionScreen;
import com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.BankAccountSwitchingStartDateSelectionScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.OverstapAccountSwitchingFlowContract$Step;
import com.revolut.feature.bank_account_switching.impl.ui.target_account_selection.BankAccountSwitchingTargetSelectionScreen;
import com.revolut.feature.bank_account_switching.impl.ui.target_account_selection.BankAccountSwitchingTargetSelectionScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cancel_invitation.AdditionalCardsCardholderCancelInvitationScreen;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cancel_invitation.AdditionalCardsCardholderCancelInvitationScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.additional_cards.management.AdditionalCardsManagementScreenContract$ModalStep;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.CreditCardChooseInstalmentsScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.CreditCardChooseInstalmentsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.CreditCardAnticipationConfirmationScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.CreditCardAnticipationConfirmationScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.flow.CreditCardInstalmentAnticipationFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.flow.CreditCardInstalmentAnticipationFlowContract$Step;
import com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.GroupTransactionsScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.GroupTransactionsScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_chat.members.GroupChatMembersScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.members.GroupChatMembersScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.GroupChatSettingsScreenContract$Step;
import com.revolut.feature.payments.groups.impl.ui_new.details_bill.GroupDetailsBillScreen;
import com.revolut.feature.payments.groups.impl.ui_new.details_bill.GroupDetailsBillScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.details_settlement.GroupDetailsSettlementScreen;
import com.revolut.feature.payments.groups.impl.ui_new.details_settlement.GroupDetailsSettlementScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.group_details_settings_name.GroupSettingsNameContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.group_details_settings_name.GroupSettingsNameScreen;
import com.revolut.feature.payments.groups.impl.ui_new.share_group_qr.GroupQrScreen;
import com.revolut.feature.payments.groups.impl.ui_new.share_group_qr.GroupQrScreenContract$InputData;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.push_to_card.api.model.AdditionalFieldOption;
import com.revolut.feature.push_to_card.api.model.TextFieldContent;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.AdditionalFieldsScreen;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.AdditionalFieldsScreenContract$ModalStep;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.model.AdditionalFieldInput;
import com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation.SavingsInterestRateExplanationContract$ModalStep;
import com.revolut.feature.retail.savings.impl.creation.presentation.info.tiered_limits.TieredLimitsInfoScreen;
import com.revolut.feature.retail.savings.impl.creation.presentation.info.tiered_limits.TieredLimitsInfoScreenContract$InputData;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlowContract$Step;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlowContract$Step$Modal$CustomizationMenu;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlowContract$Step$Modal$TabsOrderSettings;
import com.revolut.feature.rev10_main_screen.impl.ui.customization_menu.CustomizationMenuBottomSheetController;
import com.revolut.feature.robo.api.model.RiskMetrics;
import com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.BankListScreenContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueController;
import com.revolut.feature.tax_residency.impl.v2.models.CountryRule;
import com.revolut.feature.tax_residency.impl.v2.models.Exemption;
import com.revolut.feature.tax_residency.impl.v2.models.TinInputFormat;
import com.revolut.feature.tax_residency.impl.v2.models.UserSpecificRule;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$Step;
import com.revolut.feature.tax_residency.impl.v2.ui.exemption.TaxExemptionScreen;
import com.revolut.feature.tax_residency.impl.v2.ui.exemption.TaxExemptionScreenContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.tin_input.TinInputScreen;
import com.revolut.feature.tax_residency.impl.v2.ui.tin_input.TinInputScreenContract$InputData;
import com.revolut.feature.user.checklist.impl.ui.flow.ChecklistFlowContract$ChecklistFlowInputData;
import com.revolut.feature.user.checklist.impl.ui.flow.ChecklistFlowContract$Step;
import com.revolut.feature.user.checklist.impl.ui.screen.UserChecklistContract$InputData;
import com.revolut.feature.user.checklist.impl.ui.screen.UserChecklistController;
import com.revolut.feature.user_declarations.shared.flows.address_suggestion.flow.AddressSuggestionFlowContract$Step;
import com.revolut.feature.user_declarations.shared.flows.address_suggestion.screen.AddressSuggestionScreen;
import com.revolut.feature.user_declarations.shared.flows.address_suggestion.screen.AddressSuggestionScreenContract$InputData;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreen;
import com.revolut.feature.wealth.ui.impl.trades.HoldingTradeDetailsControllerContract$Step;
import com.revolut.feature.widgets.impl.ui.flow.carousel.WidgetCarouselFlowContract$InputData;
import com.revolut.feature.widgets.impl.ui.flow.carousel.WidgetCarouselFlowContract$Step;
import com.revolut.feature.widgets.impl.ui.screen.customisation.WidgetCarouselScreen;
import com.revolut.kompot.common.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.EsimCompleteNumberTransferBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_complete_number_transfer_bottom_sheet.EsimCompleteNumberTransferBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.contract_type_picker.EsimMobilePlanNumberTransferContractTypePickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.contract_type_picker.EsimMobilePlanNumberTransferContractTypePickerScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.phone_number_type_picker.EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.phone_number_type_picker.EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.EsimPickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.EsimPickerScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.EsimPickerScreenContract$NavBarConfig;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.EsimMobilePlanNumberTransferPortabilityDatePickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.portability_date_picker.EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.flow.WaitlistControllerFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.flow.WaitlistControllerFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.error.WaitlistErrorScreen;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.error.WaitlistErrorScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.WaitlistInvitationScreen;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.WaitlistInvitationScreenContract$InputData;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.user_declarations.api.navigation.AddressSuggestionControllerDescriptor$InputData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreenContract$ModalStep;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import dfl.e0;
import dfl.g0;
import dfl.h0;
import dfl.i0;
import dfl.k;
import dfl.m;
import eii.l;
import eq2.f;
import grl.k9;
import ip0.xc;
import ip0.zj;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kl7.j0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import nel.z;
import oki.h;
import pij.d1;
import pmb.i;
import pnh.j;
import ps9.b0;
import ps9.p;
import ps9.s;
import ps9.t;
import s7a.a0;
import s7a.c0;
import s7a.x;
import to2.g;
import vkm.j2;
import yhm.m;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;
import zo2.e;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f237320b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f237319a = i;
        this.f237320b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar = (com.revolut.feature.payments.groups.impl.ui_chat.settings.d) this.f237320b;
        y yVar = dVar.C;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        GroupChatSettingsScreenContract$Step step = (GroupChatSettingsScreenContract$Step) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, GroupChatSettingsScreenContract$Step.ChangeGroupName.f79378a)) {
            GroupSettingsNameScreen groupSettingsNameScreen = new GroupSettingsNameScreen(new GroupSettingsNameContract$InputData(((p) ((j2) yVar.f22677a).getValue()).f239437a));
            t tVar = new t(dVar, 1);
            Intrinsics.checkNotNullParameter(tVar, "<set-?>");
            groupSettingsNameScreen.H = tVar;
            return groupSettingsNameScreen;
        }
        if (Intrinsics.f(step, GroupChatSettingsScreenContract$Step.ManageMembers.f79380a)) {
            GroupChatMembersScreen groupChatMembersScreen = new GroupChatMembersScreen(new GroupChatMembersScreenContract$InputData(((p) ((j2) yVar.f22677a).getValue()).f239437a));
            t tVar2 = new t(dVar, 2);
            Intrinsics.checkNotNullParameter(tVar2, "<set-?>");
            groupChatMembersScreen.H = tVar2;
            return groupChatMembersScreen;
        }
        if (Intrinsics.f(step, GroupChatSettingsScreenContract$Step.ChangeBackgroundDialog.f79377a)) {
            return dVar.f79392y.Z2(((p) ((j2) yVar.f22677a).getValue()).f239437a.f79285a);
        }
        if (step instanceof GroupChatSettingsScreenContract$Step.OpenQrCodeScreen) {
            return new GroupQrScreen(new GroupQrScreenContract$InputData(((p) ((j2) yVar.f22677a).getValue()).f239437a.f79287c, ((p) ((j2) yVar.f22677a).getValue()).f239437a.f79286b, ((GroupChatSettingsScreenContract$Step.OpenQrCodeScreen) step).f79381a));
        }
        if (step instanceof GroupChatSettingsScreenContract$Step.BillDetailsScreen) {
            return new GroupDetailsBillScreen(new GroupDetailsBillScreenContract$InputData.WithBill(((p) ((j2) yVar.f22677a).getValue()).f239437a, ((GroupChatSettingsScreenContract$Step.BillDetailsScreen) step).f79376a, dVar.I2().f248756a));
        }
        if (step instanceof GroupChatSettingsScreenContract$Step.SettlementDetailsScreen) {
            return new GroupDetailsSettlementScreen(new GroupDetailsSettlementScreenContract$InputData(((GroupChatSettingsScreenContract$Step.SettlementDetailsScreen) step).f79382a, dVar.I2().f248756a));
        }
        if (step instanceof GroupChatSettingsScreenContract$Step.GroupTransactionsScreen) {
            return new GroupTransactionsScreen(new GroupTransactionsScreenContract$InputData(dVar.I2().f248756a, ((p) ((j2) yVar.f22677a).getValue()).f239437a));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object b(Object obj2, Object obj3) {
        p pVar = (p) this.f237320b;
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_offline_state_action, null, null, 14), false, null, null, false, 0, 0, 31684);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new s(u.c(model), b0.a(pVar));
    }

    private final Object c(Object obj2, Object obj3) {
        TextLocalisedClause textLocalisedClause;
        int i;
        final com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.a aVar = (com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.a) this.f237320b;
        y yVar = aVar.u;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        BiometricVerificationManualDocumentSelectionScreenContract$ModalStep step = (BiometricVerificationManualDocumentSelectionScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof BiometricVerificationManualDocumentSelectionScreenContract$ModalStep.DocumentSelection)) {
            if (!(step instanceof BiometricVerificationManualDocumentSelectionScreenContract$ModalStep.CountrySelection)) {
                throw new NoWhenBranchMatchedException();
            }
            x xVar = new x(new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_manual_document_selection_country_selection_title, null, null, 14), null, null, null, false, null, new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_manual_document_selection_country_selection_subtitle, null, null, 14), null, null, false, null, ((pt.f) ((j2) yVar.f22677a).getValue()).f239555a.f297794a, null, null, false, AnalyticsProduct.Shared.Vision.f, ((pt.f) ((j2) yVar.f22677a).getValue()).e, null, null, null, 2046688762);
            Object obj4 = aVar.f50607q.get();
            Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
            PickerController pickerController = new PickerController(xVar, (x7a.d) obj4);
            final int i2 = 1;
            Function1 block = new Function1() { // from class: pt.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    switch (i2) {
                        case 0:
                            eii.k output = (eii.k) obj5;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof eii.i) {
                                Object obj6 = ((eii.i) output).f126655a;
                                BiometricVerificationDocumentType biometricVerificationDocumentType = obj6 instanceof BiometricVerificationDocumentType ? (BiometricVerificationDocumentType) obj6 : null;
                                if (biometricVerificationDocumentType != null) {
                                    com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.a aVar2 = aVar;
                                    aVar2.H2(aVar2.u, new pj3.b(aVar2, biometricVerificationDocumentType, 25));
                                }
                            }
                            break;
                        default:
                            a0 output2 = (a0) obj5;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            c0 c0Var = output2.f260599a;
                            if (c0Var instanceof c8a.a) {
                                com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.a aVar3 = aVar;
                                aVar3.H2(aVar3.u, new pj3.b(c0Var, aVar3, 24));
                            }
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            pickerController.H = block;
            return pickerController;
        }
        rt.b bVar = aVar.f50606p;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        ArrayList acceptedDocuments = ((pt.f) j2Var.getValue()).f239557c;
        BiometricVerificationDocumentType currentDocument = ((pt.f) j2Var2.getValue()).f239556b;
        AnalyticsContext analyticsContext = ((pt.f) j2Var2.getValue()).e;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(acceptedDocuments, "acceptedDocuments");
        Intrinsics.checkNotNullParameter(currentDocument, "currentDocument");
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_manual_document_selection_document_dialog_title, null, null, 14), null, null, null, false, 30);
        ArrayList arrayList = new ArrayList(w.t(acceptedDocuments, 10));
        Iterator it8 = acceptedDocuments.iterator();
        while (it8.hasNext()) {
            arrayList.add(((BiometricVerificationAcceptedDocument) it8.next()).f50372a);
        }
        Set<BiometricVerificationDocumentType> setI1 = d0.i1(arrayList);
        ArrayList arrayList2 = new ArrayList(w.t(setI1, 10));
        for (BiometricVerificationDocumentType biometricVerificationDocumentType : setI1) {
            boolean z = biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.DrivingLicence;
            if (z) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_document_driving_license_name, null, null, 14);
            } else if (biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.IdentityCard) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_document_identity_card_name, null, null, 14);
            } else if (biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.Passport) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_document_passport_name, null, null, 14);
            } else if (biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.ResidencePermit) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_document_residence_permit_name, null, null, 14);
            } else if (biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.Visa) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_document_visa_name, null, null, 14);
            } else {
                if (!(biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.BirthCertificate)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_document_birth_certificate_name, null, null, 14);
            }
            TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            if (z) {
                i = R$drawable.uikit_icn_24_driving_licence;
            } else if (biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.IdentityCard) {
                i = R$drawable.uikit_icn_24_national_id;
            } else if (biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.Passport) {
                i = R$drawable.uikit_icn_24_passport;
            } else if (biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.ResidencePermit) {
                i = R$drawable.uikit_icn_24_residence_permit;
            } else if (biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.Visa) {
                i = R$drawable.uikit_icn_24_visa_document;
            } else {
                if (!(biometricVerificationDocumentType instanceof BiometricVerificationDocumentType.BirthCertificate)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_passport;
            }
            Clause clause = null;
            boolean z3 = true;
            arrayList2.add(new l(textLocalisedClause2, clause, new RowDelegate.Model.MainImage.Image40(companion.i(i, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 62), z3, Intrinsics.f(biometricVerificationDocumentType, currentDocument), (RowDelegate.Model.c) null, biometricVerificationDocumentType, 200));
        }
        RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar2, null, arrayList2, AnalyticsProduct.Shared.Vision.f, analyticsContext));
        final int i3 = 0;
        Function1 block2 = new Function1() { // from class: pt.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj5) {
                switch (i3) {
                    case 0:
                        eii.k output = (eii.k) obj5;
                        Intrinsics.checkNotNullParameter(output, "output");
                        if (output instanceof eii.i) {
                            Object obj6 = ((eii.i) output).f126655a;
                            BiometricVerificationDocumentType biometricVerificationDocumentType2 = obj6 instanceof BiometricVerificationDocumentType ? (BiometricVerificationDocumentType) obj6 : null;
                            if (biometricVerificationDocumentType2 != null) {
                                com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.a aVar22 = aVar;
                                aVar22.H2(aVar22.u, new pj3.b(aVar22, biometricVerificationDocumentType2, 25));
                            }
                        }
                        break;
                    default:
                        a0 output2 = (a0) obj5;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        c0 c0Var = output2.f260599a;
                        if (c0Var instanceof c8a.a) {
                            com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.a aVar3 = aVar;
                            aVar3.H2(aVar3.u, new pj3.b(c0Var, aVar3, 24));
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        rowActionsBottomSheetController.H = block2;
        return rowActionsBottomSheetController;
    }

    private final Object d(Object obj2, Object obj3) {
        com.revolut.feature.rev10_main_screen.impl.ui.a aVar = (com.revolut.feature.rev10_main_screen.impl.ui.a) this.f237320b;
        yki.l FlowCoordinator = (yki.l) obj2;
        MainContainerFlowContract$Step step = (MainContainerFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof MainContainerFlowContract$Step.Tab) {
            jtb.b bVar = aVar.f83438p;
            MainContainerFlowContract$Step.Tab tab2 = (MainContainerFlowContract$Step.Tab) step;
            MainScreenTab tab3 = tab2.f83436a;
            Parcelable parcelable = tab2.f83437b;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(tab3, "tab");
            return bVar.f178470a.a(tab3).c(parcelable);
        }
        if (Intrinsics.f(step, MainContainerFlowContract$Step$Modal$TabsOrderSettings.f83435a)) {
            return aVar.e1(o49.a.f222174a);
        }
        if (!Intrinsics.f(step, MainContainerFlowContract$Step$Modal$CustomizationMenu.f83434a)) {
            throw new NoWhenBranchMatchedException();
        }
        CustomizationMenuBottomSheetController customizationMenuBottomSheetController = new CustomizationMenuBottomSheetController();
        pp5.d block = new pp5.d(aVar, 29);
        Intrinsics.checkNotNullParameter(block, "block");
        customizationMenuBottomSheetController.H = block;
        return customizationMenuBottomSheetController;
    }

    /* JADX WARN: Type inference failed for: r0v146, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v163, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v192, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v198, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i;
        int i2;
        int i3;
        List listC0;
        Iterable iterable;
        TextFieldContent textFieldContent;
        String inputMask;
        DigitsKeyListener digitsKeyListener;
        String strA;
        int i5 = this.f237319a;
        int i6 = 22;
        Object obj4 = this.f237320b;
        switch (i5) {
            case 0:
                com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation.a aVar = (com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SavingsInterestRateExplanationContract$ModalStep step = (SavingsInterestRateExplanationContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, SavingsInterestRateExplanationContract$ModalStep.TieredLimits.f83222a)) {
                    return new TieredLimitsInfoScreen(new TieredLimitsInfoScreenContract$InputData(aVar.o.f83221a));
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                String templateId = (String) obj2;
                List data = (List) obj3;
                Intrinsics.checkNotNullParameter(templateId, "templateId");
                Intrinsics.checkNotNullParameter(data, "data");
                ((plc.b) obj4).f237323b.f("BENCHMARKS_" + templateId, data);
                return Unit.f186387a;
            case 2:
                String templateId2 = (String) obj2;
                RiskMetrics riskMetrics = (RiskMetrics) obj3;
                Intrinsics.checkNotNullParameter(templateId2, "templateId");
                Intrinsics.checkNotNullParameter(riskMetrics, "riskMetrics");
                ((ne0.d) ((frk.b) obj4).e).f(frk.b.a(templateId2), riskMetrics);
                return Unit.f186387a;
            case 3:
                String portfolioId = (String) obj2;
                n data2 = (n) obj3;
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(data2, "data");
                ((plc.f) obj4).f237334c.f(portfolioId, data2);
                return Unit.f186387a;
            case 4:
                final com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b) obj4;
                EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData = bVar.o;
                y yVar = bVar.f101355p;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep step2 = (EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep.ContractTypePicker) {
                    EsimMobilePlanNumberTransferContractTypePickerScreen esimMobilePlanNumberTransferContractTypePickerScreen = new EsimMobilePlanNumberTransferContractTypePickerScreen(new EsimMobilePlanNumberTransferContractTypePickerScreenContract$InputData(((plj.e) ((j2) yVar.f22677a).getValue()).f237417b, ((EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep.ContractTypePicker) step2).f101344a));
                    final int i21 = 2;
                    Function1 block = new Function1() { // from class: plj.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i21) {
                                case 0:
                                    klj.k result = (klj.k) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar2 = bVar;
                                    bVar2.H2(bVar2.f101355p, new elj.l(result, 1));
                                    break;
                                case 1:
                                    glj.e result2 = (glj.e) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar3 = bVar;
                                    bVar3.H2(bVar3.f101355p, new l(result2, 0));
                                    break;
                                case 2:
                                    tkj.e result3 = (tkj.e) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar4 = bVar;
                                    bVar4.H2(bVar4.f101355p, new d1(result3, 15));
                                    break;
                                default:
                                    ilj.e result4 = (ilj.e) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar5 = bVar;
                                    bVar5.H2(bVar5.f101355p, new m(result4, 0));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    esimMobilePlanNumberTransferContractTypePickerScreen.H = block;
                    return esimMobilePlanNumberTransferContractTypePickerScreen;
                }
                if (step2 instanceof EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep.ServiceProviderPicker) {
                    EsimPickerScreen esimPickerScreen = new EsimPickerScreen(new EsimPickerScreenContract$InputData(((EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep.ServiceProviderPicker) step2).f101350a, new EsimPickerScreenContract$NavBarConfig(new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plan_number_transfer_confirmation_service_provider_picker_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plan_number_transfer_confirmation_service_provider_picker_hint, null, null, 14)), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plan_number_transfer_confirmation_service_provider_picker_search_empty, null, null, 14)));
                    final int i22 = 3;
                    Function1 block2 = new Function1() { // from class: plj.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i22) {
                                case 0:
                                    klj.k result = (klj.k) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar2 = bVar;
                                    bVar2.H2(bVar2.f101355p, new elj.l(result, 1));
                                    break;
                                case 1:
                                    glj.e result2 = (glj.e) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar3 = bVar;
                                    bVar3.H2(bVar3.f101355p, new l(result2, 0));
                                    break;
                                case 2:
                                    tkj.e result3 = (tkj.e) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar4 = bVar;
                                    bVar4.H2(bVar4.f101355p, new d1(result3, 15));
                                    break;
                                default:
                                    ilj.e result4 = (ilj.e) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar5 = bVar;
                                    bVar5.H2(bVar5.f101355p, new m(result4, 0));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block2, "block");
                    esimPickerScreen.H = block2;
                    return esimPickerScreen;
                }
                if (step2 instanceof EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep.PortingPreferredSchedulePicker) {
                    EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep.PortingPreferredSchedulePicker portingPreferredSchedulePicker = (EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep.PortingPreferredSchedulePicker) step2;
                    EsimMobilePlanNumberTransferPortabilityDatePickerScreen esimMobilePlanNumberTransferPortabilityDatePickerScreen = new EsimMobilePlanNumberTransferPortabilityDatePickerScreen(new EsimMobilePlanNumberTransferPortabilityDatePickerScreenContract$InputData(portingPreferredSchedulePicker.f101348b, portingPreferredSchedulePicker.f101347a.d, ((plj.e) ((j2) yVar.f22677a).getValue()).d, ((plj.e) ((j2) yVar.f22677a).getValue()).f237418c, portingPreferredSchedulePicker.f101349c, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData.f));
                    final int i32 = 0;
                    Function1 block3 = new Function1() { // from class: plj.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i32) {
                                case 0:
                                    klj.k result = (klj.k) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar2 = bVar;
                                    bVar2.H2(bVar2.f101355p, new elj.l(result, 1));
                                    break;
                                case 1:
                                    glj.e result2 = (glj.e) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar3 = bVar;
                                    bVar3.H2(bVar3.f101355p, new l(result2, 0));
                                    break;
                                case 2:
                                    tkj.e result3 = (tkj.e) obj5;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar4 = bVar;
                                    bVar4.H2(bVar4.f101355p, new d1(result3, 15));
                                    break;
                                default:
                                    ilj.e result4 = (ilj.e) obj5;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar5 = bVar;
                                    bVar5.H2(bVar5.f101355p, new m(result4, 0));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block3, "block");
                    esimMobilePlanNumberTransferPortabilityDatePickerScreen.H = block3;
                    return esimMobilePlanNumberTransferPortabilityDatePickerScreen;
                }
                if (!(step2 instanceof EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep.PhoneNumberTypePicker)) {
                    if (!(step2 instanceof EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep.TrackPortabilityStatus)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep.TrackPortabilityStatus trackPortabilityStatus = (EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep.TrackPortabilityStatus) step2;
                    return new EsimCompleteNumberTransferBottomSheetScreen(new EsimCompleteNumberTransferBottomSheetScreenContract$InputData(trackPortabilityStatus.f101351a, trackPortabilityStatus.f101353c, trackPortabilityStatus.f101352b, null, null, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData.f, 24));
                }
                EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep.PhoneNumberTypePicker phoneNumberTypePicker = (EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$ModalStep.PhoneNumberTypePicker) step2;
                EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen esimMobilePlanNumberTransferPhoneNumberTypePickerScreen = new EsimMobilePlanNumberTransferPhoneNumberTypePickerScreen(new EsimMobilePlanNumberTransferPhoneNumberTypePickerScreenContract$InputData(phoneNumberTypePicker.f101345a, phoneNumberTypePicker.f101346b));
                final int i33 = 1;
                Function1 block4 = new Function1() { // from class: plj.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i33) {
                            case 0:
                                klj.k result = (klj.k) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar2 = bVar;
                                bVar2.H2(bVar2.f101355p, new elj.l(result, 1));
                                break;
                            case 1:
                                glj.e result2 = (glj.e) obj5;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar3 = bVar;
                                bVar3.H2(bVar3.f101355p, new l(result2, 0));
                                break;
                            case 2:
                                tkj.e result3 = (tkj.e) obj5;
                                Intrinsics.checkNotNullParameter(result3, "result");
                                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar4 = bVar;
                                bVar4.H2(bVar4.f101355p, new d1(result3, 15));
                                break;
                            default:
                                ilj.e result4 = (ilj.e) obj5;
                                Intrinsics.checkNotNullParameter(result4, "result");
                                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.b bVar5 = bVar;
                                bVar5.H2(bVar5.f101355p, new m(result4, 0));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block4, "block");
                esimMobilePlanNumberTransferPhoneNumberTypePickerScreen.H = block4;
                return esimMobilePlanNumberTransferPhoneNumberTypePickerScreen;
            case 5:
                Function1 errorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorItems, "errorItems");
                return new i(u.c(new xc("VIEW_PAGER_ITEM_ID_ERROR", (List) errorItems.invoke(new iii.d(14, null, false, false, null)), 0, null, null, 0, 0, 0, 1020)), f0.f322471a, new pmb.b(13), ((pmb.d) obj4).d);
            case 6:
                com.revolut.feature.user.checklist.impl.ui.flow.b bVar2 = (com.revolut.feature.user.checklist.impl.ui.flow.b) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                ChecklistFlowContract$Step step3 = (ChecklistFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!(step3 instanceof ChecklistFlowContract$Step.UserChecklistStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                ChecklistFlowContract$ChecklistFlowInputData checklistFlowContract$ChecklistFlowInputData = bVar2.o;
                UserChecklistController userChecklistController = new UserChecklistController(new UserChecklistContract$InputData(checklistFlowContract$ChecklistFlowInputData.f94602a, checklistFlowContract$ChecklistFlowInputData.f94603b, ((ChecklistFlowContract$Step.UserChecklistStep) step3).f94605a));
                userChecklistController.k2(new dld.c(bVar2, LazyFlowCoordinator, 8));
                return userChecklistController;
            case 7:
                com.revolut.feature.user_declarations.shared.flows.address_suggestion.flow.a aVar2 = (com.revolut.feature.user_declarations.shared.flows.address_suggestion.flow.a) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                AddressSuggestionFlowContract$Step step4 = (AddressSuggestionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof AddressSuggestionFlowContract$Step.AddressSuggestion)) {
                    throw new NoWhenBranchMatchedException();
                }
                AddressSuggestionControllerDescriptor$InputData addressSuggestionControllerDescriptor$InputData = aVar2.o;
                AddressSuggestionScreen addressSuggestionScreen = new AddressSuggestionScreen(new AddressSuggestionScreenContract$InputData(addressSuggestionControllerDescriptor$InputData.f105045b, addressSuggestionControllerDescriptor$InputData.f105046c, addressSuggestionControllerDescriptor$InputData.d, addressSuggestionControllerDescriptor$InputData.e, addressSuggestionControllerDescriptor$InputData.f, addressSuggestionControllerDescriptor$InputData.f105047g, addressSuggestionControllerDescriptor$InputData.f105048h ? rbl.a.BACK : rbl.a.NONE));
                d1 block5 = new d1(aVar2, i6);
                Intrinsics.checkNotNullParameter(block5, "block");
                addressSuggestionScreen.H = block5;
                return addressSuggestionScreen;
            case 8:
                com.revolut.feature.wealth.ui.impl.trades.b bVar3 = (com.revolut.feature.wealth.ui.impl.trades.b) obj4;
                rnh.e eVar = bVar3.z;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                HoldingTradeDetailsControllerContract$Step step5 = (HoldingTradeDetailsControllerContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (!(step5 instanceof HoldingTradeDetailsControllerContract$Step.SettlementDateDialog)) {
                    if (step5 instanceof HoldingTradeDetailsControllerContract$Step.TaxInfoDialog) {
                        nel.n nVar = ((HoldingTradeDetailsControllerContract$Step.TaxInfoDialog) step5).f96049a;
                        eVar.getClass();
                        if ((nVar != null ? nVar.f214597c : null) == z.BOND) {
                            i = com.revolut.retail.wealth.resources.R$string.wealth_trading_bond_coupon_tax_dialog_title;
                            i2 = com.revolut.retail.wealth.resources.R$string.wealth_trading_bond_coupon_tax_dialog_description;
                        } else {
                            i = com.revolut.retail.wealth.resources.R$string.wealth_stock_dividend_tax_title;
                            i2 = com.revolut.retail.wealth.resources.R$string.wealth_stock_dividend_tax_body;
                        }
                        lw0.a aVar3 = new lw0.a(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, null, null, 14), null, null, false, 28);
                        aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                        k9 k9Var = k9.Trading;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        return new ActionsBottomSheetController(new dii.a(aVar3, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                    }
                    if (!(step5 instanceof HoldingTradeDetailsControllerContract$Step.ExchangeBreakdownDialog)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    HoldingTradeDetailsControllerContract$Step.ExchangeBreakdownDialog exchangeBreakdownDialog = (HoldingTradeDetailsControllerContract$Step.ExchangeBreakdownDialog) step5;
                    dfl.a amount = exchangeBreakdownDialog.f96045a;
                    dfl.a exchangedValue = exchangeBreakdownDialog.f96046b;
                    BigDecimal rate = exchangeBreakdownDialog.f96047c;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    Intrinsics.checkNotNullParameter(exchangedValue, "exchangedValue");
                    Intrinsics.checkNotNullParameter(rate, "rate");
                    lw0.a aVar4 = new lw0.a(new TextLocalisedClause(com.revolut.feature.wealth.ui.impl.R$string.market_data_exchange_breakdown_title, null, null, 14), null, null, null, false, 30);
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trade_list_amount, null, null, 14);
                    dj0.d dVarA0 = oi0.d.a0(amount);
                    MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14);
                    o9 o9Var = o9.NON_SENSITIVE;
                    List listK = v.k(rnh.e.a("EXCHANGE_BREAKDOWN_AMOUNT_ROW_ID", textLocalisedClause, new MoneyClause(dVarA0, defaults, null, o9Var, 4), null), rnh.e.a("EXCHANGE_BREAKDOWN_RATE_ROW_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_exchangeRate_title, null, null, 14), com.revolut.core.ui_kit.models.b.f(amount.f114178b, exchangedValue.f114178b, rate, null, 24), new ResourceImage(R$drawable.uikit_icn_16_arrow_rates, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), rnh.e.a("EXCHANGE_BREAKDOWN_EXCHANGED_ROW_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trade_list_exchanged, null, null, 14), new MoneyClause(oi0.d.a0(exchangedValue), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4), null), rnh.e.a("EXCHANGE_BREAKDOWN_FEES_ROW_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.market_data_transaction_breakdown_fees, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trade_list_fee_no_fees, null, null, 14), null));
                    k9 k9Var2 = k9.Trading;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    return new RowActionsBottomSheetController(new eii.c(aVar4, null, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null));
                }
                hel.b tradingContext = ((HoldingTradeDetailsControllerContract$Step.SettlementDateDialog) step5).f96048a;
                i0 trade = bVar3.C;
                od0.i iVar = (od0.i) ((j) ((j2) bVar3.D.f22677a).getValue()).f237784b.getContent();
                TradingAccount tradingAccount = iVar != null ? (TradingAccount) iVar.f224257a : null;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(trade, "trade");
                Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trade_settlement_date_title, null, null, 14);
                if (trade instanceof m) {
                    i3 = com.revolut.retail.wealth.resources.R$string.wealth_trade_settlement_date_description_private_markets;
                } else {
                    if (!(trade instanceof dfl.g) && !(trade instanceof dfl.y) && !(trade instanceof dfl.b) && !(trade instanceof dfl.c) && !(trade instanceof dfl.d) && !(trade instanceof dfl.e) && !(trade instanceof dfl.h) && !(trade instanceof dfl.i) && !(trade instanceof dfl.j) && !(trade instanceof k) && !(trade instanceof dfl.l) && !(trade instanceof dfl.s) && !(trade instanceof dfl.t) && !(trade instanceof dfl.v) && !(trade instanceof dfl.w) && !(trade instanceof dfl.z) && !(trade instanceof dfl.b0) && !(trade instanceof dfl.c0) && !(trade instanceof e0) && !(trade instanceof dfl.f0) && !(trade instanceof g0) && !(trade instanceof h0) && !(trade instanceof dfl.d0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean z = (tradingAccount == null || (listC0 = tradingAccount.c0()) == null || !com.revolut.shared.feature.wealth.models.trading_accounts.b.d(listC0)) ? false : true;
                    hel.b bVar4 = hel.b.EEA;
                    i3 = (tradingContext == bVar4 && z) ? com.revolut.retail.wealth.resources.R$string.trading_cash_settlement_jisa_text_rseuab : tradingContext == bVar4 ? com.revolut.retail.wealth.resources.R$string.trading_cash_settlement_text_rseuab : z ? com.revolut.retail.wealth.resources.R$string.trading_cash_settlement_jisa_text_other : com.revolut.retail.wealth.resources.R$string.trading_cash_settlement_text_other;
                }
                lw0.a aVar5 = new lw0.a(textLocalisedClause2, new TextLocalisedClause(i3, null, null, 14), null, null, false, 28);
                aw0.e eVar3 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var3 = k9.Trading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar5, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
            case 9:
                com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.flow.a aVar6 = (com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.flow.a) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                WaitlistControllerFlowContract$Step step6 = (WaitlistControllerFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (!(step6 instanceof WaitlistControllerFlowContract$Step.Invitation)) {
                    if (!(step6 instanceof WaitlistControllerFlowContract$Step.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    WaitlistControllerFlowContract$Step.Error error = (WaitlistControllerFlowContract$Step.Error) step6;
                    return new WaitlistErrorScreen(new WaitlistErrorScreenContract$InputData(error.f103687a, error.f103688b));
                }
                WaitlistControllerFlowContract$InputData waitlistControllerFlowContract$InputData = aVar6.o;
                WaitlistInvitationScreen waitlistInvitationScreen = new WaitlistInvitationScreen(new WaitlistInvitationScreenContract$InputData(waitlistControllerFlowContract$InputData.f103684a, waitlistControllerFlowContract$InputData.f103685b, waitlistControllerFlowContract$InputData.f103686c));
                d1 block6 = new d1(aVar6, 28);
                Intrinsics.checkNotNullParameter(block6, "block");
                waitlistInvitationScreen.H = block6;
                return waitlistInvitationScreen;
            case 10:
                com.revolut.sso.impl.ui.phone.enter_phone.a aVar7 = (com.revolut.sso.impl.ui.phone.enter_phone.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EnterPhoneScreenContract$ModalStep step7 = (EnterPhoneScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!Intrinsics.f(step7, EnterPhoneScreenContract$ModalStep.PhoneNumberCountry.f106670a)) {
                    throw new NoWhenBranchMatchedException();
                }
                x xVar = new x(new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_login_input_country_title, null, null, 14), null, null, null, false, null, new TextLocalisedClause(com.revolut.feature.picker.R$string.picker_country_picker_search_hint, null, null, 14), null, null, false, null, null, null, null, true, mql.a.f208025a, null, null, null, null, 2105540094);
                Object obj5 = aVar7.f106675t.get();
                Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                PickerController pickerController = new PickerController(xVar, (x7a.d) obj5);
                d1 block7 = new d1(aVar7, 29);
                Intrinsics.checkNotNullParameter(block7, "block");
                pickerController.H = block7;
                return pickerController;
            case 11:
                final com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar5 = (com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b) obj4;
                mn2.a aVar8 = bVar5.f64042q;
                OverstapAccountSwitchingFlowContract$Step step8 = (OverstapAccountSwitchingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof OverstapAccountSwitchingFlowContract$Step.Entry) {
                    RequestListScreen requestListScreen = new RequestListScreen(new RequestListScreenContract$InputData(aVar8));
                    final int i43 = 3;
                    Function1 block8 = new Function1() { // from class: pp2.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i43) {
                                case 0:
                                    q it8 = (q) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar6 = bVar5;
                                    h.t2(bVar6, bVar6.f64043r, OverstapAccountSwitchingFlowContract$Step.Entry.f64031a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    return Unit.f186387a;
                                case 1:
                                    e outputData = (e) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar5.I2(outputData.f323861a);
                                    return Unit.f186387a;
                                case 2:
                                    f outputData2 = (f) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    wn2.a aVar9 = outputData2.f128228a;
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar7 = bVar5;
                                    h.t2(bVar7, bVar7.f64043r, new OverstapAccountSwitchingFlowContract$Step.SourceAccountForm(aVar9), !(r1.d() instanceof OverstapAccountSwitchingFlowContract$Step.ProductArticle), null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    to2.k outputData3 = (to2.k) obj6;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean z3 = outputData3 instanceof g;
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar8 = bVar5;
                                    if (z3) {
                                        bVar8.l2(new pe2.l(bVar8, null, 21), new yi5.b(26));
                                    } else if (outputData3 instanceof to2.h) {
                                        h.D2(bVar8.f64043r);
                                    } else if (outputData3 instanceof to2.i) {
                                        bVar8.l2(new com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.a(bVar8, null), new yi5.b(26));
                                    } else {
                                        if (!(outputData3 instanceof to2.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar8.I2(((to2.j) outputData3).f272503a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    yja.b outputData4 = (yja.b) obj6;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    int i59 = d.f238250a[outputData4.ordinal()];
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar9 = bVar5;
                                    if (i59 == 1) {
                                        h.D2(bVar9.f64043r);
                                    } else {
                                        if (i59 != 2 && i59 != 3 && i59 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar9.l2(new pe2.l(bVar9, null, 21), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    requestListScreen.H = block8;
                    return requestListScreen;
                }
                if (step8 instanceof OverstapAccountSwitchingFlowContract$Step.ProductArticle) {
                    ViewController viewControllerE1 = bVar5.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(BankAccountSwitchingArticle.OVERSTAP)), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60));
                    final int i59 = 4;
                    Function1 block9 = new Function1() { // from class: pp2.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i59) {
                                case 0:
                                    q it8 = (q) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar6 = bVar5;
                                    h.t2(bVar6, bVar6.f64043r, OverstapAccountSwitchingFlowContract$Step.Entry.f64031a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    return Unit.f186387a;
                                case 1:
                                    e outputData = (e) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar5.I2(outputData.f323861a);
                                    return Unit.f186387a;
                                case 2:
                                    f outputData2 = (f) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    wn2.a aVar9 = outputData2.f128228a;
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar7 = bVar5;
                                    h.t2(bVar7, bVar7.f64043r, new OverstapAccountSwitchingFlowContract$Step.SourceAccountForm(aVar9), !(r1.d() instanceof OverstapAccountSwitchingFlowContract$Step.ProductArticle), null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    to2.k outputData3 = (to2.k) obj6;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean z3 = outputData3 instanceof g;
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar8 = bVar5;
                                    if (z3) {
                                        bVar8.l2(new pe2.l(bVar8, null, 21), new yi5.b(26));
                                    } else if (outputData3 instanceof to2.h) {
                                        h.D2(bVar8.f64043r);
                                    } else if (outputData3 instanceof to2.i) {
                                        bVar8.l2(new com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.a(bVar8, null), new yi5.b(26));
                                    } else {
                                        if (!(outputData3 instanceof to2.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar8.I2(((to2.j) outputData3).f272503a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    yja.b outputData4 = (yja.b) obj6;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    int i592 = d.f238250a[outputData4.ordinal()];
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar9 = bVar5;
                                    if (i592 == 1) {
                                        h.D2(bVar9.f64043r);
                                    } else {
                                        if (i592 != 2 && i592 != 3 && i592 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar9.l2(new pe2.l(bVar9, null, 21), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block9, "block");
                    viewControllerE1.H = block9;
                    return viewControllerE1;
                }
                if (step8 instanceof OverstapAccountSwitchingFlowContract$Step.TargetAccountSelection) {
                    BankAccountSwitchingTargetSelectionScreen bankAccountSwitchingTargetSelectionScreen = new BankAccountSwitchingTargetSelectionScreen(new BankAccountSwitchingTargetSelectionScreenContract$InputData(((OverstapAccountSwitchingFlowContract$Step.TargetAccountSelection) step8).f64040a, aVar8, null));
                    final int i66 = 2;
                    Function1 block10 = new Function1() { // from class: pp2.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i66) {
                                case 0:
                                    q it8 = (q) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar6 = bVar5;
                                    h.t2(bVar6, bVar6.f64043r, OverstapAccountSwitchingFlowContract$Step.Entry.f64031a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    return Unit.f186387a;
                                case 1:
                                    e outputData = (e) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar5.I2(outputData.f323861a);
                                    return Unit.f186387a;
                                case 2:
                                    f outputData2 = (f) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    wn2.a aVar9 = outputData2.f128228a;
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar7 = bVar5;
                                    h.t2(bVar7, bVar7.f64043r, new OverstapAccountSwitchingFlowContract$Step.SourceAccountForm(aVar9), !(r1.d() instanceof OverstapAccountSwitchingFlowContract$Step.ProductArticle), null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    to2.k outputData3 = (to2.k) obj6;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean z3 = outputData3 instanceof g;
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar8 = bVar5;
                                    if (z3) {
                                        bVar8.l2(new pe2.l(bVar8, null, 21), new yi5.b(26));
                                    } else if (outputData3 instanceof to2.h) {
                                        h.D2(bVar8.f64043r);
                                    } else if (outputData3 instanceof to2.i) {
                                        bVar8.l2(new com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.a(bVar8, null), new yi5.b(26));
                                    } else {
                                        if (!(outputData3 instanceof to2.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar8.I2(((to2.j) outputData3).f272503a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    yja.b outputData4 = (yja.b) obj6;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    int i592 = d.f238250a[outputData4.ordinal()];
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar9 = bVar5;
                                    if (i592 == 1) {
                                        h.D2(bVar9.f64043r);
                                    } else {
                                        if (i592 != 2 && i592 != 3 && i592 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar9.l2(new pe2.l(bVar9, null, 21), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block10, "block");
                    bankAccountSwitchingTargetSelectionScreen.H = block10;
                    return bankAccountSwitchingTargetSelectionScreen;
                }
                if (step8 instanceof OverstapAccountSwitchingFlowContract$Step.SourceAccountForm) {
                    OverstapAccountSwitchingFlowContract$Step.SourceAccountForm sourceAccountForm = (OverstapAccountSwitchingFlowContract$Step.SourceAccountForm) step8;
                    BankAccountSwitchingFormScreen bankAccountSwitchingFormScreen = new BankAccountSwitchingFormScreen(new BankAccountSwitchingFormScreenContract$InputData(aVar8, null, sourceAccountForm.f64037a));
                    pj3.b block11 = new pj3.b(bVar5, sourceAccountForm, 10);
                    Intrinsics.checkNotNullParameter(block11, "block");
                    bankAccountSwitchingFormScreen.H = block11;
                    return bankAccountSwitchingFormScreen;
                }
                if (step8 instanceof OverstapAccountSwitchingFlowContract$Step.StartDateSelection) {
                    BankAccountSwitchingStartDateSelectionScreen bankAccountSwitchingStartDateSelectionScreen = new BankAccountSwitchingStartDateSelectionScreen(new BankAccountSwitchingStartDateSelectionScreenContract$InputData(aVar8, null));
                    pj3.b block12 = new pj3.b(bVar5, (OverstapAccountSwitchingFlowContract$Step.StartDateSelection) step8, 11);
                    Intrinsics.checkNotNullParameter(block12, "block");
                    bankAccountSwitchingStartDateSelectionScreen.H = block12;
                    return bankAccountSwitchingStartDateSelectionScreen;
                }
                if (step8 instanceof OverstapAccountSwitchingFlowContract$Step.Review) {
                    OverstapAccountSwitchingFlowContract$Step.Review review = (OverstapAccountSwitchingFlowContract$Step.Review) step8;
                    BankAccountSwitchingReviewScreen bankAccountSwitchingReviewScreen = new BankAccountSwitchingReviewScreen(new BankAccountSwitchingReviewScreenContract$InputData(bVar5.f64042q, review.f64035b, review.f64036c, review.f64034a, null, null));
                    final int i74 = 1;
                    Function1 block13 = new Function1() { // from class: pp2.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i74) {
                                case 0:
                                    q it8 = (q) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar6 = bVar5;
                                    h.t2(bVar6, bVar6.f64043r, OverstapAccountSwitchingFlowContract$Step.Entry.f64031a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    return Unit.f186387a;
                                case 1:
                                    e outputData = (e) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar5.I2(outputData.f323861a);
                                    return Unit.f186387a;
                                case 2:
                                    f outputData2 = (f) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    wn2.a aVar9 = outputData2.f128228a;
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar7 = bVar5;
                                    h.t2(bVar7, bVar7.f64043r, new OverstapAccountSwitchingFlowContract$Step.SourceAccountForm(aVar9), !(r1.d() instanceof OverstapAccountSwitchingFlowContract$Step.ProductArticle), null, false, 12);
                                    return Unit.f186387a;
                                case 3:
                                    to2.k outputData3 = (to2.k) obj6;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean z3 = outputData3 instanceof g;
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar8 = bVar5;
                                    if (z3) {
                                        bVar8.l2(new pe2.l(bVar8, null, 21), new yi5.b(26));
                                    } else if (outputData3 instanceof to2.h) {
                                        h.D2(bVar8.f64043r);
                                    } else if (outputData3 instanceof to2.i) {
                                        bVar8.l2(new com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.a(bVar8, null), new yi5.b(26));
                                    } else {
                                        if (!(outputData3 instanceof to2.j)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar8.I2(((to2.j) outputData3).f272503a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    yja.b outputData4 = (yja.b) obj6;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    int i592 = d.f238250a[outputData4.ordinal()];
                                    com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar9 = bVar5;
                                    if (i592 == 1) {
                                        h.D2(bVar9.f64043r);
                                    } else {
                                        if (i592 != 2 && i592 != 3 && i592 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar9.l2(new pe2.l(bVar9, null, 21), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    bankAccountSwitchingReviewScreen.H = block13;
                    return bankAccountSwitchingReviewScreen;
                }
                if (!(step8 instanceof OverstapAccountSwitchingFlowContract$Step.RequestStatus)) {
                    throw new NoWhenBranchMatchedException();
                }
                BankAccountSwitchingRequestStatusScreen bankAccountSwitchingRequestStatusScreen = new BankAccountSwitchingRequestStatusScreen(new BankAccountSwitchingRequestStatusScreenContract$InputData(((OverstapAccountSwitchingFlowContract$Step.RequestStatus) step8).f64033a));
                final int i92 = 0;
                Function1 block14 = new Function1() { // from class: pp2.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i92) {
                            case 0:
                                q it8 = (q) obj6;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar6 = bVar5;
                                h.t2(bVar6, bVar6.f64043r, OverstapAccountSwitchingFlowContract$Step.Entry.f64031a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                return Unit.f186387a;
                            case 1:
                                e outputData = (e) obj6;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                if (outputData == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar5.I2(outputData.f323861a);
                                return Unit.f186387a;
                            case 2:
                                f outputData2 = (f) obj6;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                wn2.a aVar9 = outputData2.f128228a;
                                com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar7 = bVar5;
                                h.t2(bVar7, bVar7.f64043r, new OverstapAccountSwitchingFlowContract$Step.SourceAccountForm(aVar9), !(r1.d() instanceof OverstapAccountSwitchingFlowContract$Step.ProductArticle), null, false, 12);
                                return Unit.f186387a;
                            case 3:
                                to2.k outputData3 = (to2.k) obj6;
                                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                boolean z3 = outputData3 instanceof g;
                                com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar8 = bVar5;
                                if (z3) {
                                    bVar8.l2(new pe2.l(bVar8, null, 21), new yi5.b(26));
                                } else if (outputData3 instanceof to2.h) {
                                    h.D2(bVar8.f64043r);
                                } else if (outputData3 instanceof to2.i) {
                                    bVar8.l2(new com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.a(bVar8, null), new yi5.b(26));
                                } else {
                                    if (!(outputData3 instanceof to2.j)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar8.I2(((to2.j) outputData3).f272503a);
                                }
                                return Unit.f186387a;
                            default:
                                yja.b outputData4 = (yja.b) obj6;
                                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                int i592 = d.f238250a[outputData4.ordinal()];
                                com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar9 = bVar5;
                                if (i592 == 1) {
                                    h.D2(bVar9.f64043r);
                                } else {
                                    if (i592 != 2 && i592 != 3 && i592 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar9.l2(new pe2.l(bVar9, null, 21), new yi5.b(26));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block14, "block");
                bankAccountSwitchingRequestStatusScreen.H = block14;
                return bankAccountSwitchingRequestStatusScreen;
            case 12:
                com.revolut.feature.credit.card.impl.ui.additional_cards.management.a aVar9 = (com.revolut.feature.credit.card.impl.ui.additional_cards.management.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AdditionalCardsManagementScreenContract$ModalStep step9 = (AdditionalCardsManagementScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!(step9 instanceof AdditionalCardsManagementScreenContract$ModalStep.CancelInvitation)) {
                    throw new NoWhenBranchMatchedException();
                }
                AdditionalCardsManagementScreenContract$ModalStep.CancelInvitation cancelInvitation = (AdditionalCardsManagementScreenContract$ModalStep.CancelInvitation) step9;
                return new AdditionalCardsCardholderCancelInvitationScreen(new AdditionalCardsCardholderCancelInvitationScreenContract$InputData(aVar9.f69035r.f69029a, cancelInvitation.f69030a, cancelInvitation.f69031b, cancelInvitation.f69032c));
            case 13:
                com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a aVar10 = (com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a) obj4;
                CountryRule countryRule = aVar10.f90236t;
                TaxResidencyDeclarationFlowContract$InputData taxResidencyDeclarationFlowContract$InputData = aVar10.o;
                TaxResidencyDeclarationFlowContract$Step step10 = (TaxResidencyDeclarationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof TaxResidencyDeclarationFlowContract$Step.TinInput) {
                    TaxResidencyDeclarationFlowContract$Step.TinInput tinInput = (TaxResidencyDeclarationFlowContract$Step.TinInput) step10;
                    wi0.b bVar6 = taxResidencyDeclarationFlowContract$InputData.f90216a;
                    String str = countryRule.e;
                    String str2 = countryRule.f;
                    String str3 = countryRule.f90157g;
                    String str4 = countryRule.f90158h;
                    TinInputFormat tinInputFormat = tinInput.d;
                    String str5 = tinInput.f90225c;
                    List list = countryRule.f90155b;
                    if (list == null) {
                        list = f0.f322471a;
                    }
                    TinInputScreen tinInputScreen = new TinInputScreen(new TinInputScreenContract$InputData(bVar6, str, str2, str3, str4, tinInputFormat, str5, list, tinInput.f90223a, tinInput.f90224b, countryRule.f90156c, taxResidencyDeclarationFlowContract$InputData.e, taxResidencyDeclarationFlowContract$InputData.f90220h));
                    pj3.b block15 = new pj3.b(aVar10, tinInput, 14);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    tinInputScreen.H = block15;
                    return tinInputScreen;
                }
                if (!(step10 instanceof TaxResidencyDeclarationFlowContract$Step.Exemption)) {
                    throw new NoWhenBranchMatchedException();
                }
                TaxResidencyDeclarationFlowContract$Step.Exemption exemption = (TaxResidencyDeclarationFlowContract$Step.Exemption) step10;
                UserSpecificRule userSpecificRule = aVar10.u;
                int i96 = ppe.h.f238598b[exemption.f90221a.ordinal()];
                if (i96 == 1) {
                    iterable = userSpecificRule.f90187b;
                    if (iterable == null) {
                        iterable = f0.f322471a;
                    }
                } else {
                    if (i96 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iterable = userSpecificRule.f90188c;
                    if (iterable == null) {
                        iterable = f0.f322471a;
                    }
                }
                wi0.b bVar7 = taxResidencyDeclarationFlowContract$InputData.f90216a;
                String str6 = countryRule.e;
                Iterable iterable2 = iterable;
                ArrayList arrayList = new ArrayList(w.t(iterable2, 10));
                Iterator it8 = iterable2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((Exemption) it8.next()).f90164a);
                }
                TaxExemptionScreen taxExemptionScreen = new TaxExemptionScreen(new TaxExemptionScreenContract$InputData(bVar7, str6, arrayList, exemption.f90221a, exemption.f90222b));
                pj3.b block16 = new pj3.b(iterable, aVar10, 13);
                Intrinsics.checkNotNullParameter(block16, "block");
                taxExemptionScreen.H = block16;
                return taxExemptionScreen;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return yp0.b.g(v.k(xl7.l.c(), pq7.q.b((j0) obj4)), new ListSubheaderDelegate.Model("DRIVING_SCORE_HISTORY_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.insurance_car.impl.R$string.car_insurance_smart_driving_score_history_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, R$attr.uikit_dp16, 0, 122);
            case 15:
                InputTextDelegate.Model input = (InputTextDelegate.Model) obj2;
                InputText field = (InputText) obj3;
                KProperty[] kPropertyArr = AdditionalFieldsScreen.Q;
                Intrinsics.checkNotNullParameter(input, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                tqa.b bVar8 = (tqa.b) ((tqa.a) ((jqa.a) ((AdditionalFieldsScreen) obj4).N.getValue()).d.get());
                bVar8.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj6 = input.P;
                AdditionalFieldInput.TextInput textInput = obj6 instanceof AdditionalFieldInput.TextInput ? (AdditionalFieldInput.TextInput) obj6 : null;
                if (textInput == null || (inputMask = (textFieldContent = textInput.f81563b).e) == null) {
                    return null;
                }
                if (textFieldContent.f81520b) {
                    tqa.c cVar = bVar8.f273541a;
                    Intrinsics.checkNotNullParameter(inputMask, "inputMask");
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        Regex regex = (Regex) cVar.f273544a.getValue();
                        m70.a.c(t0.f186434a);
                        String strReplace = regex.replace(inputMask, "");
                        strA = strReplace.length() != 0 ? d0.k0(kotlin.text.f0.W0("1234567890".concat(strReplace)), "", null, null, 0, null, 62) : "1234567890";
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        strA = o.a(th10);
                    }
                    digitsKeyListener = DigitsKeyListener.getInstance((String) (strA instanceof yhm.n ? "1234567890" : strA));
                    break;
                } else {
                    digitsKeyListener = null;
                }
                return new zp0.y(field.getInnerEditText(), u.c(zp0.m.a()), inputMask, bVar8.f273543c, input.f52580a, digitsKeyListener, false, 64);
            case 16:
                com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.a aVar11 = (com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AdditionalFieldsScreenContract$ModalStep step11 = (AdditionalFieldsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!(step11 instanceof AdditionalFieldsScreenContract$ModalStep.DropdownSelector)) {
                    throw new NoWhenBranchMatchedException();
                }
                era.i iVar2 = aVar11.o;
                AdditionalFieldInput.DropdownInput dropdownField = ((AdditionalFieldsScreenContract$ModalStep.DropdownSelector) step11).f81554b;
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(dropdownField, "dropdownField");
                lw0.a aVar12 = new lw0.a(new TextClause(dropdownField.f81560b.f81517b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 30);
                ArrayList<AdditionalFieldOption> arrayList2 = dropdownField.f81560b.f81518c;
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                for (AdditionalFieldOption additionalFieldOption : arrayList2) {
                    TextClause textClause = new TextClause(additionalFieldOption.f81508b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str7 = additionalFieldOption.f81507a;
                    AdditionalFieldOption additionalFieldOption2 = dropdownField.f81561c;
                    arrayList3.add(new l((Clause) textClause, (Clause) null, (RowDelegate.Model.MainImage) null, true, Intrinsics.f(str7, additionalFieldOption2 != null ? additionalFieldOption2.f81507a : null), (RowDelegate.Model.c) null, (Object) additionalFieldOption, 200));
                }
                k9 k9Var4 = k9.Payments;
                Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar12, null, arrayList3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null));
                pj3.b block17 = new pj3.b(aVar11, step11, 16);
                Intrinsics.checkNotNullParameter(block17, "block");
                rowActionsBottomSheetController.H = block17;
                return rowActionsBottomSheetController;
            case 17:
                pqc.a aVar13 = ((com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.a) obj4).f85281p;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                BankListScreenContract$ModalStep step12 = (BankListScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof BankListScreenContract$ModalStep.BankNotPresent) {
                    aVar13.getClass();
                    lw0.a aVar14 = new lw0.a(new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_bank_list_empty_help_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_bank_list_empty_help_description, null, null, 14), null, null, false, 28);
                    aw0.e eVar4 = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_bank_list_empty_help_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
                    k9 k9Var5 = k9.Retail;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar14, eVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null, null, 24));
                }
                if (!(step12 instanceof BankListScreenContract$ModalStep.Help)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar13.getClass();
                lw0.a aVar15 = new lw0.a(new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_bank_list_help_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_bank_list_help_description, null, null, 14), null, null, false, 28);
                aw0.e eVar5 = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(com.revolut.feature.salary_switch.impl.R$string.salary_switch_br_bank_list_help_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55);
                k9 k9Var6 = k9.Retail;
                Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar15, eVar5, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var6, "value", k9Var6), null, null, 24));
            case 18:
                AddMoneyScreen addMoneyScreen = (AddMoneyScreen) obj4;
                CenteredAmountDelegate.Model data3 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field2 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr2 = AddMoneyScreen.j0;
                Intrinsics.checkNotNullParameter(data3, "data");
                Intrinsics.checkNotNullParameter(field2, "field");
                MaskedTextInputEditText editText = field2.getEditText();
                Object obj7 = data3.f51981p;
                Intrinsics.i(obj7, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                return new zp0.d(editText, (xi0.b) obj7, (u80.d) addMoneyScreen.V.getValue(), null, new om4.d0(addMoneyScreen, 3), false, false, 0, false, null, 1928);
            case 19:
                AdjustAssetValueController adjustAssetValueController = (AdjustAssetValueController) obj4;
                CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field3 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr3 = AdjustAssetValueController.T;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field3, "field");
                Object obj8 = model.f51981p;
                xi0.b bVar9 = obj8 instanceof xi0.b ? (xi0.b) obj8 : null;
                if (bVar9 == null) {
                    return null;
                }
                return new zp0.d(field3.getEditText(), bVar9, (u80.d) adjustAssetValueController.N.getValue(), null, null, false, false, 0, false, null, 1944);
            case 20:
                prl.c params = (prl.c) obj2;
                InvestOrder order = (InvestOrder) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(order, "order");
                hx7.q.U((ne0.d) ((prl.e) obj4).e, params, order);
                return Unit.f186387a;
            case 21:
                InvestOrdersParams params2 = (InvestOrdersParams) obj2;
                List orders = (List) obj3;
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(orders, "orders");
                hx7.q.U(((prl.f) obj4).d, params2, orders);
                return Unit.f186387a;
            case 22:
                k4l.j domain = (k4l.j) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((prl.j) obj4).f239334b.f("MONTHLY_INVESTMENTS", domain);
                return Unit.f186387a;
            case 23:
                final com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.flow.a aVar16 = (com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.flow.a) obj4;
                CreditCardInstalmentAnticipationFlowContract$InputData creditCardInstalmentAnticipationFlowContract$InputData = aVar16.o;
                final yki.l FlowCoordinator3 = (yki.l) obj2;
                CreditCardInstalmentAnticipationFlowContract$Step step13 = (CreditCardInstalmentAnticipationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (step13 instanceof CreditCardInstalmentAnticipationFlowContract$Step.SelectQuote) {
                    CreditCardChooseInstalmentsScreen creditCardChooseInstalmentsScreen = new CreditCardChooseInstalmentsScreen(new CreditCardChooseInstalmentsScreenContract$InputData(creditCardInstalmentAnticipationFlowContract$InputData.f69449a, creditCardInstalmentAnticipationFlowContract$InputData.f69450b, creditCardInstalmentAnticipationFlowContract$InputData.f69451c));
                    final int i99 = 0;
                    Function1 block18 = new Function1() { // from class: ps4.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            switch (i99) {
                                case 0:
                                    ls4.i result = (ls4.i) obj9;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z3 = result instanceof ls4.g;
                                    yki.l lVar = FlowCoordinator3;
                                    if (z3) {
                                        h.D2(lVar);
                                    } else {
                                        if (!(result instanceof ls4.h)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        ls4.h hVar = (ls4.h) result;
                                        h.t2(aVar16, lVar, new CreditCardInstalmentAnticipationFlowContract$Step.Confirm(hVar.f199616a, hVar.f199617b, hVar.f199618c), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    ns4.h result2 = (ns4.h) obj9;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof ns4.f) {
                                        aVar16.B2();
                                    } else {
                                        if (!(result2 instanceof ns4.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.D2(FlowCoordinator3);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    creditCardChooseInstalmentsScreen.H = block18;
                    return creditCardChooseInstalmentsScreen;
                }
                if (!(step13 instanceof CreditCardInstalmentAnticipationFlowContract$Step.Confirm)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditCardInstalmentAnticipationFlowContract$Step.Confirm confirm = (CreditCardInstalmentAnticipationFlowContract$Step.Confirm) step13;
                CreditCardAnticipationConfirmationScreen creditCardAnticipationConfirmationScreen = new CreditCardAnticipationConfirmationScreen(new CreditCardAnticipationConfirmationScreenContract$InputData(creditCardInstalmentAnticipationFlowContract$InputData.f69449a, creditCardInstalmentAnticipationFlowContract$InputData.f69450b, confirm.f69452a, confirm.f69453b, confirm.f69454c, creditCardInstalmentAnticipationFlowContract$InputData.f69451c));
                final int i100 = 1;
                Function1 block19 = new Function1() { // from class: ps4.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        switch (i100) {
                            case 0:
                                ls4.i result = (ls4.i) obj9;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean z3 = result instanceof ls4.g;
                                yki.l lVar = FlowCoordinator3;
                                if (z3) {
                                    h.D2(lVar);
                                } else {
                                    if (!(result instanceof ls4.h)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    ls4.h hVar = (ls4.h) result;
                                    h.t2(aVar16, lVar, new CreditCardInstalmentAnticipationFlowContract$Step.Confirm(hVar.f199616a, hVar.f199617b, hVar.f199618c), true, null, false, 12);
                                }
                                return Unit.f186387a;
                            default:
                                ns4.h result2 = (ns4.h) obj9;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof ns4.f) {
                                    aVar16.B2();
                                } else {
                                    if (!(result2 instanceof ns4.g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.D2(FlowCoordinator3);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block19, "block");
                creditCardAnticipationConfirmationScreen.H = block19;
                return creditCardAnticipationConfirmationScreen;
            case 24:
                return a(obj2, obj3);
            case 25:
                return b(obj2, obj3);
            case 26:
                com.revolut.feature.widgets.impl.ui.flow.carousel.a aVar17 = (com.revolut.feature.widgets.impl.ui.flow.carousel.a) obj4;
                yki.l FlowCoordinator4 = (yki.l) obj2;
                WidgetCarouselFlowContract$Step it9 = (WidgetCarouselFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it9, "it");
                if (!(((WidgetCarouselFlowContract$Step) FlowCoordinator4.d()) instanceof WidgetCarouselFlowContract$Step.CarouselScreen)) {
                    throw new NoWhenBranchMatchedException();
                }
                WidgetCarouselFlowContract$InputData widgetCarouselFlowContract$InputData = aVar17.o;
                WidgetCarouselScreen widgetCarouselScreen = new WidgetCarouselScreen(widgetCarouselFlowContract$InputData.f96363b, widgetCarouselFlowContract$InputData.f96364c, widgetCarouselFlowContract$InputData.e, widgetCarouselFlowContract$InputData.d);
                pp5.d dVar = new pp5.d(aVar17, i6);
                Intrinsics.checkNotNullParameter(dVar, "<set-?>");
                widgetCarouselScreen.H = dVar;
                return widgetCarouselScreen;
            case 27:
                return c(obj2, obj3);
            case 28:
                return d(obj2, obj3);
            default:
                bti.d data4 = (bti.d) obj3;
                Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(data4, "data");
                ((pti.z) obj4).f239770b.f("KEY_BOOKING_SLOT", data4);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ g(Object obj2, Object obj3, int i) {
        this.f237319a = i;
        this.f237320b = obj3;
    }
}
