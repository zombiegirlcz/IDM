package vrf;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f291581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f291582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f291583c;

    public c(dj0.d monthlyRepayment, LocalDate localDate, LocalDate localDate2) {
        Intrinsics.checkNotNullParameter(monthlyRepayment, "monthlyRepayment");
        this.f291581a = monthlyRepayment;
        this.f291582b = localDate;
        this.f291583c = localDate2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f291581a, cVar.f291581a) && Intrinsics.f(this.f291582b, cVar.f291582b) && Intrinsics.f(this.f291583c, cVar.f291583c);
    }

    public final int hashCode() {
        int iHashCode = this.f291581a.hashCode() * 31;
        LocalDate localDate = this.f291582b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f291583c;
        return iHashCode2 + (localDate2 != null ? localDate2.hashCode() : 0);
    }
}
