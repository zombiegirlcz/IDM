package o5l;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f222455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f222456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f222457c;
    public final LocalDate d;

    public d(LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4) {
        this.f222455a = localDate;
        this.f222456b = localDate2;
        this.f222457c = localDate3;
        this.d = localDate4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f222455a, dVar.f222455a) && Intrinsics.f(this.f222456b, dVar.f222456b) && Intrinsics.f(this.f222457c, dVar.f222457c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        LocalDate localDate = this.f222455a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.f222456b;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.f222457c;
        int iHashCode3 = (iHashCode2 + (localDate3 == null ? 0 : localDate3.hashCode())) * 31;
        LocalDate localDate4 = this.d;
        return iHashCode3 + (localDate4 != null ? localDate4.hashCode() : 0);
    }
}
