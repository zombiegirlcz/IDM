package q63;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s63.d f242472a;

    public k(s63.d checkoutOrderDetails) {
        Intrinsics.checkNotNullParameter(checkoutOrderDetails, "checkoutOrderDetails");
        this.f242472a = checkoutOrderDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f242472a, ((k) obj2).f242472a);
    }

    public final int hashCode() {
        return this.f242472a.hashCode();
    }
}
