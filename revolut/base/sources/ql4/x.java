package ql4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f247188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f247189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f247190c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f247191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f247192h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDate f247193j;
    public final LocalDate k;

    public x(dj0.d totalPlanAmount, dj0.d totalPrincipalAmount, dj0.d totalInterestAmount, int i, int i2, int i3, dj0.d dVar, dj0.d dVar2, dj0.d dVar3, LocalDate localDate, LocalDate localDate2) {
        Intrinsics.checkNotNullParameter(totalPlanAmount, "totalPlanAmount");
        Intrinsics.checkNotNullParameter(totalPrincipalAmount, "totalPrincipalAmount");
        Intrinsics.checkNotNullParameter(totalInterestAmount, "totalInterestAmount");
        this.f247188a = totalPlanAmount;
        this.f247189b = totalPrincipalAmount;
        this.f247190c = totalInterestAmount;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.f247191g = dVar;
        this.f247192h = dVar2;
        this.i = dVar3;
        this.f247193j = localDate;
        this.k = localDate2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f247188a, xVar.f247188a) && Intrinsics.f(this.f247189b, xVar.f247189b) && Intrinsics.f(this.f247190c, xVar.f247190c) && this.d == xVar.d && this.e == xVar.e && this.f == xVar.f && Intrinsics.f(this.f247191g, xVar.f247191g) && Intrinsics.f(this.f247192h, xVar.f247192h) && Intrinsics.f(this.i, xVar.i) && Intrinsics.f(this.f247193j, xVar.f247193j) && Intrinsics.f(this.k, xVar.k);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, v7.c(v7.c(this.f247188a.hashCode() * 31, 31, this.f247189b), 31, this.f247190c), 31), 31), 31);
        dj0.d dVar = this.f247191g;
        int iHashCode = (iB + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f247192h;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        LocalDate localDate = this.f247193j;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.k;
        return iHashCode4 + (localDate2 != null ? localDate2.hashCode() : 0);
    }
}
