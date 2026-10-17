package anc;

import android.os.Parcelable;
import android.text.method.DigitsKeyListener;
import aqd.g1;
import au6.d0;
import au6.e0;
import au6.m2;
import au6.m3;
import au6.n0;
import au6.p1;
import au6.q2;
import au6.r1;
import au6.u1;
import au6.x1;
import bq5.b0;
import bq5.l0;
import com.feature.user.details.api.navigation.UserDetailsDestination;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep;
import com.revolut.biometric_verification.impl.ui.step.nfc.reader.v2.NfcReadingController;
import com.revolut.biometric_verification.impl.ui.step.nfc.reader.v2.NfcReadyToScanController;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.cancellation.checkout.CancellationCheckoutScreenContract$ModalStep;
import com.revolut.feature.credit.card.impl.ui.cancellation.skip.SkipRepaymentConfirmationDialogScreen;
import com.revolut.feature.credit.card.impl.ui.cancellation.skip.SkipRepaymentConfirmationDialogScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.CreditCardChooseFutureInstalmentsScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.CreditCardChooseFutureInstalmentsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.details.CreditCardRepayDetailsControllerScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments.CreditCardRepayFutureInstalmentsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments.CreditCardRepayFutureInstalmentsFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.CreditCardBoletoDetailsContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.CreditCardBoletoDetailsScreen;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.flow.CreditCardRepayBoletoFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.payment_amount.CreditCardBoletoPaymentAmountContract$InputData;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.payment_amount.CreditCardBoletoPaymentAmountScreen;
import com.revolut.feature.credit.card.impl.ui.settings.flow.CreditCardSettingsFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.settings.flow.CreditCardSettingsFlowContract$Step;
import com.revolut.feature.credit.card.impl.ui.settings.screen.CreditCardSettingsScreen;
import com.revolut.feature.credit.card.impl.ui.settings.screen.CreditCardSettingsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.CreditCardSelectDueDateFlow;
import com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.CreditCardSelectDueDateFlowContract$InputData;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingInfo;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.CryptoAddBeneficiaryFlowContract$CollectedDetails;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.CryptoAddBeneficiaryFlowContract$State;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.CryptoAddBeneficiaryFlowContract$Step;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreenContract$InputData;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import com.revolut.feature.freelancer.common.models.payments.FreelancerPaymentReceipt;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.JuniorAccountDetailsFlow;
import com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.JuniorAccountDetailsFlowContract$InputData;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.JuniorAppAccessController;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.JuniorAppAccessControllerContract$InputData;
import com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.JuniorAuthQrScannerFlow;
import com.revolut.feature.junior_settings.impl.ui_kompot.qr_code_scanner.JuniorAuthQrScannerFlowContract$InputData;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyController;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyControllerContract$InputData;
import com.revolut.feature.junior_settings.impl.ui_kompot.settings.JuniorSettingsController;
import com.revolut.feature.junior_settings.impl.ui_kompot.settings.JuniorSettingsControllerContract$Input;
import com.revolut.feature.junior_settings.impl.ui_kompot.settings_flow.SettingsFlowContract$Step;
import com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.JuniorBlockInboundTransferFlowContract$Step;
import com.revolut.feature.junior_transfer.impl.ui.screen.block_transfer.JuniorBlockInboundTransferController;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.CardOwnerMainInfoScreen;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.CardOwnerMainInfoScreenContract$ModalStep;
import com.revolut.feature.robo.impl.ui.screen.edit_goal.EditGoalScreen;
import com.revolut.feature.robo.impl.ui.screen.edit_goal.EditGoalScreenContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.delete.IncomeSorterDeleteContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.delete.IncomeSorterDeleteController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsContract$ModalStep;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.disclaimer.IncomeSorterDisclaimerBottomSheetController;
import com.revolut.feature.three_ds_verification.api.ThreeDsVerificationApi$Toggles;
import com.revolut.feature.three_ds_verification.impl.ui.ThreeDsVerificationFlowContract$Step;
import com.revolut.feature.three_ds_verification.impl.ui.sceen.ThreeDsVerificationController;
import com.revolut.feature.three_ds_verification.impl.ui.sceen.ThreeDsVerificationScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.time.MonthPickerBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.oauth.impl.ui.consent.flow.ConsentFlowContract$Step;
import com.revolut.oauth.impl.ui.consent.screen.ConsentScreen;
import com.revolut.oauth.impl.ui.consent.screen.ConsentScreenContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.impl.ui.revolut_id.RevolutIDFlowContract$Step;
import com.revolut.sso.impl.ui.revolut_id.account_details.AccountDetailsScreen;
import com.revolut.sso.impl.ui.revolut_id.account_details.AccountDetailsScreenContract$InputData;
import com.revolut.sso.impl.ui.revolut_id.documents.DocumentsFlow;
import com.revolut.sso.impl.ui.revolut_id.main.RevolutIDMainScreen;
import com.revolut.trading.orders.ui.flows.investment_plan.projection.InvestmentProjectionsFlowContract$FlowStep;
import com.revolut.trading.orders.ui.invest.placement.flow.InvestOrderFlow;
import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreen;
import com.youTransactor.uCube.rpc.Constants;
import grl.k9;
import java.time.YearMonth;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vkm.j2;
import vkm.z1;
import xpl.h;
import zhm.h0;
import zp0.y;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6741b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f6740a = i;
        this.f6741b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CryptoAddressHostingInfo cryptoAddressHostingInfo;
        CryptoAddressRecipientDetails cryptoAddressRecipientDetails;
        CryptoCreateBeneficiaryScreenContract$InputData cryptoCreateBeneficiaryScreenContract$InputData;
        CryptoCreateBeneficiaryScreenContract$InputData cryptoCreateBeneficiaryScreenContract$InputData2;
        l0 l0Var;
        BaseBottomSheetController nfcReadingController;
        int i;
        int i2 = this.f6740a;
        int i3 = 9;
        final int i5 = 1;
        Continuation continuation = null;
        Object obj4 = this.f6741b;
        switch (i2) {
            case 0:
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                EditGoalScreen.Companion aVar = EditGoalScreen.INSTANCE;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field, "field");
                MaskedTextInputEditText editText = field.getEditText();
                Object obj5 = data.f51981p;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.retail.wealth.money_input.common.widgets.contribution_selection.ContributionSelectionWidgetContract.AmountParcel");
                xi0.b bVar = ((usb.a) obj5).f282862a;
                qd0.b bVarN = ((dmc.f) ((EditGoalScreen) obj4).L.getValue()).f115941b.f116031h.n();
                vc.s.j(bVarN);
                return new zp0.d(editText, bVar, new u80.d(((s80.b) bVarN).b()), null, null, false, false, 0, false, null, 1944);
            case 1:
                com.revolut.feature.robo.impl.ui.screen.edit_goal.a aVar2 = (com.revolut.feature.robo.impl.ui.screen.edit_goal.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                EditGoalScreenContract$ModalStep step = (EditGoalScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof EditGoalScreenContract$ModalStep.PickTargetDate)) {
                    throw new NoWhenBranchMatchedException();
                }
                YearMonth yearMonthFrom = YearMonth.from(((l80.f) aVar2.f85135r).e());
                MonthPickerBottomSheetController monthPickerBottomSheetController = new MonthPickerBottomSheetController(new MonthPickerBottomSheetController.InputData(new TextLocalisedClause(R$string.wealth_robo_edit_goal_month_picker_title, null, null, 14), ((EditGoalScreenContract$ModalStep.PickTargetDate) step).f85132a, yearMonthFrom.plusMonths(1L), yearMonthFrom.plusMonths(CapturePresenter.CONFIRMATION_VIEW_ANIM_DELAY)));
                an4.f block = new an4.f(aVar2, 5);
                Intrinsics.checkNotNullParameter(block, "block");
                monthPickerBottomSheetController.H = block;
                return monthPickerBottomSheetController;
            case 2:
                com.revolut.oauth.impl.ui.consent.flow.a aVar3 = (com.revolut.oauth.impl.ui.consent.flow.a) obj4;
                ConsentFlowContract$Step step2 = (ConsentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!Intrinsics.f(step2, ConsentFlowContract$Step.Consent.f98489a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ConsentScreen consentScreen = new ConsentScreen(new ConsentScreenContract$InputData(aVar3.o.f98483a));
                an4.f block2 = new an4.f(aVar3, 13);
                Intrinsics.checkNotNullParameter(block2, "block");
                consentScreen.H = block2;
                return consentScreen;
            case 3:
                com.revolut.feature.junior_settings.impl.ui_kompot.settings_flow.a aVar4 = (com.revolut.feature.junior_settings.impl.ui_kompot.settings_flow.a) obj4;
                ap8.c cVar = aVar4.o;
                yki.l FlowCoordinator = (yki.l) obj2;
                SettingsFlowContract$Step step3 = (SettingsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (Intrinsics.f(step3, SettingsFlowContract$Step.Home.f77344a)) {
                    JuniorSettingsController juniorSettingsController = new JuniorSettingsController(new JuniorSettingsControllerContract$Input(cVar.f8118a));
                    amh.j block3 = new amh.j(aVar4, FlowCoordinator, 18);
                    Intrinsics.checkNotNullParameter(block3, "block");
                    juniorSettingsController.H = block3;
                    return juniorSettingsController;
                }
                if (Intrinsics.f(step3, SettingsFlowContract$Step.SecurityAndPrivacy.f77345a)) {
                    return new JuniorSecurityAndPrivacyController(new JuniorSecurityAndPrivacyControllerContract$InputData(cVar.f8118a));
                }
                if (Intrinsics.f(step3, SettingsFlowContract$Step.AppAccess.f77342a)) {
                    JuniorAppAccessController juniorAppAccessController = new JuniorAppAccessController(new JuniorAppAccessControllerContract$InputData(cVar.f8118a));
                    a08.e block4 = new a08.e(1, aVar4, com.revolut.feature.junior_settings.impl.ui_kompot.settings_flow.a.class, "handleAppAccessResult", "handleAppAccessResult(Lcom/revolut/feature/junior_settings/impl/ui_kompot/app_access/JuniorAppAccessControllerContract$OutputData;)V", 0, 17);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    juniorAppAccessController.H = block4;
                    return juniorAppAccessController;
                }
                if (Intrinsics.f(step3, SettingsFlowContract$Step.AuthQrScanner.f77343a)) {
                    return new JuniorAuthQrScannerFlow(new JuniorAuthQrScannerFlowContract$InputData(cVar.f8118a));
                }
                if (!Intrinsics.f(step3, SettingsFlowContract$Step.AccountDetails.f77341a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String value = cVar.f8118a;
                Intrinsics.checkNotNullParameter(value, "value");
                return new JuniorAccountDetailsFlow(new JuniorAccountDetailsFlowContract$InputData(value));
            case 4:
                final com.revolut.sso.impl.ui.revolut_id.c cVar2 = (com.revolut.sso.impl.ui.revolut_id.c) obj4;
                RevolutIDFlowContract$Step step4 = (RevolutIDFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof RevolutIDFlowContract$Step.AccountDetails) {
                    RevolutIDFlowContract$Step.AccountDetails accountDetails = (RevolutIDFlowContract$Step.AccountDetails) step4;
                    return new AccountDetailsScreen(new AccountDetailsScreenContract$InputData(accountDetails.f106700a, accountDetails.f106701b, accountDetails.f106702c, cVar2.f106711p.f106698a));
                }
                if (step4 instanceof RevolutIDFlowContract$Step.Documents) {
                    return new DocumentsFlow();
                }
                if (step4 instanceof RevolutIDFlowContract$Step.DocumentsPrompt) {
                    qpl.d.Companion.getClass();
                    ViewController viewControllerE1 = cVar2.e1(new ProductArticleDescriptor(qpl.b.f248440b, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, mql.a.f208025a, null, false, 48));
                    final int i6 = 0;
                    Function1 block5 = new Function1() { // from class: apl.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    yja.b output = (yja.b) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    int i21 = d.f8198a[output.ordinal()];
                                    com.revolut.sso.impl.ui.revolut_id.c cVar3 = cVar2;
                                    if (i21 == 1 || i21 == 2) {
                                        cVar3.l2(new e(cVar3, null, 0), new yi5.b(26));
                                    } else if (i21 == 3) {
                                        Unit unit = Unit.f186387a;
                                    } else {
                                        if (i21 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState("ProductArticle config not found for revolut-id-identity-documents-intro");
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var);
                                        cVar3.l2(new e(cVar3, null, 1), new yi5.b(26));
                                    }
                                    return Unit.f186387a;
                                default:
                                    h result = (h) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof xpl.f;
                                    com.revolut.sso.impl.ui.revolut_id.c cVar4 = cVar2;
                                    if (z) {
                                        cVar4.f106714s.getClass();
                                        cVar4.C1(UserDetailsDestination.f26226a);
                                    } else if (result instanceof xpl.e) {
                                        cVar4.l2(new com.revolut.sso.impl.ui.revolut_id.a(cVar4, null), new yi5.b(26));
                                    } else if (result instanceof xpl.d) {
                                        cVar4.l2(new com.revolut.sso.impl.ui.revolut_id.b(cVar4, result, null), new yi5.b(26));
                                    } else {
                                        if (!(result instanceof xpl.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(cVar4, cVar4.v, RevolutIDFlowContract$Step.SignInAndPasscode.f106706a, true, null, false, 12);
                                        Unit unit2 = Unit.f186387a;
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block5, "block");
                    viewControllerE1.H = block5;
                    return viewControllerE1;
                }
                if (!(step4 instanceof RevolutIDFlowContract$Step.RevolutIDMain)) {
                    if (step4 instanceof RevolutIDFlowContract$Step.SignInAndPasscode) {
                        return cVar2.e1(rjd.a.f254655a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                RevolutIDMainScreen revolutIDMainScreen = new RevolutIDMainScreen();
                Function1 block6 = new Function1() { // from class: apl.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i5) {
                            case 0:
                                yja.b output = (yja.b) obj6;
                                Intrinsics.checkNotNullParameter(output, "output");
                                int i21 = d.f8198a[output.ordinal()];
                                com.revolut.sso.impl.ui.revolut_id.c cVar3 = cVar2;
                                if (i21 == 1 || i21 == 2) {
                                    cVar3.l2(new e(cVar3, null, 0), new yi5.b(26));
                                } else if (i21 == 3) {
                                    Unit unit = Unit.f186387a;
                                } else {
                                    if (i21 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState("ProductArticle config not found for revolut-id-identity-documents-intro");
                                    h0 h0Var = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var);
                                    cVar3.l2(new e(cVar3, null, 1), new yi5.b(26));
                                }
                                return Unit.f186387a;
                            default:
                                h result = (h) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean z = result instanceof xpl.f;
                                com.revolut.sso.impl.ui.revolut_id.c cVar4 = cVar2;
                                if (z) {
                                    cVar4.f106714s.getClass();
                                    cVar4.C1(UserDetailsDestination.f26226a);
                                } else if (result instanceof xpl.e) {
                                    cVar4.l2(new com.revolut.sso.impl.ui.revolut_id.a(cVar4, null), new yi5.b(26));
                                } else if (result instanceof xpl.d) {
                                    cVar4.l2(new com.revolut.sso.impl.ui.revolut_id.b(cVar4, result, null), new yi5.b(26));
                                } else {
                                    if (!(result instanceof xpl.g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(cVar4, cVar4.v, RevolutIDFlowContract$Step.SignInAndPasscode.f106706a, true, null, false, 12);
                                    Unit unit2 = Unit.f186387a;
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block6, "block");
                revolutIDMainScreen.H = block6;
                return revolutIDMainScreen;
            case 5:
                com.revolut.feature.credit.card.impl.ui.cancellation.checkout.b bVar2 = (com.revolut.feature.credit.card.impl.ui.cancellation.checkout.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CancellationCheckoutScreenContract$ModalStep step5 = (CancellationCheckoutScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (!(step5 instanceof CancellationCheckoutScreenContract$ModalStep.SkipRepayment)) {
                    throw new NoWhenBranchMatchedException();
                }
                CancellationCheckoutScreenContract$ModalStep.SkipRepayment skipRepayment = (CancellationCheckoutScreenContract$ModalStep.SkipRepayment) step5;
                SkipRepaymentConfirmationDialogScreen skipRepaymentConfirmationDialogScreen = new SkipRepaymentConfirmationDialogScreen(new SkipRepaymentConfirmationDialogScreenContract$InputData(skipRepayment.f69105a, skipRepayment.f69106b));
                an4.f block7 = new an4.f(bVar2, 21);
                Intrinsics.checkNotNullParameter(block7, "block");
                skipRepaymentConfirmationDialogScreen.H = block7;
                return skipRepaymentConfirmationDialogScreen;
            case 6:
                final com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.b bVar3 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.b) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                CryptoAddBeneficiaryFlowContract$Step step6 = (CryptoAddBeneficiaryFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof CryptoAddBeneficiaryFlowContract$Step.Restricted) {
                    PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(((ik5.g) bVar3.f71217p).b());
                    promptMarketingScreen.l2(new a2g.a(bVar3, 28));
                    return promptMarketingScreen;
                }
                if (!(step6 instanceof CryptoAddBeneficiaryFlowContract$Step.CreateBeneficiary)) {
                    if (!(step6 instanceof CryptoAddBeneficiaryFlowContract$Step.Address)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CryptoAddBeneficiaryFlowContract$CollectedDetails cryptoAddBeneficiaryFlowContract$CollectedDetails = ((CryptoAddBeneficiaryFlowContract$State) ((j2) bVar3.u.f22677a).getValue()).f71213a;
                    ViewController viewControllerE12 = bVar3.e1(new th1.a(new AddressFlowContract$InputData(null, new TextLocalisedClause(((cryptoAddBeneficiaryFlowContract$CollectedDetails == null || (cryptoAddressHostingInfo = cryptoAddBeneficiaryFlowContract$CollectedDetails.f71211b) == null || (cryptoAddressRecipientDetails = cryptoAddressHostingInfo.f71080c) == null) ? null : cryptoAddressRecipientDetails.f70985b) == wk5.i.COMPANY ? com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_sender_business_address_title : com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_sender_address_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_sender_address_subtitle_v2, null, null, 14), false, null, null, null, AnalyticsProduct.Shared.Crypto.f, false, null, 2064373), null, bVar3.f71220s, 2));
                    final int i21 = 0;
                    Function1 block8 = new Function1() { // from class: aq5.c
                        /* JADX WARN: Removed duplicated region for block: B:79:0x0211  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r23) throws java.io.IOException {
                            /*
                                Method dump skipped, instruction units count: 600
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: aq5.c.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    viewControllerE12.H = block8;
                    return viewControllerE12;
                }
                CryptoAddBeneficiaryInput cryptoAddBeneficiaryInput = bVar3.f71218q;
                if (cryptoAddBeneficiaryInput instanceof CryptoAddBeneficiaryInput.NewBeneficiary) {
                    CryptoAddBeneficiaryInput.NewBeneficiary newBeneficiary = (CryptoAddBeneficiaryInput.NewBeneficiary) cryptoAddBeneficiaryInput;
                    cryptoCreateBeneficiaryScreenContract$InputData2 = new CryptoCreateBeneficiaryScreenContract$InputData(b0.CREATION, newBeneficiary.f71122a, newBeneficiary.f71124c, null, newBeneficiary.f71123b, null, null, null, 232);
                } else if (cryptoAddBeneficiaryInput instanceof CryptoAddBeneficiaryInput.SubmitRecipientDetails) {
                    CryptoAddBeneficiaryInput.SubmitRecipientDetails submitRecipientDetails = (CryptoAddBeneficiaryInput.SubmitRecipientDetails) cryptoAddBeneficiaryInput;
                    cryptoCreateBeneficiaryScreenContract$InputData2 = new CryptoCreateBeneficiaryScreenContract$InputData(b0.SUBMIT_RECIPIENT_DETAILS, null, null, submitRecipientDetails.f71128a ? l0.MY_WALLET : l0.SOMEONE_ELSE, null, submitRecipientDetails.f71129b, null, null, Constants.TAG_EMV_L1_CHECKSUM);
                } else {
                    if (!(cryptoAddBeneficiaryInput instanceof CryptoAddBeneficiaryInput.SubmitCounterpartyDetails)) {
                        if (!(cryptoAddBeneficiaryInput instanceof CryptoAddBeneficiaryInput.EditLabel)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cryptoCreateBeneficiaryScreenContract$InputData = new CryptoCreateBeneficiaryScreenContract$InputData(b0.EDIT_LABEL, null, null, null, null, ((CryptoAddBeneficiaryInput.EditLabel) cryptoAddBeneficiaryInput).f71120a, null, null, 222);
                        CryptoCreateBeneficiaryScreen cryptoCreateBeneficiaryScreen = new CryptoCreateBeneficiaryScreen(cryptoCreateBeneficiaryScreenContract$InputData);
                        Function1 block9 = new Function1() { // from class: aq5.c
                            /* JADX WARN: Removed duplicated region for block: B:79:0x0211  */
                            @Override // kotlin.jvm.functions.Function1
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r23) throws java.io.IOException {
                                /*
                                    Method dump skipped, instruction units count: 600
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: aq5.c.invoke(java.lang.Object):java.lang.Object");
                            }
                        };
                        Intrinsics.checkNotNullParameter(block9, "block");
                        cryptoCreateBeneficiaryScreen.H = block9;
                        return cryptoCreateBeneficiaryScreen;
                    }
                    b0 b0Var = b0.SUBMIT_DEPOSITED_COUNTERPARTY_DETAILS;
                    CryptoAddBeneficiaryInput.SubmitCounterpartyDetails submitCounterpartyDetails = (CryptoAddBeneficiaryInput.SubmitCounterpartyDetails) cryptoAddBeneficiaryInput;
                    int i22 = aq5.d.f8261a[submitCounterpartyDetails.f71126b.ordinal()];
                    if (i22 == 1) {
                        l0Var = l0.MY_WALLET;
                    } else {
                        if (i22 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        l0Var = l0.SOMEONE_ELSE;
                    }
                    cryptoCreateBeneficiaryScreenContract$InputData2 = new CryptoCreateBeneficiaryScreenContract$InputData(b0Var, null, null, l0Var, null, null, submitCounterpartyDetails.f71125a, submitCounterpartyDetails.f71127c, 54);
                }
                cryptoCreateBeneficiaryScreenContract$InputData = cryptoCreateBeneficiaryScreenContract$InputData2;
                CryptoCreateBeneficiaryScreen cryptoCreateBeneficiaryScreen2 = new CryptoCreateBeneficiaryScreen(cryptoCreateBeneficiaryScreenContract$InputData);
                Function1 block92 = new Function1() { // from class: aq5.c
                    /* JADX WARN: Removed duplicated region for block: B:79:0x0211  */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r23) throws java.io.IOException {
                        /*
                            Method dump skipped, instruction units count: 600
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: aq5.c.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                Intrinsics.checkNotNullParameter(block92, "block");
                cryptoCreateBeneficiaryScreen2.H = block92;
                return cryptoCreateBeneficiaryScreen2;
            case 7:
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e eVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                IncomeSortersDetailsContract$ModalStep step7 = (IncomeSortersDetailsContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof IncomeSortersDetailsContract$ModalStep.IncomeSorterDelete) {
                    IncomeSortersDetailsContract$ModalStep.IncomeSorterDelete incomeSorterDelete = (IncomeSortersDetailsContract$ModalStep.IncomeSorterDelete) step7;
                    IncomeSorterDeleteController incomeSorterDeleteController = new IncomeSorterDeleteController(new IncomeSorterDeleteContract$InputData(incomeSorterDelete.f87746a, incomeSorterDelete.f87748c, incomeSorterDelete.d, incomeSorterDelete.f87747b));
                    g1 block10 = new g1(eVar, i5);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    incomeSorterDeleteController.H = block10;
                    return incomeSorterDeleteController;
                }
                if (!(step7 instanceof IncomeSortersDetailsContract$ModalStep.InvestDisclaimer)) {
                    throw new NoWhenBranchMatchedException();
                }
                IncomeSorterDisclaimerBottomSheetController incomeSorterDisclaimerBottomSheetController = new IncomeSorterDisclaimerBottomSheetController(new eqd.c(new GlyphImage(R$drawable.uikit_icn_24_invest, null, null, 6), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_details_sort_to_empty_investing_titile, null, null, 14), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_details_sort_to_empty_investing_action, null, null, 14), rdh.b.INCOME_SORTER_START_INVESTING_DISCLAIMER));
                amh.j block11 = new amh.j(eVar, (IncomeSortersDetailsContract$ModalStep.InvestDisclaimer) step7, 22);
                Intrinsics.checkNotNullParameter(block11, "block");
                incomeSorterDisclaimerBottomSheetController.H = block11;
                return incomeSorterDisclaimerBottomSheetController;
            case 8:
                com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a aVar5 = (com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a) obj4;
                JuniorBlockInboundTransferFlowContract$Step step8 = (JuniorBlockInboundTransferFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (!(step8 instanceof JuniorBlockInboundTransferFlowContract$Step.Block)) {
                    throw new NoWhenBranchMatchedException();
                }
                ar8.c cVar3 = aVar5.o;
                JuniorBlockInboundTransferController juniorBlockInboundTransferController = new JuniorBlockInboundTransferController(new gr8.b(cVar3.f8527a, cVar3.f8528b));
                a08.e block12 = new a08.e(1, aVar5, com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a.class, "handleOutputResult", "handleOutputResult(Lcom/revolut/feature/junior_transfer/impl/ui/screen/block_transfer/JuniorBlockInboundTransferControllerContract$OutputData;)V", 0, 21);
                Intrinsics.checkNotNullParameter(block12, "block");
                juniorBlockInboundTransferController.H = block12;
                return juniorBlockInboundTransferController;
            case 9:
                InputTextDelegate.Model input = (InputTextDelegate.Model) obj2;
                InputText field2 = (InputText) obj3;
                KProperty[] kPropertyArr = CardOwnerMainInfoScreen.U;
                Intrinsics.checkNotNullParameter(input, "model");
                Intrinsics.checkNotNullParameter(field2, "field");
                gra.b bVar4 = (gra.b) ((jqa.k) ((CardOwnerMainInfoScreen) obj4).Q.getValue()).b();
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(field2, "field");
                if (Intrinsics.f(input.f52580a, "FIELD_CARD_NUMBER")) {
                    return new y(field2.getInnerEditText(), null, "[0000] [0000] [0000] [0999] [999]", bVar4.f145956b, input.f52580a, DigitsKeyListener.getInstance("1234567890 "), false, 66);
                }
                return null;
            case 10:
                com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a aVar6 = (com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CardOwnerMainInfoScreenContract$ModalStep step9 = (CardOwnerMainInfoScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!Intrinsics.f(step9, CardOwnerMainInfoScreenContract$ModalStep.CardSchemeInfo.f81578a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar6.u.getClass();
                lw0.a aVar7 = new lw0.a(new TextLocalisedClause(com.revolut.feature.trust_common.R$string.topup_shared_header_processing_trust_subtitle_default, null, null, 14), null, null, null, false, 30);
                RowDelegate.Model.c cVar4 = null;
                Object obj6 = null;
                boolean z = false;
                boolean z3 = false;
                List listK = zhm.v.k(new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.trust_common.R$string.topup_shared_header_processing_trust_data_security_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.trust_common.R$string.topup_shared_header_processing_trust_data_security_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), false, false, cVar4, obj6, 488), new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.trust_common.R$string.topup_shared_header_processing_trust_trusted_card_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.trust_common.R$string.topup_shared_header_processing_trust_trusted_card_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, 6), false, false, cVar4, obj6, 488));
                k9 k9Var = k9.Payments;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new RowActionsBottomSheetController(new eii.c(aVar7, null, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null));
            case 11:
                List value2 = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(value2, "value");
                ((are.b) obj4).f8691b.f("TEEN_PROFILE_CACHE_KEY", value2);
                return Unit.f186387a;
            case 12:
                com.revolut.feature.three_ds_verification.impl.ui.a aVar8 = (com.revolut.feature.three_ds_verification.impl.ui.a) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                ThreeDsVerificationFlowContract$Step step10 = (ThreeDsVerificationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!(step10 instanceof ThreeDsVerificationFlowContract$Step.ThreeDsConfirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                ThreeDsVerificationController threeDsVerificationController = new ThreeDsVerificationController(new ThreeDsVerificationScreenContract$InputData(((ThreeDsVerificationFlowContract$Step.ThreeDsConfirmation) step10).f90396a, ((jte.d) aVar8.o).c(ThreeDsVerificationApi$Toggles.ThreeDsVerificationRedesign.f90392c)));
                as9.a block13 = new as9.a(aVar8, FlowCoordinator2, 2);
                Intrinsics.checkNotNullParameter(block13, "block");
                threeDsVerificationController.H = block13;
                return threeDsVerificationController;
            case 13:
                com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments.a aVar9 = (com.revolut.feature.credit.card.impl.ui.instalment.repay.future_instalments.a) obj4;
                CreditCardRepayFutureInstalmentsFlowContract$InputData creditCardRepayFutureInstalmentsFlowContract$InputData = aVar9.o;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                CreditCardRepayFutureInstalmentsFlowContract$Step step11 = (CreditCardRepayFutureInstalmentsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof CreditCardRepayFutureInstalmentsFlowContract$Step.ChooseFutureInstalments) {
                    CreditCardChooseFutureInstalmentsScreen creditCardChooseFutureInstalmentsScreen = new CreditCardChooseFutureInstalmentsScreen(new CreditCardChooseFutureInstalmentsScreenContract$InputData(creditCardRepayFutureInstalmentsFlowContract$InputData.f69503a, creditCardRepayFutureInstalmentsFlowContract$InputData.f69504b, creditCardRepayFutureInstalmentsFlowContract$InputData.f69505c));
                    as9.a block14 = new as9.a(aVar9, FlowCoordinator3, 3);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    creditCardChooseFutureInstalmentsScreen.H = block14;
                    return creditCardChooseFutureInstalmentsScreen;
                }
                if (!(step11 instanceof CreditCardRepayFutureInstalmentsFlowContract$Step.PaymentDetails)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditCardRepayFutureInstalmentsFlowContract$Step.PaymentDetails paymentDetails = (CreditCardRepayFutureInstalmentsFlowContract$Step.PaymentDetails) step11;
                CreditCardRepayDetailsControllerScreen creditCardRepayDetailsControllerScreen = new CreditCardRepayDetailsControllerScreen(new CreditCardRepayDetailsControllerScreenContract$InputData(creditCardRepayFutureInstalmentsFlowContract$InputData.f69503a, creditCardRepayFutureInstalmentsFlowContract$InputData.f69504b, new CreditCardRepayDetailsControllerScreenContract$InputData.RepayDetails.FutureInstalments(paymentDetails.f69507a, paymentDetails.f69508b, paymentDetails.f69509c), creditCardRepayFutureInstalmentsFlowContract$InputData.f69505c));
                ar1.c block15 = new ar1.c(aVar9, i3);
                Intrinsics.checkNotNullParameter(block15, "block");
                creditCardRepayDetailsControllerScreen.H = block15;
                return creditCardRepayDetailsControllerScreen;
            case 14:
                com.revolut.trading.orders.ui.flows.investment_plan.projection.a aVar10 = (com.revolut.trading.orders.ui.flows.investment_plan.projection.a) obj4;
                yki.l FlowCoordinator4 = (yki.l) obj2;
                InvestmentProjectionsFlowContract$FlowStep step12 = (InvestmentProjectionsFlowContract$FlowStep) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof InvestmentProjectionsFlowContract$FlowStep.Projections) {
                    InvestmentProjectionsScreen investmentProjectionsScreen = new InvestmentProjectionsScreen(((InvestmentProjectionsFlowContract$FlowStep.Projections) step12).f106820a);
                    as9.a block16 = new as9.a(aVar10, FlowCoordinator4, 6);
                    Intrinsics.checkNotNullParameter(block16, "block");
                    investmentProjectionsScreen.H = block16;
                    return investmentProjectionsScreen;
                }
                if (!(step12 instanceof InvestmentProjectionsFlowContract$FlowStep.InvestOrderFlow)) {
                    throw new NoWhenBranchMatchedException();
                }
                InvestOrderFlow investOrderFlow = new InvestOrderFlow(((InvestmentProjectionsFlowContract$FlowStep.InvestOrderFlow) step12).f106819a);
                ar1.c block17 = new ar1.c(aVar10, 12);
                Intrinsics.checkNotNullParameter(block17, "block");
                investOrderFlow.H = block17;
                return investOrderFlow;
            case 15:
                com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a aVar11 = (com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a) obj4;
                hu.c cVar5 = aVar11.f50636s;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep step13 = (BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (Intrinsics.f(step13, BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep.ReadyToScan.f50632a)) {
                    z1 tagDetectedSignal = aVar11.z;
                    cVar5.getClass();
                    Intrinsics.checkNotNullParameter(tagDetectedSignal, "tagDetectedSignal");
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_nfc_dialog_title, null, null, 14);
                    int i32 = hu.b.f155470a[cVar5.f155471a.ordinal()];
                    if (i32 == 1) {
                        i = com.revolut.camerakit.revolut.ui.R$string.vision_nfc_intro_passport_description;
                    } else if (i32 == 2) {
                        i = com.revolut.camerakit.revolut.ui.R$string.vision_nfc_intro_identity_card_description;
                    } else {
                        if (i32 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = com.revolut.camerakit.revolut.ui.R$string.vision_nfc_intro_residence_permit_description;
                    }
                    nfcReadingController = new NfcReadyToScanController(new lw0.a(textLocalisedClause, new TextLocalisedClause(i, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_contactless, null, null, 6)), null, false, 24), hu.c.a(), tagDetectedSignal);
                    a08.e block18 = new a08.e(1, aVar11, com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a.class, "handleReadyToScanResult", "handleReadyToScanResult(Lcom/revolut/biometric_verification/impl/ui/step/nfc/reader/v2/NfcReadyToScanController$Result;)V", 0, 24);
                    Intrinsics.checkNotNullParameter(block18, "block");
                    nfcReadingController.H = block18;
                } else {
                    if (!(step13 instanceof BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep.Reading)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    short s2 = ((BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep.Reading) step13).f50631a;
                    z1 readingDoneSignal = aVar11.A;
                    cVar5.getClass();
                    Intrinsics.checkNotNullParameter(readingDoneSignal, "readingDoneSignal");
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.camerakit.revolut.ui.R$string.vision_nfc_dialog_title, null, null, 14);
                    int i33 = com.revolut.camerakit.revolut.ui.R$string.vision_nfc_dialog_reading;
                    String str = (String) hu.a.f155469a.get(Short.valueOf(s2));
                    if (str == null) {
                        str = "";
                    }
                    nfcReadingController = new NfcReadingController(new lw0.a(textLocalisedClause2, new TextLocalisedClause(i33, zhm.u.c(str), null, 12), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_contactless, null, null, 6)), null, false, 24), hu.c.a(), readingDoneSignal);
                    a08.e block19 = new a08.e(1, aVar11, com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.a.class, "handleReadingResult", "handleReadingResult(Lcom/revolut/biometric_verification/impl/ui/step/nfc/reader/v2/NfcReadingController$Result;)V", 0, 25);
                    Intrinsics.checkNotNullParameter(block19, "block");
                    nfcReadingController.H = block19;
                }
                return nfcReadingController;
            case 16:
                com.revolut.feature.credit.card.impl.ui.repay.boleto.flow.a aVar12 = (com.revolut.feature.credit.card.impl.ui.repay.boleto.flow.a) obj4;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                CreditCardRepayBoletoFlowContract$Step step14 = (CreditCardRepayBoletoFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (step14 instanceof CreditCardRepayBoletoFlowContract$Step.CreateBoleto) {
                    CreditCardBoletoPaymentAmountScreen creditCardBoletoPaymentAmountScreen = new CreditCardBoletoPaymentAmountScreen(new CreditCardBoletoPaymentAmountContract$InputData(((CreditCardRepayBoletoFlowContract$Step.CreateBoleto) step14).f69558a));
                    a31.m block20 = new a31.m(aVar12, 24, LazyFlowCoordinator3, step14);
                    Intrinsics.checkNotNullParameter(block20, "block");
                    creditCardBoletoPaymentAmountScreen.H = block20;
                    return creditCardBoletoPaymentAmountScreen;
                }
                if (!(step14 instanceof CreditCardRepayBoletoFlowContract$Step.BoletoDetails)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditCardRepayBoletoFlowContract$Step.BoletoDetails boletoDetails = (CreditCardRepayBoletoFlowContract$Step.BoletoDetails) step14;
                CreditCardBoletoDetailsScreen creditCardBoletoDetailsScreen = new CreditCardBoletoDetailsScreen(new CreditCardBoletoDetailsContract$InputData(aVar12.o.getF69553a(), boletoDetails.f69556b, boletoDetails.f69557c));
                creditCardBoletoDetailsScreen.l2(new at4.b(step14, aVar12, LazyFlowCoordinator3));
                ar1.c block21 = new ar1.c(aVar12, 17);
                Intrinsics.checkNotNullParameter(block21, "block");
                creditCardBoletoDetailsScreen.H = block21;
                return creditCardBoletoDetailsScreen;
            case 17:
                FreelancerAccountOnboardingState accountOnboardingState = (FreelancerAccountOnboardingState) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(accountOnboardingState, "accountOnboardingState");
                ((au6.f) obj4).f9524b.f("CACHE_KEY_ACCOUNT_DETAILS", accountOnboardingState);
                return Unit.f186387a;
            case 18:
                pr6.q response = (pr6.q) obj3;
                Intrinsics.checkNotNullParameter((AcquiringPaymentsQuery) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(response, "response");
                ((d0) obj4).e(response);
                return Unit.f186387a;
            case 19:
                w4l.f DataObservableDelegate = (w4l.f) obj2;
                Unit it8 = (Unit) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(it8, "it");
                return te0.w.o0(kotlin.coroutines.g.f186406a, new akb.s((e0) obj4, continuation, 19));
            case 20:
                List settings = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(settings, "settings");
                ((n0) obj4).f9577b.f("CACHE_KEY_CURRENCY_SETTINGS", settings);
                return Unit.f186387a;
            case 21:
                ur6.b topic = (ur6.b) obj2;
                List lessons = (List) obj3;
                Intrinsics.checkNotNullParameter(topic, "topic");
                Intrinsics.checkNotNullParameter(lessons, "lessons");
                ((p1) obj4).f9596b.f(p1.a(topic), lessons);
                return Unit.f186387a;
            case 22:
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(list, "list");
                ((r1) obj4).f9609c.f("CACHE_KEY_BUSINESS_CATEGORIES_V2", list);
                return Unit.f186387a;
            case 23:
                String paymentId = (String) obj2;
                FreelancerPaymentReceipt receipt = (FreelancerPaymentReceipt) obj3;
                Intrinsics.checkNotNullParameter(paymentId, "paymentId");
                Intrinsics.checkNotNullParameter(receipt, "receipt");
                ((u1) obj4).f9630b.f("MEMORY_CACHE_KEY_RECEIPT_" + paymentId, receipt);
                return Unit.f186387a;
            case 24:
                zr6.a domain = (zr6.a) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((x1) obj4).f9657b.f("CACHE_KEY_FREELANCER_PRICING_PLAN", domain);
                return Unit.f186387a;
            case 25:
                ir6.c type = (ir6.c) obj2;
                String domain2 = (String) obj3;
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(domain2, "domain");
                ((au6.z1) obj4).f9674a.f(type.getId(), domain2);
                return Unit.f186387a;
            case 26:
                Boolean bool = (Boolean) obj3;
                bool.booleanValue();
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                ((m2) obj4).f9571b.f("CACHE_KEY_TRADING_NAME_ENABLED", bool);
                return Unit.f186387a;
            case 27:
                lr6.w domain3 = (lr6.w) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain3, "domain");
                ((q2) obj4).f9603b.f("CACHE_KEY_SETTLEMENT_SETTINGS", domain3);
                return Unit.f186387a;
            case 28:
                List taxPockets = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(taxPockets, "taxPockets");
                ((m3) obj4).f9574b.f("MEMORY_CACHE_KEY_TAX_POCKETS", taxPockets);
                return Unit.f186387a;
            default:
                com.revolut.feature.credit.card.impl.ui.settings.flow.a aVar13 = (com.revolut.feature.credit.card.impl.ui.settings.flow.a) obj4;
                CreditCardSettingsFlowContract$InputData creditCardSettingsFlowContract$InputData = aVar13.o;
                yki.l FlowCoordinator5 = (yki.l) obj2;
                CreditCardSettingsFlowContract$Step step15 = (CreditCardSettingsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (!(step15 instanceof CreditCardSettingsFlowContract$Step.Settings)) {
                    if (step15 instanceof CreditCardSettingsFlowContract$Step.SelectDueDate) {
                        return new CreditCardSelectDueDateFlow(new CreditCardSelectDueDateFlowContract$InputData(creditCardSettingsFlowContract$InputData.f69633a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                CreditCardSettingsScreen creditCardSettingsScreen = new CreditCardSettingsScreen(new CreditCardSettingsScreenContract$InputData(creditCardSettingsFlowContract$InputData.f69633a));
                as9.a block22 = new as9.a(aVar13, FlowCoordinator5, i3);
                Intrinsics.checkNotNullParameter(block22, "block");
                creditCardSettingsScreen.H = block22;
                return creditCardSettingsScreen;
        }
    }
}
