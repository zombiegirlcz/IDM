package r6f;

import aii.r;
import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.swish.impl.ui.home.transaction_limit.SwishTransactionLimitScreen;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.CreditPromptScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.add_debt.AddDebtScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.DirectDebitContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentController;
import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentControllerContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentControllerContract$Document;
import com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.CreditPdfDocumentControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.MortgageSignatureFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.otp.OtpScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.otp.OtpScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods.SigningMethodsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.SigningMethodsInfoScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.SigningMethodsInfoScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.preapplication.PreApplicationChecksScreenContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.workflow.CreditWorkflowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.workflow.CreditWorkflowContract$Step;
import com.revolut.feature.credit.direct.debit.account_confirmation.DirectDebitAccountConfirmationScreen;
import com.revolut.feature.credit.direct.debit.account_confirmation.DirectDebitAccountConfirmationScreenContract$InputData;
import com.revolut.feature.credit.direct.debit.account_details.DirectDebitAccountDetailsScreen;
import com.revolut.feature.credit.direct.debit.account_details.DirectDebitAccountDetailsScreenContract$InputData;
import com.revolut.feature.credit.direct.debit.account_selection.DirectDebitAccountSelectionScreen;
import com.revolut.feature.credit.direct.debit.account_selection.DirectDebitAccountSelectionScreenContract$InputData;
import com.revolut.feature.credit.direct.debit.account_selection.models.PocketInfo;
import com.revolut.feature.credit.direct.debit.new_account.DirectDebitNewAccountScreen;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import com.revolut.feature.credit.loan.impl.article.LoanArticleKey;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.LoanSelectBackupCardFlowContract$State;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.LoanSelectBackupCardFlowContract$Step;
import com.revolut.feature.credit.loan.impl.ui.rev10.togglebackupcard.LoanToggleBackupCardScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.togglebackupcard.LoanToggleBackupCardScreenContract$InputData;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.jisa_details.JuniorIsaDetailsScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_details.JuniorIsaDetailsScreenContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.jisa_details.flow.JuniorIsaDetailsFlowContract$Step;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.pay_later.impl.models.right_to_cancel.RightToCancelSummaryContent;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.SummaryControllerContract$ModalStep;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Step;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit.PixAuthorisationTransactionLimitScreen;
import com.revolut.feature.post_activation.impl.ui.flow.PostActivationFlowContract$Step;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.profile.api.navigation.ProfileAddressControllerDescriptor;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreen;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreenContract$InputData;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreenContract$TrackingRequest;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.bottom_sheet.delete_tracking.DeleteTrackingScreen;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.bottom_sheet.delete_tracking.DeleteTrackingScreenContract$InputData;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.ShippingTrackingScreenContract$InputData;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.ShippingTrackingScreenContract$ModalStep;
import com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentRootFlow;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$Child;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$ModalStep;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filter_options.TravelMilesFlightSearchFilterOptionScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filter_options.TravelMilesFlightSearchFilterOptionScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.TravelMilesFlightSearchResultsFiltersScreenContract$ModalStep;
import com.revolut.feature.wealth.impl.ui.screens.popularassets.PopularAssetsControllerContract$ModalStep;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.feature_retail_user_declarations.UserDeclarationsApi$Toggles;
import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowContract$State;
import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowContract$Step;
import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowInputData;
import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowOutputData;
import com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.EmailVerificationCooldownBottomSheetContract$InputData;
import com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.EmailVerificationCooldownBottomSheetContract$InvocationSource;
import com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.EmailVerificationCooldownBottomSheetController;
import com.revolut.feature_retail_user_declarations.email.screen.EmailScreen;
import com.revolut.feature_retail_user_declarations.email.screen.EmailScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.email.screen.b;
import com.revolut.feature_retail_user_declarations.email.verification_screen.EmailVerificationPromptContract$InputData;
import com.revolut.feature_retail_user_declarations.email.verification_screen.EmailVerificationPromptController;
import com.revolut.feature_retail_user_declarations.email.verification_screen.EmailVerificationUseCase;
import com.revolut.feature_retail_user_declarations.email_verification.otp_flow.EmailVerificationOtpFlow;
import com.revolut.feature_retail_user_declarations.email_verification.otp_flow.EmailVerificationOtpFlowInputData;
import com.revolut.feature_retail_user_declarations.email_verification.otp_flow.EmailVerificationOtpFlowOutputData;
import com.revolut.feature_rev_points_pocket_api.navigation.RevPointsPocketDestination;
import com.revolut.feature_rev_points_pocket_impl.ui.flow.RevPointsPocketFlowContract$Step;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.onboarding.RevPointsPocketOnboardingScreen;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.onboarding.RevPointsPocketOnboardingScreenContract$InputData;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.StackDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.time.date_picker.DatePickerBottomSheetController;
import com.revolut.kompot.common.flow.navigation.NavigationFlow;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.esim.impl.ui.flows.share_qr_code.EsimShareQrCodeFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.screens.share_qr_code.EsimShareQrCodeScreen;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.PlanSelectionCoreFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.PlanChangeFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.StudentFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.existing_preorder_warning.ExistingPreorderWarningFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.PlanCancelFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.a;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student.student_hub.StudentHubScreen;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowControllerDescriptor$InputData;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import com.revolut.tracking.v3.CreditApplicationCommonContext;
import dx4.z2;
import e54.a0;
import ew9.c;
import fy4.s;
import fy4.t;
import grl.k9;
import ip0.zj;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ms0.h4;
import oki.h;
import p8a.e1;
import qg7.p;
import r38.m;
import r4k.x;
import r74.n;
import r74.v;
import raf.o;
import rch.q;
import rk7.g;
import s85.g;
import ty4.f;
import ty4.i;
import v94.j;
import ve4.k;
import ve4.l;
import vkm.j2;
import zhm.d0;
import zhm.h0;
import zhm.r0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f251833b;

    public /* synthetic */ i(Object obj2, int i) {
        this.f251832a = i;
        this.f251833b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v114, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        t61.g gVar;
        qd0.b bVarN;
        ViewController emailVerificationPromptController;
        PluginScreenController otpScreen;
        WorkflowConfiguration createWorkflow;
        int i = this.f251832a;
        final int i2 = 2;
        String str = null;
        Object obj4 = this.f251833b;
        switch (i) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return yp0.b.g((List) getDefaultErrorItems.invoke(new iii.d(6, "ManagedPortfolioDetailsFeesExtensionContract", true, false, null)), ((j) obj4).f251834a, null, 0, 0, 126);
            case 1:
                final com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.a aVar = (com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                final TravelFlightsPassengersPickerScreenContract$ModalStep step = (TravelFlightsPassengersPickerScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof TravelFlightsPassengersPickerScreenContract$ModalStep.ChildBirthDatePicker) {
                    TravelFlightsPassengersPickerScreenContract$ModalStep.ChildBirthDatePicker childBirthDatePicker = (TravelFlightsPassengersPickerScreenContract$ModalStep.ChildBirthDatePicker) step;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_passengers_info_date_picker_title, u.c(Integer.valueOf(childBirthDatePicker.f93380a)), null, 12);
                    LocalDate localDate = childBirthDatePicker.f93381b;
                    if (localDate == null) {
                        localDate = aVar.f93384q;
                    }
                    DatePickerBottomSheetController datePickerBottomSheetController = new DatePickerBottomSheetController(new DatePickerBottomSheetController.InputData((Clause) textLocalisedClause, localDate, aVar.f93385r, aVar.f93384q, true));
                    final int i3 = 0;
                    Function1 block = new Function1() { // from class: r6g.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            ArrayList arrayList;
                            int i5 = i3;
                            dii.e eVar = dii.e.f115068a;
                            TravelFlightsPassengersPickerScreenContract$ModalStep travelFlightsPassengersPickerScreenContract$ModalStep = step;
                            com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.a aVar2 = aVar;
                            switch (i5) {
                                case 0:
                                    hii.a output = (hii.a) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    y yVar = aVar2.f93386s;
                                    h hVar = (h) ((j2) yVar.f22677a).getValue();
                                    int i6 = ((TravelFlightsPassengersPickerScreenContract$ModalStep.ChildBirthDatePicker) travelFlightsPassengersPickerScreenContract$ModalStep).f93380a;
                                    TravelFlightsPassengersPickerScreenContract$Child travelFlightsPassengersPickerScreenContract$Child = new TravelFlightsPassengersPickerScreenContract$Child(i6, output.f152606a);
                                    List list = hVar.f251842b;
                                    List<TravelFlightsPassengersPickerScreenContract$Child> list2 = list;
                                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                                        arrayList = d0.F0(travelFlightsPassengersPickerScreenContract$Child, list);
                                    } else {
                                        Iterator it8 = list2.iterator();
                                        while (it8.hasNext()) {
                                            if (((TravelFlightsPassengersPickerScreenContract$Child) it8.next()).f93375a == i6) {
                                                arrayList = new ArrayList(w.t(list2, 10));
                                                for (TravelFlightsPassengersPickerScreenContract$Child travelFlightsPassengersPickerScreenContract$Child2 : list2) {
                                                    if (travelFlightsPassengersPickerScreenContract$Child2.f93375a == i6) {
                                                        travelFlightsPassengersPickerScreenContract$Child2 = travelFlightsPassengersPickerScreenContract$Child;
                                                    }
                                                    arrayList.add(travelFlightsPassengersPickerScreenContract$Child2);
                                                }
                                            }
                                        }
                                        arrayList = d0.F0(travelFlightsPassengersPickerScreenContract$Child, list);
                                    }
                                    if (!travelFlightsPassengersPickerScreenContract$Child.a(aVar2.f93384q) || hVar.f251841a >= aVar2.I2(arrayList)) {
                                        aVar2.H2(yVar, new jeg.i(27, arrayList));
                                    } else {
                                        oki.h.v2(aVar2.f93387t, new TravelFlightsPassengersPickerScreenContract$ModalStep.AddAdultForInfant(travelFlightsPassengersPickerScreenContract$Child), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    break;
                                case 1:
                                    dii.g output2 = (dii.g) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (Intrinsics.f(output2, eVar)) {
                                        aVar2.H2(aVar2.f93386s, new r38.m((TravelFlightsPassengersPickerScreenContract$ModalStep.AddAdultForInfant) travelFlightsPassengersPickerScreenContract$ModalStep, 17));
                                    } else {
                                        int i21 = jli.h.f175850a;
                                    }
                                    break;
                                default:
                                    dii.g output3 = (dii.g) obj5;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (Intrinsics.f(output3, eVar)) {
                                        aVar2.H2(aVar2.f93386s, new r38.m((TravelFlightsPassengersPickerScreenContract$ModalStep.RemoveAdultForInfant) travelFlightsPassengersPickerScreenContract$ModalStep, 16));
                                    } else {
                                        int i22 = jli.h.f175850a;
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    datePickerBottomSheetController.H = block;
                    return datePickerBottomSheetController;
                }
                if (step instanceof TravelFlightsPassengersPickerScreenContract$ModalStep.AddAdultForInfant) {
                    aVar.f93383p.getClass();
                    lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.travel_flights_passengers_info_add_another_adult_title, null, null, 14), new TextLocalisedClause(R$string.travel_flights_passengers_info_add_another_adult_subtitle, null, null, 14), null, null, false, 28);
                    m6 m6Var = n6.Companion;
                    aw0.h hVar = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R$string.travel_flights_passengers_info_add_another_adult_add_adult, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.travel_flights_passengers_info_add_another_adult_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
                    k9 k9Var = k9.Travel;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                    final int i5 = 1;
                    Function1 block2 = new Function1() { // from class: r6g.l
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            ArrayList arrayList;
                            int i59 = i5;
                            dii.e eVar = dii.e.f115068a;
                            TravelFlightsPassengersPickerScreenContract$ModalStep travelFlightsPassengersPickerScreenContract$ModalStep = step;
                            com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.a aVar22 = aVar;
                            switch (i59) {
                                case 0:
                                    hii.a output = (hii.a) obj5;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    y yVar = aVar22.f93386s;
                                    h hVar2 = (h) ((j2) yVar.f22677a).getValue();
                                    int i6 = ((TravelFlightsPassengersPickerScreenContract$ModalStep.ChildBirthDatePicker) travelFlightsPassengersPickerScreenContract$ModalStep).f93380a;
                                    TravelFlightsPassengersPickerScreenContract$Child travelFlightsPassengersPickerScreenContract$Child = new TravelFlightsPassengersPickerScreenContract$Child(i6, output.f152606a);
                                    List list = hVar2.f251842b;
                                    List<TravelFlightsPassengersPickerScreenContract$Child> list2 = list;
                                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                                        arrayList = d0.F0(travelFlightsPassengersPickerScreenContract$Child, list);
                                    } else {
                                        Iterator it8 = list2.iterator();
                                        while (it8.hasNext()) {
                                            if (((TravelFlightsPassengersPickerScreenContract$Child) it8.next()).f93375a == i6) {
                                                arrayList = new ArrayList(w.t(list2, 10));
                                                for (TravelFlightsPassengersPickerScreenContract$Child travelFlightsPassengersPickerScreenContract$Child2 : list2) {
                                                    if (travelFlightsPassengersPickerScreenContract$Child2.f93375a == i6) {
                                                        travelFlightsPassengersPickerScreenContract$Child2 = travelFlightsPassengersPickerScreenContract$Child;
                                                    }
                                                    arrayList.add(travelFlightsPassengersPickerScreenContract$Child2);
                                                }
                                            }
                                        }
                                        arrayList = d0.F0(travelFlightsPassengersPickerScreenContract$Child, list);
                                    }
                                    if (!travelFlightsPassengersPickerScreenContract$Child.a(aVar22.f93384q) || hVar2.f251841a >= aVar22.I2(arrayList)) {
                                        aVar22.H2(yVar, new jeg.i(27, arrayList));
                                    } else {
                                        oki.h.v2(aVar22.f93387t, new TravelFlightsPassengersPickerScreenContract$ModalStep.AddAdultForInfant(travelFlightsPassengersPickerScreenContract$Child), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    break;
                                case 1:
                                    dii.g output2 = (dii.g) obj5;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (Intrinsics.f(output2, eVar)) {
                                        aVar22.H2(aVar22.f93386s, new r38.m((TravelFlightsPassengersPickerScreenContract$ModalStep.AddAdultForInfant) travelFlightsPassengersPickerScreenContract$ModalStep, 17));
                                    } else {
                                        int i21 = jli.h.f175850a;
                                    }
                                    break;
                                default:
                                    dii.g output3 = (dii.g) obj5;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (Intrinsics.f(output3, eVar)) {
                                        aVar22.H2(aVar22.f93386s, new r38.m((TravelFlightsPassengersPickerScreenContract$ModalStep.RemoveAdultForInfant) travelFlightsPassengersPickerScreenContract$ModalStep, 16));
                                    } else {
                                        int i22 = jli.h.f175850a;
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block2, "block");
                    actionsBottomSheetController.H = block2;
                    return actionsBottomSheetController;
                }
                if (!(step instanceof TravelFlightsPassengersPickerScreenContract$ModalStep.RemoveAdultForInfant)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.o.getClass();
                lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.travel_flights_passengers_info_remove_adult_title, null, null, 14), new TextLocalisedClause(R$string.travel_flights_passengers_info_remove_adult_subtitle, null, null, 14), null, null, false, 28);
                m6 m6Var2 = n6.Companion;
                aw0.h hVar2 = new aw0.h(false, m6.c(m6Var2, new TextLocalisedClause(R$string.travel_flights_passengers_info_remove_adult_remove, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var2, new TextLocalisedClause(R$string.travel_flights_passengers_info_remove_adult_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
                k9 k9Var2 = k9.Travel;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar3, hVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                Function1 block3 = new Function1() { // from class: r6g.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        ArrayList arrayList;
                        int i59 = i2;
                        dii.e eVar = dii.e.f115068a;
                        TravelFlightsPassengersPickerScreenContract$ModalStep travelFlightsPassengersPickerScreenContract$ModalStep = step;
                        com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.a aVar22 = aVar;
                        switch (i59) {
                            case 0:
                                hii.a output = (hii.a) obj5;
                                Intrinsics.checkNotNullParameter(output, "output");
                                y yVar = aVar22.f93386s;
                                h hVar22 = (h) ((j2) yVar.f22677a).getValue();
                                int i6 = ((TravelFlightsPassengersPickerScreenContract$ModalStep.ChildBirthDatePicker) travelFlightsPassengersPickerScreenContract$ModalStep).f93380a;
                                TravelFlightsPassengersPickerScreenContract$Child travelFlightsPassengersPickerScreenContract$Child = new TravelFlightsPassengersPickerScreenContract$Child(i6, output.f152606a);
                                List list = hVar22.f251842b;
                                List<TravelFlightsPassengersPickerScreenContract$Child> list2 = list;
                                if ((list2 instanceof Collection) && list2.isEmpty()) {
                                    arrayList = d0.F0(travelFlightsPassengersPickerScreenContract$Child, list);
                                } else {
                                    Iterator it8 = list2.iterator();
                                    while (it8.hasNext()) {
                                        if (((TravelFlightsPassengersPickerScreenContract$Child) it8.next()).f93375a == i6) {
                                            arrayList = new ArrayList(w.t(list2, 10));
                                            for (TravelFlightsPassengersPickerScreenContract$Child travelFlightsPassengersPickerScreenContract$Child2 : list2) {
                                                if (travelFlightsPassengersPickerScreenContract$Child2.f93375a == i6) {
                                                    travelFlightsPassengersPickerScreenContract$Child2 = travelFlightsPassengersPickerScreenContract$Child;
                                                }
                                                arrayList.add(travelFlightsPassengersPickerScreenContract$Child2);
                                            }
                                        }
                                    }
                                    arrayList = d0.F0(travelFlightsPassengersPickerScreenContract$Child, list);
                                }
                                if (!travelFlightsPassengersPickerScreenContract$Child.a(aVar22.f93384q) || hVar22.f251841a >= aVar22.I2(arrayList)) {
                                    aVar22.H2(yVar, new jeg.i(27, arrayList));
                                } else {
                                    oki.h.v2(aVar22.f93387t, new TravelFlightsPassengersPickerScreenContract$ModalStep.AddAdultForInfant(travelFlightsPassengersPickerScreenContract$Child), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                }
                                break;
                            case 1:
                                dii.g output2 = (dii.g) obj5;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                if (Intrinsics.f(output2, eVar)) {
                                    aVar22.H2(aVar22.f93386s, new r38.m((TravelFlightsPassengersPickerScreenContract$ModalStep.AddAdultForInfant) travelFlightsPassengersPickerScreenContract$ModalStep, 17));
                                } else {
                                    int i21 = jli.h.f175850a;
                                }
                                break;
                            default:
                                dii.g output3 = (dii.g) obj5;
                                Intrinsics.checkNotNullParameter(output3, "output");
                                if (Intrinsics.f(output3, eVar)) {
                                    aVar22.H2(aVar22.f93386s, new r38.m((TravelFlightsPassengersPickerScreenContract$ModalStep.RemoveAdultForInfant) travelFlightsPassengersPickerScreenContract$ModalStep, 16));
                                } else {
                                    int i22 = jli.h.f175850a;
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block3, "block");
                actionsBottomSheetController2.H = block3;
                return actionsBottomSheetController2;
            case 2:
                com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CreditPromptScreenContract$ModalStep step2 = (CreditPromptScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof CreditPromptScreenContract$ModalStep.Info) {
                    return bVar.e1(new s(new t(((CreditPromptScreenContract$ModalStep.Info) step2).f67332a)));
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new n(u.c(new FullScreenStateDelegate.Model("INTRO_PROMPT_ERROR_ID", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, true, null, null, null, 1860)), true, q74.b.a(((v) obj4).f252013a.f67329a));
            case 4:
                com.revolut.feature.permissions.flow.b bVar2 = (com.revolut.feature.permissions.flow.b) obj4;
                PermissionsControllerContract$Step step3 = (PermissionsControllerContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof PermissionsControllerContract$Step.Introduction) {
                    PermissionsControllerContract$Step.Introduction introduction = (PermissionsControllerContract$Step.Introduction) step3;
                    PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(introduction.f80336a, null, false, false, null, 30));
                    x block4 = new x(bVar2, introduction, i2);
                    Intrinsics.checkNotNullParameter(block4, "block");
                    promptMarketingScreen.H = block4;
                    return promptMarketingScreen;
                }
                if (!(step3 instanceof PermissionsControllerContract$Step.Explanation)) {
                    throw new NoWhenBranchMatchedException();
                }
                PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(((PermissionsControllerContract$Step.Explanation) step3).f80334a, null, false, false, null, 30));
                com.revolut.feature.permissions.flow.a block5 = new com.revolut.feature.permissions.flow.a(1, 0, com.revolut.feature.permissions.flow.b.class, bVar2, "handleExplanationOutput", "handleExplanationOutput(Lcom/revolut/feature/full_screen_prompt/PromptMarketingScreenContract$Output;)V");
                Intrinsics.checkNotNullParameter(block5, "block");
                promptMarketingScreen2.H = block5;
                return promptMarketingScreen2;
            case 5:
                AddDebtScreen addDebtScreen = (AddDebtScreen) obj4;
                InputTextDelegate.Model model = (InputTextDelegate.Model) obj2;
                InputText field = (InputText) obj3;
                KProperty[] kPropertyArr = AddDebtScreen.f67423d0;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj5 = model.P;
                if (obj5 instanceof a0) {
                    return new zp0.d(field.getInnerEditText(), ((a0) obj5).f122739a.f115083b, (u80.d) addDebtScreen.Y.getValue(), null, null, false, false, 0, false, null, 1912);
                }
                return null;
            case 6:
                final com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.b bVar3 = (com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.b) obj4;
                final yki.b LazyFlowCoordinator = (yki.b) obj2;
                LoanSelectBackupCardFlowContract$Step step4 = (LoanSelectBackupCardFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof LoanSelectBackupCardFlowContract$Step.Article) {
                    ViewController viewControllerE1 = bVar3.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(new LoanArticleKey.BackupCard(((LoanSelectBackupCardFlowContract$State) ((j2) bVar3.f70597s.f22677a).getValue()).f70590a))), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60));
                    final int i6 = 0;
                    Function1 block6 = new Function1() { // from class: r85.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    yja.b productArticleFlowResult = (yja.b) obj6;
                                    Intrinsics.checkNotNullParameter(productArticleFlowResult, "productArticleFlowResult");
                                    yja.b bVar4 = yja.b.CLOSE_CLICK;
                                    yki.b bVar5 = LazyFlowCoordinator;
                                    if (productArticleFlowResult == bVar4) {
                                        h.D2(bVar5);
                                    } else {
                                        com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.b bVar6 = bVar3;
                                        h.t2(bVar6, bVar5, new LoanSelectBackupCardFlowContract$Step.SelectNewCard(bVar6.o.f70588b), false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    s85.h output = (s85.h) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!(output instanceof g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar3, LazyFlowCoordinator, new LoanSelectBackupCardFlowContract$Step.SelectNewCard(((g) output).f260892a), true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block6, "block");
                    viewControllerE1.H = block6;
                    return viewControllerE1;
                }
                if (!(step4 instanceof LoanSelectBackupCardFlowContract$Step.SelectNewCard)) {
                    if (!(step4 instanceof LoanSelectBackupCardFlowContract$Step.ToggleBackupCard)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LoanToggleBackupCardScreen loanToggleBackupCardScreen = new LoanToggleBackupCardScreen(new LoanToggleBackupCardScreenContract$InputData(bVar3.o.f70587a));
                    final int i21 = 1;
                    Function1 function1 = new Function1() { // from class: r85.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i21) {
                                case 0:
                                    yja.b productArticleFlowResult = (yja.b) obj6;
                                    Intrinsics.checkNotNullParameter(productArticleFlowResult, "productArticleFlowResult");
                                    yja.b bVar4 = yja.b.CLOSE_CLICK;
                                    yki.b bVar5 = LazyFlowCoordinator;
                                    if (productArticleFlowResult == bVar4) {
                                        h.D2(bVar5);
                                    } else {
                                        com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.b bVar6 = bVar3;
                                        h.t2(bVar6, bVar5, new LoanSelectBackupCardFlowContract$Step.SelectNewCard(bVar6.o.f70588b), false, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                default:
                                    s85.h output = (s85.h) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    if (!(output instanceof g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar3, LazyFlowCoordinator, new LoanSelectBackupCardFlowContract$Step.SelectNewCard(((g) output).f260892a), true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function1, "<set-?>");
                    loanToggleBackupCardScreen.H = function1;
                    return loanToggleBackupCardScreen;
                }
                zwc.a aVar4 = bVar3.f70595q;
                LoanBackupCard loanBackupCard = ((LoanSelectBackupCardFlowContract$Step.SelectNewCard) step4).f70592a;
                if (loanBackupCard instanceof LoanBackupCard.ExternalCard.Personal) {
                    gVar = ((LoanBackupCard.ExternalCard.Personal) loanBackupCard).f70132c;
                } else {
                    if (!(loanBackupCard instanceof LoanBackupCard.ExternalCard.CoBorrower) && !(loanBackupCard instanceof LoanBackupCard.Stale) && !(loanBackupCard instanceof LoanBackupCard.None)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    t61.g.Companion.getClass();
                    gVar = t61.g.B;
                }
                SelectPaymentRootFlow selectPaymentRootFlowA = zwc.a.a(aVar4, gVar, null, null, 14);
                m block7 = new m(bVar3, 22);
                Intrinsics.checkNotNullParameter(block7, "block");
                selectPaymentRootFlowA.H = block7;
                return selectPaymentRootFlowA;
            case 7:
                final com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a aVar5 = (com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a) obj4;
                w0 w0Var = aVar5.f67537s;
                DirectDebitContract$Step step5 = (DirectDebitContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof DirectDebitContract$Step.AccountSelection) {
                    DirectDebitAccountSelectionScreen directDebitAccountSelectionScreen = new DirectDebitAccountSelectionScreen(new DirectDebitAccountSelectionScreenContract$InputData(str, new AnalyticsContext(w0Var), 1));
                    final int i22 = 0;
                    Function1 function12 = new Function1() { // from class: r94.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i22) {
                                case 0:
                                    i outputData = (i) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z = outputData instanceof ty4.e;
                                    com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a aVar6 = aVar5;
                                    if (z) {
                                        h.t2(aVar6, aVar6.f67538t, new DirectDebitContract$Step.AccountDetails(((ty4.e) outputData).f275467a), true, null, false, 12);
                                    } else if (outputData instanceof f) {
                                        f fVar = (f) outputData;
                                        PocketInfo pocketInfo = fVar.f275468a;
                                        String f69902g = pocketInfo.getF69902g();
                                        String str2 = f69902g == null ? "" : f69902g;
                                        String f = pocketInfo.getF();
                                        aVar6.l2(new p(12, aVar6, str2, f == null ? "" : f, fVar.f275469b, (Continuation) null), new yi5.b(26));
                                    } else if (Intrinsics.f(outputData, ty4.h.f275471a)) {
                                        h.t2(aVar6, aVar6.f67538t, DirectDebitContract$Step.NewAccount.f67532a, true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(outputData, ty4.g.f275470a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar6.K2(null);
                                    }
                                    return Unit.f186387a;
                                default:
                                    fz4.h outputData2 = (fz4.h) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (outputData2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    String str3 = outputData2.f139093a;
                                    String str4 = outputData2.f139094b;
                                    bk4.f fVar2 = bk4.f.FORM;
                                    com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a aVar7 = aVar5;
                                    aVar7.l2(new p(12, aVar7, str3, str4, fVar2, (Continuation) null), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function12, "<set-?>");
                    directDebitAccountSelectionScreen.H = function12;
                    return directDebitAccountSelectionScreen;
                }
                if (step5 instanceof DirectDebitContract$Step.AccountDetails) {
                    return new DirectDebitAccountDetailsScreen(new DirectDebitAccountDetailsScreenContract$InputData(((DirectDebitContract$Step.AccountDetails) step5).f67530a, new AnalyticsContext(w0Var)));
                }
                if (step5 instanceof DirectDebitContract$Step.NewAccount) {
                    DirectDebitNewAccountScreen directDebitNewAccountScreen = new DirectDebitNewAccountScreen();
                    final int i32 = 1;
                    Function1 function13 = new Function1() { // from class: r94.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i32) {
                                case 0:
                                    i outputData = (i) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z = outputData instanceof ty4.e;
                                    com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a aVar6 = aVar5;
                                    if (z) {
                                        h.t2(aVar6, aVar6.f67538t, new DirectDebitContract$Step.AccountDetails(((ty4.e) outputData).f275467a), true, null, false, 12);
                                    } else if (outputData instanceof f) {
                                        f fVar = (f) outputData;
                                        PocketInfo pocketInfo = fVar.f275468a;
                                        String f69902g = pocketInfo.getF69902g();
                                        String str2 = f69902g == null ? "" : f69902g;
                                        String f = pocketInfo.getF();
                                        aVar6.l2(new p(12, aVar6, str2, f == null ? "" : f, fVar.f275469b, (Continuation) null), new yi5.b(26));
                                    } else if (Intrinsics.f(outputData, ty4.h.f275471a)) {
                                        h.t2(aVar6, aVar6.f67538t, DirectDebitContract$Step.NewAccount.f67532a, true, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(outputData, ty4.g.f275470a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar6.K2(null);
                                    }
                                    return Unit.f186387a;
                                default:
                                    fz4.h outputData2 = (fz4.h) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (outputData2 == null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    String str3 = outputData2.f139093a;
                                    String str4 = outputData2.f139094b;
                                    bk4.f fVar2 = bk4.f.FORM;
                                    com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a aVar7 = aVar5;
                                    aVar7.l2(new p(12, aVar7, str3, str4, fVar2, (Continuation) null), new yi5.b(26));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(function13, "<set-?>");
                    directDebitNewAccountScreen.H = function13;
                    return directDebitNewAccountScreen;
                }
                if (!(step5 instanceof DirectDebitContract$Step.AccountConfirmation)) {
                    if (step5 instanceof DirectDebitContract$Step.ProfileAddress) {
                        return aVar5.e1(new ProfileAddressControllerDescriptor(new ProfileAddressControllerDescriptor.InputData(true)));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = aVar5.f67534p.f67526b;
                DirectDebitAccountConfirmationScreen directDebitAccountConfirmationScreen = new DirectDebitAccountConfirmationScreen(new DirectDebitAccountConfirmationScreenContract$InputData(((DirectDebitContract$Step.AccountConfirmation) step5).f67529a, new AnalyticsContext(w0Var)));
                x xVar = new x(aVar5, creditApplicationPluginFlowContract$Configuration, 9);
                Intrinsics.checkNotNullParameter(xVar, "<set-?>");
                directDebitAccountConfirmationScreen.H = xVar;
                return directDebitAccountConfirmationScreen;
            case 8:
                PixAuthorisationTransactionLimitScreen pixAuthorisationTransactionLimitScreen = (PixAuthorisationTransactionLimitScreen) obj4;
                CenteredAmountView field2 = (CenteredAmountView) obj3;
                PixAuthorisationTransactionLimitScreen.Companion aVar6 = PixAuthorisationTransactionLimitScreen.INSTANCE;
                Intrinsics.checkNotNullParameter((CenteredAmountDelegate.Model) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(field2, "field");
                MaskedTextInputEditText editText = field2.getEditText();
                xi0.b.Companion.getClass();
                xi0.b bVar4 = xi0.b.D;
                e1 e1Var = (e1) pixAuthorisationTransactionLimitScreen.S.getValue();
                switch (e1Var.f233954a) {
                    case 0:
                        bVarN = e1Var.f233956c.f233933h.n();
                        vc.s.j(bVarN);
                        break;
                    default:
                        bVarN = e1Var.f233956c.f233933h.n();
                        vc.s.j(bVarN);
                        break;
                }
                return new zp0.d(editText, bVar4, new u80.d(((s80.b) bVarN).b()), null, new onh.b(pixAuthorisationTransactionLimitScreen, 13), false, false, 0, false, null, 1960);
            case 9:
                ra8.c cVar = (ra8.c) obj4;
                JuniorIsaDetailsFlowContract$Step step6 = (JuniorIsaDetailsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof JuniorIsaDetailsFlowContract$Step.JuniorIsaDetails) {
                    return new JuniorIsaDetailsScreen(new JuniorIsaDetailsScreenContract$InputData(cVar.f252791p.f76799a));
                }
                throw new NoWhenBranchMatchedException();
            case 10:
                final com.revolut.feature_retail_user_declarations.email.flow.d dVar = (com.revolut.feature_retail_user_declarations.email.flow.d) obj4;
                EmailFlowContract$Step step7 = (EmailFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof EmailFlowContract$Step.Email) {
                    boolean z = ((EmailFlowContract$Step.Email) step7).f97549a;
                    EmailFlowInputData emailFlowInputData = dVar.o;
                    EmailScreen emailScreen = new EmailScreen(new EmailScreenContract$InputData(emailFlowInputData.d, emailFlowInputData.e, emailFlowInputData.f, emailFlowInputData.f97554a, emailFlowInputData.f97555b, emailFlowInputData.f97556c, z));
                    final int i33 = 0;
                    Function1 block8 = new Function1() { // from class: rai.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            r emailData;
                            int i43 = i33;
                            com.revolut.feature_retail_user_declarations.email.flow.d dVar2 = dVar;
                            switch (i43) {
                                case 0:
                                    com.revolut.feature_retail_user_declarations.email.screen.b screenOutput = (com.revolut.feature_retail_user_declarations.email.screen.b) obj6;
                                    Intrinsics.checkNotNullParameter(screenOutput, "screenOutput");
                                    boolean z3 = screenOutput instanceof yai.s;
                                    EmailFlowOutputData.Close close = EmailFlowOutputData.Close.f97564a;
                                    if (z3) {
                                        yai.s sVar = (yai.s) screenOutput;
                                        emailData = new EmailFlowOutputData.EmailData(sVar.f312045a, "EMAIL_SCREEN_CTA_BUTTON_TAG", sVar.f312047c, sVar.f312046b);
                                    } else {
                                        if (!Intrinsics.f(screenOutput, b.a.f97595a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        emailData = close;
                                    }
                                    com.revolut.feature_retail_user_declarations.email.flow.d dVar3 = dVar;
                                    dVar3.H2(dVar3.f97574t, new o(emailData, 1));
                                    if (emailData.equals(close)) {
                                        dVar3.C2(emailData);
                                    } else {
                                        if (!(emailData instanceof EmailFlowOutputData.EmailData)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        EmailFlowOutputData.EmailData emailData2 = (EmailFlowOutputData.EmailData) emailData;
                                        String str2 = emailData2.f97565a;
                                        yki.i iVar = dVar3.u;
                                        EmailFlowInputData emailFlowInputData2 = dVar3.o;
                                        if (emailFlowInputData2.f97557g) {
                                            if (((jte.d) dVar3.f97573s).c(UserDeclarationsApi$Toggles.EmailVerificationOtpUi.f97478c)) {
                                                h.t2(dVar3, iVar, new EmailFlowContract$Step.EmailVerificationOtp(str2), false, TransitionAnimation.FADE.f98392a, false, 10);
                                            } else if (dVar3.f97570p.a()) {
                                                h.w2(iVar, new EmailFlowContract$Step.EmailVerificationCooldown(new EmailVerificationCooldownBottomSheetContract$InvocationSource.Email(str2, emailFlowInputData2.f97557g)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                            } else {
                                                dVar3.l2(new com.revolut.feature_retail_user_declarations.email.flow.c(dVar3, emailData2, null), new yi5.b(26));
                                            }
                                        } else {
                                            dVar3.C2(emailData2);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    abi.d result = (abi.d) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (Intrinsics.f(result, abi.c.f2967a)) {
                                        dVar2.I2(((EmailFlowContract$State) ((j2) dVar2.f97574t.f22677a).getValue()).f97548a);
                                    } else {
                                        if (!Intrinsics.f(result, abi.b.f2966a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i59 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                default:
                                    EmailVerificationOtpFlowOutputData result2 = (EmailVerificationOtpFlowOutputData) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!Intrinsics.f(result2, EmailVerificationOtpFlowOutputData.Verified.f97627a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dVar2.u.e(true);
                                    dVar2.I2(((EmailFlowContract$State) ((j2) dVar2.f97574t.f22677a).getValue()).f97548a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    emailScreen.H = block8;
                    return emailScreen;
                }
                if (step7 instanceof EmailFlowContract$Step.EmailVerificationCooldown) {
                    EmailFlowContract$Step.EmailVerificationCooldown emailVerificationCooldown = (EmailFlowContract$Step.EmailVerificationCooldown) step7;
                    emailVerificationPromptController = new EmailVerificationCooldownBottomSheetController(new EmailVerificationCooldownBottomSheetContract$InputData(emailVerificationCooldown.f97550a));
                    x block9 = new x(dVar, emailVerificationCooldown, 15);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    emailVerificationPromptController.H = block9;
                } else {
                    if (!(step7 instanceof EmailFlowContract$Step.EmailVerificationScreen)) {
                        if (!(step7 instanceof EmailFlowContract$Step.EmailVerificationOtp)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        EmailVerificationOtpFlow emailVerificationOtpFlow = new EmailVerificationOtpFlow(new EmailVerificationOtpFlowInputData(new EmailVerificationOtpFlowInputData.Origin.Onboarding(((EmailFlowContract$Step.EmailVerificationOtp) step7).f97551a)));
                        Function1 block10 = new Function1() { // from class: rai.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                r emailData;
                                int i43 = i2;
                                com.revolut.feature_retail_user_declarations.email.flow.d dVar2 = dVar;
                                switch (i43) {
                                    case 0:
                                        com.revolut.feature_retail_user_declarations.email.screen.b screenOutput = (com.revolut.feature_retail_user_declarations.email.screen.b) obj6;
                                        Intrinsics.checkNotNullParameter(screenOutput, "screenOutput");
                                        boolean z3 = screenOutput instanceof yai.s;
                                        EmailFlowOutputData.Close close = EmailFlowOutputData.Close.f97564a;
                                        if (z3) {
                                            yai.s sVar = (yai.s) screenOutput;
                                            emailData = new EmailFlowOutputData.EmailData(sVar.f312045a, "EMAIL_SCREEN_CTA_BUTTON_TAG", sVar.f312047c, sVar.f312046b);
                                        } else {
                                            if (!Intrinsics.f(screenOutput, b.a.f97595a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            emailData = close;
                                        }
                                        com.revolut.feature_retail_user_declarations.email.flow.d dVar3 = dVar;
                                        dVar3.H2(dVar3.f97574t, new o(emailData, 1));
                                        if (emailData.equals(close)) {
                                            dVar3.C2(emailData);
                                        } else {
                                            if (!(emailData instanceof EmailFlowOutputData.EmailData)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            EmailFlowOutputData.EmailData emailData2 = (EmailFlowOutputData.EmailData) emailData;
                                            String str2 = emailData2.f97565a;
                                            yki.i iVar = dVar3.u;
                                            EmailFlowInputData emailFlowInputData2 = dVar3.o;
                                            if (emailFlowInputData2.f97557g) {
                                                if (((jte.d) dVar3.f97573s).c(UserDeclarationsApi$Toggles.EmailVerificationOtpUi.f97478c)) {
                                                    h.t2(dVar3, iVar, new EmailFlowContract$Step.EmailVerificationOtp(str2), false, TransitionAnimation.FADE.f98392a, false, 10);
                                                } else if (dVar3.f97570p.a()) {
                                                    h.w2(iVar, new EmailFlowContract$Step.EmailVerificationCooldown(new EmailVerificationCooldownBottomSheetContract$InvocationSource.Email(str2, emailFlowInputData2.f97557g)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                                } else {
                                                    dVar3.l2(new com.revolut.feature_retail_user_declarations.email.flow.c(dVar3, emailData2, null), new yi5.b(26));
                                                }
                                            } else {
                                                dVar3.C2(emailData2);
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        abi.d result = (abi.d) obj6;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        if (Intrinsics.f(result, abi.c.f2967a)) {
                                            dVar2.I2(((EmailFlowContract$State) ((j2) dVar2.f97574t.f22677a).getValue()).f97548a);
                                        } else {
                                            if (!Intrinsics.f(result, abi.b.f2966a)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            int i59 = jli.h.f175850a;
                                        }
                                        return Unit.f186387a;
                                    default:
                                        EmailVerificationOtpFlowOutputData result2 = (EmailVerificationOtpFlowOutputData) obj6;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        if (!Intrinsics.f(result2, EmailVerificationOtpFlowOutputData.Verified.f97627a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        dVar2.u.e(true);
                                        dVar2.I2(((EmailFlowContract$State) ((j2) dVar2.f97574t.f22677a).getValue()).f97548a);
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block10, "block");
                        emailVerificationOtpFlow.H = block10;
                        return emailVerificationOtpFlow;
                    }
                    EmailFlowContract$Step.EmailVerificationScreen emailVerificationScreen = (EmailFlowContract$Step.EmailVerificationScreen) step7;
                    emailVerificationPromptController = new EmailVerificationPromptController(new EmailVerificationPromptContract$InputData(emailVerificationScreen.f97552a, emailVerificationScreen.f97553b, EmailVerificationUseCase.Onboarding, null));
                    final int i43 = 1;
                    Function1 block11 = new Function1() { // from class: rai.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            r emailData;
                            int i432 = i43;
                            com.revolut.feature_retail_user_declarations.email.flow.d dVar2 = dVar;
                            switch (i432) {
                                case 0:
                                    com.revolut.feature_retail_user_declarations.email.screen.b screenOutput = (com.revolut.feature_retail_user_declarations.email.screen.b) obj6;
                                    Intrinsics.checkNotNullParameter(screenOutput, "screenOutput");
                                    boolean z3 = screenOutput instanceof yai.s;
                                    EmailFlowOutputData.Close close = EmailFlowOutputData.Close.f97564a;
                                    if (z3) {
                                        yai.s sVar = (yai.s) screenOutput;
                                        emailData = new EmailFlowOutputData.EmailData(sVar.f312045a, "EMAIL_SCREEN_CTA_BUTTON_TAG", sVar.f312047c, sVar.f312046b);
                                    } else {
                                        if (!Intrinsics.f(screenOutput, b.a.f97595a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        emailData = close;
                                    }
                                    com.revolut.feature_retail_user_declarations.email.flow.d dVar3 = dVar;
                                    dVar3.H2(dVar3.f97574t, new o(emailData, 1));
                                    if (emailData.equals(close)) {
                                        dVar3.C2(emailData);
                                    } else {
                                        if (!(emailData instanceof EmailFlowOutputData.EmailData)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        EmailFlowOutputData.EmailData emailData2 = (EmailFlowOutputData.EmailData) emailData;
                                        String str2 = emailData2.f97565a;
                                        yki.i iVar = dVar3.u;
                                        EmailFlowInputData emailFlowInputData2 = dVar3.o;
                                        if (emailFlowInputData2.f97557g) {
                                            if (((jte.d) dVar3.f97573s).c(UserDeclarationsApi$Toggles.EmailVerificationOtpUi.f97478c)) {
                                                h.t2(dVar3, iVar, new EmailFlowContract$Step.EmailVerificationOtp(str2), false, TransitionAnimation.FADE.f98392a, false, 10);
                                            } else if (dVar3.f97570p.a()) {
                                                h.w2(iVar, new EmailFlowContract$Step.EmailVerificationCooldown(new EmailVerificationCooldownBottomSheetContract$InvocationSource.Email(str2, emailFlowInputData2.f97557g)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                            } else {
                                                dVar3.l2(new com.revolut.feature_retail_user_declarations.email.flow.c(dVar3, emailData2, null), new yi5.b(26));
                                            }
                                        } else {
                                            dVar3.C2(emailData2);
                                        }
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    abi.d result = (abi.d) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (Intrinsics.f(result, abi.c.f2967a)) {
                                        dVar2.I2(((EmailFlowContract$State) ((j2) dVar2.f97574t.f22677a).getValue()).f97548a);
                                    } else {
                                        if (!Intrinsics.f(result, abi.b.f2966a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        int i59 = jli.h.f175850a;
                                    }
                                    return Unit.f186387a;
                                default:
                                    EmailVerificationOtpFlowOutputData result2 = (EmailVerificationOtpFlowOutputData) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!Intrinsics.f(result2, EmailVerificationOtpFlowOutputData.Verified.f97627a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    dVar2.u.e(true);
                                    dVar2.I2(((EmailFlowContract$State) ((j2) dVar2.f97574t.f22677a).getValue()).f97548a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    emailVerificationPromptController.H = block11;
                }
                return emailVerificationPromptController;
            case 11:
                com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.a aVar7 = (com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.a) obj4;
                ShippingTrackingScreenContract$InputData shippingTrackingScreenContract$InputData = aVar7.o;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ShippingTrackingScreenContract$ModalStep step8 = (ShippingTrackingScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof ShippingTrackingScreenContract$ModalStep.DeleteTracking) {
                    DeleteTrackingScreen deleteTrackingScreen = new DeleteTrackingScreen(new DeleteTrackingScreenContract$InputData(shippingTrackingScreenContract$InputData.f84631a, shippingTrackingScreenContract$InputData.f84632b.f84640a));
                    qi3.i block12 = new qi3.i(1, aVar7, com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.a.class, "handleDeleteResult", "handleDeleteResult(Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/bottom_sheet/delete_tracking/DeleteTrackingScreenContract$OutputData;)V", 0, 24);
                    Intrinsics.checkNotNullParameter(block12, "block");
                    deleteTrackingScreen.H = block12;
                    return deleteTrackingScreen;
                }
                if (!(step8 instanceof ShippingTrackingScreenContract$ModalStep.EditTracking)) {
                    throw new NoWhenBranchMatchedException();
                }
                AddShippingTrackingScreen addShippingTrackingScreen = new AddShippingTrackingScreen(new AddShippingTrackingScreenContract$InputData(new AddShippingTrackingScreenContract$TrackingRequest.Edit(shippingTrackingScreenContract$InputData.f84631a, shippingTrackingScreenContract$InputData.f84632b)));
                qi3.i block13 = new qi3.i(1, aVar7, com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.a.class, "handleAddScreenResult", "handleAddScreenResult(Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/add_shipping_tracking/AddShippingTrackingScreenContract$OutputData;)V", 0, 25);
                Intrinsics.checkNotNullParameter(block13, "block");
                addShippingTrackingScreen.H = block13;
                return addShippingTrackingScreen;
            case 12:
                com.revolut.feature.wealth.impl.ui.screens.popularassets.a aVar8 = (com.revolut.feature.wealth.impl.ui.screens.popularassets.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PopularAssetsControllerContract$ModalStep step9 = (PopularAssetsControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!Intrinsics.f(step9, PopularAssetsControllerContract$ModalStep.BondsLearnMore.f95629a)) {
                    throw new NoWhenBranchMatchedException();
                }
                rch.s sVar = aVar8.f95633s;
                rch.f dialog = rch.f.BONDS;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                if (rch.r.f253287a[dialog.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar9 = new lw0.a(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_popular_assets_bonds_dialog_dirty_price_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_popular_assets_bonds_dialog_dirty_price_subtitle, null, null, 14), null, null, false, 28);
                aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var3 = k9.Wealth;
                Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                return new ActionsBottomSheetController(new dii.a(aVar9, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), null, null, 24));
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return u.c(adh.n.b(((q) obj4).f253286b));
            case 14:
                com.revolut.feature_rev_points_pocket_impl.ui.flow.a aVar10 = (com.revolut.feature_rev_points_pocket_impl.ui.flow.a) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                RevPointsPocketFlowContract$Step step10 = (RevPointsPocketFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                int i59 = 10;
                if (!(step10 instanceof RevPointsPocketFlowContract$Step.Onboarding)) {
                    if (!(step10 instanceof RevPointsPocketFlowContract$Step.OnboardingAfterRevPointsOptIn)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    RevPointsPocketOnboardingScreen revPointsPocketOnboardingScreen = new RevPointsPocketOnboardingScreen(new RevPointsPocketOnboardingScreenContract$InputData(new RevPointsPocketDestination.Onboarding.Mode.OptIn(RevPointsOptInSource.PointsPocket.f83999a, true)));
                    o block14 = new o(aVar10, i59);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    revPointsPocketOnboardingScreen.H = block14;
                    return revPointsPocketOnboardingScreen;
                }
                RevPointsPocketDestination.Onboarding.Mode mode = ((RevPointsPocketFlowContract$Step.Onboarding) step10).f97811a;
                if (mode instanceof RevPointsPocketDestination.Onboarding.Mode.OptIn) {
                    RevPointsPocketDestination.Onboarding.Mode.OptIn optIn = (RevPointsPocketDestination.Onboarding.Mode.OptIn) mode;
                    if (!optIn.f97801a) {
                        ViewController viewControllerE12 = aVar10.e1(new hub.a(new LifestyleRevPointsOptInController$InputData(optIn.f97802b, false, 6)));
                        x block15 = new x(aVar10, FlowCoordinator, 24);
                        Intrinsics.checkNotNullParameter(block15, "block");
                        viewControllerE12.H = block15;
                        return viewControllerE12;
                    }
                }
                RevPointsPocketOnboardingScreen revPointsPocketOnboardingScreen2 = new RevPointsPocketOnboardingScreen(new RevPointsPocketOnboardingScreenContract$InputData(mode));
                o block16 = new o(aVar10, i59);
                Intrinsics.checkNotNullParameter(block16, "block");
                revPointsPocketOnboardingScreen2.H = block16;
                return revPointsPocketOnboardingScreen2;
            case 15:
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field3 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr2 = SwishTransactionLimitScreen.S;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field3, "field");
                MaskedTextInputEditText editText2 = field3.getEditText();
                Object obj6 = data.f51981p;
                Intrinsics.i(obj6, "null cannot be cast to non-null type com.revolut.feature.apm.swish.impl.ui.home.transaction_limit.TransactionLimitInputPayload");
                return new zp0.d(editText2, ((re2.l) obj6).f253502a, (u80.d) ((SwishTransactionLimitScreen) obj4).M.getValue(), null, null, false, false, 0, false, null, 1944);
            case 16:
                final com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.a aVar11 = (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.a) obj4;
                final yki.l FlowCoordinator2 = (yki.l) obj2;
                MortgageSignatureFlowContract$Step step11 = (MortgageSignatureFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (step11 instanceof MortgageSignatureFlowContract$Step.SigningMethods) {
                    SigningMethodsScreen signingMethodsScreen = new SigningMethodsScreen();
                    final int i66 = 0;
                    Function1 block17 = new Function1() { // from class: re4.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i66) {
                                case 0:
                                    ve4.m outputData = (ve4.m) obj7;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z3 = outputData instanceof l;
                                    com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.a aVar12 = aVar11;
                                    yki.l lVar = FlowCoordinator2;
                                    if (z3) {
                                        l lVar2 = (l) outputData;
                                        oki.h.t2(aVar12, lVar, new MortgageSignatureFlowContract$Step.Otp(lVar2.f288119a, lVar2.f288120b, lVar2.f288121c, lVar2.d), true, null, false, 12);
                                    } else {
                                        if (!(outputData instanceof k)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(aVar12, lVar, new MortgageSignatureFlowContract$Step.SigningMethodsInfo(((k) outputData).f288118a), true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    j outputData2 = (j) obj7;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z4 = outputData2 instanceof v94.h;
                                    yki.l lVar3 = FlowCoordinator2;
                                    if (z4) {
                                        com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.a aVar13 = aVar11;
                                        aVar13.l2(new qd8.e(aVar13, lVar3, outputData2, (Continuation) null, 26), new yi5.b(26));
                                    } else {
                                        if (!(outputData2 instanceof v94.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        lVar3.e(false);
                                    }
                                    return Unit.f186387a;
                                default:
                                    y44.k outputData3 = (y44.k) obj7;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean z6 = outputData3 instanceof y44.j;
                                    yki.l lVar4 = FlowCoordinator2;
                                    if (z6) {
                                        oki.h.w2(lVar4, new MortgageSignatureFlowContract$Step.Document(((y44.j) outputData3).f310779a), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                                    } else {
                                        boolean z11 = outputData3 instanceof y44.h;
                                        com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.a aVar14 = aVar11;
                                        if (z11) {
                                            int i74 = g.f253523a[aVar14.f68037p.f68028a.ordinal()];
                                            if (i74 == 1) {
                                                aVar14.l2(new i(aVar14, null, 1), new yi5.b(26));
                                            } else {
                                                if (i74 != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                oki.h.t2(aVar14, lVar4, MortgageSignatureFlowContract$Step.SigningMethods.f68035a, true, null, false, 12);
                                            }
                                        } else {
                                            if (!(outputData3 instanceof y44.i)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            c84.t.J2(aVar14, false, null, null, 7);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block17, "block");
                    signingMethodsScreen.H = block17;
                    return signingMethodsScreen;
                }
                if (step11 instanceof MortgageSignatureFlowContract$Step.SigningMethodsInfo) {
                    otpScreen = new SigningMethodsInfoScreen(new SigningMethodsInfoScreenContract$InputData(((MortgageSignatureFlowContract$Step.SigningMethodsInfo) step11).f68036a));
                } else {
                    if (!(step11 instanceof MortgageSignatureFlowContract$Step.Otp)) {
                        if (step11 instanceof MortgageSignatureFlowContract$Step.Document) {
                            du3.a aVar12 = ((MortgageSignatureFlowContract$Step.Document) step11).f68030a;
                            final int i74 = 1;
                            CreditPdfDocumentController creditPdfDocumentController = new CreditPdfDocumentController(new CreditPdfDocumentControllerContract$InputData(aVar12.f117551a, new CreditPdfDocumentControllerContract$Configuration(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_mortgage_signature_document_title, u.c(aVar12.f117552b), null, 12), new CreditPdfDocumentControllerContract$Configuration.Button(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_mortgage_signature_document_button, null, null, 14), com.revolut.feature.credit.application.plugins.impl.ui.document.pdf.d.EXPANDABLE)), new CreditPdfDocumentControllerContract$Document.Remote(aVar12.e, true)));
                            Function1 block18 = new Function1() { // from class: re4.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    switch (i74) {
                                        case 0:
                                            ve4.m outputData = (ve4.m) obj7;
                                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                                            boolean z3 = outputData instanceof l;
                                            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.a aVar122 = aVar11;
                                            yki.l lVar = FlowCoordinator2;
                                            if (z3) {
                                                l lVar2 = (l) outputData;
                                                oki.h.t2(aVar122, lVar, new MortgageSignatureFlowContract$Step.Otp(lVar2.f288119a, lVar2.f288120b, lVar2.f288121c, lVar2.d), true, null, false, 12);
                                            } else {
                                                if (!(outputData instanceof k)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                oki.h.t2(aVar122, lVar, new MortgageSignatureFlowContract$Step.SigningMethodsInfo(((k) outputData).f288118a), true, null, false, 12);
                                            }
                                            return Unit.f186387a;
                                        case 1:
                                            j outputData2 = (j) obj7;
                                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                            boolean z4 = outputData2 instanceof v94.h;
                                            yki.l lVar3 = FlowCoordinator2;
                                            if (z4) {
                                                com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.a aVar13 = aVar11;
                                                aVar13.l2(new qd8.e(aVar13, lVar3, outputData2, (Continuation) null, 26), new yi5.b(26));
                                            } else {
                                                if (!(outputData2 instanceof v94.i)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                lVar3.e(false);
                                            }
                                            return Unit.f186387a;
                                        default:
                                            y44.k outputData3 = (y44.k) obj7;
                                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                            boolean z6 = outputData3 instanceof y44.j;
                                            yki.l lVar4 = FlowCoordinator2;
                                            if (z6) {
                                                oki.h.w2(lVar4, new MortgageSignatureFlowContract$Step.Document(((y44.j) outputData3).f310779a), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                                            } else {
                                                boolean z11 = outputData3 instanceof y44.h;
                                                com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.a aVar14 = aVar11;
                                                if (z11) {
                                                    int i742 = g.f253523a[aVar14.f68037p.f68028a.ordinal()];
                                                    if (i742 == 1) {
                                                        aVar14.l2(new i(aVar14, null, 1), new yi5.b(26));
                                                    } else {
                                                        if (i742 != 2) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        oki.h.t2(aVar14, lVar4, MortgageSignatureFlowContract$Step.SigningMethods.f68035a, true, null, false, 12);
                                                    }
                                                } else {
                                                    if (!(outputData3 instanceof y44.i)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    c84.t.J2(aVar14, false, null, null, 7);
                                                }
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block18, "block");
                            creditPdfDocumentController.H = block18;
                            return creditPdfDocumentController;
                        }
                        if (!(step11 instanceof MortgageSignatureFlowContract$Step.Documents)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                        CreditApplicationCommonContext creditApplicationCommonContextO = t1.O(aVar11.f68037p);
                        companion.getClass();
                        CreditApplicationDocumentsScreen creditApplicationDocumentsScreen = new CreditApplicationDocumentsScreen(new CreditApplicationDocumentsScreenContract$InputData(str, new AnalyticsContext(AnalyticsContext.Companion.a(creditApplicationCommonContextO)), 1));
                        Function1 block19 = new Function1() { // from class: re4.f
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                switch (i2) {
                                    case 0:
                                        ve4.m outputData = (ve4.m) obj7;
                                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                                        boolean z3 = outputData instanceof l;
                                        com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.a aVar122 = aVar11;
                                        yki.l lVar = FlowCoordinator2;
                                        if (z3) {
                                            l lVar2 = (l) outputData;
                                            oki.h.t2(aVar122, lVar, new MortgageSignatureFlowContract$Step.Otp(lVar2.f288119a, lVar2.f288120b, lVar2.f288121c, lVar2.d), true, null, false, 12);
                                        } else {
                                            if (!(outputData instanceof k)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.t2(aVar122, lVar, new MortgageSignatureFlowContract$Step.SigningMethodsInfo(((k) outputData).f288118a), true, null, false, 12);
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        j outputData2 = (j) obj7;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        boolean z4 = outputData2 instanceof v94.h;
                                        yki.l lVar3 = FlowCoordinator2;
                                        if (z4) {
                                            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.a aVar13 = aVar11;
                                            aVar13.l2(new qd8.e(aVar13, lVar3, outputData2, (Continuation) null, 26), new yi5.b(26));
                                        } else {
                                            if (!(outputData2 instanceof v94.i)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            lVar3.e(false);
                                        }
                                        return Unit.f186387a;
                                    default:
                                        y44.k outputData3 = (y44.k) obj7;
                                        Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                        boolean z6 = outputData3 instanceof y44.j;
                                        yki.l lVar4 = FlowCoordinator2;
                                        if (z6) {
                                            oki.h.w2(lVar4, new MortgageSignatureFlowContract$Step.Document(((y44.j) outputData3).f310779a), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                                        } else {
                                            boolean z11 = outputData3 instanceof y44.h;
                                            com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.a aVar14 = aVar11;
                                            if (z11) {
                                                int i742 = g.f253523a[aVar14.f68037p.f68028a.ordinal()];
                                                if (i742 == 1) {
                                                    aVar14.l2(new i(aVar14, null, 1), new yi5.b(26));
                                                } else {
                                                    if (i742 != 2) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    oki.h.t2(aVar14, lVar4, MortgageSignatureFlowContract$Step.SigningMethods.f68035a, true, null, false, 12);
                                                }
                                            } else {
                                                if (!(outputData3 instanceof y44.i)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                c84.t.J2(aVar14, false, null, null, 7);
                                            }
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block19, "block");
                        creditApplicationDocumentsScreen.H = block19;
                        return creditApplicationDocumentsScreen;
                    }
                    MortgageSignatureFlowContract$Step.Otp otp = (MortgageSignatureFlowContract$Step.Otp) step11;
                    yy3.i iVar = otp.f68032a;
                    otpScreen = new OtpScreen(new OtpScreenContract$InputData(iVar.f317776a, otp.f68033b, otp.f68034c, otp.d, iVar.e));
                    o block20 = new o(aVar11, 12);
                    Intrinsics.checkNotNullParameter(block20, "block");
                    otpScreen.H = block20;
                }
                return otpScreen;
            case 17:
                final com.revolut.feature.post_activation.impl.ui.flow.a aVar13 = (com.revolut.feature.post_activation.impl.ui.flow.a) obj4;
                PostActivationFlowContract$Step step12 = (PostActivationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (Intrinsics.f(step12, PostActivationFlowContract$Step.ProfileDetails.f80940a)) {
                    ViewController viewControllerE13 = aVar13.e1(ew9.c.f130113a);
                    final int i92 = 0;
                    Function1 block21 = new Function1() { // from class: rfa.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i92) {
                                case 0:
                                    c.a it8 = (c.a) obj7;
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    com.revolut.feature.post_activation.impl.ui.flow.a aVar14 = aVar13;
                                    aVar14.l2(new e(aVar14, null, 0), new yi5.b(26));
                                    break;
                                default:
                                    g3a.b it9 = (g3a.b) obj7;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    com.revolut.feature.post_activation.impl.ui.flow.a aVar15 = aVar13;
                                    aVar15.l2(new e(aVar15, null, 1), new yi5.b(26));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block21, "block");
                    viewControllerE13.H = block21;
                    return viewControllerE13;
                }
                if (!Intrinsics.f(step12, PostActivationFlowContract$Step.ContactsSync.f80939a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE14 = aVar13.e1(new g3a.c());
                final int i96 = 1;
                Function1 block22 = new Function1() { // from class: rfa.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (i96) {
                            case 0:
                                c.a it8 = (c.a) obj7;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                com.revolut.feature.post_activation.impl.ui.flow.a aVar14 = aVar13;
                                aVar14.l2(new e(aVar14, null, 0), new yi5.b(26));
                                break;
                            default:
                                g3a.b it9 = (g3a.b) obj7;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                com.revolut.feature.post_activation.impl.ui.flow.a aVar15 = aVar13;
                                aVar15.l2(new e(aVar15, null, 1), new yi5.b(26));
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block22, "block");
                viewControllerE14.H = block22;
                return viewControllerE14;
            case 18:
                List domain = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((rg3.o) obj4).f254014b.f("CHALLENGES_KEY", domain);
                return Unit.f186387a;
            case 19:
                final com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b bVar5 = (com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PreApplicationChecksScreenContract$ModalStep step13 = (PreApplicationChecksScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (step13 instanceof PreApplicationChecksScreenContract$ModalStep.ChangePhone) {
                    final int i99 = 0;
                    ViewController viewControllerE15 = bVar5.e1(new com.revolut.sso.api.phone.change.a(0));
                    mif.a.c0(viewControllerE15, bVar5, new Function1() { // from class: rg4.u
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            int i100 = i99;
                            com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b bVar6 = bVar5;
                            switch (i100) {
                                case 0:
                                    fjl.c cVar2 = (fjl.c) obj7;
                                    if (cVar2 instanceof fjl.a) {
                                        bVar6.I2();
                                    } else if (!(cVar2 instanceof fjl.b) && cVar2 != null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    bVar6.I2();
                                    return Unit.f186387a;
                                default:
                                    dii.g gVar2 = (dii.g) obj7;
                                    if (gVar2 != null && !(gVar2 instanceof dii.e)) {
                                        if (gVar2 instanceof dii.f) {
                                            bVar6.C2(q.f254031a);
                                        } else {
                                            if (!(gVar2 instanceof dii.b) && !(gVar2 instanceof dii.c) && !(gVar2 instanceof dii.d)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.ERROR, "PreApplicationChecksScreenModel", m72.b.r("Unsupported reapply bottom sheet output ", o0.f186429a.b(gVar2.getClass())), null, h0Var);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    });
                    return viewControllerE15;
                }
                if (step13 instanceof PreApplicationChecksScreenContract$ModalStep.Workflow) {
                    ViewController viewControllerE16 = bVar5.e1(new til.c(new WorkflowControllerDescriptor$InputData(new WorkflowConfiguration.Workflow(((PreApplicationChecksScreenContract$ModalStep.Workflow) step13).f68229a, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 126), new WorkflowFlowType.Regular(til.s.CROSS), til.i.DEFAULT, 48)));
                    final int i100 = 1;
                    mif.a.c0(viewControllerE16, bVar5, new Function1() { // from class: rg4.u
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            int i1002 = i100;
                            com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b bVar6 = bVar5;
                            switch (i1002) {
                                case 0:
                                    fjl.c cVar2 = (fjl.c) obj7;
                                    if (cVar2 instanceof fjl.a) {
                                        bVar6.I2();
                                    } else if (!(cVar2 instanceof fjl.b) && cVar2 != null) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    bVar6.I2();
                                    return Unit.f186387a;
                                default:
                                    dii.g gVar2 = (dii.g) obj7;
                                    if (gVar2 != null && !(gVar2 instanceof dii.e)) {
                                        if (gVar2 instanceof dii.f) {
                                            bVar6.C2(q.f254031a);
                                        } else {
                                            if (!(gVar2 instanceof dii.b) && !(gVar2 instanceof dii.c) && !(gVar2 instanceof dii.d)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.ERROR, "PreApplicationChecksScreenModel", m72.b.r("Unsupported reapply bottom sheet output ", o0.f186429a.b(gVar2.getClass())), null, h0Var);
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    });
                    return viewControllerE16;
                }
                if (!(step13 instanceof PreApplicationChecksScreenContract$ModalStep.Reapply)) {
                    throw new NoWhenBranchMatchedException();
                }
                ActionsBottomSheetController.Companion aVar14 = ActionsBottomSheetController.INSTANCE;
                lw0.a aVar15 = new lw0.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pre_application_checks_rejected_reapply_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pre_application_checks_rejected_reapply_description, null, null, 14), null, null, false, 28);
                m6 m6Var3 = n6.Companion;
                ActionsBottomSheetController actionsBottomSheetControllerB = dy4.a.b(aVar14, aVar15, new aw0.h(false, m6.c(m6Var3, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pre_application_checks_rejected_reapply_secondary_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var3, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pre_application_checks_rejected_reapply_primary_button, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121), null, 12);
                mif.a.c0(actionsBottomSheetControllerB, bVar5, new Function1() { // from class: rg4.u
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        int i1002 = i2;
                        com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b bVar6 = bVar5;
                        switch (i1002) {
                            case 0:
                                fjl.c cVar2 = (fjl.c) obj7;
                                if (cVar2 instanceof fjl.a) {
                                    bVar6.I2();
                                } else if (!(cVar2 instanceof fjl.b) && cVar2 != null) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.f186387a;
                            case 1:
                                bVar6.I2();
                                return Unit.f186387a;
                            default:
                                dii.g gVar2 = (dii.g) obj7;
                                if (gVar2 != null && !(gVar2 instanceof dii.e)) {
                                    if (gVar2 instanceof dii.f) {
                                        bVar6.C2(q.f254031a);
                                    } else {
                                        if (!(gVar2 instanceof dii.b) && !(gVar2 instanceof dii.c) && !(gVar2 instanceof dii.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                        rd0.d.a(rd0.c.ERROR, "PreApplicationChecksScreenModel", m72.b.r("Unsupported reapply bottom sheet output ", o0.f186429a.b(gVar2.getClass())), null, h0Var);
                                    }
                                }
                                return Unit.f186387a;
                        }
                    }
                });
                return actionsBottomSheetControllerB;
            case 20:
                Function1 getErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getErrorItems, "getErrorItems");
                return new rg4.t((List) getErrorItems.invoke(new iii.d(14, null, true, false, null)), ((rg4.x) obj4).d(null), null);
            case 21:
                com.revolut.retail.feature.esim.impl.ui.flows.share_qr_code.b bVar6 = (com.revolut.retail.feature.esim.impl.ui.flows.share_qr_code.b) obj4;
                EsimShareQrCodeFlowContract$Step step14 = (EsimShareQrCodeFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (step14 instanceof EsimShareQrCodeFlowContract$Step.Content) {
                    return new EsimShareQrCodeScreen(bVar6.f100879r);
                }
                if (!(step14 instanceof EsimShareQrCodeFlowContract$Step.Restricted)) {
                    throw new NoWhenBranchMatchedException();
                }
                PromptMarketingScreen promptMarketingScreen3 = new PromptMarketingScreen(((EsimShareQrCodeFlowContract$Step.Restricted) step14).f100878a);
                o block23 = new o(bVar6, 21);
                Intrinsics.checkNotNullParameter(block23, "block");
                promptMarketingScreen3.H = block23;
                return promptMarketingScreen3;
            case 22:
                com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a aVar16 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelMilesFlightSearchResultsFiltersScreenContract$ModalStep step15 = (TravelMilesFlightSearchResultsFiltersScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (!(step15 instanceof TravelMilesFlightSearchResultsFiltersScreenContract$ModalStep.FilterOptions)) {
                    throw new NoWhenBranchMatchedException();
                }
                TravelMilesFlightSearchResultsFiltersScreenContract$ModalStep.FilterOptions filterOptions = (TravelMilesFlightSearchResultsFiltersScreenContract$ModalStep.FilterOptions) step15;
                TravelMilesFlightSearchFilterOptionScreen travelMilesFlightSearchFilterOptionScreen = new TravelMilesFlightSearchFilterOptionScreen(new TravelMilesFlightSearchFilterOptionScreenContract$InputData(filterOptions.f94339a, filterOptions.f94340b, filterOptions.f94341c));
                rgf.m block24 = new rgf.m(aVar16, step15, 5);
                Intrinsics.checkNotNullParameter(block24, "block");
                travelMilesFlightSearchFilterOptionScreen.H = block24;
                return travelMilesFlightSearchFilterOptionScreen;
            case 23:
                final com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar7 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b) obj4;
                PlanChangeFlowContract$Step step16 = (PlanChangeFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (step16 instanceof PlanChangeFlowContract$Step.SelectPlan) {
                    rhk.c cVar2 = bVar7.o;
                    PlanFilter planFilter = cVar2.f254507a;
                    PlanSelection planSelection = cVar2.f254508b;
                    xfa.b bVar8 = cVar2.d;
                    rhk.e eVar2 = cVar2.f254509c;
                    PlanSelectionCoreFlow planSelectionCoreFlow = new PlanSelectionCoreFlow(new jhk.c(planFilter, planSelection, bVar8, new jhk.j(eVar2.f254512b, eVar2.f254511a, Integer.valueOf(R$drawable.uikit_icn_24_back), false), new jhk.k(false), cVar2.f, null, 64));
                    final int i101 = 1;
                    Function1 block25 = new Function1() { // from class: rhk.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i101) {
                                case 0:
                                    com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar9 = bVar7;
                                    yki.a aVar17 = bVar9.z;
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.a result = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.a) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (Intrinsics.f(result, a.C0637a.f103489a)) {
                                        oki.h.D2(aVar17);
                                    } else {
                                        if (!Intrinsics.f(result, a.b.f103490a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        PlanChangeSuccessActionStrategy planChangeSuccessActionStrategy = bVar9.o.e;
                                        if (planChangeSuccessActionStrategy instanceof PlanChangeSuccessActionStrategy.PostResult) {
                                            bVar9.C2(d.f254510a);
                                        } else {
                                            if (!(planChangeSuccessActionStrategy instanceof PlanChangeSuccessActionStrategy.CardOrderIfNeeded) && !(planChangeSuccessActionStrategy instanceof PlanChangeSuccessActionStrategy.NavigateNext) && !(planChangeSuccessActionStrategy instanceof PlanChangeSuccessActionStrategy.Quit)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.D2(aVar17);
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    jhk.i output = (jhk.i) obj7;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    boolean z3 = output instanceof jhk.f;
                                    com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar10 = bVar7;
                                    if (z3) {
                                        jhk.f fVar = (jhk.f) output;
                                        hha.d dVar2 = fVar.f174288a;
                                        hha.i iVar2 = fVar.f174289b;
                                        PricingPlanOffer pricingPlanOffer = fVar.f174290c;
                                        CheckoutOrder checkoutOrder = bVar10.f103139y;
                                        if (checkoutOrder != null) {
                                            bVar10.l2(new p(16, bVar10, checkoutOrder, dVar2, iVar2, (Continuation) null), new yi5.b(26));
                                        } else {
                                            bVar10.l2(new p(14, bVar10, dVar2, iVar2, pricingPlanOffer, (Continuation) null), new yi5.b(26));
                                        }
                                    } else if (output instanceof jhk.d) {
                                        jhk.d dVar3 = (jhk.d) output;
                                        hha.d dVar4 = dVar3.f174283a;
                                        hha.i iVar3 = dVar3.f174284b;
                                        PricingPlanOffer pricingPlanOffer2 = dVar3.f174285c;
                                        CheckoutOrder checkoutOrder2 = bVar10.f103139y;
                                        if (checkoutOrder2 != null) {
                                            if (iVar3 == null) {
                                                iVar3 = hha.i.MONTHLY;
                                            }
                                            bVar10.l2(new p(16, bVar10, checkoutOrder2, dVar4, iVar3, (Continuation) null), new yi5.b(26));
                                        } else {
                                            bVar10.K2(dVar4, iVar3, pricingPlanOffer2);
                                        }
                                    } else if (output instanceof jhk.g) {
                                        oki.h.D2(bVar10.z);
                                    } else {
                                        if (!(output instanceof jhk.h)) {
                                            if (output instanceof jhk.e) {
                                                throw new IllegalStateException("No billing options for non-standard plan are not allowed");
                                            }
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.t2(bVar10, bVar10.z, PlanChangeFlowContract$Step.PlanCancel.f103127a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block25, "block");
                    planSelectionCoreFlow.H = block25;
                    return planSelectionCoreFlow;
                }
                if (step16 instanceof PlanChangeFlowContract$Step.ExistingPreorderWarning) {
                    PlanChangeFlowContract$Step.ExistingPreorderWarning existingPreorderWarning = (PlanChangeFlowContract$Step.ExistingPreorderWarning) step16;
                    ExistingPreorderWarningFlow existingPreorderWarningFlow = new ExistingPreorderWarningFlow(new akk.h(existingPreorderWarning.f103125b, existingPreorderWarning.f103126c));
                    rgf.m block26 = new rgf.m(bVar7, existingPreorderWarning, 6);
                    Intrinsics.checkNotNullParameter(block26, "block");
                    existingPreorderWarningFlow.H = block26;
                    return existingPreorderWarningFlow;
                }
                if (!(step16 instanceof PlanChangeFlowContract$Step.PlanCancel)) {
                    throw new NoWhenBranchMatchedException();
                }
                final int i102 = 0;
                PlanCancelFlow planCancelFlow = new PlanCancelFlow(new PlanCancelFlowContract$InputData(false, null));
                Function1 block27 = new Function1() { // from class: rhk.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (i102) {
                            case 0:
                                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar9 = bVar7;
                                yki.a aVar17 = bVar9.z;
                                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.a result = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.a) obj7;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (Intrinsics.f(result, a.C0637a.f103489a)) {
                                    oki.h.D2(aVar17);
                                } else {
                                    if (!Intrinsics.f(result, a.b.f103490a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    PlanChangeSuccessActionStrategy planChangeSuccessActionStrategy = bVar9.o.e;
                                    if (planChangeSuccessActionStrategy instanceof PlanChangeSuccessActionStrategy.PostResult) {
                                        bVar9.C2(d.f254510a);
                                    } else {
                                        if (!(planChangeSuccessActionStrategy instanceof PlanChangeSuccessActionStrategy.CardOrderIfNeeded) && !(planChangeSuccessActionStrategy instanceof PlanChangeSuccessActionStrategy.NavigateNext) && !(planChangeSuccessActionStrategy instanceof PlanChangeSuccessActionStrategy.Quit)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.D2(aVar17);
                                    }
                                }
                                return Unit.f186387a;
                            default:
                                jhk.i output = (jhk.i) obj7;
                                Intrinsics.checkNotNullParameter(output, "output");
                                boolean z3 = output instanceof jhk.f;
                                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar10 = bVar7;
                                if (z3) {
                                    jhk.f fVar = (jhk.f) output;
                                    hha.d dVar2 = fVar.f174288a;
                                    hha.i iVar2 = fVar.f174289b;
                                    PricingPlanOffer pricingPlanOffer = fVar.f174290c;
                                    CheckoutOrder checkoutOrder = bVar10.f103139y;
                                    if (checkoutOrder != null) {
                                        bVar10.l2(new p(16, bVar10, checkoutOrder, dVar2, iVar2, (Continuation) null), new yi5.b(26));
                                    } else {
                                        bVar10.l2(new p(14, bVar10, dVar2, iVar2, pricingPlanOffer, (Continuation) null), new yi5.b(26));
                                    }
                                } else if (output instanceof jhk.d) {
                                    jhk.d dVar3 = (jhk.d) output;
                                    hha.d dVar4 = dVar3.f174283a;
                                    hha.i iVar3 = dVar3.f174284b;
                                    PricingPlanOffer pricingPlanOffer2 = dVar3.f174285c;
                                    CheckoutOrder checkoutOrder2 = bVar10.f103139y;
                                    if (checkoutOrder2 != null) {
                                        if (iVar3 == null) {
                                            iVar3 = hha.i.MONTHLY;
                                        }
                                        bVar10.l2(new p(16, bVar10, checkoutOrder2, dVar4, iVar3, (Continuation) null), new yi5.b(26));
                                    } else {
                                        bVar10.K2(dVar4, iVar3, pricingPlanOffer2);
                                    }
                                } else if (output instanceof jhk.g) {
                                    oki.h.D2(bVar10.z);
                                } else {
                                    if (!(output instanceof jhk.h)) {
                                        if (output instanceof jhk.e) {
                                            throw new IllegalStateException("No billing options for non-standard plan are not allowed");
                                        }
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oki.h.t2(bVar10, bVar10.z, PlanChangeFlowContract$Step.PlanCancel.f103127a, true, null, false, 12);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block27, "block");
                planCancelFlow.H = block27;
                return planCancelFlow;
            case 24:
                com.revolut.kompot.common.flow.navigation.a aVar17 = (com.revolut.kompot.common.flow.navigation.a) obj4;
                NavigationFlow.Step step17 = (NavigationFlow.Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step17, "step");
                nhi.j jVar = aVar17.f98336p;
                if (step17 instanceof NavigationFlow.Step.InitialController) {
                    return aVar17.o;
                }
                if (!(step17 instanceof NavigationFlow.Step.StackDestinationStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                StackDestination stackDestination = ((NavigationFlow.Step.StackDestinationStep) step17).f98335a;
                if (stackDestination instanceof ControllerDestination.Stack) {
                    return ((nhi.b) jVar).d(((ControllerDestination.Stack) stackDestination).f98284a).f5285a;
                }
                return ((nhi.b) jVar).a(stackDestination, aVar17.f98337q);
            case 25:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.a aVar18 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.a) obj4;
                StudentFlowContract$Step step18 = (StudentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step18, "step");
                if (step18 instanceof StudentFlowContract$Step.StudentHub) {
                    StudentHubScreen studentHubScreen = new StudentHubScreen();
                    rik.c block28 = new rik.c(aVar18, i2);
                    Intrinsics.checkNotNullParameter(block28, "block");
                    studentHubScreen.H = block28;
                    return studentHubScreen;
                }
                if (step18 instanceof StudentFlowContract$Step.StudentVerification) {
                    String str2 = ((StudentFlowContract$Step.StudentVerification) step18).f103268a;
                    StudentVerificationFlow studentVerificationFlow = new StudentVerificationFlow(str2 != null ? new StudentVerificationFlowContract$InputData.Verification(str2) : StudentVerificationFlowContract$InputData.Default.f103271a);
                    rik.c block29 = new rik.c(aVar18, 1);
                    Intrinsics.checkNotNullParameter(block29, "block");
                    studentVerificationFlow.H = block29;
                    return studentVerificationFlow;
                }
                int i103 = 1;
                if (!Intrinsics.f(step18, StudentFlowContract$Step.StudentStatus.f103267a)) {
                    throw new NoWhenBranchMatchedException();
                }
                StudentVerificationFlow studentVerificationFlow2 = new StudentVerificationFlow(StudentVerificationFlowContract$InputData.StudentStatus.f103272a);
                rik.c block30 = new rik.c(aVar18, i103);
                Intrinsics.checkNotNullParameter(block30, "block");
                studentVerificationFlow2.H = block30;
                return studentVerificationFlow2;
            case 26:
                com.revolut.feature.credit.application.plugins.impl.ui.workflow.a aVar19 = (com.revolut.feature.credit.application.plugins.impl.ui.workflow.a) obj4;
                CreditWorkflowContract$Step step19 = (CreditWorkflowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step19, "step");
                if (!(step19 instanceof CreditWorkflowContract$Step.Initial)) {
                    throw new NoWhenBranchMatchedException();
                }
                til.m mVar = aVar19.f68535q;
                CreditWorkflowContract$InputData creditWorkflowContract$InputData = aVar19.f68534p;
                String str3 = creditWorkflowContract$InputData.f68532b;
                if (str3 != null) {
                    createWorkflow = new WorkflowConfiguration.Workflow(str3, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 126);
                } else {
                    Pair pair = new Pair(ib.b.Flow, "CREDIT_ONBOARDING");
                    CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration2 = creditWorkflowContract$InputData.f68531a;
                    createWorkflow = new WorkflowConfiguration.CreateWorkflow(r0.k(pair, new Pair("country", creditApplicationPluginFlowContract$Configuration2.f.f297794a), new Pair("creditApplicationId", creditApplicationPluginFlowContract$Configuration2.f66892b)), null, 62);
                }
                WorkflowFlow workflowFlowB = til.m.b(mVar, createWorkflow, new WorkflowFlowType.Regular(til.s.CROSS), til.i.DEFAULT, 48);
                o block31 = new o(aVar19, 26);
                Intrinsics.checkNotNullParameter(block31, "block");
                workflowFlowB.H = block31;
                return workflowFlowB;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                ((rk7.n) obj4).getClass();
                return g.a.f254759a;
            case 28:
                com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a aVar20 = (com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SummaryControllerContract$ModalStep step20 = (SummaryControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step20, "step");
                if (!(step20 instanceof SummaryControllerContract$ModalStep.Info)) {
                    throw new NoWhenBranchMatchedException();
                }
                RightToCancelSummaryContent.Info info = ((SummaryControllerContract$ModalStep.Info) step20).f78929a;
                return aVar20.e1(new s(new t(new z2(220, info.f78867a, info.f78868b, info.f78869c, null))));
            default:
                il2.i domain2 = (il2.i) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain2, "domain");
                ((rl2.d) obj4).f254912b.f("KEY_RESTRICTIONS", domain2);
                return Unit.f186387a;
        }
    }
}
