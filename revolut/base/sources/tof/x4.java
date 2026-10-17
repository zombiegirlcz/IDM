package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x4 implements z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273159a;

    public x4(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f273159a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x4) && Intrinsics.f(this.f273159a, ((x4) obj2).f273159a);
    }

    public final int hashCode() {
        return this.f273159a.hashCode();
    }
}
