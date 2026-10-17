package wyc;

import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSource f301216a;

    public l(IncomeSource incomeSource) {
        Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
        this.f301216a = incomeSource;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f301216a, ((l) obj2).f301216a);
    }

    public final int hashCode() {
        return this.f301216a.hashCode();
    }
}
