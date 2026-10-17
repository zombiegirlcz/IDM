package zh9;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a1 extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f322250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f322251b;

    public a1(LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f322250a = startDate;
        this.f322251b = endDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return Intrinsics.f(this.f322250a, a1Var.f322250a) && Intrinsics.f(this.f322251b, a1Var.f322251b);
    }

    public final int hashCode() {
        return this.f322251b.hashCode() + (this.f322250a.hashCode() * 31);
    }
}
