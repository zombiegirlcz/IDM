package lbc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193636a;

    public l(String orderNumber) {
        Intrinsics.checkNotNullParameter(orderNumber, "orderNumber");
        this.f193636a = orderNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f193636a, ((l) obj2).f193636a);
    }

    public final int hashCode() {
        return this.f193636a.hashCode();
    }
}
