package ql4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f247153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f247154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f247155c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f247156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f247157h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDate f247158j;
    public final LocalDate k;

    public p(dj0.d totalPlanAmount, dj0.d totalPrincipalAmount, dj0.d totalInterestAmount, int i, int i2, int i3, dj0.d dVar, dj0.d dVar2, dj0.d dVar3, LocalDate localDate, LocalDate localDate2) {
        Intrinsics.checkNotNullParameter(totalPlanAmount, "totalPlanAmount");
        Intrinsics.checkNotNullParameter(totalPrincipalAmount, "totalPrincipalAmount");
        Intrinsics.checkNotNullParameter(totalInterestAmount, "totalInterestAmount");
        this.f247153a = totalPlanAmount;
        this.f247154b = totalPrincipalAmount;
        this.f247155c = totalInterestAmount;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.f247156g = dVar;
        this.f247157h = dVar2;
        this.i = dVar3;
        this.f247158j = localDate;
        this.k = localDate2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f247153a, pVar.f247153a) && Intrinsics.f(this.f247154b, pVar.f247154b) && Intrinsics.f(this.f247155c, pVar.f247155c) && this.d == pVar.d && this.e == pVar.e && this.f == pVar.f && Intrinsics.f(this.f247156g, pVar.f247156g) && Intrinsics.f(this.f247157h, pVar.f247157h) && Intrinsics.f(this.i, pVar.i) && Intrinsics.f(this.f247158j, pVar.f247158j) && Intrinsics.f(this.k, pVar.k);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, v7.c(v7.c(this.f247153a.hashCode() * 31, 31, this.f247154b), 31, this.f247155c), 31), 31), 31);
        dj0.d dVar = this.f247156g;
        int iHashCode = (iB + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f247157h;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        LocalDate localDate = this.f247158j;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.k;
        return iHashCode4 + (localDate2 != null ? localDate2.hashCode() : 0);
    }
}
