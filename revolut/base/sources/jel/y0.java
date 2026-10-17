package jel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f173607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173608b;

    public y0(String str, BigDecimal bigDecimal) {
        this.f173607a = bigDecimal;
        this.f173608b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f173607a, y0Var.f173607a) && Intrinsics.f(this.f173608b, y0Var.f173608b);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f173607a;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.f173608b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
