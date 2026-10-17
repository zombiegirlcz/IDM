package t2h;

import kotlin.jvm.internal.Intrinsics;
import nel.q0;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f267565a;

    public c(q0 onboardingDetails) {
        Intrinsics.checkNotNullParameter(onboardingDetails, "onboardingDetails");
        this.f267565a = onboardingDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f267565a, ((c) obj2).f267565a);
    }

    public final int hashCode() {
        return this.f267565a.hashCode();
    }
}
