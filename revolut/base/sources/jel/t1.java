package jel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f173566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f173567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f173568c;
    public final BigDecimal d;
    public final e2 e;

    public t1(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, e2 e2Var) {
        this.f173566a = bigDecimal;
        this.f173567b = bigDecimal2;
        this.f173568c = bigDecimal3;
        this.d = bigDecimal4;
        this.e = e2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj2;
        return Intrinsics.f(this.f173566a, t1Var.f173566a) && Intrinsics.f(this.f173567b, t1Var.f173567b) && Intrinsics.f(this.f173568c, t1Var.f173568c) && Intrinsics.f(this.d, t1Var.d) && this.e == t1Var.e;
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f173566a;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.f173567b;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f173568c;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.d;
        int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        e2 e2Var = this.e;
        return iHashCode4 + (e2Var != null ? e2Var.hashCode() : 0);
    }
}
