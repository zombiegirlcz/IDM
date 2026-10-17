package m1h;

import java.time.LocalDate;
import k4l.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f201499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f201500b;

    public i(LocalDate startDate, c0 period) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f201499a = startDate;
        this.f201500b = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f201499a, iVar.f201499a) && this.f201500b == iVar.f201500b;
    }

    public final int hashCode() {
        return this.f201500b.hashCode() + (this.f201499a.hashCode() * 31);
    }
}
