package gvl;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f147221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f147222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f147223c;
    public final boolean d;
    public final List e;
    public final sel.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f147224g;

    public j(LocalDate startDate, LocalDate localDate, LocalDate localDate2, boolean z, List excludeDates, sel.a period, List availablePeriods) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(excludeDates, "excludeDates");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        this.f147221a = startDate;
        this.f147222b = localDate;
        this.f147223c = localDate2;
        this.d = z;
        this.e = excludeDates;
        this.f = period;
        this.f147224g = availablePeriods;
    }

    public static j a(j jVar, LocalDate localDate, sel.a aVar, int i) {
        if ((i & 1) != 0) {
            localDate = jVar.f147221a;
        }
        LocalDate startDate = localDate;
        LocalDate localDate2 = jVar.f147222b;
        LocalDate localDate3 = jVar.f147223c;
        boolean z = jVar.d;
        List excludeDates = jVar.e;
        if ((i & 32) != 0) {
            aVar = jVar.f;
        }
        sel.a period = aVar;
        List availablePeriods = jVar.f147224g;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(excludeDates, "excludeDates");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        return new j(startDate, localDate2, localDate3, z, excludeDates, period, availablePeriods);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f147221a, jVar.f147221a) && Intrinsics.f(this.f147222b, jVar.f147222b) && Intrinsics.f(this.f147223c, jVar.f147223c) && this.d == jVar.d && Intrinsics.f(this.e, jVar.e) && this.f == jVar.f && Intrinsics.f(this.f147224g, jVar.f147224g);
    }

    public final int hashCode() {
        int iHashCode = this.f147221a.hashCode() * 31;
        LocalDate localDate = this.f147222b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f147223c;
        return this.f147224g.hashCode() + ((this.f.hashCode() + p.a.d(j6.a.c((iHashCode2 + (localDate2 != null ? localDate2.hashCode() : 0)) * 31, 31, this.d), 31, this.e)) * 31);
    }
}
