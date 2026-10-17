package yq1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f315970a;

    public f(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f315970a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f315970a, ((f) obj2).f315970a);
    }

    public final int hashCode() {
        return this.f315970a.hashCode();
    }
}
