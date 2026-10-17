package eq5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wp5.a f128280a;

    public k(wp5.a amountFitsInBalanceStatus) {
        Intrinsics.checkNotNullParameter(amountFitsInBalanceStatus, "amountFitsInBalanceStatus");
        this.f128280a = amountFitsInBalanceStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f128280a == ((k) obj2).f128280a;
    }

    public final int hashCode() {
        return this.f128280a.hashCode();
    }
}
