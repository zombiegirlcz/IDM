package zod;

import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lzi.i f324021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f324022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f324023c;
    public final AnalyticsSpendingPeriod$Interval d;
    public final ind.a0 e;
    public final ind.a0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f324024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f324025h;
    public final e0 i;

    public q(lzi.i periodType, long j2, AnalyticsSpendingPeriod$Interval currentInterval, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, ind.a0 a0Var, ind.a0 a0Var2, dj0.d dVar, dj0.d dVar2, e0 e0Var) {
        Intrinsics.checkNotNullParameter(periodType, "periodType");
        Intrinsics.checkNotNullParameter(currentInterval, "currentInterval");
        this.f324021a = periodType;
        this.f324022b = j2;
        this.f324023c = currentInterval;
        this.d = analyticsSpendingPeriod$Interval;
        this.e = a0Var;
        this.f = a0Var2;
        this.f324024g = dVar;
        this.f324025h = dVar2;
        this.i = e0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f324021a == qVar.f324021a && this.f324022b == qVar.f324022b && Intrinsics.f(this.f324023c, qVar.f324023c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f324024g, qVar.f324024g) && Intrinsics.f(this.f324025h, qVar.f324025h) && Intrinsics.f(this.i, qVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f324023c.hashCode() + a0.d.c(this.f324021a.hashCode() * 31, 31, this.f324022b)) * 31;
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = this.d;
        int iHashCode2 = (iHashCode + (analyticsSpendingPeriod$Interval == null ? 0 : analyticsSpendingPeriod$Interval.hashCode())) * 31;
        ind.a0 a0Var = this.e;
        int iHashCode3 = (iHashCode2 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        ind.a0 a0Var2 = this.f;
        int iHashCode4 = (iHashCode3 + (a0Var2 == null ? 0 : a0Var2.hashCode())) * 31;
        dj0.d dVar = this.f324024g;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.f324025h;
        int iHashCode6 = (iHashCode5 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        e0 e0Var = this.i;
        return iHashCode6 + (e0Var != null ? e0Var.hashCode() : 0);
    }
}
