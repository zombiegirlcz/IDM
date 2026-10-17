package gp5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements mo5.a {
    @Override // mo5.a
    public final int a(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return R$string.transactionUI_transaction_details_cryptowithdrawal_destination_tag;
    }

    @Override // mo5.a
    public final int b(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return R$string.crypto_withdrawals_screen_create_address_details_destination_tag_missing_popup_subtitle;
    }

    @Override // mo5.a
    public final int c(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return R$string.crypto_withdrawals_screen_create_address_details_destination_tag_popup_amend_button_title;
    }

    @Override // mo5.a
    public final Clause d(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new TextLocalisedClause(R$string.crypto_withdrawals_screen_create_address_details_destination_tag_info_popup_title, null, null, 14);
    }

    @Override // mo5.a
    public final int e(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return R$string.crypto_withdrawals_screen_create_address_details_destination_tag_title;
    }

    @Override // mo5.a
    public final int f(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return R$string.crypto_withdrawals_screen_create_address_details_destination_tag_missing_popup_title;
    }

    @Override // mo5.a
    public final Clause g(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new TextLocalisedClause(R$string.crypto_withdrawals_screen_create_address_details_destination_tag_info_popup_description, null, null, 14);
    }

    @Override // mo5.a
    public final int h(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return R$string.crypto_withdrawals_screen_create_address_details_destination_tag_error;
    }
}
