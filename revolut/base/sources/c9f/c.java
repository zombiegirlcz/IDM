package c9f;

import aii.q;
import android.os.Parcelable;
import android.text.method.DigitsKeyListener;
import aw0.n6;
import aw0.o9;
import c5a.m0;
import c64.l;
import c64.m;
import c64.n;
import c7e.i;
import ce4.o;
import ce4.r;
import ce9.d;
import ce9.p;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.flow.CardReaderOrderFlow;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.CardReaderConnectionFlow;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.CardReaderConnectionFlowContract$InputData;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.a;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow.CardReaderRootFlowContract$Step;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.card_reader_settings.CardReaderSettingsScreen;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.new_request.CardReaderNewRequestScreen;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.promo.CardReaderPromoScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.LitePosRootFlow;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.LitePosRootFlowContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.LitePosRootFlowContract$Step;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.GooglePayOtpLocationMismatchScreenContract$ModalStep;
import com.revolut.feature.backend_flow.domain.endpoint.BackendFlowApiEndpoints;
import com.revolut.feature.contacts.impl.ui.contact.flow.ContactFlowContract$Step;
import com.revolut.feature.contacts.impl.ui.contact.screen.details.ContactDetailsScreen;
import com.revolut.feature.contacts.impl.ui.contact.screen.details.ContactDetailsScreenContract$InputData;
import com.revolut.feature.contacts.impl.ui.profile_card.ContactProfileCardScreen;
import com.revolut.feature.contacts.impl.ui.profile_card.ContactProfileCardScreenContract$ContactProfileCardInputData;
import com.revolut.feature.credit.application.plugins.api.models.common.prompt.CreditPromptAnalyticsConfiguration;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentController;
import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentControllerContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentControllerContract$Document;
import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.form.FormFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.loading.EmptyLoadingItems;
import com.revolut.feature.credit.application.plugins.impl.ui.loading.LoadingItems;
import com.revolut.feature.credit.application.plugins.impl.ui.loading.LoadingScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.loading.LoadingScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$OfferUpdateContext;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.MortgageOfferFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.confirmation.ConfirmationBottomSheetContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.confirmation.ConfirmationBottomSheetController;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.single_selection.SingleSelectionBottomSheetContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.single_selection.SingleSelectionBottomSheetController;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.OfferFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.OfferFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.animated_intro.AnimatedIntroScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.animated_intro.AnimatedIntroScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.OfferContentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.topItem.OfferTopItemContentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.upsell.OfferUpsellScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.CalculatorScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.CalculatorScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.bigtile.BigTileOfferContentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.regular.RegularOfferContentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.top_item.TopItemOfferContentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.top_item.TopItemOfferContentScreenContract$OfferContentPayload;
import com.revolut.feature.external_accounts.api.MandateApi$Toggles$VrpSetupBottomSheet;
import com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo;
import com.revolut.feature.external_accounts.api.navigation.InstitutionData;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateSetupBottomSheetContract$InputData;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateSetupBottomSheetController;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreen;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreenContract$ModalStep;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsMode;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsScreen;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.EasyBankTransferFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.EasyBankTransferFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.link.instructions.InstructionsScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.branches.BranchesScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.branches.BranchesScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.institutions_list.InstitutionsListScreen;
import com.revolut.feature.pay_with_smile.impl.R$string;
import com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.CreatePasscodeFlow;
import com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.CreatePasscodeFlowContract$InputData;
import com.revolut.feature.pay_with_smile.impl.ui.settings.PayWithSmileSettingsScreenContract$ModalStep;
import com.revolut.feature.pix.impl.flow.copy_paste.PixCopyPasteContract$Step;
import com.revolut.feature.pix.impl.flow.copy_paste.screen.code_input.PixCopyPasteCodeInputScreen;
import com.revolut.feature.pix.impl.flow.qr.PixQrCodeFlow;
import com.revolut.feature.pockets.impl.details_v2.linked_account_details.LinkedAccountDetailsScreenContract$ModalStep;
import com.revolut.feature.retail.goals.impl.ui.GoalsController;
import com.revolut.feature.retail.goals.impl.ui.GoalsControllerContract$ModalStep;
import com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreen;
import com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData;
import com.revolut.feature.rev_points.impl.ui.terms_review.flow.RevPointsTermsReviewFlow;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.bottom_sheet.new_watchlist.NewWatchlistController;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.WatchlistsSelectorScreenContract$ModalStep;
import com.revolut.feature.shops.impl.ui.details.ShopsCampaignCheckoutScreenContract$ModalStep;
import com.revolut.feature.subscriptions.api.SubscriptionsApi$Toggles;
import com.revolut.feature.subscriptions.impl.edit_frequency.EditSubscriptionFrequencyController;
import com.revolut.feature.subscriptions.impl.edit_frequency.EditSubscriptionFrequencyControllerContract$InputData;
import com.revolut.feature.subscriptions.impl.flow.SubscriptionsFlowContract$Step;
import com.revolut.feature.subscriptions.impl.label.SubscriptionLabelScreen;
import com.revolut.feature.subscriptions.impl.list.CardSubscriptionListScreen;
import com.revolut.feature.subscriptions.impl.list.CardSubscriptionListScreenContract$InputData;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.SubscriptionDetailsController;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.SubscriptionDetailsControllerContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.home.search.TravelMilesAirlinesHomeSearchScreenContract$ModalStep;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fund_highlights.FundHighlightsScreenContract$ModalStep;
import com.revolut.feature_retail_user_declarations.email.verification_screen.EmailVerificationPromptContract$InputData;
import com.revolut.feature_retail_user_declarations.email.verification_screen.EmailVerificationPromptController;
import com.revolut.feature_retail_user_declarations.email.verification_screen.EmailVerificationUseCase;
import com.revolut.feature_retail_user_declarations.email_verification.EmailVerificationFlowContract$Step;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.time.date_picker.DatePickerBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.hide_student.HideStudentFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_hide_bottom_sheet.HideStudentBottomSheet;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.sso.impl.ui.card_pin.card_pin.enter_card_number.EnterCardNumberScreen;
import dx4.u1;
import ft3.j1;
import gc1.k;
import grl.k9;
import hs3.j0;
import ip0.v7;
import ip0.zj;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jel.a0;
import jte.d;
import kae.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lae.h;
import md6.s;
import ne0.j;
import o97.f0;
import o97.h0;
import rn6.f;
import tb1.a;
import vkm.j2;
import vn6.f;
import we6.r0;
import yki.l;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;
import zhm.y0;
import zp0.y;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22372b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f22371a = i;
        this.f22372b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        com.revolut.feature.contacts.impl.ui.contact.flow.a aVar = (com.revolut.feature.contacts.impl.ui.contact.flow.a) this.f22372b;
        l FlowCoordinator = (l) obj2;
        ContactFlowContract$Step it8 = (ContactFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (!(it8 instanceof ContactFlowContract$Step.Details)) {
            if (it8 instanceof ContactFlowContract$Step.ProfileCard) {
                return new ContactProfileCardScreen(new ContactProfileCardScreenContract$ContactProfileCardInputData(((ContactFlowContract$Step.ProfileCard) it8).f66001a, true));
            }
            throw new NoWhenBranchMatchedException();
        }
        ContactDetailsScreen contactDetailsScreen = new ContactDetailsScreen(new ContactDetailsScreenContract$InputData(((ContactFlowContract$Step.Details) it8).f66000a));
        baa.c block = new baa.c(aVar, FlowCoordinator, 5);
        Intrinsics.checkNotNullParameter(block, "block");
        contactDetailsScreen.H = block;
        return contactDetailsScreen;
    }

    private final Object b(Object obj2, Object obj3) {
        com.revolut.feature.pay_with_smile.impl.ui.settings.a aVar = (com.revolut.feature.pay_with_smile.impl.ui.settings.a) this.f22372b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        PayWithSmileSettingsScreenContract$ModalStep step = (PayWithSmileSettingsScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, PayWithSmileSettingsScreenContract$ModalStep.ChangePasscode.f78981a)) {
            return new CreatePasscodeFlow(new CreatePasscodeFlowContract$InputData(((nl9.g) zi0.c.I(((cm9.g) ((j2) aVar.f78986s.f22677a).getValue()).f25169a)).f217103b ? zl9.d.ChangePasscode : zl9.d.SetPasscode));
        }
        if (!Intrinsics.f(step, PayWithSmileSettingsScreenContract$ModalStep.ConfirmOptOut.f78982a)) {
            throw new NoWhenBranchMatchedException();
        }
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.revolut_pay_pay_with_smile_settings_opt_out_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_pay_with_smile_settings_opt_out_description, null, null, 14), null, null, false, 28);
        aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(R$string.revolut_pay_pay_with_smile_settings_opt_out_secondary_action, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(R$string.revolut_pay_pay_with_smile_settings_opt_out_primary_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), (Clause) null, (aw0.f) null, 25);
        k9 k9Var = k9.RevolutPay;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        ce9.a block = new ce9.a(aVar, 19);
        Intrinsics.checkNotNullParameter(block, "block");
        actionsBottomSheetController.H = block;
        return actionsBottomSheetController;
    }

    private final Object c(Object obj2, Object obj3) {
        cma.d dVar = (cma.d) this.f22372b;
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        dVar.getClass();
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_ITEM_LIST_ID", new TextLocalisedClause(R.string.error_generic, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), false, null, null, false, 0, 0, 31684);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new wla.f(u.c(model), wla.c.f298465a);
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v72, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ViewController creditPromptFlow;
        ViewController bigTileOfferContentScreen;
        PluginScreenController calculatorScreen;
        int i;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        ViewController actionsBottomSheetController;
        ViewController ibanScreen;
        int i2 = this.f22371a;
        h0 h0Var = h0.f223107a;
        Object obj4 = this.f22372b;
        switch (i2) {
            case 0:
                g params = (g) obj2;
                List instruments = (List) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                ((j) ((f) obj4).f22375b.get()).f("TRANSFER_INSTRUMENTS_LIST_" + params.f22378b + "_" + params.f22377a, instruments);
                return Unit.f186387a;
            case 1:
                String juniorRegId = (String) obj2;
                List value = (List) obj3;
                Intrinsics.checkNotNullParameter(juniorRegId, "juniorRegId");
                Intrinsics.checkNotNullParameter(value, "value");
                ((ca8.a) obj4).f22534b.f(ca8.a.a(juniorRegId), value);
                return Unit.f186387a;
            case 2:
                com.revolut.feature.pix.impl.flow.copy_paste.a aVar = (com.revolut.feature.pix.impl.flow.copy_paste.a) obj4;
                l FlowCoordinator = (l) obj2;
                PixCopyPasteContract$Step step = (PixCopyPasteContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof PixCopyPasteContract$Step.CodeInput)) {
                    if (step instanceof PixCopyPasteContract$Step.OpenQrScanner) {
                        return new PixQrCodeFlow();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                PixCopyPasteCodeInputScreen pixCopyPasteCodeInputScreen = new PixCopyPasteCodeInputScreen();
                i block = new i(aVar, FlowCoordinator, 5);
                Intrinsics.checkNotNullParameter(block, "block");
                pixCopyPasteCodeInputScreen.H = block;
                return pixCopyPasteCodeInputScreen;
            case 3:
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = GoalsController.U;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                MaskedTextInputEditText editText = field.getEditText();
                Object obj5 = data.f51981p;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                return new zp0.d(editText, (xi0.b) obj5, (u80.d) ((GoalsController) obj4).L.getValue(), null, null, false, false, 0, false, null, 1944);
            case 4:
                com.revolut.feature.retail.goals.impl.ui.a aVar2 = (com.revolut.feature.retail.goals.impl.ui.a) obj4;
                GoalsControllerContract$ModalStep step2 = (GoalsControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter((com.revolut.kompot.navigable.vc.modal.a) obj2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof GoalsControllerContract$ModalStep.CalendarPicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                GoalsControllerContract$ModalStep.CalendarPicker calendarPicker = (GoalsControllerContract$ModalStep.CalendarPicker) step2;
                DatePickerBottomSheetController datePickerBottomSheetController = new DatePickerBottomSheetController(new DatePickerBottomSheetController.InputData(new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_set_goal_date_picker_title, null, null, 14), calendarPicker.f82653b, calendarPicker.f82652a, (LocalDate) null, 24));
                cab.i block2 = new cab.i(aVar2, 1);
                Intrinsics.checkNotNullParameter(block2, "block");
                datePickerBottomSheetController.H = block2;
                return datePickerBottomSheetController;
            case 5:
                final com.revolut.feature.subscriptions.impl.flow.a aVar3 = (com.revolut.feature.subscriptions.impl.flow.a) obj4;
                SubscriptionsFlowContract$Step step3 = (SubscriptionsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof SubscriptionsFlowContract$Step.LabelSubscription) {
                    SubscriptionLabelScreen subscriptionLabelScreen = new SubscriptionLabelScreen(((SubscriptionsFlowContract$Step.LabelSubscription) step3).f89189a);
                    final int i3 = 0;
                    Function1 block3 = new Function1() { // from class: cae.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i3) {
                                case 0:
                                    f output = (f) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!Intrinsics.f(output, f.a.f182473a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.subscriptions.impl.flow.a aVar4 = aVar3;
                                    if (((d) aVar4.o).c(SubscriptionsApi$Toggles.SubscriptionDetailsKompotMigration.f89132c)) {
                                        aVar4.B2();
                                    } else {
                                        aVar4.C1(new BridgeDestination(new FinishCommand(-1, null, null, 6)));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    h it8 = (h) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    aVar3.C2(q.f5292a);
                                    return Unit.f186387a;
                                case 2:
                                    if (obj6 != null) {
                                        throw new ClassCastException();
                                    }
                                    Intrinsics.checkNotNullParameter(null, "it");
                                    aVar3.C2(q.f5292a);
                                    return Unit.f186387a;
                                default:
                                    c9e.a it9 = (c9e.a) obj6;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    aVar3.C2(q.f5292a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block3, "block");
                    subscriptionLabelScreen.H = block3;
                    return subscriptionLabelScreen;
                }
                if (step3 instanceof SubscriptionsFlowContract$Step.CardSubscriptionList) {
                    SubscriptionsFlowContract$Step.CardSubscriptionList cardSubscriptionList = (SubscriptionsFlowContract$Step.CardSubscriptionList) step3;
                    CardSubscriptionListScreen cardSubscriptionListScreen = new CardSubscriptionListScreen(new CardSubscriptionListScreenContract$InputData(cardSubscriptionList.f89186a, cardSubscriptionList.f89187b));
                    final int i5 = 1;
                    Function1 block4 = new Function1() { // from class: cae.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i5) {
                                case 0:
                                    f output = (f) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!Intrinsics.f(output, f.a.f182473a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.subscriptions.impl.flow.a aVar4 = aVar3;
                                    if (((d) aVar4.o).c(SubscriptionsApi$Toggles.SubscriptionDetailsKompotMigration.f89132c)) {
                                        aVar4.B2();
                                    } else {
                                        aVar4.C1(new BridgeDestination(new FinishCommand(-1, null, null, 6)));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    h it8 = (h) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    aVar3.C2(q.f5292a);
                                    return Unit.f186387a;
                                case 2:
                                    if (obj6 != null) {
                                        throw new ClassCastException();
                                    }
                                    Intrinsics.checkNotNullParameter(null, "it");
                                    aVar3.C2(q.f5292a);
                                    return Unit.f186387a;
                                default:
                                    c9e.a it9 = (c9e.a) obj6;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    aVar3.C2(q.f5292a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block4, "block");
                    cardSubscriptionListScreen.H = block4;
                    return cardSubscriptionListScreen;
                }
                if (step3 instanceof SubscriptionsFlowContract$Step.SubscriptionDetails) {
                    SubscriptionsFlowContract$Step.SubscriptionDetails subscriptionDetails = (SubscriptionsFlowContract$Step.SubscriptionDetails) step3;
                    SubscriptionDetailsController subscriptionDetailsController = new SubscriptionDetailsController(new SubscriptionDetailsControllerContract$InputData(subscriptionDetails.f89192c, subscriptionDetails.f89190a, subscriptionDetails.f89191b));
                    final int i6 = 2;
                    Function1 block5 = new Function1() { // from class: cae.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    f output = (f) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!Intrinsics.f(output, f.a.f182473a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.subscriptions.impl.flow.a aVar4 = aVar3;
                                    if (((d) aVar4.o).c(SubscriptionsApi$Toggles.SubscriptionDetailsKompotMigration.f89132c)) {
                                        aVar4.B2();
                                    } else {
                                        aVar4.C1(new BridgeDestination(new FinishCommand(-1, null, null, 6)));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    h it8 = (h) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    aVar3.C2(q.f5292a);
                                    return Unit.f186387a;
                                case 2:
                                    if (obj6 != null) {
                                        throw new ClassCastException();
                                    }
                                    Intrinsics.checkNotNullParameter(null, "it");
                                    aVar3.C2(q.f5292a);
                                    return Unit.f186387a;
                                default:
                                    c9e.a it9 = (c9e.a) obj6;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    aVar3.C2(q.f5292a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block5, "block");
                    subscriptionDetailsController.H = block5;
                    return subscriptionDetailsController;
                }
                if (!(step3 instanceof SubscriptionsFlowContract$Step.EditSubscriptionFrequency)) {
                    throw new NoWhenBranchMatchedException();
                }
                EditSubscriptionFrequencyController editSubscriptionFrequencyController = new EditSubscriptionFrequencyController(new EditSubscriptionFrequencyControllerContract$InputData(((SubscriptionsFlowContract$Step.EditSubscriptionFrequency) step3).f89188a));
                final int i21 = 3;
                Function1 block6 = new Function1() { // from class: cae.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i21) {
                            case 0:
                                f output = (f) obj6;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (!Intrinsics.f(output, f.a.f182473a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.feature.subscriptions.impl.flow.a aVar4 = aVar3;
                                if (((d) aVar4.o).c(SubscriptionsApi$Toggles.SubscriptionDetailsKompotMigration.f89132c)) {
                                    aVar4.B2();
                                } else {
                                    aVar4.C1(new BridgeDestination(new FinishCommand(-1, null, null, 6)));
                                }
                                return Unit.f186387a;
                            case 1:
                                h it8 = (h) obj6;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                aVar3.C2(q.f5292a);
                                return Unit.f186387a;
                            case 2:
                                if (obj6 != null) {
                                    throw new ClassCastException();
                                }
                                Intrinsics.checkNotNullParameter(null, "it");
                                aVar3.C2(q.f5292a);
                                return Unit.f186387a;
                            default:
                                c9e.a it9 = (c9e.a) obj6;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                aVar3.C2(q.f5292a);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block6, "block");
                editSubscriptionFrequencyController.H = block6;
                return editSubscriptionFrequencyController;
            case 6:
                final com.revolut.feature_retail_user_declarations.email_verification.b bVar = (com.revolut.feature_retail_user_declarations.email_verification.b) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                EmailVerificationFlowContract$Step step4 = (EmailVerificationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof EmailVerificationFlowContract$Step.VerificationPrompt) {
                    EmailVerificationFlowContract$Step.VerificationPrompt verificationPrompt = (EmailVerificationFlowContract$Step.VerificationPrompt) step4;
                    EmailVerificationPromptController emailVerificationPromptController = new EmailVerificationPromptController(new EmailVerificationPromptContract$InputData(verificationPrompt.f97606a, verificationPrompt.f97607b, EmailVerificationUseCase.PostOnboarding, bVar.o.f97609a));
                    final int i22 = 1;
                    Function1 block7 = new Function1() { // from class: cbi.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i22) {
                                case 0:
                                    zil.c result = (zil.c) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof zil.a) {
                                        oki.h.D2(bVar.f97614s);
                                    } else if (!Intrinsics.f(result, zil.b.f322582a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature_retail_user_declarations.email_verification.b bVar2 = bVar;
                                    yki.i iVar = bVar2.f97614s;
                                    abi.d result2 = (abi.d) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (Intrinsics.f(result2, abi.c.f2967a)) {
                                        oki.h.D2(iVar);
                                    } else {
                                        if (!Intrinsics.f(result2, abi.b.f2966a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.u2(bVar2, iVar, EmailVerificationFlowContract$Step.ChangeEmail.f97605a, null, 6);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    emailVerificationPromptController.H = block7;
                    return emailVerificationPromptController;
                }
                if (!Intrinsics.f(step4, EmailVerificationFlowContract$Step.ChangeEmail.f97605a)) {
                    throw new NoWhenBranchMatchedException();
                }
                final int i32 = 0;
                ViewController viewControllerE1 = bVar.e1(new zil.d(0));
                Function1 block8 = new Function1() { // from class: cbi.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i32) {
                            case 0:
                                zil.c result = (zil.c) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof zil.a) {
                                    oki.h.D2(bVar.f97614s);
                                } else if (!Intrinsics.f(result, zil.b.f322582a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.f186387a;
                            default:
                                com.revolut.feature_retail_user_declarations.email_verification.b bVar2 = bVar;
                                yki.i iVar = bVar2.f97614s;
                                abi.d result2 = (abi.d) obj6;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (Intrinsics.f(result2, abi.c.f2967a)) {
                                    oki.h.D2(iVar);
                                } else {
                                    if (!Intrinsics.f(result2, abi.b.f2966a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.u2(bVar2, iVar, EmailVerificationFlowContract$Step.ChangeEmail.f97605a, null, 6);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block8, "block");
                viewControllerE1.H = block8;
                return viewControllerE1;
            case 7:
                final com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow.a aVar4 = (com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow.a) obj4;
                efc.c cVar = aVar4.u;
                final l FlowCoordinator2 = (l) obj2;
                CardReaderRootFlowContract$Step step5 = (CardReaderRootFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (Intrinsics.f(step5, CardReaderRootFlowContract$Step.Promo.f60636a)) {
                    CardReaderPromoScreen cardReaderPromoScreen = new CardReaderPromoScreen();
                    final int i33 = 0;
                    Function1 function1 = new Function1() { // from class: cc1.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            CardReaderRootFlowContract$Step cardReaderRootFlowContract$StepI2;
                            switch (i33) {
                                case 0:
                                    tb1.a outputData = (tb1.a) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean zF = Intrinsics.f(outputData, a.C1506a.f269432a);
                                    com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow.a aVar5 = aVar4;
                                    l lVar = FlowCoordinator2;
                                    if (zF) {
                                        int i43 = e.f22920a[aVar5.o.f60628a.ordinal()];
                                        if (i43 == 1) {
                                            cardReaderRootFlowContract$StepI2 = ((sa1.q) aVar5.f60640p.f203887a).b().isConnected() ? aVar5.I2() : CardReaderRootFlowContract$Step.Connection.f60631a;
                                        } else if (i43 == 2) {
                                            cardReaderRootFlowContract$StepI2 = CardReaderRootFlowContract$Step.Settings.f60638a;
                                        } else if (i43 == 3) {
                                            cardReaderRootFlowContract$StepI2 = CardReaderRootFlowContract$Step.TipsSettings.f60639a;
                                        } else if (i43 == 4) {
                                            cardReaderRootFlowContract$StepI2 = CardReaderRootFlowContract$Step.CardReaderSettings.f60630a;
                                        } else {
                                            if (i43 != 5) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            cardReaderRootFlowContract$StepI2 = CardReaderRootFlowContract$Step.PaymentLinkSettings.f60635a;
                                        }
                                        oki.h.t2(aVar5, lVar, cardReaderRootFlowContract$StepI2, false, null, false, 12);
                                    } else if (Intrinsics.f(outputData, a.b.f269433a)) {
                                        oki.h.t2(aVar5, lVar, CardReaderRootFlowContract$Step.Order.f60633a, false, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(outputData, a.c.f269434a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(aVar5, lVar, CardReaderRootFlowContract$Step.RevolutShop.f60637a, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.a outputData2 = (com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.a) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z = outputData2 instanceof a.C0448a;
                                    l lVar2 = FlowCoordinator2;
                                    if (z) {
                                        oki.h.D2(lVar2);
                                    } else {
                                        if (!(outputData2 instanceof a.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow.a aVar6 = aVar4;
                                        oki.h.t2(aVar6, lVar2, aVar6.I2(), false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    k it8 = (k) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (!Intrinsics.f(it8, k.f142304a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(aVar4, FlowCoordinator2, CardReaderRootFlowContract$Step.Settings.f60638a, true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function1, "<set-?>");
                    cardReaderPromoScreen.H = function1;
                    return cardReaderPromoScreen;
                }
                if (step5 instanceof CardReaderRootFlowContract$Step.Order) {
                    eb1.a aVar5 = aVar4.v.f125317a;
                    return new CardReaderOrderFlow();
                }
                if (step5 instanceof CardReaderRootFlowContract$Step.RevolutShop) {
                    return aVar4.e1(h3c.a.f149111a);
                }
                if (step5 instanceof CardReaderRootFlowContract$Step.Connection) {
                    final int i43 = 1;
                    CardReaderConnectionFlow cardReaderConnectionFlow = new CardReaderConnectionFlow(new CardReaderConnectionFlowContract$InputData(true));
                    Function1 function12 = new Function1() { // from class: cc1.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            CardReaderRootFlowContract$Step cardReaderRootFlowContract$StepI2;
                            switch (i43) {
                                case 0:
                                    tb1.a outputData = (tb1.a) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean zF = Intrinsics.f(outputData, a.C1506a.f269432a);
                                    com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow.a aVar52 = aVar4;
                                    l lVar = FlowCoordinator2;
                                    if (zF) {
                                        int i432 = e.f22920a[aVar52.o.f60628a.ordinal()];
                                        if (i432 == 1) {
                                            cardReaderRootFlowContract$StepI2 = ((sa1.q) aVar52.f60640p.f203887a).b().isConnected() ? aVar52.I2() : CardReaderRootFlowContract$Step.Connection.f60631a;
                                        } else if (i432 == 2) {
                                            cardReaderRootFlowContract$StepI2 = CardReaderRootFlowContract$Step.Settings.f60638a;
                                        } else if (i432 == 3) {
                                            cardReaderRootFlowContract$StepI2 = CardReaderRootFlowContract$Step.TipsSettings.f60639a;
                                        } else if (i432 == 4) {
                                            cardReaderRootFlowContract$StepI2 = CardReaderRootFlowContract$Step.CardReaderSettings.f60630a;
                                        } else {
                                            if (i432 != 5) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            cardReaderRootFlowContract$StepI2 = CardReaderRootFlowContract$Step.PaymentLinkSettings.f60635a;
                                        }
                                        oki.h.t2(aVar52, lVar, cardReaderRootFlowContract$StepI2, false, null, false, 12);
                                    } else if (Intrinsics.f(outputData, a.b.f269433a)) {
                                        oki.h.t2(aVar52, lVar, CardReaderRootFlowContract$Step.Order.f60633a, false, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(outputData, a.c.f269434a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(aVar52, lVar, CardReaderRootFlowContract$Step.RevolutShop.f60637a, false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.a outputData2 = (com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.a) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z = outputData2 instanceof a.C0448a;
                                    l lVar2 = FlowCoordinator2;
                                    if (z) {
                                        oki.h.D2(lVar2);
                                    } else {
                                        if (!(outputData2 instanceof a.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow.a aVar6 = aVar4;
                                        oki.h.t2(aVar6, lVar2, aVar6.I2(), false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    k it8 = (k) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (!Intrinsics.f(it8, k.f142304a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(aVar4, FlowCoordinator2, CardReaderRootFlowContract$Step.Settings.f60638a, true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function12, "<set-?>");
                    cardReaderConnectionFlow.J = function12;
                    return cardReaderConnectionFlow;
                }
                if (step5 instanceof CardReaderRootFlowContract$Step.NewRequest) {
                    return new CardReaderNewRequestScreen();
                }
                if (step5 instanceof CardReaderRootFlowContract$Step.Amount) {
                    ((com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.a) aVar4.f60642r).getClass();
                    return new LitePosRootFlow(new LitePosRootFlowContract$InputData(LitePosRootFlowContract$Step.LitePos.f60757a));
                }
                if (step5 instanceof CardReaderRootFlowContract$Step.Settings) {
                    cVar.getClass();
                    throw new IllegalStateException("Sales settings screen is not supported in Retail app");
                }
                if (step5 instanceof CardReaderRootFlowContract$Step.PaymentLinkExpiryDate) {
                    cVar.getClass();
                    throw new IllegalStateException("Payment link expiry date screen is not supported in Retail app");
                }
                if (step5 instanceof CardReaderRootFlowContract$Step.PaymentLinkSettings) {
                    cVar.getClass();
                    throw new IllegalStateException("Payment link settings screen is not supported in Retail app");
                }
                if (!(step5 instanceof CardReaderRootFlowContract$Step.CardReaderSettings)) {
                    if (step5 instanceof CardReaderRootFlowContract$Step.TipsSettings) {
                        return aVar4.e1(yz5.d.f318041a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                CardReaderSettingsScreen cardReaderSettingsScreen = new CardReaderSettingsScreen();
                final int i59 = 2;
                Function1 function13 = new Function1() { // from class: cc1.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        CardReaderRootFlowContract$Step cardReaderRootFlowContract$StepI2;
                        switch (i59) {
                            case 0:
                                tb1.a outputData = (tb1.a) obj6;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                boolean zF = Intrinsics.f(outputData, a.C1506a.f269432a);
                                com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow.a aVar52 = aVar4;
                                l lVar = FlowCoordinator2;
                                if (zF) {
                                    int i432 = e.f22920a[aVar52.o.f60628a.ordinal()];
                                    if (i432 == 1) {
                                        cardReaderRootFlowContract$StepI2 = ((sa1.q) aVar52.f60640p.f203887a).b().isConnected() ? aVar52.I2() : CardReaderRootFlowContract$Step.Connection.f60631a;
                                    } else if (i432 == 2) {
                                        cardReaderRootFlowContract$StepI2 = CardReaderRootFlowContract$Step.Settings.f60638a;
                                    } else if (i432 == 3) {
                                        cardReaderRootFlowContract$StepI2 = CardReaderRootFlowContract$Step.TipsSettings.f60639a;
                                    } else if (i432 == 4) {
                                        cardReaderRootFlowContract$StepI2 = CardReaderRootFlowContract$Step.CardReaderSettings.f60630a;
                                    } else {
                                        if (i432 != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cardReaderRootFlowContract$StepI2 = CardReaderRootFlowContract$Step.PaymentLinkSettings.f60635a;
                                    }
                                    oki.h.t2(aVar52, lVar, cardReaderRootFlowContract$StepI2, false, null, false, 12);
                                } else if (Intrinsics.f(outputData, a.b.f269433a)) {
                                    oki.h.t2(aVar52, lVar, CardReaderRootFlowContract$Step.Order.f60633a, false, null, false, 12);
                                } else {
                                    if (!Intrinsics.f(outputData, a.c.f269434a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(aVar52, lVar, CardReaderRootFlowContract$Step.RevolutShop.f60637a, false, null, false, 12);
                                }
                                return Unit.f186387a;
                            case 1:
                                com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.a outputData2 = (com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.a) obj6;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                boolean z = outputData2 instanceof a.C0448a;
                                l lVar2 = FlowCoordinator2;
                                if (z) {
                                    oki.h.D2(lVar2);
                                } else {
                                    if (!(outputData2 instanceof a.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.root_flow.a aVar6 = aVar4;
                                    oki.h.t2(aVar6, lVar2, aVar6.I2(), false, null, false, 12);
                                }
                                return Unit.f186387a;
                            default:
                                k it8 = (k) obj6;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                if (!Intrinsics.f(it8, k.f142304a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                oki.h.t2(aVar4, FlowCoordinator2, CardReaderRootFlowContract$Step.Settings.f60638a, true, null, false, 12);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(function13, "<set-?>");
                cardReaderSettingsScreen.H = function13;
                return cardReaderSettingsScreen;
            case 8:
                cc4.c cVar2 = (cc4.c) obj4;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                FormFlowContract$Step step6 = (FormFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                BackendFlowInput.Source.Session session = new BackendFlowInput.Source.Session(step6.f67765a);
                BackendFlowApiEndpoints.Companion companion = BackendFlowApiEndpoints.INSTANCE;
                String str = step6.f67766b;
                companion.getClass();
                ViewController viewControllerE12 = cVar2.e1(new n90.a(new BackendFlowInput(session, null, null, null, false, BackendFlowApiEndpoints.Companion.a(str), 62)));
                i block9 = new i(cVar2, step6, 8);
                Intrinsics.checkNotNullParameter(block9, "block");
                viewControllerE12.H = block9;
                return viewControllerE12;
            case 9:
                MoneyBoxAmountInputScreen moneyBoxAmountInputScreen = (MoneyBoxAmountInputScreen) obj4;
                CenteredAmountDelegate.Model data2 = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field2 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr2 = MoneyBoxAmountInputScreen.i0;
                Intrinsics.checkNotNullParameter(data2, "data");
                Intrinsics.checkNotNullParameter(field2, "field");
                MaskedTextInputEditText editText2 = field2.getEditText();
                Object obj6 = data2.f51981p;
                Intrinsics.i(obj6, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
                return new zp0.d(editText2, (xi0.b) obj6, (u80.d) moneyBoxAmountInputScreen.U.getValue(), null, new o7.b(moneyBoxAmountInputScreen, 13), false, false, 0, false, null, 1928);
            case 10:
                Pair pair = (Pair) obj4;
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new cd4.j((Clause) pair.f186385a, (Clause) pair.f186386b, (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), false);
            case 11:
                final com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar = (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d) obj4;
                MortgageOfferFlowContract$InputData mortgageOfferFlowContract$InputData = dVar.f67997p;
                l FlowCoordinator3 = (l) obj2;
                final MortgageOfferFlowContract$Step step7 = (MortgageOfferFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof MortgageOfferFlowContract$Step.LoadingTopItemOffer) {
                    return new LoadingScreen(new LoadingScreenContract$InputData(false, (LoadingItems) EmptyLoadingItems.f67876a, 1));
                }
                if (step7 instanceof MortgageOfferFlowContract$Step.Intro) {
                    creditPromptFlow = new AnimatedIntroScreen(new AnimatedIntroScreenContract$InputData(((MortgageOfferFlowContract$Step.Intro) step7).f67979a, mortgageOfferFlowContract$InputData.f67969b));
                    i block10 = new i(dVar, FlowCoordinator3, 10);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    creditPromptFlow.H = block10;
                } else {
                    if (step7 instanceof MortgageOfferFlowContract$Step.OfferContent) {
                        MortgageOfferFlowContract$Step.OfferContent offerContent = (MortgageOfferFlowContract$Step.OfferContent) step7;
                        j0 j0Var = offerContent.f67982b;
                        CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = mortgageOfferFlowContract$InputData.f67969b;
                        String str2 = offerContent.f67981a;
                        OfferContentScreenContract$InputData offerContentScreenContract$InputData = new OfferContentScreenContract$InputData(creditApplicationPluginFlowContract$Configuration, offerContent.f67983c, str2, j0Var == j0.TOP_ITEM ? new TopItemOfferContentScreenContract$OfferContentPayload(AnimatedBackgroundType.DEFAULT.f51471a) : null, pf4.c.BLOCKING, str2 != null ? zv3.a.BACK : zv3.a.CLOSE, 16);
                        int i66 = r.f23384b[j0Var.ordinal()];
                        if (i66 == 1) {
                            bigTileOfferContentScreen = new BigTileOfferContentScreen(offerContentScreenContract$InputData);
                        } else if (i66 == 2) {
                            bigTileOfferContentScreen = new TopItemOfferContentScreen(offerContentScreenContract$InputData);
                        } else {
                            if (i66 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bigTileOfferContentScreen = new RegularOfferContentScreen(offerContentScreenContract$InputData);
                        }
                        ViewController viewController = bigTileOfferContentScreen;
                        o block11 = new o(dVar, step7, FlowCoordinator3);
                        Intrinsics.checkNotNullParameter(block11, "block");
                        viewController.H = block11;
                        return viewController;
                    }
                    if (step7 instanceof MortgageOfferFlowContract$Step.Calculator) {
                        MortgageOfferFlowContract$Step.Calculator calculator = (MortgageOfferFlowContract$Step.Calculator) step7;
                        CalculatorScreen calculatorScreen2 = new CalculatorScreen(new CalculatorScreenContract$InputData(calculator.f67973a, calculator.f67975c, calculator.f67974b == wy3.c.MODAL, mortgageOfferFlowContract$InputData.f67969b));
                        final int i74 = 0;
                        dVar.a(calculatorScreen2, new Function2() { // from class: ce4.p
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj7, Object obj8) {
                                switch (i74) {
                                    case 0:
                                        oki.g onResult = (oki.g) obj7;
                                        com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a outputData = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a) obj8;
                                        Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        boolean z = outputData instanceof a.b;
                                        com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar2 = dVar;
                                        MortgageOfferFlowContract$Step mortgageOfferFlowContract$Step = step7;
                                        if (z) {
                                            dVar2.l2(new c34.d(dVar2, mortgageOfferFlowContract$Step, onResult, (Continuation) null, 14), new yi5.b(26));
                                        } else if (outputData instanceof a.C0474a) {
                                            dVar2.f67998q.d = null;
                                            onResult.pop();
                                        } else if (outputData instanceof nf4.i) {
                                            dVar2.K2(((nf4.i) outputData).f214812a);
                                        } else if (outputData instanceof nf4.f) {
                                            dVar2.l2(new c34.d(dVar2, new MortgageOfferFlowContract$OfferUpdateContext.Calculator(((MortgageOfferFlowContract$Step.Calculator) mortgageOfferFlowContract$Step).f67973a), ((nf4.f) outputData).f214807a, (Continuation) null, 16), new yi5.b(26));
                                        } else if (outputData instanceof nf4.h) {
                                            dVar2.l2(new c34.d(dVar2, outputData, onResult, (Continuation) null, 15), new yi5.b(26));
                                        } else {
                                            if (!(outputData instanceof nf4.g)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            nf4.g gVar = (nf4.g) outputData;
                                            oki.h.w2(dVar2.f68000s, new MortgageOfferFlowContract$Step.Document(qk.d.w(gVar.f214809b, gVar.f214808a)), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        oki.g onResult2 = (oki.g) obj7;
                                        de4.d outputData2 = (de4.d) obj8;
                                        Intrinsics.checkNotNullParameter(onResult2, "$this$onResult");
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        if (outputData2 == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        MortgageOfferFlowContract$OfferUpdateContext mortgageOfferFlowContract$OfferUpdateContext = ((MortgageOfferFlowContract$Step.Confirmation) step7).f67977b;
                                        cv3.u uVar = outputData2.f113287a;
                                        aik.g gVar2 = new aik.g(onResult2, 2);
                                        com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar3 = dVar;
                                        dVar3.l2(new m0(4, dVar3, mortgageOfferFlowContract$OfferUpdateContext, uVar, gVar2, null), new yi5.b(26));
                                        return Unit.f186387a;
                                    default:
                                        oki.g onResult3 = (oki.g) obj7;
                                        fe4.f outputData3 = (fe4.f) obj8;
                                        Intrinsics.checkNotNullParameter(onResult3, "$this$onResult");
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        if (outputData3 == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        MortgageOfferFlowContract$OfferUpdateContext mortgageOfferFlowContract$OfferUpdateContext2 = ((MortgageOfferFlowContract$Step.SingleSelection) step7).f67987b;
                                        cv3.u uVar2 = outputData3.f134438a;
                                        aik.g gVar3 = new aik.g(onResult3, 3);
                                        com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar4 = dVar;
                                        dVar4.l2(new m0(4, dVar4, mortgageOfferFlowContract$OfferUpdateContext2, uVar2, gVar3, null), new yi5.b(26));
                                        return Unit.f186387a;
                                }
                            }
                        });
                        return calculatorScreen2;
                    }
                    if (step7 instanceof MortgageOfferFlowContract$Step.Document) {
                        u1 u1Var = ((MortgageOfferFlowContract$Step.Document) step7).f67978a;
                        String str3 = u1Var.f120785c;
                        return new CreditPdfDocumentController(new CreditPdfDocumentControllerContract$InputData(str3, new CreditPdfDocumentControllerContract$Configuration(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_offer_agreement_action_title, u.c(str3), null, 12), null), new CreditPdfDocumentControllerContract$Document.Remote(u1Var.f120784b, true)));
                    }
                    if (!(step7 instanceof MortgageOfferFlowContract$Step.Prompt)) {
                        if (step7 instanceof MortgageOfferFlowContract$Step.Confirmation) {
                            ConfirmationBottomSheetController confirmationBottomSheetController = new ConfirmationBottomSheetController(new ConfirmationBottomSheetContract$InputData(((MortgageOfferFlowContract$Step.Confirmation) step7).f67976a));
                            final int i92 = 1;
                            dVar.a(confirmationBottomSheetController, new Function2() { // from class: ce4.p
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj7, Object obj8) {
                                    switch (i92) {
                                        case 0:
                                            oki.g onResult = (oki.g) obj7;
                                            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a outputData = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a) obj8;
                                            Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                                            boolean z = outputData instanceof a.b;
                                            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar2 = dVar;
                                            MortgageOfferFlowContract$Step mortgageOfferFlowContract$Step = step7;
                                            if (z) {
                                                dVar2.l2(new c34.d(dVar2, mortgageOfferFlowContract$Step, onResult, (Continuation) null, 14), new yi5.b(26));
                                            } else if (outputData instanceof a.C0474a) {
                                                dVar2.f67998q.d = null;
                                                onResult.pop();
                                            } else if (outputData instanceof nf4.i) {
                                                dVar2.K2(((nf4.i) outputData).f214812a);
                                            } else if (outputData instanceof nf4.f) {
                                                dVar2.l2(new c34.d(dVar2, new MortgageOfferFlowContract$OfferUpdateContext.Calculator(((MortgageOfferFlowContract$Step.Calculator) mortgageOfferFlowContract$Step).f67973a), ((nf4.f) outputData).f214807a, (Continuation) null, 16), new yi5.b(26));
                                            } else if (outputData instanceof nf4.h) {
                                                dVar2.l2(new c34.d(dVar2, outputData, onResult, (Continuation) null, 15), new yi5.b(26));
                                            } else {
                                                if (!(outputData instanceof nf4.g)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                nf4.g gVar = (nf4.g) outputData;
                                                oki.h.w2(dVar2.f68000s, new MortgageOfferFlowContract$Step.Document(qk.d.w(gVar.f214809b, gVar.f214808a)), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                                            }
                                            return Unit.f186387a;
                                        case 1:
                                            oki.g onResult2 = (oki.g) obj7;
                                            de4.d outputData2 = (de4.d) obj8;
                                            Intrinsics.checkNotNullParameter(onResult2, "$this$onResult");
                                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                            if (outputData2 == null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            MortgageOfferFlowContract$OfferUpdateContext mortgageOfferFlowContract$OfferUpdateContext = ((MortgageOfferFlowContract$Step.Confirmation) step7).f67977b;
                                            cv3.u uVar = outputData2.f113287a;
                                            aik.g gVar2 = new aik.g(onResult2, 2);
                                            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar3 = dVar;
                                            dVar3.l2(new m0(4, dVar3, mortgageOfferFlowContract$OfferUpdateContext, uVar, gVar2, null), new yi5.b(26));
                                            return Unit.f186387a;
                                        default:
                                            oki.g onResult3 = (oki.g) obj7;
                                            fe4.f outputData3 = (fe4.f) obj8;
                                            Intrinsics.checkNotNullParameter(onResult3, "$this$onResult");
                                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                            if (outputData3 == null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            MortgageOfferFlowContract$OfferUpdateContext mortgageOfferFlowContract$OfferUpdateContext2 = ((MortgageOfferFlowContract$Step.SingleSelection) step7).f67987b;
                                            cv3.u uVar2 = outputData3.f134438a;
                                            aik.g gVar3 = new aik.g(onResult3, 3);
                                            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar4 = dVar;
                                            dVar4.l2(new m0(4, dVar4, mortgageOfferFlowContract$OfferUpdateContext2, uVar2, gVar3, null), new yi5.b(26));
                                            return Unit.f186387a;
                                    }
                                }
                            });
                            return confirmationBottomSheetController;
                        }
                        if (!(step7 instanceof MortgageOfferFlowContract$Step.SingleSelection)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        SingleSelectionBottomSheetController singleSelectionBottomSheetController = new SingleSelectionBottomSheetController(new SingleSelectionBottomSheetContract$InputData(((MortgageOfferFlowContract$Step.SingleSelection) step7).f67986a));
                        final int i96 = 2;
                        dVar.a(singleSelectionBottomSheetController, new Function2() { // from class: ce4.p
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj7, Object obj8) {
                                switch (i96) {
                                    case 0:
                                        oki.g onResult = (oki.g) obj7;
                                        com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a outputData = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a) obj8;
                                        Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        boolean z = outputData instanceof a.b;
                                        com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar2 = dVar;
                                        MortgageOfferFlowContract$Step mortgageOfferFlowContract$Step = step7;
                                        if (z) {
                                            dVar2.l2(new c34.d(dVar2, mortgageOfferFlowContract$Step, onResult, (Continuation) null, 14), new yi5.b(26));
                                        } else if (outputData instanceof a.C0474a) {
                                            dVar2.f67998q.d = null;
                                            onResult.pop();
                                        } else if (outputData instanceof nf4.i) {
                                            dVar2.K2(((nf4.i) outputData).f214812a);
                                        } else if (outputData instanceof nf4.f) {
                                            dVar2.l2(new c34.d(dVar2, new MortgageOfferFlowContract$OfferUpdateContext.Calculator(((MortgageOfferFlowContract$Step.Calculator) mortgageOfferFlowContract$Step).f67973a), ((nf4.f) outputData).f214807a, (Continuation) null, 16), new yi5.b(26));
                                        } else if (outputData instanceof nf4.h) {
                                            dVar2.l2(new c34.d(dVar2, outputData, onResult, (Continuation) null, 15), new yi5.b(26));
                                        } else {
                                            if (!(outputData instanceof nf4.g)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            nf4.g gVar = (nf4.g) outputData;
                                            oki.h.w2(dVar2.f68000s, new MortgageOfferFlowContract$Step.Document(qk.d.w(gVar.f214809b, gVar.f214808a)), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        oki.g onResult2 = (oki.g) obj7;
                                        de4.d outputData2 = (de4.d) obj8;
                                        Intrinsics.checkNotNullParameter(onResult2, "$this$onResult");
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        if (outputData2 == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        MortgageOfferFlowContract$OfferUpdateContext mortgageOfferFlowContract$OfferUpdateContext = ((MortgageOfferFlowContract$Step.Confirmation) step7).f67977b;
                                        cv3.u uVar = outputData2.f113287a;
                                        aik.g gVar2 = new aik.g(onResult2, 2);
                                        com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar3 = dVar;
                                        dVar3.l2(new m0(4, dVar3, mortgageOfferFlowContract$OfferUpdateContext, uVar, gVar2, null), new yi5.b(26));
                                        return Unit.f186387a;
                                    default:
                                        oki.g onResult3 = (oki.g) obj7;
                                        fe4.f outputData3 = (fe4.f) obj8;
                                        Intrinsics.checkNotNullParameter(onResult3, "$this$onResult");
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        if (outputData3 == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        MortgageOfferFlowContract$OfferUpdateContext mortgageOfferFlowContract$OfferUpdateContext2 = ((MortgageOfferFlowContract$Step.SingleSelection) step7).f67987b;
                                        cv3.u uVar2 = outputData3.f134438a;
                                        aik.g gVar3 = new aik.g(onResult3, 3);
                                        com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.d dVar4 = dVar;
                                        dVar4.l2(new m0(4, dVar4, mortgageOfferFlowContract$OfferUpdateContext2, uVar2, gVar3, null), new yi5.b(26));
                                        return Unit.f186387a;
                                }
                            }
                        });
                        return singleSelectionBottomSheetController;
                    }
                    creditPromptFlow = new CreditPromptFlow(new CreditPromptFlowContract$InputData(zv3.a.BACK, ((MortgageOfferFlowContract$Step.Prompt) step7).f67985b, new CreditPromptAnalyticsConfiguration(com.revolut.feature.credit.core.R$string.credit_application_addon_intro_title, com.revolut.feature.credit.core.R$string.credit_application_addon_intro_description, com.revolut.feature.credit.core.R$string.credit_application_addon_intro_primary_button, com.revolut.feature.credit.core.R$string.credit_application_addon_intro_secondary_button), mortgageOfferFlowContract$InputData.f67969b));
                    o block12 = new o(FlowCoordinator3, dVar, step7);
                    Intrinsics.checkNotNullParameter(block12, "block");
                    creditPromptFlow.H = block12;
                }
                return creditPromptFlow;
            case 12:
                p state = (p) obj2;
                ce9.d action = (ce9.d) obj3;
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(action, "action");
                Function2 function2 = ((ce9.j) obj4).f23433a;
                if (action instanceof ce9.g) {
                    if (!((ce9.g) action).f23430a) {
                        return p.a(state, null, true, null, false, null, null, 33);
                    }
                    state.getClass();
                    return new p(null, true, null, false, null, null);
                }
                if (action instanceof ce9.f) {
                    return p.a(state, null, false, ((ce9.f) action).f23429a, false, null, null, 57);
                }
                if (action instanceof ce9.h) {
                    ce9.o oVar = ((ce9.h) action).f23431a;
                    return new p(function2.invoke(null, oVar.getContent()), oVar, 30);
                }
                if (Intrinsics.f(action, d.a.f23427a)) {
                    return p.a(state, null, false, null, true, null, null, 39);
                }
                if (action instanceof ce9.c) {
                    return p.a(state, null, false, null, false, ((ce9.c) action).f23426a, null, 39);
                }
                if (!(action instanceof ce9.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                ce9.o oVar2 = ((ce9.e) action).f23428a;
                return p.a(state, function2.invoke(state.f23436a, oVar2.getContent()), false, null, false, null, oVar2, 22);
            case 13:
                com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar6 = (com.revolut.feature.pockets.impl.details_v2.linked_account_details.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                LinkedAccountDetailsScreenContract$ModalStep step8 = (LinkedAccountDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof LinkedAccountDetailsScreenContract$ModalStep.RevokeConfirmation) {
                    zca.b bVar2 = aVar6.f80823y;
                    String str4 = ((LinkedAccountDetailsScreenContract$ModalStep.RevokeConfirmation) step8).f80815a;
                    bVar2.getClass();
                    ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(zca.b.a(str4));
                    cea.p block13 = new cea.p(aVar6, ModalCoordinator);
                    Intrinsics.checkNotNullParameter(block13, "block");
                    actionsBottomSheetController2.H = block13;
                    return actionsBottomSheetController2;
                }
                if (!(step8 instanceof LinkedAccountDetailsScreenContract$ModalStep.InstitutionOfflineError)) {
                    throw new NoWhenBranchMatchedException();
                }
                le6.c cVar3 = aVar6.C;
                k9 k9Var = k9.OpenBanking;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController3 = new ActionsBottomSheetController(((fn6.b) cVar3).c(com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
                cea.p block14 = new cea.p(aVar6);
                Intrinsics.checkNotNullParameter(block14, "block");
                actionsBottomSheetController3.H = block14;
                return actionsBottomSheetController3;
            case 14:
                final com.revolut.feature.credit.application.plugins.impl.ui.offer.e eVar = (com.revolut.feature.credit.application.plugins.impl.ui.offer.e) obj4;
                OfferFlowContract$InputData offerFlowContract$InputData = eVar.f68083p;
                final OfferFlowContract$Step step9 = (OfferFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof OfferFlowContract$Step.AnimatedIntro) {
                    AnimatedIntroScreen animatedIntroScreen = new AnimatedIntroScreen(new AnimatedIntroScreenContract$InputData(((OfferFlowContract$Step.AnimatedIntro) step9).f68066a, offerFlowContract$InputData.f68062c));
                    ce9.a block15 = new ce9.a(eVar, 4);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    animatedIntroScreen.H = block15;
                    return animatedIntroScreen;
                }
                if (!(step9 instanceof OfferFlowContract$Step.OfferContent)) {
                    if (step9 instanceof OfferFlowContract$Step.DocumentViewer) {
                        int i99 = com.revolut.feature.credit.core.R$string.credit_application_offer_agreement_action_title;
                        OfferFlowContract$Step.DocumentViewer documentViewer = (OfferFlowContract$Step.DocumentViewer) step9;
                        su3.a aVar7 = documentViewer.f68068b;
                        String str5 = aVar7.e;
                        if (str5 == null) {
                            str5 = documentViewer.f68067a;
                        }
                        CreditApplicationDocumentViewerScreen creditApplicationDocumentViewerScreen = new CreditApplicationDocumentViewerScreen(new CreditApplicationDocumentViewerScreenContract$InputData(new TextLocalisedClause(i99, u.c(new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), documentViewer.f68067a, new v44.f(aVar7.f265635a, aVar7.f265636b), documentViewer.f68069c, documentViewer.d, new AnalyticsContext(v7.m(offerFlowContract$InputData.f68062c, AnalyticsContext.INSTANCE)), null, null, 192));
                        bwc.i block16 = new bwc.i(1, eVar, com.revolut.feature.credit.application.plugins.impl.ui.offer.e.class, "handleDocumentViewerResult", "handleDocumentViewerResult(Lcom/revolut/feature/credit/application/plugins/impl/ui/agreements/common/viewer/CreditApplicationDocumentViewerScreenContract$OutputData;)V", 0, 15);
                        Intrinsics.checkNotNullParameter(block16, "block");
                        creditApplicationDocumentViewerScreen.H = block16;
                        return creditApplicationDocumentViewerScreen;
                    }
                    if (!(step9 instanceof OfferFlowContract$Step.EditOffer)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    OfferFlowContract$Step.EditOffer editOffer = (OfferFlowContract$Step.EditOffer) step9;
                    calculatorScreen = new com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorScreen(new com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorScreenContract$InputData(R$drawable.uikit_icn_24_back_button_arrow, editOffer.f68070a, editOffer.f68071b, editOffer.f68072c, offerFlowContract$InputData.f68062c, 16));
                    final int i100 = 3;
                    Function1 block17 = new Function1() { // from class: cf4.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i100) {
                                case 0:
                                    ff4.q outputData = (ff4.q) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    eVar.R2(outputData, (OfferFlowContract$Step.OfferContent) step9);
                                    return Unit.f186387a;
                                case 1:
                                    ff4.q outputData2 = (ff4.q) obj7;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    eVar.R2(outputData2, (OfferFlowContract$Step.OfferContent) step9);
                                    return Unit.f186387a;
                                case 2:
                                    ff4.q outputData3 = (ff4.q) obj7;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    eVar.R2(outputData3, (OfferFlowContract$Step.OfferContent) step9);
                                    return Unit.f186387a;
                                default:
                                    c64.l outputData4 = (c64.l) obj7;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    OfferFlowContract$Step.EditOffer editOffer2 = (OfferFlowContract$Step.EditOffer) step9;
                                    boolean z = outputData4 instanceof m;
                                    com.revolut.feature.credit.application.plugins.impl.ui.offer.e eVar2 = eVar;
                                    if (z) {
                                        eVar2.n2(new com.revolut.feature.credit.application.plugins.impl.ui.offer.a(eVar2, outputData4, null), new whi.b(6));
                                    } else if (outputData4 instanceof l.a) {
                                        oki.h.t2(eVar2, eVar2.f68088w, new OfferFlowContract$Step.OfferContent(editOffer2.f68070a, editOffer2.f68071b, editOffer2.f68072c), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    } else {
                                        if (!(outputData4 instanceof n)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar2.K2(((n) outputData4).f21635a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block17, "block");
                    calculatorScreen.H = block17;
                } else if (offerFlowContract$InputData.f68061b.f154901a == j0.WITH_IMAGE_HEADER) {
                    OfferFlowContract$Step.OfferContent offerContent2 = (OfferFlowContract$Step.OfferContent) step9;
                    calculatorScreen = new OfferUpsellScreen(new com.revolut.feature.credit.application.plugins.impl.ui.offer.content.OfferContentScreenContract$InputData(offerContent2.f68073a, offerContent2.f68074b, offerContent2.f68075c, offerFlowContract$InputData.f68060a, offerFlowContract$InputData.f68062c));
                    final int i101 = 0;
                    Function1 block18 = new Function1() { // from class: cf4.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i101) {
                                case 0:
                                    ff4.q outputData = (ff4.q) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    eVar.R2(outputData, (OfferFlowContract$Step.OfferContent) step9);
                                    return Unit.f186387a;
                                case 1:
                                    ff4.q outputData2 = (ff4.q) obj7;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    eVar.R2(outputData2, (OfferFlowContract$Step.OfferContent) step9);
                                    return Unit.f186387a;
                                case 2:
                                    ff4.q outputData3 = (ff4.q) obj7;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    eVar.R2(outputData3, (OfferFlowContract$Step.OfferContent) step9);
                                    return Unit.f186387a;
                                default:
                                    c64.l outputData4 = (c64.l) obj7;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    OfferFlowContract$Step.EditOffer editOffer2 = (OfferFlowContract$Step.EditOffer) step9;
                                    boolean z = outputData4 instanceof m;
                                    com.revolut.feature.credit.application.plugins.impl.ui.offer.e eVar2 = eVar;
                                    if (z) {
                                        eVar2.n2(new com.revolut.feature.credit.application.plugins.impl.ui.offer.a(eVar2, outputData4, null), new whi.b(6));
                                    } else if (outputData4 instanceof l.a) {
                                        oki.h.t2(eVar2, eVar2.f68088w, new OfferFlowContract$Step.OfferContent(editOffer2.f68070a, editOffer2.f68071b, editOffer2.f68072c), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    } else {
                                        if (!(outputData4 instanceof n)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar2.K2(((n) outputData4).f21635a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    calculatorScreen.H = block18;
                } else if (v.k(j1.BASIC_CREDIT_CARD, j1.CREDIT_CARD_LIMIT_DECREASE).contains(offerFlowContract$InputData.f68062c.d)) {
                    OfferFlowContract$Step.OfferContent offerContent3 = (OfferFlowContract$Step.OfferContent) step9;
                    calculatorScreen = new OfferTopItemContentScreen(new com.revolut.feature.credit.application.plugins.impl.ui.offer.content.OfferContentScreenContract$InputData(offerContent3.f68073a, offerContent3.f68074b, offerContent3.f68075c, offerFlowContract$InputData.f68060a, offerFlowContract$InputData.f68062c));
                    final int i102 = 1;
                    Function1 block19 = new Function1() { // from class: cf4.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i102) {
                                case 0:
                                    ff4.q outputData = (ff4.q) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    eVar.R2(outputData, (OfferFlowContract$Step.OfferContent) step9);
                                    return Unit.f186387a;
                                case 1:
                                    ff4.q outputData2 = (ff4.q) obj7;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    eVar.R2(outputData2, (OfferFlowContract$Step.OfferContent) step9);
                                    return Unit.f186387a;
                                case 2:
                                    ff4.q outputData3 = (ff4.q) obj7;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    eVar.R2(outputData3, (OfferFlowContract$Step.OfferContent) step9);
                                    return Unit.f186387a;
                                default:
                                    c64.l outputData4 = (c64.l) obj7;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    OfferFlowContract$Step.EditOffer editOffer2 = (OfferFlowContract$Step.EditOffer) step9;
                                    boolean z = outputData4 instanceof m;
                                    com.revolut.feature.credit.application.plugins.impl.ui.offer.e eVar2 = eVar;
                                    if (z) {
                                        eVar2.n2(new com.revolut.feature.credit.application.plugins.impl.ui.offer.a(eVar2, outputData4, null), new whi.b(6));
                                    } else if (outputData4 instanceof l.a) {
                                        oki.h.t2(eVar2, eVar2.f68088w, new OfferFlowContract$Step.OfferContent(editOffer2.f68070a, editOffer2.f68071b, editOffer2.f68072c), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    } else {
                                        if (!(outputData4 instanceof n)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar2.K2(((n) outputData4).f21635a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block19, "block");
                    calculatorScreen.H = block19;
                } else {
                    OfferFlowContract$Step.OfferContent offerContent4 = (OfferFlowContract$Step.OfferContent) step9;
                    calculatorScreen = new OfferContentScreen(new com.revolut.feature.credit.application.plugins.impl.ui.offer.content.OfferContentScreenContract$InputData(offerContent4.f68073a, offerContent4.f68074b, offerContent4.f68075c, offerFlowContract$InputData.f68060a, offerFlowContract$InputData.f68062c));
                    final int i103 = 2;
                    Function1 block20 = new Function1() { // from class: cf4.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i103) {
                                case 0:
                                    ff4.q outputData = (ff4.q) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    eVar.R2(outputData, (OfferFlowContract$Step.OfferContent) step9);
                                    return Unit.f186387a;
                                case 1:
                                    ff4.q outputData2 = (ff4.q) obj7;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    eVar.R2(outputData2, (OfferFlowContract$Step.OfferContent) step9);
                                    return Unit.f186387a;
                                case 2:
                                    ff4.q outputData3 = (ff4.q) obj7;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    eVar.R2(outputData3, (OfferFlowContract$Step.OfferContent) step9);
                                    return Unit.f186387a;
                                default:
                                    c64.l outputData4 = (c64.l) obj7;
                                    Intrinsics.checkNotNullParameter(outputData4, "outputData");
                                    OfferFlowContract$Step.EditOffer editOffer2 = (OfferFlowContract$Step.EditOffer) step9;
                                    boolean z = outputData4 instanceof m;
                                    com.revolut.feature.credit.application.plugins.impl.ui.offer.e eVar2 = eVar;
                                    if (z) {
                                        eVar2.n2(new com.revolut.feature.credit.application.plugins.impl.ui.offer.a(eVar2, outputData4, null), new whi.b(6));
                                    } else if (outputData4 instanceof l.a) {
                                        oki.h.t2(eVar2, eVar2.f68088w, new OfferFlowContract$Step.OfferContent(editOffer2.f68070a, editOffer2.f68071b, editOffer2.f68072c), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    } else {
                                        if (!(outputData4 instanceof n)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar2.K2(((n) outputData4).f21635a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block20, "block");
                    calculatorScreen.H = block20;
                }
                return calculatorScreen;
            case 15:
                cgh.b bVar3 = ((com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fund_highlights.a) obj4).f95802q;
                FundHighlightsScreenContract$ModalStep step10 = (FundHighlightsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter((com.revolut.kompot.navigable.vc.modal.a) obj2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (step10 instanceof FundHighlightsScreenContract$ModalStep.DealSourcingInfo) {
                    a0 dealSourcing = ((FundHighlightsScreenContract$ModalStep.DealSourcingInfo) step10).f95798a;
                    bVar3.getClass();
                    Intrinsics.checkNotNullParameter(dealSourcing, "dealSourcing");
                    int[] iArr = cgh.a.f23967a;
                    int i104 = iArr[dealSourcing.ordinal()];
                    if (i104 == 1) {
                        i = 14;
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_deal_sourcing_single_manager_dialog_title, null, null, 14);
                    } else {
                        if (i104 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = 14;
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_deal_sourcing_multi_manager_dialog_title, null, null, 14);
                    }
                    int i105 = iArr[dealSourcing.ordinal()];
                    if (i105 == 1) {
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_deal_sourcing_single_manager_dialog_description, null, null, i);
                    } else {
                        if (i105 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_deal_sourcing_multi_manager_dialog_description, null, null, i);
                    }
                    return cgh.b.a(textLocalisedClause, textLocalisedClause2);
                }
                if (step10 instanceof FundHighlightsScreenContract$ModalStep.TrackRecordInfo) {
                    bVar3.getClass();
                    return cgh.b.a(new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_track_record_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_track_record_dialog_description, null, null, 14));
                }
                if (step10 instanceof FundHighlightsScreenContract$ModalStep.LiquidityGateInfo) {
                    bVar3.getClass();
                    return cgh.b.a(new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_liquidity_gate_dialog_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_liquidity_gate_dialog_description, null, null, 14));
                }
                if (!(step10 instanceof FundHighlightsScreenContract$ModalStep.CoreTeamMemberInfo)) {
                    throw new NoWhenBranchMatchedException();
                }
                FundHighlightsScreenContract$ModalStep.CoreTeamMemberInfo coreTeamMemberInfo = (FundHighlightsScreenContract$ModalStep.CoreTeamMemberInfo) step10;
                String name = coreTeamMemberInfo.f95795a;
                String role = coreTeamMemberInfo.f95796b;
                Image image = coreTeamMemberInfo.f95797c;
                String description = coreTeamMemberInfo.d;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(role, "role");
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(description, "description");
                lw0.a aVar8 = new lw0.a(new TextClause(name, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(role, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new lw0.b(image, null), null, false, 24);
                TextClause textClause = new TextClause(description, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
                aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                k9 value2 = k9.Wealth;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value2, "value");
                return new ActionsBottomSheetController(new dii.a(aVar8, eVar2, new AnalyticsProduct.Retail(value2), (AnalyticsContext) null, textClause));
            case 16:
                com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b bVar4 = (com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b) obj4;
                GooglePayOtpLocationMismatchScreenContract$ModalStep step11 = (GooglePayOtpLocationMismatchScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter((com.revolut.kompot.navigable.vc.modal.a) obj2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!(step11 instanceof GooglePayOtpLocationMismatchScreenContract$ModalStep.CardSecurityPrompt)) {
                    throw new NoWhenBranchMatchedException();
                }
                GooglePayOtpLocationMismatchScreenContract$ModalStep.CardSecurityPrompt cardSecurityPrompt = (GooglePayOtpLocationMismatchScreenContract$ModalStep.CardSecurityPrompt) step11;
                ViewController viewControllerE13 = bVar4.e1(new kg1.e(cardSecurityPrompt.f60905a, cardSecurityPrompt.f60906b));
                ch1.d block21 = new ch1.d(bVar4, 1);
                Intrinsics.checkNotNullParameter(block21, "block");
                viewControllerE13.H = block21;
                return viewControllerE13;
            case 17:
                com.revolut.feature.external_accounts.impl.mandate.create_mandate.b bVar5 = (com.revolut.feature.external_accounts.impl.mandate.create_mandate.b) obj4;
                CreateMandateScreenContract$ModalStep step12 = (CreateMandateScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter((com.revolut.kompot.navigable.vc.modal.a) obj2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof CreateMandateScreenContract$ModalStep.LimitsStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreateMandateScreenContract$ModalStep.LimitsStep limitsStep = (CreateMandateScreenContract$ModalStep.LimitsStep) step12;
                UpdateLimitsScreen updateLimitsScreen = new UpdateLimitsScreen(new UpdateLimitsScreenContract$InputData(UpdateLimitsMode.ReturnNewLimits.f72465a, limitsStep.f72439a, limitsStep.f72440b, bVar5.o.f72437b));
                ce9.a block22 = new ce9.a(bVar5, 6);
                Intrinsics.checkNotNullParameter(block22, "block");
                updateLimitsScreen.H = block22;
                return updateLimitsScreen;
            case 18:
                com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.a aVar9 = (com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.a) obj4;
                WatchlistsSelectorScreenContract$ModalStep step13 = (WatchlistsSelectorScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter((com.revolut.kompot.navigable.vc.modal.a) obj2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (Intrinsics.f(step13, WatchlistsSelectorScreenContract$ModalStep.CreateNewWatchlist.f86933a)) {
                    return new NewWatchlistController(new qgd.d(y0.b(aVar9.o.f86932b)));
                }
                throw new NoWhenBranchMatchedException();
            case 19:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.hide_student.a aVar10 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.hide_student.a) obj4;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                HideStudentFlowContract$Step step14 = (HideStudentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (!(step14 instanceof HideStudentFlowContract$Step.Confirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                HideStudentBottomSheet hideStudentBottomSheet = new HideStudentBottomSheet();
                s.G(hideStudentBottomSheet, new a97.i(2, aVar10, com.revolut.retail.feature.pricing_plans.ui.impl.flows.hide_student.a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 7), new chk.e(aVar10, null), new ce9.a(aVar10, 7));
                return hideStudentBottomSheet;
            case 20:
                com.revolut.feature.travel.miles.impl.ui.screen.home.search.a aVar11 = (com.revolut.feature.travel.miles.impl.ui.screen.home.search.a) obj4;
                TravelMilesAirlinesHomeSearchScreenContract$ModalStep step15 = (TravelMilesAirlinesHomeSearchScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter((com.revolut.kompot.navigable.vc.modal.a) obj2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (!(step15 instanceof TravelMilesAirlinesHomeSearchScreenContract$ModalStep.UnlinkAccount)) {
                    throw new NoWhenBranchMatchedException();
                }
                TravelMilesAirlinesHomeSearchScreenContract$ModalStep.UnlinkAccount unlinkAccount = (TravelMilesAirlinesHomeSearchScreenContract$ModalStep.UnlinkAccount) step15;
                return aVar11.e1(new g1f.a(unlinkAccount.f94359a, unlinkAccount.f94360b, u2f.j.MILES));
            case 21:
                com.revolut.feature.shops.impl.ui.details.a aVar12 = (com.revolut.feature.shops.impl.ui.details.a) obj4;
                ShopsCampaignCheckoutScreenContract$ModalStep step16 = (ShopsCampaignCheckoutScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter((com.revolut.kompot.navigable.vc.modal.a) obj2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (!(step16 instanceof ShopsCampaignCheckoutScreenContract$ModalStep.Countries)) {
                    if (!(step16 instanceof ShopsCampaignCheckoutScreenContract$ModalStep.TermsReview)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    k0c.a aVar13 = aVar12.C;
                    RevPointsTermsReviewInputData revPointsTermsReviewInputData = ((ShopsCampaignCheckoutScreenContract$ModalStep.TermsReview) step16).f87165a;
                    aVar13.getClass();
                    RevPointsTermsReviewFlow revPointsTermsReviewFlowA = k0c.a.a(revPointsTermsReviewInputData);
                    cjd.g block23 = new cjd.g(aVar12, 0);
                    Intrinsics.checkNotNullParameter(block23, "block");
                    revPointsTermsReviewFlowA.H = block23;
                    return revPointsTermsReviewFlowA;
                }
                djd.e eVar3 = aVar12.f87168q;
                List countryCodes = ((ShopsCampaignCheckoutScreenContract$ModalStep.Countries) step16).f87164a;
                eVar3.getClass();
                Intrinsics.checkNotNullParameter(countryCodes, "countryCodes");
                lw0.a aVar14 = new lw0.a(new TextLocalisedClause(com.revolut.feature.store.api.R$string.store_mega_offer_details_campaign_modal_countries_title, null, null, 14), null, null, null, false, 30);
                aw0.e eVar4 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.store.api.R$string.store_mega_offer_details_campaign_modal_countries_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                List<String> listU = d0.U(countryCodes);
                ArrayList arrayList = new ArrayList(w.t(listU, 10));
                for (String str6 : listU) {
                    wi0.b.Companion.getClass();
                    boolean z = false;
                    arrayList.add(new eii.l((Clause) new CountryClause(wi0.a.a(str6), null), (Clause) null, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new CountryImage(str6, (Integer) null, (ez0.e) null, 14), z, z, 6), false, false, (RowDelegate.Model.c) null, (Object) null, 488));
                }
                k9 k9Var2 = k9.Shops;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                return new RowActionsBottomSheetController(new eii.c(aVar14, eVar4, arrayList, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null));
            case 22:
                ck1.c cVar4 = (ck1.c) obj4;
                yj1.e params2 = (yj1.e) obj2;
                od0.i airTip = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(airTip, "airTip");
                yj1.a aVar15 = (yj1.a) airTip.f224257a;
                if (aVar15 != null) {
                    cVar4.f24742b.f(ngm.n.c(params2), aVar15);
                } else {
                    cVar4.f24742b.remove(ngm.n.c(params2));
                }
                return Unit.f186387a;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zi0.c.P(v.k(new f0(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_search_category_stocks_name, null, null, 14), ((clh.w) obj4) + "-list-id"), h0Var), false, null, 3);
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zi0.c.P(v.k(new f0(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_discover_section_ipo_spotlight_header_title, null, null, 14), ((clh.o) obj4).a() + "-list-id"), h0Var), false, null, 3);
            case 25:
                InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
                InputText view = (InputText) obj3;
                KProperty[] kPropertyArr3 = EnterCardNumberScreen.f106397e0;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(view, "view");
                return new y(view.getInnerEditText(), null, "[0000] [0000] [0000] [0999] [999]", new ch6.d((EnterCardNumberScreen) obj4, 15), model.f52580a, DigitsKeyListener.getInstance("1234567890 "), false, 66);
            case 26:
                return a(obj2, obj3);
            case 27:
                return b(obj2, obj3);
            case 28:
                return c(obj2, obj3);
            default:
                final com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar5 = (com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e) obj4;
                EasyBankTransferFlowContract$InputData easyBankTransferFlowContract$InputData = eVar5.o;
                yki.b LazyFlowCoordinator4 = (yki.b) obj2;
                final EasyBankTransferFlowContract$Step step17 = (EasyBankTransferFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator4, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step17, "step");
                if (step17 instanceof EasyBankTransferFlowContract$Step.Institutions) {
                    InstitutionsListScreen institutionsListScreen = new InstitutionsListScreen(new xn6.f(easyBankTransferFlowContract$InputData.f72961c, oe6.d.f224553a, null));
                    cma.b block24 = new cma.b(eVar5, LazyFlowCoordinator4, 1);
                    Intrinsics.checkNotNullParameter(block24, "block");
                    institutionsListScreen.H = block24;
                    return institutionsListScreen;
                }
                if (!(step17 instanceof EasyBankTransferFlowContract$Step.CreateMandate)) {
                    if (step17 instanceof EasyBankTransferFlowContract$Step.Instructions) {
                        EasyBankTransferFlowContract$Step.Instructions instructions = (EasyBankTransferFlowContract$Step.Instructions) step17;
                        ibanScreen = new InstructionsScreen(new gn6.e(instructions.f72975c, instructions.f72973a, new com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.a(step17, eVar5, null)));
                        ce9.a block25 = new ce9.a(eVar5, 22);
                        Intrinsics.checkNotNullParameter(block25, "block");
                        ibanScreen.H = block25;
                    } else if (step17 instanceof EasyBankTransferFlowContract$Step.Branches) {
                        EasyBankTransferFlowContract$Step.Branches branches = (EasyBankTransferFlowContract$Step.Branches) step17;
                        ibanScreen = new BranchesScreen(new BranchesScreenContract$InputData(new TextClause(branches.f72963b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_selection_title, null, null, 14), branches.f72962a, true));
                        final int i106 = 2;
                        Function1 block26 = new Function1() { // from class: cn6.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                switch (i106) {
                                    case 0:
                                        r0 result = (r0) obj7;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        if (!(result instanceof r0)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        EasyBankTransferFlowContract$Step.CreateMandate createMandate = (EasyBankTransferFlowContract$Step.CreateMandate) step17;
                                        String str7 = createMandate.f72965a;
                                        String str8 = createMandate.f72966b;
                                        boolean z3 = createMandate.f72967c;
                                        com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar6 = eVar5;
                                        eVar6.n2(new com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.c(eVar6, str7, str8, z3, null), new whi.b(6));
                                        return Unit.f186387a;
                                    case 1:
                                        we6.m result2 = (we6.m) obj7;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        if (!(result2 instanceof we6.m)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        EasyBankTransferFlowContract$Step.CreateMandate createMandate2 = (EasyBankTransferFlowContract$Step.CreateMandate) step17;
                                        String str9 = createMandate2.f72965a;
                                        String str10 = createMandate2.f72966b;
                                        boolean z4 = createMandate2.f72967c;
                                        com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar7 = eVar5;
                                        eVar7.n2(new com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.c(eVar7, str9, str10, z4, null), new whi.b(6));
                                        return Unit.f186387a;
                                    case 2:
                                        com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar8 = eVar5;
                                        EasyBankTransferFlowContract$InputData easyBankTransferFlowContract$InputData2 = eVar8.o;
                                        rn6.f result3 = (rn6.f) obj7;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        if (result3 instanceof rn6.e) {
                                            EasyBankTransferFlowContract$Step.Branches branches2 = (EasyBankTransferFlowContract$Step.Branches) step17;
                                            String str11 = branches2.f72962a;
                                            String str12 = branches2.f72963b;
                                            io3.b bVar6 = branches2.f72964c;
                                            ho3.a aVar16 = ((rn6.e) result3).f255507a;
                                            eVar8.C2(new we6.u(new EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data.Branch(aVar16.f154218a, aVar16.f154219b, bVar6, easyBankTransferFlowContract$InputData2.f72959a.f115083b, str11, str12, branches2.d)));
                                            if (!easyBankTransferFlowContract$InputData2.f) {
                                                oki.h.D2(eVar8.v);
                                            }
                                        } else {
                                            if (!(result3 instanceof f.a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            eVar8.B2();
                                        }
                                        return Unit.f186387a;
                                    default:
                                        vn6.f result4 = (vn6.f) obj7;
                                        Intrinsics.checkNotNullParameter(result4, "result");
                                        boolean z6 = result4 instanceof vn6.e;
                                        com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar9 = eVar5;
                                        if (z6) {
                                            EasyBankTransferFlowContract$Step.Iban iban = (EasyBankTransferFlowContract$Step.Iban) step17;
                                            eVar9.J2(iban.f72968a, iban.f72969b, ((vn6.e) result4).f290761a);
                                        } else {
                                            if (!(result4 instanceof f.a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            eVar9.B2();
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block26, "block");
                        ibanScreen.H = block26;
                    } else if (step17 instanceof EasyBankTransferFlowContract$Step.Iban) {
                        ibanScreen = new IbanScreen(((EasyBankTransferFlowContract$Step.Iban) step17).f72970c);
                        final int i107 = 3;
                        Function1 block27 = new Function1() { // from class: cn6.c
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                switch (i107) {
                                    case 0:
                                        r0 result = (r0) obj7;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        if (!(result instanceof r0)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        EasyBankTransferFlowContract$Step.CreateMandate createMandate = (EasyBankTransferFlowContract$Step.CreateMandate) step17;
                                        String str7 = createMandate.f72965a;
                                        String str8 = createMandate.f72966b;
                                        boolean z3 = createMandate.f72967c;
                                        com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar6 = eVar5;
                                        eVar6.n2(new com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.c(eVar6, str7, str8, z3, null), new whi.b(6));
                                        return Unit.f186387a;
                                    case 1:
                                        we6.m result2 = (we6.m) obj7;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        if (!(result2 instanceof we6.m)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        EasyBankTransferFlowContract$Step.CreateMandate createMandate2 = (EasyBankTransferFlowContract$Step.CreateMandate) step17;
                                        String str9 = createMandate2.f72965a;
                                        String str10 = createMandate2.f72966b;
                                        boolean z4 = createMandate2.f72967c;
                                        com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar7 = eVar5;
                                        eVar7.n2(new com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.c(eVar7, str9, str10, z4, null), new whi.b(6));
                                        return Unit.f186387a;
                                    case 2:
                                        com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar8 = eVar5;
                                        EasyBankTransferFlowContract$InputData easyBankTransferFlowContract$InputData2 = eVar8.o;
                                        rn6.f result3 = (rn6.f) obj7;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        if (result3 instanceof rn6.e) {
                                            EasyBankTransferFlowContract$Step.Branches branches2 = (EasyBankTransferFlowContract$Step.Branches) step17;
                                            String str11 = branches2.f72962a;
                                            String str12 = branches2.f72963b;
                                            io3.b bVar6 = branches2.f72964c;
                                            ho3.a aVar16 = ((rn6.e) result3).f255507a;
                                            eVar8.C2(new we6.u(new EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data.Branch(aVar16.f154218a, aVar16.f154219b, bVar6, easyBankTransferFlowContract$InputData2.f72959a.f115083b, str11, str12, branches2.d)));
                                            if (!easyBankTransferFlowContract$InputData2.f) {
                                                oki.h.D2(eVar8.v);
                                            }
                                        } else {
                                            if (!(result3 instanceof f.a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            eVar8.B2();
                                        }
                                        return Unit.f186387a;
                                    default:
                                        vn6.f result4 = (vn6.f) obj7;
                                        Intrinsics.checkNotNullParameter(result4, "result");
                                        boolean z6 = result4 instanceof vn6.e;
                                        com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar9 = eVar5;
                                        if (z6) {
                                            EasyBankTransferFlowContract$Step.Iban iban = (EasyBankTransferFlowContract$Step.Iban) step17;
                                            eVar9.J2(iban.f72968a, iban.f72969b, ((vn6.e) result4).f290761a);
                                        } else {
                                            if (!(result4 instanceof f.a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            eVar9.B2();
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block27, "block");
                        ibanScreen.H = block27;
                    } else {
                        if (!(step17 instanceof EasyBankTransferFlowContract$Step.InstitutionNotAvailableDialog)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        actionsBottomSheetController = new ActionsBottomSheetController(((fn6.a) eVar5.f72985p).b(((EasyBankTransferFlowContract$Step.InstitutionNotAvailableDialog) step17).f72971a, easyBankTransferFlowContract$InputData.d));
                    }
                    return ibanScreen;
                }
                if (((jte.d) eVar5.u).c(MandateApi$Toggles$VrpSetupBottomSheet.f72205c)) {
                    actionsBottomSheetController = new MandateSetupBottomSheetController(new MandateSetupBottomSheetContract$InputData(new InstitutionData.InstitutionId(((EasyBankTransferFlowContract$Step.CreateMandate) step17).f72965a), easyBankTransferFlowContract$InputData.f72959a));
                    final int i108 = 0;
                    Function1 block28 = new Function1() { // from class: cn6.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i108) {
                                case 0:
                                    r0 result = (r0) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof r0)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    EasyBankTransferFlowContract$Step.CreateMandate createMandate = (EasyBankTransferFlowContract$Step.CreateMandate) step17;
                                    String str7 = createMandate.f72965a;
                                    String str8 = createMandate.f72966b;
                                    boolean z3 = createMandate.f72967c;
                                    com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar6 = eVar5;
                                    eVar6.n2(new com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.c(eVar6, str7, str8, z3, null), new whi.b(6));
                                    return Unit.f186387a;
                                case 1:
                                    we6.m result2 = (we6.m) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof we6.m)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    EasyBankTransferFlowContract$Step.CreateMandate createMandate2 = (EasyBankTransferFlowContract$Step.CreateMandate) step17;
                                    String str9 = createMandate2.f72965a;
                                    String str10 = createMandate2.f72966b;
                                    boolean z4 = createMandate2.f72967c;
                                    com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar7 = eVar5;
                                    eVar7.n2(new com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.c(eVar7, str9, str10, z4, null), new whi.b(6));
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar8 = eVar5;
                                    EasyBankTransferFlowContract$InputData easyBankTransferFlowContract$InputData2 = eVar8.o;
                                    rn6.f result3 = (rn6.f) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof rn6.e) {
                                        EasyBankTransferFlowContract$Step.Branches branches2 = (EasyBankTransferFlowContract$Step.Branches) step17;
                                        String str11 = branches2.f72962a;
                                        String str12 = branches2.f72963b;
                                        io3.b bVar6 = branches2.f72964c;
                                        ho3.a aVar16 = ((rn6.e) result3).f255507a;
                                        eVar8.C2(new we6.u(new EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data.Branch(aVar16.f154218a, aVar16.f154219b, bVar6, easyBankTransferFlowContract$InputData2.f72959a.f115083b, str11, str12, branches2.d)));
                                        if (!easyBankTransferFlowContract$InputData2.f) {
                                            oki.h.D2(eVar8.v);
                                        }
                                    } else {
                                        if (!(result3 instanceof f.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar8.B2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    vn6.f result4 = (vn6.f) obj7;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    boolean z6 = result4 instanceof vn6.e;
                                    com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar9 = eVar5;
                                    if (z6) {
                                        EasyBankTransferFlowContract$Step.Iban iban = (EasyBankTransferFlowContract$Step.Iban) step17;
                                        eVar9.J2(iban.f72968a, iban.f72969b, ((vn6.e) result4).f290761a);
                                    } else {
                                        if (!(result4 instanceof f.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar9.B2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block28, "block");
                    actionsBottomSheetController.H = block28;
                } else {
                    final int i109 = 1;
                    actionsBottomSheetController = new CreateMandateScreen(new CreateMandateScreenContract$InputData(new InstitutionData.InstitutionId(((EasyBankTransferFlowContract$Step.CreateMandate) step17).f72965a), easyBankTransferFlowContract$InputData.f72959a, true));
                    Function1 block29 = new Function1() { // from class: cn6.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i109) {
                                case 0:
                                    r0 result = (r0) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (!(result instanceof r0)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    EasyBankTransferFlowContract$Step.CreateMandate createMandate = (EasyBankTransferFlowContract$Step.CreateMandate) step17;
                                    String str7 = createMandate.f72965a;
                                    String str8 = createMandate.f72966b;
                                    boolean z3 = createMandate.f72967c;
                                    com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar6 = eVar5;
                                    eVar6.n2(new com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.c(eVar6, str7, str8, z3, null), new whi.b(6));
                                    return Unit.f186387a;
                                case 1:
                                    we6.m result2 = (we6.m) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof we6.m)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    EasyBankTransferFlowContract$Step.CreateMandate createMandate2 = (EasyBankTransferFlowContract$Step.CreateMandate) step17;
                                    String str9 = createMandate2.f72965a;
                                    String str10 = createMandate2.f72966b;
                                    boolean z4 = createMandate2.f72967c;
                                    com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar7 = eVar5;
                                    eVar7.n2(new com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.c(eVar7, str9, str10, z4, null), new whi.b(6));
                                    return Unit.f186387a;
                                case 2:
                                    com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar8 = eVar5;
                                    EasyBankTransferFlowContract$InputData easyBankTransferFlowContract$InputData2 = eVar8.o;
                                    rn6.f result3 = (rn6.f) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof rn6.e) {
                                        EasyBankTransferFlowContract$Step.Branches branches2 = (EasyBankTransferFlowContract$Step.Branches) step17;
                                        String str11 = branches2.f72962a;
                                        String str12 = branches2.f72963b;
                                        io3.b bVar6 = branches2.f72964c;
                                        ho3.a aVar16 = ((rn6.e) result3).f255507a;
                                        eVar8.C2(new we6.u(new EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data.Branch(aVar16.f154218a, aVar16.f154219b, bVar6, easyBankTransferFlowContract$InputData2.f72959a.f115083b, str11, str12, branches2.d)));
                                        if (!easyBankTransferFlowContract$InputData2.f) {
                                            oki.h.D2(eVar8.v);
                                        }
                                    } else {
                                        if (!(result3 instanceof f.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar8.B2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    vn6.f result4 = (vn6.f) obj7;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    boolean z6 = result4 instanceof vn6.e;
                                    com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar9 = eVar5;
                                    if (z6) {
                                        EasyBankTransferFlowContract$Step.Iban iban = (EasyBankTransferFlowContract$Step.Iban) step17;
                                        eVar9.J2(iban.f72968a, iban.f72969b, ((vn6.e) result4).f290761a);
                                    } else {
                                        if (!(result4 instanceof f.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        eVar9.B2();
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block29, "block");
                    actionsBottomSheetController.H = block29;
                }
                return actionsBottomSheetController;
        }
    }
}
