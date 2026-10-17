package gp5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import ix0.d0;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements mo5.a {
    @Override // mo5.a
    public final int a(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return R$string.transaction_details_cryptowithdrawal_memo;
    }

    @Override // mo5.a
    public final int b(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return R$string.crypto_withdrawals_screen_create_address_details_memo_missing_popup_subtitle;
    }

    @Override // mo5.a
    public final int c(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return R$string.crypto_withdrawals_screen_create_address_details_memo_popup_amend_button_title;
    }

    @Override // mo5.a
    public final Clause d(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new TextLocalisedClause(R$string.crypto_withdrawals_screen_create_address_details_optional_memo_info_popup_title, u.c(d0.a(currency, null)), null, 12);
    }

    @Override // mo5.a
    public final int e(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return R$string.crypto_withdrawals_screen_create_address_details_memo_title;
    }

    @Override // mo5.a
    public final int f(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return R$string.crypto_withdrawals_screen_create_address_details_memo_missing_popup_title;
    }

    @Override // mo5.a
    public final Clause g(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new TextLocalisedClause(R$string.crypto_withdrawals_screen_create_address_details_optional_memo_info_popup_description, u.c(d0.a(currency, null)), null, 12);
    }

    @Override // mo5.a
    public final int h(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return R$string.crypto_withdrawals_screen_create_address_details_memo_error;
    }
}
