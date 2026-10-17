package x1g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302427a;

    public j(String bookingId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        this.f302427a = bookingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f302427a, ((j) obj2).f302427a);
    }

    public final int hashCode() {
        return this.f302427a.hashCode();
    }
}
