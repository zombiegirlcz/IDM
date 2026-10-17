package hdh;

import kotlin.jvm.internal.Intrinsics;
import nel.q0;
import nel.w0;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f151433a;

    public b(q0 onboardingDetails) {
        Intrinsics.checkNotNullParameter(onboardingDetails, "onboardingDetails");
        this.f151433a = onboardingDetails;
    }

    @Override // hdh.d
    public final w0 a() {
        return this.f151433a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f151433a, ((b) obj2).f151433a);
    }

    public final int hashCode() {
        return this.f151433a.hashCode();
    }
}
