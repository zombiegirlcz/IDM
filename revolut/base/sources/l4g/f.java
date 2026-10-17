package l4g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192112a;

    public f(String bookingId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        this.f192112a = bookingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f192112a, ((f) obj2).f192112a);
    }

    public final int hashCode() {
        return this.f192112a.hashCode();
    }
}
