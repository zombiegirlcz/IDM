package za8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.junior_profile.api.models.c f320578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u98.a f320579b;

    public h(com.revolut.feature.junior_profile.api.models.c juniorProfile, u98.a ageEligibility) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(ageEligibility, "ageEligibility");
        this.f320578a = juniorProfile;
        this.f320579b = ageEligibility;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f320578a, hVar.f320578a) && this.f320579b == hVar.f320579b;
    }

    public final int hashCode() {
        return this.f320579b.hashCode() + (this.f320578a.hashCode() * 31);
    }
}
