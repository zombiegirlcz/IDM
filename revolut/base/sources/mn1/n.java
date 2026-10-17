package mn1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207346a;

    public n(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f207346a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f207346a, ((n) obj2).f207346a);
    }

    public final int hashCode() {
        return this.f207346a.hashCode();
    }
}
