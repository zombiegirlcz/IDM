package jeb;

import cli.o;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vim.e f173251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vim.e f173252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f173253c;
    public final Date d;
    public final Date e;
    public final ArrayList f;

    public c(vim.e calendarDatesRange, vim.e selectedDatesRange, Date selectableDatesStart, Date selectableDatesEnd, Date currentDate, ArrayList availableDates) {
        Intrinsics.checkNotNullParameter(calendarDatesRange, "calendarDatesRange");
        Intrinsics.checkNotNullParameter(selectedDatesRange, "selectedDatesRange");
        Intrinsics.checkNotNullParameter(selectableDatesStart, "selectableDatesStart");
        Intrinsics.checkNotNullParameter(selectableDatesEnd, "selectableDatesEnd");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(availableDates, "availableDates");
        this.f173251a = calendarDatesRange;
        this.f173252b = selectedDatesRange;
        this.f173253c = selectableDatesStart;
        this.d = selectableDatesEnd;
        this.e = currentDate;
        this.f = availableDates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f173251a.equals(cVar.f173251a) && this.f173252b.equals(cVar.f173252b) && Intrinsics.f(this.f173253c, cVar.f173253c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && this.f.equals(cVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + t61.a.e(this.e, t61.a.e(this.d, t61.a.e(this.f173253c, (this.f173252b.hashCode() + (this.f173251a.hashCode() * 31)) * 31, 31), 31), 31);
    }
}
