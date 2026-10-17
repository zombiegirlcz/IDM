package ylh;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f314705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f314706b;

    public a(LocalDate start, LocalDate end2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.f314705a = start;
        this.f314706b = end2;
    }

    public static a a(a aVar, LocalDate start, LocalDate end2, int i) {
        if ((i & 1) != 0) {
            start = aVar.f314705a;
        }
        if ((i & 2) != 0) {
            end2 = aVar.f314706b;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        return new a(start, end2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f314705a, aVar.f314705a) && Intrinsics.f(this.f314706b, aVar.f314706b);
    }

    public final int hashCode() {
        return this.f314706b.hashCode() + (this.f314705a.hashCode() * 31);
    }
}
