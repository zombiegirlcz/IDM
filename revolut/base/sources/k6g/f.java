package k6g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181714a;

    public f(String bookingId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        this.f181714a = bookingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f181714a, ((f) obj2).f181714a);
    }

    public final int hashCode() {
        return this.f181714a.hashCode();
    }
}
