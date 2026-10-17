package puj;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f239920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f239921b;

    public g(LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f239920a = startDate;
        this.f239921b = endDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f239920a, gVar.f239920a) && Intrinsics.f(this.f239921b, gVar.f239921b);
    }

    public final int hashCode() {
        return this.f239921b.hashCode() + (this.f239920a.hashCode() * 31);
    }
}
