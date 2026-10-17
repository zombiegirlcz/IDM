package ycg;

import aii.r;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f312616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f312617b;

    public f(LocalDate selectedRangeStart, LocalDate selectedRangeEnd) {
        Intrinsics.checkNotNullParameter(selectedRangeStart, "selectedRangeStart");
        Intrinsics.checkNotNullParameter(selectedRangeEnd, "selectedRangeEnd");
        this.f312616a = selectedRangeStart;
        this.f312617b = selectedRangeEnd;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f312616a, fVar.f312616a) && Intrinsics.f(this.f312617b, fVar.f312617b);
    }

    public final int hashCode() {
        return this.f312617b.hashCode() + (this.f312616a.hashCode() * 31);
    }
}
