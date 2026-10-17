package ku1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189612a;

    public i(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f189612a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f189612a, ((i) obj2).f189612a);
    }

    public final int hashCode() {
        return this.f189612a.hashCode();
    }
}
