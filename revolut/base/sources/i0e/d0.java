package i0e;

import com.revolut.feature.statements.api.models.StatementPeriod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aim.e f157363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementPeriod f157364b;

    public d0(aim.e availablePeriods, StatementPeriod selectedPeriod) {
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        this.f157363a = availablePeriods;
        this.f157364b = selectedPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f157363a.equals(d0Var.f157363a) && Intrinsics.f(this.f157364b, d0Var.f157364b);
    }

    public final int hashCode() {
        return this.f157364b.hashCode() + (this.f157363a.hashCode() * 31);
    }
}
