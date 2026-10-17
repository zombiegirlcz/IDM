package w50;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f294670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f294671b;

    public q(LocalDate currentDate, List availableDateRanges) {
        Intrinsics.checkNotNullParameter(availableDateRanges, "availableDateRanges");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        this.f294670a = availableDateRanges;
        this.f294671b = currentDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f294670a, qVar.f294670a) && Intrinsics.f(this.f294671b, qVar.f294671b);
    }

    public final int hashCode() {
        return this.f294671b.hashCode() + (this.f294670a.hashCode() * 31);
    }
}
