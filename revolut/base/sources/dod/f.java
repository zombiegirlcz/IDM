package dod;

import com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.CustomPeriodSelectContract$CustomPeriodConfig;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f116542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yld.d f116543c;
    public final LocalDate d;
    public final LocalDate e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CustomPeriodSelectContract$CustomPeriodConfig f116544g;

    public f(List accounts, yld.d screenType, LocalDate localDate, LocalDate initialStartDate, LocalDate initialEndDate, CustomPeriodSelectContract$CustomPeriodConfig customPeriodSelectContract$CustomPeriodConfig) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        Intrinsics.checkNotNullParameter(initialStartDate, "initialStartDate");
        Intrinsics.checkNotNullParameter(initialEndDate, "initialEndDate");
        this.f116542b = accounts;
        this.f116543c = screenType;
        this.d = localDate;
        this.e = initialStartDate;
        this.f = initialEndDate;
        this.f116544g = customPeriodSelectContract$CustomPeriodConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f116542b, fVar.f116542b) && this.f116543c == fVar.f116543c && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f116544g, fVar.f116544g);
    }

    public final int hashCode() {
        int iHashCode = (this.f116543c.hashCode() + (this.f116542b.hashCode() * 31)) * 31;
        LocalDate localDate = this.d;
        int iC = j6.a.c(y.a(y.a((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.e), 31, this.f), 31, true);
        CustomPeriodSelectContract$CustomPeriodConfig customPeriodSelectContract$CustomPeriodConfig = this.f116544g;
        return iC + (customPeriodSelectContract$CustomPeriodConfig != null ? customPeriodSelectContract$CustomPeriodConfig.hashCode() : 0);
    }
}
