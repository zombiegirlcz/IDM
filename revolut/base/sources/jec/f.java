package jec;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173261a;

    public f(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f173261a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f173261a, ((f) obj2).f173261a);
    }

    public final int hashCode() {
        return this.f173261a.hashCode();
    }
}
