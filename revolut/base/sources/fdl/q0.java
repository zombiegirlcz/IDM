package fdl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u0004\u0010\u000b¨\u0006\r"}, d2 = {"Lfdl/q0;", "Lfdl/e;", "", "Lfdl/r0;", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "rates", "", "Ljava/lang/String;", "()Ljava/lang/String;", "baseline", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q0 extends e {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("rates")
    @NotNull
    private final List<r0> rates;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("baseline")
    private final String baseline;

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBaseline() {
        return this.baseline;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getRates() {
        return this.rates;
    }

    @Override // fdl.e
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!q0.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.domain.impl.data.network.model.HistoricalPercentageChartDto");
        q0 q0Var = (q0) obj2;
        return super.equals(obj2) && Intrinsics.f(this.rates, q0Var.rates) && Intrinsics.f(this.baseline, q0Var.baseline);
    }

    @Override // fdl.e
    public final int hashCode() {
        int iD = p.a.d(super.hashCode() * 31, 31, this.rates);
        String str = this.baseline;
        return iD + (str != null ? str.hashCode() : 0);
    }
}
