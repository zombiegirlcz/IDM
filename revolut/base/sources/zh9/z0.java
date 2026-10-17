package zh9;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z0 extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f322369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f322370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f322371c;

    public z0(String termsType, LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(termsType, "termsType");
        this.f322369a = startDate;
        this.f322370b = endDate;
        this.f322371c = termsType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f322369a, z0Var.f322369a) && Intrinsics.f(this.f322370b, z0Var.f322370b) && Intrinsics.f(this.f322371c, z0Var.f322371c);
    }

    public final int hashCode() {
        return this.f322371c.hashCode() + wp5.y.a(this.f322369a.hashCode() * 31, 31, this.f322370b);
    }
}
