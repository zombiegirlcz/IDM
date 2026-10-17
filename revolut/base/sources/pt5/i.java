package pt5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239619a;

    public i(String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.f239619a = orderId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f239619a, ((i) obj2).f239619a);
    }

    public final int hashCode() {
        return this.f239619a.hashCode();
    }
}
