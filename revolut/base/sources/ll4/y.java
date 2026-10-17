package ll4;

import java.io.Serializable;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class y implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f196556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f196557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f196558c;
    public final long d;
    public final long e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f196559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f196560h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f196561j;
    public final LocalDate k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LocalDate f196562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f196563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f196564n;
    public final v o;

    public y(long j2, LocalDate repaymentDueDate, LocalDate statementDate, long j3, long j5, LocalDate currentDate, boolean z, long j16, long j22, Long l2, LocalDate localDate, LocalDate localDate2, Long l3, long j42, v vVar) {
        Intrinsics.checkNotNullParameter(repaymentDueDate, "repaymentDueDate");
        Intrinsics.checkNotNullParameter(statementDate, "statementDate");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        this.f196556a = j2;
        this.f196557b = repaymentDueDate;
        this.f196558c = statementDate;
        this.d = j3;
        this.e = j5;
        this.f = currentDate;
        this.f196559g = z;
        this.f196560h = j16;
        this.i = j22;
        this.f196561j = l2;
        this.k = localDate;
        this.f196562l = localDate2;
        this.f196563m = l3;
        this.f196564n = j42;
        this.o = vVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f196556a == yVar.f196556a && Intrinsics.f(this.f196557b, yVar.f196557b) && Intrinsics.f(this.f196558c, yVar.f196558c) && this.d == yVar.d && this.e == yVar.e && Intrinsics.f(this.f, yVar.f) && this.f196559g == yVar.f196559g && this.f196560h == yVar.f196560h && this.i == yVar.i && Intrinsics.f(this.f196561j, yVar.f196561j) && Intrinsics.f(this.k, yVar.k) && Intrinsics.f(this.f196562l, yVar.f196562l) && Intrinsics.f(this.f196563m, yVar.f196563m) && this.f196564n == yVar.f196564n && Intrinsics.f(this.o, yVar.o);
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(j6.a.c(wp5.y.a(a0.d.c(a0.d.c(wp5.y.a(wp5.y.a(Long.hashCode(this.f196556a) * 31, 31, this.f196557b), 31, this.f196558c), 31, this.d), 31, this.e), 31, this.f), 31, this.f196559g), 31, this.f196560h), 31, this.i);
        Long l2 = this.f196561j;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        LocalDate localDate = this.k;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f196562l;
        int iHashCode3 = (iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        Long l3 = this.f196563m;
        int iC2 = a0.d.c((iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.f196564n);
        v vVar = this.o;
        return iC2 + (vVar != null ? vVar.hashCode() : 0);
    }
}
