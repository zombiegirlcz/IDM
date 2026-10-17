package wy5;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.currency.accounts.impl.R$string;
import com.revolut.feature.pockets.api.ui.add_new.OpenNewPocketDestination;
import io3.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qf1.d;
import qf1.h;
import qf1.j;
import qf1.k;
import uy5.c;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements pf1.a {
    @Override // pf1.a
    public final k a(d dVar) {
        c item = (c) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        int i = R$drawable.uikit_icn_24_rates_converter;
        TextLocalisedClause textLocalisedClause = com.bumptech.glide.d.u(com.bumptech.glide.d.c(item.f284074b)) ? new TextLocalisedClause(R$string.account_switcher_product_selection_currency_account_title_mx, null, null, 14) : new TextLocalisedClause(R$string.account_switcher_product_selection_currency_account_title, null, null, 14);
        int i2 = item.f284075c;
        return new k(i, textLocalisedClause, (31 > i2 || i2 > Integer.MAX_VALUE) ? (26 > i2 || i2 >= 31) ? new TextLocalisedClause(R$string.add_new_product_personal_currency_subtitle_multiple, null, null, 14) : new TextLocalisedClause(R$string.add_new_product_personal_currency_subtitle_reduced, null, null, 14) : new TextLocalisedClause(R$string.add_new_product_personal_currency_subtitle, null, null, 14), null, null, null, 56);
    }

    @Override // pf1.a
    public final List b(d dVar) {
        c item = (c) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_fx, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_global, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_iban, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_account_number, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_exchange, null, null, 14));
    }

    @Override // pf1.a
    public final j c(d dVar) {
        c item = (c) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new h(new OpenNewPocketDestination(l.CURRENT, (AccountId) AccountId.Personal.f51414a, true));
    }
}
