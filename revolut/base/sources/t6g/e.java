package t6g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268349a;

    public e(String bookingId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        this.f268349a = bookingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f268349a, ((e) obj2).f268349a);
    }

    public final int hashCode() {
        return this.f268349a.hashCode();
    }
}
