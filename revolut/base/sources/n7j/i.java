package n7j;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.commodity.order_flow.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wul.j f213169a;

    public i(wul.j scheduleSettingsMapper) {
        Intrinsics.checkNotNullParameter(scheduleSettingsMapper, "scheduleSettingsMapper");
        this.f213169a = scheduleSettingsMapper;
    }

    public static AssetClause f(Amount amount) throws Throwable {
        AssetClauseType money;
        BigDecimal bigDecimal = amount.f104717a;
        Asset asset = amount.f104718b;
        int i = h.f213168c[asset.f104719a.ordinal()];
        if (i == 1) {
            money = new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        } else if (i == 2) {
            money = new AssetClauseType.Commodity(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        } else if (i == 3) {
            money = new AssetClauseType.Crypto(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        } else if (i == 4) {
            money = new AssetClauseType.Stock(0);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            hx7.e.n(new IllegalStateException("Undefined asset type: amount=" + amount.f104717a + ", assetType=" + asset.f104719a + ", symbol=" + asset.f104720b));
            money = new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        }
        return new AssetClause(bigDecimal, money, asset.f104720b, null, null, 24);
    }

    public static Amount g(OrderQuote orderQuote, String str) {
        Asset asset;
        Charges charges = orderQuote.f104755g;
        Amount amount = charges.f104731a.f104724c;
        if (Intrinsics.f((amount == null || (asset = amount.f104718b) == null) ? null : asset.f104720b, str)) {
            return charges.f104731a.f104724c;
        }
        if (Intrinsics.f(charges.f104731a.f104722a.f104718b.f104720b, str)) {
            return charges.f104731a.f104722a;
        }
        return null;
    }

    public final CellDetailsDelegate.Model a(OrderQuote orderQuote, wd6.e exchangeMode, String targetCurrencyCode) {
        Amount amount;
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(targetCurrencyCode, "targetCurrencyCode");
        f8l.b bVar = orderQuote.f104752a;
        Amount amount2 = orderQuote.e;
        Amount amount3 = orderQuote.f104754c;
        int[] iArr = h.f213167b;
        int i = iArr[bVar.ordinal()];
        if (i == 1) {
            amount = amount2;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            amount = amount3;
        }
        boolean zF = Intrinsics.f(amount.f104718b.f104720b, e1.t(orderQuote).f104720b);
        f8l.b bVar2 = orderQuote.f104753b;
        f8l.b bVar3 = f8l.b.TO;
        if (bVar2 == bVar3 && zF) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_commodities_order_flow_common_cell_estimated_total_units, null, null, 14);
        } else if (bVar2 != bVar3 || zF) {
            f8l.b bVar4 = f8l.b.FROM;
            if (bVar2 == bVar4 && zF) {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_commodities_order_flow_common_cell_estimated_total_units, null, null, 14);
            } else {
                if (bVar2 != bVar4 || zF) {
                    throw new IllegalStateException("Unexpected state " + exchangeMode + " && " + e1.k(orderQuote).f104719a);
                }
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_commodities_order_flow_common_cell_estimated_total_credit, null, null, 14);
            }
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_commodities_order_flow_common_cell_estimated_total_cost, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        int i2 = iArr[orderQuote.f104752a.ordinal()];
        if (i2 == 1) {
            amount2 = orderQuote.d;
            if (amount2 == null) {
                amount2 = amount3;
            }
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Amount amount4 = orderQuote.f;
            if (amount4 != null) {
                amount2 = amount4;
            }
        }
        return new CellDetailsDelegate.Model("SUMMARY_ESTIMATED_TOTAL_VALUE", textLocalisedClause2, f(amount2), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public final qv0.i b(OrderQuote orderQuote, String targetCurrencyCode) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(targetCurrencyCode, "targetCurrencyCode");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_commodities_order_flow_common_cell_fees, null, null, 14);
        Charges charges = orderQuote.f104755g;
        if (charges.f104731a.f104723b.isEmpty()) {
            return new CellDetailsDelegate.Model("SUMMARY_FEES", textLocalisedClause, new TextLocalisedClause(R.string.transaction_no_fees, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760);
        }
        ChargeBreakdown chargeBreakdown = charges.f104731a;
        ChargeBreakdown chargeBreakdown2 = charges.f104731a;
        if (chargeBreakdown.f104722a.f104717a.compareTo(BigDecimal.ZERO) == 0) {
            Amount amountG = g(orderQuote, targetCurrencyCode);
            if (amountG == null) {
                amountG = chargeBreakdown2.f104722a;
            }
            return new CellDetailsDelegate.Model("SUMMARY_FEES", textLocalisedClause, f(amountG), 0, null, null, null, null, null, false, 0, 0, 32760);
        }
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
        Amount amountG2 = g(orderQuote, targetCurrencyCode);
        if (amountG2 == null) {
            amountG2 = chargeBreakdown2.f104722a;
        }
        return new CellDetailsActionDelegate.Model("SUMMARY_FEES", textLocalisedClause, 0, resourceImage, f(amountG2), null, false, false, null, null, new f(chargeBreakdown2), 0, 0, 0, 0, 4192228);
    }

    public final CellDetailsDelegate.Model c(OrderQuote orderQuote) {
        Amount amount;
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        int i = h.f213167b[orderQuote.f104752a.ordinal()];
        if (i == 1) {
            amount = orderQuote.e;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            amount = orderQuote.f104754c;
        }
        return new CellDetailsDelegate.Model("SUMMARY_VALUE_IN_INPUT_CURRENCY", Intrinsics.f(amount.f104718b.f104720b, e1.t(orderQuote).f104720b) ? new TextLocalisedClause(R$string.wealth_commodities_order_flow_common_cell_amount, null, null, 14) : new TextLocalisedClause(R$string.wealth_commodities_order_flow_common_cell_units, null, null, 14), new MoneyClause(a.a.L(amount), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public final qv0.i d(OrderQuote orderQuote) {
        int i;
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        f8l.e eVar = orderQuote.k;
        int[] iArr = h.f213166a;
        int i2 = iArr[eVar.ordinal()];
        if (i2 == 1) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_commodities_order_flow_common_cell_price, null, null, 14);
            xi0.a aVar = xi0.b.Companion;
            Intrinsics.checkNotNullParameter(orderQuote, "<this>");
            String str = e1.i(orderQuote, orderQuote.f104753b).f104718b.f104720b;
            aVar.getClass();
            return new CellDetailsActionDelegate.Model("SUMMARY_PRICE", textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), com.revolut.core.ui_kit.models.b.c(xi0.a.a(str), xi0.a.a(e1.t(orderQuote).f104720b), orderQuote.f104757j.f104792a, new RateClause.Format.ExchangeRate(true), null, o9.NON_SENSITIVE), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
        }
        if (i2 != 2 && i2 != 3) {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException(eVar + " type is not supported");
        }
        int i3 = iArr[eVar.ordinal()];
        if (i3 == 2) {
            i = R$string.wealth_commodities_order_flow_common_cell_stop_price;
        } else {
            if (i3 != 3) {
                throw new IllegalStateException(eVar + " type is not supported");
            }
            i = R$string.wealth_commodities_order_flow_common_cell_limit_price;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, null, null, 14);
        BigDecimal bigDecimal = orderQuote.f104758l;
        if (bigDecimal == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        xi0.a aVar2 = xi0.b.Companion;
        String str2 = e1.t(orderQuote).f104720b;
        aVar2.getClass();
        return new CellDetailsDelegate.Model("SUMMARY_PRICE", textLocalisedClause2, new RateClause(bigDecimal, xi0.a.a(str2), new RateClause.Format.ExchangeRate(true), null), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.CellDetailsDelegate.Model e(com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r24, java.lang.String r25) {
        /*
            r23 = this;
            r0 = r24
            java.lang.String r1 = "orderQuote"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "targetCurrencyCode"
            r2 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r2 = new com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model
            com.revolut.core.ui_kit.models.TextLocalisedClause r4 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.retail.feature.commodity.order_flow.impl.R$string.wealth_commodities_order_flow_common_cell_traded_value
            r3 = 0
            r5 = 14
            r4.<init>(r1, r3, r3, r5)
            com.revolut.shared.feature.market_data.models.domain.models.Amount r1 = g(r24, r25)
            f8l.b r3 = r0.f104752a
            com.revolut.shared.feature.market_data.models.domain.models.Amount r5 = r0.f104754c
            com.revolut.shared.feature.market_data.models.domain.models.Amount r6 = r0.e
            f8l.b r0 = r0.f104753b
            int[] r7 = n7j.h.f213167b
            int r0 = r0.ordinal()
            r0 = r7[r0]
            r7 = 1
            if (r0 == r7) goto L6a
            r7 = 2
            if (r0 != r7) goto L64
            f8l.b r0 = f8l.b.TO
            if (r3 != r0) goto L4d
            if (r1 == 0) goto L97
            com.revolut.shared.feature.market_data.models.domain.models.Asset r0 = r6.f104718b
            java.lang.String r0 = r0.f104720b
            com.revolut.shared.feature.market_data.models.domain.models.Asset r3 = r1.f104718b
            java.lang.String r3 = r3.f104720b
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r3)
            if (r0 == 0) goto L97
            com.revolut.shared.feature.market_data.models.domain.models.Amount r5 = a.a.x(r6, r1)
            goto L97
        L4d:
            if (r1 == 0) goto L62
            com.revolut.shared.feature.market_data.models.domain.models.Asset r0 = r5.f104718b
            java.lang.String r0 = r0.f104720b
            com.revolut.shared.feature.market_data.models.domain.models.Asset r3 = r1.f104718b
            java.lang.String r3 = r3.f104720b
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r3)
            if (r0 == 0) goto L62
            com.revolut.shared.feature.market_data.models.domain.models.Amount r5 = a.a.u(r5, r1)
            goto L97
        L62:
            r5 = r6
            goto L97
        L64:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L6a:
            f8l.b r0 = f8l.b.FROM
            if (r3 != r0) goto L83
            if (r1 == 0) goto L62
            com.revolut.shared.feature.market_data.models.domain.models.Asset r0 = r5.f104718b
            java.lang.String r0 = r0.f104720b
            com.revolut.shared.feature.market_data.models.domain.models.Asset r3 = r1.f104718b
            java.lang.String r3 = r3.f104720b
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r3)
            if (r0 == 0) goto L62
            com.revolut.shared.feature.market_data.models.domain.models.Amount r5 = a.a.u(r5, r1)
            goto L97
        L83:
            if (r1 == 0) goto L97
            com.revolut.shared.feature.market_data.models.domain.models.Asset r0 = r6.f104718b
            java.lang.String r0 = r0.f104720b
            com.revolut.shared.feature.market_data.models.domain.models.Asset r3 = r1.f104718b
            java.lang.String r3 = r3.f104720b
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r3)
            if (r0 == 0) goto L97
            com.revolut.shared.feature.market_data.models.domain.models.Amount r5 = a.a.x(r6, r1)
        L97:
            com.revolut.core.ui_kit.models.AssetClause r5 = f(r5)
            r21 = 0
            r22 = 1048552(0xfffe8, float:1.469334E-39)
            java.lang.String r3 = "SUMMARY_TRADED_VALUE"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n7j.i.e(com.revolut.shared.feature.market_data.models.domain.models.OrderQuote, java.lang.String):com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model");
    }
}
