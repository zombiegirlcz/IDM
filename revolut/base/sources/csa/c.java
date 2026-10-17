package csa;

import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.push_to_card.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final y0 a(xi0.b cardCurrency, xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(cardCurrency, "cardCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        return new y0("CURRENCY_CONFIRM_ID", new l0(new TextLocalisedClause(R$string.push2card_bottom_sheet_title_recipient_currency, u.c(new CurrencyClause(cardCurrency, null, null, 6)), null, 12), new TextLocalisedClause(R$string.push2card_bottom_sheet_subtitle_recipient_currency, u.c(new CurrencyClause(targetCurrency, null, null, 6)), null, 12), null, new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_app_fraud_warning_confirmation_dialog_button_positive, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.payments_app_fraud_warning_confirmation_dialog_button_negative, null, null, 14), null, false, null, 996), false, 4);
    }
}
