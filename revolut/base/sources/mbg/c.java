package mbg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204209a;

    public c(String bookingId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        this.f204209a = bookingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f204209a, ((c) obj2).f204209a);
    }

    public final int hashCode() {
        return this.f204209a.hashCode();
    }
}
