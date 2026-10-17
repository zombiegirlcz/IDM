package i0e;

import com.revolut.feature.statements.api.models.StatementPeriod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatementPeriod f157353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementPeriod f157354b;

    public a0(StatementPeriod availablePeriod, StatementPeriod selectedPeriod) {
        Intrinsics.checkNotNullParameter(availablePeriod, "availablePeriod");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        this.f157353a = availablePeriod;
        this.f157354b = selectedPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f157353a, a0Var.f157353a) && Intrinsics.f(this.f157354b, a0Var.f157354b);
    }

    public final int hashCode() {
        return this.f157354b.hashCode() + (this.f157353a.hashCode() * 31);
    }
}
