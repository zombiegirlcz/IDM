package fdl;

import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u0012"}, d2 = {"Lfdl/o0;", "Lfdl/e;", "", "d", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "currency", "", "Lfdl/p0;", "Ljava/util/List;", "f", "()Ljava/util/List;", "rates", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "baseline", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o0 extends e {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("rates")
    @NotNull
    private final List<p0> rates;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("baseline")
    private final BigDecimal baseline;

    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getBaseline() {
        return this.baseline;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Override // fdl.e
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!o0.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.shared.feature.wealth.domain.impl.data.network.model.HistoricalMoneyChartDto");
        o0 o0Var = (o0) obj2;
        return super.equals(obj2) && Intrinsics.f(this.currency, o0Var.currency) && Intrinsics.f(this.rates, o0Var.rates) && Intrinsics.f(this.baseline, o0Var.baseline);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getRates() {
        return this.rates;
    }

    @Override // fdl.e
    public final int hashCode() {
        int iD = p.a.d(p.a.c(super.hashCode() * 31, 31, this.currency), 31, this.rates);
        BigDecimal bigDecimal = this.baseline;
        return iD + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
