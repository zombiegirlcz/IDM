package na6;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.donations.api.DonationsAvailabilityApi$Toggles;
import com.revolut.feature.donations.api.navigation.DonationsKompotFeatureConfig;
import com.revolut.feature.donations.impl.ui.kompot.flow.root.DonationsFlow;
import com.revolut.feature.donations.impl.ui.kompot.flow.root.DonationsFlowContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.OneTimeDonationScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.OneTimeDonationScreenContract$InputData;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f213816a;

    public b(ImmutableSet deeplinkGateways, eb6.a donatedAmountInfoDialogProvider) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(donatedAmountInfoDialogProvider, "donatedAmountInfoDialogProvider");
        this.f213816a = deeplinkGateways;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof ca6.a)) {
            return null;
        }
        ca6.a aVar = (ca6.a) descriptor;
        return aVar.a(eb6.a.a(aVar.b().getF71969a()));
    }

    @Override // nte.a
    public final List e() {
        return d0.E0(DonationsAvailabilityApi$Toggles.a(), y96.a.a());
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof DonationsKompotFeatureConfig.CharitiesOverviewDestination) {
            return new DonationsFlow(DonationsFlowContract$InputData.Overview.f72038a);
        }
        if (destination instanceof DonationsKompotFeatureConfig.CollectionDestination) {
            DonationsKompotFeatureConfig.CollectionDestination collectionDestination = (DonationsKompotFeatureConfig.CollectionDestination) destination;
            return new DonationsFlow(new DonationsFlowContract$InputData.CharitiesCollectionDetails(collectionDestination.f71982a, collectionDestination.f71983b));
        }
        if (destination instanceof DonationsKompotFeatureConfig.CharityNotFoundDestination) {
            return new DonationsFlow(DonationsFlowContract$InputData.CharityNotFound.f72037a);
        }
        if (destination instanceof DonationsKompotFeatureConfig.CharityDestination) {
            return new DonationsFlow(new DonationsFlowContract$InputData.CharityDetails(((DonationsKompotFeatureConfig.CharityDestination) destination).f71980a));
        }
        if (destination instanceof DonationsKompotFeatureConfig.RecurringDonationDestination) {
            return new DonationsFlow(new DonationsFlowContract$InputData.RecurringDonation(((DonationsKompotFeatureConfig.RecurringDonationDestination) destination).f71988a));
        }
        if (destination instanceof DonationsKompotFeatureConfig.AmountSuggestionDestination) {
            DonationsKompotFeatureConfig.AmountSuggestionDestination amountSuggestionDestination = (DonationsKompotFeatureConfig.AmountSuggestionDestination) destination;
            return new DonationsFlow(new DonationsFlowContract$InputData.AmountSuggestion(amountSuggestionDestination.f71973a, amountSuggestionDestination.f71974b, amountSuggestionDestination.f71975c));
        }
        if (!(destination instanceof DonationsKompotFeatureConfig.OneTimeDonationDestination)) {
            return null;
        }
        DonationsKompotFeatureConfig.OneTimeDonationDestination oneTimeDonationDestination = (DonationsKompotFeatureConfig.OneTimeDonationDestination) destination;
        return new OneTimeDonationScreen(new OneTimeDonationScreenContract$InputData(oneTimeDonationDestination.getF71985b(), oneTimeDonationDestination.getF71986c(), oneTimeDonationDestination.getF71984a(), oneTimeDonationDestination.getD()));
    }

    @Override // aii.p
    public final Set h() {
        return this.f213816a;
    }
}
