package rei;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f253602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f253603b;

    public e(LocalDate checkIn, LocalDate checkOut) {
        Intrinsics.checkNotNullParameter(checkIn, "checkIn");
        Intrinsics.checkNotNullParameter(checkOut, "checkOut");
        this.f253602a = checkIn;
        this.f253603b = checkOut;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f253602a, eVar.f253602a) && Intrinsics.f(this.f253603b, eVar.f253603b);
    }

    public final int hashCode() {
        return this.f253603b.hashCode() + (this.f253602a.hashCode() * 31);
    }
}
