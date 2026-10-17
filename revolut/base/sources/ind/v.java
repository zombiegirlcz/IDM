package ind;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ejb.o f162830b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ejb.o savingsTransactionType) {
        super(savingsTransactionType.name());
        Intrinsics.checkNotNullParameter(savingsTransactionType, "savingsTransactionType");
        this.f162830b = savingsTransactionType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && this.f162830b == ((v) obj2).f162830b;
    }

    public final int hashCode() {
        return this.f162830b.hashCode();
    }
}
