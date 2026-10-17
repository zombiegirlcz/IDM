package wul;

import aw0.o9;
import aw0.t0;
import aw0.u0;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.r2;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.trading.core.domain.orders.InvestMarginOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.retail.wealth.resources.R$plurals;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import dfl.o0;
import dfl.r;
import dfl.x;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements xul.l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpj.f f300244a;

    public m(l4i.a amountConverter, kpj.f wealthAccountHeaderUiMapper) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        this.f300244a = wealthAccountHeaderUiMapper;
    }

    public static TextLocalisedQuantityClause m(BigDecimal bigDecimal) {
        return new TextLocalisedQuantityClause(R$plurals.wealth_trading_orders_list_units_value, Integer.valueOf(bigDecimal.setScale(0, RoundingMode.UP).intValue()), u.c((bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).toPlainString()), (Style) null, 24);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List p(wul.m r41, xul.k r42, com.revolut.shared.feature.market_data.models.domain.models.Amount r43, com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown r44, dj0.d r45, com.revolut.shared.feature.market_data.models.domain.models.Amount r46, dj0.d r47, bfl.g r48, f8l.e r49, xul.c r50, dfl.r r51, boolean r52, nel.z r53, boolean r54, java.math.BigDecimal r55, dj0.d r56, dj0.d r57, com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown r58, k4l.e0 r59, java.lang.Integer r60, int r61) {
        /*
            Method dump skipped, instruction units count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wul.m.p(wul.m, xul.k, com.revolut.shared.feature.market_data.models.domain.models.Amount, com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown, dj0.d, com.revolut.shared.feature.market_data.models.domain.models.Amount, dj0.d, bfl.g, f8l.e, xul.c, dfl.r, boolean, nel.z, boolean, java.math.BigDecimal, dj0.d, dj0.d, com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown, k4l.e0, java.lang.Integer, int):java.util.List");
    }

    public static AssetClause q(Amount amount) {
        return e4i.c.a(amount, null, null, null, null, o9.NON_SENSITIVE, 31);
    }

    public static MoneyClause r(dj0.d dVar) {
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
    }

    public final qv0.i b(TradingAccount tradingAccount, hel.b bVar, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        n2l.j jVarB = n2l.l.b(tradingAccount);
        if (jVarB != null) {
            if ((jVarB instanceof n2l.i) || (jVarB instanceof n2l.e) || (jVarB instanceof n2l.d) || (jVarB instanceof n2l.c) || (jVarB instanceof n2l.g)) {
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_trade_info_account, null, null, 14);
                TextLocalisedClause textLocalisedClauseH = this.f300244a.h(jVarB, bVar, null);
                return textLocalisedClause != null ? new CellDetailsNoteDelegate.Model("ACCOUNT_NAME_ROW_ID", textLocalisedClause2, null, textLocalisedClause, null, false, null, textLocalisedClauseH, r2.f54655a, null, null, 0, 130292) : new CellDetailsDelegate.Model("ACCOUNT_NAME_ROW_ID", textLocalisedClause2, textLocalisedClauseH, 0, null, null, null, u0.LARGE, null, false, 0, 0, 32632);
            }
            if (!(jVarB instanceof n2l.a) && !(jVarB instanceof n2l.b) && !(jVarB instanceof n2l.h) && !(jVarB instanceof n2l.f)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    public final qv0.i c(bfl.g tradeSide, r rVar, dj0.d dVar, r0 r0Var, z zVar) {
        int i;
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        dj0.d totalMoney = dVar;
        Intrinsics.checkNotNullParameter(totalMoney, "totalMoney");
        int i2 = l.f300242c[tradeSide.ordinal()];
        if (i2 == 1) {
            i = (rVar != null ? l.f300241b[rVar.ordinal()] : -1) == 2 ? R$string.wealth_trade_list_estimated_total_cost : R$string.wealth_trade_list_amount;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = (rVar != null ? l.f300241b[rVar.ordinal()] : -1) == 2 ? R$string.wealth_trade_list_estimated_total_credit : R$string.wealth_trade_list_net_amount;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        z zVar2 = z.CFD;
        if (zVar == zVar2) {
            totalMoney = totalMoney.a();
        }
        MoneyClause moneyClauseR = r(totalMoney);
        return (rVar != r.STOCK_QUANTITY || r0Var == r0.MARKET || zVar == zVar2) ? false : true ? new CellDetailsActionDelegate.Model("TOTAL_VALUE_ROW_ID", textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), moneyClauseR, null, false, false, null, null, new xul.a(tradeSide, r0Var), 0, 0, 0, 0, 4192228) : new CellDetailsDelegate.Model("TOTAL_VALUE_ROW_ID", textLocalisedClause, moneyClauseR, 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public final qv0.i d(dfl.a exchangedValue, xul.d dVar) {
        Intrinsics.checkNotNullParameter(exchangedValue, "exchangedValue");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trade_list_exchanged, null, null, 14);
        MoneyClause moneyClause = new MoneyClause(oi0.d.a0(exchangedValue), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        return dVar == null ? new CellDetailsDelegate.Model("EXCHANGED_ROW_ID", textLocalisedClause, moneyClause, 0, null, null, null, null, null, false, 0, 0, 32760) : new CellDetailsActionDelegate.Model("EXCHANGED_ROW_ID", textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), moneyClause, null, false, false, null, null, dVar, 0, 0, 0, 0, 4192228);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qv0.i e(com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown r26, k4l.r0 r27, xi0.b r28, com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown r29, k4l.e0 r30, java.lang.Integer r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wul.m.e(com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown, k4l.r0, xi0.b, com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown, k4l.e0, java.lang.Integer, boolean):qv0.i");
    }

    public final CellDetailsDelegate.Model f(o0 o0Var, String currentUserId) {
        Clause textClause;
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        Intrinsics.checkNotNullParameter("MADE_BY_ROW_ID", "listId");
        if (o0Var != null) {
            String str = o0Var.f114447b;
            if (str == null) {
                str = o0Var.f;
            }
            String str2 = str;
            if (Intrinsics.f(currentUserId, o0Var.f114446a)) {
                textClause = new TextLocalisedClause(R$string.wealth_trade_info_made_by_you, null, null, 14);
            } else if (str2 != null) {
                textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            return new CellDetailsDelegate.Model("MADE_BY_ROW_ID", new t0((Clause) new TextLocalisedClause(R$string.wealth_trade_info_made_by_title, null, null, 14), (Image) null, 0, false, 30), textClause, null, null, null, null, 0, null, false, false, null, null, 32760);
        }
        return null;
    }

    public final CellDetailsDelegate.Model g() {
        return new CellDetailsDelegate.Model("LIST_ID_UNIFIED_FEE", new t0((Clause) new TextLocalisedClause(R$string.market_data_transaction_breakdown_fees, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.wealth_trade_list_fee_no_fees, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public final qv0.i h(InvestOrder order, String listId, InvestOrder investOrder) {
        int i;
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(listId, "listId");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trade_info_status, null, null, 14);
        k4l.o0 state = order.getI();
        Intrinsics.checkNotNullParameter(state, "state");
        int[] iArr = l.f;
        int i2 = iArr[state.ordinal()];
        if (i2 == 1) {
            i = R$string.wealth_order_partially_executed_title;
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new IllegalStateException(("State " + state + " is not supported").toString());
            }
            i = R$string.wealth_order_pending_title;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, null, null, 14);
        return iArr[order.getI().ordinal()] == 1 ? new CellDetailsActionDelegate.Model(listId, textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), textLocalisedClause2, null, false, false, null, null, investOrder, 0, 0, 0, 0, 4192228) : new CellDetailsDelegate.Model(listId, textLocalisedClause, textLocalisedClause2, 0, investOrder, null, null, null, null, false, 0, 0, 32744);
    }

    public final qv0.i i(f8l.e eVar, Amount stockAmount, dj0.d dVar, Amount amount, dj0.d dVar2, boolean z, z zVar, boolean z3, BigDecimal bigDecimal) {
        int i;
        char c2;
        Clause textLocalisedQuantityClause;
        Clause moneyClause;
        BigDecimal bigDecimalJ;
        String str;
        Asset asset;
        dj0.d marketPrice = dVar;
        Intrinsics.checkNotNullParameter(stockAmount, "stockAmount");
        Intrinsics.checkNotNullParameter(marketPrice, "marketPrice");
        int i2 = eVar == null ? -1 : l.f300243g[eVar.ordinal()];
        if (i2 == -1 || i2 == 1) {
            i = R$string.wealth_trade_list_price;
        } else if (i2 == 2) {
            i = R$string.wealth_trading_orders_limit_price;
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return null;
            }
            i = R$string.wealth_trading_orders_stop_price;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        if (eVar != f8l.e.MARKET && eVar != null) {
            if (dVar2 != null) {
                return new CellDetailsDelegate.Model("PRICE_ROW_ID", textLocalisedClause, new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760);
            }
            return null;
        }
        int i3 = z ? R$attr.uikit_colorAccent : R$attr.uikit_colorForeground;
        int i5 = zVar == null ? -1 : l.e[zVar.ordinal()];
        if (i5 == 1) {
            c2 = 2;
            textLocalisedQuantityClause = new TextLocalisedQuantityClause(z3 ? R$plurals.wealth_trading_orders_list_lots_value : R$plurals.wealth_trading_orders_list_bonds_value, (Number) 1, (List) null, (Style) new Custom(Integer.valueOf(i3), false, null, false, null, 254), 12);
        } else if (i5 != 2) {
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            textLocalisedQuantityClause = AssetClause.b(q(Amount.a(stockAmount, ONE)), new Custom(Integer.valueOf(i3), false, null, false, null, 254));
            c2 = 2;
        } else {
            c2 = 2;
            textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.wealth_trading_orders_list_notes_value, (Number) 1, (List) null, (Style) new Custom(Integer.valueOf(i3), false, null, false, null, 254), 12);
        }
        Clause[] clauseArr = new Clause[3];
        clauseArr[0] = textLocalisedQuantityClause;
        clauseArr[1] = new TextClause("=", (Style) new Custom(Integer.valueOf(i3), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        switch (zVar != null ? l.e[zVar.ordinal()] : -1) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                if (amount != null) {
                    marketPrice = l4i.a.b(amount);
                }
                moneyClause = new MoneyClause(marketPrice, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(i3), false, null, false, null, 254), o9.NON_SENSITIVE);
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                if (amount == null || (bigDecimalJ = amount.f104717a) == null) {
                    bigDecimalJ = pyd.c.j(marketPrice);
                }
                if (z3) {
                    if (bigDecimal == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    bigDecimalJ = bigDecimalJ.multiply(bigDecimal);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalJ, "multiply(...)");
                }
                AssetClauseType.Money money = new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, ScaleMode.TradingPrecise.f51443a, false, false, 5));
                if (amount == null || (asset = amount.f104718b) == null || (str = asset.f104720b) == null) {
                    str = marketPrice.f115083b.f306286a;
                }
                moneyClause = new AssetClause(bigDecimalJ, money, str, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), o9.NON_SENSITIVE);
                break;
        }
        clauseArr[c2] = moneyClause;
        return new CellDetailsActionDelegate.Model("PRICE_ROW_ID", textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_24_arrow_rates, (Integer) null, (Integer) null, Integer.valueOf(i3), (List) null, (ImageTransformations) null, (Clause) null, 246), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(clauseArr)), false, false, null, new xul.e(zVar, z3), 0, 0, 32224);
    }

    public final CellDetailsNoteDelegate.Model j(Instant instant, bfl.g tradeSide) {
        Clause textLocalisedClause;
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        int i = l.f300242c[tradeSide.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (instant != null) {
            long epochMilli = instant.toEpochMilli();
            TimeClause.Format.INSTANCE.getClass();
            textLocalisedClause = new TimeClause(epochMilli, TimeClause.Format.f57959a, null, ZoneOffset.UTC, 4);
        } else {
            textLocalisedClause = new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_settlement_date_to_confirm, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
        }
        return new CellDetailsNoteDelegate.Model("SETTLEMENT_DATE_ID", new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_settlement_date_title, null, null, 14), null, null, null, false, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), textLocalisedClause, null, null, null, 0, 130676);
    }

    public final qv0.i k(r0 r0Var, r rVar, Amount stockAmount, z zVar, boolean z) {
        Clause clause;
        Clause textClause;
        Clause clauseM;
        Intrinsics.checkNotNullParameter(stockAmount, "stockAmount");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(zVar == z.STRUCTURED_NOTE ? R$string.wealth_trading_orders_list_notes : rVar == r.MONEY_AMOUNT ? R$string.wealth_trade_list_estimated_shares : ((rVar == r.STOCK_QUANTITY || rVar == null) && zVar == z.BOND) ? z ? R$string.wealth_trading_orders_list_units : R$string.wealth_trading_transaction_list_quantity : zVar == z.CFD ? R$string.wealth_trading_orders_list_units : R$string.wealth_trade_list_shares, null, null, 14);
        int i = zVar == null ? -1 : l.e[zVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    clauseM = m(stockAmount.f104717a);
                } else if (i != 4) {
                    clauseM = q(stockAmount);
                } else {
                    textClause = new NumberClause(stockAmount.f104717a, new NumberClause.Format.AllDigitsAfterDot(null, null, 3), null, null, 12);
                }
                clause = clauseM;
            } else {
                BigDecimal bigDecimal = stockAmount.f104717a;
                textClause = new TextLocalisedQuantityClause(R$plurals.wealth_trading_orders_list_notes_value, Integer.valueOf(bigDecimal.setScale(0, RoundingMode.UP).intValue()), u.c((bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).toPlainString()), (Style) null, 24);
            }
            clause = textClause;
        } else {
            TextLocalisedQuantityClause textLocalisedQuantityClauseM = z ? null : m(stockAmount.f104717a);
            if (textLocalisedQuantityClauseM == null) {
                BigDecimal bigDecimal2 = stockAmount.f104717a;
                String plainString = (bigDecimal2.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal2.stripTrailingZeros()).toPlainString();
                Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                textClause = new TextClause(plainString, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                clause = textClause;
            } else {
                clause = textLocalisedQuantityClauseM;
            }
        }
        return (rVar != r.MONEY_AMOUNT || r0Var == r0.MARKET) ? new CellDetailsDelegate.Model("SHARES_ROW_ID", textLocalisedClause, clause, 0, null, null, null, null, null, false, 0, 0, 32760) : new CellDetailsActionDelegate.Model("SHARES_ROW_ID", textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), clause, null, false, false, null, null, new xul.h(r0Var), 0, 0, 0, 0, 4192228);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.CellDetailsDelegate.Model l(xul.k r26, com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown r27, bfl.g r28, xul.c r29, nel.z r30) {
        /*
            r25 = this;
            r0 = r27
            r1 = r29
            java.lang.String r2 = "tradeSide"
            r3 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "orderState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            if (r0 == 0) goto L1c
            com.revolut.shared.feature.market_data.models.domain.models.Amount r0 = r0.f104722a
            if (r0 == 0) goto L1c
            dj0.d r0 = l4i.a.b(r0)
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r26 == 0) goto L24
            dj0.d r4 = r26.e0()
            goto L25
        L24:
            r4 = r2
        L25:
            if (r4 == 0) goto L49
            long r5 = r4.f115082a
            if (r0 == 0) goto L49
            long r7 = r0.f115082a
            int[] r0 = wul.l.f300242c
            int r3 = r3.ordinal()
            r0 = r0[r3]
            r3 = 2
            r9 = 1
            if (r0 == r9) goto L43
            if (r0 != r3) goto L3d
            long r5 = r5 + r7
            goto L44
        L3d:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L43:
            long r5 = r5 - r7
        L44:
            dj0.d r0 = dj0.d.c(r4, r5, r2, r3)
            goto L4a
        L49:
            r0 = r2
        L4a:
            nel.z r3 = nel.z.CFD
            r4 = r30
            if (r4 == r3) goto L90
            xul.c r3 = xul.c.CANCELLED_OR_DECLINED
            if (r1 == r3) goto L90
            if (r0 == 0) goto L90
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r4 = new com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.retail.wealth.resources.R$string.wealth_trade_list_traded_value
            r3 = 14
            r6.<init>(r1, r2, r2, r3)
            if (r0 == 0) goto L88
            com.revolut.core.ui_kit.models.MoneyClause r7 = r(r0)
            r23 = 0
            r24 = 1048552(0xfffe8, float:1.469334E-39)
            java.lang.String r5 = "EXCHANGED_ROW_ID"
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
            r21 = 0
            r22 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r4
        L88:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            r0.<init>(r1)
            throw r0
        L90:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wul.m.l(xul.k, com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown, bfl.g, xul.c, nel.z):com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model");
    }

    public final List n(InvestMarginOrder investOrder, ChargeBreakdown chargeBreakdown, nel.n nVar) {
        r rVar;
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        dj0.d dVar = investOrder.f104558r;
        if (dVar == null) {
            dVar = investOrder.f104559s;
        }
        xul.j jVar = new xul.j(dVar);
        BigDecimal bigDecimalC = com.revolut.retail.trading.core.domain.orders.a.c(investOrder);
        f8l.c cVar = f8l.c.SECURITY;
        String str = investOrder.o;
        xi0.a aVar = xi0.b.Companion;
        String strH = com.revolut.retail.trading.core.domain.orders.a.h(investOrder);
        aVar.getClass();
        Amount amount = new Amount(bigDecimalC, new Asset(cVar, str, xi0.a.a(strH)));
        Intrinsics.checkNotNullParameter(investOrder, "<this>");
        ej0.b bVar = investOrder.u;
        if (bVar == null) {
            bVar = investOrder.v;
        }
        dj0.d dVarD = bVar != null ? d9.t0.D(bVar, nVar) : null;
        ej0.b bVar2 = investOrder.E;
        dj0.d dVarD2 = bVar2 != null ? d9.t0.D(bVar2, nVar) : null;
        bfl.g gVar = investOrder.f104551h;
        dfl.q qVar = investOrder.G;
        if (qVar instanceof dfl.a) {
            rVar = r.MONEY_AMOUNT;
        } else {
            if (!(qVar instanceof x)) {
                throw new NoWhenBranchMatchedException();
            }
            rVar = r.STOCK_QUANTITY;
        }
        return p(this, jVar, amount, chargeBreakdown, dVarD, null, dVarD2, gVar, t1.V(investOrder.f104552j), qk.d.I(investOrder.i), rVar, false, investOrder.d, false, null, investOrder.H, investOrder.I, null, null, null, 77824);
    }

    public final List o(InvestOrder.InvestSecuritiesOrder investOrder, ChargeBreakdown chargeBreakdown) {
        r rVar;
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        dj0.d v = investOrder.getV();
        if (v == null) {
            v = investOrder.getU();
        }
        xul.j jVar = new xul.j(v);
        BigDecimal bigDecimalD = com.revolut.retail.trading.core.domain.orders.a.d(investOrder);
        f8l.c cVar = f8l.c.SECURITY;
        String o = investOrder.getO();
        xi0.a aVar = xi0.b.Companion;
        String strJ = com.revolut.retail.trading.core.domain.orders.a.j(investOrder);
        aVar.getClass();
        Amount amount = new Amount(bigDecimalD, new Asset(cVar, o, xi0.a.a(strJ)));
        dj0.d dVarF = com.revolut.retail.trading.core.domain.orders.a.f(investOrder);
        dj0.d f104638n = investOrder.getF104638n();
        bfl.g f104634h = investOrder.getF104634h();
        dfl.q f104639p = investOrder.getF104639p();
        if (f104639p instanceof dfl.a) {
            rVar = r.MONEY_AMOUNT;
        } else {
            if (!(f104639p instanceof x)) {
                throw new NoWhenBranchMatchedException();
            }
            rVar = r.STOCK_QUANTITY;
        }
        return p(this, jVar, amount, chargeBreakdown, dVarF, null, f104638n, f104634h, t1.V(investOrder.getF104635j()), qk.d.I(investOrder.getI()), rVar, false, investOrder.getD(), false, null, null, null, null, null, null, 77824);
    }
}
