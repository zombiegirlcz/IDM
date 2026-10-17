package a10;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f447b;

    public d(LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f446a = startDate;
        this.f447b = endDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f446a, dVar.f446a) && Intrinsics.f(this.f447b, dVar.f447b);
    }

    public final int hashCode() {
        return this.f447b.hashCode() + (this.f446a.hashCode() * 31);
    }
}
