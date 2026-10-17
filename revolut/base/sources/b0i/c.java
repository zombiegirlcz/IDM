package b0i;

import aw0.n6;
import aw0.o9;
import aw0.t0;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderRate;
import d9.e1;
import ip0.s7;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.l;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CompositeClause a(OrderQuote orderQuote) {
        Pair pair;
        OrderRate orderRate = orderQuote.f104757j;
        Amount amount = orderQuote.f104754c;
        Amount amount2 = orderQuote.e;
        BigDecimal bigDecimal = orderRate.f104793b;
        int i = d.f11676a[orderQuote.f104753b.ordinal()];
        if (i == 1) {
            pair = new Pair(amount, amount2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(amount2, amount);
        }
        Amount amount3 = (Amount) pair.f186385a;
        Amount amount4 = (Amount) pair.f186386b;
        xi0.b bVar = a.a.L(amount3).f115083b;
        xi0.b bVar2 = a.a.L(amount4).f115083b;
        if (bigDecimal.abs().compareTo(BigDecimal.valueOf(0.5d)) >= 0 || !e1.D(bigDecimal)) {
            return com.revolut.core.ui_kit.models.b.c(bVar, bVar2, bigDecimal, new RateClause.Format.Default(bVar, true), null, o9.NON_SENSITIVE);
        }
        BigDecimal bigDecimalDivide = BigDecimal.ONE.divide(bigDecimal, bigDecimal.scale(), RoundingMode.HALF_DOWN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return com.revolut.core.ui_kit.models.b.c(bVar2, bVar, bigDecimalDivide, new RateClause.Format.Default(bVar2, true), null, o9.NON_SENSITIVE);
    }

    @Override // cli.n
    public final o c(j jVar) {
        int i;
        l s7Var;
        b0i.a domainState = (b0i.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("FIRM_PRICE_DEVIANCE_PREVIOUS_PRICE", new t0((Clause) new TextLocalisedClause(R$string.cryptobuysell_exchange_firm_prices_dialog_previous, null, null, 14), (Image) null, 0, false, 30), a(domainState.f11672a), null, null, null, null, 0, null, false, false, null, null, 32760);
        Data data = domainState.f11673b;
        OrderQuote orderQuote = (OrderQuote) data.getContent();
        if (orderQuote != null) {
            i = 14;
            s7Var = new CellDetailsDelegate.Model("FIRM_PRICE_DEVIANCE_NEW_PRICE", new t0((Clause) new TextLocalisedClause(R$string.cryptobuysell_exchange_firm_prices_dialog_new, null, null, 14), (Image) null, 0, false, 30), a(orderQuote), null, null, null, null, 0, null, false, false, null, null, 32760);
        } else {
            i = 14;
            s7Var = new s7("FIRM_PRICE_DEVIANCE_NEW_PRICE", 0, 0, 0, 0, false, null, 126);
        }
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.cryptobuysell_exchange_firm_prices_dialog_title, null, null, i), new TextLocalisedClause(R$string.cryptobuysell_exchange_firm_prices_dialog_message, null, null, i), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_all_time, null, null, 6)), null, false, 24);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.cryptobuysell_market_order_confirmation_button_text, null, null, i), LargeActionButton.ButtonStyle.f58725a, null, null, data.getContent() != null, null, null, 988), null, null, 55);
        List listK = v.k(model, s7Var);
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(eVar, listK, aVar);
    }
}
