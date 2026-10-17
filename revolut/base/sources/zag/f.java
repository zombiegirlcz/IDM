package zag;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320691a;

    public f(String bookingId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        this.f320691a = bookingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f320691a, ((f) obj2).f320691a);
    }

    public final int hashCode() {
        return this.f320691a.hashCode();
    }
}
