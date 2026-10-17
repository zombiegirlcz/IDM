package iod;

import aii.r;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f163223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f163224b;

    public b(LocalDate startDate, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f163223a = startDate;
        this.f163224b = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f163223a, bVar.f163223a) && Intrinsics.f(this.f163224b, bVar.f163224b);
    }

    public final int hashCode() {
        int iHashCode = this.f163223a.hashCode() * 31;
        LocalDate localDate = this.f163224b;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }
}
