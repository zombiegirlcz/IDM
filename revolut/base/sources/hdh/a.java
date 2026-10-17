package hdh;

import kotlin.jvm.internal.Intrinsics;
import nel.r0;
import nel.w0;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f151432a;

    public a(r0 onboardingDetails) {
        Intrinsics.checkNotNullParameter(onboardingDetails, "onboardingDetails");
        this.f151432a = onboardingDetails;
    }

    @Override // hdh.d
    public final w0 a() {
        return this.f151432a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f151432a, ((a) obj2).f151432a);
    }

    public final int hashCode() {
        return this.f151432a.f214615a.hashCode();
    }
}
