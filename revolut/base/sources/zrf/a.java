package zrf;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f324717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f324718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f324719c;

    public a(dj0.d monthlyRepayment, LocalDate firstInstalmentDueDate, LocalDate lastInstalmentDueDate) {
        Intrinsics.checkNotNullParameter(monthlyRepayment, "monthlyRepayment");
        Intrinsics.checkNotNullParameter(firstInstalmentDueDate, "firstInstalmentDueDate");
        Intrinsics.checkNotNullParameter(lastInstalmentDueDate, "lastInstalmentDueDate");
        this.f324717a = monthlyRepayment;
        this.f324718b = firstInstalmentDueDate;
        this.f324719c = lastInstalmentDueDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f324717a, aVar.f324717a) && Intrinsics.f(this.f324718b, aVar.f324718b) && Intrinsics.f(this.f324719c, aVar.f324719c);
    }

    public final int hashCode() {
        return this.f324719c.hashCode() + y.a(this.f324717a.hashCode() * 31, 31, this.f324718b);
    }
}
