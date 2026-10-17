package wul;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.trading.core.domain.orders.InvestCommodityOrder;
import com.revolut.retail.trading.core.domain.orders.InvestFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMarginOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMutualFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOptionOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.retail.trading.core.domain.orders.TradingAutoTopUp;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.trading.orders.R$string;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k4l.o0;
import k4l.q0;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import rp0.t;
import rp0.y;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements ndf.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f300230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xul.l f300231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final csl.e f300232c;

    public e(o tradingOrderMapper, xul.l stockOrderUnifiedInfoGroupMapper, csl.e tradingOrderDialogHelper, nbh.a instrumentImageProvider, ssl.b orderDetailsMarketTimingMapper) {
        Intrinsics.checkNotNullParameter(tradingOrderMapper, "tradingOrderMapper");
        Intrinsics.checkNotNullParameter(stockOrderUnifiedInfoGroupMapper, "stockOrderUnifiedInfoGroupMapper");
        Intrinsics.checkNotNullParameter(tradingOrderDialogHelper, "tradingOrderDialogHelper");
        Intrinsics.checkNotNullParameter(instrumentImageProvider, "instrumentImageProvider");
        Intrinsics.checkNotNullParameter(orderDetailsMarketTimingMapper, "orderDetailsMarketTimingMapper");
        this.f300230a = tradingOrderMapper;
        this.f300231b = stockOrderUnifiedInfoGroupMapper;
        this.f300232c = tradingOrderDialogHelper;
    }

    public static LargeActionButtonDelegate.Model d() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_action_got_it, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        return new LargeActionButtonDelegate.Model("invest_securities_order_details_dialog_got_it_button_list_id", defaultFilledButton, null, textLocalisedClause, false, null, ndf.c.f214363a, i, R$attr.uikit_dp24, i2, i2, 368);
    }

    public static Boolean h(InvestOrder investOrder) {
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        if ((investOrder instanceof InvestOrder.InvestSecuritiesOrder) && oi0.d.y(investOrder.getF104635j()) && ((InvestOrder.InvestSecuritiesOrder) investOrder).getB() == q0.GOOD_TIL_EXT_MARKET) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List k(k4l.r0 r19, k4l.o0 r20, k4l.q0 r21, java.lang.Boolean r22, com.revolut.core.ui_kit.models.Clause r23) {
        /*
            if (r23 == 0) goto L1b
            com.revolut.core.ui_kit.delegates.PlainTextDelegate$Model r0 = new com.revolut.core.ui_kit.delegates.PlainTextDelegate$Model
            r13 = 0
            r14 = 65518(0xffee, float:9.181E-41)
            java.lang.String r1 = "WARNING_TEXT_ID"
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L89
        L1b:
            boolean r0 = oi0.d.z(r19)
            r1 = 0
            if (r0 == 0) goto L88
            boolean r0 = oc.c.o(r20)
            if (r0 == 0) goto L88
            k4l.q0 r0 = k4l.q0.MARKET_ON_OPEN
            k4l.q0 r2 = k4l.q0.DAY
            k4l.q0[] r0 = new k4l.q0[]{r0, r2}
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.util.Set r0 = kotlin.collections.d.y0(r0)
            r2 = r21
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L88
            boolean r0 = r22.booleanValue()
            r2 = 14
            if (r0 == 0) goto L68
            com.revolut.core.ui_kit.delegates.PlainTextDelegate$Model r3 = new com.revolut.core.ui_kit.delegates.PlainTextDelegate$Model
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_review_market_open_market_pending_order_warning
            r6.<init>(r0, r1, r1, r2)
            r16 = 0
            r17 = 65518(0xffee, float:9.181E-41)
            java.lang.String r4 = "WARNING_TEXT_ID"
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = r3
            goto L89
        L68:
            com.revolut.core.ui_kit.delegates.PlainTextDelegate$Model r4 = new com.revolut.core.ui_kit.delegates.PlainTextDelegate$Model
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_review_market_closed_market_order_warning
            r7.<init>(r0, r1, r1, r2)
            r17 = 0
            r18 = 65518(0xffee, float:9.181E-41)
            java.lang.String r5 = "WARNING_TEXT_ID"
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = r4
            goto L89
        L88:
            r0 = r1
        L89:
            java.util.List r1 = zhm.v.l(r0)
            r5 = 0
            r6 = 31
            r2 = 0
            r3 = 0
            r4 = 0
            yp0.b.k(r1, r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wul.e.k(k4l.r0, k4l.o0, k4l.q0, java.lang.Boolean, com.revolut.core.ui_kit.models.Clause):java.util.List");
    }

    public final y a(r0 r0Var) {
        y yVar;
        TextLocalisedClause textLocalisedClause;
        if (r0Var == r0.RECURRING) {
            yVar = null;
        } else {
            List listC = u.c(d());
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_orders_estimated_total_cost, null, null, 14);
            int i = r0Var == null ? -1 : d.f300227a[r0Var.ordinal()];
            if (i == 2) {
                textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_total_cost_info_limit_order, null, null, 14);
            } else if (i != 3) {
                IllegalStateException illegalStateException = new IllegalStateException("Order type not provided or not supported.");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
                textLocalisedClause = null;
            } else {
                textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_total_cost_info_stop_order, null, null, 14);
            }
            yVar = new y(listC, new t(textLocalisedClause2, textLocalisedClause, null, 28), null, null, null, null, null, null, null, null, 3836);
        }
        if (yVar != null) {
            return yVar;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException("Order type " + r0Var + " is not supported.");
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.WARNING, null, null, illegalStateException2, h0Var2);
        return null;
    }

    public final y b(r0 r0Var) {
        y yVar;
        TextLocalisedClause textLocalisedClause;
        if (r0Var == r0.RECURRING) {
            yVar = null;
        } else {
            List listC = u.c(d());
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_orders_estimated_total_credit, null, null, 14);
            int i = r0Var == null ? -1 : d.f300227a[r0Var.ordinal()];
            if (i == 2) {
                textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_total_credit_info_limit_order, null, null, 14);
            } else if (i != 3) {
                IllegalStateException illegalStateException = new IllegalStateException("Order type not provided or not supported.");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
                textLocalisedClause = null;
            } else {
                textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_total_credit_info_stop_order, null, null, 14);
            }
            yVar = new y(listC, new t(textLocalisedClause2, textLocalisedClause, null, 28), null, null, null, null, null, null, null, null, 3836);
        }
        if (yVar != null) {
            return yVar;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException("Order type " + r0Var + " is not supported.");
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.WARNING, null, null, illegalStateException2, h0Var2);
        return null;
    }

    public final y c(Instant instant, r0 r0Var) {
        List listC = u.c(d());
        ZonedDateTime zonedDateTimeAtZone = instant.atZone(ZoneId.systemDefault());
        Intrinsics.checkNotNullExpressionValue(zonedDateTimeAtZone, "atZone(...)");
        return new y(listC, this.f300232c.b(zonedDateTimeAtZone, r0Var), null, null, null, null, null, null, null, null, 3836);
    }

    public final List e(InvestOrder.InvestSecuritiesOrder investSecuritiesOrder, ChargeBreakdown chargeBreakdown, nel.n nVar) {
        int i = d.f300227a[investSecuritiesOrder.getF104635j().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return f(investSecuritiesOrder, chargeBreakdown, nVar);
            }
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Recurring order type is not supported.");
            }
        }
        return ((m) this.f300231b).o(investSecuritiesOrder, chargeBreakdown);
    }

    public final List f(InvestOrder investOrder, ChargeBreakdown chargeBreakdown, nel.n nVar) {
        Iterable iterableC;
        List listC;
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        boolean z = investOrder instanceof InvestOrder.InvestSecuritiesOrder;
        xul.l lVar = this.f300231b;
        if (!z) {
            if (investOrder instanceof InvestCommodityOrder) {
                throw new IllegalStateException("Commodity order is unsupported");
            }
            if (investOrder instanceof InvestFundOrder) {
                throw new IllegalStateException("Fund order is unsupported");
            }
            if (investOrder instanceof InvestMutualFundOrder) {
                throw new IllegalStateException("Mutual fund order is unsupported");
            }
            if (investOrder instanceof InvestOptionOrder) {
                throw new IllegalStateException("Option order is unsupported");
            }
            if (investOrder instanceof InvestMarginOrder) {
                return ((m) lVar).n((InvestMarginOrder) investOrder, chargeBreakdown, nVar);
            }
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(investOrder, "<this>");
        o0 i = investOrder.getI();
        Intrinsics.checkNotNullParameter(i, "<this>");
        if (i != o0.PARTIALLY_FILLED) {
            return ((m) lVar).o((InvestOrder.InvestSecuritiesOrder) investOrder, chargeBreakdown);
        }
        InvestOrder.InvestSecuritiesOrder investOrder2 = (InvestOrder.InvestSecuritiesOrder) investOrder;
        Intrinsics.checkNotNullParameter(investOrder2, "investOrder");
        bfl.g f104634h = investOrder2.getF104634h();
        r0 f104635j = investOrder2.getF104635j();
        String o = investOrder2.getO();
        dj0.d v = investOrder2.getV();
        if (v == null) {
            v = investOrder2.getU();
        }
        BigDecimal f104643t = investOrder2.getF104643t();
        BigDecimal f104646y = investOrder2.getF104646y();
        if (f104646y == null) {
            f104646y = BigDecimal.ZERO;
        }
        Intrinsics.h(f104646y);
        BigDecimal bigDecimalSubtract = f104643t.subtract(f104646y);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        dj0.d f104638n = investOrder2.getF104638n();
        List listK = v.k(new CellDetailsDelegate.Model("order_review.original_order", new TextLocalisedClause(R$string.trading_orders_original_order_copy, null, null, 14), new AssetClause(f104643t, new AssetClauseType.Stock(0), o, null, null, 24), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("order_review.executed_shares", new TextLocalisedClause(R$string.trading_orders_executed_shares_copy, null, null, 14), new AssetClause(f104646y, new AssetClauseType.Stock(0), o, null, null, 24), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("order_review.remaining_order", new TextLocalisedClause(R$string.trading_orders_remaining_order_copy, null, null, 14), new AssetClause(bigDecimalSubtract, new AssetClauseType.Stock(0), o, null, null, 24), 0, null, null, null, null, null, false, 0, 0, 32760));
        if (f104638n == null || (iterableC = u.c(new CellDetailsDelegate.Model("order_review.target_price", new TextLocalisedClause(R$string.trading_orders_limit_price, null, null, 14), new MoneyClause(f104638n, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760))) == null) {
            iterableC = f0.f322471a;
        }
        int i2 = d.d[f104634h.ordinal()];
        if (i2 == 1) {
            listC = u.c(new CellDetailsActionDelegate.Model("ESTIMATED_TOTAL_COST", new TextLocalisedClause(R$string.trading_orders_estimated_total_cost, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(v, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, false, false, null, null, f104635j, 0, 0, 0, 0, 4192228));
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listC = u.c(new CellDetailsActionDelegate.Model("ESTIMATED_TOTAL_CREDIT", new TextLocalisedClause(R$string.trading_orders_estimated_total_credit, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(v, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, false, false, null, null, f104635j, 0, 0, 0, 0, 4192228));
        }
        return d0.E0(listC, d0.E0(iterableC, listK));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01de  */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit.models.TextLocalisedClause, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r14v4, types: [wul.m] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.lang.Object[], qv0.i[]] */
    /* JADX WARN: Type inference failed for: r54v0, types: [wul.e] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList g(com.revolut.retail.trading.core.domain.orders.InvestOrder r55, nel.n r56, com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown r57, java.lang.Boolean r58, java.lang.Boolean r59, hel.b r60, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r61, java.lang.String r62, com.revolut.core.ui_kit.models.Clause r63) {
        /*
            Method dump skipped, instruction units count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wul.e.g(com.revolut.retail.trading.core.domain.orders.InvestOrder, nel.n, com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown, java.lang.Boolean, java.lang.Boolean, hel.b, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount, java.lang.String, com.revolut.core.ui_kit.models.Clause):java.util.ArrayList");
    }

    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v6 */
    public final ArrayList i(InvestOrder.InvestSecuritiesOrder investOrder, ChargeBreakdown chargeBreakdown, List orderRecentTradesGroup, Boolean bool, nel.n instrument, List orderProjectionsWidget, Boolean bool2, hel.b bVar, TradingAccount tradingAccount, String currentUserId, TextLocalisedClause textLocalisedClause) {
        char c2;
        o oVar;
        xul.l lVar;
        char c3;
        int i;
        qv0.i iVarE;
        int i2;
        ?? r152;
        TextLocalisedClause textLocalisedClause2;
        List list;
        List listL;
        int i3 = d.f300227a[investOrder.getF104635j().ordinal()];
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            return g(investOrder, instrument, chargeBreakdown, bool, bool2, bVar, tradingAccount, currentUserId, textLocalisedClause);
        }
        if (i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        Intrinsics.checkNotNullParameter(orderRecentTradesGroup, "orderRecentTradesGroup");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(orderProjectionsWidget, "orderProjectionsWidget");
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        Intrinsics.checkNotNullParameter(investOrder, "<this>");
        o0 i5 = investOrder.getI();
        Intrinsics.checkNotNullParameter(i5, "<this>");
        boolean z = i5 == o0.PARTIALLY_FILLED;
        dfl.o0 f104636l = investOrder.getF104637m() == cfl.j.PERSONAL_JOINT ? investOrder.getF104636l() : null;
        xul.l lVar2 = this.f300231b;
        m mVar = (m) lVar2;
        CellDetailsDelegate.Model modelF = mVar.f(f104636l, currentUserId);
        Instant d = investOrder.getD();
        o oVar2 = this.f300230a;
        CellDetailsDelegate.Model modelD = oVar2.d(d);
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        if (chargeBreakdown == null && instrument.d()) {
            iVarE = mVar.g();
            c2 = 4;
            oVar = oVar2;
            lVar = lVar2;
            c3 = 1;
            i = 3;
        } else if (chargeBreakdown != null) {
            c2 = 4;
            lVar = lVar2;
            c3 = 1;
            i = 3;
            oVar = oVar2;
            iVarE = ((m) this.f300231b).e(chargeBreakdown, r0.RECURRING, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null, (8 & 32) != 0 ? null : null, (8 & 64) != 0 ? null : null, (8 & 128) != 0 ? false : false);
        } else {
            c2 = 4;
            oVar = oVar2;
            lVar = lVar2;
            c3 = 1;
            i = 3;
            iVarE = null;
        }
        qv0.i[] elements = new qv0.i[i];
        elements[0] = modelF;
        elements[c3] = modelD;
        elements[2] = iVarE;
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL2 = kotlin.collections.d.L(elements);
        yp0.b.k(listL2, 0, 0, 0, 0, 31);
        o oVar3 = oVar;
        CellDetailsDelegate.Model modelE = oVar3.e(investOrder.getG());
        TradingAutoTopUp e = investOrder.getE();
        if (e instanceof TradingAutoTopUp.Pocket) {
            i2 = i;
            r152 = 0;
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_auto_topup_details_format, u.c(((TradingAutoTopUp.Pocket) e).f104658b.f306286a), null, 12);
        } else {
            i2 = i;
            r152 = 0;
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_auto_topup_none, null, null, 14);
        }
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("LIST_ID_AUTO_TOP_UP_ITEM", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_auto_topup, r152, r152, 14), textLocalisedClause2, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        qv0.i[] elements2 = new qv0.i[2];
        elements2[0] = modelE;
        elements2[c3] = model;
        Intrinsics.checkNotNullParameter(elements2, "elements");
        List listL3 = kotlin.collections.d.L(elements2);
        yp0.b.k(listL3, 0, 0, 0, 0, 31);
        if (z) {
            CellDetailsDelegate.Model modelF2 = oVar3.f(investOrder.getC());
            CellDetailsDelegate.Model modelG = oVar3.g(investOrder.getV());
            qv0.i[] elements3 = new qv0.i[2];
            elements3[0] = modelF2;
            elements3[c3] = modelG;
            Intrinsics.checkNotNullParameter(elements3, "elements");
            List listL4 = kotlin.collections.d.L(elements3);
            yp0.b.k(listL4, 0, 0, 0, 0, 31);
            list = listL4;
        } else {
            list = null;
        }
        if (tradingAccount != null) {
            listL = v.l(((m) lVar).b(tradingAccount, bVar, null));
            yp0.b.k(listL, 0, 0, 0, 0, 31);
        } else {
            listL = f0.f322471a;
        }
        List[] elements4 = new List[6];
        elements4[0] = listL2;
        elements4[c3] = listL3;
        elements4[2] = list;
        elements4[i2] = listL;
        elements4[c2] = orderProjectionsWidget;
        elements4[5] = orderRecentTradesGroup;
        Intrinsics.checkNotNullParameter(elements4, "elements");
        return w.u(kotlin.collections.d.L(elements4));
    }

    public final ActionsView.Item j(InvestOrder investOrder, boolean z) {
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        return new ActionsView.Item("CANCEL_INVEST_ORDER_ACTION_ID", null, false, z ? e4.EnabledClickable : e4.DisabledNonClickable, null, new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, new ndf.b(investOrder), null, 24470);
    }
}
