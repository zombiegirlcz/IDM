package k50;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class x0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f181280a;

    public x0(Instant date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f181280a = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x0) && Intrinsics.f(this.f181280a, ((x0) obj2).f181280a);
    }

    public final int hashCode() {
        return this.f181280a.hashCode();
    }
}
