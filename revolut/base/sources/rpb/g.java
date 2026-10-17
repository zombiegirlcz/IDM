package rpb;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f256315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f256316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f256317c;

    public g(f type, LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f256315a = type;
        this.f256316b = startDate;
        this.f256317c = endDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f256315a == gVar.f256315a && Intrinsics.f(this.f256316b, gVar.f256316b) && Intrinsics.f(this.f256317c, gVar.f256317c);
    }

    public final int hashCode() {
        return this.f256317c.hashCode() + wp5.y.a(this.f256315a.hashCode() * 31, 31, this.f256316b);
    }
}
