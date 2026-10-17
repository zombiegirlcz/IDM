package kac;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182454a;

    public b(String bookingReference) {
        Intrinsics.checkNotNullParameter(bookingReference, "bookingReference");
        this.f182454a = bookingReference;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f182454a, ((b) obj2).f182454a);
    }

    public final int hashCode() {
        return this.f182454a.hashCode();
    }
}
