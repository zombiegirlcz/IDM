package dgi;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f114684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f114685b;

    public e(LocalDate localDate, LocalDate localDate2) {
        this.f114684a = localDate;
        this.f114685b = localDate2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f114684a, eVar.f114684a) && Intrinsics.f(this.f114685b, eVar.f114685b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f114684a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.f114685b;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }
}
