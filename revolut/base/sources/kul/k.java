package kul;

import com.revolut.data.model.Data;
import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.trading.orders.ui.invest.placement.models.FiatExchangeOrderQuoteResult;
import com.revolut.trading.orders.ui.trade.model.ExtendedHoursStatus;
import ip0.v7;
import java.time.ZonedDateTime;
import java.util.List;
import k4l.e0;
import k4l.q0;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfl.g f189864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f189865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f189866c;
    public final e0 d;
    public final TradingLegalEntityInformation e;
    public final OrderQuote f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FiatExchangeOrderQuoteResult f189867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f189868h;
    public final ZonedDateTime i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final od0.i f189869j;
    public final ExtendedHoursStatus k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f189870l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final od0.i f189871m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AutoTopUpStatus f189872n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nel.n f189873p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SourcePocketWrapper f189874q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TradingAccount f189875r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hel.a f189876s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Data f189877t;
    public final jel.c u;
    public final oel.l v;

    public k(bfl.g tradeSide, q0 timeInForce, r0 orderType, e0 orderLimits, TradingLegalEntityInformation tradingLegalEntityInformation, OrderQuote orderQuote, FiatExchangeOrderQuoteResult fiatExchangeOrderQuoteResult, dj0.d displayTotalMoney, ZonedDateTime zonedDateTime, od0.i upgradeEntryPointItemOptional, ExtendedHoursStatus extendedHoursStatus, boolean z, od0.i frequencySettings, AutoTopUpStatus autoTopUpStatus, List upsellingBanners, nel.n instrument, SourcePocketWrapper sourcePocketWrapper, TradingAccount tradingAccount, hel.a stocksConfig, Data data, jel.c cVar, oel.l lVar) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(displayTotalMoney, "displayTotalMoney");
        Intrinsics.checkNotNullParameter(upgradeEntryPointItemOptional, "upgradeEntryPointItemOptional");
        Intrinsics.checkNotNullParameter(extendedHoursStatus, "extendedHoursStatus");
        Intrinsics.checkNotNullParameter(frequencySettings, "frequencySettings");
        Intrinsics.checkNotNullParameter(autoTopUpStatus, "autoTopUpStatus");
        Intrinsics.checkNotNullParameter(upsellingBanners, "upsellingBanners");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(sourcePocketWrapper, "sourcePocketWrapper");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(stocksConfig, "stocksConfig");
        this.f189864a = tradeSide;
        this.f189865b = timeInForce;
        this.f189866c = orderType;
        this.d = orderLimits;
        this.e = tradingLegalEntityInformation;
        this.f = orderQuote;
        this.f189867g = fiatExchangeOrderQuoteResult;
        this.f189868h = displayTotalMoney;
        this.i = zonedDateTime;
        this.f189869j = upgradeEntryPointItemOptional;
        this.k = extendedHoursStatus;
        this.f189870l = z;
        this.f189871m = frequencySettings;
        this.f189872n = autoTopUpStatus;
        this.o = upsellingBanners;
        this.f189873p = instrument;
        this.f189874q = sourcePocketWrapper;
        this.f189875r = tradingAccount;
        this.f189876s = stocksConfig;
        this.f189877t = data;
        this.u = cVar;
        this.v = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f189864a == kVar.f189864a && this.f189865b == kVar.f189865b && this.f189866c == kVar.f189866c && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f189867g, kVar.f189867g) && Intrinsics.f(this.f189868h, kVar.f189868h) && Intrinsics.f(this.i, kVar.i) && Intrinsics.f(this.f189869j, kVar.f189869j) && Intrinsics.f(this.k, kVar.k) && this.f189870l == kVar.f189870l && Intrinsics.f(this.f189871m, kVar.f189871m) && Intrinsics.f(this.f189872n, kVar.f189872n) && Intrinsics.f(this.o, kVar.o) && Intrinsics.f(this.f189873p, kVar.f189873p) && Intrinsics.f(this.f189874q, kVar.f189874q) && Intrinsics.f(this.f189875r, kVar.f189875r) && Intrinsics.f(this.f189876s, kVar.f189876s) && Intrinsics.f(this.f189877t, kVar.f189877t) && Intrinsics.f(this.u, kVar.u) && Intrinsics.f(this.v, kVar.v);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + com.revolut.data.database.models.openbanking.d.f(this.f189866c, (this.f189865b.hashCode() + (this.f189864a.hashCode() * 31)) * 31, 31)) * 31)) * 31)) * 31;
        FiatExchangeOrderQuoteResult fiatExchangeOrderQuoteResult = this.f189867g;
        int iC = v7.c((iHashCode + (fiatExchangeOrderQuoteResult == null ? 0 : fiatExchangeOrderQuoteResult.hashCode())) * 31, 31, this.f189868h);
        ZonedDateTime zonedDateTime = this.i;
        int iHashCode2 = (this.f189876s.hashCode() + o.b(this.f189875r, (this.f189874q.hashCode() + a10.b.d(this.f189873p, p.a.d((this.f189872n.hashCode() + r6.b.f(this.f189871m, j6.a.c((this.k.hashCode() + r6.b.f(this.f189869j, (iC + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, 31)) * 31, 31, this.f189870l), 31)) * 31, 31, this.o), 31)) * 31, 31)) * 31;
        Data data = this.f189877t;
        int iHashCode3 = (iHashCode2 + (data == null ? 0 : data.hashCode())) * 31;
        jel.c cVar = this.u;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        oel.l lVar = this.v;
        return iHashCode4 + (lVar != null ? lVar.hashCode() : 0);
    }
}
