package o74;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f222706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222707b;

    public f(String selectedPeriodId, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(selectedPeriodId, "selectedPeriodId");
        this.f222706a = localDate;
        this.f222707b = selectedPeriodId;
    }

    public static f a(f fVar, LocalDate localDate, String selectedPeriodId, int i) {
        if ((i & 1) != 0) {
            localDate = fVar.f222706a;
        }
        if ((i & 2) != 0) {
            selectedPeriodId = fVar.f222707b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(selectedPeriodId, "selectedPeriodId");
        return new f(selectedPeriodId, localDate);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f222706a, fVar.f222706a) && Intrinsics.f(this.f222707b, fVar.f222707b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f222706a;
        return this.f222707b.hashCode() + ((localDate == null ? 0 : localDate.hashCode()) * 31);
    }
}
