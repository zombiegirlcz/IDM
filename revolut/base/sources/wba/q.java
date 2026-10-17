package wba;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296088a;

    public q(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f296088a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f296088a, ((q) obj2).f296088a);
    }

    public final int hashCode() {
        return this.f296088a.hashCode();
    }
}
