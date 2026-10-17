package m9b;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.retail.global_accounts.api.navigation.CountryProfileOnboardingFlowDestination;
import com.revolut.feature.retail.global_accounts.api.navigation.CountryProfilesManagementScreenDestination;
import com.revolut.feature.retail.global_accounts.impl.management.ui.CountryProfilesManagementScreen;
import com.revolut.feature.retail.global_accounts.impl.onboarding.ui.CountryProfileOnboardingFlow;
import com.revolut.feature.retail.global_accounts.impl.registered_identities.RegisteredIdentitiesBottomSheetScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements p {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof h9b.a) {
            return ((h9b.a) descriptor).a(new RegisteredIdentitiesBottomSheetScreen());
        }
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (Intrinsics.f(destination, CountryProfileOnboardingFlowDestination.f82639a)) {
            return new CountryProfileOnboardingFlow();
        }
        if (Intrinsics.f(destination, CountryProfilesManagementScreenDestination.f82640a)) {
            return new CountryProfilesManagementScreen();
        }
        return null;
    }
}
