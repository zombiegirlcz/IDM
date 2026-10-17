package zsi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bti.d f324937a;

    public g(bti.d bookingSlot) {
        Intrinsics.checkNotNullParameter(bookingSlot, "bookingSlot");
        this.f324937a = bookingSlot;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f324937a, ((g) obj2).f324937a);
    }

    public final int hashCode() {
        return this.f324937a.hashCode();
    }
}
