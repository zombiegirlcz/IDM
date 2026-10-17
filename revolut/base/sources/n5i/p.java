package n5i;

import aw0.o9;
import aw0.p9;
import aw0.t0;
import aw0.wa;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.feature_market_data_api.models.OrderQuoteExtraData;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import java.time.Instant;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements l5i.h, s5i.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5i.k f212609a;

    public p(s5i.k helper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        this.f212609a = helper;
    }

    public static Clause b(Amount amount) {
        return amount.f104718b.f104719a == f8l.c.SECURITY ? new NumberClause(amount.f104717a, new NumberClause.Format.AllDigitsAfterDot(wa.STRIP_ALL_TRAILING_ZEROES, p9.ONLY_NEGATIVE), null, o9.NON_SENSITIVE, 4) : e4i.c.a(amount, null, null, null, null, o9.NON_SENSITIVE, 31);
    }

    @Override // l5i.h
    public final Clause a(l5i.g gVar) {
        if (gVar.f192280b == z.MUTUAL_FUND) {
            return new TextLocalisedClause(R$string.market_data_trading_mutual_fund_breakdown_description, null, null, 14);
        }
        Instant instant = gVar.f192279a;
        if (instant != null) {
            return new TextLocalisedClause(R$string.market_data_trading_fund_breakdown_description, u.c(new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, null, 12)), null, 12);
        }
        return null;
    }

    @Override // s5i.h
    public final qv0.i e(OrderQuote orderQuote, Function1 parcel, Function1 cellTitle, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return this.f212609a.e(orderQuote, parcel, cellTitle, bVar);
    }

    @Override // d4i.i
    public final List j(OrderQuote orderQuote, d4i.h itemsConfig, OrderQuoteExtraData orderQuoteExtraData) {
        qv0.i iVarF;
        Amount amount;
        Intrinsics.checkNotNullParameter(orderQuote, "quote");
        Intrinsics.checkNotNullParameter(itemsConfig, "itemsConfig");
        boolean z = orderQuote.f104753b == f8l.b.FROM;
        g cellTitle = new g(10);
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        f8l.e eVar = orderQuote.k;
        Amount amount2 = orderQuote.f104754c;
        Amount amount3 = orderQuote.e;
        int i = o.f212608b[eVar.ordinal()];
        if (i == 1) {
            int i2 = o.f212607a[orderQuote.f104752a.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                amount2 = amount3;
            }
        } else {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Recurring order type is not supported");
            }
            int i3 = o.f212607a[orderQuote.f104753b.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                amount2 = amount3;
            }
        }
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("breakdown.amount", (Clause) cellTitle.invoke(orderQuote), b(amount2), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        qv0.i iVarM = s5i.h.m(this, orderQuote, false, new g(11), new g(12), 2);
        if (z) {
            g cellTitle2 = new g(13);
            Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
            Intrinsics.checkNotNullParameter(cellTitle2, "cellTitle");
            iVarF = this.f212609a.f(orderQuote, cellTitle2);
        } else {
            iVarF = null;
        }
        qv0.i iVarL = (!orderQuote.f104755g.f104731a.f104723b.isEmpty() || z) ? s5i.h.l(this, orderQuote, new g(14), new g(15), null, 8) : null;
        g cellTitle3 = new g(16);
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(cellTitle3, "cellTitle");
        int i5 = o.f212607a[orderQuote.f104752a.ordinal()];
        if (i5 == 1) {
            amount = orderQuote.f;
            if (amount == null) {
                amount = orderQuote.e;
            }
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            amount = orderQuote.d;
            if (amount == null) {
                amount = orderQuote.f104754c;
            }
        }
        qv0.i[] elements = {model, iVarM, iVarF, iVarL, new CellDetailsDelegate.Model("breakdown.estimatedTotal", (Clause) cellTitle3.invoke(orderQuote), b(amount), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, R$attr.uikit_dp24, 0, 0, 29);
        return listL;
    }

    @Override // l5i.h
    public final TextLocalisedClause n(OrderQuote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        return new TextLocalisedClause(R$string.market_data_trading_fund_breakdown_title, null, null, 14);
    }

    @Override // s5i.h
    public final qv0.i o(OrderQuote orderQuote, boolean z, Function1 parcel, Function1 cellTitle) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        Clause textLocalisedClause = (Clause) cellTitle.invoke(orderQuote);
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.market_data_transaction_breakdown_rate, null, null, 14);
        }
        return new CellDetailsDelegate.Model("breakdown.price", new t0(textLocalisedClause, (Image) null, 0, false, 22), e4i.c.a(new Amount(orderQuote.f104757j.f104792a, e1.u(orderQuote).f104718b), null, null, null, null, o9.NON_SENSITIVE, 31), null, null, null, null, 0, null, false, false, null, null, 32760);
    }
}
