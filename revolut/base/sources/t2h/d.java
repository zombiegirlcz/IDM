package t2h;

import kotlin.jvm.internal.Intrinsics;
import nel.t0;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfl.g f267566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f267567b;

    public d(bfl.g tradeSide, t0 onboardingDetails) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(onboardingDetails, "onboardingDetails");
        this.f267566a = tradeSide;
        this.f267567b = onboardingDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f267566a == dVar.f267566a && Intrinsics.f(this.f267567b, dVar.f267567b);
    }

    public final int hashCode() {
        return this.f267567b.hashCode() + (this.f267566a.hashCode() * 31);
    }
}
