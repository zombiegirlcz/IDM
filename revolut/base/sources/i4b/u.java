package i4b;

import aw0.k7;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cfd.api.domain.models.Fee;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.feature.retail.cfd.api.domain.models.OvernightFee;
import com.revolut.feature.retail.cfd.impl.R$string;
import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreenContract$InputData;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import d9.e1;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class u implements jki.p {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CfdOrderReviewScreenContract$InputData f158387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wul.o f158388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l4b.y f158389c;
    public final l4b.j d;
    public final l4b.s e;
    public final l4b.b0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l4b.o f158390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l4b.h f158391h;
    public final g5b.c i;

    public u(l4i.a amountConverter, CfdOrderReviewScreenContract$InputData inputData, wul.o tradingOrderMapper, l4b.y priceMapper, l4b.j expiryDateMapper, l4b.s overnightFeeMapper, l4b.b0 spreadMapper, l4b.o feeMapper, l4b.h disclaimersMapper, g5b.c exitStrategiesMapper, l4b.f marketTimingMapper) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(tradingOrderMapper, "tradingOrderMapper");
        Intrinsics.checkNotNullParameter(priceMapper, "priceMapper");
        Intrinsics.checkNotNullParameter(expiryDateMapper, "expiryDateMapper");
        Intrinsics.checkNotNullParameter(overnightFeeMapper, "overnightFeeMapper");
        Intrinsics.checkNotNullParameter(spreadMapper, "spreadMapper");
        Intrinsics.checkNotNullParameter(feeMapper, "feeMapper");
        Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
        Intrinsics.checkNotNullParameter(exitStrategiesMapper, "exitStrategiesMapper");
        Intrinsics.checkNotNullParameter(marketTimingMapper, "marketTimingMapper");
        this.f158387a = inputData;
        this.f158388b = tradingOrderMapper;
        this.f158389c = priceMapper;
        this.d = expiryDateMapper;
        this.e = overnightFeeMapper;
        this.f = spreadMapper;
        this.f158390g = feeMapper;
        this.f158391h = disclaimersMapper;
        this.i = exitStrategiesMapper;
    }

    public static k4l.r0 c(e2b.a aVar) {
        int i = t.f158386c[aVar.ordinal()];
        if (i == 1) {
            return k4l.r0.MARKET;
        }
        if (i == 2) {
            return k4l.r0.LIMIT;
        }
        if (i == 3) {
            return k4l.r0.STOP;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) throws Throwable {
        dj0.d dVarB;
        Clause textClause;
        int i;
        boolean z;
        boolean z3;
        CompositeClause compositeClauseM;
        InstrumentImage instrumentImage;
        Data data;
        List listC;
        MarginQuote marginQuoteA;
        MarginQuote marginQuoteA2;
        OvernightFee overnightFee;
        BigDecimal bigDecimal;
        MarginQuote marginQuoteA3;
        Amount amount;
        BigDecimal bigDecimal2;
        boolean z4;
        Optional optional;
        n domainState = (n) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CfdOrderReviewScreenContract$InputData cfdOrderReviewScreenContract$InputData = this.f158387a;
        BigDecimal bigDecimal3 = cfdOrderReviewScreenContract$InputData.f82277b;
        nel.n nVar = cfdOrderReviewScreenContract$InputData.f82278c;
        Fee fee2 = null;
        if (bigDecimal3 != null) {
            f8l.c cVar = f8l.c.FIAT;
            xi0.b bVar = nVar.i;
            dVarB = l4i.a.b(new Amount(bigDecimal3, new Asset(cVar, bVar.f306286a, bVar)));
        } else {
            dVarB = null;
        }
        Data data2 = domainState.f158357a;
        e2b.a aVar = domainState.f158359c;
        dj0.d dVar = (dj0.d) iii.c.f(data2, new ar3.a(13, dVarB), new hw9.b(dVarB, 29), new gzb.d(this, 25));
        if (dVar != null) {
            textClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12);
        } else {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        BigDecimal bigDecimal4 = cfdOrderReviewScreenContract$InputData.f82279g;
        TextLocalisedClause textLocalisedClauseL = this.f158388b.l(cfdOrderReviewScreenContract$InputData.f, c(cfdOrderReviewScreenContract$InputData.f82280h), new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o((bigDecimal4.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal4.stripTrailingZeros()).toPlainString(), " ", nVar.e), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), nVar.f214597c);
        Data data3 = domainState.f158363l;
        ydf.d dVar2 = (data3 == null || (optional = (Optional) data3.getContent()) == null) ? null : (ydf.d) optional.orElse(null);
        k4l.r0 orderType = c(aVar);
        Float fValueOf = Float.valueOf(12.0f);
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        if (dVar2 == null) {
            compositeClauseM = null;
            z = false;
            z3 = true;
        } else {
            int i2 = l4b.g.f192082a[orderType.ordinal()];
            if (i2 == 1) {
                i = R$string.wealth_margin_cfd_order_review_market_timing_limit;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        throw new IllegalStateException("Market orders do not have CFD market timing copy");
                    }
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Recurring orders do not have CFD market timing copy");
                }
                i = R$string.wealth_margin_cfd_order_review_market_timing_stop;
            }
            z = false;
            z3 = true;
            compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new ImageClause(R$drawable.uikit_icn_24_moon, Integer.valueOf(R$attr.uikit_colorDeepGrey), fValueOf, fValueOf, 16), new TextLocalisedClause(i, zhm.u.c(new TimeClause(Duration.ofMinutes(dVar2.f312689b).toMillis(), new TimeClause.Format.Duration(new TimeClause.Format.Duration.DurationStyle.Textual(com.revolut.core.ui_kit.models.p0.MINUTES)), null, null, 12)), null, 12)));
        }
        m6 m6Var = n6.Companion;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_common_submit, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        m mVar = (m) data2.getContent();
        aw0.e eVar = new aw0.e(true, compositeClauseM, null, m6.c(m6Var, textLocalisedClause, defaultFilledButton, null, "CFD_ORDER_REVIEW_SCREEN_NEXT_BUTTON_TAG", (mVar == null || (marginQuoteA3 = mVar.a()) == null || (amount = marginQuoteA3.d) == null || (bigDecimal2 = amount.f104717a) == null || e1.D(bigDecimal2) != (z4 = z3)) ? z : z4, null, null, null, 972), null, null, 52);
        InstrumentImage instrumentImage2 = new InstrumentImage(nVar.f214596b, 30, null, null);
        Collection collection = (Collection) iii.c.f(data2, new i3k.h(this), new i2l.n0(6), new hb4.n(this, domainState, 23));
        wi0.b bVar2 = domainState.f158362j;
        ((l4b.i) this.f158391h).getClass();
        wi0.b.Companion.getClass();
        boolean zF = Intrinsics.f(bVar2, wi0.b.y2);
        h hVar = h.f158342a;
        g gVar = g.f158333a;
        if (zF) {
            instrumentImage = instrumentImage2;
            data = data2;
            List listK = zhm.v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_cfds_disclaimer_pt_car_text, zhm.v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_cfds_disclaimer_eu_trading_terms, null, new Click(28, (Integer) null, (Object) gVar, "cfds-trading-terms-click", false), 10), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_cfds_disclaimer_pt_trading_risks, null, new Click(28, (Integer) null, (Object) i.f158345a, "your-capital-is-at-risk-click", false), 10), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclaimer_eu_order_handling_policy, null, new Click(28, (Integer) null, (Object) hVar, "order-handling-policy-click", false), 10)), null, 12), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_cfds_order_review_disclaimer_pt, null, null, 14));
            t0 t0Var = t0.f186434a;
            listC = zhm.u.c(new TextDelegate.Model(0, 0, 1020, new CompositeClause(listK, new TextClause(a0.d.r(m70.a.o(t0Var), m70.a.o(t0Var)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), "cfd-order-review-disclaimers"));
        } else {
            instrumentImage = instrumentImage2;
            data = data2;
            listC = zhm.u.c(new TextDelegate.Model(0, 0, 1020, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_cfds_order_review_disclaimer_eu, zhm.v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_cfds_disclaimer_eu_trading_terms, null, new Click(28, (Integer) null, (Object) gVar, "cfds-trading-terms-click", false), 10), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclaimer_eu_order_handling_policy, null, new Click(28, (Integer) null, (Object) hVar, "order-handling-policy-click", false), 10)), null, 12), "cfd-order-review-disclaimers"));
        }
        ArrayList arrayListE0 = zhm.d0.E0(listC, collection);
        m mVar2 = (m) data.getContent();
        p pVar = (mVar2 == null || (marginQuoteA2 = mVar2.a()) == null || (overnightFee = marginQuoteA2.f82114h) == null || (bigDecimal = overnightFee.f82123b) == null) ? null : new p(bigDecimal);
        m mVar3 = (m) data.getContent();
        if (mVar3 != null && (marginQuoteA = mVar3.a()) != null) {
            fee2 = marginQuoteA.f82116l;
        }
        return new r(textClause, textLocalisedClauseL, instrumentImage, eVar, pVar, fee2, new o(domainState.f158361h, aVar), arrayListE0);
    }

    public final CellDetailsDelegate.Model b(MarginQuote marginQuote) {
        return new CellDetailsDelegate.Model("ID_CELL_UNITS", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_margin_cfd_order_confirmation_units, null, null, 14), (Image) null, 0, false, 30), new AssetClause(marginQuote.d.f104717a, new AssetClauseType.Stock(0), this.f158387a.f82278c.e, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 16), null, null, null, null, 0, null, false, false, null, null, 32760);
    }
}
