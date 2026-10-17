package mlk;

import java.time.Period;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f207031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Period f207032b;

    public w(Date date, Period period) {
        this.f207031a = date;
        this.f207032b = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f207031a, wVar.f207031a) && Intrinsics.f(this.f207032b, wVar.f207032b);
    }

    public final int hashCode() {
        Date date = this.f207031a;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Period period = this.f207032b;
        return iHashCode + (period != null ? period.hashCode() : 0);
    }
}
