package p1g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f231922a;

    public f(String bookingId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        this.f231922a = bookingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f231922a, ((f) obj2).f231922a);
    }

    public final int hashCode() {
        return this.f231922a.hashCode();
    }
}
