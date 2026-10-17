package ebg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124338a;

    public f(String bookingId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        this.f124338a = bookingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f124338a, ((f) obj2).f124338a);
    }

    public final int hashCode() {
        return this.f124338a.hashCode();
    }
}
