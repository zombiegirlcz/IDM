package iod;

import cli.j;
import java.time.LocalDate;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f163220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f163221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f163222c;
    public final boolean d;
    public final Set e;
    public final boolean f;

    public a(LocalDate localDate, LocalDate localDate2, LocalDate presentedMonth, boolean z, Set excludedDates, boolean z3) {
        Intrinsics.checkNotNullParameter(presentedMonth, "presentedMonth");
        Intrinsics.checkNotNullParameter(excludedDates, "excludedDates");
        this.f163220a = localDate;
        this.f163221b = localDate2;
        this.f163222c = presentedMonth;
        this.d = z;
        this.e = excludedDates;
        this.f = z3;
    }

    public static a a(a aVar, LocalDate localDate, LocalDate localDate2, boolean z, int i) {
        if ((i & 2) != 0) {
            localDate2 = aVar.f163221b;
        }
        LocalDate presentedMonth = aVar.f163222c;
        Set excludedDates = aVar.e;
        boolean z3 = aVar.f;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(presentedMonth, "presentedMonth");
        Intrinsics.checkNotNullParameter(excludedDates, "excludedDates");
        return new a(localDate, localDate2, presentedMonth, z, excludedDates, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f163220a, aVar.f163220a) && Intrinsics.f(this.f163221b, aVar.f163221b) && Intrinsics.f(this.f163222c, aVar.f163222c) && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f;
    }

    public final int hashCode() {
        LocalDate localDate = this.f163220a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.f163221b;
        return Boolean.hashCode(this.f) + p.a.f(j6.a.c(y.a((iHashCode + (localDate2 != null ? localDate2.hashCode() : 0)) * 31, 31, this.f163222c), 31, this.d), 31, this.e);
    }
}
