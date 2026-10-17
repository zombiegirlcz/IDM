package u47;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f277273b;

    public d(LinkedHashSet excludedTransactionIds) {
        Intrinsics.checkNotNullParameter(excludedTransactionIds, "excludedTransactionIds");
        this.f277273b = excludedTransactionIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f277273b.equals(((d) obj2).f277273b);
    }

    public final int hashCode() {
        return this.f277273b.hashCode();
    }
}
