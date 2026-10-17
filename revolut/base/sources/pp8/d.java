package pp8;

import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZonedDateTime f238295a;

    public d(ZonedDateTime startDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f238295a = startDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f238295a, ((d) obj2).f238295a);
    }

    public final int hashCode() {
        return this.f238295a.hashCode();
    }
}
