package kac;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182458a;

    public f(String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.f182458a = orderId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f182458a, ((f) obj2).f182458a);
    }

    public final int hashCode() {
        return this.f182458a.hashCode();
    }
}
