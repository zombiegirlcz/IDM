package gcg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f142461a;

    public m(String bookingId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        this.f142461a = bookingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f142461a, ((m) obj2).f142461a);
    }

    public final int hashCode() {
        return this.f142461a.hashCode();
    }
}
