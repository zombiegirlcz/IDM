package o6g;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import m7g.j;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends cam.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f222602c;
    public final LocalDate d;
    public final LocalDate e;
    public final LocalDate f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String passengerRef, j travellerType, LocalDate flightDate, LocalDate localDate, LocalDate localDate2) {
        super(p7g.b.DATE_OF_BIRTH, false);
        Intrinsics.checkNotNullParameter(passengerRef, "passengerRef");
        Intrinsics.checkNotNullParameter(travellerType, "travellerType");
        Intrinsics.checkNotNullParameter(flightDate, "flightDate");
        this.f222601b = passengerRef;
        this.f222602c = travellerType;
        this.d = flightDate;
        this.e = localDate;
        this.f = localDate2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f222601b, gVar.f222601b) && this.f222602c == gVar.f222602c && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        int iA = y.a((this.f222602c.hashCode() + (this.f222601b.hashCode() * 31)) * 31, 31, this.d);
        LocalDate localDate = this.e;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }

    @Override // cam.f
    public final String o() {
        return this.f222601b;
    }
}
