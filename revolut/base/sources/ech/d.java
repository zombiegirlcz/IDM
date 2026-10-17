package ech;

import java.time.LocalDate;
import k4l.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f124736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f124737b;

    public d(LocalDate startDate, c0 period) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f124736a = startDate;
        this.f124737b = period;
    }

    public static d a(d dVar, LocalDate startDate, c0 period, int i) {
        if ((i & 1) != 0) {
            startDate = dVar.f124736a;
        }
        if ((i & 2) != 0) {
            period = dVar.f124737b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(period, "period");
        return new d(startDate, period);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f124736a, dVar.f124736a) && this.f124737b == dVar.f124737b;
    }

    public final int hashCode() {
        return this.f124737b.hashCode() + (this.f124736a.hashCode() * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d() {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        this(localDateNow, c0.MONTH);
    }
}
