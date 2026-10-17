package pnh;

import aw0.k7;
import aw0.o9;
import aw0.t0;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.ui.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import dfl.h0;
import dfl.i0;
import dfl.s0;
import ip0.f6;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 implements cli.n {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kbh.f f237775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f237776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xul.l f237777c;
    public final rnh.i d;
    public final rnh.b e;
    public final rnh.o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rnh.g f237778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rnh.j f237779h;
    public final rnh.k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rnh.l f237780j;
    public final h8b.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wfl.b f237781l;

    public g0(kbh.f tradeUiDataMapper, l80.e dateProvider, xul.l stockOrderUnifiedInfoGroupMapper, rnh.i marginTradeInfoMapper, rnh.b exchangeTradeDetailsMapper, rnh.o transferTradeDetailsMapper, rnh.c feeTradeDetailsMapper, rnh.g investFundTradeDetailsMapper, rnh.j mergerDetailsMapper, rnh.k spinOffDetailsMapper, rnh.l stockSplitDetailsMapper, h8b.c infoMapperWrapper, wfl.b wealthTradeClauseFactory) {
        Intrinsics.checkNotNullParameter(tradeUiDataMapper, "tradeUiDataMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(stockOrderUnifiedInfoGroupMapper, "stockOrderUnifiedInfoGroupMapper");
        Intrinsics.checkNotNullParameter(marginTradeInfoMapper, "marginTradeInfoMapper");
        Intrinsics.checkNotNullParameter(exchangeTradeDetailsMapper, "exchangeTradeDetailsMapper");
        Intrinsics.checkNotNullParameter(transferTradeDetailsMapper, "transferTradeDetailsMapper");
        Intrinsics.checkNotNullParameter(feeTradeDetailsMapper, "feeTradeDetailsMapper");
        Intrinsics.checkNotNullParameter(investFundTradeDetailsMapper, "investFundTradeDetailsMapper");
        Intrinsics.checkNotNullParameter(mergerDetailsMapper, "mergerDetailsMapper");
        Intrinsics.checkNotNullParameter(spinOffDetailsMapper, "spinOffDetailsMapper");
        Intrinsics.checkNotNullParameter(stockSplitDetailsMapper, "stockSplitDetailsMapper");
        Intrinsics.checkNotNullParameter(infoMapperWrapper, "infoMapperWrapper");
        Intrinsics.checkNotNullParameter(wealthTradeClauseFactory, "wealthTradeClauseFactory");
        this.f237775a = tradeUiDataMapper;
        this.f237776b = dateProvider;
        this.f237777c = stockOrderUnifiedInfoGroupMapper;
        this.d = marginTradeInfoMapper;
        this.e = exchangeTradeDetailsMapper;
        this.f = transferTradeDetailsMapper;
        this.f237778g = investFundTradeDetailsMapper;
        this.f237779h = mergerDetailsMapper;
        this.i = spinOffDetailsMapper;
        this.f237780j = stockSplitDetailsMapper;
        this.k = infoMapperWrapper;
        this.f237781l = wealthTradeClauseFactory;
    }

    public static List b(Boolean bool, Instant instant) {
        CellDetailsActionDelegate.Model model = null;
        if (instant != null) {
            TextLocalisedClause textLocalisedClause = Intrinsics.f(bool, Boolean.TRUE) ? new TextLocalisedClause(R$string.trading_cash_estimated_settlement_date_title, null, null, 14) : new TextLocalisedClause(R$string.trading_cash_settlement_date_title, null, null, 14);
            long epochMilli = instant.toEpochMilli();
            TimeClause.Format.INSTANCE.getClass();
            model = new CellDetailsActionDelegate.Model("CASH_SETTLEMENT_DATE_ID", textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TimeClause(epochMilli, TimeClause.Format.f57959a, null, ZoneOffset.UTC, 4), false, false, null, null, 0, 0, 32736);
        }
        return zhm.v.l(model);
    }

    public static CellDetailsActionDelegate.Model e(int i, String str, String str2) {
        return new CellDetailsActionDelegate.Model(str, new TextLocalisedClause(i, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_globe, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R.string.common_action_view, null, null, 14), false, false, null, new l(str2), 0, 0, 32224);
    }

    public static List f(i0 i0Var, nel.n nVar, jel.c cVar, hel.b bVar) {
        jel.c0 c0Var;
        String str;
        String str2;
        qv0.i f6Var;
        model = null;
        CellDetailsDelegate.Model model = null;
        model = null;
        CellDetailsDelegate.Model model2 = null;
        if (i0Var instanceof dfl.f0) {
            if (!(cVar instanceof jel.q)) {
                String str3 = ((dfl.f0) i0Var).D;
                qv0.i[] elements = {str3 != null ? h(str3) : null, k(nVar), j(nVar)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.L(elements);
            }
            jel.q qVar = (jel.q) cVar;
            String str4 = qVar.f173543g;
            String str5 = qVar.f173544h;
            String str6 = ((dfl.f0) i0Var).D;
            qv0.i[] elements2 = {str6 != null ? h(str6) : null, k(nVar), new CellDetailsDelegate.Model("FUND_ROW_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_etf_details_fund, null, null, 14), new TextClause(nVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760)};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            List listL = kotlin.collections.d.L(elements2);
            return str4 != null ? zhm.d0.F0(e(com.revolut.retail.wealth.resources.R$string.trading_etf_details_fund_info_and_prospectus, "FUND_INFO_ROW_ID", str4), listL) : str5 != null ? zhm.d0.F0(e(com.revolut.retail.wealth.resources.R$string.trading_etf_details_key_information_document, "KEY_INFORMATION_DOCUMENT_ID", str5), listL) : listL;
        }
        if (i0Var instanceof dfl.j) {
            dfl.j jVar = (dfl.j) i0Var;
            dfl.q qVar2 = jVar.i;
            dj0.d dVar = jVar.u;
            dj0.d dVar2 = jVar.v;
            dfl.a aVar = (dfl.a) qVar2;
            if (f0.f237772a[jVar.f114388t.ordinal()] == 1) {
                CellDetailsDelegate.Model[] elements3 = {dVar2 != null ? new CellDetailsDelegate.Model("SUBTOTAL_VALUE_ROW_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_stock_dividend_gross, null, null, 14), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(k7.ONLY_NEGATIVE, null, false, false, 14), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760) : null, new CellDetailsDelegate.Model("TAX_VALUE_ROW_ID", new t0((Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_stock_dividend_tax, null, null, 14), (Image) null, 0, false, 30), dVar != null ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.ONLY_NEGATIVE, null, false, false, 14), null, null, 12) : new MoneyClause(new dj0.d(0L, aVar.f114178b), new MoneyClause.Format.Defaults(k7.ONLY_NEGATIVE, null, false, false, 14), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("TOTAL_VALUE_ROW_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_transaction_cash_dividend_received_title, null, null, 14), new MoneyClause(oi0.d.a0(aVar), new MoneyClause.Format.Defaults(k7.ONLY_NEGATIVE, null, false, false, 14), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760)};
                Intrinsics.checkNotNullParameter(elements3, "elements");
                return kotlin.collections.d.L(elements3);
            }
            CellDetailsDelegate.Model model3 = dVar2 != null ? new CellDetailsDelegate.Model("SUBTOTAL_VALUE_ROW_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_stock_dividend_gross, null, null, 14), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(k7.ONLY_NEGATIVE, null, false, false, 14), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760) : null;
            if (dVar != null) {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_stock_dividend_tax, null, null, 14);
                MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.ONLY_NEGATIVE, null, false, false, 14), null, null, 12);
                f6Var = bVar != hel.b.US ? new f6("TAX_VALUE_ROW_ID", textLocalisedClause, moneyClause, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 1008) : new CellDetailsDelegate.Model("TAX_VALUE_ROW_ID", textLocalisedClause, moneyClause, 0, null, null, null, null, null, false, 0, 0, 32760);
            } else {
                f6Var = null;
            }
            qv0.i[] elements4 = {model3, f6Var, new CellDetailsDelegate.Model("TOTAL_VALUE_ROW_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_stock_dividend_total, null, null, 14), new MoneyClause(oi0.d.a0(aVar), new MoneyClause.Format.Defaults(k7.ONLY_NEGATIVE, null, false, false, 14), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), j(nVar)};
            Intrinsics.checkNotNullParameter(elements4, "elements");
            return kotlin.collections.d.L(elements4);
        }
        if (i0Var instanceof dfl.g) {
            dfl.g gVar = (dfl.g) i0Var;
            dj0.d dVar3 = gVar.f114322t;
            CellDetailsDelegate.Model model4 = dVar3 != null ? new CellDetailsDelegate.Model("SUBTOTAL_VALUE_ROW_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_bond_coupon_coupon, null, null, 14), new MoneyClause(dVar3, new MoneyClause.Format.Defaults(k7.ONLY_NEGATIVE, null, false, false, 14), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760) : null;
            dj0.d dVar4 = gVar.f114321s;
            CellDetailsActionDelegate.Model model5 = dVar4 != null ? new CellDetailsActionDelegate.Model("TAX_VALUE_ROW_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_bond_coupon_tax, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(dVar4, new MoneyClause.Format.Defaults(k7.ONLY_NEGATIVE, null, false, false, 14), null, null, 12), null, false, false, null, null, nVar, 0, 0, 0, 0, 4192228) : null;
            jel.m mVar = cVar instanceof jel.m ? (jel.m) cVar : null;
            if (mVar != null && (str2 = mVar.e.f173471c) != null) {
                model = new CellDetailsDelegate.Model("COMPANY_ROW_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_bond_coupon_issuer, null, null, 14), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
            }
            qv0.i[] elements5 = {model4, model5, model};
            Intrinsics.checkNotNullParameter(elements5, "elements");
            return kotlin.collections.d.L(elements5);
        }
        if (i0Var instanceof dfl.y) {
            CellDetailsDelegate.Model model6 = new CellDetailsDelegate.Model("SUBTOTAL_VALUE_ROW_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_bond_redemption_redemption_value, null, null, 14), new MoneyClause(oi0.d.a0((dfl.a) ((dfl.y) i0Var).i), new MoneyClause.Format.Defaults(k7.ONLY_NEGATIVE, null, false, false, 14), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
            jel.m mVar2 = cVar instanceof jel.m ? (jel.m) cVar : null;
            if (mVar2 != null && (str = mVar2.e.f173471c) != null) {
                model2 = new CellDetailsDelegate.Model("COMPANY_ROW_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_bond_principal_issuer, null, null, 14), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
            }
            CellDetailsDelegate.Model[] elements6 = {model6, model2};
            Intrinsics.checkNotNullParameter(elements6, "elements");
            return kotlin.collections.d.L(elements6);
        }
        if (!(i0Var instanceof dfl.m)) {
            return zhm.f0.f322471a;
        }
        dfl.m mVar3 = (dfl.m) i0Var;
        if (f0.f237773b[mVar3.e.ordinal()] != 1) {
            return zhm.f0.f322471a;
        }
        jel.b0 b0Var = cVar instanceof jel.b0 ? (jel.b0) cVar : null;
        String str7 = (b0Var == null || (c0Var = b0Var.f173414g) == null) ? null : c0Var.f173423b;
        String str8 = mVar3.B;
        qv0.i[] elements7 = {str8 != null ? h(str8) : null, k(nVar), l(mVar3), str7 != null ? e(com.revolut.retail.wealth.resources.R$string.trading_etf_details_key_information_document, "KEY_INFORMATION_DOCUMENT_ID", str7) : null};
        Intrinsics.checkNotNullParameter(elements7, "elements");
        return kotlin.collections.d.L(elements7);
    }

    public static CellDetailsDelegate.Model h(String str) {
        return new CellDetailsDelegate.Model("TRADE_ROW_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trade_list_trade_id, null, null, 14), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static CellDetailsDelegate.Model j(nel.n nVar) {
        if (nVar.f214597c != nel.z.FUND) {
            return new CellDetailsDelegate.Model("COMPANY_ROW_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trade_list_company, null, null, 14), new TextClause(nVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
        }
        return null;
    }

    public static CellDetailsDelegate.Model k(nel.n nVar) {
        String str = nVar.f214600j;
        if (str != null) {
            return new CellDetailsDelegate.Model("ISIN_ROW_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trade_info_isin, null, null, 14), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
        }
        return null;
    }

    public static CellDetailsActionDelegate.Model l(i0 i0Var) {
        Lazy lazyY0 = te0.w.y0(new pka.c(29));
        if (i0Var instanceof dfl.f0) {
            if (((dfl.f0) i0Var).H) {
                return (CellDetailsActionDelegate.Model) lazyY0.getValue();
            }
        } else {
            if (i0Var instanceof dfl.s) {
                dfl.s sVar = (dfl.s) i0Var;
                if (!sVar.z || sVar.f114454b == null) {
                    return null;
                }
                return (CellDetailsActionDelegate.Model) lazyY0.getValue();
            }
            if (i0Var instanceof dfl.e) {
                return (CellDetailsActionDelegate.Model) lazyY0.getValue();
            }
            if ((i0Var instanceof dfl.m) && ((dfl.m) i0Var).F) {
                return (CellDetailsActionDelegate.Model) lazyY0.getValue();
            }
        }
        return null;
    }

    public static List m(i0 i0Var) {
        if (f0.f237773b[i0Var.p().ordinal()] == 2 && (i0Var instanceof dfl.m)) {
            return zhm.u.c(new PlainTextDelegate.Model("STATUS_EXPLANATION_ROW_ID", (UrlImage) null, (Clause) null, new TextLocalisedClause(((dfl.m) i0Var).v == bfl.g.BUY ? com.revolut.retail.wealth.resources.R$string.wealth_invest_order_details_cell_order_rejected_subtitle : R$string.wealth_trading_redemption_decline_reason, null, null, 14), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746));
        }
        return zhm.f0.f322471a;
    }

    public final List a(i0 trade, TradingAccount tradingAccount, hel.b bVar) {
        List listL;
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        boolean z11;
        boolean z12;
        boolean z29;
        boolean z31;
        boolean z41;
        boolean z49;
        boolean z54;
        boolean z74;
        boolean z83;
        boolean z89;
        boolean z96;
        boolean z100;
        boolean z101;
        boolean z102;
        boolean z103;
        boolean z104;
        boolean z105;
        Pair pair;
        Clause clause;
        Clause clause2;
        n2l.j jVarB;
        boolean z106 = trade instanceof dfl.g;
        if (z106 || ((z = trade instanceof dfl.y)) || ((z3 = trade instanceof dfl.b)) || ((z4 = trade instanceof dfl.d)) || ((z6 = trade instanceof dfl.e)) || ((z11 = trade instanceof dfl.h)) || ((z12 = trade instanceof dfl.j)) || ((z29 = trade instanceof dfl.k)) || ((z31 = trade instanceof dfl.l)) || ((z41 = trade instanceof dfl.s)) || ((z49 = trade instanceof dfl.v)) || ((z54 = trade instanceof dfl.w)) || ((z74 = trade instanceof dfl.z)) || ((z83 = trade instanceof dfl.b0)) || ((z89 = trade instanceof dfl.f0)) || ((z96 = trade instanceof dfl.g0)) || ((z100 = trade instanceof dfl.i)) || ((z101 = trade instanceof dfl.t)) || ((z102 = trade instanceof dfl.c0)) || ((z103 = trade instanceof dfl.e0)) || ((z104 = trade instanceof dfl.m)) || ((z105 = trade instanceof dfl.d0))) {
            return (tradingAccount == null || (listL = zhm.v.l(((wul.m) this.f237777c).b(tradingAccount, bVar, null))) == null) ? zhm.f0.f322471a : listL;
        }
        boolean z107 = trade instanceof dfl.c;
        if (!z107 && !(trade instanceof h0)) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(trade, "trade");
        if (z106 || z || z3 || z4 || z6 || z11 || z12 || z29 || z31 || z41 || z49 || z54 || z74 || z83 || z89 || z96 || z100 || z101 || z102 || z103 || z104 || z105) {
            return zhm.f0.f322471a;
        }
        if (!z107 && !(trade instanceof h0)) {
            throw new NoWhenBranchMatchedException();
        }
        if (z107) {
            dfl.c cVar = (dfl.c) trade;
            pair = new Pair(cVar.f114221t.f114471b, cVar.f114220s);
        } else {
            if (!(trade instanceof h0)) {
                return zhm.f0.f322471a;
            }
            h0 h0Var = (h0) trade;
            s0 s0Var = h0Var.v;
            pair = new Pair(s0Var != null ? s0Var.f114471b : null, h0Var.f114361s);
        }
        String str = (String) pair.f186385a;
        bfl.g gVar = (bfl.g) pair.f186386b;
        if (str == null) {
            m70.a.c(kotlin.jvm.internal.t0.f186434a);
            str = "";
        }
        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Clause textClause2 = (tradingAccount == null || (jVarB = n2l.l.b(tradingAccount)) == null) ? new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : this.f.f255699a.h(jVarB, bVar, null);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_transaction_transfer_label_from, null, null, 14);
        int[] iArr = rnh.n.f255698a;
        int i = iArr[gVar.ordinal()];
        if (i == 1) {
            clause = textClause;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            clause = textClause2;
        }
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("FROM_ROW_ID", textLocalisedClause, clause, 0, null, null, null, null, null, false, 0, 0, 32760);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_transaction_transfer_label_to, null, null, 14);
        int i2 = iArr[gVar.ordinal()];
        if (i2 == 1) {
            clause2 = textClause2;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            clause2 = textClause;
        }
        return zhm.v.k(model, new CellDetailsDelegate.Model("TO_ROW_ID", textLocalisedClause2, clause2, 0, null, null, null, null, null, false, 0, 0, 32760));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (q) iii.c.f(t1.x(t1.d0(domainState.f237785c, new Pair(null, null)), domainState.d, domainState.e, domainState.f237787h, domainState.f237784b, domainState.i), new a0(1), new pj9.m(25), new ox2.d(domainState, this, 18));
    }

    public final List d(i0 i0Var, Pair pair) {
        CellDetailsDelegate.Model model;
        CellDetailsDelegate.Model model2;
        kp3.b bVar;
        if (i0Var instanceof dfl.t) {
            dfl.t trade = (dfl.t) i0Var;
            Intrinsics.checkNotNullParameter(trade, "trade");
            List listC = zhm.u.c(new CellDetailsDelegate.Model("LIST_ID_MERGER_RECEIVED", new t0((Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_transaction_received_title, null, null, 14), (Image) null, 0, false, 30), this.f237779h.f255696a.m(trade, null), null, null, null, null, 0, null, false, false, null, null, 32760));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        if (i0Var instanceof dfl.c0) {
            dfl.c0 trade2 = (dfl.c0) i0Var;
            Intrinsics.checkNotNullParameter(trade2, "trade");
            List listC2 = zhm.u.c(new CellDetailsDelegate.Model("LIST_ID_SPIN_OFF_RECEIVED", new t0((Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_transaction_received_title, null, null, 14), (Image) null, 0, false, 30), this.i.f255697a.m(trade2, null), null, null, null, null, 0, null, false, false, null, null, 32760));
            yp0.b.k(listC2, 0, 0, 0, 0, 31);
            return listC2;
        }
        if (i0Var instanceof dfl.e0) {
            iel.i iVarA = (pair == null || (bVar = (kp3.b) pair.f186385a) == null) ? null : bVar.a();
            iel.y yVar = iVarA instanceof iel.y ? (iel.y) iVarA : null;
            if (yVar != null) {
                t0 t0Var = new t0((Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_transaction_shares_before_title, null, null, 14), (Image) null, 0, false, 30);
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(yVar.f160829g.f160821a);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                model = new CellDetailsDelegate.Model("LIST_ID_STOCK_SPLIT_SHARES_BEFORE", t0Var, new AssetClause(bigDecimalValueOf, new AssetClauseType.Stock(new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null)), yVar.f160828c, null, null, 24), null, null, null, null, 0, null, false, false, null, null, 32760);
            } else {
                model = null;
            }
            if (yVar != null) {
                t0 t0Var2 = new t0((Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_transaction_shares_after_title, null, null, 14), (Image) null, 0, false, 30);
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(yVar.f160829g.f160822b);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                model2 = new CellDetailsDelegate.Model("LIST_ID_STOCK_SPLIT_SHARES_AFTER", t0Var2, new AssetClause(bigDecimalValueOf2, new AssetClauseType.Stock(new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null)), yVar.f160828c, null, null, 24), null, null, null, null, 0, null, false, false, null, null, 32760);
            } else {
                model2 = null;
            }
            CellDetailsDelegate.Model[] elements = {model, model2};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            PlainTextDelegate.Model model3 = new PlainTextDelegate.Model("LIST_ID_STOCK_SPLIT_NOTE", (Clause) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_transaction_note_stock_split, null, null, 14), (v5) null, (UrlImage) null, false, pa.LIGHT, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65006);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            return zhm.d0.F0(model3, listL);
        }
        if ((i0Var instanceof dfl.g) || (i0Var instanceof dfl.y) || (i0Var instanceof dfl.b) || (i0Var instanceof dfl.c) || (i0Var instanceof dfl.d) || (i0Var instanceof dfl.e) || (i0Var instanceof dfl.h) || (i0Var instanceof dfl.i) || (i0Var instanceof dfl.j) || (i0Var instanceof dfl.k) || (i0Var instanceof dfl.l) || (i0Var instanceof dfl.m) || (i0Var instanceof dfl.s) || (i0Var instanceof dfl.v) || (i0Var instanceof dfl.w) || (i0Var instanceof dfl.z) || (i0Var instanceof dfl.b0) || (i0Var instanceof dfl.f0) || (i0Var instanceof dfl.g0) || (i0Var instanceof h0) || (i0Var instanceof dfl.d0)) {
            return zhm.f0.f322471a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0a12  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0a30  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0aed  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0af9  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0afc  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0b1c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0bb1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList g(dfl.i0 r66, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r67, com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown r68, java.util.List r69, od0.i r70, nel.n r71, jel.c r72, hel.b r73, kotlin.Pair r74, java.lang.String r75, java.util.List r76) {
        /*
            Method dump skipped, instruction units count: 3417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pnh.g0.g(dfl.i0, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount, com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown, java.util.List, od0.i, nel.n, jel.c, hel.b, kotlin.Pair, java.lang.String, java.util.List):java.util.ArrayList");
    }

    public final List i(Boolean bool, Instant instant) {
        if (instant != null) {
            return zhm.u.c(new CellDetailsDelegate.Model("CASH_SETTLEMENT_ROW_ID", new TextLocalisedClause(R$string.trading_cash_settlement_title, null, null, 14), new TextLocalisedClause((((l80.f) this.f237776b).b().compareTo(instant) < 0 || Intrinsics.f(bool, Boolean.TRUE)) ? R.string.transaction_pending : R.string.transaction_completed, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32752));
        }
        return zhm.f0.f322471a;
    }

    public final List n(i0 i0Var) {
        return zhm.u.c(new CellDetailsDelegate.Model("STATUS_ROW_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trade_info_status, null, null, 14), wfl.b.b(this.f237781l, i0Var), 0, null, null, null, null, null, false, 0, 0, 32760));
    }

    public final List o(i0 i0Var) {
        BigDecimal bigDecimal;
        if (i0Var instanceof dfl.i) {
            dj0.d dVarA = wfl.b.a(i0Var);
            return dVarA == null ? zhm.f0.f322471a : zhm.u.c(new PlainTextDelegate.Model("WARNING_ROW_ID", (Clause) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_cfd_transactions_deficit_adjustment_description, zhm.u.c(new MoneyClause(dVarA, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518));
        }
        if (!(i0Var instanceof dfl.m)) {
            return zhm.f0.f322471a;
        }
        dfl.m trade = (dfl.m) i0Var;
        Intrinsics.checkNotNullParameter(trade, "trade");
        if (rnh.f.f255692a[trade.e.ordinal()] == 3 && trade.v != bfl.g.BUY) {
            dfl.q qVar = trade.i;
            dfl.x xVar = qVar instanceof dfl.x ? (dfl.x) qVar : null;
            if (xVar != null && (bigDecimal = trade.D) != null && bigDecimal.compareTo(xVar.f114516a) == -1) {
                return zhm.u.c(new PlainTextDelegate.Model("FUND_PARTIALLY_FILLED", (UrlImage) null, new TextLocalisedClause(R$string.wealth_trading_partially_fulfilled_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_partially_fulfilled_description, null, null, 14), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746));
            }
            return zhm.f0.f322471a;
        }
        return zhm.f0.f322471a;
    }
}
