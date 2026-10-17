package t2h;

import kotlin.jvm.internal.Intrinsics;
import nel.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfl.g f267568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f267569b;

    public e(bfl.g tradeSide, u0 onboardingDetails) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(onboardingDetails, "onboardingDetails");
        this.f267568a = tradeSide;
        this.f267569b = onboardingDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f267568a == eVar.f267568a && Intrinsics.f(this.f267569b, eVar.f267569b);
    }

    public final int hashCode() {
        return this.f267569b.hashCode() + (this.f267568a.hashCode() * 31);
    }
}
