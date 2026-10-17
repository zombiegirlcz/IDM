package pp8;

import aii.r;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZonedDateTime f238299a;

    public i(ZonedDateTime startDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f238299a = startDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f238299a, ((i) obj2).f238299a);
    }

    public final int hashCode() {
        return this.f238299a.hashCode();
    }
}
