package jma;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.sso.api.passcode.change.RevolutSsoChangePasscodeFlowDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements tla.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.retail.feature.api.userauth.navigation.a f176505a;

    public i(com.revolut.retail.feature.api.userauth.navigation.a userOnboardingNavigationProvider) {
        Intrinsics.checkNotNullParameter(userOnboardingNavigationProvider, "userOnboardingNavigationProvider");
        this.f176505a = userOnboardingNavigationProvider;
    }

    public final FeatureCommand b() {
        return vhi.c.c(new RevolutSsoChangePasscodeFlowDestination(0), yhi.b.SOLID, null, false, 12);
    }
}
