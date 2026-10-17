package kqd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.IncomeSorterFlowContract$SelectionMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncomeSorterFlowContract$SelectionMode f188387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f188388c;

    public l(IncomeSorterFlowContract$SelectionMode selectionMode, xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        this.f188387b = selectionMode;
        this.f188388c = targetCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f188387b, lVar.f188387b) && Intrinsics.f(this.f188388c, lVar.f188388c);
    }

    public final int hashCode() {
        return this.f188388c.hashCode() + (this.f188387b.hashCode() * 31);
    }
}
