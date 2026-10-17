package b9h;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f13781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f13782c;
    public final LinkedHashSet d;

    public a(List pairs, DateTime dateTime, LocalDate currentDate, LinkedHashSet validRateDates) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(validRateDates, "validRateDates");
        this.f13780a = pairs;
        this.f13781b = dateTime;
        this.f13782c = currentDate;
        this.d = validRateDates;
    }

    public final List a() {
        return this.f13780a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f13780a, aVar.f13780a) && Intrinsics.f(this.f13781b, aVar.f13781b) && this.f13782c.equals(aVar.f13782c) && this.d.equals(aVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f13780a.hashCode() * 31;
        DateTime dateTime = this.f13781b;
        return this.d.hashCode() + y.a((iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31, 31, this.f13782c);
    }
}
