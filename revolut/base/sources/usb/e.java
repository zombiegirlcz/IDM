package usb;

import java.time.LocalDate;
import k4l.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f282868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f282869b;

    public e(LocalDate startDate, c0 period) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f282868a = period;
        this.f282869b = startDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f282868a == eVar.f282868a && Intrinsics.f(this.f282869b, eVar.f282869b);
    }

    public final int hashCode() {
        return this.f282869b.hashCode() + (this.f282868a.hashCode() * 31);
    }
}
