package s43;

import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_payment_method.impl.R$string;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements s43.a {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause a() {
        return new TextLocalisedClause(R$string.card_payment_method_spend_from_description_foreign_currency, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
    }

    public static TextLocalisedClause b(xi0.b bVar) {
        return new TextLocalisedClause(R$string.card_payment_method_spend_from_description_local_currency, u.c(new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
    }
}
