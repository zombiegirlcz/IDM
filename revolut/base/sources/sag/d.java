package sag;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f261399a;

    public d(String bookingId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        this.f261399a = bookingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f261399a, ((d) obj2).f261399a);
    }

    public final int hashCode() {
        return this.f261399a.hashCode();
    }
}
