package ttl;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f274463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k4l.k f274464b;

    public p(LocalDate expiryDate, k4l.k expiryDateType) {
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        Intrinsics.checkNotNullParameter(expiryDateType, "expiryDateType");
        this.f274463a = expiryDate;
        this.f274464b = expiryDateType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f274463a, pVar.f274463a) && this.f274464b == pVar.f274464b;
    }

    public final int hashCode() {
        return this.f274464b.hashCode() + (this.f274463a.hashCode() * 31);
    }
}
