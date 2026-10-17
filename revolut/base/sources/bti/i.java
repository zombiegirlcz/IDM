package bti;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f18608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f18609c;
    public final String d;
    public final String e;

    public i(String bookingSlotId, List passengers, k kVar, String str, String str2) {
        Intrinsics.checkNotNullParameter(bookingSlotId, "bookingSlotId");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        this.f18607a = bookingSlotId;
        this.f18608b = passengers;
        this.f18609c = kVar;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f18607a, iVar.f18607a) && Intrinsics.f(this.f18608b, iVar.f18608b) && Intrinsics.f(this.f18609c, iVar.f18609c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f18607a.hashCode() * 31, 31, this.f18608b);
        k kVar = this.f18609c;
        int iHashCode = (iD + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
