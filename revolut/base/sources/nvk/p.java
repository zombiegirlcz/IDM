package nvk;

import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.models.StockFinancialsStatementPeriodState;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f219727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StockFinancialsStatementPeriodState f219728b;

    public p(List subPeriods, StockFinancialsStatementPeriodState selectedPeriodState) {
        Intrinsics.checkNotNullParameter(subPeriods, "subPeriods");
        Intrinsics.checkNotNullParameter(selectedPeriodState, "selectedPeriodState");
        this.f219727a = subPeriods;
        this.f219728b = selectedPeriodState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f219727a, pVar.f219727a) && Intrinsics.f(this.f219728b, pVar.f219728b);
    }

    public final int hashCode() {
        return this.f219728b.hashCode() + (this.f219727a.hashCode() * 31);
    }
}
