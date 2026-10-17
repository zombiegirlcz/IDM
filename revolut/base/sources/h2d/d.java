package h2d;

import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    private d() {
    }

    public static RateClause a(String currencyId, String referencedCurrencyId, BigDecimal rate) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(currencyId, "currencyId");
        Intrinsics.checkNotNullParameter(referencedCurrencyId, "referencedCurrencyId");
        xi0.b.Companion.getClass();
        return new RateClause(rate, xi0.a.a(currencyId), new RateClause.Format.Default(xi0.a.a(referencedCurrencyId), true), null);
    }

    public static RateClause b(AlertItem.TargetPrice item) {
        Intrinsics.checkNotNullParameter(item, "item");
        BigDecimal bigDecimal = item.d;
        xi0.a aVar = xi0.b.Companion;
        String str = item.f86872c;
        aVar.getClass();
        return new RateClause(bigDecimal, xi0.a.a(str), new RateClause.Format.Default(xi0.a.a(item.f86871b.f86864b), true), null);
    }
}
