package lia;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f195440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f195441b;

    public a(LocalDate startDate, LocalDate endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f195440a = startDate;
        this.f195441b = endDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f195440a, aVar.f195440a) && Intrinsics.f(this.f195441b, aVar.f195441b);
    }

    public final int hashCode() {
        return this.f195441b.hashCode() + (this.f195440a.hashCode() * 31);
    }
}
