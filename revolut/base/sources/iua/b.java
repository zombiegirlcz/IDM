package iua;

import aii.r;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f168541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hua.c f168542b;

    public b(LocalDate selectedDate, hua.c selectedPeriod) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        this.f168541a = selectedDate;
        this.f168542b = selectedPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f168541a, bVar.f168541a) && this.f168542b == bVar.f168542b;
    }

    public final int hashCode() {
        return this.f168542b.hashCode() + (this.f168541a.hashCode() * 31);
    }
}
