package xxb;

import aii.g;
import aii.p;
import aii.u;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.feature.rev_points.api.RevPointsApi$Toggles;
import com.revolut.feature.rev_points.api.navigation.RevPointsAccountMigrationChecklistDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsAdventRewardDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsBottomSheetDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsChallengeDetailsDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsEarnOptionsScreenApi$Destination;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsOptInDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsPersonalisationDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsPersonalisationTargetingOnboardingDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsPostOnboardingPersonalisationDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsTrophyRoomDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsUnlockBenefitsControllerApi$Destination;
import com.revolut.feature.rev_points.api.navigation.RevPointsWrappedDestination;
import com.revolut.feature.rev_points.impl.ui.RevPointsFlow;
import com.revolut.feature.rev_points.impl.ui.RevPointsFlowContract$InputData;
import com.revolut.feature.rev_points.impl.ui.RevPointsFlowContract$Step;
import com.revolut.feature.rev_points.impl.ui.account_migration_checklist.RevPointsAccountMigrationChecklistScreen;
import com.revolut.feature.rev_points.impl.ui.account_migration_checklist.RevPointsAccountMigrationChecklistScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.advent.flow.RevPointsAdventRewardsFlow;
import com.revolut.feature.rev_points.impl.ui.advent.flow.RevPointsAdventRewardsFlowContract$InputData;
import com.revolut.feature.rev_points.impl.ui.benefits.unlock.RevPointsUnlockBenefitsScreen;
import com.revolut.feature.rev_points.impl.ui.bottom_sheet.RevPointsBottomSheetScreen;
import com.revolut.feature.rev_points.impl.ui.bottom_sheet.RevPointsBottomSheetScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.challenges.details.RevPointsChallengeDetailsScreen;
import com.revolut.feature.rev_points.impl.ui.challenges.details.RevPointsChallengeDetailsScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.earn_options.RevPointsEarnOptionsScreen;
import com.revolut.feature.rev_points.impl.ui.opt_in.flow.LifestyleRevPointsFlow;
import com.revolut.feature.rev_points.impl.ui.personalisation.RevPointsPersonalisationScreen;
import com.revolut.feature.rev_points.impl.ui.personalisation_targeting_onboarding.RevPointsPersonalisationTargetingOnboardingScreen;
import com.revolut.feature.rev_points.impl.ui.personalisation_targeting_onboarding.RevPointsPersonalisationTargetingOnboardingScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.RevPointsPostOnboardingPersonalisationFlow;
import com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.RevPointsPostOnboardingPersonalisationFlowContract$InputData;
import com.revolut.feature.rev_points.impl.ui.redeem.RevPointsRedeemScreen;
import com.revolut.feature.rev_points.impl.ui.redeem.RevPointsRedeemScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.trophy_room.flow.RevPointsTrophyRoomFlow;
import com.revolut.feature.rev_points.impl.ui.wrapped.flow.RevPointsWrappedFlow;
import com.revolut.feature.rev_points.impl.ui.wrapped.flow.RevPointsWrappedFlowContract$InputData;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import hub.f;
import hub.h;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f309503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p56.a f309504b;

    public e(ImmutableSet deeplinkGateways, p56.a revPointsOptInResultHandlerFactory, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(revPointsOptInResultHandlerFactory, "revPointsOptInResultHandlerFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f309503a = deeplinkGateways;
        this.f309504b = revPointsOptInResultHandlerFactory;
    }

    @Override // nhi.f
    public final g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof hub.a) {
            hub.a aVar = (hub.a) descriptor;
            return aVar.a(gc0.c.b(new LifestyleRevPointsFlow(aVar.b()), new v1c.c(10)));
        }
        if (descriptor instanceof hub.c) {
            hub.c cVar = (hub.c) descriptor;
            return cVar.a(new RevPointsBottomSheetScreen(new RevPointsBottomSheetScreenContract$InputData(cVar.b())));
        }
        if (descriptor instanceof h) {
            return ((h) descriptor).a(new RevPointsTrophyRoomFlow());
        }
        if (descriptor instanceof hub.d) {
            return ((hub.d) descriptor).a(new RevPointsPersonalisationScreen());
        }
        if (descriptor instanceof f) {
            return ((f) descriptor).a(new RevPointsRedeemScreen(new RevPointsRedeemScreenContract$InputData(false)));
        }
        if (descriptor instanceof hub.e) {
            hub.e eVar = (hub.e) descriptor;
            return eVar.a(new RevPointsPersonalisationTargetingOnboardingScreen(new RevPointsPersonalisationTargetingOnboardingScreenContract$InputData(eVar.b().getF83545a())));
        }
        if (!(descriptor instanceof hub.g)) {
            if (descriptor instanceof gub.a) {
                gub.a aVar2 = (gub.a) descriptor;
                return aVar2.a(new RevPointsEarnOptionsScreen(aVar2.b()));
            }
            super.c(descriptor);
            return null;
        }
        hub.g gVar = (hub.g) descriptor;
        List listE = gVar.e();
        String strD = gVar.d();
        for (RevPointsTransaction revPointsTransaction : gVar.e()) {
            if (Intrinsics.f(revPointsTransaction.getF84054a(), gVar.d())) {
                return gVar.a(new RevPointsFlow(new RevPointsFlowContract$InputData(new RevPointsFlowContract$Step.OpenTransactionDetailsPager(listE, strD, revPointsTransaction, RevPointsTransactionPageParams.b(gVar.b(), null, 510), null, null, false, gVar.c(), 48))));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // nte.a
    public final List e() {
        return RevPointsApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        FlowStep openTransactionDetails;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RevPointsChallengeDetailsDestination) {
            return new RevPointsChallengeDetailsScreen(new RevPointsChallengeDetailsScreenContract$InputData(((RevPointsChallengeDetailsDestination) destination).getF83483a()));
        }
        if (!(destination instanceof RevPointsFlowDestination)) {
            if (destination instanceof RevPointsOptInDestination) {
                RevPointsOptInDestination revPointsOptInDestination = (RevPointsOptInDestination) destination;
                return gc0.c.b(new LifestyleRevPointsFlow(revPointsOptInDestination.getF83524c()), this.f309504b.h(revPointsOptInDestination.getF83522a(), revPointsOptInDestination.getF83523b()));
            }
            if (destination instanceof RevPointsUnlockBenefitsControllerApi$Destination) {
                return new RevPointsUnlockBenefitsScreen(((RevPointsUnlockBenefitsControllerApi$Destination) destination).getF83538a());
            }
            if (destination instanceof RevPointsBottomSheetDestination) {
                return new RevPointsBottomSheetScreen(new RevPointsBottomSheetScreenContract$InputData(((RevPointsBottomSheetDestination) destination).getF83482a()));
            }
            if (destination instanceof RevPointsAccountMigrationChecklistDestination) {
                return new RevPointsAccountMigrationChecklistScreen(new RevPointsAccountMigrationChecklistScreenContract$InputData(((RevPointsAccountMigrationChecklistDestination) destination).getF83478a()));
            }
            if (destination instanceof RevPointsAdventRewardDestination) {
                RevPointsAdventRewardDestination revPointsAdventRewardDestination = (RevPointsAdventRewardDestination) destination;
                return new RevPointsAdventRewardsFlow(new RevPointsAdventRewardsFlowContract$InputData(revPointsAdventRewardDestination.getF83479a(), revPointsAdventRewardDestination.getF83480b(), revPointsAdventRewardDestination.getF83481c()));
            }
            if (destination instanceof RevPointsTrophyRoomDestination) {
                return new RevPointsTrophyRoomFlow();
            }
            if (destination instanceof RevPointsPersonalisationDestination) {
                return new RevPointsPersonalisationScreen();
            }
            if (destination instanceof RevPointsPersonalisationTargetingOnboardingDestination) {
                return new RevPointsPersonalisationTargetingOnboardingScreen(new RevPointsPersonalisationTargetingOnboardingScreenContract$InputData(((RevPointsPersonalisationTargetingOnboardingDestination) destination).getF83535b()));
            }
            if (destination instanceof RevPointsPostOnboardingPersonalisationDestination) {
                return new RevPointsPostOnboardingPersonalisationFlow(new RevPointsPostOnboardingPersonalisationFlowContract$InputData(((RevPointsPostOnboardingPersonalisationDestination) destination).getF83536a()));
            }
            if (destination instanceof RevPointsEarnOptionsScreenApi$Destination) {
                return new RevPointsEarnOptionsScreen(((RevPointsEarnOptionsScreenApi$Destination) destination).getF83484a());
            }
            if (!(destination instanceof RevPointsWrappedDestination)) {
                return null;
            }
            RevPointsWrappedDestination revPointsWrappedDestination = (RevPointsWrappedDestination) destination;
            return new RevPointsWrappedFlow(new RevPointsWrappedFlowContract$InputData(revPointsWrappedDestination.getF83540a(), revPointsWrappedDestination.getF83541b()));
        }
        RevPointsFlowDestination.StartType f83493b = ((RevPointsFlowDestination) destination).getF83493b();
        if (f83493b instanceof RevPointsFlowDestination.StartType.OpenRevPointsTransactionDetails) {
            RevPointsFlowDestination.StartType.OpenRevPointsTransactionDetails openRevPointsTransactionDetails = (RevPointsFlowDestination.StartType.OpenRevPointsTransactionDetails) f83493b;
            if (openRevPointsTransactionDetails.getE()) {
                openTransactionDetails = new RevPointsFlowContract$Step.OpenTransactionDetails(openRevPointsTransactionDetails.getF83509a());
            } else {
                List f83510b = openRevPointsTransactionDetails.getF83510b();
                if (f83510b.isEmpty()) {
                    f83510b = zhm.u.c(openRevPointsTransactionDetails.getF83509a());
                }
                openTransactionDetails = new RevPointsFlowContract$Step.OpenTransactionDetailsPager(f83510b, openRevPointsTransactionDetails.getF83509a().getF84054a(), openRevPointsTransactionDetails.getF83509a(), RevPointsTransactionPageParams.b(openRevPointsTransactionDetails.getD(), null, 510), null, null, openRevPointsTransactionDetails.getF83511c(), null, SyslogConstants.LOG_LOCAL6);
            }
            return new RevPointsFlow(new RevPointsFlowContract$InputData(openTransactionDetails));
        }
        if (f83493b instanceof RevPointsFlowDestination.StartType.OpenRevPointsTransactionDetailsByTransactionId) {
            return new RevPointsFlow(new RevPointsFlowContract$InputData(new RevPointsFlowContract$Step.OpenTransactionDetailsByTransactionId(((RevPointsFlowDestination.StartType.OpenRevPointsTransactionDetailsByTransactionId) f83493b).getF83512a())));
        }
        if (f83493b instanceof RevPointsFlowDestination.StartType.OpenChallengesDetails) {
            return new RevPointsFlow(new RevPointsFlowContract$InputData(new RevPointsFlowContract$Step.OpenChallengeDetails(((RevPointsFlowDestination.StartType.OpenChallengesDetails) f83493b).getF83500a())));
        }
        if (f83493b instanceof RevPointsFlowDestination.StartType.OpenChallengesGrid) {
            return new RevPointsFlow(new RevPointsFlowContract$InputData(new RevPointsFlowContract$Step.OpenChallengesGrid(((RevPointsFlowDestination.StartType.OpenChallengesGrid) f83493b).getF83501a())));
        }
        if (f83493b instanceof RevPointsFlowDestination.StartType.OpenTransactionList) {
            RevPointsFlowDestination.StartType.OpenTransactionList openTransactionList = (RevPointsFlowDestination.StartType.OpenTransactionList) f83493b;
            RevPointsTransactionPageParams f83513a = openTransactionList.getF83513a();
            ResourceId f83518a = openTransactionList.getF83514b().getF83518a();
            boolean f83519b = openTransactionList.getF83514b().getF83519b();
            boolean f83520c = openTransactionList.getF83514b().getF83520c();
            RevPointsFlowDestination.StartType.OpenTransactionList.EmptyStateOverride d = openTransactionList.getF83514b().getD();
            return new RevPointsFlow(new RevPointsFlowContract$InputData(new RevPointsFlowContract$Step.OpenTransactionsList(f83513a, new RevPointsFlowContract$Step.OpenTransactionsList.UiOverrides(f83518a, f83519b, f83520c, d != null ? new RevPointsFlowContract$Step.OpenTransactionsList.EmptyStateOverride(d.getF83515a(), d.getF83516b(), d.getF83517c(), d.getD()) : null))));
        }
        if (f83493b instanceof RevPointsFlowDestination.StartType.OpenUpsellSelectPlan) {
            return new RevPointsFlow(new RevPointsFlowContract$InputData(RevPointsFlowContract$Step.OpenUpsellSelectPlan.f83761a));
        }
        if (f83493b instanceof RevPointsFlowDestination.StartType.OpenRedeemHub) {
            return new RevPointsFlow(new RevPointsFlowContract$InputData(new RevPointsFlowContract$Step.OpenRedeemHub(((RevPointsFlowDestination.StartType.OpenRedeemHub) f83493b).getF83505a())));
        }
        if (f83493b instanceof RevPointsFlowDestination.StartType.OpenEarnHub) {
            RevPointsFlowDestination.StartType.OpenEarnHub openEarnHub = (RevPointsFlowDestination.StartType.OpenEarnHub) f83493b;
            return new RevPointsFlow(new RevPointsFlowContract$InputData(new RevPointsFlowContract$Step.OpenEarnHub(openEarnHub.getF83502a(), openEarnHub.getF83503b())));
        }
        if (f83493b instanceof RevPointsFlowDestination.StartType.OpenLearnScreen) {
            return new RevPointsFlow(new RevPointsFlowContract$InputData(new RevPointsFlowContract$Step.OpenLearnScreen(((RevPointsFlowDestination.StartType.OpenLearnScreen) f83493b).getF83504a())));
        }
        if (f83493b instanceof RevPointsFlowDestination.StartType.OpenRelatedTransactionsBottomSheet) {
            RevPointsFlowDestination.StartType.OpenRelatedTransactionsBottomSheet openRelatedTransactionsBottomSheet = (RevPointsFlowDestination.StartType.OpenRelatedTransactionsBottomSheet) f83493b;
            return new RevPointsFlow(new RevPointsFlowContract$InputData(new RevPointsFlowContract$Step.OpenRelatedTransactionsBottomSheet(openRelatedTransactionsBottomSheet.getF83506a(), openRelatedTransactionsBottomSheet.getF83507b())));
        }
        if (f83493b instanceof RevPointsFlowDestination.StartType.OpenChallengeDetailsBottomSheet) {
            return new RevPointsFlow(new RevPointsFlowContract$InputData(new RevPointsFlowContract$Step.OpenChallengeDetailsBottomSheet(((RevPointsFlowDestination.StartType.OpenChallengeDetailsBottomSheet) f83493b).getF83499a())));
        }
        if (f83493b instanceof RevPointsFlowDestination.StartType.OpenRevPointsExpiryHome) {
            return new RevPointsFlow(new RevPointsFlowContract$InputData(RevPointsFlowContract$Step.OpenRevPointsExpiryHome.f83745a));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // aii.p
    public final Set h() {
        return this.f309503a;
    }
}
