package ms0;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f208305a;

    public k0(LocalDate selectedDate) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        this.f208305a = selectedDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && Intrinsics.f(this.f208305a, ((k0) obj2).f208305a);
    }

    public final int hashCode() {
        return this.f208305a.hashCode();
    }
}
