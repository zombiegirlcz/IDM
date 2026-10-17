package zag;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f320696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f320697c;

    public h(String bookingId, LocalDate checkIn, LocalDate checkOut) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(checkIn, "checkIn");
        Intrinsics.checkNotNullParameter(checkOut, "checkOut");
        this.f320695a = bookingId;
        this.f320696b = checkIn;
        this.f320697c = checkOut;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f320695a, hVar.f320695a) && Intrinsics.f(this.f320696b, hVar.f320696b) && Intrinsics.f(this.f320697c, hVar.f320697c);
    }

    public final int hashCode() {
        return this.f320697c.hashCode() + y.a(this.f320695a.hashCode() * 31, 31, this.f320696b);
    }
}
