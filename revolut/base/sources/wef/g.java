package wef;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296771a;

    public g(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f296771a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f296771a, ((g) obj2).f296771a);
    }

    public final int hashCode() {
        return this.f296771a.hashCode();
    }
}
