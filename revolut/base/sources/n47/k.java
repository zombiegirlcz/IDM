package n47;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f212318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f212319b;

    public k(LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f212318a = startDate;
        this.f212319b = endDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f212318a, kVar.f212318a) && Intrinsics.f(this.f212319b, kVar.f212319b);
    }

    public final int hashCode() {
        return this.f212319b.hashCode() + (this.f212318a.hashCode() * 31);
    }
}
