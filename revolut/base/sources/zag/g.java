package zag;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f320693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f320694c;
    public final List d;

    public g(String bookingId, LocalDate checkIn, LocalDate checkOut, List selectedBeds) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(checkIn, "checkIn");
        Intrinsics.checkNotNullParameter(checkOut, "checkOut");
        Intrinsics.checkNotNullParameter(selectedBeds, "selectedBeds");
        this.f320692a = bookingId;
        this.f320693b = checkIn;
        this.f320694c = checkOut;
        this.d = selectedBeds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f320692a, gVar.f320692a) && Intrinsics.f(this.f320693b, gVar.f320693b) && Intrinsics.f(this.f320694c, gVar.f320694c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + y.a(y.a(this.f320692a.hashCode() * 31, 31, this.f320693b), 31, this.f320694c);
    }
}
