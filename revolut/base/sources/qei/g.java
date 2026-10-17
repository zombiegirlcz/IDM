package qei;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f245169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f245170c;

    public g(String bookingId, LocalDate checkIn, LocalDate checkOut) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(checkIn, "checkIn");
        Intrinsics.checkNotNullParameter(checkOut, "checkOut");
        this.f245168a = bookingId;
        this.f245169b = checkIn;
        this.f245170c = checkOut;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f245168a, gVar.f245168a) && Intrinsics.f(this.f245169b, gVar.f245169b) && Intrinsics.f(this.f245170c, gVar.f245170c);
    }

    public final int hashCode() {
        return this.f245170c.hashCode() + y.a(this.f245168a.hashCode() * 31, 31, this.f245169b);
    }
}
