package jel;

import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f173434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f173435b;

    public d2(ArrayList chart, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        this.f173434a = chart;
        this.f173435b = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj2;
        return this.f173434a.equals(d2Var.f173434a) && Intrinsics.f(this.f173435b, d2Var.f173435b);
    }

    public final int hashCode() {
        int iHashCode = this.f173434a.hashCode() * 31;
        BigDecimal bigDecimal = this.f173435b;
        return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }
}
