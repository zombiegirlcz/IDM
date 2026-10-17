package zuj;

import com.revolut.data.model.Data;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f325497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f325498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f325499c;
    public final o d;

    public n() {
        this(0);
    }

    public static n a(n nVar, Data itinerary, LocalDate localDate, LocalDate localDate2, o featuresAvailability, int i) {
        if ((i & 1) != 0) {
            itinerary = nVar.f325497a;
        }
        if ((i & 2) != 0) {
            localDate = nVar.f325498b;
        }
        if ((i & 4) != 0) {
            localDate2 = nVar.f325499c;
        }
        if ((i & 8) != 0) {
            featuresAvailability = nVar.d;
        }
        nVar.getClass();
        Intrinsics.checkNotNullParameter(itinerary, "itinerary");
        Intrinsics.checkNotNullParameter(featuresAvailability, "featuresAvailability");
        return new n(itinerary, localDate, localDate2, featuresAvailability);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f325497a, nVar.f325497a) && Intrinsics.f(this.f325498b, nVar.f325498b) && Intrinsics.f(this.f325499c, nVar.f325499c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f325497a.hashCode() * 31;
        LocalDate localDate = this.f325498b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f325499c;
        return this.d.hashCode() + ((iHashCode2 + (localDate2 != null ? localDate2.hashCode() : 0)) * 31);
    }

    public n(Data itinerary, LocalDate localDate, LocalDate localDate2, o featuresAvailability) {
        Intrinsics.checkNotNullParameter(itinerary, "itinerary");
        Intrinsics.checkNotNullParameter(featuresAvailability, "featuresAvailability");
        this.f325497a = itinerary;
        this.f325498b = localDate;
        this.f325499c = localDate2;
        this.d = featuresAvailability;
    }

    public /* synthetic */ n(int i) {
        this(new Data(null, null, true, 3, null), null, null, new o(0));
    }
}
