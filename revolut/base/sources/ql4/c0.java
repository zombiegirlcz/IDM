package ql4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f247095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f247096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f247097c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f247098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f247099h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDate f247100j;
    public final LocalDate k;

    public c0(dj0.d totalPlanAmount, dj0.d totalPrincipalAmount, dj0.d totalInterestAmount, int i, int i2, int i3, dj0.d dVar, dj0.d dVar2, dj0.d dVar3, LocalDate localDate, LocalDate localDate2) {
        Intrinsics.checkNotNullParameter(totalPlanAmount, "totalPlanAmount");
        Intrinsics.checkNotNullParameter(totalPrincipalAmount, "totalPrincipalAmount");
        Intrinsics.checkNotNullParameter(totalInterestAmount, "totalInterestAmount");
        this.f247095a = totalPlanAmount;
        this.f247096b = totalPrincipalAmount;
        this.f247097c = totalInterestAmount;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.f247098g = dVar;
        this.f247099h = dVar2;
        this.i = dVar3;
        this.f247100j = localDate;
        this.k = localDate2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f247095a, c0Var.f247095a) && Intrinsics.f(this.f247096b, c0Var.f247096b) && Intrinsics.f(this.f247097c, c0Var.f247097c) && this.d == c0Var.d && this.e == c0Var.e && this.f == c0Var.f && Intrinsics.f(this.f247098g, c0Var.f247098g) && Intrinsics.f(this.f247099h, c0Var.f247099h) && Intrinsics.f(this.i, c0Var.i) && Intrinsics.f(this.f247100j, c0Var.f247100j) && Intrinsics.f(this.k, c0Var.k);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, v7.c(v7.c(this.f247095a.hashCode() * 31, 31, this.f247096b), 31, this.f247097c), 31), 31), 31);
        dj0.d dVar = this.f247098g;
        int iHashCode = (iB + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f247099h;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.i;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        LocalDate localDate = this.f247100j;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.k;
        return iHashCode4 + (localDate2 != null ? localDate2.hashCode() : 0);
    }
}
