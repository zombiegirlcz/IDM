package ech;

import java.time.LocalDate;
import k4l.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f124740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f124741b;

    public i(LocalDate startDate, c0 period) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f124740a = startDate;
        this.f124741b = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f124740a, iVar.f124740a) && this.f124741b == iVar.f124741b;
    }

    public final int hashCode() {
        return this.f124741b.hashCode() + (this.f124740a.hashCode() * 31);
    }
}
