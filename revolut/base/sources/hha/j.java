package hha;

import java.time.LocalDate;
import java.time.Period;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f152316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f152318c;
    public final Period d;
    public final Period e;

    public j(k type, String pricingPlanId, LocalDate localDate, Period totalPeriod, Period period) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
        Intrinsics.checkNotNullParameter(totalPeriod, "totalPeriod");
        this.f152316a = type;
        this.f152317b = pricingPlanId;
        this.f152318c = localDate;
        this.d = totalPeriod;
        this.e = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f152316a == jVar.f152316a && Intrinsics.f(this.f152317b, jVar.f152317b) && Intrinsics.f(this.f152318c, jVar.f152318c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f152316a.hashCode() * 31, 31, this.f152317b);
        LocalDate localDate = this.f152318c;
        int iHashCode = (this.d.hashCode() + ((iC + (localDate == null ? 0 : localDate.hashCode())) * 31)) * 31;
        Period period = this.e;
        return iHashCode + (period != null ? period.hashCode() : 0);
    }
}
