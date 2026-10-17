package dsb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.cfd.api.domain.models.CfdExposureBreakdownOrderType;
import com.revolut.feature.retail.cfd.api.domain.models.CfdExposureBreakdownTarget;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.retail.wealth.resources.R$string;
import gsb.t;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c {
    public static CompositeClause f(qrb.g gVar, Integer num) {
        Integer num2;
        Custom custom;
        int i = R$string.trading_advanced_charts_order_view_info_available_margin;
        List listC = u.c(new MoneyClause(gVar.f248691g.f248681a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12));
        if (num != null) {
            num2 = num;
            custom = new Custom(num2, false, null, false, null, 254);
        } else {
            num2 = num;
            custom = null;
        }
        return ce9.m.P(new TextLocalisedClause(i, listC, custom, 8), num2);
    }

    @Override // dsb.c
    public final boolean a(qrb.k tradeInstrumentData, t tVar) {
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        if (tradeInstrumentData instanceof qrb.g) {
            return tVar == null || (tVar instanceof gsb.g);
        }
        return false;
    }

    @Override // dsb.c
    public final Clause b(qrb.k tradeInstrumentData, t tVar) {
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        if (!(tradeInstrumentData instanceof qrb.g)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (tVar == null) {
            return f((qrb.g) tradeInstrumentData, null);
        }
        if (!(tVar instanceof gsb.g)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        gsb.g gVar = (gsb.g) tVar;
        if (gVar.equals(gsb.c.f146354a)) {
            return f((qrb.g) tradeInstrumentData, Integer.valueOf(R$attr.uikit_colorRed));
        }
        if (gVar instanceof gsb.d) {
            return new TextLocalisedClause(R$string.wealth_margin_trading_orders_error_above_maximum_quantity_order, u.c(new NumberClause(((gsb.d) tVar).f146355a, new NumberClause.Format.AllDigitsAfterDot(null, null, 3), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 8);
        }
        if (gVar instanceof gsb.e) {
            return new TextLocalisedClause(R$string.wealth_margin_trading_orders_error_below_minimum_quantity_order, u.c(new NumberClause(((gsb.e) tVar).f146356a, new NumberClause.Format.AllDigitsAfterDot(null, null, 3), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 8);
        }
        if (gVar.equals(gsb.f.f146357a)) {
            return f((qrb.g) tradeInstrumentData, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // dsb.c
    public final m c(qrb.k tradeInstrumentData, t tVar) {
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        if (!(tradeInstrumentData instanceof qrb.g)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        f fVar = new f((qrb.g) tradeInstrumentData);
        if (tVar != null) {
            if (!(tVar instanceof gsb.g)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            gsb.g gVar = (gsb.g) tVar;
            if ((gVar instanceof gsb.d) || (gVar instanceof gsb.e)) {
                return null;
            }
            if (!gVar.equals(gsb.c.f146354a) && !gVar.equals(gsb.f.f146357a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return fVar;
    }

    @Override // dsb.c
    public final boolean d(m parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return parcel instanceof h;
    }

    @Override // dsb.c
    public final aii.e e(m parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (!(parcel instanceof h)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        h hVar = (h) parcel;
        if (!(hVar instanceof g)) {
            if (!(hVar instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            return new rrb.a(new TextLocalisedClause(R$string.trading_advanced_charts_order_view_info_pop_up_available_margin_description, null, null, 14), new TextLocalisedClause(R$string.trading_advanced_charts_order_view_info_pop_up_available_margin_title, null, null, 14));
        }
        g gVar = (g) parcel;
        qrb.k kVar = gVar.f117283b;
        String str = kVar.n().f214596b;
        MarginQuote marginQuote = gVar.f117282a;
        BigDecimal bigDecimal = marginQuote.d.f104717a;
        bfl.g gVar2 = marginQuote.e;
        String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(kVar.N()).f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new a2b.a(str, bigDecimal, gVar2, string, new CfdExposureBreakdownTarget.Order(CfdExposureBreakdownOrderType.Market.f82096a));
    }
}
