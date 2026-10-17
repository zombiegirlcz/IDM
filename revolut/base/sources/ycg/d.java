package ycg;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vim.d f312613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vim.d f312614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f312615c;
    public final LocalDate d;

    public d(vim.d calendarDatesRange, vim.d dVar, LocalDate selectableDatesStart, LocalDate currentDate) {
        Intrinsics.checkNotNullParameter(calendarDatesRange, "calendarDatesRange");
        Intrinsics.checkNotNullParameter(selectableDatesStart, "selectableDatesStart");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        this.f312613a = calendarDatesRange;
        this.f312614b = dVar;
        this.f312615c = selectableDatesStart;
        this.d = currentDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f312613a, dVar.f312613a) && Intrinsics.f(this.f312614b, dVar.f312614b) && Intrinsics.f(this.f312615c, dVar.f312615c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f312613a.hashCode() * 31;
        vim.d dVar = this.f312614b;
        return this.d.hashCode() + y.a((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f312615c);
    }
}
