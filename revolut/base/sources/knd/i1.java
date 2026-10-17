package knd;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f186094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f186095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f186096c;

    public i1(List allIntervals, List currentIntervals, LocalDate startDate) {
        Intrinsics.checkNotNullParameter(allIntervals, "allIntervals");
        Intrinsics.checkNotNullParameter(currentIntervals, "currentIntervals");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f186094a = allIntervals;
        this.f186095b = currentIntervals;
        this.f186096c = startDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj2;
        return Intrinsics.f(this.f186094a, i1Var.f186094a) && Intrinsics.f(this.f186095b, i1Var.f186095b) && Intrinsics.f(this.f186096c, i1Var.f186096c);
    }

    public final int hashCode() {
        return this.f186096c.hashCode() + p.a.d(this.f186094a.hashCode() * 31, 31, this.f186095b);
    }
}
