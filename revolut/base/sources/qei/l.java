package qei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f245177c;

    public l(String bookingToken, String str, k kVar) {
        Intrinsics.checkNotNullParameter(bookingToken, "bookingToken");
        this.f245175a = bookingToken;
        this.f245176b = str;
        this.f245177c = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f245175a, lVar.f245175a) && Intrinsics.f(this.f245176b, lVar.f245176b) && Intrinsics.f(this.f245177c, lVar.f245177c);
    }

    public final int hashCode() {
        int iHashCode = this.f245175a.hashCode() * 31;
        String str = this.f245176b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        k kVar = this.f245177c;
        return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }
}
