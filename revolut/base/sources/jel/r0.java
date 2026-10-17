package jel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f173554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f173555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f173556c;

    public r0(f0 f0Var, BigDecimal bigDecimal, Boolean bool) {
        this.f173554a = f0Var;
        this.f173555b = bigDecimal;
        this.f173556c = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return this.f173554a == r0Var.f173554a && Intrinsics.f(this.f173555b, r0Var.f173555b) && Intrinsics.f(this.f173556c, r0Var.f173556c);
    }

    public final int hashCode() {
        f0 f0Var = this.f173554a;
        int iHashCode = (f0Var == null ? 0 : f0Var.hashCode()) * 31;
        BigDecimal bigDecimal = this.f173555b;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Boolean bool = this.f173556c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }
}
