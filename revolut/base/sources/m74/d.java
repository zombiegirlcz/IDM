package m74;

import aii.r;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f203312a;

    public d(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f203312a = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f203312a, ((d) obj2).f203312a);
    }

    public final int hashCode() {
        return this.f203312a.hashCode();
    }
}
