package b4g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12362b;

    public s(String bookingId, String str) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        this.f12361a = bookingId;
        this.f12362b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f12361a, sVar.f12361a) && Intrinsics.f(this.f12362b, sVar.f12362b);
    }

    public final int hashCode() {
        int iHashCode = this.f12361a.hashCode() * 31;
        String str = this.f12362b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
