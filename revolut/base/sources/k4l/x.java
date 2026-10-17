package k4l;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f181007a;

    public x(Instant startDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f181007a = startDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f181007a, ((x) obj2).f181007a);
    }

    public final int hashCode() {
        return this.f181007a.hashCode();
    }
}
