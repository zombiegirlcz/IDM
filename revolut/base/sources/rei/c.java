package rei;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qei.m f253598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f253599c;
    public final LocalDate d;

    public c(String id10, qei.m status, LocalDate checkIn, LocalDate checkOut) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(checkIn, "checkIn");
        Intrinsics.checkNotNullParameter(checkOut, "checkOut");
        this.f253597a = id10;
        this.f253598b = status;
        this.f253599c = checkIn;
        this.d = checkOut;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f253597a, cVar.f253597a) && this.f253598b == cVar.f253598b && Intrinsics.f(this.f253599c, cVar.f253599c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + y.a((this.f253598b.hashCode() + (this.f253597a.hashCode() * 31)) * 31, 31, this.f253599c);
    }
}
