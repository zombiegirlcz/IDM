package jel;

import java.math.BigDecimal;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f173557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f173558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1 f173559c;
    public final BigDecimal d;
    public final LocalDate e;
    public final e2 f;

    public r1(BigDecimal bigDecimal, u1 u1Var, s1 s1Var, BigDecimal bigDecimal2, LocalDate localDate, e2 e2Var) {
        this.f173557a = bigDecimal;
        this.f173558b = u1Var;
        this.f173559c = s1Var;
        this.d = bigDecimal2;
        this.e = localDate;
        this.f = e2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj2;
        return Intrinsics.f(this.f173557a, r1Var.f173557a) && this.f173558b == r1Var.f173558b && this.f173559c == r1Var.f173559c && Intrinsics.f(this.d, r1Var.d) && Intrinsics.f(this.e, r1Var.e) && this.f == r1Var.f;
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f173557a;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        u1 u1Var = this.f173558b;
        int iHashCode2 = (iHashCode + (u1Var == null ? 0 : u1Var.hashCode())) * 31;
        s1 s1Var = this.f173559c;
        int iHashCode3 = (iHashCode2 + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.d;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        LocalDate localDate = this.e;
        int iHashCode5 = (iHashCode4 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        e2 e2Var = this.f;
        return iHashCode5 + (e2Var != null ? e2Var.hashCode() : 0);
    }
}
