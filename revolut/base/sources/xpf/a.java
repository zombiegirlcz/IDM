package xpf;

import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.time.LocalDate;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferScheduleData f307958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f307959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f307960c;
    public final boolean d;
    public final LocalDate e;
    public final LocalDate f;

    public a(TransferScheduleData scheduledData, boolean z, boolean z3, boolean z4, LocalDate localDate, LocalDate localDate2) {
        Intrinsics.checkNotNullParameter(scheduledData, "scheduledData");
        this.f307958a = scheduledData;
        this.f307959b = z;
        this.f307960c = z3;
        this.d = z4;
        this.e = localDate;
        this.f = localDate2;
    }

    public static a a(a aVar, TransferScheduleData scheduledData) {
        boolean z = aVar.f307959b;
        boolean z3 = aVar.f307960c;
        boolean z4 = aVar.d;
        LocalDate localDate = aVar.e;
        LocalDate localDate2 = aVar.f;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(scheduledData, "scheduledData");
        return new a(scheduledData, z, z3, z4, localDate, localDate2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f307958a, aVar.f307958a) && this.f307959b == aVar.f307959b && this.f307960c == aVar.f307960c && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(this.f307958a.hashCode() * 31, 31, this.f307959b), 31, this.f307960c), 31, this.d);
        LocalDate localDate = this.e;
        int iHashCode = (iC + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }
}
