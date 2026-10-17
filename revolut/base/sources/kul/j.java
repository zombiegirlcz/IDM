package kul;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.trading.orders.ui.invest.placement.models.FiatExchangeOrderQuoteResult;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.List;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import nel.z;
import wul.q;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f189862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f189863b;

    public j(h cellsBuilder, q tradingOrderReviewBottomDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(cellsBuilder, "cellsBuilder");
        Intrinsics.checkNotNullParameter(tradingOrderReviewBottomDisclaimerMapper, "tradingOrderReviewBottomDisclaimerMapper");
        this.f189862a = cellsBuilder;
        this.f189863b = tradingOrderReviewBottomDisclaimerMapper;
    }

    @Override // kul.l
    public final boolean a(nel.n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return instrument.b() && instrument.f214597c == z.EQUITY;
    }

    @Override // kul.l
    public final List b(k itemsContent) throws Throwable {
        List listC;
        List listG;
        List listC2;
        List listG2;
        List listL;
        TradingLegalEntityInformation tradingLegalEntityInformation = itemsContent.e;
        FiatExchangeOrderQuoteResult fiatExchangeOrderQuoteResult = itemsContent.f189867g;
        Intrinsics.checkNotNullParameter(itemsContent, "itemsContent");
        bfl.g gVar = itemsContent.f189864a;
        nel.n nVar = itemsContent.f189873p;
        OrderQuote orderQuote = itemsContent.f;
        r0 r0Var = itemsContent.f189866c;
        if (gVar != bfl.g.BUY) {
            hx7.e.n(new IllegalStateException(r0Var + " order are not supported for " + gVar));
            return f0.f322471a;
        }
        int i = i.f189861a[r0Var.ordinal()];
        q qVar = this.f189863b;
        h hVar = this.f189862a;
        if (i == 1) {
            oel.l lVar = itemsContent.v;
            if (lVar == null) {
                return f0.f322471a;
            }
            Instant instant = lVar.f;
            if (instant != null) {
                PlainTextDelegate.Model model = new PlainTextDelegate.Model("IPO_FINAL_PRICE_WARNING_LIST_ID", (Clause) null, (Clause) new TextLocalisedClause(R$string.wealth_trading_orders_review_pre_ipo_number_of_shares_warning, u.c(new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DayAndMonth(0), null, null, 12)), null, 12), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                listC = u.c(model);
            } else {
                listC = null;
            }
            qv0.i[] elements = {hVar.b(itemsContent.f189864a, itemsContent.f, itemsContent.f189868h, itemsContent.f189866c, nVar.f214597c), h.j(hVar, orderQuote.f104755g.f104731a, itemsContent.f189866c, itemsContent.f189873p, itemsContent.d, false), h.s(orderQuote, gVar), h.l(orderQuote, nVar), hVar.r(orderQuote, r0Var, nVar.f214597c)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL2 = kotlin.collections.d.L(elements);
            yp0.b.k(listL2, 0, 0, 0, 0, 31);
            if (fiatExchangeOrderQuoteResult != null) {
                listG = h.g(fiatExchangeOrderQuoteResult);
                yp0.b.k(listG, 0, 0, 0, 0, 31);
            } else {
                listG = null;
            }
            Instant instant2 = lVar.d;
            if (instant2 != null) {
                CellDetailsActionDelegate.Model modelE = h.e(instant2);
                yp0.b.l(modelE, 0, 0, 0, 0, null, false, 63);
                listC2 = u.c(modelE);
            } else {
                listC2 = null;
            }
            List listC3 = c(itemsContent);
            TextDelegate.Model modelA = qVar.a(tradingLegalEntityInformation.f105106a, r0Var, gVar);
            List[] elements2 = {listC, listL2, listG, listC2, listC3, modelA != null ? u.c(modelA) : null};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            return w.u(kotlin.collections.d.L(elements2));
        }
        if (i != 2) {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            hx7.e.n(new IllegalStateException(r0Var + " order are not supported for " + gVar));
            return f0.f322471a;
        }
        qv0.i[] elements3 = {hVar.r(orderQuote, r0Var, nVar.f214597c), h.l(orderQuote, nVar), h.s(orderQuote, gVar), hVar.b(itemsContent.f189864a, itemsContent.f, itemsContent.f189868h, itemsContent.f189866c, nVar.f214597c), h.j(hVar, orderQuote.f104755g.f104731a, itemsContent.f189866c, itemsContent.f189873p, itemsContent.d, false)};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        List listL3 = kotlin.collections.d.L(elements3);
        yp0.b.k(listL3, 0, 0, 0, 0, 31);
        if (fiatExchangeOrderQuoteResult != null) {
            listG2 = h.g(fiatExchangeOrderQuoteResult);
            yp0.b.k(listG2, 0, 0, 0, 0, 31);
        } else {
            listG2 = null;
        }
        ZonedDateTime zonedDateTime = itemsContent.i;
        if (zonedDateTime != null) {
            qv0.i[] elements4 = {h.h(zonedDateTime, r0Var), h.i(itemsContent.k)};
            Intrinsics.checkNotNullParameter(elements4, "elements");
            listL = kotlin.collections.d.L(elements4);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
        } else {
            listL = null;
        }
        List listC4 = c(itemsContent);
        TextDelegate.Model modelA2 = qVar.a(tradingLegalEntityInformation.f105106a, r0Var, gVar);
        List[] elements5 = {listL3, listG2, listL, listC4, modelA2 != null ? u.c(modelA2) : null};
        Intrinsics.checkNotNullParameter(elements5, "elements");
        return w.u(kotlin.collections.d.L(elements5));
    }

    public final List c(k kVar) {
        qv0.i iVarA = this.f189862a.a(kVar.f189875r, kVar.e.f105106a, kVar.f189864a);
        if (iVarA != null) {
            yp0.b.l(iVarA, 0, 0, 0, 0, null, false, 63);
        } else {
            iVarA = null;
        }
        return v.l(iVarA);
    }
}
