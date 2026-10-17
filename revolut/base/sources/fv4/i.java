package fv4;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f138332a;

    public i(LocalDate referenceDate) {
        Intrinsics.checkNotNullParameter(referenceDate, "referenceDate");
        this.f138332a = referenceDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f138332a, ((i) obj2).f138332a);
    }

    public final int hashCode() {
        return this.f138332a.hashCode();
    }
}
