package wyc;

import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSource f301217a;

    public m(IncomeSource incomeSource) {
        Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
        this.f301217a = incomeSource;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f301217a, ((m) obj2).f301217a);
    }

    public final int hashCode() {
        return this.f301217a.hashCode();
    }
}
