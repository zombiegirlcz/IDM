package g4c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140479a;

    public k(String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.f140479a = orderId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f140479a, ((k) obj2).f140479a);
    }

    public final int hashCode() {
        return this.f140479a.hashCode();
    }
}
