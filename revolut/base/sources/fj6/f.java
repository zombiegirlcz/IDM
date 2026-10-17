package fj6;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsDelegate.Model a(dj0.d dVar) {
        return new CellDetailsDelegate.Model("breakdown.recipientGets", new t0((Clause) new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_payment_breakdown_recipient_gets, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 30712);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static aim.e b(com.revolut.feature.external_accounts.impl.domain.open_banking.payment_fees.OutboundPaymentBreakdown.CrossCurrency r7) {
        /*
            java.lang.String r0 = "breakdown"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            aim.e r0 = zhm.u.b()
            dj0.d r1 = r7.f72377a
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r1 = a(r1)
            r0.add(r1)
            com.revolut.feature.external_accounts.impl.domain.open_banking.payment_fees.OutboundPaymentBreakdown$CrossCurrency$ExchangeRate r1 = r7.f
            xi0.b r2 = r1.f72380a
            java.lang.String r2 = r2.f306286a
            java.math.BigDecimal r3 = r1.f72382c
            xi0.b r1 = r1.f72381b
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r1 = d(r2, r3, r1)
            r0.add(r1)
            dj0.d r1 = r7.e
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r1 = e(r1)
            r0.add(r1)
            com.revolut.shared.feature.market_data.models.domain.models.Charges r1 = r7.f72379c
            if (r1 == 0) goto L33
            com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown r1 = r1.f104731a
            goto L34
        L33:
            r1 = 0
        L34:
            if (r1 == 0) goto L55
            com.revolut.shared.feature.market_data.models.domain.models.Amount r2 = r1.f104722a
            java.math.BigDecimal r3 = r2.f104717a
            java.math.BigDecimal r4 = java.math.BigDecimal.ZERO
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L55
            dj0.d r2 = a.a.L(r2)
            java.util.List r1 = r1.f104723b
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r1 = f(r2, r1)
            goto L59
        L55:
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r1 = g()
        L59:
            r0.add(r1)
            dj0.d r7 = r7.f72378b
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r7 = h(r7)
            r0.add(r7)
            aim.e r1 = zhm.u.a(r0)
            r5 = 0
            r6 = 31
            r2 = 0
            r3 = 0
            r4 = 0
            yp0.b.k(r1, r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fj6.f.b(com.revolut.feature.external_accounts.impl.domain.open_banking.payment_fees.OutboundPaymentBreakdown$CrossCurrency):aim.e");
    }

    public static aim.e c(OrderQuote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        boolean z = e1.z(quote);
        Charges charges = quote.f104755g;
        Amount amount = quote.f104754c;
        aim.e eVarB = u.b();
        Amount amount2 = quote.e;
        eVarB.add(a(a.a.L(amount2)));
        if (z) {
            eVarB.add(d(amount.f104718b.f104720b, quote.f104757j.f104793b, amount2.f104718b.f104721c));
            eVarB.add(e(a.a.L(amount)));
        }
        Amount amount3 = charges.f104731a.f104722a;
        eVarB.add(amount3.f104717a.compareTo(BigDecimal.ZERO) > 0 ? f(a.a.L(amount3), !charges.f104731a.f104723b.isEmpty()) : g());
        Amount amount4 = quote.d;
        if (amount4 != null) {
            amount = amount4;
        }
        eVarB.add(h(a.a.L(amount)));
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    public static CellDetailsDelegate.Model d(String str, BigDecimal bigDecimal, xi0.b bVar) {
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_payment_breakdown_exchange_rate, null, null, 14), (Image) null, 0, false, 30);
        ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_16_arrow_rates, new ImageClauseTint.Color(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28);
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        return new CellDetailsDelegate.Model("breakdown.exchangeRate", t0Var, new CompositeClause(v.k(imageClause, new AssetClause(ONE, new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15)), str, null, o9.NON_SENSITIVE, 8), new TextClause("=", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new RateClause(bigDecimal, bVar, new RateClause.Format.ExchangeRate(true), null)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Click(30, (Integer) null, (Object) null, "breakdown.exchangeRateClick", false), null, 8), null, null, null, null, 0, null, true, false, null, null, 30712);
    }

    public static CellDetailsDelegate.Model e(dj0.d dVar) {
        return new CellDetailsDelegate.Model("breakdown.exchangedAmount", new t0((Clause) new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_payment_breakdown_exchanged_amount, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 30712);
    }

    public static CellDetailsDelegate.Model f(dj0.d dVar, boolean z) {
        return new CellDetailsDelegate.Model("breakdown.fees", new t0((Clause) new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_payment_breakdown_fees, null, null, 14), (Image) null, 0, false, 30), z ? new CompositeClause(v.k(new ImageClause(R$drawable.uikit_icn_16_info_outline, new ImageClauseTint.Color(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Click(30, (Integer) null, (Object) null, "breakdown.feesClick", false), null, 8) : new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, z, false, null, null, 30712);
    }

    public static CellDetailsDelegate.Model g() {
        return new CellDetailsDelegate.Model("breakdown.fees", new t0((Clause) new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_payment_breakdown_fees, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_payment_breakdown_no_fees, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 30712);
    }

    public static CellDetailsDelegate.Model h(dj0.d dVar) {
        return new CellDetailsDelegate.Model("breakdown.yourTotal", new t0((Clause) new TextLocalisedClause(R$string.open_banking_consent_flow_payment_initiation_payment_breakdown_your_total, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 30712);
    }
}
