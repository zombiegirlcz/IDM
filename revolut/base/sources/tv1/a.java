package tv1;

import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements d12.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmOnboardingStatus f274686a;

    public a(ApmOnboardingStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f274686a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f274686a, ((a) obj2).f274686a);
    }

    public final int hashCode() {
        return this.f274686a.hashCode();
    }
}
