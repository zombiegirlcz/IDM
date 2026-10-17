package ku1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189615a;

    public j(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f189615a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f189615a, ((j) obj2).f189615a);
    }

    public final int hashCode() {
        return this.f189615a.hashCode();
    }
}
