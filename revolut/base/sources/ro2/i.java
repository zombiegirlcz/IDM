package ro2;

import aii.r;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f255813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qo2.c f255814b;

    public i(LocalDate selectedDate, qo2.c frequency) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.f255813a = selectedDate;
        this.f255814b = frequency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f255813a, iVar.f255813a) && this.f255814b == iVar.f255814b;
    }

    public final int hashCode() {
        return this.f255814b.hashCode() + (this.f255813a.hashCode() * 31);
    }
}
