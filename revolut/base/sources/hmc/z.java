package hmc;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f153671a;

    public z(LocalDate localDate) {
        this.f153671a = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f153671a, ((z) obj2).f153671a);
    }

    public final int hashCode() {
        LocalDate localDate = this.f153671a;
        if (localDate == null) {
            return 0;
        }
        return localDate.hashCode();
    }
}
