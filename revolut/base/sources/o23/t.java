package o23;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_order_new.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t {
    public static TextLocalisedClause a(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        return countryCode.equals(wi0.b.f297734c) ? new TextLocalisedClause(R$string.card_delivery_address_form_emirate, null, null, 14) : (countryCode.equals(wi0.b.f297750h0) || countryCode.equals(wi0.b.T0)) ? new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_delivery_address_form_province, null, null, 14) : (countryCode.equals(wi0.b.f297770q3) || countryCode.equals(wi0.b.Y1) || countryCode.equals(wi0.b.A) || countryCode.equals(wi0.b.f297756l)) ? new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_delivery_address_form_state, null, null, 14) : countryCode.equals(wi0.b.X0) ? new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_delivery_address_form_prefercture_state, null, null, 14) : countryCode.equals(wi0.b.L0) ? new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_delivery_address_form_country, null, null, 14) : countryCode.equals(wi0.b.J) ? new TextLocalisedClause(R.string.common_address_region_canton_district, null, null, 14) : new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_delivery_address_form_region, null, null, 14);
    }
}
