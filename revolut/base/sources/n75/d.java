package n75;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213000a;

    public d(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f213000a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f213000a, ((d) obj2).f213000a);
    }

    public final int hashCode() {
        return this.f213000a.hashCode();
    }
}
