package kul;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuote;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.trading.orders.ui.invest.placement.models.FiatExchangeOrderQuoteResult;
import d9.e1;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import k4l.e0;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import wul.q;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f189853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f189854b;

    public f(h cellsBuilder, q tradingOrderReviewBottomDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(cellsBuilder, "cellsBuilder");
        Intrinsics.checkNotNullParameter(tradingOrderReviewBottomDisclaimerMapper, "tradingOrderReviewBottomDisclaimerMapper");
        this.f189853a = cellsBuilder;
        this.f189854b = tradingOrderReviewBottomDisclaimerMapper;
    }

    @Override // kul.l
    public final boolean a(nel.n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return instrument.f214597c == z.FUND;
    }

    @Override // kul.l
    public final List b(k itemsContent) throws Throwable {
        CellDetailsActionDelegate.Model model;
        CellDetailsActionDelegate.Model model2;
        BigDecimal softLockFee;
        FiatExchangeOrderQuote fiatExchangeOrderQuote;
        Instant instant;
        h hVar;
        int i;
        Instant instant2;
        Instant instant3;
        Instant instant4;
        Intrinsics.checkNotNullParameter(itemsContent, "itemsContent");
        bfl.g gVar = itemsContent.f189864a;
        od0.i iVar = itemsContent.f189869j;
        List list = itemsContent.o;
        TradingAccount tradingAccount = itemsContent.f189875r;
        OrderQuote orderQuote = itemsContent.f;
        nel.n nVar = itemsContent.f189873p;
        r0 r0Var = itemsContent.f189866c;
        TradingLegalEntityInformation tradingLegalEntityInformation = itemsContent.e;
        e0 e0Var = itemsContent.d;
        int i2 = e.f189852a[gVar.ordinal()];
        q qVar = this.f189854b;
        h hVar2 = this.f189853a;
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aim.e eVarB = u.b();
            k4l.c cVar = e0Var.f180960m;
            k4l.c cVar2 = e0Var.f180960m;
            if (cVar != null && (instant4 = cVar.d) != null) {
                PlainTextDelegate.Model modelQ = h.q(instant4, bfl.g.SELL);
                yp0.b.l(modelQ, 0, 0, 0, 0, null, false, 63);
                eVarB.add(modelQ);
            }
            z instrumentType = nVar.f214597c;
            qv0.i iVarR = hVar2.r(orderQuote, r0Var, instrumentType);
            qv0.i iVarP = h.p(orderQuote, instrumentType, false);
            Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            if (g.f189856b[instrumentType.ordinal()] == 1) {
                i = R$string.market_data_exchange_breakdown_estimated_traded_value;
                hVar = hVar2;
            } else {
                hVar = hVar2;
                hx7.e.n(new NotImplementedError("Not implemented and not tested for " + instrumentType));
                i = R$string.wealth_trade_list_traded_value;
            }
            h hVar3 = hVar;
            qv0.i[] elements = {iVarR, iVarP, new CellDetailsDelegate.Model("LIST_ID_ORDER_VALUE", new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30), e4i.c.a(e1.u(orderQuote), null, null, null, null, o9.NON_SENSITIVE, 31), null, null, null, null, 0, null, false, false, null, null, 32760), h.j(hVar, orderQuote.f104755g.f104731a, itemsContent.f189866c, itemsContent.f189873p, itemsContent.d, true), hVar.b(itemsContent.f189864a, itemsContent.f, itemsContent.f189868h, itemsContent.f189866c, nVar.f214597c)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            eVarB.addAll(listL);
            qv0.i[] elements2 = {(cVar2 == null || (instant3 = cVar2.f) == null) ? null : h.f(instant3, gVar), (cVar2 == null || (instant2 = cVar2.f180950a) == null) ? null : h.e(instant2)};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            List listL2 = kotlin.collections.d.L(elements2);
            yp0.b.k(listL2, 0, 0, 0, 0, 31);
            eVarB.addAll(listL2);
            qv0.i iVarA = hVar3.a(tradingAccount, tradingLegalEntityInformation.f105106a, gVar);
            if (iVarA != null) {
                yp0.b.l(iVarA, 0, 0, 0, 0, null, false, 63);
                eVarB.add(iVarA);
            }
            List listL3 = list;
            if (listL3.isEmpty()) {
                listL3 = v.l(iVar.g());
            }
            List list2 = listL3;
            yp0.b.k(list2, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
            eVarB.addAll(list2);
            eVarB.addAll(v.l(qVar.a(tradingLegalEntityInformation.f105106a, r0Var, gVar)));
            return u.a(eVarB);
        }
        aim.e eVarB2 = u.b();
        FiatExchangeOrderQuoteResult fiatExchangeOrderQuoteResult = itemsContent.f189867g;
        k4l.c cVar3 = e0Var.f180960m;
        if (cVar3 != null && (instant = cVar3.d) != null) {
            PlainTextDelegate.Model modelQ2 = h.q(instant, bfl.g.BUY);
            yp0.b.l(modelQ2, 0, 0, 0, 0, null, false, 63);
            eVarB2.add(modelQ2);
        }
        bfl.g gVar2 = itemsContent.f189864a;
        OrderQuote orderQuote2 = itemsContent.f;
        dj0.d dVar = itemsContent.f189868h;
        r0 r0Var2 = itemsContent.f189866c;
        z zVar = nVar.f214597c;
        qv0.i[] elements3 = {hVar2.b(gVar2, orderQuote2, dVar, r0Var2, zVar), h.p(orderQuote, zVar, false), hVar2.r(orderQuote, r0Var, zVar)};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        List listL4 = kotlin.collections.d.L(elements3);
        yp0.b.k(listL4, 0, 0, 0, 0, 31);
        eVarB2.addAll(listL4);
        if (fiatExchangeOrderQuoteResult != null && (fiatExchangeOrderQuote = fiatExchangeOrderQuoteResult.f106843b) != null) {
            List listO = h.o(fiatExchangeOrderQuote);
            yp0.b.k(listO, 0, 0, 0, 0, 31);
            eVarB2.addAll(listO);
        }
        if (fiatExchangeOrderQuoteResult != null) {
            List listG = h.g(fiatExchangeOrderQuoteResult);
            yp0.b.k(listG, 0, 0, 0, 0, 31);
            eVarB2.addAll(listG);
        }
        k4l.c cVar4 = e0Var.f180960m;
        if (cVar4 != null) {
            k4l.g gVar3 = cVar4.e;
            Instant instant5 = cVar4.f;
            CellDetailsActionDelegate.Model modelF = instant5 != null ? h.f(instant5, gVar) : null;
            Instant instant6 = gVar3 != null ? gVar3.f180968a : null;
            CellDetailsActionDelegate.Model model3 = new CellDetailsActionDelegate.Model("LIST_ID_HARD_LOCKUP", new TextLocalisedClause(R$string.wealth_trading_orders_hard_lockup_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), instant6 != null ? new TimeClause(instant6.toEpochMilli(), TimeClause.Format.DateLong.f57962b, null, null, 12) : new TextLocalisedClause(R$string.wealth_trading_orders_item_locked_until_none, null, null, 14), false, false, null, null, 0, 0, 32736);
            Instant instant7 = gVar3 != null ? gVar3.f180969b : null;
            CellDetailsActionDelegate.Model model4 = new CellDetailsActionDelegate.Model("LIST_ID_SOFT_LOCKUP", new TextLocalisedClause(R$string.wealth_trading_orders_soft_lockup_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), instant7 != null ? new TimeClause(instant7.toEpochMilli(), TimeClause.Format.DateLong.f57962b, null, null, 12) : new TextLocalisedClause(R$string.wealth_trading_orders_item_locked_until_none, null, null, 14), false, false, null, null, 0, 0, 32736);
            PercentageClause.Format.Long r4 = PercentageClause.Format.Long.f57911a;
            if (gVar3 == null || (softLockFee = gVar3.f180970c) == null) {
                model = null;
            } else {
                Intrinsics.checkNotNullParameter(softLockFee, "softLockFee");
                model = new CellDetailsActionDelegate.Model("LIST_ID_EARLY_REDEMPTION_FEE", new TextLocalisedClause(R$string.wealth_trading_orders_early_redemption_fee_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new PercentageClause(e1.Z(softLockFee), r4, (Style) null, 4), false, false, null, null, 0, 0, 32736);
            }
            BigDecimal fee2 = cVar4.f180952c;
            if (fee2 != null) {
                Intrinsics.checkNotNullParameter(fee2, "fee");
                model2 = new CellDetailsActionDelegate.Model("LIST_ID_REVOLUT_CUSTODY_FEE", new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_trading_orders_review_cell_title_revolut_fee, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new PercentageClause(e1.Z(fee2), r4, (Style) null), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
            } else {
                model2 = null;
            }
            qv0.i[] elements4 = {modelF, model3, model4, model, model2};
            Intrinsics.checkNotNullParameter(elements4, "elements");
            List listL5 = kotlin.collections.d.L(elements4);
            yp0.b.k(listL5, 0, 0, 0, 0, 31);
            eVarB2.addAll(listL5);
            CellDetailsActionDelegate.Model modelE = h.e(cVar4.f180950a);
            yp0.b.l(modelE, 0, 0, 0, 0, null, false, 63);
            eVarB2.add(modelE);
        }
        qv0.i iVarA2 = hVar2.a(tradingAccount, tradingLegalEntityInformation.f105106a, gVar);
        if (iVarA2 != null) {
            yp0.b.l(iVarA2, 0, 0, 0, 0, null, false, 63);
            eVarB2.add(iVarA2);
        }
        List listL6 = list;
        if (listL6.isEmpty()) {
            listL6 = v.l(iVar.g());
        }
        List list3 = listL6;
        yp0.b.k(list3, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
        eVarB2.addAll(list3);
        eVarB2.addAll(v.l(qVar.a(tradingLegalEntityInformation.f105106a, r0Var, gVar)));
        return u.a(eVarB2);
    }
}
