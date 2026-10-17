package qv4;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f249534a;

    public p(LocalDate startDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f249534a = startDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f249534a, ((p) obj2).f249534a);
    }

    public final int hashCode() {
        return this.f249534a.hashCode();
    }
}
