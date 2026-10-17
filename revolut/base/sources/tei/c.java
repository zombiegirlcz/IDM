package tei;

import kotlin.jvm.internal.Intrinsics;
import rei.u;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f270109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f270110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f270111c;
    public final String d;
    public final String e;

    public c(String occupancy, String bookingToken, u guestName, String str, String str2) {
        Intrinsics.checkNotNullParameter(occupancy, "occupancy");
        Intrinsics.checkNotNullParameter(bookingToken, "bookingToken");
        Intrinsics.checkNotNullParameter(guestName, "guestName");
        this.f270109a = occupancy;
        this.f270110b = bookingToken;
        this.f270111c = guestName;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f270109a, cVar.f270109a) && Intrinsics.f(this.f270110b, cVar.f270110b) && Intrinsics.f(this.f270111c, cVar.f270111c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f270111c.hashCode() + p.a.c(this.f270109a.hashCode() * 31, 31, this.f270110b)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
