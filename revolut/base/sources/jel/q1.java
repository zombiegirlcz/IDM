package jel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f173545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f173546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f173547c;
    public final e2 d;

    public q1(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, e2 e2Var) {
        this.f173545a = bigDecimal;
        this.f173546b = bigDecimal2;
        this.f173547c = bigDecimal3;
        this.d = e2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return Intrinsics.f(this.f173545a, q1Var.f173545a) && Intrinsics.f(this.f173546b, q1Var.f173546b) && Intrinsics.f(this.f173547c, q1Var.f173547c) && this.d == q1Var.d;
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f173545a;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.f173546b;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f173547c;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        e2 e2Var = this.d;
        return iHashCode3 + (e2Var != null ? e2Var.hashCode() : 0);
    }
}
