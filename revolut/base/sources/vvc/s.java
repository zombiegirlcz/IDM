package vvc;

import a15.i;
import a15.j;
import android.graphics.RectF;
import android.os.Parcelable;
import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.TextInclusionStrategy;
import bec.k;
import bec.l;
import bec.m;
import bec.n;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.chat.domain.model.draft.DraftRoutingKey;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.ld;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.payid.impl.screen.send.contacts.ContactsScreen;
import com.revolut.feature.apm.payid.impl.screen.send.flow.SendFlowContract$Step;
import com.revolut.feature.apm.payid.impl.screen.send.input.InputScreen;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.CongratulationsScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.congratulations.CongratulationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.congratulations.CongratulationFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.congratulations.content.CongratulationsContentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.congratulations.content.CongratulationsContentScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.emergency_payment.flow.EmergencyPaymentFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.emergency_payment.flow.EmergencyPaymentFlowContract$Step;
import com.revolut.feature.credit.core.ui.bottom_sheet.action.ActionsBottomSheetController;
import com.revolut.feature.credit.health.impl.domain.model.PreapprovedOffer;
import com.revolut.feature.credit.health.impl.ui.dashboard.DashboardScreen;
import com.revolut.feature.credit.health.impl.ui.flow.CreditHealthFlowContract$Step;
import com.revolut.feature.credit.health.impl.ui.insight_detailed.InsightDetailedScreen;
import com.revolut.feature.credit.health.impl.ui.insight_detailed.InsightDetailedScreenContract$InputData;
import com.revolut.feature.credit.health.impl.ui.insights.InsightsScreen;
import com.revolut.feature.credit.health.impl.ui.insights.InsightsScreenContract$InputData;
import com.revolut.feature.credit.health.impl.ui.learn_more.LearnMoreScreen;
import com.revolut.feature.credit.health.impl.ui.learn_more.LearnMoreScreenContract$InputData;
import com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.PostTerminationPlanDetailsFlowContract$Step;
import com.revolut.feature.defi.accounts.impl.ui.creation.confirmation.DeFiConfirmationScreenController;
import com.revolut.feature.defi.accounts.impl.ui.creation.disclaimer.DeFiDisclaimerScreenController;
import com.revolut.feature.defi.accounts.impl.ui.creation.flow.DeFiAccountCreationFlowContract$Step;
import com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.CeFiToDeFiAssetPickerScreen;
import com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow.CeFiToDeFiFlowContract$Step;
import com.revolut.feature.defi.exchange.impl.ui.flow.DeFiExchangeFlowController;
import com.revolut.feature.freelancer.impl.ui.perks.details.FreelancerPerksDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.perks.details.FreelancerPerksDetailsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.perks.flow.FreelancerPerksFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.perks.list.FreelancerPerksListScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.payments.profile.impl.ui_kompot.details_card.ProfileDetailsCard;
import com.revolut.feature.payments.profile.impl.ui_kompot.details_card.ProfileDetailsCardContract$InputData;
import com.revolut.feature.payments.profile.impl.ui_kompot.flow.PaymentProfileFlowContract$InputData;
import com.revolut.feature.payments.profile.impl.ui_kompot.flow.PaymentProfileFlowContract$Step;
import com.revolut.feature.payments.profile.impl.ui_kompot.scanner.ProfileScannerScreen;
import com.revolut.feature.payments.profile.impl.ui_kompot.scanner.ProfileScannerScreenContract$InputData;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.RecurringPaymentsManageSplitContract$ModalStep;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog.RecurringPaymentsManageSplitDialogContract$InputData;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.dialog.RecurringPaymentsManageSplitDialogScreen;
import com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlow;
import com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlowContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderFlowContract$State;
import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderFlowContract$Step;
import com.revolut.feature.retail.cfd.impl.screens.order.v2.CfdOrderFormController;
import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreen;
import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreenContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreenContract$ModalStep;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.modal.card_termination.CobrandedCardsCardTerminationInfoScreen;
import com.revolut.feature.retail.global_accounts.impl.onboarding.ui.CountryProfileOnboardingFlowContract$Step;
import com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData;
import com.revolut.feature.rev_points.impl.ui.terms_review.flow.RevPointsTermsReviewFlow;
import com.revolut.feature.revolut_shop.api.domain.model.RevolutShopAccount;
import com.revolut.feature.revolut_shop.api.domain.model.RevolutShopPaymentAccountSection;
import com.revolut.feature.revolut_shop.api.domain.provider.RevolutShopAddressFlowProvider$OutputData;
import com.revolut.feature.revolut_shop.ui.screen.checkout.CheckoutScreenContract$ModalStep;
import com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.DeliveryAddressScreen;
import com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.DeliveryAddressScreenContract$InputData;
import com.revolut.feature.revolut_shop.ui.screen.payment_method.PaymentMethodScreen;
import com.revolut.feature.revolut_shop.ui.screen.payment_method.PaymentMethodScreenContract$InputData;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$BreakdownDisclaimer;
import com.revolut.feature.revolutpay.api.shared.navigation.PaymentBreakdownControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.impl.ui.flow.pay_with_any.PayWithAnyFlowContract$Step;
import com.revolut.feature.revolutpay.shared.ui.pay_with_any.PayWithAnyScreen;
import com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.SetTrustedLocationScreenContract$Step;
import com.revolut.feature.select.payment.api.navigation.SelectPaymentFlowProvider$ScreenConfiguration;
import com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentRootFlow;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.shared.help_centre.impl.faq.FaqFlow;
import com.revolut.feature.shared.help_centre.impl.faq.flow.SharedFaqLazyFlowContract$Step;
import com.revolut.feature.shared.help_centre.impl.main.HelpFlow;
import com.revolut.feature.shared.help_centre.impl.main.HelpFlowContract$InputData;
import com.revolut.feature.staking.impl.stakingdetails.v2.StakingDetailsControllerContract$ModalStep;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.impl.ui.custom_statement.articles.CustomStatementArticle;
import com.revolut.feature.statements.impl.ui.custom_statement.flow.CustomStatementFlowContract$Step;
import com.revolut.feature.statements.impl.ui.custom_statement.screen.CustomStatementScreen;
import com.revolut.feature.statements.impl.ui.custom_statement.screen.CustomStatementScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.room.selection.TravelHotelsRoomsSelectionFlowContract$Step;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.TravelHotelsCheckoutScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.bottomsheet.bed_options_selection.TravelHotelsBedOptionsSelectionScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.bottomsheet.bed_options_selection.TravelHotelsBedOptionsSelectionScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.bottomsheet.card_selection_screen.TravelHotelsCardSelectionScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.bottomsheet.card_selection_screen.TravelHotelsCardSelectionScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.amendment.TravelHotelsRoomsSelectionAmendmentScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.booking.TravelHotelsRoomsSelectionBookingScreen;
import com.revolut.feature_crypto_order_flow.impl.exchange.bottom_sheet.balance_breakdown.BalanceBreakdownBottomSheetContract$ModalStep;
import com.revolut.feature_travel_hotels_models.property.room.BedOptionSelection;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.freelancer.revolut_shop.impl.ui.flow.RevolutShopAddressFlow;
import com.revolut.retail.feature.freelancer.revolut_shop.impl.ui.flow.RevolutShopAddressFlowContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import deg.g;
import ft3.a1;
import ft3.d1;
import ft3.e;
import ft3.g1;
import ft3.h1;
import ft3.q0;
import grl.k9;
import grl.r2;
import hs3.x0;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import oki.h;
import s7a.c0;
import s7a.z;
import t05.o;
import t05.p;
import t05.q;
import t05.r;
import t05.s;
import t05.t;
import vkm.j2;
import vo8.i0;
import vq5.x;
import vx9.v;
import w6c.d;
import wbg.g0;
import wbg.u0;
import zhm.a0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f292523b;

    public /* synthetic */ s(Object obj2, int i) {
        this.f292522a = i;
        this.f292523b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12, types: [com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Object profileScannerScreen;
        ViewController revolutShopAddressFlow;
        Clause clause;
        long j2;
        long j3;
        Object next;
        int i = this.f292522a;
        int i2 = 12;
        final int i3 = 2;
        final int i5 = 1;
        final int i6 = 0;
        Object obj4 = this.f292523b;
        switch (i) {
            case 0:
                com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.d dVar = (com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.d) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SetTrustedLocationScreenContract$Step step = (SetTrustedLocationScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!Intrinsics.f(step, SetTrustedLocationScreenContract$Step.LocationPermission.f85684a)) {
                    throw new NoWhenBranchMatchedException();
                }
                PermissionsController permissionsControllerA = buc.a.a(dVar.u);
                x block = new x(dVar, 22);
                Intrinsics.checkNotNullParameter(block, "block");
                permissionsControllerA.H = block;
                return permissionsControllerA;
            case 1:
                com.revolut.feature.payments.profile.impl.ui_kompot.flow.b bVar = (com.revolut.feature.payments.profile.impl.ui_kompot.flow.b) obj4;
                PaymentProfileFlowContract$InputData paymentProfileFlowContract$InputData = bVar.o;
                ali.b PagerCoordinator = (ali.b) obj2;
                PaymentProfileFlowContract$Step step2 = (PaymentProfileFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (Intrinsics.f(step2, PaymentProfileFlowContract$Step.Details.f79631a)) {
                    ty1.b bVar2 = (ty1.b) bVar.f79640s;
                    bVar2.getClass();
                    if (bVar2.b(uw1.f.UPI)) {
                        return bVar.e1(xe2.c.f304525a);
                    }
                    String str = paymentProfileFlowContract$InputData.f79627b.f;
                    if (str == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    profileScannerScreen = new ProfileDetailsCard(new ProfileDetailsCardContract$InputData(str));
                } else {
                    if (!Intrinsics.f(step2, PaymentProfileFlowContract$Step.Scanner.f79633a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    profileScannerScreen = new ProfileScannerScreen(new ProfileScannerScreenContract$InputData(paymentProfileFlowContract$InputData.f79627b));
                }
                return profileScannerScreen;
            case 2:
                com.revolut.feature.staking.impl.stakingdetails.v2.a aVar = (com.revolut.feature.staking.impl.stakingdetails.v2.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                StakingDetailsControllerContract$ModalStep step3 = (StakingDetailsControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof StakingDetailsControllerContract$ModalStep.RiskDisclosure) {
                    return aVar.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("crypto-risk-disclosure-uae")), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60));
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                com.revolut.feature_crypto_order_flow.impl.exchange.bottom_sheet.balance_breakdown.a aVar2 = (com.revolut.feature_crypto_order_flow.impl.exchange.bottom_sheet.balance_breakdown.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                BalanceBreakdownBottomSheetContract$ModalStep step4 = (BalanceBreakdownBottomSheetContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof BalanceBreakdownBottomSheetContract$ModalStep.RevXOrdersBreakdown) {
                    return aVar2.e1(new t4c.b(((BalanceBreakdownBottomSheetContract$ModalStep.RevXOrdersBreakdown) step4).f96740a));
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                com.revolut.feature.freelancer.impl.ui.perks.flow.b bVar3 = (com.revolut.feature.freelancer.impl.ui.perks.flow.b) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                FreelancerPerksFlowContract$Step step5 = (FreelancerPerksFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof FreelancerPerksFlowContract$Step.PerksDetails) {
                    return new FreelancerPerksDetailsScreen(new FreelancerPerksDetailsScreenContract$InputData(((FreelancerPerksFlowContract$Step.PerksDetails) step5).f74009a));
                }
                if (step5 instanceof FreelancerPerksFlowContract$Step.PerksList) {
                    FreelancerPerksListScreen freelancerPerksListScreen = new FreelancerPerksListScreen();
                    vz6.c block2 = new vz6.c(bVar3, i5);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    freelancerPerksListScreen.H = block2;
                    return freelancerPerksListScreen;
                }
                if (!(step5 instanceof FreelancerPerksFlowContract$Step.PerksProductArticle)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE1 = bVar3.e1(new ProductArticleDescriptor(((FreelancerPerksFlowContract$Step.PerksProductArticle) step5).f74011a, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, null, null, false, 60));
                vz6.c block3 = new vz6.c(bVar3, i3);
                Intrinsics.checkNotNullParameter(block3, "block");
                viewControllerE1.H = block3;
                return viewControllerE1;
            case 5:
                com.revolut.feature.statements.impl.ui.custom_statement.flow.b bVar4 = (com.revolut.feature.statements.impl.ui.custom_statement.flow.b) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                CustomStatementFlowContract$Step step6 = (CustomStatementFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof CustomStatementFlowContract$Step.ProductArticle) {
                    ViewController viewControllerE12 = bVar4.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(CustomStatementArticle.CUSTOM_STATEMENT)), SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, false, null, null, false, 60));
                    vx9.b block4 = new vx9.b(bVar4, 14);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    viewControllerE12.H = block4;
                    return viewControllerE12;
                }
                if (!(step6 instanceof CustomStatementFlowContract$Step.CustomStatement)) {
                    throw new NoWhenBranchMatchedException();
                }
                wi0.b bVar5 = ((CustomStatementFlowContract$Step.CustomStatement) step6).f88328a;
                wi0.b.Companion.getClass();
                return new CustomStatementScreen(new CustomStatementScreenContract$InputData(Intrinsics.f(bVar5, wi0.b.O) ? new TextLocalisedClause(R$string.statements_group_consolidated_statement_co_title, null, null, 14) : new TextLocalisedClause(R$string.statements_group_consolidated_screen_title, null, null, 14)));
            case 6:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new vzk.n(vzk.x.c(false), vzk.x.d(((vzk.g) obj4).d), (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null)));
            case 7:
                final com.revolut.feature.credit.health.impl.ui.flow.a aVar3 = (com.revolut.feature.credit.health.impl.ui.flow.a) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                CreditHealthFlowContract$Step step7 = (CreditHealthFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (Intrinsics.f(step7, CreditHealthFlowContract$Step.Dashboard.f69995a)) {
                    DashboardScreen dashboardScreen = new DashboardScreen();
                    Function1 block5 = new Function1() { // from class: w05.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    t result = (t) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof r;
                                    com.revolut.feature.credit.health.impl.ui.flow.a aVar4 = aVar3;
                                    if (z) {
                                        h.t2(aVar4, aVar4.o, new CreditHealthFlowContract$Step.Insights(((r) result).f266929a), false, null, false, 14);
                                    } else if (result instanceof q) {
                                        h.w2(aVar4.o, new CreditHealthFlowContract$Step.ModalStep.InsightDetailed(((q) result).f266928a), ModalDestination.Style.POPUP.f98311a);
                                    } else if (result instanceof p) {
                                        h.t2(aVar4, aVar4.o, new CreditHealthFlowContract$Step.LearnMore(((p) result).f266927a), false, null, false, 14);
                                    } else if (result instanceof o) {
                                        a1 a1Var = new a1(r2.CREDIT_HEALTH, null, null, null, null, 30);
                                        e eVar = q0.Companion;
                                        d1 d1Var = ((o) result).f266926a.f69957a;
                                        eVar.getClass();
                                        aVar4.C1(new BridgeDestination(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(a1Var, e.a(d1Var, null), wp3.a.OPEN_EXISTING_APPLICATION, null, null, null, null, null, null, null, 2040))));
                                    } else {
                                        if (!(result instanceof s)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        r2 r2Var = r2.CREDIT_HEALTH;
                                        PreapprovedOffer preapprovedOffer = ((s) result).f266930a;
                                        a1 a1Var2 = new a1(r2Var, null, null, md6.s.A(preapprovedOffer.f69990a.f137812c), null, 22);
                                        d1 d1Var2 = preapprovedOffer.f69990a;
                                        aVar4.C1(new BridgeDestination(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(a1Var2, g1.d(d1Var2, null, d1Var2.f137812c, 1), null, null, null, null, null, null, null, null, 2044))));
                                    }
                                    return Unit.f186387a;
                                default:
                                    j result2 = (j) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.w2(aVar3.o, new CreditHealthFlowContract$Step.ModalStep.InsightDetailed(((i) result2).f537a), ModalDestination.Style.POPUP.f98311a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block5, "block");
                    dashboardScreen.H = block5;
                    return dashboardScreen;
                }
                if (step7 instanceof CreditHealthFlowContract$Step.Insights) {
                    InsightsScreen insightsScreen = new InsightsScreen(new InsightsScreenContract$InputData(((CreditHealthFlowContract$Step.Insights) step7).f69996a));
                    Function1 block6 = new Function1() { // from class: w05.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i5) {
                                case 0:
                                    t result = (t) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof r;
                                    com.revolut.feature.credit.health.impl.ui.flow.a aVar4 = aVar3;
                                    if (z) {
                                        h.t2(aVar4, aVar4.o, new CreditHealthFlowContract$Step.Insights(((r) result).f266929a), false, null, false, 14);
                                    } else if (result instanceof q) {
                                        h.w2(aVar4.o, new CreditHealthFlowContract$Step.ModalStep.InsightDetailed(((q) result).f266928a), ModalDestination.Style.POPUP.f98311a);
                                    } else if (result instanceof p) {
                                        h.t2(aVar4, aVar4.o, new CreditHealthFlowContract$Step.LearnMore(((p) result).f266927a), false, null, false, 14);
                                    } else if (result instanceof o) {
                                        a1 a1Var = new a1(r2.CREDIT_HEALTH, null, null, null, null, 30);
                                        e eVar = q0.Companion;
                                        d1 d1Var = ((o) result).f266926a.f69957a;
                                        eVar.getClass();
                                        aVar4.C1(new BridgeDestination(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(a1Var, e.a(d1Var, null), wp3.a.OPEN_EXISTING_APPLICATION, null, null, null, null, null, null, null, 2040))));
                                    } else {
                                        if (!(result instanceof s)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        r2 r2Var = r2.CREDIT_HEALTH;
                                        PreapprovedOffer preapprovedOffer = ((s) result).f266930a;
                                        a1 a1Var2 = new a1(r2Var, null, null, md6.s.A(preapprovedOffer.f69990a.f137812c), null, 22);
                                        d1 d1Var2 = preapprovedOffer.f69990a;
                                        aVar4.C1(new BridgeDestination(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(a1Var2, g1.d(d1Var2, null, d1Var2.f137812c, 1), null, null, null, null, null, null, null, null, 2044))));
                                    }
                                    return Unit.f186387a;
                                default:
                                    j result2 = (j) obj5;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.w2(aVar3.o, new CreditHealthFlowContract$Step.ModalStep.InsightDetailed(((i) result2).f537a), ModalDestination.Style.POPUP.f98311a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    insightsScreen.H = block6;
                    return insightsScreen;
                }
                if (step7 instanceof CreditHealthFlowContract$Step.LearnMore) {
                    return new LearnMoreScreen(new LearnMoreScreenContract$InputData(((CreditHealthFlowContract$Step.LearnMore) step7).f69997a));
                }
                if (step7 instanceof CreditHealthFlowContract$Step.ModalStep.InsightDetailed) {
                    return new InsightDetailedScreen(new InsightDetailedScreenContract$InputData(((CreditHealthFlowContract$Step.ModalStep.InsightDetailed) step7).f69998a));
                }
                throw new NoWhenBranchMatchedException();
            case 8:
                com.revolut.feature.defi.accounts.impl.ui.creation.flow.a aVar4 = (com.revolut.feature.defi.accounts.impl.ui.creation.flow.a) obj4;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                DeFiAccountCreationFlowContract$Step step8 = (DeFiAccountCreationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (Intrinsics.f(step8, DeFiAccountCreationFlowContract$Step.Disclaimer.f71647a)) {
                    DeFiDisclaimerScreenController deFiDisclaimerScreenController = new DeFiDisclaimerScreenController();
                    vsl.f block7 = new vsl.f(1, aVar4, com.revolut.feature.defi.accounts.impl.ui.creation.flow.a.class, "handleDisclaimerScreenOutput", "handleDisclaimerScreenOutput(Lcom/revolut/feature/defi/accounts/impl/ui/creation/disclaimer/DeFiDisclaimerScreenContract$Output;)V", 0, 10);
                    Intrinsics.checkNotNullParameter(block7, "block");
                    deFiDisclaimerScreenController.H = block7;
                    return deFiDisclaimerScreenController;
                }
                if (!Intrinsics.f(step8, DeFiAccountCreationFlowContract$Step.Confirmation.f71646a)) {
                    throw new NoWhenBranchMatchedException();
                }
                DeFiConfirmationScreenController deFiConfirmationScreenController = new DeFiConfirmationScreenController();
                vsl.f block8 = new vsl.f(1, aVar4, com.revolut.feature.defi.accounts.impl.ui.creation.flow.a.class, "handleConfirmationScreenOutput", "handleConfirmationScreenOutput(Lcom/revolut/feature/defi/accounts/impl/ui/creation/confirmation/DeFiConfirmationScreenContract$Output;)V", 0, 11);
                Intrinsics.checkNotNullParameter(block8, "block");
                deFiConfirmationScreenController.H = block8;
                return deFiConfirmationScreenController;
            case 9:
                com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.b bVar6 = (com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                RecurringPaymentsManageSplitContract$ModalStep step9 = (RecurringPaymentsManageSplitContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof RecurringPaymentsManageSplitContract$ModalStep.RemoveParticipant) {
                    RecurringPaymentsManageSplitContract$ModalStep.RemoveParticipant removeParticipant = (RecurringPaymentsManageSplitContract$ModalStep.RemoveParticipant) step9;
                    RecurringPaymentsManageSplitDialogScreen recurringPaymentsManageSplitDialogScreen = new RecurringPaymentsManageSplitDialogScreen(new RecurringPaymentsManageSplitDialogContract$InputData.RemoveParticipant(removeParticipant.f79881a, removeParticipant.f79882b, removeParticipant.f79883c));
                    vz1.h block9 = new vz1.h(i2);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    recurringPaymentsManageSplitDialogScreen.H = block9;
                    return recurringPaymentsManageSplitDialogScreen;
                }
                if (!(step9 instanceof RecurringPaymentsManageSplitContract$ModalStep.CancelSplit)) {
                    if (step9 instanceof RecurringPaymentsManageSplitContract$ModalStep.UpdateSplit) {
                        return new RecurringSplitFlow(new RecurringSplitFlowContract$InputData(bVar6.o.f79879a, null));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                RecurringPaymentsManageSplitDialogScreen recurringPaymentsManageSplitDialogScreen2 = new RecurringPaymentsManageSplitDialogScreen(new RecurringPaymentsManageSplitDialogContract$InputData.CancelSplit(((RecurringPaymentsManageSplitContract$ModalStep.CancelSplit) step9).f79880a));
                vx9.b block10 = new vx9.b(bVar6, 22);
                Intrinsics.checkNotNullParameter(block10, "block");
                recurringPaymentsManageSplitDialogScreen2.H = block10;
                return recurringPaymentsManageSplitDialogScreen2;
            case 10:
                return Boolean.valueOf(AndroidParagraph.getRangeForRect_8_6BmAI$lambda$0((TextInclusionStrategy) obj4, (RectF) obj2, (RectF) obj3));
            case 11:
                DraftRoutingKey routingKey = (DraftRoutingKey) obj2;
                o30.c draft = (o30.c) obj3;
                Intrinsics.checkNotNullParameter(routingKey, "routingKey");
                Intrinsics.checkNotNullParameter(draft, "draft");
                ((w20.e) obj4).f293914c.f(w20.e.b(routingKey), draft);
                return Unit.f186387a;
            case 12:
                com.revolut.feature.retail.cfd.impl.flows.order.c cVar = (com.revolut.feature.retail.cfd.impl.flows.order.c) obj4;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                CfdOrderFlowContract$Step step10 = (CfdOrderFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                t2b.c cVar2 = cVar.f82185p;
                qki.d dVar2 = cVar.f82189t;
                w2b.d dVar3 = cVar.o;
                if (cVar.f226127l && cVar2.f267528a.getValue() == null) {
                    cVar2.setValue(((CfdOrderFlowContract$State) ((j2) dVar2.f22677a).getValue()).f82173b);
                }
                if (step10 instanceof CfdOrderFlowContract$Step.Order) {
                    CfdOrderFlowContract$Step.Order order = (CfdOrderFlowContract$Step.Order) step10;
                    CfdOrderFormController cfdOrderFormController = new CfdOrderFormController(new b4b.p(dVar3.f294013a, dVar3.f294014b, dVar3.f294015c, order.f82175b, order.f82174a, dVar3.e));
                    com.revolut.feature.retail.cfd.impl.flows.order.b block11 = new com.revolut.feature.retail.cfd.impl.flows.order.b(1, 0, com.revolut.feature.retail.cfd.impl.flows.order.c.class, cVar, "handleOrderFormResult", "handleOrderFormResult(Lcom/revolut/feature/retail/cfd/impl/screens/order/v2/CfdOrderFormControllerContract$Output;)V");
                    Intrinsics.checkNotNullParameter(block11, "block");
                    cfdOrderFormController.H = block11;
                    return cfdOrderFormController;
                }
                if (step10 instanceof CfdOrderFlowContract$Step.OrderReview) {
                    CfdOrderFlowContract$Step.OrderReview orderReview = (CfdOrderFlowContract$Step.OrderReview) step10;
                    CfdOrderReviewScreen cfdOrderReviewScreen = new CfdOrderReviewScreen(new CfdOrderReviewScreenContract$InputData(dVar3.f294015c, orderReview.f82176a, dVar3.f294014b, ((CfdOrderFlowContract$State) ((j2) dVar2.f22677a).getValue()).f82172a, null, orderReview.f82177b, orderReview.d, orderReview.f82178c, orderReview.e, orderReview.f, orderReview.f82179g, orderReview.f82180h));
                    vx9.b bVar7 = new vx9.b(cVar, 25);
                    Intrinsics.checkNotNullParameter(bVar7, "<set-?>");
                    cfdOrderReviewScreen.H = bVar7;
                    return cfdOrderReviewScreen;
                }
                if (step10 instanceof CfdOrderFlowContract$Step.StopLimitScreen) {
                    CfdOrderFlowContract$Step.StopLimitScreen stopLimitScreen = (CfdOrderFlowContract$Step.StopLimitScreen) step10;
                    ViewController viewControllerE13 = cVar.e1(new hdf.a(dVar3.f294014b.f214596b, dVar3.f294013a, stopLimitScreen.f82182b, stopLimitScreen.f82181a, null));
                    vrl.n block12 = new vrl.n(cVar, stopLimitScreen, 27);
                    Intrinsics.checkNotNullParameter(block12, "block");
                    viewControllerE13.H = block12;
                    return viewControllerE13;
                }
                if (!(step10 instanceof CfdOrderFlowContract$Step.Tutorial)) {
                    throw new NoWhenBranchMatchedException();
                }
                CfdOrderFlowContract$Step.Tutorial tutorial = (CfdOrderFlowContract$Step.Tutorial) step10;
                ViewController viewControllerE14 = cVar.e1(new idf.a(dVar3.f294013a, tutorial.f82183a, dVar3.f294014b));
                vrl.n block13 = new vrl.n(cVar, tutorial, 28);
                Intrinsics.checkNotNullParameter(block13, "block");
                viewControllerE14.H = block13;
                return viewControllerE14;
            case 13:
                com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow.b bVar8 = (com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow.b) obj4;
                yki.l FlowCoordinator4 = (yki.l) obj2;
                CeFiToDeFiFlowContract$Step step11 = (CeFiToDeFiFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator4, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (Intrinsics.f(step11, CeFiToDeFiFlowContract$Step.AssetSelection.f71750a)) {
                    CeFiToDeFiAssetPickerScreen ceFiToDeFiAssetPickerScreen = new CeFiToDeFiAssetPickerScreen();
                    w36.d block14 = new w36.d(bVar8, i5);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    ceFiToDeFiAssetPickerScreen.H = block14;
                    return ceFiToDeFiAssetPickerScreen;
                }
                if (!(step11 instanceof CeFiToDeFiFlowContract$Step.Exchange)) {
                    throw new NoWhenBranchMatchedException();
                }
                DeFiExchangeFlowController deFiExchangeFlowController = new DeFiExchangeFlowController(((CeFiToDeFiFlowContract$Step.Exchange) step11).f71751a);
                w36.d block15 = new w36.d(bVar8, i6);
                Intrinsics.checkNotNullParameter(block15, "block");
                deFiExchangeFlowController.H = block15;
                return deFiExchangeFlowController;
            case 14:
                final com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar5 = (com.revolut.feature.revolut_shop.ui.screen.checkout.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CheckoutScreenContract$ModalStep step12 = (CheckoutScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (Intrinsics.f(step12, CheckoutScreenContract$ModalStep.SelectPaymentMethod.f84225a)) {
                    w3c.e eVar = (w3c.e) ((j2) aVar5.f84231w.f22677a).getValue();
                    PaymentMethodScreen paymentMethodScreen = new PaymentMethodScreen(new PaymentMethodScreenContract$InputData((dj0.d) zi0.c.I(ebm.a.c(eVar)), ((RevolutShopAccount) zi0.c.I(eVar.f294272c)).f84198a, (List) zi0.c.I(eVar.f294271b)));
                    Function1 block16 = new Function1() { // from class: w3c.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            Data data;
                            RevolutShopAccount revolutShopAccount;
                            Object next2;
                            switch (i5) {
                                case 0:
                                    d4c.f it8 = (d4c.f) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (it8 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar6 = aVar5;
                                    aVar6.H2(aVar6.f84231w, new vx9.b(it8, 29));
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar7 = aVar5;
                                    y yVar = aVar7.f84231w;
                                    m4c.e result = (m4c.e) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    String accountId = result.f202694a;
                                    Data data2 = ((e) ((j2) yVar.f22677a).getValue()).f294271b;
                                    try {
                                        Object content = data2.getContent();
                                        if (content != null) {
                                            ArrayList arrayList = new ArrayList();
                                            Iterator it9 = ((List) content).iterator();
                                            while (it9.hasNext()) {
                                                a0.x(((RevolutShopPaymentAccountSection) it9.next()).f84202b, arrayList);
                                            }
                                            Iterator it10 = arrayList.iterator();
                                            while (true) {
                                                if (it10.hasNext()) {
                                                    next2 = it10.next();
                                                    if (Intrinsics.f(((RevolutShopAccount) next2).f84198a, accountId)) {
                                                    }
                                                } else {
                                                    next2 = null;
                                                }
                                            }
                                            revolutShopAccount = (RevolutShopAccount) next2;
                                        } else {
                                            revolutShopAccount = null;
                                        }
                                        data = new Data(revolutShopAccount, data2.getError(), data2.getLoading());
                                        break;
                                    } catch (Throwable th10) {
                                        data = new Data(null, th10, data2.getLoading());
                                    }
                                    aVar7.H2(yVar, new i0(data, 23));
                                    n3c.a aVar8 = aVar7.f84228r;
                                    aVar8.getClass();
                                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                                    k3c.b bVar9 = aVar8.f211979b;
                                    bVar9.getClass();
                                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                                    bVar9.f180658a.f("SELECTED_ACCOUNT_ID_KEY", accountId);
                                    return Unit.f186387a;
                                default:
                                    RevolutShopAddressFlowProvider$OutputData it11 = (RevolutShopAddressFlowProvider$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(it11, "it");
                                    com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar9 = aVar5;
                                    aVar9.H2(aVar9.f84231w, new n(it11, 0));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block16, "block");
                    paymentMethodScreen.H = block16;
                    return paymentMethodScreen;
                }
                if (step12 instanceof CheckoutScreenContract$ModalStep.SelectDeliveryAddress) {
                    revolutShopAddressFlow = new DeliveryAddressScreen(new DeliveryAddressScreenContract$InputData(((CheckoutScreenContract$ModalStep.SelectDeliveryAddress) step12).f84224a));
                    Function1 block17 = new Function1() { // from class: w3c.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            Data data;
                            RevolutShopAccount revolutShopAccount;
                            Object next2;
                            switch (i6) {
                                case 0:
                                    d4c.f it8 = (d4c.f) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (it8 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar6 = aVar5;
                                    aVar6.H2(aVar6.f84231w, new vx9.b(it8, 29));
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar7 = aVar5;
                                    y yVar = aVar7.f84231w;
                                    m4c.e result = (m4c.e) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    String accountId = result.f202694a;
                                    Data data2 = ((e) ((j2) yVar.f22677a).getValue()).f294271b;
                                    try {
                                        Object content = data2.getContent();
                                        if (content != null) {
                                            ArrayList arrayList = new ArrayList();
                                            Iterator it9 = ((List) content).iterator();
                                            while (it9.hasNext()) {
                                                a0.x(((RevolutShopPaymentAccountSection) it9.next()).f84202b, arrayList);
                                            }
                                            Iterator it10 = arrayList.iterator();
                                            while (true) {
                                                if (it10.hasNext()) {
                                                    next2 = it10.next();
                                                    if (Intrinsics.f(((RevolutShopAccount) next2).f84198a, accountId)) {
                                                    }
                                                } else {
                                                    next2 = null;
                                                }
                                            }
                                            revolutShopAccount = (RevolutShopAccount) next2;
                                        } else {
                                            revolutShopAccount = null;
                                        }
                                        data = new Data(revolutShopAccount, data2.getError(), data2.getLoading());
                                        break;
                                    } catch (Throwable th10) {
                                        data = new Data(null, th10, data2.getLoading());
                                    }
                                    aVar7.H2(yVar, new i0(data, 23));
                                    n3c.a aVar8 = aVar7.f84228r;
                                    aVar8.getClass();
                                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                                    k3c.b bVar9 = aVar8.f211979b;
                                    bVar9.getClass();
                                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                                    bVar9.f180658a.f("SELECTED_ACCOUNT_ID_KEY", accountId);
                                    return Unit.f186387a;
                                default:
                                    RevolutShopAddressFlowProvider$OutputData it11 = (RevolutShopAddressFlowProvider$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(it11, "it");
                                    com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar9 = aVar5;
                                    aVar9.H2(aVar9.f84231w, new n(it11, 0));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block17, "block");
                    revolutShopAddressFlow.H = block17;
                } else {
                    if (!(step12 instanceof CheckoutScreenContract$ModalStep.AddDeliveryAddress)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Address address = ((CheckoutScreenContract$ModalStep.AddDeliveryAddress) step12).f84223a;
                    mpj.b bVar9 = aVar5.f84230t;
                    o3c.c addressValidator = aVar5.u;
                    bVar9.getClass();
                    Intrinsics.checkNotNullParameter(addressValidator, "addressValidator");
                    revolutShopAddressFlow = new RevolutShopAddressFlow(new RevolutShopAddressFlowContract$InputData(address), addressValidator);
                    Function1 block18 = new Function1() { // from class: w3c.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            Data data;
                            RevolutShopAccount revolutShopAccount;
                            Object next2;
                            switch (i3) {
                                case 0:
                                    d4c.f it8 = (d4c.f) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    if (it8 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar6 = aVar5;
                                    aVar6.H2(aVar6.f84231w, new vx9.b(it8, 29));
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar7 = aVar5;
                                    y yVar = aVar7.f84231w;
                                    m4c.e result = (m4c.e) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    String accountId = result.f202694a;
                                    Data data2 = ((e) ((j2) yVar.f22677a).getValue()).f294271b;
                                    try {
                                        Object content = data2.getContent();
                                        if (content != null) {
                                            ArrayList arrayList = new ArrayList();
                                            Iterator it9 = ((List) content).iterator();
                                            while (it9.hasNext()) {
                                                a0.x(((RevolutShopPaymentAccountSection) it9.next()).f84202b, arrayList);
                                            }
                                            Iterator it10 = arrayList.iterator();
                                            while (true) {
                                                if (it10.hasNext()) {
                                                    next2 = it10.next();
                                                    if (Intrinsics.f(((RevolutShopAccount) next2).f84198a, accountId)) {
                                                    }
                                                } else {
                                                    next2 = null;
                                                }
                                            }
                                            revolutShopAccount = (RevolutShopAccount) next2;
                                        } else {
                                            revolutShopAccount = null;
                                        }
                                        data = new Data(revolutShopAccount, data2.getError(), data2.getLoading());
                                        break;
                                    } catch (Throwable th10) {
                                        data = new Data(null, th10, data2.getLoading());
                                    }
                                    aVar7.H2(yVar, new i0(data, 23));
                                    n3c.a aVar8 = aVar7.f84228r;
                                    aVar8.getClass();
                                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                                    k3c.b bVar92 = aVar8.f211979b;
                                    bVar92.getClass();
                                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                                    bVar92.f180658a.f("SELECTED_ACCOUNT_ID_KEY", accountId);
                                    return Unit.f186387a;
                                default:
                                    RevolutShopAddressFlowProvider$OutputData it11 = (RevolutShopAddressFlowProvider$OutputData) obj5;
                                    Intrinsics.checkNotNullParameter(it11, "it");
                                    com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar9 = aVar5;
                                    aVar9.H2(aVar9.f84231w, new n(it11, 0));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block18, "block");
                    revolutShopAddressFlow.H = block18;
                }
                return revolutShopAddressFlow;
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                z4i.d dVar4 = (z4i.d) ((bof.r) obj4).f17430c;
                List listC = zhm.u.c(new FullScreenStateDelegate.Model("ERROR_TRANSACTION_BREAKDOWN_STATE", new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, null, null, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), false, null, null, true, 0, 0, 31708));
                Clause clause2 = dVar4.f319387a.f97175a.f97054h;
                return new cii.b(null, listC, clause2 != null ? new lw0.a(clause2, null, null, null, false, 30) : null);
            case 16:
                com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b bVar10 = (com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b) obj4;
                CongratulationFlowContract$InputData congratulationFlowContract$InputData = bVar10.f67257q;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                CongratulationFlowContract$Step step13 = (CongratulationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!(step13 instanceof CongratulationFlowContract$Step.Prompt)) {
                    throw new NoWhenBranchMatchedException();
                }
                CongratulationsScreenConfig.Prompt prompt = ((CongratulationFlowContract$Step.Prompt) step13).f67254a;
                if (prompt.f) {
                    CongratulationsContentScreen congratulationsContentScreen = new CongratulationsContentScreen(new CongratulationsContentScreenContract$InputData(congratulationFlowContract$InputData.f67252a));
                    w3c.n block19 = new w3c.n(bVar10, 7);
                    Intrinsics.checkNotNullParameter(block19, "block");
                    congratulationsContentScreen.H = block19;
                    return congratulationsContentScreen;
                }
                h1 h1VarF = w0.F(congratulationFlowContract$InputData.f67252a);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.congratulations_template_prompt_title, zhm.u.c(prompt.f66348a), null, 12);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.congratulations_template_prompt_subtitle, zhm.u.c(prompt.f66349b), null, 12);
                PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.congratulations_template_prompt_action, zhm.u.c(prompt.f66350c), null, 12), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
                Image image = prompt.d;
                CongratulationsScreenConfig.CongratulationsInfoDialog congratulationsInfoDialog = prompt.e;
                PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(ug4.a.a(textLocalisedClause, textLocalisedClause2, image, congratulationFlowContract$InputData.f67252a, null, ld.CAPTION, button, null, (congratulationsInfoDialog == null || (clause = congratulationsInfoDialog.f66344b) == null) ? null : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.congratulations_template_prompt_link, zhm.u.c(clause), null, 12), 3696));
                v block20 = new v(bVar10, 8, prompt, h1VarF);
                Intrinsics.checkNotNullParameter(block20, "block");
                promptMarketingScreen.H = block20;
                return promptMarketingScreen;
            case 17:
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c cVar3 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CobrandedCardsValueReminderScreenContract$ModalStep step14 = (CobrandedCardsValueReminderScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (step14 instanceof CobrandedCardsValueReminderScreenContract$ModalStep.CardTerminationInfo) {
                    return new CobrandedCardsCardTerminationInfoScreen(((CobrandedCardsValueReminderScreenContract$ModalStep.CardTerminationInfo) step14).f82615a);
                }
                if (step14 instanceof CobrandedCardsValueReminderScreenContract$ModalStep.DowngradeConfirmation) {
                    return com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c.I2(((CobrandedCardsValueReminderScreenContract$ModalStep.DowngradeConfirmation) step14).f82618c, new vqd.b(cVar3, step14, 28), new u3a.p(cVar3, step14, 15));
                }
                if (step14 instanceof CobrandedCardsValueReminderScreenContract$ModalStep.SwitchPlanConfirmation) {
                    return com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c.I2(((CobrandedCardsValueReminderScreenContract$ModalStep.SwitchPlanConfirmation) step14).f82619a, new w7b.o(cVar3, i6), new w6b.a(5));
                }
                if (step14 instanceof CobrandedCardsValueReminderScreenContract$ModalStep.TerminateConfirmation) {
                    return com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c.I2(((CobrandedCardsValueReminderScreenContract$ModalStep.TerminateConfirmation) step14).f82620a, new w7b.o(cVar3, i5), new rch.o(2, cVar3, com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c.class, "handleTerminateActionItem", "handleTerminateActionItem(Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsValueReminderItemAction;Ljava/lang/String;)V", 0, 20));
                }
                throw new NoWhenBranchMatchedException();
            case 18:
                final com.revolut.feature.shared.help_centre.impl.faq.flow.b bVar11 = (com.revolut.feature.shared.help_centre.impl.faq.flow.b) obj4;
                yki.b LazyFlowCoordinator4 = (yki.b) obj2;
                SharedFaqLazyFlowContract$Step step15 = (SharedFaqLazyFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator4, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (step15 instanceof SharedFaqLazyFlowContract$Step.Faq) {
                    FaqFlow faqFlow = new FaqFlow(new SharedFaqDestination.InputData(new SharedFaqDestination.StartPoint.FaqByNode(((SharedFaqLazyFlowContract$Step.Faq) step15).f86209a, bVar11.o.f86208b), new SharedFaqDestination.PassthroughData(null, false, false, 7)));
                    Function1 function1 = new Function1() { // from class: w7d.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    aii.q it8 = (aii.q) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    bVar11.C2(it8);
                                    return Unit.f186387a;
                                case 1:
                                    if (obj5 != null) {
                                        throw new ClassCastException();
                                    }
                                    Intrinsics.checkNotNullParameter(null, "it");
                                    bVar11.C2(aii.q.f5292a);
                                    return Unit.f186387a;
                                default:
                                    Intrinsics.checkNotNullParameter((aii.q) obj5, "it");
                                    bVar11.C2(aii.q.f5292a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function1, "<set-?>");
                    faqFlow.J = function1;
                    return faqFlow;
                }
                if (Intrinsics.f(step15, SharedFaqLazyFlowContract$Step.HelpCenter.f86210a)) {
                    HelpFlow helpFlow = new HelpFlow(new HelpFlowContract$InputData(0));
                    Function1 function12 = new Function1() { // from class: w7d.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i5) {
                                case 0:
                                    aii.q it8 = (aii.q) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    bVar11.C2(it8);
                                    return Unit.f186387a;
                                case 1:
                                    if (obj5 != null) {
                                        throw new ClassCastException();
                                    }
                                    Intrinsics.checkNotNullParameter(null, "it");
                                    bVar11.C2(aii.q.f5292a);
                                    return Unit.f186387a;
                                default:
                                    Intrinsics.checkNotNullParameter((aii.q) obj5, "it");
                                    bVar11.C2(aii.q.f5292a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function12, "<set-?>");
                    helpFlow.J = function12;
                    return helpFlow;
                }
                if (!(step15 instanceof SharedFaqLazyFlowContract$Step.RootFaq)) {
                    throw new NoWhenBranchMatchedException();
                }
                FaqFlow faqFlow2 = new FaqFlow(new SharedFaqDestination.InputData(new SharedFaqDestination.StartPoint.TopLevelFaq(null), ((SharedFaqLazyFlowContract$Step.RootFaq) step15).f86211a));
                Function1 function13 = new Function1() { // from class: w7d.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i3) {
                            case 0:
                                aii.q it8 = (aii.q) obj5;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                bVar11.C2(it8);
                                return Unit.f186387a;
                            case 1:
                                if (obj5 != null) {
                                    throw new ClassCastException();
                                }
                                Intrinsics.checkNotNullParameter(null, "it");
                                bVar11.C2(aii.q.f5292a);
                                return Unit.f186387a;
                            default:
                                Intrinsics.checkNotNullParameter((aii.q) obj5, "it");
                                bVar11.C2(aii.q.f5292a);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(function13, "<set-?>");
                faqFlow2.J = function13;
                return faqFlow2;
            case 19:
                final com.revolut.feature.revolutpay.impl.ui.flow.pay_with_any.a aVar6 = (com.revolut.feature.revolutpay.impl.ui.flow.pay_with_any.a) obj4;
                yki.l FlowCoordinator5 = (yki.l) obj2;
                PayWithAnyFlowContract$Step step16 = (PayWithAnyFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator5, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (!(step16 instanceof PayWithAnyFlowContract$Step.MoveMoney)) {
                    if (!Intrinsics.f(step16, PayWithAnyFlowContract$Step.PayWithAny.f84477a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PayWithAnyScreen payWithAnyScreen = new PayWithAnyScreen(aVar6.o);
                    Function1 block21 = new Function1() { // from class: w8c.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i5) {
                                case 0:
                                    y5i.b it8 = (y5i.b) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    aVar6.I2();
                                    return Unit.f186387a;
                                default:
                                    bec.p result = (bec.p) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof bec.j;
                                    com.revolut.feature.revolutpay.impl.ui.flow.pay_with_any.a aVar7 = aVar6;
                                    if (z) {
                                        aVar7.C2(w6c.a.f295411a);
                                    } else if (result instanceof k) {
                                        aVar7.C2(w6c.b.f295412a);
                                    } else if (result instanceof l) {
                                        l lVar = (l) result;
                                        h.t2(aVar7, aVar7.f84480r, new PayWithAnyFlowContract$Step.MoveMoney(lVar.f14794a, lVar.f14795b), true, null, false, 12);
                                    } else if (result instanceof m) {
                                        aVar7.C2(new w6c.c(((m) result).f14798a));
                                    } else if (result instanceof n) {
                                        n nVar = (n) result;
                                        aVar7.f84479q.e3(nVar.f14802b, aVar7.o.f84432c, nVar.f14801a, new vt3.a(aVar7, 14));
                                    } else {
                                        if (!(result instanceof bec.o)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar7.C2(new d(((bec.o) result).f14804a));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block21, "block");
                    payWithAnyScreen.H = block21;
                    return payWithAnyScreen;
                }
                r8c.a aVar7 = aVar6.f84478p;
                PayWithAnyFlowContract$Step.MoveMoney moveMoney = (PayWithAnyFlowContract$Step.MoveMoney) step16;
                PaymentMethod paymentMethod = moveMoney.f84475a;
                u6c.l lVarF = com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.k.f(paymentMethod);
                String strD = com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.k.d(paymentMethod);
                dj0.d dVar5 = moveMoney.f84476b;
                PaymentMethod.Pocket pocket = paymentMethod instanceof PaymentMethod.Pocket ? (PaymentMethod.Pocket) paymentMethod : null;
                dj0.d dVar6 = pocket != null ? pocket.i : null;
                if (dVar5 != null && dVar6 != null && Intrinsics.f(dVar5.f115083b, dVar6.f115083b)) {
                    j2 = 0;
                    long j5 = dVar5.f115082a - dVar6.f115082a;
                    if (j5 >= 0) {
                        j3 = j5;
                    }
                    aVar7.getClass();
                    ViewController viewControllerE15 = aVar6.e1(new y5i.a(r8c.a.a(lVarF, strD, j3), null, 14));
                    Function1 block22 = new Function1() { // from class: w8c.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    y5i.b it8 = (y5i.b) obj5;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    aVar6.I2();
                                    return Unit.f186387a;
                                default:
                                    bec.p result = (bec.p) obj5;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof bec.j;
                                    com.revolut.feature.revolutpay.impl.ui.flow.pay_with_any.a aVar72 = aVar6;
                                    if (z) {
                                        aVar72.C2(w6c.a.f295411a);
                                    } else if (result instanceof k) {
                                        aVar72.C2(w6c.b.f295412a);
                                    } else if (result instanceof l) {
                                        l lVar = (l) result;
                                        h.t2(aVar72, aVar72.f84480r, new PayWithAnyFlowContract$Step.MoveMoney(lVar.f14794a, lVar.f14795b), true, null, false, 12);
                                    } else if (result instanceof m) {
                                        aVar72.C2(new w6c.c(((m) result).f14798a));
                                    } else if (result instanceof n) {
                                        n nVar = (n) result;
                                        aVar72.f84479q.e3(nVar.f14802b, aVar72.o.f84432c, nVar.f14801a, new vt3.a(aVar72, 14));
                                    } else {
                                        if (!(result instanceof bec.o)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar72.C2(new d(((bec.o) result).f14804a));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block22, "block");
                    viewControllerE15.H = block22;
                    return viewControllerE15;
                }
                j2 = 0;
                j3 = j2;
                aVar7.getClass();
                ViewController viewControllerE152 = aVar6.e1(new y5i.a(r8c.a.a(lVarF, strD, j3), null, 14));
                Function1 block222 = new Function1() { // from class: w8c.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i6) {
                            case 0:
                                y5i.b it8 = (y5i.b) obj5;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                aVar6.I2();
                                return Unit.f186387a;
                            default:
                                bec.p result = (bec.p) obj5;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean z = result instanceof bec.j;
                                com.revolut.feature.revolutpay.impl.ui.flow.pay_with_any.a aVar72 = aVar6;
                                if (z) {
                                    aVar72.C2(w6c.a.f295411a);
                                } else if (result instanceof k) {
                                    aVar72.C2(w6c.b.f295412a);
                                } else if (result instanceof l) {
                                    l lVar = (l) result;
                                    h.t2(aVar72, aVar72.f84480r, new PayWithAnyFlowContract$Step.MoveMoney(lVar.f14794a, lVar.f14795b), true, null, false, 12);
                                } else if (result instanceof m) {
                                    aVar72.C2(new w6c.c(((m) result).f14798a));
                                } else if (result instanceof n) {
                                    n nVar = (n) result;
                                    aVar72.f84479q.e3(nVar.f14802b, aVar72.o.f84432c, nVar.f14801a, new vt3.a(aVar72, 14));
                                } else {
                                    if (!(result instanceof bec.o)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar72.C2(new d(((bec.o) result).f14804a));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block222, "block");
                viewControllerE152.H = block222;
                return viewControllerE152;
            case 20:
                final com.revolut.feature.retail.global_accounts.impl.onboarding.ui.a aVar8 = (com.revolut.feature.retail.global_accounts.impl.onboarding.ui.a) obj4;
                yki.l FlowCoordinator6 = (yki.l) obj2;
                CountryProfileOnboardingFlowContract$Step step17 = (CountryProfileOnboardingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator6, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step17, "step");
                if (!Intrinsics.f(step17, CountryProfileOnboardingFlowContract$Step.CreateCountryProfileArticle.f82642a)) {
                    if (!Intrinsics.f(step17, CountryProfileOnboardingFlowContract$Step.CountrySelector.f82641a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PickerController pickerController = new PickerController(new s7a.x(new TextLocalisedClause(com.revolut.feature.retail.global_accounts.impl.R$string.user_country_profiles_country_selection_title, null, null, 14), null, null, new TextLocalisedClause(com.revolut.feature.retail.global_accounts.impl.R$string.user_country_profiles_country_selection_sub_title, null, null, 14), false, null, new TextLocalisedClause(com.revolut.feature.retail.global_accounts.impl.R$string.user_country_profiles_country_selection_search, null, null, 14), null, null, false, null, null, null, null, false, null, null, new s7a.v(11, new TextLocalisedClause(com.revolut.feature.retail.global_accounts.impl.R$string.user_country_profiles_country_selection_country_is_missing_title, null, null, 14), null), null, null, 2013265370), aVar8.o);
                    Function1 block23 = new Function1() { // from class: w9b.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i5) {
                                case 0:
                                    yja.b outputData = (yja.b) obj5;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    int i21 = f.f295711a[outputData.ordinal()];
                                    com.revolut.feature.retail.global_accounts.impl.onboarding.ui.a aVar9 = aVar8;
                                    if (i21 == 1) {
                                        h.t2(aVar9, aVar9.f82645r, CountryProfileOnboardingFlowContract$Step.CountrySelector.f82641a, false, null, false, 12);
                                    } else {
                                        h.D2(aVar9.f82645r);
                                    }
                                    break;
                                default:
                                    s7a.a0 output = (s7a.a0) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    c0 c0Var = output.f260599a;
                                    boolean z = c0Var instanceof z;
                                    com.revolut.feature.retail.global_accounts.impl.onboarding.ui.a aVar10 = aVar8;
                                    if (z) {
                                        aVar10.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("cc234c11-d2e6-4049-ac4d-b60c44f79c5c", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                                    } else if (c0Var instanceof s7a.y) {
                                        aVar10.l2(new w3k.i(aVar10, ((s7a.y) c0Var).f260660a, null, 13), new yi5.b(26));
                                    } else if (c0Var instanceof c) {
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "CountryProfileOnboardingFlowModel", j6.a.q("Unexpected id provided by AvailableCountriesStateMapper: ", ((c) c0Var).f295708a), null, h0Var);
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block23, "block");
                    pickerController.H = block23;
                    return pickerController;
                }
                ProductArticleParams productArticleParams = new ProductArticleParams(new ProductArticleParams.ArticleReference.Id("global-account-profile-onboarding"));
                k9 k9Var = k9.Accounts;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                ViewController viewControllerE16 = aVar8.e1(new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, false, 48));
                Function1 block24 = new Function1() { // from class: w9b.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i6) {
                            case 0:
                                yja.b outputData = (yja.b) obj5;
                                Intrinsics.checkNotNullParameter(outputData, "outputData");
                                int i21 = f.f295711a[outputData.ordinal()];
                                com.revolut.feature.retail.global_accounts.impl.onboarding.ui.a aVar9 = aVar8;
                                if (i21 == 1) {
                                    h.t2(aVar9, aVar9.f82645r, CountryProfileOnboardingFlowContract$Step.CountrySelector.f82641a, false, null, false, 12);
                                } else {
                                    h.D2(aVar9.f82645r);
                                }
                                break;
                            default:
                                s7a.a0 output = (s7a.a0) obj5;
                                Intrinsics.checkNotNullParameter(output, "output");
                                c0 c0Var = output.f260599a;
                                boolean z = c0Var instanceof z;
                                com.revolut.feature.retail.global_accounts.impl.onboarding.ui.a aVar10 = aVar8;
                                if (z) {
                                    aVar10.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("cc234c11-d2e6-4049-ac4d-b60c44f79c5c", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                                } else if (c0Var instanceof s7a.y) {
                                    aVar10.l2(new w3k.i(aVar10, ((s7a.y) c0Var).f260660a, null, 13), new yi5.b(26));
                                } else if (c0Var instanceof c) {
                                    h0 h0Var = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.ERROR, "CountryProfileOnboardingFlowModel", j6.a.q("Unexpected id provided by AvailableCountriesStateMapper: ", ((c) c0Var).f295708a), null, h0Var);
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block24, "block");
                viewControllerE16.H = block24;
                return viewControllerE16;
            case 21:
                com.revolut.feature.apm.payid.impl.screen.send.flow.a aVar9 = (com.revolut.feature.apm.payid.impl.screen.send.flow.a) obj4;
                yki.l FlowCoordinator7 = (yki.l) obj2;
                SendFlowContract$Step step18 = (SendFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator7, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step18, "step");
                if (!(step18 instanceof SendFlowContract$Step.Contacts)) {
                    if (step18 instanceof SendFlowContract$Step.Input) {
                        return new InputScreen(new ya2.f(((SendFlowContract$Step.Input) step18).f62729a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ContactsScreen contactsScreen = new ContactsScreen();
                w38.v block25 = new w38.v(aVar9, FlowCoordinator7, 15);
                Intrinsics.checkNotNullParameter(block25, "block");
                contactsScreen.H = block25;
                return contactsScreen;
            case 22:
                wa4.e eVar2 = (wa4.e) obj4;
                yki.l FlowCoordinator8 = (yki.l) obj2;
                EmergencyPaymentFlowContract$Step it8 = (EmergencyPaymentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator8, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                zwc.a aVar10 = eVar2.f295815s;
                int i21 = com.revolut.feature.credit.core.R$string.emergency_payment_setup_intro_title_new;
                EmergencyPaymentFlowContract$InputData emergencyPaymentFlowContract$InputData = eVar2.f295812p;
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i21, zhm.u.c(emergencyPaymentFlowContract$InputData.f67641a.f154968a), null, 12);
                int i22 = com.revolut.feature.credit.core.R$string.emergency_payment_setup_intro_description_new;
                x0 x0Var = emergencyPaymentFlowContract$InputData.f67641a;
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(i22, zhm.u.c(x0Var.f154969b), null, 12);
                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.emergency_payment_setup_intro_button_primary_title_new, zhm.u.c(x0Var.f154970c), null, 12);
                String str2 = x0Var.d;
                SelectPaymentRootFlow selectPaymentRootFlowA = zwc.a.a(aVar10, null, new SelectPaymentFlowProvider$ScreenConfiguration(textLocalisedClause3, textLocalisedClause4, textLocalisedClause5, str2 != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.emergency_payment_setup_intro_button_secondary_title_new, zhm.u.c(str2), null, 12) : null), new AnalyticsContext(v7.m(emergencyPaymentFlowContract$InputData.f67643c, AnalyticsContext.INSTANCE)), 17);
                w3c.n block26 = new w3c.n(eVar2, 17);
                Intrinsics.checkNotNullParameter(block26, "block");
                selectPaymentRootFlowA.H = block26;
                return selectPaymentRootFlowA;
            case 23:
                com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.a aVar11 = (com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.a) obj4;
                yki.b LazyFlowCoordinator5 = (yki.b) obj2;
                PostTerminationPlanDetailsFlowContract$Step step19 = (PostTerminationPlanDetailsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator5, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step19, "step");
                if (step19 instanceof PostTerminationPlanDetailsFlowContract$Step.PlanDetails) {
                    ActionsBottomSheetController actionsBottomSheetControllerA = aVar11.f70671q.a(((PostTerminationPlanDetailsFlowContract$Step.PlanDetails) step19).f70669a);
                    actionsBottomSheetControllerA.k2(new dld.c(aVar11, LazyFlowCoordinator5, 12));
                    return actionsBottomSheetControllerA;
                }
                if (step19 instanceof PostTerminationPlanDetailsFlowContract$Step.Loading) {
                    return new LayoutViewerScreen(R$layout.screen_transparent);
                }
                throw new NoWhenBranchMatchedException();
            case 24:
                final com.revolut.feature.travel.hotels.impl.ui_kompot.flow.room.selection.a aVar12 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.room.selection.a) obj4;
                yki.l FlowCoordinator9 = (yki.l) obj2;
                TravelHotelsRoomsSelectionFlowContract$Step step20 = (TravelHotelsRoomsSelectionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator9, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step20, "step");
                if (step20 instanceof TravelHotelsRoomsSelectionFlowContract$Step.RoomSelectionBooking) {
                    TravelHotelsRoomsSelectionBookingScreen travelHotelsRoomsSelectionBookingScreen = new TravelHotelsRoomsSelectionBookingScreen(((TravelHotelsRoomsSelectionFlowContract$Step.RoomSelectionBooking) step20).f93754a);
                    Function1 block27 = new Function1() { // from class: wag.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i6) {
                                case 0:
                                    g output = (g) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    aVar12.C2(new d(output));
                                    break;
                                default:
                                    beg.i output2 = (beg.i) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    aVar12.C2(new c(output2));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block27, "block");
                    travelHotelsRoomsSelectionBookingScreen.H = block27;
                    return travelHotelsRoomsSelectionBookingScreen;
                }
                if (!(step20 instanceof TravelHotelsRoomsSelectionFlowContract$Step.RoomSelectionAmendment)) {
                    throw new NoWhenBranchMatchedException();
                }
                TravelHotelsRoomsSelectionAmendmentScreen travelHotelsRoomsSelectionAmendmentScreen = new TravelHotelsRoomsSelectionAmendmentScreen(((TravelHotelsRoomsSelectionFlowContract$Step.RoomSelectionAmendment) step20).f93753a);
                Function1 block28 = new Function1() { // from class: wag.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        switch (i5) {
                            case 0:
                                g output = (g) obj5;
                                Intrinsics.checkNotNullParameter(output, "output");
                                aVar12.C2(new d(output));
                                break;
                            default:
                                beg.i output2 = (beg.i) obj5;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                aVar12.C2(new c(output2));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block28, "block");
                travelHotelsRoomsSelectionAmendmentScreen.H = block28;
                return travelHotelsRoomsSelectionAmendmentScreen;
            case 25:
                List launches = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(launches, "launches");
                ((waj.a) obj4).f295945b.f("CRYPTO_PRE_LAUNCH_MEMORY_KEY", launches);
                return Unit.f186387a;
            case 26:
                lbf.f fVar = (lbf.f) obj4;
                List plans = (List) obj2;
                List enabledPlans = (List) obj3;
                Intrinsics.checkNotNullParameter(plans, "plans");
                Intrinsics.checkNotNullParameter(enabledPlans, "enabledPlans");
                Iterator it9 = plans.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        if (((lbf.m) next).f193681b == fVar) {
                        }
                    } else {
                        next = null;
                    }
                }
                lbf.m mVar = (lbf.m) next;
                if (mVar == null) {
                    throw new IllegalStateException("Can't find add on with code " + fVar);
                }
                Iterator it10 = enabledPlans.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Object next2 = it10.next();
                        if (Intrinsics.f(((lbf.j) next2).f193677a, mVar.f193680a)) {
                            obj = next2;
                        }
                    }
                }
                lbf.j jVar = (lbf.j) obj;
                if (jVar != null) {
                    return new lbf.p(mVar, jVar);
                }
                throw new IllegalStateException("Can't find enabled data for add ons");
            case 27:
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar13 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelHotelsCheckoutScreenContract$ModalStep step21 = (TravelHotelsCheckoutScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step21, "step");
                if (step21 instanceof TravelHotelsCheckoutScreenContract$ModalStep.RevPayPocketSelection) {
                    dj0.d dVar7 = ((TravelHotelsCheckoutScreenContract$ModalStep.RevPayPocketSelection) step21).f93901a;
                    u6c.t tVar = u6c.t.STAYS;
                    Object content = ((g0) ((j2) aVar13.O.f22677a).getValue()).e.getContent();
                    ecg.g gVar = content instanceof ecg.g ? (ecg.g) content : null;
                    ViewController viewControllerE17 = aVar13.e1(new w6c.i(new PayWithAnyControllerDescriptor$InputData(tVar, dVar7, gVar != null ? gVar.f124732a : null, null, null, null, w6c.f.ONLY_POCKETS_FILTERED_BY_BALANCE, null, null, false, 1912)));
                    u0 block29 = new u0(aVar13, i3);
                    Intrinsics.checkNotNullParameter(block29, "block");
                    viewControllerE17.H = block29;
                    return viewControllerE17;
                }
                if (step21 instanceof TravelHotelsCheckoutScreenContract$ModalStep.CardSelection) {
                    TravelHotelsCardSelectionScreen travelHotelsCardSelectionScreen = new TravelHotelsCardSelectionScreen(new TravelHotelsCardSelectionScreenContract$InputData(((TravelHotelsCheckoutScreenContract$ModalStep.CardSelection) step21).f93900a));
                    u0 block30 = new u0(aVar13, 3);
                    Intrinsics.checkNotNullParameter(block30, "block");
                    travelHotelsCardSelectionScreen.H = block30;
                    return travelHotelsCardSelectionScreen;
                }
                if (step21 instanceof TravelHotelsCheckoutScreenContract$ModalStep.BedOptionsSelection) {
                    BedOptionSelection bedOptionSelection = ((TravelHotelsCheckoutScreenContract$ModalStep.BedOptionsSelection) step21).f93896a;
                    TravelHotelsBedOptionsSelectionScreen travelHotelsBedOptionsSelectionScreen = new TravelHotelsBedOptionsSelectionScreen(new TravelHotelsBedOptionsSelectionScreenContract$InputData(bedOptionSelection.f98091b, bedOptionSelection.f98090a.f98106c.f98113b));
                    w38.v block31 = new w38.v(step21, aVar13, 18);
                    Intrinsics.checkNotNullParameter(block31, "block");
                    travelHotelsBedOptionsSelectionScreen.H = block31;
                    return travelHotelsBedOptionsSelectionScreen;
                }
                if (step21 instanceof TravelHotelsCheckoutScreenContract$ModalStep.BreakdownDisclaimer) {
                    TravelHotelsCheckoutScreenContract$ModalStep.BreakdownDisclaimer breakdownDisclaimer = (TravelHotelsCheckoutScreenContract$ModalStep.BreakdownDisclaimer) step21;
                    return aVar13.e1(new w6c.k(new PaymentBreakdownControllerDescriptor$InputData(breakdownDisclaimer.f93897a, breakdownDisclaimer.f93899c, w6c.j.PAYMENT, new PaymentBreakdownControllerDescriptor$BreakdownDisclaimer.Default(breakdownDisclaimer.d, hb9.b.C(breakdownDisclaimer.f93898b)))));
                }
                if (!(step21 instanceof TravelHotelsCheckoutScreenContract$ModalStep.TermsReview)) {
                    throw new NoWhenBranchMatchedException();
                }
                k0c.a aVar14 = aVar13.E;
                RevPointsTermsReviewInputData revPointsTermsReviewInputData = ((TravelHotelsCheckoutScreenContract$ModalStep.TermsReview) step21).f93902a;
                aVar14.getClass();
                RevPointsTermsReviewFlow revPointsTermsReviewFlowA = k0c.a.a(revPointsTermsReviewInputData);
                u0 block32 = new u0(aVar13, i6);
                Intrinsics.checkNotNullParameter(block32, "block");
                revPointsTermsReviewFlowA.H = block32;
                return revPointsTermsReviewFlowA;
            case 28:
                String receiverUsername = (String) obj2;
                kbk.i data = (kbk.i) obj3;
                Intrinsics.checkNotNullParameter(receiverUsername, "receiverUsername");
                Intrinsics.checkNotNullParameter(data, "data");
                ((wbk.b) obj4).f296241b.f("PREFIX_PLAN_GIFTING_ELIGIBILITY_KEY_" + receiverUsername, data);
                return Unit.f186387a;
            default:
                String giftId = (String) obj2;
                kbk.j data2 = (kbk.j) obj3;
                Intrinsics.checkNotNullParameter(giftId, "giftId");
                Intrinsics.checkNotNullParameter(data2, "data");
                ((wbk.h) obj4).f296246b.f("KEY_RECEIVER_INTRO_" + giftId, data2);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ s(vzk.x xVar, vzk.g gVar) {
        this.f292522a = 6;
        this.f292523b = gVar;
    }
}
