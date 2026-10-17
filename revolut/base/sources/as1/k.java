package as1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8768a;

    public k(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f8768a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f8768a, ((k) obj2).f8768a);
    }

    public final int hashCode() {
        return this.f8768a.hashCode();
    }
}
