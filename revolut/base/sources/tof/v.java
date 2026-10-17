package tof;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f273110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f273111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f273112c;
    public final String d;

    public v(w type, List relatedTransactionGroupIds, LocalDate localDate, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(relatedTransactionGroupIds, "relatedTransactionGroupIds");
        this.f273110a = type;
        this.f273111b = relatedTransactionGroupIds;
        this.f273112c = localDate;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f273110a == vVar.f273110a && Intrinsics.f(this.f273111b, vVar.f273111b) && Intrinsics.f(this.f273112c, vVar.f273112c) && Intrinsics.f(this.d, vVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f273110a.hashCode() * 31, 31, this.f273111b);
        LocalDate localDate = this.f273112c;
        int iHashCode = (iD + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
