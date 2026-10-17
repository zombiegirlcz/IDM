package w50;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f294651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f294652b;

    public b(LocalDate currentDate, List availableDateRanges) {
        Intrinsics.checkNotNullParameter(availableDateRanges, "availableDateRanges");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        this.f294651a = availableDateRanges;
        this.f294652b = currentDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f294651a, bVar.f294651a) && Intrinsics.f(this.f294652b, bVar.f294652b);
    }

    public final int hashCode() {
        return this.f294652b.hashCode() + (this.f294651a.hashCode() * 31);
    }
}
