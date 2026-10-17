package ll4;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f196530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f196531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f196532c;
    public final a0 d;
    public final q e;
    public final List f;

    public r(double d, double d5, Double d6, a0 a0Var, q rates, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f196530a = d;
        this.f196531b = d5;
        this.f196532c = d6;
        this.d = a0Var;
        this.e = rates;
        this.f = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Double.compare(this.f196530a, rVar.f196530a) == 0 && Double.compare(this.f196531b, rVar.f196531b) == 0 && Intrinsics.f(this.f196532c, rVar.f196532c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f);
    }

    public final int hashCode() {
        int iC = m72.b.c(Double.hashCode(this.f196530a) * 31, this.f196531b, 31);
        Double d = this.f196532c;
        int iHashCode = (iC + (d == null ? 0 : d.hashCode())) * 31;
        a0 a0Var = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (a0Var == null ? 0 : a0Var.hashCode())) * 31)) * 31;
        List list = this.f;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
