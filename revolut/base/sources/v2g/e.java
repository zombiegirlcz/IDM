package v2g;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285735a;

    public e(String bookingId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        this.f285735a = bookingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f285735a, ((e) obj2).f285735a);
    }

    public final int hashCode() {
        return this.f285735a.hashCode();
    }
}
