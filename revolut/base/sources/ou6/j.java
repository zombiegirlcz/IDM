package ou6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229832a;

    public j(String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.f229832a = orderId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f229832a, ((j) obj2).f229832a);
    }

    public final int hashCode() {
        return this.f229832a.hashCode();
    }
}
