package iua;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f168539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hua.c f168540b;

    public a(LocalDate selectedDate, hua.c selectedPeriod) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        this.f168539a = selectedDate;
        this.f168540b = selectedPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f168539a, aVar.f168539a) && this.f168540b == aVar.f168540b;
    }

    public final int hashCode() {
        return this.f168540b.hashCode() + (this.f168539a.hashCode() * 31);
    }
}
