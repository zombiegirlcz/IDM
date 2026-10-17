package wzh;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.crypto.config.api.models.CryptoPeggedPair;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import wd6.h;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        Clause textLocalisedClause;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CryptoPeggedPair cryptoPeggedPair = domainState.f301423c;
        h hVar = domainState.f301421a;
        h hVar2 = h.MARKET;
        if (hVar == hVar2 && cryptoPeggedPair != null) {
            xi0.b bVar = cryptoPeggedPair.f70777a;
            int i = R$string.cryptobuysell_stablecoin_explanation_dialog_description;
            CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
            textLocalisedClause = new TextLocalisedClause(i, v.k(new CurrencyClause(bVar, ticker, null, 4), new CurrencyClause(bVar, ticker, null, 4), new MoneyClause(new dj0.d(100L, cryptoPeggedPair.f70778b), new MoneyClause.Format.Defaults(null, null, false, false, 7), null, null, 12), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "CRYPTO_PRICE_EXPLANATION_TEXT_ID", false), 10)), null, 12);
        } else if (hVar == hVar2 || hVar == h.TAKE_PROFIT_STOP_LOSS) {
            textLocalisedClause = new TextLocalisedClause(R$string.cryptobuysell_price_explanation_dialog_description, u.c(new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "CRYPTO_PRICE_EXPLANATION_TEXT_ID", false), 10)), null, 12);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Not expected to get price dialog for " + hVar + " type of order");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            m70.a.c(t0.f186434a);
            textLocalisedClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), f0.f322471a, new lw0.a(new TextLocalisedClause(R$string.cryptobuysell_transaction_breakdown_rate, null, null, 14), textLocalisedClause, null, null, false, 28));
    }
}
