package jvj;

import aii.r;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f178891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f178892b;

    public d(LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f178891a = startDate;
        this.f178892b = endDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f178891a, dVar.f178891a) && Intrinsics.f(this.f178892b, dVar.f178892b);
    }

    public final int hashCode() {
        return this.f178892b.hashCode() + (this.f178891a.hashCode() * 31);
    }
}
