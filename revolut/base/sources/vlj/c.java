package vlj;

import aii.r;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f290476a;

    public c(LocalDate localDate) {
        this.f290476a = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f290476a, ((c) obj2).f290476a);
    }

    public final int hashCode() {
        LocalDate localDate = this.f290476a;
        if (localDate == null) {
            return 0;
        }
        return localDate.hashCode();
    }
}
