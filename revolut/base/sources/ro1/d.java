package ro1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f255804b;

    public d(String standingOrderId) {
        Intrinsics.checkNotNullParameter(standingOrderId, "standingOrderId");
        this.f255804b = standingOrderId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f255804b, ((d) obj2).f255804b);
    }

    public final int hashCode() {
        return this.f255804b.hashCode();
    }
}
