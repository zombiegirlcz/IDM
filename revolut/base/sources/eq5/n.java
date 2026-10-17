package eq5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wp5.b f128293a;

    public n(wp5.b amountFitsInLimitsStatus) {
        Intrinsics.checkNotNullParameter(amountFitsInLimitsStatus, "amountFitsInLimitsStatus");
        this.f128293a = amountFitsInLimitsStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f128293a == ((n) obj2).f128293a;
    }

    public final int hashCode() {
        return this.f128293a.hashCode();
    }
}
