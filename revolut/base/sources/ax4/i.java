package ax4;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Date f10880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10881c;
    public final boolean d;

    public i(String listId, Date date, String rawDate, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(rawDate, "rawDate");
        this.f10879a = listId;
        this.f10880b = date;
        this.f10881c = rawDate;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f10879a, iVar.f10879a) && Intrinsics.f(this.f10880b, iVar.f10880b) && Intrinsics.f(this.f10881c, iVar.f10881c) && this.d == iVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f10879a.hashCode() * 31;
        Date date = this.f10880b;
        return Boolean.hashCode(this.d) + p.a.c((iHashCode + (date == null ? 0 : date.hashCode())) * 31, 31, this.f10881c);
    }
}
