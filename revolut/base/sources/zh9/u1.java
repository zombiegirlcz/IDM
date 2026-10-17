package zh9;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f322351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f322352b;

    public u1(dj0.d leftToSpend, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(leftToSpend, "leftToSpend");
        this.f322351a = endDate;
        this.f322352b = leftToSpend;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj2;
        return Intrinsics.f(this.f322351a, u1Var.f322351a) && Intrinsics.f(this.f322352b, u1Var.f322352b);
    }

    public final int hashCode() {
        return this.f322352b.hashCode() + (this.f322351a.hashCode() * 31);
    }
}
