package sc5;

import aw0.h;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.crypto.asset_details.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements n {
    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(new h(false, new n6(new TextLocalisedClause(R$string.crypto_asset_details_section_investment_holding_auto_earn_dialog_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.crypto_asset_details_section_investment_holding_auto_earn_dialog_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), f0.f322471a, new lw0.a(new TextLocalisedClause(R$string.crypto_asset_details_section_investment_holding_auto_earn_dialog_title, null, null, 14), new TextLocalisedClause(R$string.crypto_asset_details_section_investment_holding_auto_earn_dialog_description, u.c(new CurrencyClause(domainState.f261632a.d, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12), null, null, false, 28));
    }
}
