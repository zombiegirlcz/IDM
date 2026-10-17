package b1d;

import com.revolut.feature.semi_independent_onboarding.api.navigation.SemiIndependentOnboardingDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements xii.b {
    @Override // xii.b
    public final Set a() {
        return y0.b("teen/sia-invitation/send");
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return SemiIndependentOnboardingDestination.GuardianInvitation.f85985a;
    }
}
