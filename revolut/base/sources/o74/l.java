package o74;

import aii.r;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f222712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222713b;

    public l(String selectedPeriodId, LocalDate selectedDate) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(selectedPeriodId, "selectedPeriodId");
        this.f222712a = selectedDate;
        this.f222713b = selectedPeriodId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f222712a, lVar.f222712a) && Intrinsics.f(this.f222713b, lVar.f222713b);
    }

    public final int hashCode() {
        return this.f222713b.hashCode() + (this.f222712a.hashCode() * 31);
    }
}
