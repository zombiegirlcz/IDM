package s47;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f259789a;

    public l(LinkedHashSet excludedTransactionIds) {
        Intrinsics.checkNotNullParameter(excludedTransactionIds, "excludedTransactionIds");
        this.f259789a = excludedTransactionIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f259789a.equals(((l) obj2).f259789a);
    }

    public final int hashCode() {
        return this.f259789a.hashCode();
    }
}
