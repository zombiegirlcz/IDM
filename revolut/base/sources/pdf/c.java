package pdf;

import aii.r;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f235170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sel.a f235171b;

    public c(LocalDate startDate, sel.a period) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f235170a = startDate;
        this.f235171b = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f235170a, cVar.f235170a) && this.f235171b == cVar.f235171b;
    }

    public final int hashCode() {
        return this.f235171b.hashCode() + (this.f235170a.hashCode() * 31);
    }
}
