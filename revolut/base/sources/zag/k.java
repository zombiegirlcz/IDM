package zag;

import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vim.e f320698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vim.d f320699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Date f320700c;
    public final Date d;
    public final Date e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f320701g;

    public k(vim.e calendarDatesRange, vim.e eVar, Date date, Date date2, Date currentDate, boolean z, Clause clause) {
        Intrinsics.checkNotNullParameter(calendarDatesRange, "calendarDatesRange");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        this.f320698a = calendarDatesRange;
        this.f320699b = eVar;
        this.f320700c = date;
        this.d = date2;
        this.e = currentDate;
        this.f = z;
        this.f320701g = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f320698a.equals(kVar.f320698a) && Intrinsics.f(this.f320699b, kVar.f320699b) && Intrinsics.f(this.f320700c, kVar.f320700c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && this.f == kVar.f && Intrinsics.f(this.f320701g, kVar.f320701g);
    }

    public final int hashCode() {
        int iHashCode = this.f320698a.hashCode() * 31;
        vim.d dVar = this.f320699b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Date date = this.f320700c;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.d;
        int iC = j6.a.c(t61.a.e(this.e, (iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31, 961), 31, this.f);
        Object obj2 = this.f320701g;
        return iC + (obj2 != null ? obj2.hashCode() : 0);
    }
}
