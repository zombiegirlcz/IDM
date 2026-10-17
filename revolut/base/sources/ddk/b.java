package ddk;

import aii.p;
import com.google.common.collect.ImmutableSet;
import com.revolut.crypto.challenge.api.CryptoChallengeApi$FeatureToggles$CryptoPlanChallenge;
import com.revolut.crypto.challenge.api.navigation.CryptoChallengeRewardsDestination;
import com.revolut.crypto.challenge.impl.ui.screen.progress.CryptoChallengeProgressViewController;
import com.revolut.feature.instruments.trend.collections.api.InstrumentsTrendCollectionDestination;
import com.revolut.feature.instruments.trend.collections.api.InstrumentsTrendCollectionsApi$Toggles$InvestRecommendedBuysLocked;
import com.revolut.feature.instruments.trend.collections.impl.navigation.InstrumentsTrendCollectionsLauncherFlowDestination;
import com.revolut.feature.instruments.trend.collections.impl.ui.collection.InstrumentsTrendCollectionController;
import com.revolut.feature.instruments.trend.collections.impl.ui.launcher.InstrumentsTrendCollectionsLauncherFlow;
import com.revolut.feature.payments_migration.api.PaymentsMigrationApi$Toggles$PaymentsMigration;
import com.revolut.feature.payments_migration.api.navigation.PaymentsMigrationDestination;
import com.revolut.feature.payments_migration.impl.ui.flow.PaymentsMigrationFlow;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayManagementHome;
import com.revolut.feature.revolutpay.management.api.declaration.RevolutPayManagementApi$Toggles$RevolutPayGenericPointsWidget;
import com.revolut.feature.revolutpay.management.api.declaration.RevolutPayManagementApi$Toggles$RevolutPaySettingsV2;
import com.revolut.feature.revolutpay.management.impl.ui.management.flow.RevolutPayManagementFlow;
import com.revolut.retail.feature.api.travel_trips.TravelTripsApi$Toggles$TripItinerary;
import com.revolut.retail.feature.api.travel_trips.TravelTripsApi$Toggles$TripItineraryAddExperiences;
import com.revolut.retail.feature.api.travel_trips.TravelTripsApi$Toggles$TripItineraryAddFastTrack;
import com.revolut.retail.feature.api.travel_trips.TravelTripsApi$Toggles$TripItineraryAddStays;
import com.revolut.retail.feature.api.travel_trips.TravelTripsApi$Toggles$TripItineraryLifestyleWidget;
import com.revolut.retail.feature.api.travel_trips.navigation.TravelTripsItineraryDestination;
import com.revolut.retail.feature.api.userauth.UserAuthFeatureApi$Toggles$DisableStrictPhoneValidation;
import com.revolut.retail.feature.api.userauth.UserAuthFeatureApi$Toggles$RegisteredIdentitySignIn;
import com.revolut.retail.feature.crypto.prelaunch.api.CryptoPreLaunchApi$Toggles$CryptoDayOneLaunch;
import com.revolut.retail.feature.crypto.prelaunch.api.navigation.CryptoPreLaunchDetailsDestination;
import com.revolut.retail.feature.crypto.prelaunch.impl.ui.details.CryptoPreLaunchDetailsContract$InputData;
import com.revolut.retail.feature.crypto.prelaunch.impl.ui.details.CryptoPreLaunchDetailsScreen;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.TravelItineraryScreen;
import com.revolut.retail.feature.plan_rewards.api.PlanRewardsApi$Toggles$MonthlyDraws;
import com.revolut.retail.feature.plan_rewards.api.navigation.MilestoneRewardsListDestination;
import com.revolut.retail.feature.plan_rewards.api.navigation.MonthlyDrawsDestination;
import com.revolut.retail.feature.plan_rewards.api.navigation.PlanRewardsRevealDestination;
import com.revolut.retail.feature.plan_rewards.impl.presentation.flow.MonthlyDrawsFlow;
import com.revolut.retail.feature.plan_rewards.impl.presentation.flow.MonthlyDrawsFlowContract$InputData;
import com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow.MilestoneRewardsFlow;
import com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.flow.PlanRewardsRevealFlow;
import com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.flow.PlanRewardsRevealFlowContract$InputData;
import com.revolut.retail.revolutoauth.api.RevolutOAuthRetailFeatureApi$Toggles$RevolutOAuth;
import com.revolut.retail.revolutoauth.api.RevolutOAuthRetailFeatureApi$Toggles$RevolutOAuthConnectedApps;
import dki.g;
import fi7.l;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;
import zhm.y0;
import zuj.t;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f113259b;

    public b(Set deeplinkGateways) {
        this.f113258a = 4;
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f113259b = deeplinkGateways;
    }

    @Override // nte.a
    public final List e() {
        switch (this.f113258a) {
            case 0:
                return u.c(PlanRewardsApi$Toggles$MonthlyDraws.f102521c);
            case 1:
                return u.c(InstrumentsTrendCollectionsApi$Toggles$InvestRecommendedBuysLocked.f74892c);
            case 2:
                return u.c(PaymentsMigrationApi$Toggles$PaymentsMigration.f80203c);
            case 3:
                return v.k(TravelTripsApi$Toggles$TripItinerary.f99257c, TravelTripsApi$Toggles$TripItineraryLifestyleWidget.f99261c, TravelTripsApi$Toggles$TripItineraryAddStays.f99260c, TravelTripsApi$Toggles$TripItineraryAddExperiences.f99258c, TravelTripsApi$Toggles$TripItineraryAddFastTrack.f99259c);
            case 4:
                return v.k(RevolutOAuthRetailFeatureApi$Toggles$RevolutOAuth.f104444c, RevolutOAuthRetailFeatureApi$Toggles$RevolutOAuthConnectedApps.f104445c);
            case 5:
                return u.c(CryptoPreLaunchApi$Toggles$CryptoDayOneLaunch.f100030c);
            case 6:
                return v.k(UserAuthFeatureApi$Toggles$DisableStrictPhoneValidation.f99270a, UserAuthFeatureApi$Toggles$RegisteredIdentitySignIn.f99271c);
            case 7:
                return u.c(CryptoChallengeApi$FeatureToggles$CryptoPlanChallenge.f60102c);
            default:
                return v.k(RevolutPayManagementApi$Toggles$RevolutPaySettingsV2.f84580c, RevolutPayManagementApi$Toggles$RevolutPayGenericPointsWidget.f84579c);
        }
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, g flowModel) {
        com.revolut.kompot.navigable.a monthlyDrawsFlow;
        switch (this.f113258a) {
            case 0:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof MilestoneRewardsListDestination) {
                    return new MilestoneRewardsFlow();
                }
                if (destination instanceof PlanRewardsRevealDestination) {
                    PlanRewardsRevealDestination planRewardsRevealDestination = (PlanRewardsRevealDestination) destination;
                    monthlyDrawsFlow = new PlanRewardsRevealFlow(new PlanRewardsRevealFlowContract$InputData(planRewardsRevealDestination.f102539a, planRewardsRevealDestination.f102540b));
                } else {
                    if (!(destination instanceof MonthlyDrawsDestination)) {
                        return null;
                    }
                    MonthlyDrawsDestination monthlyDrawsDestination = (MonthlyDrawsDestination) destination;
                    monthlyDrawsFlow = new MonthlyDrawsFlow(new MonthlyDrawsFlowContract$InputData(monthlyDrawsDestination.f102537a, monthlyDrawsDestination.f102538b));
                }
                return monthlyDrawsFlow;
            case 1:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (!(destination instanceof InstrumentsTrendCollectionDestination)) {
                    if (destination instanceof InstrumentsTrendCollectionsLauncherFlowDestination) {
                        return new InstrumentsTrendCollectionsLauncherFlow(((InstrumentsTrendCollectionsLauncherFlowDestination) destination).f74907a);
                    }
                    return null;
                }
                InstrumentsTrendCollectionDestination instrumentsTrendCollectionDestination = (InstrumentsTrendCollectionDestination) destination;
                return new InstrumentsTrendCollectionController(new l(instrumentsTrendCollectionDestination.f74889a, instrumentsTrendCollectionDestination.f74891c, instrumentsTrendCollectionDestination.f74890b));
            case 2:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (Intrinsics.f(destination, PaymentsMigrationDestination.f80204b)) {
                    return new PaymentsMigrationFlow();
                }
                return null;
            case 3:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof TravelTripsItineraryDestination) {
                    return new TravelItineraryScreen(new t(((TravelTripsItineraryDestination) destination).f99262a));
                }
                return null;
            case 4:
            case 6:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                return null;
            case 5:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof CryptoPreLaunchDetailsDestination) {
                    return new CryptoPreLaunchDetailsScreen(new CryptoPreLaunchDetailsContract$InputData(((CryptoPreLaunchDetailsDestination) destination).f100031a));
                }
                return null;
            case 7:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof CryptoChallengeRewardsDestination) {
                    return new CryptoChallengeProgressViewController();
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof RevolutPayFeatureConfig$RevolutPayManagementHome) {
                    return new RevolutPayManagementFlow();
                }
                return null;
        }
    }

    @Override // aii.p
    public final Set h() {
        switch (this.f113258a) {
        }
        return this.f113259b;
    }

    public b(a11.b rewardsDeeplinkGateway) {
        this.f113258a = 7;
        Intrinsics.checkNotNullParameter(rewardsDeeplinkGateway, "rewardsDeeplinkGateway");
        this.f113259b = y0.b(rewardsDeeplinkGateway);
    }

    public b(ImmutableSet deeplinkGateways, int i) {
        this.f113258a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f113259b = deeplinkGateways;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f113259b = deeplinkGateways;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f113259b = deeplinkGateways;
                break;
            case 4:
            case 7:
            default:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f113259b = deeplinkGateways;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f113259b = deeplinkGateways;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f113259b = deeplinkGateways;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f113259b = deeplinkGateways;
                break;
        }
    }
}
