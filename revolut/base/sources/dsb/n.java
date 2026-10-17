package dsb;

import aw0.o9;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.trading_orders.api.invest.placement.locked_period.SecurityAssetBalanceBreakdownScreenDescriptor$InputData;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.retail.wealth.resources.R$string;
import d9.e1;
import gsb.o;
import gsb.p;
import gsb.q;
import gsb.r;
import gsb.s;
import gsb.t;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final evl.c f117288a;

    public n(evl.c sourcePocketMapper) {
        Intrinsics.checkNotNullParameter(sourcePocketMapper, "sourcePocketMapper");
        this.f117288a = sourcePocketMapper;
    }

    @Override // dsb.c
    public final boolean a(qrb.k tradeInstrumentData, t tVar) {
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        if (tradeInstrumentData instanceof qrb.j) {
            return tVar == null || (tVar instanceof s);
        }
        return false;
    }

    @Override // dsb.c
    public final Clause b(qrb.k tradeInstrumentData, t tVar) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        if (!(tradeInstrumentData instanceof qrb.j)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (tVar == null) {
            return f((qrb.j) tradeInstrumentData, null);
        }
        if (!(tVar instanceof s)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        s sVar = (s) tVar;
        if (sVar.equals(gsb.m.f146362a)) {
            return f((qrb.j) tradeInstrumentData, Integer.valueOf(R$attr.uikit_colorRed));
        }
        if (sVar instanceof gsb.n) {
            qrb.j jVar = (qrb.j) tradeInstrumentData;
            long j2 = ((gsb.n) tVar).f146363a;
            if (jVar instanceof qrb.h) {
                i2 = R$string.wealth_stock_orders_error_maximum_order_value_order;
            } else {
                if (!(jVar instanceof qrb.i)) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$string.wealth_stock_sell_max_order_warning;
            }
            return new TextLocalisedClause(i2, u.c(new MoneyClause(new dj0.d(j2, jVar.n().i), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 8);
        }
        if (sVar instanceof o) {
            int i3 = ((o) tVar).f146364a;
            int i5 = R$string.wealth_stock_max_order_quantity_warning;
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i3);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            return new TextLocalisedClause(i5, u.c(new AssetClause(bigDecimalValueOf, new AssetClauseType.Stock(0), ((qrb.j) tradeInstrumentData).n().e, null, null, 24)), new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 8);
        }
        if (!(sVar instanceof p)) {
            if (sVar.equals(r.f146367a)) {
                return new TextLocalisedClause(R$string.wealth_stock_orders_fractional_share_error, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
            }
            if (sVar.equals(q.f146366a)) {
                return f((qrb.j) tradeInstrumentData, Integer.valueOf(R$attr.uikit_colorGrey50));
            }
            throw new NoWhenBranchMatchedException();
        }
        qrb.j jVar2 = (qrb.j) tradeInstrumentData;
        long j3 = ((p) tVar).f146365a;
        if (jVar2 instanceof qrb.h) {
            i = R$string.wealth_stock_orders_error_minimum_order_value_order;
        } else {
            if (!(jVar2 instanceof qrb.i)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_stock_sell_min_order_warning;
        }
        return new TextLocalisedClause(i, u.c(new MoneyClause(new dj0.d(j3, jVar2.n().i), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 8);
    }

    @Override // dsb.c
    public final m c(qrb.k tradeInstrumentData, t tVar) {
        m kVar;
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        if (!(tradeInstrumentData instanceof qrb.j)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        qrb.j jVar = (qrb.j) tradeInstrumentData;
        if (jVar instanceof qrb.h) {
            kVar = new j((qrb.h) tradeInstrumentData);
        } else {
            if (!(jVar instanceof qrb.i)) {
                throw new NoWhenBranchMatchedException();
            }
            qrb.i iVar = (qrb.i) tradeInstrumentData;
            kVar = new k(iVar);
            if (e1.I(iVar.f.f248682b.f104717a)) {
                kVar = null;
            }
        }
        if (tVar != null) {
            if (!(tVar instanceof s)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            s sVar = (s) tVar;
            if ((sVar instanceof gsb.n) || (sVar instanceof o) || (sVar instanceof p) || sVar.equals(r.f146367a)) {
                return null;
            }
            if (!sVar.equals(q.f146366a) && !sVar.equals(gsb.m.f146362a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return kVar;
    }

    @Override // dsb.c
    public final boolean d(m parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return parcel instanceof l;
    }

    @Override // dsb.c
    public final aii.e e(m parcel) {
        Clause textClause;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (!(parcel instanceof l)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        l lVar = (l) parcel;
        if (!(lVar instanceof j)) {
            if (!(lVar instanceof k)) {
                throw new NoWhenBranchMatchedException();
            }
            qrb.i iVar = ((k) parcel).f117287a;
            return new gdf.a(new SecurityAssetBalanceBreakdownScreenDescriptor$InputData(iVar.f248698b, iVar.f248697a.getF105262a(), null));
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_advanced_charts_order_view_info_pop_up_available_to_invest_title, null, null, 14);
        qrb.h hVar = ((j) parcel).f117286a;
        SourcePocket sourcePocket = hVar.f248692a;
        boolean z = sourcePocket instanceof SourcePocket.Holding;
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        if (z) {
            textClause = new TextLocalisedClause(R$string.trading_advanced_charts_order_view_info_pop_up_available_to_invest_text, v.k(new CurrencyClause(((SourcePocket.Holding) sourcePocket).getF91784h(), ticker, null, 4), this.f117288a.d(hVar.f248692a, hVar.f248693b, null)), null, 12);
        } else if (sourcePocket instanceof SourcePocket.Pocket) {
            textClause = new TextLocalisedClause(R$string.trading_advanced_charts_order_view_info_pop_up_main_pocket_text, u.c(new CurrencyClause(((SourcePocket.Pocket) sourcePocket).getF91784h(), ticker, null, 4)), null, 12);
        } else {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new rrb.a(textClause, textLocalisedClause);
    }

    public final Clause f(qrb.j jVar, Integer num) {
        Integer num2;
        Custom custom;
        if (!(jVar instanceof qrb.h)) {
            if (!(jVar instanceof qrb.i)) {
                throw new NoWhenBranchMatchedException();
            }
            qrb.i iVar = (qrb.i) jVar;
            qrb.a aVar = iVar.f;
            if (e1.I(aVar.f248682b.f104717a)) {
                return new TextLocalisedClause(R$string.trading_advanced_charts_order_view_info_no_shares, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
            }
            return ce9.m.P(new TextLocalisedClause(R$string.trading_advanced_charts_order_view_info_available_to_sell, u.c(new AssetClause(aVar.f248682b.f104717a, new AssetClauseType.Stock(0), iVar.f248698b.e, null, null, 24)), num != null ? new Custom(num, false, null, false, null, 254) : null, 8), num);
        }
        qrb.h hVar = (qrb.h) jVar;
        SourcePocket sourcePocket = hVar.f248692a;
        SourcePocket.Balance e = sourcePocket.getE();
        Intrinsics.i(e, "null cannot be cast to non-null type com.revolut.feature.trading_orders.common.models.SourcePocket.Balance.MoneyBalance");
        dj0.d dVar = ((SourcePocket.Balance.MoneyBalance) e).f91775a;
        if (num != null) {
            num2 = num;
            custom = new Custom(num2, false, null, false, null, 254);
        } else {
            num2 = num;
            custom = null;
        }
        return ce9.m.P(yoj.b.m(new TextClause(": ", (Style) custom, (Integer) null, false, (o9) null, (List) null, 124), v.k(this.f117288a.a(sourcePocket, hVar.f248693b, custom), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), custom, null, 8))), num2);
    }
}
