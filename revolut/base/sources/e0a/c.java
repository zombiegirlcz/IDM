package e0a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121484a;

    public c(String suspiciousTransactionId) {
        Intrinsics.checkNotNullParameter(suspiciousTransactionId, "suspiciousTransactionId");
        this.f121484a = suspiciousTransactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f121484a, ((c) obj2).f121484a);
    }

    public final int hashCode() {
        return this.f121484a.hashCode();
    }
}
