package kia;

import java.time.LocalDate;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f184190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f184191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f184192c;
    public final String d;
    public final Set e;

    public b(LocalDate startDate, LocalDate endDate, a period, String timezoneId, Set set) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(timezoneId, "timezoneId");
        this.f184190a = startDate;
        this.f184191b = endDate;
        this.f184192c = period;
        this.d = timezoneId;
        this.e = set;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f184190a, bVar.f184190a) && Intrinsics.f(this.f184191b, bVar.f184191b) && this.f184192c == bVar.f184192c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f184192c.hashCode() + y.a(this.f184190a.hashCode() * 31, 31, this.f184191b)) * 31, 31, this.d);
        Set set = this.e;
        return iC + (set == null ? 0 : set.hashCode());
    }
}
