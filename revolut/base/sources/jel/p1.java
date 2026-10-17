package jel;

import java.math.BigDecimal;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f173534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f173535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u1 f173536c;
    public final BigDecimal d;
    public final LocalDate e;
    public final e2 f;

    public p1(BigDecimal bigDecimal, BigDecimal bigDecimal2, u1 u1Var, BigDecimal bigDecimal3, LocalDate localDate, e2 e2Var) {
        this.f173534a = bigDecimal;
        this.f173535b = bigDecimal2;
        this.f173536c = u1Var;
        this.d = bigDecimal3;
        this.e = localDate;
        this.f = e2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj2;
        return Intrinsics.f(this.f173534a, p1Var.f173534a) && Intrinsics.f(this.f173535b, p1Var.f173535b) && this.f173536c == p1Var.f173536c && Intrinsics.f(this.d, p1Var.d) && Intrinsics.f(this.e, p1Var.e) && this.f == p1Var.f;
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f173534a;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.f173535b;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        u1 u1Var = this.f173536c;
        int iHashCode3 = (iHashCode2 + (u1Var == null ? 0 : u1Var.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.d;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        LocalDate localDate = this.e;
        int iHashCode5 = (iHashCode4 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        e2 e2Var = this.f;
        return iHashCode5 + (e2Var != null ? e2Var.hashCode() : 0);
    }
}
