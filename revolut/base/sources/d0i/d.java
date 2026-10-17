package d0i;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.youTransactor.uCube.rpc.Constants;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h5i.g f110361a;

    public d(l4i.a amountConverter, h5i.g currencyExchangeSummaryMapper, fzh.a revPointsAmountFormatter) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(currencyExchangeSummaryMapper, "currencyExchangeSummaryMapper");
        Intrinsics.checkNotNullParameter(revPointsAmountFormatter, "revPointsAmountFormatter");
        this.f110361a = currencyExchangeSummaryMapper;
    }

    public static CompositeClause c(Clause clause, MoneyClause moneyClause) {
        Intrinsics.checkNotNullParameter(moneyClause, "<this>");
        return new CompositeClause(v.k(moneyClause, clause), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static MoneyClause d(Amount amount) {
        return new MoneyClause(a.a.L(amount), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), true, null, false, null, Constants.TAG_FC_SPEED_MODE), null, 8);
    }

    public final CellDetailsDelegate.Model a(Amount amount) {
        return new CellDetailsDelegate.Model("breakdown.exchanged", new TextLocalisedClause(R$string.cryptobuysell_exchange_summary_exchange, null, null, 14), e(amount), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public final qv0.i b(CryptoOrderDraft cryptoOrderDraft, ChargeBreakdown chargeBreakdown) {
        OrderQuote orderQuote;
        Charges charges;
        ChargeBreakdown chargeBreakdown2;
        Amount amount;
        Amount amount2 = chargeBreakdown.f104722a;
        Intrinsics.checkNotNullParameter(amount2, "amount");
        Clause clauseL = Intrinsics.f(amount2.f104718b.f104720b, "PTS") ? nub.a.l(qvb.a.e(amount2.f104717a), o9.SENSITIVE, null, null, BitmapDescriptorFactory.HUE_RED, 30) : null;
        if (clauseL == null) {
            clauseL = e(amount2);
        }
        if (cryptoOrderDraft.e == wd6.e.BUY && Intrinsics.f(cryptoOrderDraft.f96690b.f96683a.f306286a, "PTS") && cryptoOrderDraft.d == kyh.g.TOP && (orderQuote = cryptoOrderDraft.f96699q) != null && (charges = orderQuote.f104755g) != null && (chargeBreakdown2 = charges.f104731a) != null && (amount = chargeBreakdown2.d) != null) {
            clauseL = c(clauseL, d(amount));
        }
        Clause clause = clauseL;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cryptobuysell_exchange_summary_fee, null, null, 14);
        return chargeBreakdown.f104723b.isEmpty() ? new CellDetailsDelegate.Model("breakdown.fee", textLocalisedClause, new TextLocalisedClause(R.string.transaction_no_fees, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760) : amount2.f104717a.compareTo(BigDecimal.ZERO) == 0 ? new CellDetailsDelegate.Model("breakdown.fee", textLocalisedClause, clause, 0, null, null, null, null, null, false, 0, 0, 32760) : new CellDetailsActionDelegate.Model("breakdown.fee", textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), clause, null, false, false, null, null, new d4i.b(chargeBreakdown), 0, 0, 0, 0, 4192228);
    }

    public final Clause e(Amount amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        CompositeClause compositeClauseL = Intrinsics.f(amount.f104718b.f104720b, "PTS") ? nub.a.l(qvb.a.e(amount.f104717a), o9.SENSITIVE, null, null, BitmapDescriptorFactory.HUE_RED, 62) : null;
        return compositeClauseL == null ? l4i.a.d(amount) ? new MoneyClause(l4i.a.b(amount), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : e4i.c.a(amount, null, null, null, null, null, 63) : compositeClauseL;
    }
}
