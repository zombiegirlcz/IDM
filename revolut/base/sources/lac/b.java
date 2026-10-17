package lac;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193360a;

    public b(String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.f193360a = orderId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f193360a, ((b) obj2).f193360a);
    }

    public final int hashCode() {
        return this.f193360a.hashCode();
    }
}
