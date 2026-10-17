package nsl;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f218924a;

    public l(Instant cancellationDeadline) {
        Intrinsics.checkNotNullParameter(cancellationDeadline, "cancellationDeadline");
        this.f218924a = cancellationDeadline;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f218924a, ((l) obj2).f218924a);
    }

    public final int hashCode() {
        return this.f218924a.hashCode();
    }
}
