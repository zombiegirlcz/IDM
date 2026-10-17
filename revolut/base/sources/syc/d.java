package syc;

import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncomeSource f266651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f266652b;

    public d(IncomeSource incomeSource, List list) {
        Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
        this.f266651a = incomeSource;
        this.f266652b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f266651a, dVar.f266651a) && Intrinsics.f(this.f266652b, dVar.f266652b);
    }

    public final int hashCode() {
        int iHashCode = this.f266651a.hashCode() * 31;
        List list = this.f266652b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
