package kul;

import bul.s;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuote;
import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import com.revolut.feature.trading_orders.common.models.FrequencySettings;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.trading.orders.ui.invest.placement.models.FiatExchangeOrderQuoteResult;
import d9.e1;
import dfl.r;
import java.time.Instant;
import java.util.List;
import k4l.e0;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import wul.q;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f189880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xul.l f189881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f189882c;

    public n(l4i.a amountConverter, h cellsBuilder, xul.l orderUnifiedInfoGroupMapper, s orderQuoteAmountProvider, q tradingOrderReviewBottomDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(cellsBuilder, "cellsBuilder");
        Intrinsics.checkNotNullParameter(orderUnifiedInfoGroupMapper, "orderUnifiedInfoGroupMapper");
        Intrinsics.checkNotNullParameter(orderQuoteAmountProvider, "orderQuoteAmountProvider");
        Intrinsics.checkNotNullParameter(tradingOrderReviewBottomDisclaimerMapper, "tradingOrderReviewBottomDisclaimerMapper");
        this.f189880a = cellsBuilder;
        this.f189881b = orderUnifiedInfoGroupMapper;
        this.f189882c = tradingOrderReviewBottomDisclaimerMapper;
    }

    @Override // kul.l
    public final boolean a(nel.n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return instrument.f214597c == z.MUTUAL_FUND;
    }

    @Override // kul.l
    public final List b(k itemsContent) throws Throwable {
        Instant instant;
        FiatExchangeOrderQuote fiatExchangeOrderQuote;
        Instant instant2;
        r0 r0Var;
        q qVar;
        Intrinsics.checkNotNullParameter(itemsContent, "itemsContent");
        r0 r0Var2 = itemsContent.f189866c;
        TradingAccount tradingAccount = itemsContent.f189875r;
        OrderQuote orderQuote = itemsContent.f;
        TradingLegalEntityInformation tradingLegalEntityInformation = itemsContent.e;
        nel.n nVar = itemsContent.f189873p;
        bfl.g gVar = itemsContent.f189864a;
        int i = m.f189878a[r0Var2.ordinal()];
        q qVar2 = this.f189882c;
        h hVar = this.f189880a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                hx7.e.n(new IllegalStateException(r0Var2 + " order are not supported"));
                return f0.f322471a;
            }
            SourcePocketWrapper sourcePocketWrapper = itemsContent.f189874q;
            Object obj2 = itemsContent.f189871m.f224257a;
            AutoTopUpStatus autoTopUpStatus = itemsContent.f189872n;
            bfl.g gVar2 = bfl.g.BUY;
            if (gVar != gVar2) {
                throw new IllegalArgumentException("Only recurring buys are supported");
            }
            hel.b bVar = tradingLegalEntityInformation.f105106a;
            Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
            Amount amountV = e1.v(orderQuote);
            Charges charges = orderQuote.f104755g;
            aim.e eVarB = u.b();
            r rVar = r.MONEY_AMOUNT;
            dj0.d dVarB = l4i.a.b(amountV);
            r0 r0Var3 = itemsContent.f189866c;
            xul.b bVar2 = xul.l.Companion;
            xul.l lVar = this.f189881b;
            eVarB.add(((wul.m) lVar).c(gVar2, rVar, dVarB, r0Var3, null));
            ChargeBreakdown chargeBreakdown = charges.f104731a;
            r0 r0Var4 = itemsContent.f189866c;
            nel.n nVar2 = itemsContent.f189873p;
            eVarB.add(((wul.m) lVar).e(chargeBreakdown, r0Var4, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null, (8 & 32) != 0 ? null : null, (8 & 64) != 0 ? null : null, (8 & 128) != 0 ? false : false));
            FrequencySettings frequencySettings = (FrequencySettings) obj2;
            if (frequencySettings != null) {
                Intrinsics.checkNotNullParameter(frequencySettings, "frequencySettings");
                r0Var = r0Var2;
                qVar = qVar2;
                eVarB.add(hVar.f189860c.b(frequencySettings.f91773a, frequencySettings.f91774b, false));
            } else {
                r0Var = r0Var2;
                qVar = qVar2;
            }
            qv0.i iVarD = hVar.d(autoTopUpStatus, sourcePocketWrapper, tradingLegalEntityInformation);
            if (iVarD != null) {
                eVarB.add(iVarD);
            }
            aim.e eVarA = u.a(eVarB);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            qv0.i[] elements = {h.t(charges.f104731a, nVar, null), ((FrequencySettings) obj2) != null ? h.m() : null, h.k(autoTopUpStatus, sourcePocketWrapper, nVar), hVar.c(autoTopUpStatus, bVar, itemsContent.f189877t)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            List listL2 = v.l(hVar.a(tradingAccount, bVar, gVar));
            yp0.b.k(listL2, 0, 0, 0, 0, 31);
            return d0.E0(v.l(qVar.a(bVar, r0Var, gVar)), d0.E0(listL2, d0.E0(listL, eVarA)));
        }
        od0.i iVar = itemsContent.f189869j;
        List list = itemsContent.o;
        e0 e0Var = itemsContent.d;
        int i2 = m.f189879b[gVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aim.e eVarB2 = u.b();
            PlainTextDelegate.Model modelN = h.n(gVar);
            yp0.b.l(modelN, 0, 0, 0, 0, null, false, 63);
            eVarB2.add(modelN);
            qv0.i[] elements2 = {hVar.r(orderQuote, r0Var2, nVar.f214597c), h.p(orderQuote, nVar.f214597c, true), h.s(orderQuote, gVar), h.j(hVar, orderQuote.f104755g.f104731a, itemsContent.f189866c, itemsContent.f189873p, itemsContent.d, false), hVar.b(itemsContent.f189864a, itemsContent.f, itemsContent.f189868h, itemsContent.f189866c, nVar.f214597c)};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            List listL3 = kotlin.collections.d.L(elements2);
            yp0.b.k(listL3, 0, 0, 0, 0, 31);
            eVarB2.addAll(listL3);
            k4l.c cVar = e0Var.f180960m;
            if (cVar != null && (instant2 = cVar.f) != null) {
                CellDetailsActionDelegate.Model modelF = h.f(instant2, gVar);
                yp0.b.l(modelF, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(modelF);
            }
            qv0.i iVarA = hVar.a(tradingAccount, tradingLegalEntityInformation.f105106a, gVar);
            if (iVarA != null) {
                yp0.b.l(iVarA, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(iVarA);
            }
            List listL4 = list;
            if (listL4.isEmpty()) {
                listL4 = v.l(iVar.g());
            }
            List list2 = listL4;
            yp0.b.k(list2, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
            eVarB2.addAll(list2);
            eVarB2.addAll(v.l(qVar2.a(tradingLegalEntityInformation.f105106a, r0Var2, gVar)));
            return u.a(eVarB2);
        }
        aim.e eVarB3 = u.b();
        PlainTextDelegate.Model modelN2 = h.n(gVar);
        yp0.b.l(modelN2, 0, 0, 0, 0, null, false, 63);
        eVarB3.add(modelN2);
        bfl.g gVar3 = itemsContent.f189864a;
        OrderQuote orderQuote2 = itemsContent.f;
        dj0.d dVar = itemsContent.f189868h;
        r0 r0Var5 = itemsContent.f189866c;
        z zVar = nVar.f214597c;
        qv0.i[] elements3 = {hVar.b(gVar3, orderQuote2, dVar, r0Var5, zVar), h.j(hVar, orderQuote.f104755g.f104731a, itemsContent.f189866c, itemsContent.f189873p, itemsContent.d, false), h.s(orderQuote, gVar), h.p(orderQuote, zVar, true), hVar.r(orderQuote, r0Var2, zVar)};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        List listL5 = kotlin.collections.d.L(elements3);
        yp0.b.k(listL5, 0, 0, 0, 0, 31);
        eVarB3.addAll(listL5);
        FiatExchangeOrderQuoteResult fiatExchangeOrderQuoteResult = itemsContent.f189867g;
        if (fiatExchangeOrderQuoteResult != null && (fiatExchangeOrderQuote = fiatExchangeOrderQuoteResult.f106843b) != null) {
            List listO = h.o(fiatExchangeOrderQuote);
            yp0.b.k(listO, 0, 0, 0, 0, 31);
            eVarB3.addAll(listO);
        }
        if (fiatExchangeOrderQuoteResult != null) {
            List listG = h.g(fiatExchangeOrderQuoteResult);
            yp0.b.k(listG, 0, 0, 0, 0, 31);
            eVarB3.addAll(listG);
        }
        k4l.c cVar2 = e0Var.f180960m;
        if (cVar2 != null && (instant = cVar2.f) != null) {
            CellDetailsActionDelegate.Model modelF2 = h.f(instant, gVar);
            yp0.b.l(modelF2, 0, 0, 0, 0, null, false, 63);
            eVarB3.add(modelF2);
        }
        qv0.i iVarA2 = hVar.a(tradingAccount, tradingLegalEntityInformation.f105106a, gVar);
        if (iVarA2 != null) {
            yp0.b.l(iVarA2, 0, 0, 0, 0, null, false, 63);
            eVarB3.add(iVarA2);
        }
        List listL6 = list;
        if (listL6.isEmpty()) {
            listL6 = v.l(iVar.g());
        }
        List list3 = listL6;
        yp0.b.k(list3, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
        eVarB3.addAll(list3);
        eVarB3.addAll(v.l(qVar2.a(tradingLegalEntityInformation.f105106a, r0Var2, gVar)));
        return u.a(eVarB3);
    }
}
