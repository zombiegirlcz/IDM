package zl4;

import hha.w0;
import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f323186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f323187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f323188c;
    public final LocalDate d;
    public final boolean e;

    public i(w0 planTier, dj0.d threshold, dj0.d spent, LocalDate statementDate, boolean z) {
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        Intrinsics.checkNotNullParameter(spent, "spent");
        Intrinsics.checkNotNullParameter(statementDate, "statementDate");
        this.f323186a = planTier;
        this.f323187b = threshold;
        this.f323188c = spent;
        this.d = statementDate;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f323186a == iVar.f323186a && Intrinsics.f(this.f323187b, iVar.f323187b) && Intrinsics.f(this.f323188c, iVar.f323188c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + y.a(v7.c(v7.c(this.f323186a.hashCode() * 31, 31, this.f323187b), 31, this.f323188c), 31, this.d);
    }
}
