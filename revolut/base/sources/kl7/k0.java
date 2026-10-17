package kl7;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f185346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f185347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f185348c;
    public final m0 d;

    public k0(LocalDate reportStartDate, LocalDate reportEndDate, l0 l0Var, m0 tripSummary) {
        Intrinsics.checkNotNullParameter(reportStartDate, "reportStartDate");
        Intrinsics.checkNotNullParameter(reportEndDate, "reportEndDate");
        Intrinsics.checkNotNullParameter(tripSummary, "tripSummary");
        this.f185346a = reportStartDate;
        this.f185347b = reportEndDate;
        this.f185348c = l0Var;
        this.d = tripSummary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f185346a, k0Var.f185346a) && Intrinsics.f(this.f185347b, k0Var.f185347b) && Intrinsics.f(this.f185348c, k0Var.f185348c) && Intrinsics.f(this.d, k0Var.d);
    }

    public final int hashCode() {
        int iA = wp5.y.a(this.f185346a.hashCode() * 31, 31, this.f185347b);
        l0 l0Var = this.f185348c;
        return this.d.hashCode() + ((iA + (l0Var == null ? 0 : l0Var.hashCode())) * 31);
    }
}
