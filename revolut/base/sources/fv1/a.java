package fv1;

import android.os.Parcelable;
import android.text.method.DigitsKeyListener;
import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import aw0.n6;
import aw0.o9;
import bfl.g;
import cli.y;
import cn3.b;
import cn3.e;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import com.revolut.feature.card.verification.impl.flow.card_penny_topup.CardPennyTopUpFlowContract$InputData;
import com.revolut.feature.card.verification.impl.flow.card_penny_topup.CardPennyTopUpFlowContract$Step;
import com.revolut.feature.card.verification.impl.screen.penny_topup_info.CardPennyTopUpInfoScreen;
import com.revolut.feature.card_management.api.cardagreements.CardIssuanceAgreementControllerContract$InputData;
import com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.DisposableCardSettingsContract$ModalStep;
import com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig;
import com.revolut.feature.contacts_chooser.api.models.ContactsFilter;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType$DeviceContact$Phone;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserBannerContent;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserEmptyState;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserInputData;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserMode;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsPrimaryButtonClause;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.CardOrderingFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.LegacyConsentPreferencesFlow;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.LegacyConsentPreferencesFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.ConsentsFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.ConsentsFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.DocumentsContentContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.content.DocumentsContentScreen;
import com.revolut.feature.credit.card.impl.ui.statement_financing.down_payment.CreditCardDownPaymentScreen;
import com.revolut.feature.credit.direct.debit.new_account.DirectDebitNewAccountScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.FreelancerAcquiringPaymentFiltersScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.FreelancerAcquiringPaymentFiltersScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.FreelancerAcquiringPaymentListScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.dialog.date_picker.FreelancerDatePickerScreen;
import com.revolut.feature.freelancer.impl.ui.dialog.date_picker.FreelancerDatePickerScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreen;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreenContract$SingleChoiceItem;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoiceDateOption;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentSchedule;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentScheduleScreenContract$ScheduleTab;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentScheduleScreenContract$Step;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.flow.InvoiceTemplatesFlow;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.flow.InvoiceTemplatesFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.override.InvoiceTemplateOverrideScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.profile.email_flow.FreelancerEmailFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.profile.email_flow.check_email.FreelancerCheckEmailScreen;
import com.revolut.feature.freelancer.impl.ui.profile.email_flow.check_email.FreelancerCheckEmailScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.profile.email_flow.edit_email.FreelancerEmailScreen;
import com.revolut.feature.freelancer.impl.ui.profile.email_flow.edit_email.FreelancerEmailScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.TaxHubScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.dialog.accounting_period.FreelancerVatReminderAccountingPeriodPickerScreen;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.dialog.accounting_period.FreelancerVatReminderAccountingPeriodPickerScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.dialog.assessment_period.FreelancerVatReminderAssessmentPeriodPickerScreen;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.dialog.assessment_period.FreelancerVatReminderAssessmentPeriodPickerScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.FreelancerVatReminderSettingsScreenContract$ModalStep;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.kyc.impl.egov_kyc.flow.EgovKycFlowContract$InputData;
import com.revolut.feature.kyc.impl.egov_kyc.flow.EgovKycFlowContract$Step;
import com.revolut.feature.kyc.impl.egov_kyc.screen.EgovKycScreen;
import com.revolut.feature.kyc.impl.egov_kyc.screen.EgovKycScreenContract$InputData;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.payments_migration.api.navigation.PaymentsMigrationDestination;
import com.revolut.feature.payments_migration.impl.models.PaymentsMigrationProductArticleKey;
import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.MigrateSubscriptionsControllerContract$ModalStep;
import com.revolut.feature.payments_migration.impl.ui.screen.no_cards.NoCardsController;
import com.revolut.feature.payments_migration.impl.ui.screen.payment_selection.PaymentSelectionContract$InputData;
import com.revolut.feature.payments_migration.impl.ui.screen.payment_selection.PaymentSelectionController;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.retail.cfd.api.domain.models.CfdExposureBreakdownTarget;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuoteParams;
import com.revolut.feature.retail.cfd.impl.screens.margin.CfdMarginBreakdownController;
import com.revolut.feature.retail.cfd.impl.screens.margin.CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType;
import com.revolut.feature.retail.cfd.impl.screens.positions.CfdPositionsControllerContract$Modal;
import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreen;
import com.revolut.feature.security_hub.impl.interactor.FeatureItem;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$Step;
import com.revolut.feature.semi_independent_onboarding.api.model.GuardianInvitationResult;
import com.revolut.feature.semi_independent_onboarding.impl.R$string;
import com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.SemiIndependentOnboardingInvitationFlowContract$Step;
import com.revolut.feature.shared.invoices.api.ui.contract.InvoiceLanguageSelectorContract$InputData;
import com.revolut.feature.shared_separate_favourites.api.combined_watchlist.SelectAssetsDescriptor;
import com.revolut.feature.shared_separate_favourites.api.combined_watchlist.SelectAssetsInputData;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note.AboutNoteScreenContract$ModalStep;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note_glossary.AboutNoteGlossaryScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note_glossary.AboutNoteGlossaryScreenContract$InputData;
import com.revolut.feature.topup_screen.api.descriptor.CardTopUpType;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.flows.cvv.screen.CvvScreen;
import com.revolut.feature.topup_screen.impl.flows.cvv.screen.CvvScreenContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.ThreeDsScreen;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.card.CardTopupFlowContract$Step;
import com.revolut.feature.topup_screen.impl.mcy.McyBankProductArticleKey;
import com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$Step;
import com.revolut.feature.topup_screen.impl.mcy.account_verification.McyTopupAccountVerificationScreen;
import com.revolut.feature.topup_screen.impl.mcy.account_verification.McyTopupAccountVerificationScreenContract$InputData;
import com.revolut.feature.topup_screen.impl.mcy.india_topup_declaration.IndiaTopupDeclarationScreen;
import com.revolut.feature.topup_screen.impl.mcy.india_topup_select_country.IndiaTopupSelectCountryScreen;
import com.revolut.feature.topup_screen.impl.mcy.mcy_exchange_rate.McyExchangeRateScreen;
import com.revolut.feature.topup_screen.impl.mcy.mcy_exchange_rate.McyExchangeRateScreenContract$InputData;
import com.revolut.feature.wallets.api.module.WalletLimit;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.WealthAllNewsContract$ModalStep;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import d67.s;
import f2i.x;
import fjd.g0;
import fo1.b0;
import g0f.f;
import g3b.k;
import g48.j;
import g4b.n;
import g57.p;
import grl.k9;
import ip0.v7;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.text.a0;
import od0.i;
import oki.h;
import r10.r;
import til.m;
import til.o;
import til.q;
import vkm.j2;
import yki.l;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f138306b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f138305a = i;
        this.f138306b = obj2;
    }

    private final Object a(Object obj2, Object obj3) {
        final com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.a aVar = (com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.a) this.f138306b;
        i1d.a aVar2 = aVar.f86000r;
        l FlowCoordinator = (l) obj2;
        SemiIndependentOnboardingInvitationFlowContract$Step step = (SemiIndependentOnboardingInvitationFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        final int i = 1;
        if (step instanceof SemiIndependentOnboardingInvitationFlowContract$Step.AddParentStartingPrompt) {
            aVar2.getClass();
            PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.send_guardian_invitation_prompt_new_user_title, null, null, 14), new TextLocalisedClause(R$string.send_guardian_invitation_prompt_new_user_subtitle, u.c(18), null, 12), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D194", null, null, null, 30), null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.send_guardian_invitation_prompt_new_user_action_continue, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368));
            Function1 block = new Function1() { // from class: g1d.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            cn3.b result = (cn3.b) obj4;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean zF = Intrinsics.f(result, b.a.f25343a);
                            com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.a aVar3 = aVar;
                            if (zF) {
                                aVar3.I2();
                            } else {
                                if (!(result instanceof cn3.c)) {
                                    if (result instanceof cn3.d) {
                                        throw new UnsupportedOperationException("Group selection is not supported");
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.l2(new g0(aVar3, ((e) d0.K0(((cn3.c) result).f25344a)).f25347a, null, 29), new yi5.b(26));
                            }
                            return Unit.f186387a;
                        default:
                            d67.u output = (d67.u) obj4;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean zF2 = Intrinsics.f(output, s.f111464a);
                            com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.a aVar4 = aVar;
                            if (zF2) {
                                h.t2(aVar4, aVar4.f86001s, SemiIndependentOnboardingInvitationFlowContract$Step.ContactChooser.f85996a, false, null, false, 14);
                            } else {
                                aVar4.I2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            promptMarketingScreen.H = block;
            return promptMarketingScreen;
        }
        if (!(step instanceof SemiIndependentOnboardingInvitationFlowContract$Step.ContactChooser)) {
            if (!(step instanceof SemiIndependentOnboardingInvitationFlowContract$Step.ParentInvitationToCreateRevolutAccount)) {
                throw new NoWhenBranchMatchedException();
            }
            GuardianInvitationResult.NotExistingUser notExistingUser = ((SemiIndependentOnboardingInvitationFlowContract$Step.ParentInvitationToCreateRevolutAccount) step).f85997a;
            aVar2.getClass();
            PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(i1d.a.a());
            f block2 = new f(aVar, notExistingUser, 4);
            Intrinsics.checkNotNullParameter(block2, "block");
            promptMarketingScreen2.H = block2;
            return promptMarketingScreen2;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.guardian_invitation_contact_picker_header_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.guardian_invitation_contact_picker_search_hint, null, null, 14);
        final int i2 = 0;
        List listK = v.k(ContactType.RevolutContact.Local.f66038a, ContactType$DeviceContact$Phone.f66036a);
        k9 k9Var = k9.Teen;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ViewController viewControllerE1 = aVar.e1(new cn3.a(new ContactsChooserInputData((Clause) textLocalisedClause, (Clause) textLocalisedClause2, listK, (List) null, (ContactsChooserMode) ContactsChooserMode.SingleSelect.f66078a, false, false, false, false, (ContactsFilter) null, (ContactsChooserBannerContent) null, (ContactsChooserEmptyState) null, (AnalyticsProduct) com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), (Clause) new TextLocalisedClause(R$string.guardian_invitation_contact_picker_header_subtitle, u.c(18), null, 12), (Set) null, (ContactsPrimaryButtonClause) null, (cn3.h) null, 0, (Set) null, 1036264)));
        Function1 block3 = new Function1() { // from class: g1d.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                switch (i2) {
                    case 0:
                        cn3.b result = (cn3.b) obj4;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean zF = Intrinsics.f(result, b.a.f25343a);
                        com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.a aVar3 = aVar;
                        if (zF) {
                            aVar3.I2();
                        } else {
                            if (!(result instanceof cn3.c)) {
                                if (result instanceof cn3.d) {
                                    throw new UnsupportedOperationException("Group selection is not supported");
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar3.l2(new g0(aVar3, ((e) d0.K0(((cn3.c) result).f25344a)).f25347a, null, 29), new yi5.b(26));
                        }
                        return Unit.f186387a;
                    default:
                        d67.u output = (d67.u) obj4;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean zF2 = Intrinsics.f(output, s.f111464a);
                        com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.a aVar4 = aVar;
                        if (zF2) {
                            h.t2(aVar4, aVar4.f86001s, SemiIndependentOnboardingInvitationFlowContract$Step.ContactChooser.f85996a, false, null, false, 14);
                        } else {
                            aVar4.I2();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block3, "block");
        viewControllerE1.H = block3;
        return viewControllerE1;
    }

    private final Object b(Object obj2, Object obj3) {
        com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e eVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e) this.f138306b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        TaxHubScreenContract$ModalStep step = (TaxHubScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, TaxHubScreenContract$ModalStep.TaxCalendarDisclaimer.f74284a)) {
            throw new NoWhenBranchMatchedException();
        }
        eVar.o.getClass();
        lw0.a aVar = new lw0.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_calendar_disclaimer_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_calendar_disclaimer_subtitle, null, null, 14), null, null, false, 28);
        aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_hub_calendar_disclaimer_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Freelancer;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }

    private final Object c(Object obj2, Object obj3) {
        k kVar = (k) this.f138306b;
        MarginQuoteParams params = (MarginQuoteParams) obj2;
        MarginQuote marginQuote = (MarginQuote) obj3;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(marginQuote, "marginQuote");
        kVar.f140260b.f(k.a(params), marginQuote);
        return Unit.f186387a;
    }

    private final Object d(Object obj2, Object obj3) {
        com.revolut.feature.retail.cfd.impl.screens.positions.a aVar = (com.revolut.feature.retail.cfd.impl.screens.positions.a) this.f138306b;
        n nVar = aVar.f82267q;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        CfdPositionsControllerContract$Modal it8 = (CfdPositionsControllerContract$Modal) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(it8, "it");
        if (it8 instanceof CfdPositionsControllerContract$Modal.OrderReview) {
            CfdOrderReviewScreen cfdOrderReviewScreen = new CfdOrderReviewScreen(((CfdPositionsControllerContract$Modal.OrderReview) it8).f82264a);
            g1.b bVar = new g1.b(aVar, 29);
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            cfdOrderReviewScreen.H = bVar;
            return cfdOrderReviewScreen;
        }
        if (it8 instanceof CfdPositionsControllerContract$Modal.TradingHours) {
            return aVar.e1(new uwk.b(((CfdPositionsControllerContract$Modal.TradingHours) it8).f82265a));
        }
        if (it8 instanceof CfdPositionsControllerContract$Modal.ExposureBreakdown) {
            String str = nVar.f140452a;
            CfdPositionsControllerContract$Modal.ExposureBreakdown exposureBreakdown = (CfdPositionsControllerContract$Modal.ExposureBreakdown) it8;
            BigDecimal bigDecimal = exposureBreakdown.f82258b;
            g gVar = exposureBreakdown.f82257a;
            String str2 = nVar.f140453b;
            String str3 = exposureBreakdown.f82259c;
            return aVar.e1(new a2b.a(str, bigDecimal, gVar, str2, str3 != null ? new CfdExposureBreakdownTarget.Position(str3) : CfdExposureBreakdownTarget.PositionsGroup.f82102a));
        }
        if (it8 instanceof CfdPositionsControllerContract$Modal.MarginBreakdown) {
            String str4 = nVar.f140452a;
            CfdPositionsControllerContract$Modal.MarginBreakdown marginBreakdown = (CfdPositionsControllerContract$Modal.MarginBreakdown) it8;
            String str5 = marginBreakdown.f82260a;
            return new CfdMarginBreakdownController(new w3b.e(str4, str5 != null ? new w3b.g(str5) : w3b.h.f294263a, nVar.f140453b, marginBreakdown.f82261b, marginBreakdown.f82262c, CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType.Market.f82225a));
        }
        if (!Intrinsics.f(it8, CfdPositionsControllerContract$Modal.MarketClosed.f82263a)) {
            throw new NoWhenBranchMatchedException();
        }
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_cfds_market_closed_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_cfds_market_closed_description, null, null, 14), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }

    private final Object e(Object obj2, Object obj3) {
        com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a aVar = (com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.screen.a) this.f138306b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        FreelancerVatReminderSettingsScreenContract$ModalStep step = (FreelancerVatReminderSettingsScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof FreelancerVatReminderSettingsScreenContract$ModalStep.AccountingPeriod) {
            FreelancerVatReminderAccountingPeriodPickerScreen freelancerVatReminderAccountingPeriodPickerScreen = new FreelancerVatReminderAccountingPeriodPickerScreen(new FreelancerVatReminderAccountingPeriodPickerScreenContract$InputData(((FreelancerVatReminderSettingsScreenContract$ModalStep.AccountingPeriod) step).f74440a));
            p block = new p(aVar, 1);
            Intrinsics.checkNotNullParameter(block, "block");
            freelancerVatReminderAccountingPeriodPickerScreen.H = block;
            return freelancerVatReminderAccountingPeriodPickerScreen;
        }
        if (!(step instanceof FreelancerVatReminderSettingsScreenContract$ModalStep.AssessmentPeriod)) {
            throw new NoWhenBranchMatchedException();
        }
        FreelancerVatReminderSettingsScreenContract$ModalStep.AssessmentPeriod assessmentPeriod = (FreelancerVatReminderSettingsScreenContract$ModalStep.AssessmentPeriod) step;
        FreelancerVatReminderAssessmentPeriodPickerScreen freelancerVatReminderAssessmentPeriodPickerScreen = new FreelancerVatReminderAssessmentPeriodPickerScreen(new FreelancerVatReminderAssessmentPeriodPickerScreenContract$InputData(assessmentPeriod.f74441a, assessmentPeriod.f74442b));
        p block2 = new p(aVar, 2);
        Intrinsics.checkNotNullParameter(block2, "block");
        freelancerVatReminderAssessmentPeriodPickerScreen.H = block2;
        return freelancerVatReminderAssessmentPeriodPickerScreen;
    }

    private final Object g(Object obj2, Object obj3) {
        com.revolut.feature.structured_note.details.impl.ui.screens.about_note.a aVar = (com.revolut.feature.structured_note.details.impl.ui.screens.about_note.a) this.f138306b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        AboutNoteScreenContract$ModalStep step = (AboutNoteScreenContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof AboutNoteScreenContract$ModalStep.Glossary) {
            return new AboutNoteGlossaryScreen(new AboutNoteGlossaryScreenContract$InputData(aVar.o.f88880a, ((AboutNoteScreenContract$ModalStep.Glossary) step).f88881a));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object h(Object obj2, Object obj3) {
        com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a) this.f138306b;
        yki.b LazyFlowCoordinator = (yki.b) obj2;
        CardOrderingFlowContract$Step step = (CardOrderingFlowContract$Step) obj3;
        Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        Continuation continuation = null;
        if (step instanceof CardOrderingFlowContract$Step.Ordered) {
            aVar.l2(new g64.f(aVar, continuation, 3), new g64.c(0));
            return aVar.T2(step);
        }
        if (step instanceof CardOrderingFlowContract$Step.VirtualCardOrdering) {
            aVar.A = aVar.n2(new af3.f((Object) aVar, false, continuation, 16), new whi.b(6));
            return aVar.T2(step);
        }
        if (step instanceof CardOrderingFlowContract$Step.OrderCardIntro) {
            return aVar.T2(step);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object i(Object obj2, Object obj3) {
        final com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c cVar = (com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) this.f138306b;
        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
        MigrateSubscriptionsControllerContract$ModalStep step = (MigrateSubscriptionsControllerContract$ModalStep) obj3;
        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
        Intrinsics.checkNotNullParameter(step, "step");
        char c2 = 1;
        final int i = 0;
        if (step instanceof MigrateSubscriptionsControllerContract$ModalStep.ProductArticle) {
            ProductArticleParams productArticleParams = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(new PaymentsMigrationProductArticleKey(0)));
            k9 k9Var = k9.Payments;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            ViewController viewControllerE1 = cVar.e1(new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, false, 48));
            fi7.s sVar = new fi7.s(2, cVar, com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 2);
            fp3.a aVar = new fp3.a(cVar, 27);
            final char c3 = c2 == true ? 1 : 0;
            kotlin.jvm.internal.s.S(viewControllerE1, sVar, aVar, new Function1() { // from class: g6a.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (c3) {
                        case 0:
                            m6a.a it8 = (m6a.a) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            if (!Intrinsics.f(it8, m6a.a.f203038a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar.C1(u0.b(new FeatureCommand(new CardOrderNewFeatureConfig(null, null, u0.f(PaymentsMigrationDestination.f80204b), null, null, false, zn3.a.DEEPLINK, null, null, null, null, null, 16247))));
                            return Unit.f186387a;
                        default:
                            yja.b outputData = (yja.b) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            int i2 = o.f140915a[outputData.ordinal()];
                            com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c cVar2 = cVar;
                            if (i2 == 1) {
                                cVar2.l2(new b0(cVar2, null, 15), new yi5.b(26));
                            } else {
                                if (i2 != 2 && i2 != 3 && i2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar2.I2(false);
                            }
                            return Unit.f186387a;
                    }
                }
            });
            return viewControllerE1;
        }
        if (step instanceof MigrateSubscriptionsControllerContract$ModalStep.NoCards) {
            NoCardsController noCardsController = new NoCardsController();
            Function1 block = new Function1() { // from class: g6a.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    switch (i) {
                        case 0:
                            m6a.a it8 = (m6a.a) obj4;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            if (!Intrinsics.f(it8, m6a.a.f203038a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar.C1(u0.b(new FeatureCommand(new CardOrderNewFeatureConfig(null, null, u0.f(PaymentsMigrationDestination.f80204b), null, null, false, zn3.a.DEEPLINK, null, null, null, null, null, 16247))));
                            return Unit.f186387a;
                        default:
                            yja.b outputData = (yja.b) obj4;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            int i2 = o.f140915a[outputData.ordinal()];
                            com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c cVar2 = cVar;
                            if (i2 == 1) {
                                cVar2.l2(new b0(cVar2, null, 15), new yi5.b(26));
                            } else {
                                if (i2 != 2 && i2 != 3 && i2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar2.I2(false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            noCardsController.H = block;
            return noCardsController;
        }
        if (!(step instanceof MigrateSubscriptionsControllerContract$ModalStep.PaymentSelection)) {
            throw new NoWhenBranchMatchedException();
        }
        Provider provider = ((MigrateSubscriptionsControllerContract$ModalStep.PaymentSelection) step).f80262a;
        PaymentSelectionController paymentSelectionController = new PaymentSelectionController(new PaymentSelectionContract$InputData(provider == null));
        j block2 = new j(cVar, provider, 12);
        Intrinsics.checkNotNullParameter(block2, "block");
        paymentSelectionController.H = block2;
        return paymentSelectionController;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v22, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ?? arrayList;
        fy6.n nVar;
        String str;
        InvoiceDateOption dateOption;
        Clause textLocalisedClause;
        List listA;
        LocalDate selectedDate;
        LocalDate minAvailableDate;
        TextLocalisedClause textLocalisedClause2;
        LocalDate localDate;
        int i = this.f138305a;
        int i2 = 10;
        int i3 = 12;
        final int i5 = 1;
        final int i6 = 0;
        Object obj4 = this.f138306b;
        switch (i) {
            case 0:
                kv1.g params = (kv1.g) obj2;
                String data = (String) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(data, "data");
                ((ne0.d) ((r) obj4).f250852b).f(r.j(params), data);
                return Unit.f186387a;
            case 1:
                final com.revolut.feature.card.verification.impl.flow.card_penny_topup.b bVar = (com.revolut.feature.card.verification.impl.flow.card_penny_topup.b) obj4;
                final l FlowCoordinator = (l) obj2;
                CardPennyTopUpFlowContract$Step step = (CardPennyTopUpFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof CardPennyTopUpFlowContract$Step.Info) {
                    CardPennyTopUpFlowContract$InputData cardPennyTopUpFlowContract$InputData = bVar.o;
                    CardPennyTopUpInfoScreen cardPennyTopUpInfoScreen = new CardPennyTopUpInfoScreen(new kv2.g(cardPennyTopUpFlowContract$InputData.f64398a, cardPennyTopUpFlowContract$InputData.f64399b));
                    Function1 block = new Function1() { // from class: fv2.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    kv2.h it8 = (kv2.h) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    com.revolut.feature.card.verification.impl.flow.card_penny_topup.b bVar2 = bVar;
                                    CardPennyTopUpFlowContract$InputData cardPennyTopUpFlowContract$InputData2 = bVar2.o;
                                    h.t2(bVar2, FlowCoordinator, new CardPennyTopUpFlowContract$Step.CardPennyTopUp(new FacadeCardTopupFlowDescriptor$InputData(new CardTopUpType.PennyTopUp(cardPennyTopUpFlowContract$InputData2.f64399b), cardPennyTopUpFlowContract$InputData2.f64398a, cardPennyTopUpFlowContract$InputData2.f64400c, null)), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    til.r output = (til.r) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (output instanceof q) {
                                        bVar.C2(c.f138312a);
                                    } else {
                                        if (!(output instanceof til.n) && !(output instanceof o) && !(output instanceof til.p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.D2(FlowCoordinator);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    cardPennyTopUpInfoScreen.H = block;
                    return cardPennyTopUpInfoScreen;
                }
                if (step instanceof CardPennyTopUpFlowContract$Step.CardPennyTopUp) {
                    ViewController viewControllerE1 = bVar.e1(new ste.k(((CardPennyTopUpFlowContract$Step.CardPennyTopUp) step).f64401a));
                    fs2.k block2 = new fs2.k(bVar, i3);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    viewControllerE1.H = block2;
                    return viewControllerE1;
                }
                if (!(step instanceof CardPennyTopUpFlowContract$Step.CardVerificationWorkflow)) {
                    throw new NoWhenBranchMatchedException();
                }
                WorkflowFlow workflowFlowB = m.b(bVar.f64406q, new WorkflowConfiguration.Workflow(((CardPennyTopUpFlowContract$Step.CardVerificationWorkflow) step).f64402a, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 122), new WorkflowFlowType.Regular(til.s.BACK_ARROW), null, 60);
                Function1 block3 = new Function1() { // from class: fv2.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i5) {
                            case 0:
                                kv2.h it8 = (kv2.h) obj5;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                com.revolut.feature.card.verification.impl.flow.card_penny_topup.b bVar2 = bVar;
                                CardPennyTopUpFlowContract$InputData cardPennyTopUpFlowContract$InputData2 = bVar2.o;
                                h.t2(bVar2, FlowCoordinator, new CardPennyTopUpFlowContract$Step.CardPennyTopUp(new FacadeCardTopupFlowDescriptor$InputData(new CardTopUpType.PennyTopUp(cardPennyTopUpFlowContract$InputData2.f64399b), cardPennyTopUpFlowContract$InputData2.f64398a, cardPennyTopUpFlowContract$InputData2.f64400c, null)), true, null, false, 12);
                                return Unit.f186387a;
                            default:
                                til.r output = (til.r) obj5;
                                Intrinsics.checkNotNullParameter(output, "output");
                                if (output instanceof q) {
                                    bVar.C2(c.f138312a);
                                } else {
                                    if (!(output instanceof til.n) && !(output instanceof o) && !(output instanceof til.p)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.D2(FlowCoordinator);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block3, "block");
                workflowFlowB.H = block3;
                return workflowFlowB;
            case 2:
                com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b bVar2 = (com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                FreelancerAcquiringPaymentListScreenContract$ModalStep step2 = (FreelancerAcquiringPaymentListScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof FreelancerAcquiringPaymentListScreenContract$ModalStep.PaymentFilters)) {
                    throw new NoWhenBranchMatchedException();
                }
                FreelancerAcquiringPaymentFiltersScreen freelancerAcquiringPaymentFiltersScreen = new FreelancerAcquiringPaymentFiltersScreen(new FreelancerAcquiringPaymentFiltersScreenContract$InputData(((FreelancerAcquiringPaymentListScreenContract$ModalStep.PaymentFilters) step2).f73731a));
                fs2.k block4 = new fs2.k(bVar2, 16);
                Intrinsics.checkNotNullParameter(block4, "block");
                freelancerAcquiringPaymentFiltersScreen.H = block4;
                return freelancerAcquiringPaymentFiltersScreen;
            case 3:
                com.revolut.feature.kyc.impl.egov_kyc.flow.a aVar = (com.revolut.feature.kyc.impl.egov_kyc.flow.a) obj4;
                EgovKycFlowContract$Step step3 = (EgovKycFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!Intrinsics.f(step3, EgovKycFlowContract$Step.Portal.f77635a)) {
                    throw new NoWhenBranchMatchedException();
                }
                EgovKycFlowContract$InputData egovKycFlowContract$InputData = aVar.o;
                EgovKycScreen egovKycScreen = new EgovKycScreen(new EgovKycScreenContract$InputData(egovKycFlowContract$InputData.f77633a, egovKycFlowContract$InputData.f77634b));
                fs2.k block5 = new fs2.k(aVar, 18);
                Intrinsics.checkNotNullParameter(block5, "block");
                egovKycScreen.H = block5;
                return egovKycScreen;
            case 4:
                CreditCardDownPaymentScreen creditCardDownPaymentScreen = (CreditCardDownPaymentScreen) obj4;
                CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = CreditCardDownPaymentScreen.R;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj5 = model.f51981p;
                xi0.b bVar3 = obj5 instanceof xi0.b ? (xi0.b) obj5 : null;
                if (bVar3 != null) {
                    return new zp0.d(field.getEditText(), bVar3, (u80.d) creditCardDownPaymentScreen.L.getValue(), null, null, false, false, 0, false, null, 1944);
                }
                return null;
            case 5:
                final com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar2 = (com.revolut.feature.security_hub.impl.ui.transactions_limits.a) obj4;
                fwc.a aVar3 = aVar2.f85747p;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TransactionsLimitsScreenContract$Step step4 = (TransactionsLimitsScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (Intrinsics.f(step4, TransactionsLimitsScreenContract$Step.DailyLimitDialog.f85739a)) {
                    aVar3.getClass();
                    lw0.a aVar4 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_cell_daily, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_dialog_daily_subtitle, null, null, 14), null, null, false, 28);
                    aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_section_other_dialog_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                    k9 k9Var = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar4, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                }
                if (Intrinsics.f(step4, TransactionsLimitsScreenContract$Step.WeeklyLimitDialog.f85745a)) {
                    aVar3.getClass();
                    lw0.a aVar5 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_cell_weekly, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_dialog_weekly_subtitle, null, null, 14), null, null, false, 28);
                    aw0.e eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_section_other_dialog_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                    k9 k9Var2 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar5, eVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                }
                if (Intrinsics.f(step4, TransactionsLimitsScreenContract$Step.LimitDisableConfirmation.f85741a)) {
                    aVar3.getClass();
                    lw0.a aVar6 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_dialog_disable_limit_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_dialog_disable_limit_subtitle, null, null, 14), null, null, false, 28);
                    aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_dialog_disable_limit_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_dialog_disable_limit_action_deny, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), null, null, null, 121);
                    k9 k9Var3 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar6, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
                    Function1 block6 = new Function1() { // from class: fwc.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            dii.g it8 = (dii.g) obj6;
                            switch (i6) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (Intrinsics.f(it8, dii.e.f115068a)) {
                                        com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar7 = aVar2;
                                        aVar7.l2(new b0(aVar7, null, 6), new yi5.b(26));
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(it8, "result");
                                    if (Intrinsics.f(it8, dii.e.f115068a)) {
                                        com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar8 = aVar2;
                                        aVar8.l2(new v(aVar8, null), new yi5.b(26));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    actionsBottomSheetController.H = block6;
                    return actionsBottomSheetController;
                }
                if (Intrinsics.f(step4, TransactionsLimitsScreenContract$Step.MonetisationDialog.f85742a)) {
                    aVar3.getClass();
                    lw0.a aVar7 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_jp_cell_monetisable_balance, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_jp_dialog_monetisable_balance_subtitle, null, null, 14), null, null, false, 28);
                    aw0.e eVar3 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_section_other_dialog_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                    k9 k9Var4 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar7, eVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), null, null, 24));
                }
                if (step4 instanceof TransactionsLimitsScreenContract$Step.WalletBalanceDialog) {
                    WalletLimit.CounterLimit counterLimit = ((TransactionsLimitsScreenContract$Step.WalletBalanceDialog) step4).f85744a;
                    aVar3.getClass();
                    Intrinsics.checkNotNullParameter(counterLimit, "counterLimit");
                    lw0.a aVar8 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_sg_cell_wallet_balance, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_sg_dialog_wallet_balance_subtitle_unlinked, u.c(rwc.b.a(counterLimit.e)), null, 12), null, null, false, 28);
                    aw0.e eVar4 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_sg_dialog_wallet_balance_action_link_external, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                    k9 k9Var5 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator5 = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar8, eVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var5, "value", k9Var5), null, null, 24));
                    Function1 block7 = new Function1() { // from class: fwc.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            dii.g it8 = (dii.g) obj6;
                            switch (i5) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (Intrinsics.f(it8, dii.e.f115068a)) {
                                        com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar72 = aVar2;
                                        aVar72.l2(new b0(aVar72, null, 6), new yi5.b(26));
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(it8, "result");
                                    if (Intrinsics.f(it8, dii.e.f115068a)) {
                                        com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar82 = aVar2;
                                        aVar82.l2(new v(aVar82, null), new yi5.b(26));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    actionsBottomSheetController2.H = block7;
                    return actionsBottomSheetController2;
                }
                if (step4 instanceof TransactionsLimitsScreenContract$Step.YearlyBalanceDialog) {
                    WalletLimit.CounterLimit counterLimit2 = ((TransactionsLimitsScreenContract$Step.YearlyBalanceDialog) step4).f85746a;
                    aVar3.getClass();
                    Intrinsics.checkNotNullParameter(counterLimit2, "counterLimit");
                    lw0.a aVar9 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_sg_cell_yearly, null, null, 14), new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_sg_dialog_yearly_subtitle, u.c(rwc.b.a(counterLimit2.e)), null, 12), null, null, false, 28);
                    aw0.e eVar5 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_multiple_limits_section_other_dialog_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
                    k9 k9Var6 = k9.SecurityHub;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator6 = AnalyticsProduct.Retail.CREATOR;
                    return new ActionsBottomSheetController(new dii.a(aVar9, eVar5, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var6, "value", k9Var6), null, null, 24));
                }
                if (!(step4 instanceof TransactionsLimitsScreenContract$Step.DailyLimitInfoDialog)) {
                    if (!(step4 instanceof TransactionsLimitsScreenContract$Step.ReadOnlyLimitDialog)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    RowActionsBottomSheetController rowActionsBottomSheetControllerA = aVar3.a(((TransactionsLimitsScreenContract$Step.ReadOnlyLimitDialog) step4).f85743a);
                    fpk.b block8 = new fpk.b(step4, aVar2, 14);
                    Intrinsics.checkNotNullParameter(block8, "block");
                    rowActionsBottomSheetControllerA.H = block8;
                    return rowActionsBottomSheetControllerA;
                }
                OutboundTransactionLimit transactionLimit = ((TransactionsLimitsScreenContract$Step.DailyLimitInfoDialog) step4).f85740a;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(transactionLimit, "transactionLimit");
                lw0.a aVar10 = new lw0.a(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_sg_dialog_daily_title, u.c(new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_screen_sg_cell_daily, null, null, 14)), null, 12), null, null, null, false, 30);
                List list = transactionLimit.k;
                if (list != null) {
                    List<FeatureItem> list2 = list;
                    arrayList = new ArrayList(w.t(list2, 10));
                    for (FeatureItem featureItem : list2) {
                        String str2 = featureItem.f85470b;
                        String str3 = featureItem.f85469a;
                        TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        Integer numA = aVar3.f138600a.a(str3);
                        arrayList.add(new eii.l((Clause) textClause, (Clause) null, (RowDelegate.Model.MainImage) (numA != null ? new RowDelegate.Model.MainImage.Image40(new GlyphImage(numA.intValue(), null, null, 6), null, null, false, null, false, 62) : null), false, false, (RowDelegate.Model.c) null, (Object) null, 488));
                    }
                } else {
                    arrayList = f0.f322471a;
                }
                ?? r112 = arrayList;
                k9 value = k9.SecurityHub;
                Parcelable.Creator<AnalyticsProduct.Retail> creator7 = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                return new RowActionsBottomSheetController(new eii.c(aVar10, null, r112, new AnalyticsProduct.Retail(value), null));
            case 6:
                i requiresOnboardingOptional = (i) obj2;
                i userStateOptional = (i) obj3;
                Intrinsics.checkNotNullParameter(requiresOnboardingOptional, "requiresOnboardingOptional");
                Intrinsics.checkNotNullParameter(userStateOptional, "userStateOptional");
                return Boolean.valueOf(((fwj.p) obj4).d(requiresOnboardingOptional, userStateOptional));
            case 7:
                final com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c cVar = (com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c) obj4;
                qy6.d dVar = cVar.f73917s;
                hy6.a aVar11 = cVar.f73914p;
                y yVar = cVar.v;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InvoicePaymentScheduleScreenContract$Step step5 = (InvoicePaymentScheduleScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                boolean z = step5 instanceof fy6.q;
                InvoicePaymentScheduleScreenContract$ScheduleTab.Recurring recurring = InvoicePaymentScheduleScreenContract$ScheduleTab.Recurring.f73904a;
                InvoicePaymentScheduleScreenContract$ScheduleTab.OneTime oneTime = InvoicePaymentScheduleScreenContract$ScheduleTab.OneTime.f73903a;
                if (z) {
                    fy6.q step6 = (fy6.q) step5;
                    InvoicePaymentSchedule invoicePaymentSchedule = ((fy6.i) ((j2) yVar.f22677a).getValue()).f138938b;
                    boolean z3 = step6 instanceof InvoicePaymentScheduleScreenContract$Step.IssueDatePicker;
                    if (z3) {
                        selectedDate = invoicePaymentSchedule.f73895a;
                    } else if (step6 instanceof InvoicePaymentScheduleScreenContract$Step.NextDatePicker) {
                        selectedDate = invoicePaymentSchedule.d;
                        if (selectedDate == null) {
                            selectedDate = invoicePaymentSchedule.f73895a;
                        }
                    } else if (step6 instanceof InvoicePaymentScheduleScreenContract$Step.DueDatePicker) {
                        selectedDate = invoicePaymentSchedule.b();
                    } else if (step6 instanceof InvoicePaymentScheduleScreenContract$Step.SaleDatePicker) {
                        selectedDate = invoicePaymentSchedule.c();
                    } else {
                        if (!(step6 instanceof InvoicePaymentScheduleScreenContract$Step.EndDatePicker)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fy6.h hVar2 = ((fy6.i) ((j2) yVar.f22677a).getValue()).f138939c;
                        fy6.m mVar = hVar2 != null ? hVar2.f138936b : null;
                        fy6.k kVar = mVar instanceof fy6.k ? (fy6.k) mVar : null;
                        if (kVar == null || (selectedDate = kVar.f138941a) == null) {
                            selectedDate = invoicePaymentSchedule.f73895a;
                        }
                    }
                    if (z3 || (step6 instanceof InvoicePaymentScheduleScreenContract$Step.NextDatePicker)) {
                        minAvailableDate = ((l80.f) cVar.o).e();
                    } else {
                        boolean zT = invoicePaymentSchedule.T();
                        minAvailableDate = invoicePaymentSchedule.f73895a;
                        if (zT && (localDate = invoicePaymentSchedule.d) != null) {
                            minAvailableDate = localDate;
                        }
                    }
                    aVar11.getClass();
                    Intrinsics.checkNotNullParameter(step6, "step");
                    Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
                    Intrinsics.checkNotNullParameter(minAvailableDate, "minAvailableDate");
                    if (z3) {
                        InvoicePaymentScheduleScreenContract$ScheduleTab invoicePaymentScheduleScreenContract$ScheduleTab = ((InvoicePaymentScheduleScreenContract$Step.IssueDatePicker) step6).f73908a;
                        if (Intrinsics.f(invoicePaymentScheduleScreenContract$ScheduleTab, oneTime)) {
                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_schedule_input_invoice_date_title, null, null, 14);
                        } else {
                            if (!Intrinsics.f(invoicePaymentScheduleScreenContract$ScheduleTab, recurring)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_schedule_recurring_input_send_title, null, null, 14);
                        }
                    } else if (step6 instanceof InvoicePaymentScheduleScreenContract$Step.NextDatePicker) {
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_schedule_recurring_input_send_active_title, null, null, 14);
                    } else if (step6 instanceof InvoicePaymentScheduleScreenContract$Step.DueDatePicker) {
                        InvoicePaymentScheduleScreenContract$ScheduleTab invoicePaymentScheduleScreenContract$ScheduleTab2 = ((InvoicePaymentScheduleScreenContract$Step.DueDatePicker) step6).f73906a;
                        if (Intrinsics.f(invoicePaymentScheduleScreenContract$ScheduleTab2, oneTime)) {
                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_schedule_input_custom_due_date_title, null, null, 14);
                        } else {
                            if (!Intrinsics.f(invoicePaymentScheduleScreenContract$ScheduleTab2, recurring)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_schedule_recurring_input_each_invoice_due_title, null, null, 14);
                        }
                    } else if (step6 instanceof InvoicePaymentScheduleScreenContract$Step.SaleDatePicker) {
                        InvoicePaymentScheduleScreenContract$ScheduleTab invoicePaymentScheduleScreenContract$ScheduleTab3 = ((InvoicePaymentScheduleScreenContract$Step.SaleDatePicker) step6).f73913a;
                        if (Intrinsics.f(invoicePaymentScheduleScreenContract$ScheduleTab3, oneTime)) {
                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_schedule_input_supply_date_title, null, null, 14);
                        } else {
                            if (!Intrinsics.f(invoicePaymentScheduleScreenContract$ScheduleTab3, recurring)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_schedule_recurring_input_supply_date_title, null, null, 14);
                        }
                    } else {
                        if (!(step6 instanceof InvoicePaymentScheduleScreenContract$Step.EndDatePicker)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_schedule_recurring_input_end_title, null, null, 14);
                    }
                    FreelancerDatePickerScreen freelancerDatePickerScreen = new FreelancerDatePickerScreen(new FreelancerDatePickerScreenContract$InputData(textLocalisedClause2, selectedDate, selectedDate, Intrinsics.f(step6.getF73913a(), recurring) ? minAvailableDate : null, null, 16));
                    eed.i block9 = new eed.i(step6, 25, cVar, invoicePaymentSchedule);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    freelancerDatePickerScreen.H = block9;
                    return freelancerDatePickerScreen;
                }
                if (!(step5 instanceof fy6.p)) {
                    if (!(step5 instanceof InvoicePaymentScheduleScreenContract$Step.LimitOptionPicker)) {
                        if (!(step5 instanceof InvoicePaymentScheduleScreenContract$Step.RepeatPeriodPicker)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fy6.h hVar3 = ((fy6.i) ((j2) yVar.f22677a).getValue()).f138939c;
                        FreelancerSingleChoiceScreen freelancerSingleChoiceScreenB = dVar.b((hVar3 == null || (nVar = hVar3.f138935a) == null) ? null : nVar.f138944b);
                        Function1 block10 = new Function1() { // from class: fy6.u
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                sr6.l lVar;
                                Object kVar2;
                                LocalDate localDate2;
                                Integer num;
                                switch (i6) {
                                    case 0:
                                        mw6.e result = (mw6.e) obj6;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        if (result instanceof mw6.c) {
                                            String str4 = ((mw6.c) result).f209401a;
                                            sr6.l[] lVarArrValues = sr6.l.values();
                                            int length = lVarArrValues.length;
                                            int i21 = 0;
                                            while (true) {
                                                if (i21 < length) {
                                                    lVar = lVarArrValues[i21];
                                                    if (!a0.z(lVar.name(), str4, true)) {
                                                        i21++;
                                                    }
                                                } else {
                                                    lVar = null;
                                                }
                                            }
                                            if (lVar != null) {
                                                com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c cVar2 = cVar;
                                                cVar2.H2(cVar2.v, new v(lVar, 0));
                                            }
                                        }
                                        break;
                                    default:
                                        com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c cVar3 = cVar;
                                        y yVar2 = cVar3.v;
                                        mw6.e result2 = (mw6.e) obj6;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        if (result2 instanceof mw6.c) {
                                            String str5 = ((mw6.c) result2).f209401a;
                                            int iHashCode = str5.hashCode();
                                            if (iHashCode == -2020669027) {
                                                if (str5.equals("ID_SINGLE_CHOICE_LIMIT_DATE")) {
                                                    h hVar4 = ((i) ((j2) yVar2.f22677a).getValue()).f138939c;
                                                    m mVar2 = hVar4 != null ? hVar4.f138936b : null;
                                                    k kVar3 = mVar2 instanceof k ? (k) mVar2 : null;
                                                    if (kVar3 == null || (localDate2 = kVar3.f138941a) == null) {
                                                        localDate2 = ((i) ((j2) yVar2.f22677a).getValue()).f138938b.f73895a;
                                                    }
                                                    kVar2 = new k(localDate2);
                                                    cVar3.H2(yVar2, new fs2.k(kVar2, 21));
                                                }
                                            } else if (iHashCode == 1781148077) {
                                                if (str5.equals("ID_SINGLE_CHOICE_LIMIT_AFTER")) {
                                                    h hVar5 = ((i) ((j2) yVar2.f22677a).getValue()).f138939c;
                                                    m mVar3 = hVar5 != null ? hVar5.f138936b : null;
                                                    j jVar = mVar3 instanceof j ? (j) mVar3 : null;
                                                    kVar2 = new j(Integer.valueOf((jVar == null || (num = jVar.f138940a) == null) ? 1 : num.intValue()));
                                                    cVar3.H2(yVar2, new fs2.k(kVar2, 21));
                                                }
                                            } else if (iHashCode == 1793125981 && str5.equals("ID_SINGLE_CHOICE_LIMIT_NEVER")) {
                                                kVar2 = l.f138942a;
                                                cVar3.H2(yVar2, new fs2.k(kVar2, 21));
                                            }
                                        }
                                        break;
                                }
                                return Unit.f186387a;
                            }
                        };
                        Intrinsics.checkNotNullParameter(block10, "block");
                        freelancerSingleChoiceScreenB.H = block10;
                        return freelancerSingleChoiceScreenB;
                    }
                    fy6.h hVar4 = ((fy6.i) ((j2) yVar.f22677a).getValue()).f138939c;
                    fy6.m mVar2 = hVar4 != null ? hVar4.f138936b : null;
                    if (mVar2 instanceof fy6.j) {
                        str = "ID_SINGLE_CHOICE_LIMIT_AFTER";
                    } else if (mVar2 instanceof fy6.k) {
                        str = "ID_SINGLE_CHOICE_LIMIT_DATE";
                    } else if (mVar2 instanceof fy6.l) {
                        str = "ID_SINGLE_CHOICE_LIMIT_NEVER";
                    } else {
                        if (mVar2 != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = null;
                    }
                    dVar.getClass();
                    FreelancerSingleChoiceScreen freelancerSingleChoiceScreenA = qy6.d.a(str, true);
                    Function1 block11 = new Function1() { // from class: fy6.u
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            sr6.l lVar;
                            Object kVar2;
                            LocalDate localDate2;
                            Integer num;
                            switch (i5) {
                                case 0:
                                    mw6.e result = (mw6.e) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof mw6.c) {
                                        String str4 = ((mw6.c) result).f209401a;
                                        sr6.l[] lVarArrValues = sr6.l.values();
                                        int length = lVarArrValues.length;
                                        int i21 = 0;
                                        while (true) {
                                            if (i21 < length) {
                                                lVar = lVarArrValues[i21];
                                                if (!a0.z(lVar.name(), str4, true)) {
                                                    i21++;
                                                }
                                            } else {
                                                lVar = null;
                                            }
                                        }
                                        if (lVar != null) {
                                            com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c cVar2 = cVar;
                                            cVar2.H2(cVar2.v, new v(lVar, 0));
                                        }
                                    }
                                    break;
                                default:
                                    com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c cVar3 = cVar;
                                    y yVar2 = cVar3.v;
                                    mw6.e result2 = (mw6.e) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof mw6.c) {
                                        String str5 = ((mw6.c) result2).f209401a;
                                        int iHashCode = str5.hashCode();
                                        if (iHashCode == -2020669027) {
                                            if (str5.equals("ID_SINGLE_CHOICE_LIMIT_DATE")) {
                                                h hVar42 = ((i) ((j2) yVar2.f22677a).getValue()).f138939c;
                                                m mVar22 = hVar42 != null ? hVar42.f138936b : null;
                                                k kVar3 = mVar22 instanceof k ? (k) mVar22 : null;
                                                if (kVar3 == null || (localDate2 = kVar3.f138941a) == null) {
                                                    localDate2 = ((i) ((j2) yVar2.f22677a).getValue()).f138938b.f73895a;
                                                }
                                                kVar2 = new k(localDate2);
                                                cVar3.H2(yVar2, new fs2.k(kVar2, 21));
                                            }
                                        } else if (iHashCode == 1781148077) {
                                            if (str5.equals("ID_SINGLE_CHOICE_LIMIT_AFTER")) {
                                                h hVar5 = ((i) ((j2) yVar2.f22677a).getValue()).f138939c;
                                                m mVar3 = hVar5 != null ? hVar5.f138936b : null;
                                                j jVar = mVar3 instanceof j ? (j) mVar3 : null;
                                                kVar2 = new j(Integer.valueOf((jVar == null || (num = jVar.f138940a) == null) ? 1 : num.intValue()));
                                                cVar3.H2(yVar2, new fs2.k(kVar2, 21));
                                            }
                                        } else if (iHashCode == 1793125981 && str5.equals("ID_SINGLE_CHOICE_LIMIT_NEVER")) {
                                            kVar2 = l.f138942a;
                                            cVar3.H2(yVar2, new fs2.k(kVar2, 21));
                                        }
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    freelancerSingleChoiceScreenA.H = block11;
                    return freelancerSingleChoiceScreenA;
                }
                fy6.p step7 = (fy6.p) step5;
                boolean z4 = step7 instanceof InvoicePaymentScheduleScreenContract$Step.DueDateOptionPicker;
                if (z4) {
                    dateOption = ((fy6.i) ((j2) yVar.f22677a).getValue()).f138938b.f73896b;
                } else {
                    if (!(step7 instanceof InvoicePaymentScheduleScreenContract$Step.SaleDateOptionPicker)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dateOption = ((fy6.i) ((j2) yVar.f22677a).getValue()).f138938b.f73897c;
                }
                aVar11.getClass();
                Intrinsics.checkNotNullParameter(step7, "step");
                Intrinsics.checkNotNullParameter(dateOption, "dateOption");
                if (z4) {
                    InvoicePaymentScheduleScreenContract$ScheduleTab invoicePaymentScheduleScreenContract$ScheduleTab4 = ((InvoicePaymentScheduleScreenContract$Step.DueDateOptionPicker) step7).f73905a;
                    if (Intrinsics.f(invoicePaymentScheduleScreenContract$ScheduleTab4, oneTime)) {
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_schedule_input_due_title, null, null, 14);
                    } else {
                        if (!Intrinsics.f(invoicePaymentScheduleScreenContract$ScheduleTab4, recurring)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_schedule_recurring_input_each_invoice_due_title, null, null, 14);
                    }
                } else {
                    if (!(step7 instanceof InvoicePaymentScheduleScreenContract$Step.SaleDateOptionPicker)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InvoicePaymentScheduleScreenContract$ScheduleTab invoicePaymentScheduleScreenContract$ScheduleTab5 = ((InvoicePaymentScheduleScreenContract$Step.SaleDateOptionPicker) step7).f73912a;
                    if (Intrinsics.f(invoicePaymentScheduleScreenContract$ScheduleTab5, oneTime)) {
                        m70.a.c(t0.f186434a);
                        textLocalisedClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    } else {
                        if (!Intrinsics.f(invoicePaymentScheduleScreenContract$ScheduleTab5, recurring)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_schedule_recurring_input_supply_date_title, null, null, 14);
                    }
                }
                Clause clause = textLocalisedClause;
                String strName = "ITEM_ID_CUSTOM";
                if (z4) {
                    InvoicePaymentScheduleScreenContract$ScheduleTab invoicePaymentScheduleScreenContract$ScheduleTab6 = ((InvoicePaymentScheduleScreenContract$Step.DueDateOptionPicker) step7).f73905a;
                    if (Intrinsics.f(invoicePaymentScheduleScreenContract$ScheduleTab6, oneTime)) {
                        h0 h0Var = h0.f322473a;
                        aim.e eVarB = u.b();
                        List<sr6.b> listB0 = d0.B0(sr6.b.a(), h0Var);
                        ArrayList arrayList2 = new ArrayList(w.t(listB0, 10));
                        for (sr6.b bVar4 : listB0) {
                            arrayList2.add(new FreelancerSingleChoiceScreenContract$SingleChoiceItem(ofm.q.M(bVar4), bVar4.name()));
                        }
                        zhm.a0.x(arrayList2, eVarB);
                        eVarB.add(new FreelancerSingleChoiceScreenContract$SingleChoiceItem(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_schedule_option_custom_due_date, null, null, 14), "ITEM_ID_CUSTOM"));
                        listA = u.a(eVarB);
                    } else {
                        if (!Intrinsics.f(invoicePaymentScheduleScreenContract$ScheduleTab6, recurring)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listA = hy6.a.a((InvoicePaymentScheduleScreenContract$Step) step7);
                    }
                } else {
                    if (!(step7 instanceof InvoicePaymentScheduleScreenContract$Step.SaleDateOptionPicker)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InvoicePaymentScheduleScreenContract$ScheduleTab invoicePaymentScheduleScreenContract$ScheduleTab7 = ((InvoicePaymentScheduleScreenContract$Step.SaleDateOptionPicker) step7).f73912a;
                    if (Intrinsics.f(invoicePaymentScheduleScreenContract$ScheduleTab7, oneTime)) {
                        listA = f0.f322471a;
                    } else {
                        if (!Intrinsics.f(invoicePaymentScheduleScreenContract$ScheduleTab7, recurring)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listA = hy6.a.a((InvoicePaymentScheduleScreenContract$Step) step7);
                    }
                }
                InvoicePaymentScheduleScreenContract$ScheduleTab f73912a = step7.getF73912a();
                if (!Intrinsics.f(f73912a, oneTime)) {
                    if (!Intrinsics.f(f73912a, recurring)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!(dateOption instanceof InvoiceDateOption.CustomDate)) {
                        if (!(dateOption instanceof InvoiceDateOption.DateOffset)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Set set = hy6.a.f156743a;
                        sr6.b bVar5 = ((InvoiceDateOption.DateOffset) dateOption).f73894a;
                        if (!set.contains(bVar5)) {
                            strName = bVar5.name();
                        }
                    }
                } else if (!(dateOption instanceof InvoiceDateOption.CustomDate)) {
                    if (!(dateOption instanceof InvoiceDateOption.DateOffset)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strName = ((InvoiceDateOption.DateOffset) dateOption).f73894a.name();
                }
                FreelancerSingleChoiceScreen freelancerSingleChoiceScreen = new FreelancerSingleChoiceScreen(new FreelancerSingleChoiceScreenContract$InputData(clause, null, listA, strName));
                fpk.b block12 = new fpk.b(cVar, step7, 19);
                Intrinsics.checkNotNullParameter(block12, "block");
                freelancerSingleChoiceScreen.H = block12;
                return freelancerSingleChoiceScreen;
            case 8:
                Function1 defaultError = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultError, "defaultError");
                return ((fyg.g) obj4).f138991a.c("ERROR_STATE_ID");
            case 9:
                DirectDebitNewAccountScreen directDebitNewAccountScreen = (DirectDebitNewAccountScreen) obj4;
                InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                InputText field2 = (InputText) obj3;
                KProperty[] kPropertyArr2 = DirectDebitNewAccountScreen.i0;
                Intrinsics.checkNotNullParameter(model2, "input");
                Intrinsics.checkNotNullParameter(field2, "field");
                ((fz4.l) directDebitNewAccountScreen.T2()).getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                fz4.k.Companion.getClass();
                fz4.a aVar12 = (fz4.a) fz4.f.f139090b.get(model2.f52580a);
                if (aVar12 != null) {
                    return new zp0.y(field2.getInnerEditText(), null, aVar12.f139084a, new fwj.h(directDebitNewAccountScreen, i2), model2.f52580a, DigitsKeyListener.getInstance(aVar12.f139086c), false, 66);
                }
                return null;
            case 10:
                final com.revolut.feature.freelancer.impl.ui.invoice.templates.override.a aVar13 = (com.revolut.feature.freelancer.impl.ui.invoice.templates.override.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InvoiceTemplateOverrideScreenContract$ModalStep step8 = (InvoiceTemplateOverrideScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof InvoiceTemplateOverrideScreenContract$ModalStep.LanguageSelector) {
                    ViewController viewControllerE12 = aVar13.e1(new t9d.a(new InvoiceLanguageSelectorContract$InputData(((InvoiceTemplateOverrideScreenContract$ModalStep.LanguageSelector) step8).f73971a)));
                    Function1 block13 = new Function1() { // from class: fz6.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i5) {
                                case 0:
                                    bz6.c result = (bz6.c) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.freelancer.impl.ui.invoice.templates.override.a aVar14 = aVar13;
                                    aVar14.H2(aVar14.o, new fs2.k(result, 27));
                                    return Unit.f186387a;
                                default:
                                    v9d.a result2 = (v9d.a) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.freelancer.impl.ui.invoice.templates.override.a aVar15 = aVar13;
                                    aVar15.H2(aVar15.o, new p(result2, 0));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    viewControllerE12.H = block13;
                    return viewControllerE12;
                }
                if (!(step8 instanceof InvoiceTemplateOverrideScreenContract$ModalStep.TemplateSelector)) {
                    throw new NoWhenBranchMatchedException();
                }
                InvoiceTemplatesFlow invoiceTemplatesFlow = new InvoiceTemplatesFlow(new InvoiceTemplatesFlowContract$InputData(null, bz6.d.SELECTION));
                Function1 block14 = new Function1() { // from class: fz6.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i6) {
                            case 0:
                                bz6.c result = (bz6.c) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.feature.freelancer.impl.ui.invoice.templates.override.a aVar14 = aVar13;
                                aVar14.H2(aVar14.o, new fs2.k(result, 27));
                                return Unit.f186387a;
                            default:
                                v9d.a result2 = (v9d.a) obj6;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.feature.freelancer.impl.ui.invoice.templates.override.a aVar15 = aVar13;
                                aVar15.H2(aVar15.o, new p(result2, 0));
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block14, "block");
                invoiceTemplatesFlow.H = block14;
                return invoiceTemplatesFlow;
            case 11:
                com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b bVar6 = (com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b) obj4;
                l FlowCoordinator2 = (l) obj2;
                CardTopupFlowContract$Step step9 = (CardTopupFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof CardTopupFlowContract$Step.Cvv) {
                    CvvScreen cvvScreen = new CvvScreen(new CvvScreenContract$InputData(bVar6.o.f90494b, false));
                    fze.c block15 = new fze.c(bVar6, i6);
                    Intrinsics.checkNotNullParameter(block15, "block");
                    cvvScreen.H = block15;
                    return cvvScreen;
                }
                if (!(step9 instanceof CardTopupFlowContract$Step.ThreeDs)) {
                    throw new NoWhenBranchMatchedException();
                }
                CardTopupFlowContract$Step.ThreeDs threeDs = (CardTopupFlowContract$Step.ThreeDs) step9;
                ThreeDsScreen threeDsScreen = new ThreeDsScreen(new dze.d(threeDs.f90968a, threeDs.f90969b, false));
                fpk.b block16 = new fpk.b(bVar6, FlowCoordinator2, 27);
                Intrinsics.checkNotNullParameter(block16, "block");
                threeDsScreen.H = block16;
                return threeDsScreen;
            case 12:
                com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar7 = (com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                DisposableCardSettingsContract$ModalStep step10 = (DisposableCardSettingsContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!Intrinsics.f(step10, DisposableCardSettingsContract$ModalStep.CardIssuanceAgreement.f64869a)) {
                    throw new NoWhenBranchMatchedException();
                }
                wi0.b.Companion.getClass();
                ViewController viewControllerE13 = bVar7.e1(new xy2.b(new CardIssuanceAgreementControllerContract$InputData(wi0.b.M0, c93.e.DISPOSABLE)));
                g03.l block17 = new g03.l(bVar7, i6);
                Intrinsics.checkNotNullParameter(block17, "block");
                viewControllerE13.H = block17;
                return viewControllerE13;
            case 13:
                com.revolut.feature.freelancer.impl.ui.profile.email_flow.a aVar14 = (com.revolut.feature.freelancer.impl.ui.profile.email_flow.a) obj4;
                l FlowCoordinator3 = (l) obj2;
                FreelancerEmailFlowContract$Step step11 = (FreelancerEmailFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!Intrinsics.f(step11, FreelancerEmailFlowContract$Step.ChangeEmail.f74042a)) {
                    if (step11 instanceof FreelancerEmailFlowContract$Step.CheckEmail) {
                        return new FreelancerCheckEmailScreen(new FreelancerCheckEmailScreenContract$InputData(((FreelancerEmailFlowContract$Step.CheckEmail) step11).f74043a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                FreelancerEmailScreen freelancerEmailScreen = new FreelancerEmailScreen(new FreelancerEmailScreenContract$InputData(aVar14.o.f139365a));
                fpk.b bVar8 = new fpk.b(aVar14, FlowCoordinator3, 29);
                Intrinsics.checkNotNullParameter(bVar8, "<set-?>");
                freelancerEmailScreen.H = bVar8;
                return freelancerEmailScreen;
            case 14:
                final com.revolut.feature.topup_screen.impl.mcy.b bVar9 = (com.revolut.feature.topup_screen.impl.mcy.b) obj4;
                final yki.b LazyFlowCoordinator = (yki.b) obj2;
                final McyTopupFlowContract$Step step12 = (McyTopupFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (step12 instanceof McyTopupFlowContract$Step.IndiaTopupSelectCountry) {
                    IndiaTopupSelectCountryScreen indiaTopupSelectCountryScreen = new IndiaTopupSelectCountryScreen();
                    Function1 block18 = new Function1() { // from class: g0f.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    n0f.f output = (n0f.f) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!(output instanceof n0f.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    McyTopupFlowContract$Step.IndiaTopupSelectCountry indiaTopupSelectCountry = (McyTopupFlowContract$Step.IndiaTopupSelectCountry) step12;
                                    oki.h.t2(bVar9, LazyFlowCoordinator, new McyTopupFlowContract$Step.IndiaTopupDeclaration(indiaTopupSelectCountry.f91054a, indiaTopupSelectCountry.f91055b, ((n0f.e) output).f211024a, indiaTopupSelectCountry.f91056c), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    l0f.d it8 = (l0f.d) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    McyTopupFlowContract$Step.IndiaTopupDeclaration indiaTopupDeclaration = (McyTopupFlowContract$Step.IndiaTopupDeclaration) step12;
                                    oki.h.t2(bVar9, LazyFlowCoordinator, new McyTopupFlowContract$Step.McyExchangeRate(indiaTopupDeclaration.f91051a, indiaTopupDeclaration.f91052b, it8.f191241a, indiaTopupDeclaration.f91053c, indiaTopupDeclaration.d), true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    indiaTopupSelectCountryScreen.H = block18;
                    return indiaTopupSelectCountryScreen;
                }
                if (step12 instanceof McyTopupFlowContract$Step.IndiaTopupDeclaration) {
                    IndiaTopupDeclarationScreen indiaTopupDeclarationScreen = new IndiaTopupDeclarationScreen();
                    Function1 block19 = new Function1() { // from class: g0f.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i5) {
                                case 0:
                                    n0f.f output = (n0f.f) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!(output instanceof n0f.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    McyTopupFlowContract$Step.IndiaTopupSelectCountry indiaTopupSelectCountry = (McyTopupFlowContract$Step.IndiaTopupSelectCountry) step12;
                                    oki.h.t2(bVar9, LazyFlowCoordinator, new McyTopupFlowContract$Step.IndiaTopupDeclaration(indiaTopupSelectCountry.f91054a, indiaTopupSelectCountry.f91055b, ((n0f.e) output).f211024a, indiaTopupSelectCountry.f91056c), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    l0f.d it8 = (l0f.d) obj6;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    McyTopupFlowContract$Step.IndiaTopupDeclaration indiaTopupDeclaration = (McyTopupFlowContract$Step.IndiaTopupDeclaration) step12;
                                    oki.h.t2(bVar9, LazyFlowCoordinator, new McyTopupFlowContract$Step.McyExchangeRate(indiaTopupDeclaration.f91051a, indiaTopupDeclaration.f91052b, it8.f191241a, indiaTopupDeclaration.f91053c, indiaTopupDeclaration.d), true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block19, "block");
                    indiaTopupDeclarationScreen.H = block19;
                    return indiaTopupDeclarationScreen;
                }
                if (step12 instanceof McyTopupFlowContract$Step.McyExchangeRate) {
                    McyTopupFlowContract$Step.McyExchangeRate mcyExchangeRate = (McyTopupFlowContract$Step.McyExchangeRate) step12;
                    McyExchangeRateScreen mcyExchangeRateScreen = new McyExchangeRateScreen(new McyExchangeRateScreenContract$InputData(mcyExchangeRate.f91060a, mcyExchangeRate.f91061b, mcyExchangeRate.f91062c, mcyExchangeRate.d, mcyExchangeRate.e, bVar9.o.getF91048a()));
                    f block20 = new f(step12, bVar9, i6);
                    Intrinsics.checkNotNullParameter(block20, "block");
                    mcyExchangeRateScreen.H = block20;
                    return mcyExchangeRateScreen;
                }
                if (!(step12 instanceof McyTopupFlowContract$Step.McyAccountVerification)) {
                    if (!(step12 instanceof McyTopupFlowContract$Step.McyProductArticle)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ViewController viewControllerE14 = bVar9.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(McyBankProductArticleKey.ONBOARDING)), SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, null, null, false, 56));
                    Function1 block21 = new Function1() { // from class: g0f.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i5) {
                                case 0:
                                    h0f.f result = (h0f.f) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.topup_screen.impl.mcy.b bVar10 = bVar9;
                                    bVar10.n2(new etj.l(bVar10, LazyFlowCoordinator, result, null, 29), new whi.b(6));
                                    return Unit.f186387a;
                                default:
                                    yja.b result2 = (yja.b) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    int i21 = i.f139483a[result2.ordinal()];
                                    yki.b bVar11 = LazyFlowCoordinator;
                                    if (i21 == 1 || i21 == 2 || i21 == 3) {
                                        com.revolut.feature.topup_screen.impl.mcy.b bVar12 = bVar9;
                                        oki.h.t2(bVar12, bVar11, com.revolut.feature.topup_screen.impl.mcy.b.K2(bVar12.o), false, null, false, 14);
                                    } else {
                                        if (i21 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(bVar11);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block21, "block");
                    viewControllerE14.H = block21;
                    return viewControllerE14;
                }
                McyTopupFlowContract$Step.McyAccountVerification mcyAccountVerification = (McyTopupFlowContract$Step.McyAccountVerification) step12;
                TopupMethodType topupMethodType = mcyAccountVerification.f91059c;
                dj0.d dVar2 = mcyAccountVerification.f91058b;
                String str4 = mcyAccountVerification.f91057a;
                McyTopupAccountVerificationScreen mcyTopupAccountVerificationScreen = new McyTopupAccountVerificationScreen(str4 != null ? new McyTopupAccountVerificationScreenContract$InputData.FromDeeplink(str4, dVar2, topupMethodType) : new McyTopupAccountVerificationScreenContract$InputData.FromTopUp(topupMethodType, dVar2));
                Function1 block22 = new Function1() { // from class: g0f.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i6) {
                            case 0:
                                h0f.f result = (h0f.f) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result == null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.feature.topup_screen.impl.mcy.b bVar10 = bVar9;
                                bVar10.n2(new etj.l(bVar10, LazyFlowCoordinator, result, null, 29), new whi.b(6));
                                return Unit.f186387a;
                            default:
                                yja.b result2 = (yja.b) obj6;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                int i21 = i.f139483a[result2.ordinal()];
                                yki.b bVar11 = LazyFlowCoordinator;
                                if (i21 == 1 || i21 == 2 || i21 == 3) {
                                    com.revolut.feature.topup_screen.impl.mcy.b bVar12 = bVar9;
                                    oki.h.t2(bVar12, bVar11, com.revolut.feature.topup_screen.impl.mcy.b.K2(bVar12.o), false, null, false, 14);
                                } else {
                                    if (i21 != 4) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.D2(bVar11);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block22, "block");
                mcyTopupAccountVerificationScreen.H = block22;
                return mcyTopupAccountVerificationScreen;
            case 15:
                return Boolean.valueOf(ScrollableNode.setScrollSemanticsActions$lambda$0((ScrollableNode) obj4, ((Float) obj2).floatValue(), ((Float) obj3).floatValue()));
            case 16:
                f11.b challengeStatus = (f11.b) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(challengeStatus, "challengeStatus");
                ((g11.b) obj4).f139515b.f("CHALLENGE_STATUS_MEMORY_CACHE_KEY", challengeStatus);
                return Unit.f186387a;
            case 17:
                g18.c cVar2 = (g18.c) obj4;
                String ref2 = (String) obj2;
                i airTip = (i) obj3;
                Intrinsics.checkNotNullParameter(ref2, "ref");
                Intrinsics.checkNotNullParameter(airTip, "airTip");
                o18.a aVar15 = (o18.a) airTip.f224257a;
                if (aVar15 != null) {
                    cVar2.f139561b.f(g18.c.a(ref2), aVar15);
                }
                return Unit.f186387a;
            case 18:
                j18.o params2 = (j18.o) obj2;
                o18.e feed = (o18.e) obj3;
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(feed, "feed");
                ((ne0.j) ((r10.q) obj4).f250850c).f(params2, feed);
                return Unit.f186387a;
            case 19:
                return a(obj2, obj3);
            case 20:
                com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b bVar10 = (com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                WealthAllNewsContract$ModalStep step13 = (WealthAllNewsContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!Intrinsics.f(step13, WealthAllNewsContract$ModalStep.AddToWatchlist.f101860a)) {
                    throw new NoWhenBranchMatchedException();
                }
                y1d.b.Companion.getClass();
                Set setB = y0.b(y1d.a.f);
                ViewController viewControllerE15 = bVar10.e1(new SelectAssetsDescriptor(new SelectAssetsInputData(new CombinedWatchlistContext("COMBINED_WATCHLIST_ORDERING_SECURITIES", setB, setB), SelectAssetsInputData.SelectionMode.DefaultWatchlistSelection.f86784a)));
                x block23 = new x(1, bVar10, com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b.class, "reloadPagerIfNeed", "reloadPagerIfNeed(Lcom/revolut/feature/shared_separate_favourites/api/combined_watchlist/SelectedAssetOutputData;)V", 0, 25);
                Intrinsics.checkNotNullParameter(block23, "block");
                viewControllerE15.H = block23;
                return viewControllerE15;
            case 21:
                return SnapshotStateObserver.applyObserver$lambda$0((SnapshotStateObserver) obj4, (Set) obj2, (Snapshot) obj3);
            case 22:
                return b(obj2, obj3);
            case 23:
                return c(obj2, obj3);
            case 24:
                return d(obj2, obj3);
            case 25:
                return e(obj2, obj3);
            case 26:
                return g(obj2, obj3);
            case 27:
                return h(obj2, obj3);
            case 28:
                return i(obj2, obj3);
            default:
                final com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a aVar16 = (com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a) obj4;
                ConsentsFlowContract$InputData consentsFlowContract$InputData = aVar16.f67299p;
                ConsentsFlowContract$Step step14 = (ConsentsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (step14 instanceof ConsentsFlowContract$Step.Documents) {
                    DocumentsContentScreen documentsContentScreen = new DocumentsContentScreen(new DocumentsContentContract$InputData(consentsFlowContract$InputData.f67293a));
                    Function1 block24 = new Function1() { // from class: g74.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    h74.f outputData = (h74.f) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z6 = outputData instanceof h74.e;
                                    com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a aVar17 = aVar16;
                                    if (z6) {
                                        h74.e eVar6 = (h74.e) outputData;
                                        h.t2(aVar17, aVar17.f67303t, new ConsentsFlowContract$Step.DocumentViewer(eVar6.f149846a, eVar6.f149847b, eVar6.f149848c), false, null, false, 12);
                                    } else if (outputData instanceof h74.b) {
                                        aVar17.l2(new g1k.i(aVar17, ((h74.b) outputData).f149843a, null, 12), new yi5.b(26));
                                    } else if (outputData instanceof h74.c) {
                                        aVar17.l2(new b0(aVar17, null, 16), new yi5.b(26));
                                    } else {
                                        if (!(outputData instanceof h74.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar17, aVar17.f67303t, ConsentsFlowContract$Step.ConsentPreferences.f67294a, false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                default:
                                    v44.j outputData2 = (v44.j) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z11 = outputData2 instanceof v44.h;
                                    com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a aVar18 = aVar16;
                                    if (z11) {
                                        aVar18.l2(new g1k.i(aVar18, outputData2, null, 13), new yi5.b(26));
                                    } else {
                                        if (!(outputData2 instanceof v44.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar18, aVar18.f67303t, ConsentsFlowContract$Step.Documents.f67298a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block24, "block");
                    documentsContentScreen.H = block24;
                    return documentsContentScreen;
                }
                if (!(step14 instanceof ConsentsFlowContract$Step.DocumentViewer)) {
                    if (step14 instanceof ConsentsFlowContract$Step.ConsentPreferences) {
                        return new LegacyConsentPreferencesFlow(new LegacyConsentPreferencesFlowContract$InputData(consentsFlowContract$InputData.f67293a.f66892b));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                int i21 = com.revolut.feature.credit.core.R$string.consents_template_document_viewer_title;
                ConsentsFlowContract$Step.DocumentViewer documentViewer = (ConsentsFlowContract$Step.DocumentViewer) step14;
                su3.a aVar17 = documentViewer.f67296b;
                String str5 = aVar17.e;
                if (str5 == null) {
                    str5 = documentViewer.f67295a;
                }
                CreditApplicationDocumentViewerScreen creditApplicationDocumentViewerScreen = new CreditApplicationDocumentViewerScreen(new CreditApplicationDocumentViewerScreenContract$InputData(new TextLocalisedClause(i21, u.c(new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), documentViewer.f67295a, new v44.f(aVar17.f265635a, aVar17.f265636b), documentViewer.f67297c, null, new AnalyticsContext(v7.m(consentsFlowContract$InputData.f67293a, AnalyticsContext.INSTANCE)), null, null, 208));
                Function1 block25 = new Function1() { // from class: g74.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i5) {
                            case 0:
                                h74.f outputData = (h74.f) obj6;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                boolean z6 = outputData instanceof h74.e;
                                com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a aVar172 = aVar16;
                                if (z6) {
                                    h74.e eVar6 = (h74.e) outputData;
                                    h.t2(aVar172, aVar172.f67303t, new ConsentsFlowContract$Step.DocumentViewer(eVar6.f149846a, eVar6.f149847b, eVar6.f149848c), false, null, false, 12);
                                } else if (outputData instanceof h74.b) {
                                    aVar172.l2(new g1k.i(aVar172, ((h74.b) outputData).f149843a, null, 12), new yi5.b(26));
                                } else if (outputData instanceof h74.c) {
                                    aVar172.l2(new b0(aVar172, null, 16), new yi5.b(26));
                                } else {
                                    if (!(outputData instanceof h74.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(aVar172, aVar172.f67303t, ConsentsFlowContract$Step.ConsentPreferences.f67294a, false, null, false, 14);
                                }
                                return Unit.f186387a;
                            default:
                                v44.j outputData2 = (v44.j) obj6;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                boolean z11 = outputData2 instanceof v44.h;
                                com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a aVar18 = aVar16;
                                if (z11) {
                                    aVar18.l2(new g1k.i(aVar18, outputData2, null, 13), new yi5.b(26));
                                } else {
                                    if (!(outputData2 instanceof v44.i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(aVar18, aVar18.f67303t, ConsentsFlowContract$Step.Documents.f67298a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block25, "block");
                creditApplicationDocumentViewerScreen.H = block25;
                return creditApplicationDocumentViewerScreen;
        }
    }
}
