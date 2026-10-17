package u9j;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.retail.feature.crypto.asset_details_chart_mapping.api.R$string;
import ehe.n;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public interface a {
    static p9j.a a(a aVar, xi0.b pocketCurrency, xi0.b bVar, Clause clause, Image image, int i) {
        xi0.b bVar2 = (i & 2) != 0 ? null : bVar;
        Clause clauseF = (i & 4) != 0 ? null : clause;
        Image currencyImage = (i & 8) != 0 ? null : image;
        ((d) aVar).getClass();
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        TextLocalisedClause textLocalisedClause = bVar2 != null ? new TextLocalisedClause(R$string.crypto_asset_details_chart_mapping_revolut_stablecoins_description, v.k(new CurrencyClause(pocketCurrency, ticker, null, 4), new MoneyClause(cp5.d.d0(bVar2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), new CurrencyClause(bVar2, ticker, null, 4)), null, 12) : cp5.d.D(pocketCurrency) ? new TextLocalisedClause(R$string.crypto_asset_details_chart_mapping_stablecoin_description, n.x(pocketCurrency, ticker, null, 4), null, 12) : null;
        if (clauseF == null) {
            clauseF = d.f(pocketCurrency);
        }
        if (currencyImage == null) {
            currencyImage = new CurrencyImage(pocketCurrency.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        return new p9j.a(null, clauseF, null, textLocalisedClause, currencyImage);
    }
}
