package wo7;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f298898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f298899b;

    public d(LocalDate policyStartDate, LocalDate today) {
        Intrinsics.checkNotNullParameter(policyStartDate, "policyStartDate");
        Intrinsics.checkNotNullParameter(today, "today");
        this.f298898a = policyStartDate;
        this.f298899b = today;
    }

    public static d a(d dVar, LocalDate policyStartDate, LocalDate today, int i) {
        if ((i & 1) != 0) {
            policyStartDate = dVar.f298898a;
        }
        if ((i & 2) != 0) {
            today = dVar.f298899b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(policyStartDate, "policyStartDate");
        Intrinsics.checkNotNullParameter(today, "today");
        return new d(policyStartDate, today);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f298898a, dVar.f298898a) && Intrinsics.f(this.f298899b, dVar.f298899b);
    }

    public final int hashCode() {
        return this.f298899b.hashCode() + (this.f298898a.hashCode() * 31);
    }
}
