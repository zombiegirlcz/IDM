package qn9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247884a;

    public i(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f247884a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f247884a, ((i) obj2).f247884a);
    }

    public final int hashCode() {
        return this.f247884a.hashCode();
    }
}
