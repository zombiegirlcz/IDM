package mpd;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f207784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f207785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f207786c;
    public final LocalDate d;
    public final LocalDate e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f207787g;

    public a(LocalDate localDate, LocalDate initialStartDate, LocalDate initialEndDate, LocalDate selectedStartDate, LocalDate selectedEndDate, boolean z, b bVar) {
        Intrinsics.checkNotNullParameter(initialStartDate, "initialStartDate");
        Intrinsics.checkNotNullParameter(initialEndDate, "initialEndDate");
        Intrinsics.checkNotNullParameter(selectedStartDate, "selectedStartDate");
        Intrinsics.checkNotNullParameter(selectedEndDate, "selectedEndDate");
        this.f207784a = localDate;
        this.f207785b = initialStartDate;
        this.f207786c = initialEndDate;
        this.d = selectedStartDate;
        this.e = selectedEndDate;
        this.f = z;
        this.f207787g = bVar;
    }

    public static a a(a aVar, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, boolean z, b bVar, int i) {
        if ((i & 1) != 0) {
            localDate = aVar.f207784a;
        }
        LocalDate localDate4 = localDate;
        LocalDate initialStartDate = aVar.f207785b;
        LocalDate initialEndDate = aVar.f207786c;
        if ((i & 8) != 0) {
            localDate2 = aVar.d;
        }
        LocalDate selectedStartDate = localDate2;
        if ((i & 16) != 0) {
            localDate3 = aVar.e;
        }
        LocalDate selectedEndDate = localDate3;
        if ((i & 32) != 0) {
            z = aVar.f;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            bVar = aVar.f207787g;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(initialStartDate, "initialStartDate");
        Intrinsics.checkNotNullParameter(initialEndDate, "initialEndDate");
        Intrinsics.checkNotNullParameter(selectedStartDate, "selectedStartDate");
        Intrinsics.checkNotNullParameter(selectedEndDate, "selectedEndDate");
        return new a(localDate4, initialStartDate, initialEndDate, selectedStartDate, selectedEndDate, z3, bVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f207784a, aVar.f207784a) && Intrinsics.f(this.f207785b, aVar.f207785b) && Intrinsics.f(this.f207786c, aVar.f207786c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f && Intrinsics.f(this.f207787g, aVar.f207787g);
    }

    public final int hashCode() {
        LocalDate localDate = this.f207784a;
        int iC = j6.a.c(y.a(y.a(y.a(y.a((localDate == null ? 0 : localDate.hashCode()) * 31, 31, this.f207785b), 31, this.f207786c), 31, this.d), 31, this.e), 31, this.f);
        b bVar = this.f207787g;
        return iC + (bVar != null ? bVar.hashCode() : 0);
    }
}
