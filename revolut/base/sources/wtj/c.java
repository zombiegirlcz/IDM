package wtj;

import aii.q;
import android.os.Parcelable;
import auj.i;
import b53.b;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.camerakit.revolut.ui.barcodeqr.BarcodeQrReaderFlowContract$Step;
import com.revolut.camerakit.revolut.ui.barcodeqr.screen.BarcodeQrReaderScreen;
import com.revolut.camerakit.revolut.ui.barcodeqr.screen.BarcodeQrReaderScreenContract$InputData;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.pro_merchant.toggles.api.model.FreelancerPluginType;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.ApmAliasClaimFormFlowContract$Step;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.additional_info.ApmAliasClaimAdditionalInfoScreen;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.upload.ApmAliasClaimUploadScreen;
import com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.upload.ApmAliasClaimUploadScreenContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationController;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationControllerContract$ModalStep;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.a;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.dialogs.CardPersonalisationDialogsController;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.dialogs.CardPersonalisationDialogsControllerContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.emoji_picker.CardPersonalisationEmojiPickerController;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.emoji_picker.CardPersonalisationEmojiPickerControllerContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.guidelines.CardPersonalisationGuidelinesController;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.guidelines.CardPersonalisationGuidelinesControllerContract$InputData;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.TransactionFilterFlowContract$Step;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters.FiltersScreen;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters.FiltersScreenContract$InputData;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters_by_type.FiltersByTypeScreen;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters_by_type.FiltersByTypeScreenContract$InputData;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.chooser.FreelancerPluginChooserScreen;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.chooser.FreelancerPluginChooserScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.details.FreelancerPluginDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.details.FreelancerPluginDetailsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.ManageEcommercePluginFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.preview.FreelancerPluginPreviewScreen;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.preview.FreelancerPluginPreviewScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.preview.FreelancerPluginPreviewScreenContract$PluginType;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.shopify.ShopifyManageScreen;
import com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.FreelancerTradingNameFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.subaccount.create.screen.FreelancerTaxReservationScreen;
import com.revolut.feature.freelancer.impl.ui.subaccount.create.screen.FreelancerTaxReservationScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.subaccount.update.flow.FreelancerUpdateTaxPocketFlowContract$Step;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.SmartFeedScreenContract$ModalStep;
import com.revolut.feature.kyc.impl.screens.addressconfirmation.AddressConfirmationScreenContract$ModalStep;
import com.revolut.feature.kyc_documents_scan.api.models.WorkflowDocumentScanCofiguration;
import com.revolut.feature.kyc_documents_scan.ui.document_scan_flow.DocumentScanFlow;
import com.revolut.feature.kyc_documents_scan.ui.document_scan_flow.DocumentScanFlowContract$InputData;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.profile.api.navigation.ProfileAddressControllerDescriptor;
import com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.ReferralsTroubleshooterTopLevelScreenContract$ModalStep;
import com.revolut.feature.statements.impl.ui.account.AccountsStatementsContract$ModalStep;
import com.revolut.feature.transport.impl.ui.help.TransportHelpFlowContract$Step;
import com.revolut.feature.transport.impl.ui.help.contact.TransportHelpContactScreen;
import com.revolut.feature.transport.impl.ui.help.main.TransportHelpMainScreen;
import com.revolut.feature.wealth.analytics.benchmark.ui.PerformanceBenchmarkSelectionContract$InputData;
import com.revolut.feature.wealth.analytics.benchmark.ui.PerformanceBenchmarkSelectionController;
import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartFacade;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceContract$ModalStep;
import com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams;
import com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.RewardsHubFlowContract$Step;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.ChallengeDetailsController;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.ChallengeDetailsScreenContract$InputData;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_history.RewardsHubChallengeHistoryScreen;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_history.RewardsHubChallengeHistoryScreenContract$InputData;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.collection.RewardsHubCollectionScreen;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.collection.RewardsHubCollectionScreenContract$InputData;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.direct_reward.RewardsHubDirectRewardScreen;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.direct_reward.RewardsHubDirectRewardScreenContract$InputData;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.eligibility_criteria.EligibilityCriteriaController;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.eligibility_criteria.EligibilityCriteriaScreenContract$InputData;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.home.RewardsHubHomeScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.FundamentalsScreenContract$ModalStep;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.modal_screens.expected_annual_return.ExpectedAnnualReturnInfoScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.modal_screens.expected_annual_return_chart_info.ExpectedAnnualReturnChartInfoScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.modal_screens.sharpe_ratio_info.SharpeRatioInfoScreen;
import com.revolut.shared.feature.workflow.engine.api.models.SdkVendorInfo;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowControllerDescriptor$InputData;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import com.revolut.trading.orders.ui.invest.placement.flow.InvestOrderFlowContract$Step;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreen;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreen;
import cuj.n;
import d0j.m;
import d33.e;
import euj.j;
import grl.k9;
import iuj.r;
import iuj.s;
import iuj.t;
import iuj.u;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jmrtd.lds.LDSFile;
import qw6.f;
import qw6.g;
import s7a.w;
import s7a.x;
import vkm.j2;
import wp5.v;
import wvg.b2;
import wvg.d0;
import wvg.d1;
import wvg.e0;
import wvg.f1;
import wvg.g0;
import wvg.k;
import wvg.o;
import wvg.p;
import wvg.t0;
import yhm.m;
import yki.l;
import z23.e;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f299999b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f299998a = i;
        this.f299999b = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Object obj4;
        Object eligibilityCriteriaController;
        DocumentScanFlowContract$InputData onfidoStudio;
        FreelancerPluginPreviewScreenContract$PluginType freelancerPluginPreviewScreenContract$PluginType;
        Object freelancerPluginPreviewScreen;
        int i;
        int i2 = this.f299998a;
        final int i3 = 5;
        boolean z = false;
        boolean z3 = false;
        int i5 = 0;
        boolean z4 = false;
        boolean z6 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z29 = false;
        boolean z31 = false;
        boolean z41 = false;
        boolean z49 = false;
        boolean z54 = false;
        boolean z74 = false;
        Object obj5 = this.f299999b;
        switch (i2) {
            case 0:
                final com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a aVar = (com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a) obj5;
                final l FlowCoordinator = (l) obj2;
                RewardsHubFlowContract$Step step = (RewardsHubFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof RewardsHubFlowContract$Step.RewardsHubHome) {
                    RewardsHubHomeScreen rewardsHubHomeScreen = new RewardsHubHomeScreen();
                    final boolean z83 = z6 ? 1 : 0;
                    Function1 block = new Function1() { // from class: wtj.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (z83) {
                                case 0:
                                    u outputData = (u) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z89 = outputData instanceof r;
                                    com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a aVar2 = aVar;
                                    l lVar = FlowCoordinator;
                                    if (z89) {
                                        r rVar = (r) outputData;
                                        h.t2(aVar2, lVar, new RewardsHubFlowContract$Step.RewardsHubChallengeDetails(new ChallengeDetailsScreenContract$InputData(new RewardsHubChallengeDetailsParams(rVar.f168644a, rVar.f168645b))), false, null, false, 14);
                                    } else if (outputData instanceof s) {
                                        h.t2(aVar2, lVar, new RewardsHubFlowContract$Step.RewardsHubChallengeHistory(((s) outputData).f168646a), false, null, false, 14);
                                    } else {
                                        if (!(outputData instanceof t)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar2.C1(new ReferralsBizFeatureConfig.InviteCampaignHomeNavigationDestination(false, false, null, ((t) outputData).f168647a, 7));
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    i outputData2 = (i) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z96 = outputData2 instanceof auj.h;
                                    com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a aVar3 = aVar;
                                    l lVar2 = FlowCoordinator;
                                    if (z96) {
                                        auj.h hVar = (auj.h) outputData2;
                                        h.t2(aVar3, lVar2, new RewardsHubFlowContract$Step.RewardsHubChallengeDetails(new ChallengeDetailsScreenContract$InputData(new RewardsHubChallengeDetailsParams(hVar.f9845a, hVar.f9846b))), false, null, false, 14);
                                    } else {
                                        if (!(outputData2 instanceof i.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(aVar3, lVar2, new RewardsHubFlowContract$Step.RewardsHubChallengeHistory(m.ARCHIVED), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                                default:
                                    n outputData3 = (n) obj6;
                                    Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                    boolean z100 = outputData3 instanceof cuj.m;
                                    com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a aVar4 = aVar;
                                    l lVar3 = FlowCoordinator;
                                    if (z100) {
                                        cuj.m mVar = (cuj.m) outputData3;
                                        h.t2(aVar4, lVar3, new RewardsHubFlowContract$Step.RewardsHubDirectReward(new RewardsHubDirectRewardScreenContract$InputData(mVar.f109048a, mVar.f109049b, mVar.f109050c, mVar.d)), false, null, false, 14);
                                    } else {
                                        if (!(outputData3 instanceof cuj.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cuj.l lVar4 = (cuj.l) outputData3;
                                        h.t2(aVar4, lVar3, new RewardsHubFlowContract$Step.RewardsHubChallengeDetails(new ChallengeDetailsScreenContract$InputData(new RewardsHubChallengeDetailsParams(lVar4.f109046a, lVar4.f109047b))), false, null, false, 14);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block, "block");
                    rewardsHubHomeScreen.H = block;
                    return rewardsHubHomeScreen;
                }
                if (step instanceof RewardsHubFlowContract$Step.RewardsHubDirectReward) {
                    RewardsHubDirectRewardScreen rewardsHubDirectRewardScreen = new RewardsHubDirectRewardScreen(((RewardsHubFlowContract$Step.RewardsHubDirectReward) step).f101570a);
                    final boolean z89 = z4 ? 1 : 0;
                    Function1 block2 = new Function1() { // from class: wtj.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (z89) {
                                case 0:
                                    j outputData = (j) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z96 = outputData instanceof euj.h;
                                    com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a aVar2 = aVar;
                                    if (z96) {
                                        aVar2.l2(new f(aVar2, outputData, null, 0), new yi5.b(26));
                                    } else {
                                        if (!(outputData instanceof euj.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.w2(aVar2.f101572p, new RewardsHubFlowContract$Step.EligibilityCriteria(new EligibilityCriteriaScreenContract$InputData(((euj.i) outputData).f129623a)), ModalDestination.Style.POPUP.f98311a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    ytj.m outputData2 = (ytj.m) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (!(outputData2 instanceof ytj.l)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.w2(aVar.f101572p, new RewardsHubFlowContract$Step.EligibilityCriteria(new EligibilityCriteriaScreenContract$InputData(((ytj.l) outputData2).f316820a)), ModalDestination.Style.POPUP.f98311a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block2, "block");
                    rewardsHubDirectRewardScreen.H = block2;
                    eligibilityCriteriaController = rewardsHubDirectRewardScreen;
                } else if (step instanceof RewardsHubFlowContract$Step.RewardsHubChallengeDetails) {
                    ChallengeDetailsController challengeDetailsController = new ChallengeDetailsController(((RewardsHubFlowContract$Step.RewardsHubChallengeDetails) step).f101567a);
                    final int i6 = 1;
                    Function1 block3 = new Function1() { // from class: wtj.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i6) {
                                case 0:
                                    j outputData = (j) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    boolean z96 = outputData instanceof euj.h;
                                    com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a aVar2 = aVar;
                                    if (z96) {
                                        aVar2.l2(new f(aVar2, outputData, null, 0), new yi5.b(26));
                                    } else {
                                        if (!(outputData instanceof euj.i)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.w2(aVar2.f101572p, new RewardsHubFlowContract$Step.EligibilityCriteria(new EligibilityCriteriaScreenContract$InputData(((euj.i) outputData).f129623a)), ModalDestination.Style.POPUP.f98311a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    ytj.m outputData2 = (ytj.m) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    if (!(outputData2 instanceof ytj.l)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.w2(aVar.f101572p, new RewardsHubFlowContract$Step.EligibilityCriteria(new EligibilityCriteriaScreenContract$InputData(((ytj.l) outputData2).f316820a)), ModalDestination.Style.POPUP.f98311a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block3, "block");
                    challengeDetailsController.H = block3;
                    eligibilityCriteriaController = challengeDetailsController;
                } else {
                    if (!(step instanceof RewardsHubFlowContract$Step.EligibilityCriteria)) {
                        if (step instanceof RewardsHubFlowContract$Step.RewardsHubChallengeHistory) {
                            RewardsHubChallengeHistoryScreen rewardsHubChallengeHistoryScreen = new RewardsHubChallengeHistoryScreen(new RewardsHubChallengeHistoryScreenContract$InputData(((RewardsHubFlowContract$Step.RewardsHubChallengeHistory) step).f101568a));
                            final int i21 = 1;
                            Function1 block4 = new Function1() { // from class: wtj.d
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    switch (i21) {
                                        case 0:
                                            u outputData = (u) obj6;
                                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                                            boolean z892 = outputData instanceof r;
                                            com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a aVar2 = aVar;
                                            l lVar = FlowCoordinator;
                                            if (z892) {
                                                r rVar = (r) outputData;
                                                h.t2(aVar2, lVar, new RewardsHubFlowContract$Step.RewardsHubChallengeDetails(new ChallengeDetailsScreenContract$InputData(new RewardsHubChallengeDetailsParams(rVar.f168644a, rVar.f168645b))), false, null, false, 14);
                                            } else if (outputData instanceof s) {
                                                h.t2(aVar2, lVar, new RewardsHubFlowContract$Step.RewardsHubChallengeHistory(((s) outputData).f168646a), false, null, false, 14);
                                            } else {
                                                if (!(outputData instanceof t)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                aVar2.C1(new ReferralsBizFeatureConfig.InviteCampaignHomeNavigationDestination(false, false, null, ((t) outputData).f168647a, 7));
                                            }
                                            return Unit.f186387a;
                                        case 1:
                                            i outputData2 = (i) obj6;
                                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                            boolean z96 = outputData2 instanceof auj.h;
                                            com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a aVar3 = aVar;
                                            l lVar2 = FlowCoordinator;
                                            if (z96) {
                                                auj.h hVar = (auj.h) outputData2;
                                                h.t2(aVar3, lVar2, new RewardsHubFlowContract$Step.RewardsHubChallengeDetails(new ChallengeDetailsScreenContract$InputData(new RewardsHubChallengeDetailsParams(hVar.f9845a, hVar.f9846b))), false, null, false, 14);
                                            } else {
                                                if (!(outputData2 instanceof i.a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                h.t2(aVar3, lVar2, new RewardsHubFlowContract$Step.RewardsHubChallengeHistory(m.ARCHIVED), false, null, false, 14);
                                            }
                                            return Unit.f186387a;
                                        default:
                                            n outputData3 = (n) obj6;
                                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                            boolean z100 = outputData3 instanceof cuj.m;
                                            com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a aVar4 = aVar;
                                            l lVar3 = FlowCoordinator;
                                            if (z100) {
                                                cuj.m mVar = (cuj.m) outputData3;
                                                h.t2(aVar4, lVar3, new RewardsHubFlowContract$Step.RewardsHubDirectReward(new RewardsHubDirectRewardScreenContract$InputData(mVar.f109048a, mVar.f109049b, mVar.f109050c, mVar.d)), false, null, false, 14);
                                            } else {
                                                if (!(outputData3 instanceof cuj.l)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                cuj.l lVar4 = (cuj.l) outputData3;
                                                h.t2(aVar4, lVar3, new RewardsHubFlowContract$Step.RewardsHubChallengeDetails(new ChallengeDetailsScreenContract$InputData(new RewardsHubChallengeDetailsParams(lVar4.f109046a, lVar4.f109047b))), false, null, false, 14);
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block4, "block");
                            rewardsHubChallengeHistoryScreen.H = block4;
                            obj4 = rewardsHubChallengeHistoryScreen;
                        } else {
                            if (!(step instanceof RewardsHubFlowContract$Step.RewardsHubCollection)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            RewardsHubCollectionScreen rewardsHubCollectionScreen = new RewardsHubCollectionScreen(new RewardsHubCollectionScreenContract$InputData(((RewardsHubFlowContract$Step.RewardsHubCollection) step).f101569a));
                            final int i22 = 2;
                            Function1 block5 = new Function1() { // from class: wtj.d
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    switch (i22) {
                                        case 0:
                                            u outputData = (u) obj6;
                                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                                            boolean z892 = outputData instanceof r;
                                            com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a aVar2 = aVar;
                                            l lVar = FlowCoordinator;
                                            if (z892) {
                                                r rVar = (r) outputData;
                                                h.t2(aVar2, lVar, new RewardsHubFlowContract$Step.RewardsHubChallengeDetails(new ChallengeDetailsScreenContract$InputData(new RewardsHubChallengeDetailsParams(rVar.f168644a, rVar.f168645b))), false, null, false, 14);
                                            } else if (outputData instanceof s) {
                                                h.t2(aVar2, lVar, new RewardsHubFlowContract$Step.RewardsHubChallengeHistory(((s) outputData).f168646a), false, null, false, 14);
                                            } else {
                                                if (!(outputData instanceof t)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                aVar2.C1(new ReferralsBizFeatureConfig.InviteCampaignHomeNavigationDestination(false, false, null, ((t) outputData).f168647a, 7));
                                            }
                                            return Unit.f186387a;
                                        case 1:
                                            i outputData2 = (i) obj6;
                                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                            boolean z96 = outputData2 instanceof auj.h;
                                            com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a aVar3 = aVar;
                                            l lVar2 = FlowCoordinator;
                                            if (z96) {
                                                auj.h hVar = (auj.h) outputData2;
                                                h.t2(aVar3, lVar2, new RewardsHubFlowContract$Step.RewardsHubChallengeDetails(new ChallengeDetailsScreenContract$InputData(new RewardsHubChallengeDetailsParams(hVar.f9845a, hVar.f9846b))), false, null, false, 14);
                                            } else {
                                                if (!(outputData2 instanceof i.a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                h.t2(aVar3, lVar2, new RewardsHubFlowContract$Step.RewardsHubChallengeHistory(m.ARCHIVED), false, null, false, 14);
                                            }
                                            return Unit.f186387a;
                                        default:
                                            n outputData3 = (n) obj6;
                                            Intrinsics.checkNotNullParameter(outputData3, "outputData");
                                            boolean z100 = outputData3 instanceof cuj.m;
                                            com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub.a aVar4 = aVar;
                                            l lVar3 = FlowCoordinator;
                                            if (z100) {
                                                cuj.m mVar = (cuj.m) outputData3;
                                                h.t2(aVar4, lVar3, new RewardsHubFlowContract$Step.RewardsHubDirectReward(new RewardsHubDirectRewardScreenContract$InputData(mVar.f109048a, mVar.f109049b, mVar.f109050c, mVar.d)), false, null, false, 14);
                                            } else {
                                                if (!(outputData3 instanceof cuj.l)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                cuj.l lVar4 = (cuj.l) outputData3;
                                                h.t2(aVar4, lVar3, new RewardsHubFlowContract$Step.RewardsHubChallengeDetails(new ChallengeDetailsScreenContract$InputData(new RewardsHubChallengeDetailsParams(lVar4.f109046a, lVar4.f109047b))), false, null, false, 14);
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block5, "block");
                            rewardsHubCollectionScreen.H = block5;
                            obj4 = rewardsHubCollectionScreen;
                        }
                        return obj4;
                    }
                    eligibilityCriteriaController = new EligibilityCriteriaController(((RewardsHubFlowContract$Step.EligibilityCriteria) step).f101566a);
                }
                return eligibilityCriteriaController;
            case 1:
                wtk.i iVar = ((com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.a) obj5).o;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                FundamentalsScreenContract$ModalStep step2 = (FundamentalsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (Intrinsics.f(step2, FundamentalsScreenContract$ModalStep.ExpectedAnnualReturnInfo.f103859a)) {
                    return new ExpectedAnnualReturnInfoScreen(new ztk.d(iVar.f300016a));
                }
                if (Intrinsics.f(step2, FundamentalsScreenContract$ModalStep.SharpeRatioInfo.f103860a)) {
                    return new SharpeRatioInfoScreen(new duk.d(iVar.f300016a));
                }
                if (step2 instanceof FundamentalsScreenContract$ModalStep.ExpectedAnnualReturnChartInfo) {
                    return new ExpectedAnnualReturnChartInfoScreen(new buk.e(((FundamentalsScreenContract$ModalStep.ExpectedAnnualReturnChartInfo) step2).f103858a));
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                com.revolut.trading.orders.ui.invest.placement.flow.a aVar2 = (com.revolut.trading.orders.ui.invest.placement.flow.a) obj5;
                l FlowCoordinator2 = (l) obj2;
                InvestOrderFlowContract$Step step3 = (InvestOrderFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof InvestOrderFlowContract$Step.Edit) {
                    InvestOrderEditScreen investOrderEditScreen = new InvestOrderEditScreen(((InvestOrderFlowContract$Step.Edit) step3).f106836a);
                    v block6 = new v(aVar2, FlowCoordinator2, 21);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    investOrderEditScreen.H = block6;
                    return investOrderEditScreen;
                }
                if (step3 instanceof InvestOrderFlowContract$Step.Review) {
                    InvestOrderReviewScreen investOrderReviewScreen = new InvestOrderReviewScreen(((InvestOrderFlowContract$Step.Review) step3).f106837a);
                    wpj.b block7 = new wpj.b(aVar2, 15);
                    Intrinsics.checkNotNullParameter(block7, "block");
                    investOrderReviewScreen.H = block7;
                    return investOrderReviewScreen;
                }
                if (!(step3 instanceof InvestOrderFlowContract$Step.ScaPrompt)) {
                    throw new NoWhenBranchMatchedException();
                }
                InvestOrderFlowContract$Step.ScaPrompt scaPrompt = (InvestOrderFlowContract$Step.ScaPrompt) step3;
                String str = scaPrompt.f106838a;
                k9 k9Var = k9.Trading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                ViewController viewControllerE1 = aVar2.e1(new wrc.a(str, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 10));
                wtl.f block8 = new wtl.f(aVar2, z11 ? 1 : 0, scaPrompt, FlowCoordinator2);
                Intrinsics.checkNotNullParameter(block8, "block");
                viewControllerE1.H = block8;
                return viewControllerE1;
            case 3:
                com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.a aVar3 = (com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.a) obj5;
                TransactionFilterFlowContract$Step step4 = (TransactionFilterFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof TransactionFilterFlowContract$Step.Filters) {
                    TransactionFilterFlowContract$Step.Filters filters = (TransactionFilterFlowContract$Step.Filters) step4;
                    FiltersScreen filtersScreen = new FiltersScreen(new FiltersScreenContract$InputData(filters.f71432a, filters.f71433b));
                    v vVar = new v(aVar3, filters, 25);
                    Intrinsics.checkNotNullParameter(vVar, "<set-?>");
                    filtersScreen.H = vVar;
                    return filtersScreen;
                }
                if (!(step4 instanceof TransactionFilterFlowContract$Step.FiltersByType)) {
                    throw new NoWhenBranchMatchedException();
                }
                TransactionFilterFlowContract$Step.FiltersByType filtersByType = (TransactionFilterFlowContract$Step.FiltersByType) step4;
                FiltersByTypeScreen filtersByTypeScreen = new FiltersByTypeScreen(new FiltersByTypeScreenContract$InputData(filtersByType.f71434a, filtersByType.f71435b));
                v vVar2 = new v(aVar3, filtersByType, 26);
                Intrinsics.checkNotNullParameter(vVar2, "<set-?>");
                filtersByTypeScreen.H = vVar2;
                return filtersByTypeScreen;
            case 4:
                com.revolut.feature.workflow.engine.sdk_flow.f fVar = (com.revolut.feature.workflow.engine.sdk_flow.f) obj5;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                SdkFlowContract$Step step5 = (SdkFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                xuh.b bVar = fVar.v;
                if (!(step5 instanceof SdkFlowContract$Step.Workflow)) {
                    if (step5 instanceof SdkFlowContract$Step.PredefinedVendor) {
                        SdkVendorInfo vendorInfo = ((SdkFlowContract$Step.PredefinedVendor) step5).f96589a;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(vendorInfo, "vendorInfo");
                        bVar.f309072a.c(xuh.b.b(vendorInfo));
                        return fVar.f96601p.d3(vendorInfo, new v(fVar, vendorInfo, 29));
                    }
                    if (!(step5 instanceof SdkFlowContract$Step.PennyTopUp)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.getClass();
                    tx8.s vendor = tx8.s.f275362c;
                    Intrinsics.checkNotNullParameter(vendor, "vendor");
                    bVar.f309072a.c(vendor);
                    SdkFlowContract$Step.PennyTopUp pennyTopUp = (SdkFlowContract$Step.PennyTopUp) step5;
                    return fVar.f96601p.c3(pennyTopUp.f96587b, pennyTopUp.f96588c, pennyTopUp.d, pennyTopUp.f96586a, fVar.o.getF96583a(), pennyTopUp.e, new wuh.h(fVar, z12 ? 1 : 0));
                }
                SdkFlowContract$Step.Workflow workflow = (SdkFlowContract$Step.Workflow) step5;
                WorkflowDocumentScanCofiguration workflowConfig = workflow.b();
                bVar.getClass();
                Intrinsics.checkNotNullParameter(workflowConfig, "workflowConfig");
                bVar.f309072a.c(xuh.b.a(workflowConfig));
                wy8.a aVar4 = fVar.f96604s;
                WorkflowDocumentScanCofiguration configuration = workflow.b();
                v onStepResult = new v(fVar, step5, 28);
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                Intrinsics.checkNotNullParameter(onStepResult, "onStepResult");
                if (configuration instanceof WorkflowDocumentScanCofiguration.Onfido) {
                    onfidoStudio = new DocumentScanFlowContract$InputData.Onfido((WorkflowDocumentScanCofiguration.Onfido) configuration);
                } else if (configuration instanceof WorkflowDocumentScanCofiguration.Vision) {
                    onfidoStudio = new DocumentScanFlowContract$InputData.Vision((WorkflowDocumentScanCofiguration.Vision) configuration);
                } else if (configuration instanceof WorkflowDocumentScanCofiguration.Incode) {
                    onfidoStudio = new DocumentScanFlowContract$InputData.Incode((WorkflowDocumentScanCofiguration.Incode) configuration);
                } else {
                    if (!(configuration instanceof WorkflowDocumentScanCofiguration.OnfidoStudio)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    onfidoStudio = new DocumentScanFlowContract$InputData.OnfidoStudio((WorkflowDocumentScanCofiguration.OnfidoStudio) configuration);
                }
                DocumentScanFlow documentScanFlow = new DocumentScanFlow(onfidoStudio);
                Intrinsics.checkNotNullParameter(onStepResult, "<set-?>");
                documentScanFlow.J = onStepResult;
                return documentScanFlow;
            case 5:
                List domain = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(domain, "domain");
                ((wvd.b) obj5).f300313b.f("AUTO_STAKING_MEMORY_CACHE_KEY", domain);
                return Unit.f186387a;
            case 6:
                final com.revolut.feature.transport.impl.ui.help.a aVar5 = (com.revolut.feature.transport.impl.ui.help.a) obj5;
                TransportHelpFlowContract$Step step6 = (TransportHelpFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (Intrinsics.f(step6, TransportHelpFlowContract$Step.Main.f92520a)) {
                    TransportHelpMainScreen transportHelpMainScreen = new TransportHelpMainScreen();
                    final boolean z96 = z29 ? 1 : 0;
                    Function1 block9 = new Function1() { // from class: wvf.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            q it8 = (q) obj6;
                            switch (z96) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    com.revolut.feature.transport.impl.ui.help.a aVar6 = aVar5;
                                    h.t2(aVar6, aVar6.o, TransportHelpFlowContract$Step.Contact.f92519a, true, TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    h.D2(aVar5.o);
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block9, "block");
                    transportHelpMainScreen.H = block9;
                    return transportHelpMainScreen;
                }
                if (!Intrinsics.f(step6, TransportHelpFlowContract$Step.Contact.f92519a)) {
                    throw new NoWhenBranchMatchedException();
                }
                TransportHelpContactScreen transportHelpContactScreen = new TransportHelpContactScreen();
                final int i32 = 1;
                Function1 block10 = new Function1() { // from class: wvf.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        q it8 = (q) obj6;
                        switch (i32) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                com.revolut.feature.transport.impl.ui.help.a aVar6 = aVar5;
                                h.t2(aVar6, aVar6.o, TransportHelpFlowContract$Step.Contact.f92519a, true, TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                h.D2(aVar5.o);
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block10, "block");
                transportHelpContactScreen.H = block10;
                return transportHelpContactScreen;
            case 7:
                wvg.c params = (wvg.c) obj2;
                mwg.e domain2 = (mwg.e) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(domain2, "domain");
                hx7.q.U(((wvg.j) obj5).f300398b, params, domain2);
                return Unit.f186387a;
            case 8:
                wvg.d params2 = (wvg.d) obj2;
                List domain3 = (List) obj3;
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(domain3, "domain");
                hx7.q.U(((k) obj5).f300405b, params2, domain3);
                return Unit.f186387a;
            case 9:
                wvg.l params3 = (wvg.l) obj2;
                PerformanceChart domain4 = (PerformanceChart) obj3;
                Intrinsics.checkNotNullParameter(params3, "params");
                Intrinsics.checkNotNullParameter(domain4, "domain");
                ((o) obj5).f300431b.f(params3.f300415g, domain4);
                return Unit.f186387a;
            case 10:
                p params4 = (p) obj2;
                mwg.i domain5 = (mwg.i) obj3;
                Intrinsics.checkNotNullParameter(params4, "params");
                Intrinsics.checkNotNullParameter(domain5, "domain");
                ((wvg.q) obj5).f300452b.f(params4.e, domain5);
                return Unit.f186387a;
            case 11:
                wvg.r params5 = (wvg.r) obj2;
                List domain6 = (List) obj3;
                Intrinsics.checkNotNullParameter(params5, "params");
                Intrinsics.checkNotNullParameter(domain6, "domain");
                ((wvg.s) obj5).f300468b.f(params5.f300462h, domain6);
                return Unit.f186387a;
            case 12:
                wvg.e params6 = (wvg.e) obj2;
                TotalValueChartFacade domain7 = (TotalValueChartFacade) obj3;
                Intrinsics.checkNotNullParameter(params6, "params");
                Intrinsics.checkNotNullParameter(domain7, "domain");
                ((wvg.v) obj5).f300480b.f(params6.f300361g, domain7);
                return Unit.f186387a;
            case 13:
                d1 params7 = (d1) obj2;
                PerformanceChart domain8 = (PerformanceChart) obj3;
                Intrinsics.checkNotNullParameter(params7, "params");
                Intrinsics.checkNotNullParameter(domain8, "domain");
                ((e0) obj5).f300363b.f(params7.i, domain8);
                return Unit.f186387a;
            case 14:
                f1 params8 = (f1) obj2;
                mwg.i domain9 = (mwg.i) obj3;
                Intrinsics.checkNotNullParameter(params8, "params");
                Intrinsics.checkNotNullParameter(domain9, "domain");
                ((g0) obj5).f300376b.f(params8.f300372h, domain9);
                return Unit.f186387a;
            case 15:
                b2 params9 = (b2) obj2;
                TotalValueChartFacade domain10 = (TotalValueChartFacade) obj3;
                Intrinsics.checkNotNullParameter(params9, "params");
                Intrinsics.checkNotNullParameter(domain10, "domain");
                ((t0) obj5).f300474b.f(params9.f300336h, domain10);
                return Unit.f186387a;
            case 16:
                final com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.b bVar2 = (com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.b) obj5;
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                ManageEcommercePluginFlowContract$Step step7 = (ManageEcommercePluginFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (Intrinsics.f(step7, ManageEcommercePluginFlowContract$Step.ManageShopify.f73795a)) {
                    return new ShopifyManageScreen();
                }
                if (Intrinsics.f(step7, ManageEcommercePluginFlowContract$Step.BusinessNotSupported.f73794a)) {
                    PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.freelancer_unsupported_business_prompt_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_unsupported_business_prompt_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D259", null, null, null, 30), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.freelancer_unsupported_business_prompt_action_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), null, null, null, null, null, null, 65368));
                    final boolean z100 = z31 ? 1 : 0;
                    Function1 block11 = new Function1() { // from class: ww6.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (z100) {
                                case 0:
                                    Intrinsics.checkNotNullParameter((d67.u) obj6, "<unused var>");
                                    h.D2(bVar2.f73803s);
                                    return Unit.f186387a;
                                case 1:
                                    yja.b result = (yja.b) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    yja.b bVar3 = yja.b.NEXT_CLICK;
                                    com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.b bVar4 = bVar2;
                                    if (result == bVar3) {
                                        bVar4.n2(new e(bVar4, null, 0), new whi.b(6));
                                    } else {
                                        h.D2(bVar4.f73803s);
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.b bVar5 = bVar2;
                                    yki.i iVar2 = bVar5.f73803s;
                                    g outputData = (g) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof f) {
                                        FreelancerPluginType freelancerPluginType = ((f) outputData).f249787a;
                                        if (Intrinsics.f(freelancerPluginType, FreelancerPluginType.Shopify.f60846a)) {
                                            h.u2(bVar5, iVar2, ManageEcommercePluginFlowContract$Step.ManageShopify.f73795a, null, 6);
                                        } else {
                                            h.u2(bVar5, iVar2, new ManageEcommercePluginFlowContract$Step.PluginPreview(freelancerPluginType), null, 6);
                                        }
                                    } else {
                                        if (!Intrinsics.f(outputData, qw6.e.f249786a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.D2(iVar2);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    promptMarketingScreen.H = block11;
                    return promptMarketingScreen;
                }
                if (step7 instanceof ManageEcommercePluginFlowContract$Step.ShopifyProductArticle) {
                    ViewController viewControllerE12 = bVar2.e1(new ProductArticleDescriptor(((ManageEcommercePluginFlowContract$Step.ShopifyProductArticle) step7).f73799a, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60));
                    final int i33 = 1;
                    Function1 block12 = new Function1() { // from class: ww6.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i33) {
                                case 0:
                                    Intrinsics.checkNotNullParameter((d67.u) obj6, "<unused var>");
                                    h.D2(bVar2.f73803s);
                                    return Unit.f186387a;
                                case 1:
                                    yja.b result = (yja.b) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    yja.b bVar3 = yja.b.NEXT_CLICK;
                                    com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.b bVar4 = bVar2;
                                    if (result == bVar3) {
                                        bVar4.n2(new e(bVar4, null, 0), new whi.b(6));
                                    } else {
                                        h.D2(bVar4.f73803s);
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.b bVar5 = bVar2;
                                    yki.i iVar2 = bVar5.f73803s;
                                    g outputData = (g) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof f) {
                                        FreelancerPluginType freelancerPluginType = ((f) outputData).f249787a;
                                        if (Intrinsics.f(freelancerPluginType, FreelancerPluginType.Shopify.f60846a)) {
                                            h.u2(bVar5, iVar2, ManageEcommercePluginFlowContract$Step.ManageShopify.f73795a, null, 6);
                                        } else {
                                            h.u2(bVar5, iVar2, new ManageEcommercePluginFlowContract$Step.PluginPreview(freelancerPluginType), null, 6);
                                        }
                                    } else {
                                        if (!Intrinsics.f(outputData, qw6.e.f249786a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.D2(iVar2);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    viewControllerE12.H = block12;
                    return viewControllerE12;
                }
                if (step7 instanceof ManageEcommercePluginFlowContract$Step.PluginChooser) {
                    FreelancerPluginChooserScreen freelancerPluginChooserScreen = new FreelancerPluginChooserScreen(new FreelancerPluginChooserScreenContract$InputData(((ManageEcommercePluginFlowContract$Step.PluginChooser) step7).f73796a));
                    final int i43 = 2;
                    Function1 block13 = new Function1() { // from class: ww6.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i43) {
                                case 0:
                                    Intrinsics.checkNotNullParameter((d67.u) obj6, "<unused var>");
                                    h.D2(bVar2.f73803s);
                                    return Unit.f186387a;
                                case 1:
                                    yja.b result = (yja.b) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    yja.b bVar3 = yja.b.NEXT_CLICK;
                                    com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.b bVar4 = bVar2;
                                    if (result == bVar3) {
                                        bVar4.n2(new e(bVar4, null, 0), new whi.b(6));
                                    } else {
                                        h.D2(bVar4.f73803s);
                                    }
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.b bVar5 = bVar2;
                                    yki.i iVar2 = bVar5.f73803s;
                                    g outputData = (g) obj6;
                                    Intrinsics.checkNotNullParameter(outputData, "outputData");
                                    if (outputData instanceof f) {
                                        FreelancerPluginType freelancerPluginType = ((f) outputData).f249787a;
                                        if (Intrinsics.f(freelancerPluginType, FreelancerPluginType.Shopify.f60846a)) {
                                            h.u2(bVar5, iVar2, ManageEcommercePluginFlowContract$Step.ManageShopify.f73795a, null, 6);
                                        } else {
                                            h.u2(bVar5, iVar2, new ManageEcommercePluginFlowContract$Step.PluginPreview(freelancerPluginType), null, 6);
                                        }
                                    } else {
                                        if (!Intrinsics.f(outputData, qw6.e.f249786a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.D2(iVar2);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    freelancerPluginChooserScreen.H = block13;
                    freelancerPluginPreviewScreen = freelancerPluginChooserScreen;
                } else if (step7 instanceof ManageEcommercePluginFlowContract$Step.PluginDetails) {
                    freelancerPluginPreviewScreen = new FreelancerPluginDetailsScreen(new FreelancerPluginDetailsScreenContract$InputData(((ManageEcommercePluginFlowContract$Step.PluginDetails) step7).f73797a));
                } else {
                    if (!(step7 instanceof ManageEcommercePluginFlowContract$Step.PluginPreview)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FreelancerPluginType freelancerPluginType = ((ManageEcommercePluginFlowContract$Step.PluginPreview) step7).f73798a;
                    if (Intrinsics.f(freelancerPluginType, FreelancerPluginType.PrestaShop.f60845a)) {
                        freelancerPluginPreviewScreenContract$PluginType = FreelancerPluginPreviewScreenContract$PluginType.PrestaShop.f73806a;
                    } else {
                        if (!Intrinsics.f(freelancerPluginType, FreelancerPluginType.Woocommerce.f60847a)) {
                            if (Intrinsics.f(freelancerPluginType, FreelancerPluginType.Shopify.f60846a)) {
                                throw new IllegalArgumentException("Shopify not supported");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        freelancerPluginPreviewScreenContract$PluginType = FreelancerPluginPreviewScreenContract$PluginType.Woocommerce.f73807a;
                    }
                    freelancerPluginPreviewScreen = new FreelancerPluginPreviewScreen(new FreelancerPluginPreviewScreenContract$InputData(freelancerPluginPreviewScreenContract$PluginType));
                }
                return freelancerPluginPreviewScreen;
            case 17:
                com.revolut.feature.kyc.impl.screens.addressconfirmation.a aVar6 = (com.revolut.feature.kyc.impl.screens.addressconfirmation.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AddressConfirmationScreenContract$ModalStep step8 = (AddressConfirmationScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (step8 instanceof AddressConfirmationScreenContract$ModalStep.ProfileAddress) {
                    return aVar6.e1(new ProfileAddressControllerDescriptor(new ProfileAddressControllerDescriptor.InputData(true)));
                }
                throw new NoWhenBranchMatchedException();
            case 18:
                final com.revolut.camerakit.revolut.ui.barcodeqr.a aVar7 = (com.revolut.camerakit.revolut.ui.barcodeqr.a) obj5;
                BarcodeQrReaderFlowContract$Step step9 = (BarcodeQrReaderFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof BarcodeQrReaderFlowContract$Step.Camera) {
                    BarcodeQrReaderScreen barcodeQrReaderScreen = new BarcodeQrReaderScreen(new BarcodeQrReaderScreenContract$InputData(aVar7.o.f50766a));
                    final boolean z101 = z41 ? 1 : 0;
                    Function1 block14 = new Function1() { // from class: wx.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) throws Throwable {
                            switch (z101) {
                                case 0:
                                    yx.l result = (yx.l) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z102 = result instanceof yx.k;
                                    com.revolut.camerakit.revolut.ui.barcodeqr.a aVar8 = aVar7;
                                    if (z102) {
                                        aVar8.C2(new f(((yx.k) result).f317508a));
                                    } else if (Intrinsics.f(result, yx.i.f317506a)) {
                                        aVar8.C2(d.f300704a);
                                    } else {
                                        if (!Intrinsics.f(result, yx.j.f317507a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar8.C2(e.f300705a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    r7a.i permissionFlowOutput = (r7a.i) obj6;
                                    Intrinsics.checkNotNullParameter(permissionFlowOutput, "permissionFlowOutput");
                                    boolean z103 = permissionFlowOutput instanceof r7a.e;
                                    com.revolut.camerakit.revolut.ui.barcodeqr.a aVar9 = aVar7;
                                    if (z103 || (permissionFlowOutput instanceof r7a.f)) {
                                        aVar9.C2(c.f300703a);
                                    } else if (permissionFlowOutput instanceof r7a.h) {
                                        oki.h.t2(aVar9, aVar9.f50770p, BarcodeQrReaderFlowContract$Step.Camera.f50768a, false, null, false, 12);
                                    } else {
                                        if (!(permissionFlowOutput instanceof r7a.g)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        try {
                                            m.Companion companion = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Unhandled secondary click");
                                        } catch (CancellationException e) {
                                            throw e;
                                        } catch (Throwable th10) {
                                            m.Companion companion2 = yhm.m.INSTANCE;
                                            Throwable thA = yhm.m.a(yhm.o.a(th10));
                                            if (thA != null) {
                                                hx7.e.n(thA);
                                            }
                                        }
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block14, "block");
                    barcodeQrReaderScreen.H = block14;
                    return barcodeQrReaderScreen;
                }
                if (!(step9 instanceof BarcodeQrReaderFlowContract$Step.Permissions)) {
                    throw new NoWhenBranchMatchedException();
                }
                PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(((BarcodeQrReaderFlowContract$Step.Permissions) step9).f50769a));
                final int i59 = 1;
                Function1 block15 = new Function1() { // from class: wx.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) throws Throwable {
                        switch (i59) {
                            case 0:
                                yx.l result = (yx.l) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean z102 = result instanceof yx.k;
                                com.revolut.camerakit.revolut.ui.barcodeqr.a aVar8 = aVar7;
                                if (z102) {
                                    aVar8.C2(new f(((yx.k) result).f317508a));
                                } else if (Intrinsics.f(result, yx.i.f317506a)) {
                                    aVar8.C2(d.f300704a);
                                } else {
                                    if (!Intrinsics.f(result, yx.j.f317507a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar8.C2(e.f300705a);
                                }
                                return Unit.f186387a;
                            default:
                                r7a.i permissionFlowOutput = (r7a.i) obj6;
                                Intrinsics.checkNotNullParameter(permissionFlowOutput, "permissionFlowOutput");
                                boolean z103 = permissionFlowOutput instanceof r7a.e;
                                com.revolut.camerakit.revolut.ui.barcodeqr.a aVar9 = aVar7;
                                if (z103 || (permissionFlowOutput instanceof r7a.f)) {
                                    aVar9.C2(c.f300703a);
                                } else if (permissionFlowOutput instanceof r7a.h) {
                                    oki.h.t2(aVar9, aVar9.f50770p, BarcodeQrReaderFlowContract$Step.Camera.f50768a, false, null, false, 12);
                                } else {
                                    if (!(permissionFlowOutput instanceof r7a.g)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    try {
                                        m.Companion companion = yhm.m.INSTANCE;
                                        throw new IllegalStateException("Unhandled secondary click");
                                    } catch (CancellationException e) {
                                        throw e;
                                    } catch (Throwable th10) {
                                        m.Companion companion2 = yhm.m.INSTANCE;
                                        Throwable thA = yhm.m.a(yhm.o.a(th10));
                                        if (thA != null) {
                                            hx7.e.n(thA);
                                        }
                                    }
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block15, "block");
                permissionsController.H = block15;
                return permissionsController;
            case 19:
                com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.a aVar8 = (com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                ReferralsTroubleshooterTopLevelScreenContract$ModalStep step10 = (ReferralsTroubleshooterTopLevelScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (!(step10 instanceof ReferralsTroubleshooterTopLevelScreenContract$ModalStep.IneligibilityDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                cya.g gVar = aVar8.f81916s;
                String str2 = ((ReferralsTroubleshooterTopLevelScreenContract$ModalStep.IneligibilityDialog) step10).f81912a;
                wma.e eVar = new wma.e(1, aVar8.f81917t, cya.f.class, "handleDeeplink", "handleDeeplink(Ljava/lang/String;)V", 0, 4);
                gVar.getClass();
                return cya.g.a(str2, eVar);
            case 20:
                com.revolut.feature.statements.impl.ui.account.a aVar9 = (com.revolut.feature.statements.impl.ui.account.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AccountsStatementsContract$ModalStep step11 = (AccountsStatementsContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!(step11 instanceof AccountsStatementsContract$ModalStep.ChooseCurrency)) {
                    throw new NoWhenBranchMatchedException();
                }
                x xVar = new x(new TextLocalisedClause(com.revolut.feature.statements.R$string.statement_switcher_select_title, null, null, 14), aVar9.o.f301258a, null, null, false, w.HIDDEN, null, null, null, true, null, null, com.revolut.feature.statements.impl.ui.account.a.M2(((wyd.x) ((j2) aVar9.f88293y.f22677a).getValue()).f301266b), null, false, null, null, null, null, null, 2143014648);
                Object obj6 = aVar9.f88291w.get();
                Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                PickerController pickerController = new PickerController(xVar, (x7a.d) obj6);
                wyd.a block16 = new wyd.a(aVar9, 2);
                Intrinsics.checkNotNullParameter(block16, "block");
                pickerController.H = block16;
                return pickerController;
            case 21:
                com.revolut.feature.wealth.analytics.ui.widgetised.performance.a aVar10 = (com.revolut.feature.wealth.analytics.ui.widgetised.performance.a) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                WidgetisedAnalyticsPerformanceContract$ModalStep step12 = (WidgetisedAnalyticsPerformanceContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (!(step12 instanceof WidgetisedAnalyticsPerformanceContract$ModalStep.LearnMore)) {
                    if (!(step12 instanceof WidgetisedAnalyticsPerformanceContract$ModalStep.BenchmarkSelection)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    WidgetisedAnalyticsPerformanceContract$ModalStep.BenchmarkSelection benchmarkSelection = (WidgetisedAnalyticsPerformanceContract$ModalStep.BenchmarkSelection) step12;
                    PerformanceBenchmarkSelectionController performanceBenchmarkSelectionController = new PerformanceBenchmarkSelectionController(new PerformanceBenchmarkSelectionContract$InputData(benchmarkSelection.f95103b ? benchmarkSelection.f95102a : null));
                    aVar10.a(performanceBenchmarkSelectionController, new u3a.p(step12, aVar10, 19));
                    return performanceBenchmarkSelectionController;
                }
                zyg.a aVar11 = aVar10.f95109t;
                List calculationMethods = ((wyg.a) ((j2) aVar10.f95110w.f22677a).getValue()).f301276h;
                aVar11.getClass();
                Intrinsics.checkNotNullParameter(calculationMethods, "calculationMethods");
                lw0.a aVar12 = new lw0.a(new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_performance_hint_title, null, null, 14), null, null, null, false, 30);
                List<iwg.c> list = calculationMethods;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (iwg.c calculationMethod : list) {
                    TextLocalisedClause textLocalisedClauseB = azg.b.b(calculationMethod);
                    Intrinsics.checkNotNullParameter(calculationMethod, "calculationMethod");
                    int i66 = azg.a.f11458a[calculationMethod.ordinal()];
                    if (i66 == 1) {
                        i = com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_performance_hint_time_weighted_subtitle;
                    } else if (i66 == 2) {
                        i = com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_performance_hint_money_weighted_subtitle;
                    } else {
                        if (i66 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_performance_hint_simple_return_subtitle;
                    }
                    arrayList.add(new eii.l((Clause) textLocalisedClauseB, (Clause) new TextLocalisedClause(i, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(azg.b.a(calculationMethod), z54 ? 1 : 0, z49 ? 1 : 0, 6), false, false, (RowDelegate.Model.c) null, (Object) null, 488));
                }
                return new RowActionsBottomSheetController(new eii.c(aVar12, null, arrayList, aVar11.f326462a, null));
            case 22:
                List topupRequests = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(topupRequests, "topupRequests");
                ((wz1.f) obj5).f301345c.f("PENDING_TOPUP_REQUESTS_KEY", topupRequests);
                return Unit.f186387a;
            case 23:
                com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.b bVar3 = (com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.b) obj5;
                yki.b LazyFlowCoordinator3 = (yki.b) obj2;
                FreelancerTradingNameFlowContract$Step step13 = (FreelancerTradingNameFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator3, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (Intrinsics.f(step13, FreelancerTradingNameFlowContract$Step.ReviewPrompt.f74066a)) {
                    ((ct6.v) bVar3.f74068p).getClass();
                    PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.freelancer_trading_name_verification_prompt_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_trading_name_verification_prompt_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D028", null, null, null, 30), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368));
                    dph.c block17 = new dph.c(bVar3, LazyFlowCoordinator3, 25);
                    Intrinsics.checkNotNullParameter(block17, "block");
                    promptMarketingScreen2.H = block17;
                    return promptMarketingScreen2;
                }
                if (!(step13 instanceof FreelancerTradingNameFlowContract$Step.ChangeRequest)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str3 = ((FreelancerTradingNameFlowContract$Step.ChangeRequest) step13).f74065a;
                k9 k9Var2 = k9.Freelancer;
                Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                ViewController viewControllerE13 = bVar3.e1(new til.c(new WorkflowControllerDescriptor$InputData(new WorkflowConfiguration.Workflow(str3, (wi0.b) null, (NaviCommand) null, (String) null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), (WorkflowConfiguration.Extras) null, LDSFile.EF_DG14_TAG), WorkflowFlowType.Inner.f105817a, null, 56)));
                d0 block18 = new d0(bVar3, 27);
                Intrinsics.checkNotNullParameter(block18, "block");
                viewControllerE13.H = block18;
                return viewControllerE13;
            case 24:
                z0d.t value = (z0d.t) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(value, "value");
                ((x0d.b) obj5).f301567b.f("MEMORY_CACHE_KEY_SUPERVISION_CONFIG", value);
                return Unit.f186387a;
            case 25:
                List value2 = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(value2, "value");
                ((x0d.e) obj5).f301572b.f("CACHE_KEY_GUARDIAN_INVITATIONS", value2);
                return Unit.f186387a;
            case 26:
                com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.a aVar13 = (com.revolut.feature.apm.core.ui.impl.ui.alias_claim.form.a) obj5;
                ApmAliasClaimFormFlowContract$Step step14 = (ApmAliasClaimFormFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (step14 instanceof ApmAliasClaimFormFlowContract$Step.Upload) {
                    ApmAliasClaimUploadScreen apmAliasClaimUploadScreen = new ApmAliasClaimUploadScreen(new ApmAliasClaimUploadScreenContract$InputData(((ApmAliasClaimFormFlowContract$Step.Upload) step14).f62341a));
                    x0b.c block19 = new x0b.c(aVar13, i3);
                    Intrinsics.checkNotNullParameter(block19, "block");
                    apmAliasClaimUploadScreen.H = block19;
                    return apmAliasClaimUploadScreen;
                }
                if (!(step14 instanceof ApmAliasClaimFormFlowContract$Step.AdditionalInfo)) {
                    throw new NoWhenBranchMatchedException();
                }
                ApmAliasClaimAdditionalInfoScreen apmAliasClaimAdditionalInfoScreen = new ApmAliasClaimAdditionalInfoScreen();
                wwa.a block20 = new wwa.a(aVar13, (ApmAliasClaimFormFlowContract$Step.AdditionalInfo) step14, 18);
                Intrinsics.checkNotNullParameter(block20, "block");
                apmAliasClaimAdditionalInfoScreen.H = block20;
                return apmAliasClaimAdditionalInfoScreen;
            case 27:
                com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b bVar4 = (com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SmartFeedScreenContract$ModalStep step15 = (SmartFeedScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (!Intrinsics.f(step15, SmartFeedScreenContract$ModalStep.AddToWatchlist.f76440a)) {
                    if (step15 instanceof SmartFeedScreenContract$ModalStep.PublicationPrice) {
                        return bVar4.e1(((SmartFeedScreenContract$ModalStep.PublicationPrice) step15).f76441a);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE14 = bVar4.e1(q18.j.a());
                wma.e block21 = new wma.e(1, bVar4, com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b.class, "reloadContentIfNeed", "reloadContentIfNeed(Lcom/revolut/feature/shared_separate_favourites/api/combined_watchlist/SelectedAssetOutputData;)V", 0, 5);
                Intrinsics.checkNotNullParameter(block21, "block");
                viewControllerE14.H = block21;
                return viewControllerE14;
            case 28:
                final com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar = (com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) obj5;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CardPersonalisationControllerContract$ModalStep step16 = (CardPersonalisationControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step16, "step");
                if (step16 instanceof CardPersonalisationControllerContract$ModalStep.Guidelines) {
                    CardPersonalisationGuidelinesController cardPersonalisationGuidelinesController = new CardPersonalisationGuidelinesController(new CardPersonalisationGuidelinesControllerContract$InputData(((CardPersonalisationControllerContract$ModalStep.Guidelines) step16).f65167a));
                    final int i74 = 4;
                    Function1 block22 = new Function1() { // from class: x23.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i74) {
                                case 0:
                                    z23.e result = (z23.e) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof e.a) {
                                        cVar.C2(a.C0463a.f65170a);
                                    } else if (!(result instanceof e.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    z23.e result2 = (z23.e) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof e.a) {
                                        ((CardPersonalisationController) cVar.f65175s.f302493a).d3().f211227c.t0();
                                    } else if (!(result2 instanceof e.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    z23.e result3 = (z23.e) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof e.a) {
                                        com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar2 = cVar;
                                        cVar2.l2(new com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.b(cVar2, null), new yi5.b(26));
                                    } else if (!(result3 instanceof e.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    b53.b result4 = (b53.b) obj7;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof b53.c) {
                                        com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar3 = cVar;
                                        cVar3.H2(cVar3.f65179y, new x0b.c(result4, 10));
                                        b53.c cVar4 = (b53.c) result4;
                                        cVar3.l2(new wih.c(cVar3, cVar4.f12423a.f123865a, cVar4.f12424b, null, 19), new yi5.b(26));
                                    } else if (!(result4 instanceof b.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    d33.e result5 = (d33.e) obj7;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    boolean z102 = result5 instanceof e.a;
                                    com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar5 = cVar;
                                    if (z102) {
                                        cVar5.l2(new wr1.s(cVar5, null, 20), new yi5.b(26));
                                    } else {
                                        if (!(result5 instanceof e.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar5.K2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    b33.e result6 = (b33.e) obj7;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    if (!(result6 instanceof b33.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar6 = cVar;
                                    cVar6.H2(cVar6.f65179y, new x1.n(22));
                                    p pVar = cVar6.f65175s;
                                    ((CardPersonalisationController) pVar.f302493a).d3().f211227c.r0(((b33.d) result6).f11988a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block22, "block");
                    cardPersonalisationGuidelinesController.H = block22;
                    return cardPersonalisationGuidelinesController;
                }
                if (step16 instanceof CardPersonalisationControllerContract$ModalStep.EmojiPicker) {
                    CardPersonalisationEmojiPickerController cardPersonalisationEmojiPickerController = new CardPersonalisationEmojiPickerController(new CardPersonalisationEmojiPickerControllerContract$InputData(((CardPersonalisationControllerContract$ModalStep.EmojiPicker) step16).f65166a));
                    md6.s.G(cardPersonalisationEmojiPickerController, new rch.o(2, cVar, com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 24), new x23.s(cVar, z3 ? 1 : 0, i5), new Function1() { // from class: x23.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i3) {
                                case 0:
                                    z23.e result = (z23.e) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof e.a) {
                                        cVar.C2(a.C0463a.f65170a);
                                    } else if (!(result instanceof e.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    z23.e result2 = (z23.e) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof e.a) {
                                        ((CardPersonalisationController) cVar.f65175s.f302493a).d3().f211227c.t0();
                                    } else if (!(result2 instanceof e.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    z23.e result3 = (z23.e) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof e.a) {
                                        com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar2 = cVar;
                                        cVar2.l2(new com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.b(cVar2, null), new yi5.b(26));
                                    } else if (!(result3 instanceof e.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    b53.b result4 = (b53.b) obj7;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof b53.c) {
                                        com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar3 = cVar;
                                        cVar3.H2(cVar3.f65179y, new x0b.c(result4, 10));
                                        b53.c cVar4 = (b53.c) result4;
                                        cVar3.l2(new wih.c(cVar3, cVar4.f12423a.f123865a, cVar4.f12424b, null, 19), new yi5.b(26));
                                    } else if (!(result4 instanceof b.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    d33.e result5 = (d33.e) obj7;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    boolean z102 = result5 instanceof e.a;
                                    com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar5 = cVar;
                                    if (z102) {
                                        cVar5.l2(new wr1.s(cVar5, null, 20), new yi5.b(26));
                                    } else {
                                        if (!(result5 instanceof e.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar5.K2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    b33.e result6 = (b33.e) obj7;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    if (!(result6 instanceof b33.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar6 = cVar;
                                    cVar6.H2(cVar6.f65179y, new x1.n(22));
                                    p pVar = cVar6.f65175s;
                                    ((CardPersonalisationController) pVar.f302493a).d3().f211227c.r0(((b33.d) result6).f11988a);
                                    return Unit.f186387a;
                            }
                        }
                    });
                    return cardPersonalisationEmojiPickerController;
                }
                if (step16 instanceof CardPersonalisationControllerContract$ModalStep.ConfirmExit) {
                    CardPersonalisationDialogsController cardPersonalisationDialogsController = new CardPersonalisationDialogsController(CardPersonalisationDialogsControllerContract$InputData.ConfirmExit.f65180a);
                    final boolean z102 = z74 ? 1 : 0;
                    Function1 block23 = new Function1() { // from class: x23.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (z102) {
                                case 0:
                                    z23.e result = (z23.e) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof e.a) {
                                        cVar.C2(a.C0463a.f65170a);
                                    } else if (!(result instanceof e.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    z23.e result2 = (z23.e) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof e.a) {
                                        ((CardPersonalisationController) cVar.f65175s.f302493a).d3().f211227c.t0();
                                    } else if (!(result2 instanceof e.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    z23.e result3 = (z23.e) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof e.a) {
                                        com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar2 = cVar;
                                        cVar2.l2(new com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.b(cVar2, null), new yi5.b(26));
                                    } else if (!(result3 instanceof e.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    b53.b result4 = (b53.b) obj7;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof b53.c) {
                                        com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar3 = cVar;
                                        cVar3.H2(cVar3.f65179y, new x0b.c(result4, 10));
                                        b53.c cVar4 = (b53.c) result4;
                                        cVar3.l2(new wih.c(cVar3, cVar4.f12423a.f123865a, cVar4.f12424b, null, 19), new yi5.b(26));
                                    } else if (!(result4 instanceof b.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    d33.e result5 = (d33.e) obj7;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    boolean z1022 = result5 instanceof e.a;
                                    com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar5 = cVar;
                                    if (z1022) {
                                        cVar5.l2(new wr1.s(cVar5, null, 20), new yi5.b(26));
                                    } else {
                                        if (!(result5 instanceof e.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar5.K2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    b33.e result6 = (b33.e) obj7;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    if (!(result6 instanceof b33.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar6 = cVar;
                                    cVar6.H2(cVar6.f65179y, new x1.n(22));
                                    p pVar = cVar6.f65175s;
                                    ((CardPersonalisationController) pVar.f302493a).d3().f211227c.r0(((b33.d) result6).f11988a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block23, "block");
                    cardPersonalisationDialogsController.H = block23;
                    return cardPersonalisationDialogsController;
                }
                if (step16 instanceof CardPersonalisationControllerContract$ModalStep.StartOver) {
                    CardPersonalisationDialogsController cardPersonalisationDialogsController2 = new CardPersonalisationDialogsController(CardPersonalisationDialogsControllerContract$InputData.StartOver.f65182a);
                    final int i92 = 1;
                    Function1 block24 = new Function1() { // from class: x23.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i92) {
                                case 0:
                                    z23.e result = (z23.e) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof e.a) {
                                        cVar.C2(a.C0463a.f65170a);
                                    } else if (!(result instanceof e.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    z23.e result2 = (z23.e) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof e.a) {
                                        ((CardPersonalisationController) cVar.f65175s.f302493a).d3().f211227c.t0();
                                    } else if (!(result2 instanceof e.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    z23.e result3 = (z23.e) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof e.a) {
                                        com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar2 = cVar;
                                        cVar2.l2(new com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.b(cVar2, null), new yi5.b(26));
                                    } else if (!(result3 instanceof e.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    b53.b result4 = (b53.b) obj7;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof b53.c) {
                                        com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar3 = cVar;
                                        cVar3.H2(cVar3.f65179y, new x0b.c(result4, 10));
                                        b53.c cVar4 = (b53.c) result4;
                                        cVar3.l2(new wih.c(cVar3, cVar4.f12423a.f123865a, cVar4.f12424b, null, 19), new yi5.b(26));
                                    } else if (!(result4 instanceof b.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    d33.e result5 = (d33.e) obj7;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    boolean z1022 = result5 instanceof e.a;
                                    com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar5 = cVar;
                                    if (z1022) {
                                        cVar5.l2(new wr1.s(cVar5, null, 20), new yi5.b(26));
                                    } else {
                                        if (!(result5 instanceof e.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar5.K2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    b33.e result6 = (b33.e) obj7;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    if (!(result6 instanceof b33.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar6 = cVar;
                                    cVar6.H2(cVar6.f65179y, new x1.n(22));
                                    p pVar = cVar6.f65175s;
                                    ((CardPersonalisationController) pVar.f302493a).d3().f211227c.r0(((b33.d) result6).f11988a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block24, "block");
                    cardPersonalisationDialogsController2.H = block24;
                    return cardPersonalisationDialogsController2;
                }
                if (step16 instanceof CardPersonalisationControllerContract$ModalStep.ConfirmSkip) {
                    CardPersonalisationDialogsController cardPersonalisationDialogsController3 = new CardPersonalisationDialogsController(CardPersonalisationDialogsControllerContract$InputData.Skip.f65181a);
                    final int i96 = 2;
                    Function1 block25 = new Function1() { // from class: x23.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i96) {
                                case 0:
                                    z23.e result = (z23.e) obj7;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof e.a) {
                                        cVar.C2(a.C0463a.f65170a);
                                    } else if (!(result instanceof e.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    z23.e result2 = (z23.e) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof e.a) {
                                        ((CardPersonalisationController) cVar.f65175s.f302493a).d3().f211227c.t0();
                                    } else if (!(result2 instanceof e.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    z23.e result3 = (z23.e) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (result3 instanceof e.a) {
                                        com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar2 = cVar;
                                        cVar2.l2(new com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.b(cVar2, null), new yi5.b(26));
                                    } else if (!(result3 instanceof e.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 3:
                                    b53.b result4 = (b53.b) obj7;
                                    Intrinsics.checkNotNullParameter(result4, "result");
                                    if (result4 instanceof b53.c) {
                                        com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar3 = cVar;
                                        cVar3.H2(cVar3.f65179y, new x0b.c(result4, 10));
                                        b53.c cVar4 = (b53.c) result4;
                                        cVar3.l2(new wih.c(cVar3, cVar4.f12423a.f123865a, cVar4.f12424b, null, 19), new yi5.b(26));
                                    } else if (!(result4 instanceof b.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 4:
                                    d33.e result5 = (d33.e) obj7;
                                    Intrinsics.checkNotNullParameter(result5, "result");
                                    boolean z1022 = result5 instanceof e.a;
                                    com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar5 = cVar;
                                    if (z1022) {
                                        cVar5.l2(new wr1.s(cVar5, null, 20), new yi5.b(26));
                                    } else {
                                        if (!(result5 instanceof e.b)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        cVar5.K2();
                                    }
                                    return Unit.f186387a;
                                default:
                                    b33.e result6 = (b33.e) obj7;
                                    Intrinsics.checkNotNullParameter(result6, "result");
                                    if (!(result6 instanceof b33.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar6 = cVar;
                                    cVar6.H2(cVar6.f65179y, new x1.n(22));
                                    p pVar = cVar6.f65175s;
                                    ((CardPersonalisationController) pVar.f302493a).d3().f211227c.r0(((b33.d) result6).f11988a);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block25, "block");
                    cardPersonalisationDialogsController3.H = block25;
                    return cardPersonalisationDialogsController3;
                }
                if (!(step16 instanceof CardPersonalisationControllerContract$ModalStep.ImageGeneration)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE15 = cVar.e1(new b53.d(new b53.a(((CardPersonalisationControllerContract$ModalStep.ImageGeneration) step16).f65168a)));
                final int i99 = 3;
                md6.s.G(viewControllerE15, new rch.o(2, cVar, com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 25), new x23.s(cVar, z ? 1 : 0, 1), new Function1() { // from class: x23.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (i99) {
                            case 0:
                                z23.e result = (z23.e) obj7;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof e.a) {
                                    cVar.C2(a.C0463a.f65170a);
                                } else if (!(result instanceof e.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.f186387a;
                            case 1:
                                z23.e result2 = (z23.e) obj7;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof e.a) {
                                    ((CardPersonalisationController) cVar.f65175s.f302493a).d3().f211227c.t0();
                                } else if (!(result2 instanceof e.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.f186387a;
                            case 2:
                                z23.e result3 = (z23.e) obj7;
                                Intrinsics.checkNotNullParameter(result3, "result");
                                if (result3 instanceof e.a) {
                                    com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar2 = cVar;
                                    cVar2.l2(new com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.b(cVar2, null), new yi5.b(26));
                                } else if (!(result3 instanceof e.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.f186387a;
                            case 3:
                                b53.b result4 = (b53.b) obj7;
                                Intrinsics.checkNotNullParameter(result4, "result");
                                if (result4 instanceof b53.c) {
                                    com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar3 = cVar;
                                    cVar3.H2(cVar3.f65179y, new x0b.c(result4, 10));
                                    b53.c cVar4 = (b53.c) result4;
                                    cVar3.l2(new wih.c(cVar3, cVar4.f12423a.f123865a, cVar4.f12424b, null, 19), new yi5.b(26));
                                } else if (!(result4 instanceof b.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.f186387a;
                            case 4:
                                d33.e result5 = (d33.e) obj7;
                                Intrinsics.checkNotNullParameter(result5, "result");
                                boolean z1022 = result5 instanceof e.a;
                                com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar5 = cVar;
                                if (z1022) {
                                    cVar5.l2(new wr1.s(cVar5, null, 20), new yi5.b(26));
                                } else {
                                    if (!(result5 instanceof e.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar5.K2();
                                }
                                return Unit.f186387a;
                            default:
                                b33.e result6 = (b33.e) obj7;
                                Intrinsics.checkNotNullParameter(result6, "result");
                                if (!(result6 instanceof b33.d)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c cVar6 = cVar;
                                cVar6.H2(cVar6.f65179y, new x1.n(22));
                                p pVar = cVar6.f65175s;
                                ((CardPersonalisationController) pVar.f302493a).d3().f211227c.r0(((b33.d) result6).f11988a);
                                return Unit.f186387a;
                        }
                    }
                });
                return viewControllerE15;
            default:
                com.revolut.feature.freelancer.impl.ui.subaccount.update.flow.a aVar14 = (com.revolut.feature.freelancer.impl.ui.subaccount.update.flow.a) obj5;
                FreelancerUpdateTaxPocketFlowContract$Step step17 = (FreelancerUpdateTaxPocketFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step17, "step");
                if (!(step17 instanceof FreelancerUpdateTaxPocketFlowContract$Step.TaxReservation)) {
                    throw new NoWhenBranchMatchedException();
                }
                FreelancerTaxReservationScreen freelancerTaxReservationScreen = new FreelancerTaxReservationScreen(new FreelancerTaxReservationScreenContract$InputData(false));
                wma.e block26 = new wma.e(1, aVar14, com.revolut.feature.freelancer.impl.ui.subaccount.update.flow.a.class, "handleTaxReservationResult", "handleTaxReservationResult(Lcom/revolut/feature/freelancer/impl/ui/subaccount/create/screen/FreelancerTaxReservationScreenContract$OutputData;)V", 0, 7);
                Intrinsics.checkNotNullParameter(block26, "block");
                freelancerTaxReservationScreen.H = block26;
                return freelancerTaxReservationScreen;
        }
    }
}
