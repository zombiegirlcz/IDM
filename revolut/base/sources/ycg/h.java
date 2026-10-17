package ycg;

import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vim.e f312618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vim.d f312619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f312620c;
    public final Date d;
    public final Date e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f312621g;

    public h(vim.e calendarDatesRange, vim.e eVar, Date date, Date date2, Date currentDate, boolean z, Clause clause) {
        Intrinsics.checkNotNullParameter(calendarDatesRange, "calendarDatesRange");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        this.f312618a = calendarDatesRange;
        this.f312619b = eVar;
        this.f312620c = date;
        this.d = date2;
        this.e = currentDate;
        this.f = z;
        this.f312621g = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f312618a.equals(hVar.f312618a) && Intrinsics.f(this.f312619b, hVar.f312619b) && Intrinsics.f(this.f312620c, hVar.f312620c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && this.f == hVar.f && Intrinsics.f(this.f312621g, hVar.f312621g);
    }

    public final int hashCode() {
        int iHashCode = this.f312618a.hashCode() * 31;
        vim.d dVar = this.f312619b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Date date = this.f312620c;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.d;
        int iC = j6.a.c(t61.a.e(this.e, (iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31, 961), 31, this.f);
        Object obj2 = this.f312621g;
        return iC + (obj2 != null ? obj2.hashCode() : 0);
    }
}
