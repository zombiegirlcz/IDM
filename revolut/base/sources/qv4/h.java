package qv4;

import aii.r;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f249529a;

    public h(LocalDate startDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f249529a = startDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f249529a, ((h) obj2).f249529a);
    }

    public final int hashCode() {
        return this.f249529a.hashCode();
    }
}
