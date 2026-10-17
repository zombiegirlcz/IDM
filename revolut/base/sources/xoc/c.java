package xoc;

import dj0.d;
import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f307788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f307789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f307790c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final int f;

    public c(d initialContribution, d monthlyPayment, BigDecimal bigDecimal, BigDecimal percentile50, BigDecimal bigDecimal2, int i) {
        Intrinsics.checkNotNullParameter(initialContribution, "initialContribution");
        Intrinsics.checkNotNullParameter(monthlyPayment, "monthlyPayment");
        Intrinsics.checkNotNullParameter(percentile50, "percentile50");
        this.f307788a = initialContribution;
        this.f307789b = monthlyPayment;
        this.f307790c = bigDecimal;
        this.d = percentile50;
        this.e = bigDecimal2;
        this.f = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f307788a, cVar.f307788a) && Intrinsics.f(this.f307789b, cVar.f307789b) && Intrinsics.f(this.f307790c, cVar.f307790c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && this.f == cVar.f;
    }

    public final int hashCode() {
        int iC = v7.c(this.f307788a.hashCode() * 31, 31, this.f307789b);
        BigDecimal bigDecimal = this.f307790c;
        int iD = t61.a.d(this.d, (iC + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31);
        BigDecimal bigDecimal2 = this.e;
        return Integer.hashCode(this.f) + ((iD + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0)) * 31);
    }
}
