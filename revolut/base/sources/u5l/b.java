package u5l;

import aw0.k7;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import d9.e1;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ScaleMode.SimpleLen f277464a = new ScaleMode.SimpleLen(2, RoundingMode.DOWN);

    public static RateClause a(BigDecimal amount, xi0.b currency) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new RateClause(e1.M(amount, currency.c(), 6), currency, new RateClause.Format.ExchangeRate(true), null);
    }

    public static MoneyClause.Format.Defaults b() {
        k7 signShowingPolicy = k7.ONLY_NEGATIVE;
        Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
        return new MoneyClause.Format.Defaults(signShowingPolicy, f277464a, false, false, 4);
    }
}
