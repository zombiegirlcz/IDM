package au6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h2 extends g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9535a;

    public h2(String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.f9535a = orderId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h2) && Intrinsics.f(this.f9535a, ((h2) obj2).f9535a);
    }

    public final int hashCode() {
        return this.f9535a.hashCode();
    }
}
