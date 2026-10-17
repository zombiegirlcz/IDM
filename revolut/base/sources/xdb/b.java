package xdb;

import java.time.LocalTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f304382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f304383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f304384c;
    public final List d;
    public final List e;
    public final LocalTime f;

    public b(List calendar, List availableTimes, List timeSlots, List alternatives, LocalTime localTime) {
        f0 fullDaySlots = f0.f322471a;
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(fullDaySlots, "fullDaySlots");
        Intrinsics.checkNotNullParameter(availableTimes, "availableTimes");
        Intrinsics.checkNotNullParameter(timeSlots, "timeSlots");
        Intrinsics.checkNotNullParameter(alternatives, "alternatives");
        this.f304382a = calendar;
        this.f304383b = fullDaySlots;
        this.f304384c = availableTimes;
        this.d = timeSlots;
        this.e = alternatives;
        this.f = localTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f304382a, bVar.f304382a) && Intrinsics.f(this.f304383b, bVar.f304383b) && Intrinsics.f(this.f304384c, bVar.f304384c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(p.a.d(p.a.d(this.f304382a.hashCode() * 31, 31, this.f304383b), 31, this.f304384c), 31, this.d), 31, this.e);
        LocalTime localTime = this.f;
        return iD + (localTime == null ? 0 : localTime.hashCode());
    }
}
