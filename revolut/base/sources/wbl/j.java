package wbl;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f296268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f296269b;

    public j(LocalDate from, LocalDate to6) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f296268a = from;
        this.f296269b = to6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f296268a, jVar.f296268a) && Intrinsics.f(this.f296269b, jVar.f296269b);
    }

    public final int hashCode() {
        return this.f296269b.hashCode() + (this.f296268a.hashCode() * 31);
    }
}
