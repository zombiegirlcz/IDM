package yfi;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f313463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f313464c;
    public final LocalDate d;
    public final String e;

    public a(String propertyId, Boolean bool, LocalDate localDate, LocalDate localDate2, String str) {
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        this.f313462a = propertyId;
        this.f313463b = bool;
        this.f313464c = localDate;
        this.d = localDate2;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f313462a, aVar.f313462a) && Intrinsics.f(this.f313463b, aVar.f313463b) && Intrinsics.f(this.f313464c, aVar.f313464c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f313462a.hashCode() * 31;
        Boolean bool = this.f313463b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        LocalDate localDate = this.f313464c;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.d;
        int iHashCode4 = (iHashCode3 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        String str = this.e;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }
}
