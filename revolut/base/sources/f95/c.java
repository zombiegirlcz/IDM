package f95;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f132824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f132825c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f132826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f132827h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f132828j;
    public final LocalDate k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LocalDate f132829l;

    public c(String facilityId, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, dj0.d spentAmount, dj0.d limitAmount, String apr, dj0.d accruedChargesAmount, LocalDate localDate, LocalDate localDate2) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(spentAmount, "spentAmount");
        Intrinsics.checkNotNullParameter(limitAmount, "limitAmount");
        Intrinsics.checkNotNullParameter(apr, "apr");
        Intrinsics.checkNotNullParameter(accruedChargesAmount, "accruedChargesAmount");
        this.f132823a = facilityId;
        this.f132824b = z;
        this.f132825c = z3;
        this.d = z4;
        this.e = z6;
        this.f = z11;
        this.f132826g = spentAmount;
        this.f132827h = limitAmount;
        this.i = apr;
        this.f132828j = accruedChargesAmount;
        this.k = localDate;
        this.f132829l = localDate2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f132823a, cVar.f132823a) && this.f132824b == cVar.f132824b && this.f132825c == cVar.f132825c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && Intrinsics.f(this.f132826g, cVar.f132826g) && Intrinsics.f(this.f132827h, cVar.f132827h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f132828j, cVar.f132828j) && Intrinsics.f(this.k, cVar.k) && Intrinsics.f(this.f132829l, cVar.f132829l);
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c(v7.c(v7.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(this.f132823a.hashCode() * 31, 31, this.f132824b), 31, this.f132825c), 31, this.d), 31, this.e), 31, this.f), 31, this.f132826g), 31, this.f132827h), 31, this.i), 31, this.f132828j);
        LocalDate localDate = this.k;
        int iHashCode = (iC + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f132829l;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }
}
