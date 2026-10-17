package mga;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f205223a;

    public y(List loyaltyTransactionIds) {
        Intrinsics.checkNotNullParameter(loyaltyTransactionIds, "loyaltyTransactionIds");
        this.f205223a = loyaltyTransactionIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f205223a, ((y) obj2).f205223a);
    }

    public final int hashCode() {
        return this.f205223a.hashCode();
    }
}
