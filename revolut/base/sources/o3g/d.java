package o3g;

import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vim.e f221804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Date f221805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f221806c;
    public final Date d;
    public final vim.d e;
    public final List f;

    public d(vim.e calendarDatesRange, Date firstSelectableDate, Date lastSelectableDate, Date currentDate, vim.e eVar, List list) {
        Intrinsics.checkNotNullParameter(calendarDatesRange, "calendarDatesRange");
        Intrinsics.checkNotNullParameter(firstSelectableDate, "firstSelectableDate");
        Intrinsics.checkNotNullParameter(lastSelectableDate, "lastSelectableDate");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        this.f221804a = calendarDatesRange;
        this.f221805b = firstSelectableDate;
        this.f221806c = lastSelectableDate;
        this.d = currentDate;
        this.e = eVar;
        this.f = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f221804a.equals(dVar.f221804a) && Intrinsics.f(this.f221805b, dVar.f221805b) && Intrinsics.f(this.f221806c, dVar.f221806c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iE = t61.a.e(this.d, t61.a.e(this.f221806c, t61.a.e(this.f221805b, this.f221804a.hashCode() * 31, 31), 31), 31);
        vim.d dVar = this.e;
        int iHashCode = (iE + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List list = this.f;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
