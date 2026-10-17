package avi;

import aii.r;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f10043a;

    public d(LocalDate selectedFlightDate) {
        Intrinsics.checkNotNullParameter(selectedFlightDate, "selectedFlightDate");
        this.f10043a = selectedFlightDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f10043a, ((d) obj2).f10043a);
    }

    public final int hashCode() {
        return this.f10043a.hashCode();
    }
}
