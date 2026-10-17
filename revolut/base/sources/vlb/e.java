package vlb;

import com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointSavingsOnboardingRevamp;
import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ncd.h;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f290312a;

    public e(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f290312a = featureToggleInteractor;
    }

    public final boolean a(h accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        int i = d.f290311a[accountType.ordinal()];
        if (i == 1) {
            return b();
        }
        gte.a aVar = this.f290312a;
        if (i != 2) {
            if (i != 3) {
                if (i == 4 || i == 5) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!b()) {
                return false;
            }
            if (!((jte.d) aVar).c(SavingsApi$Toggles.YouthSavingsOnboardingRevamp.f83086c)) {
                return false;
            }
        } else {
            if (!b()) {
                return false;
            }
            if (!((jte.d) aVar).c(JointAccountsApi$Toggles$JointSavingsOnboardingRevamp.f76464c)) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        return ((jte.d) this.f290312a).c(SavingsApi$Toggles.SavingsOnboardingRevamp.f83084c);
    }
}
