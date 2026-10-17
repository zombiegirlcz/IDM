package jec;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173264a;

    public i(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f173264a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f173264a, ((i) obj2).f173264a);
    }

    public final int hashCode() {
        return this.f173264a.hashCode();
    }
}
