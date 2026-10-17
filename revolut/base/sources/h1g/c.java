package h1g;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148555a;

    public c(String bookingId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        this.f148555a = bookingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f148555a, ((c) obj2).f148555a);
    }

    public final int hashCode() {
        return this.f148555a.hashCode();
    }
}
