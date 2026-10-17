package s47;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f259788a;

    public k(LinkedHashSet excludedTransactionIds) {
        Intrinsics.checkNotNullParameter(excludedTransactionIds, "excludedTransactionIds");
        this.f259788a = excludedTransactionIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f259788a.equals(((k) obj2).f259788a);
    }

    public final int hashCode() {
        return this.f259788a.hashCode();
    }
}
