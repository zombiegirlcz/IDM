package g8g;

import aii.e;
import aii.g;
import aii.p;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.gift.asset.api.CryptoGiftAssetApi$Toggles$CryptoGiftAsset;
import com.revolut.feature.crypto.gift.asset.api.navigation.CryptoGiftAssetDestination;
import com.revolut.feature.crypto.gift.asset.impl.ui.flow.CryptoGiftAssetFlow;
import com.revolut.feature.pay_with_smile.api.declaration.PayWithSmileApi$Deeplink$Consent;
import com.revolut.feature.pay_with_smile.api.declaration.PayWithSmileApi$Toggles$PayWithSmileChangePasscode;
import com.revolut.feature.pay_with_smile.api.declaration.PayWithSmileApi$Toggles$PayWithSmileRetailSettings;
import com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.PayWithSmileEnrollmentFlow;
import com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.PayWithSmileEnrollmentFlowContract$InputData;
import com.revolut.feature.retail.savings.api.creation.SavingsAccountCreationApi$Toggles$SavingsOptionSelectionScreenV2;
import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Destination;
import com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlow;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Input;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.SavingsAccountCreationFlow;
import com.revolut.feature.semi_independent_onboarding.api.navigation.SemiIndependentInvitationContract$InputData;
import com.revolut.feature.semi_independent_onboarding.api.navigation.SemiIndependentOnboardingDestination;
import com.revolut.feature.semi_independent_onboarding.impl.ui.details.SemiIndependentOnboardingDetailsScreen;
import com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.SemiIndependentOnboardingInvitationFlow;
import com.revolut.feature.travel.hotel.transfers.api.TravelHotelTransfersApi$Toggles$StaysHotelTransfers;
import com.revolut.feature.travel.hotel.transfers.api.navigation.TravelHotelTransfersDestination;
import com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.TravelHotelTransfersHomeScreen;
import com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.TravelHotelTransfersHomeScreenContract$InputData;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ol9.c;
import v0d.d;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f141359b;

    public b(ImmutableSet deeplinkGateways, int i) {
        this.f141358a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f141359b = deeplinkGateways;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f141359b = deeplinkGateways;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f141359b = deeplinkGateways;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f141359b = deeplinkGateways;
                break;
            default:
                Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
                this.f141359b = deeplinkGateways;
                break;
        }
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        switch (this.f141358a) {
            case 0:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                if (descriptor instanceof e8g.a) {
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                if (!(descriptor instanceof c)) {
                    if (!(descriptor instanceof ol9.a)) {
                    }
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                if (descriptor instanceof og5.a) {
                    og5.a aVar = (og5.a) descriptor;
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                if (descriptor instanceof com.revolut.feature.retail.savings.api.creation.navigation.a) {
                    com.revolut.feature.retail.savings.api.creation.navigation.a aVar2 = (com.revolut.feature.retail.savings.api.creation.navigation.a) descriptor;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                if (!(descriptor instanceof v0d.e)) {
                    super.c(descriptor);
                } else {
                    v0d.e eVar = (v0d.e) descriptor;
                }
                break;
        }
        return null;
    }

    @Override // nte.a
    public final List e() {
        switch (this.f141358a) {
            case 0:
                return u.c(TravelHotelTransfersApi$Toggles$StaysHotelTransfers.f93599c);
            case 1:
                return v.k(PayWithSmileApi$Toggles$PayWithSmileRetailSettings.f78949c, PayWithSmileApi$Toggles$PayWithSmileChangePasscode.f78948c);
            case 2:
                return u.c(CryptoGiftAssetApi$Toggles$CryptoGiftAsset.f70860c);
            case 3:
                return u.c(SavingsAccountCreationApi$Toggles$SavingsOptionSelectionScreenV2.f83124c);
            default:
                return f0.f322471a;
        }
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        switch (this.f141358a) {
            case 0:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof TravelHotelTransfersDestination) {
                    return new TravelHotelTransfersHomeScreen(new TravelHotelTransfersHomeScreenContract$InputData(((TravelHotelTransfersDestination) destination).f93601b));
                }
                return null;
            case 1:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof PayWithSmileApi$Deeplink$Consent) {
                    return gc0.c.b(new PayWithSmileEnrollmentFlow(new PayWithSmileEnrollmentFlowContract$InputData(((PayWithSmileApi$Deeplink$Consent) destination).f78947a)), new ogk.b(19));
                }
                return null;
            case 2:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof CryptoGiftAssetDestination) {
                    return new CryptoGiftAssetFlow();
                }
                return null;
            case 3:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof SavingsAccountCreationFlow$Destination) {
                    SavingsAccountCreationFlow$Destination savingsAccountCreationFlow$Destination = (SavingsAccountCreationFlow$Destination) destination;
                    return new SavingsOnboardingFlow(new SavingsOnboardingFlowContract$Input(savingsAccountCreationFlow$Destination.f83125a, savingsAccountCreationFlow$Destination.f83126b, savingsAccountCreationFlow$Destination.f83127c, false));
                }
                if (destination instanceof SavingsAccountCreationStepDestination) {
                    return new SavingsAccountCreationFlow((SavingsAccountCreationStepDestination) destination);
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof SemiIndependentOnboardingDestination.GuardianInvitation) {
                    return new SemiIndependentOnboardingInvitationFlow(new SemiIndependentInvitationContract$InputData(d.START_WITH_CONTACT_CHOOSER, v0d.a.MODAL_MODE));
                }
                if (destination instanceof SemiIndependentOnboardingDestination.GuardianInvitationDetails) {
                    return new SemiIndependentOnboardingDetailsScreen();
                }
                return null;
        }
    }

    @Override // aii.p
    public final Set h() {
        switch (this.f141358a) {
        }
        return this.f141359b;
    }
}
