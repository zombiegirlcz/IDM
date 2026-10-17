package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class b3 {

    @NotNull
    public static final a3 Companion = new a3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e3 f153030c;
    public final h3 d;

    public /* synthetic */ b3(int i, String str, String str2, e3 e3Var, h3 h3Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(z2.f153390a.getDescriptor(), i, 15);
            throw null;
        }
        this.f153028a = str;
        this.f153029b = str2;
        this.f153030c = e3Var;
        this.d = h3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj2;
        return Intrinsics.f(this.f153028a, b3Var.f153028a) && Intrinsics.f(this.f153029b, b3Var.f153029b) && Intrinsics.f(this.f153030c, b3Var.f153030c) && Intrinsics.f(this.d, b3Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f153028a.hashCode() * 31, 31, this.f153029b);
        e3 e3Var = this.f153030c;
        return this.d.hashCode() + ((iC + (e3Var == null ? 0 : e3Var.hashCode())) * 31);
    }

    public b3(String reportStartDate, String reportEndDate, e3 e3Var, h3 tripSummary) {
        Intrinsics.checkNotNullParameter(reportStartDate, "reportStartDate");
        Intrinsics.checkNotNullParameter(reportEndDate, "reportEndDate");
        Intrinsics.checkNotNullParameter(tripSummary, "tripSummary");
        this.f153028a = reportStartDate;
        this.f153029b = reportEndDate;
        this.f153030c = e3Var;
        this.d = tripSummary;
    }
}
