package zrf;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f324723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f324724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f324725c;

    public d(dj0.d monthlyRepayment, LocalDate firstInstalmentDueDate, LocalDate lastInstalmentDueDate) {
        Intrinsics.checkNotNullParameter(monthlyRepayment, "monthlyRepayment");
        Intrinsics.checkNotNullParameter(firstInstalmentDueDate, "firstInstalmentDueDate");
        Intrinsics.checkNotNullParameter(lastInstalmentDueDate, "lastInstalmentDueDate");
        this.f324723a = monthlyRepayment;
        this.f324724b = firstInstalmentDueDate;
        this.f324725c = lastInstalmentDueDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f324723a, dVar.f324723a) && Intrinsics.f(this.f324724b, dVar.f324724b) && Intrinsics.f(this.f324725c, dVar.f324725c);
    }

    public final int hashCode() {
        return this.f324725c.hashCode() + y.a(this.f324723a.hashCode() * 31, 31, this.f324724b);
    }
}
