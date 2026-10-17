package dd3;

import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cashback.impl.R$string;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements b, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f113099a;

    public o(BigDecimal cashbackPercentage) {
        Intrinsics.checkNotNullParameter(cashbackPercentage, "cashbackPercentage");
        this.f113099a = cashbackPercentage;
    }

    @Override // dd3.b
    public final TextLocalisedClause c() {
        return new TextLocalisedClause(R$string.cashback_source_pro_subtitle, zhm.u.c(new PercentageClause(this.f113099a, PercentageClause.Format.Long.f57911a, (Style) null, 4)), null, 12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f113099a, ((o) obj2).f113099a);
    }

    public final int hashCode() {
        return this.f113099a.hashCode();
    }
}
