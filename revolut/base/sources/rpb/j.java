package rpb;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f256324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f256325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ejb.e f256326c;

    public j(LocalDate startDate, LocalDate endDate, ejb.e balanceStatistic) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(balanceStatistic, "balanceStatistic");
        this.f256324a = startDate;
        this.f256325b = endDate;
        this.f256326c = balanceStatistic;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f256324a, jVar.f256324a) && Intrinsics.f(this.f256325b, jVar.f256325b) && Intrinsics.f(this.f256326c, jVar.f256326c);
    }

    public final int hashCode() {
        return this.f256326c.hashCode() + wp5.y.a(this.f256324a.hashCode() * 31, 31, this.f256325b);
    }
}
