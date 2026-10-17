package c8i;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.payments.api.PaymentsToggles$PaymentsChargesMigration;
import com.revolut.feature_market_data_api.navigation.ExchangeBreakdownFeatureConfig;
import com.revolut.feature_market_data_api.navigation.FeeBreakdownFeatureConfig;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import grl.k9;
import java.math.BigDecimal;
import java.math.MathContext;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements w5i.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.b f22234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f22235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rga.c f22236c;

    public z(o7.b orderQuoteInteractor, gte.a featureToggleInteractor, n6i.b accountWrapperOrderQuotePocketIdProvider, rga.c priceQuoteTraceIdHolder) {
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(accountWrapperOrderQuotePocketIdProvider, "accountWrapperOrderQuotePocketIdProvider");
        Intrinsics.checkNotNullParameter(priceQuoteTraceIdHolder, "priceQuoteTraceIdHolder");
        this.f22234a = orderQuoteInteractor;
        this.f22235b = featureToggleInteractor;
        this.f22236c = priceQuoteTraceIdHolder;
    }

    public final ExchangeBreakdownFeatureConfig b(AccountWrapper sourceAccountWrapper, AccountWrapper targetAccountWrapper, long j2, boolean z, OrderQuote orderQuote, c4i.a transactionType, OrderMode orderMode) {
        Intrinsics.checkNotNullParameter(sourceAccountWrapper, "sourceAccountWrapper");
        Intrinsics.checkNotNullParameter(targetAccountWrapper, "targetAccountWrapper");
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(orderMode, "orderMode");
        LegacyOrderQuoteParams legacyOrderQuoteParamsE = e(sourceAccountWrapper, targetAccountWrapper, j2, z, orderMode, false);
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ExchangeBreakdownFeatureConfig(legacyOrderQuoteParamsE, orderQuote, transactionType, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), false, 1008);
    }

    public final FeeBreakdownFeatureConfig c(AccountWrapper sourceAccountWrapper, AccountWrapper targetAccountWrapper, long j2, boolean z, ChargeBreakdown orderFee, c4i.a transactionType, OrderMode orderMode) {
        Intrinsics.checkNotNullParameter(sourceAccountWrapper, "sourceAccountWrapper");
        Intrinsics.checkNotNullParameter(targetAccountWrapper, "targetAccountWrapper");
        Intrinsics.checkNotNullParameter(orderFee, "orderFee");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(orderMode, "orderMode");
        LegacyOrderQuoteParams legacyOrderQuoteParamsE = e(sourceAccountWrapper, targetAccountWrapper, j2, z, orderMode, false);
        k9 value = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return new FeeBreakdownFeatureConfig(legacyOrderQuoteParamsE, orderFee, transactionType, new AnalyticsProduct.Retail(value), false, (xi0.b) null, false, false, 1968);
    }

    public final jhi.b d(AccountWrapper sourceAccountWrapper, AccountWrapper targetAccountWrapper, long j2, boolean z, OrderMode orderMode, boolean z3) {
        Intrinsics.checkNotNullParameter(sourceAccountWrapper, "sourceAccountWrapper");
        Intrinsics.checkNotNullParameter(targetAccountWrapper, "targetAccountWrapper");
        Intrinsics.checkNotNullParameter(orderMode, "orderMode");
        return mo3.a.g(o7.b.s(this.f22234a, e(sourceAccountWrapper, targetAccountWrapper, j2, z, orderMode, z3)), null, null, 3);
    }

    public final LegacyOrderQuoteParams e(AccountWrapper accountWrapper, AccountWrapper accountWrapper2, long j2, boolean z, OrderMode orderMode, boolean z3) {
        Pair pair;
        f8l.e eVar;
        xi0.b currency = accountWrapper.getCurrency();
        xi0.b currency2 = accountWrapper2.getCurrency();
        j8l.a aVar = accountWrapper.f97224a;
        j8l.a aVar2 = accountWrapper2.f97224a;
        boolean z4 = cp5.d.z(currency2);
        boolean z6 = cp5.d.z(currency);
        Pair pair2 = z ? new Pair(currency, f8l.b.FROM) : new Pair(currency2, f8l.b.TO);
        xi0.b currency3 = (xi0.b) pair2.f186385a;
        f8l.b bVar = (f8l.b) pair2.f186386b;
        f8l.c cVar = z4 ? f8l.c.CRYPTO : cp5.d.y(currency2) ? f8l.c.COMMODITY : f8l.c.FIAT;
        f8l.c cVar2 = z6 ? f8l.c.CRYPTO : cp5.d.y(currency) ? f8l.c.COMMODITY : f8l.c.FIAT;
        f8l.b bVar2 = (!z6 && z4) ? f8l.b.TO : f8l.b.FROM;
        f8l.f fVar = f(aVar, aVar2, currency, currency2) ? f8l.f.SAVINGS : f8l.f.RETAIL;
        boolean z11 = orderMode instanceof OrderMode.Scheduling;
        boolean z12 = z11 && (z6 || z4);
        if (orderMode instanceof OrderMode.Threshold) {
            OrderMode.Threshold threshold = (OrderMode.Threshold) orderMode;
            BigDecimal bigDecimalDivide = threshold.e;
            int i = y.f22233a[threshold.f97231a.ordinal()];
            if (i == 1) {
                eVar = f8l.e.LIMIT;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = f8l.e.STOP;
            }
            if ((threshold.d == j8l.d.SELL) != (bVar2 == f8l.b.FROM)) {
                bigDecimalDivide = BigDecimal.ONE.divide(bigDecimalDivide, MathContext.DECIMAL128);
            }
            pair = new Pair(eVar, bigDecimalDivide);
        } else {
            if (!(orderMode instanceof OrderMode.Market) && !z11 && !(orderMode instanceof OrderMode.Automation)) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(f8l.e.MARKET, null);
        }
        f8l.e eVar2 = (f8l.e) pair.f186385a;
        BigDecimal bigDecimal = (BigDecimal) pair.f186386b;
        f8l.b bVar3 = bVar2;
        Asset asset = new Asset(cVar2, currency.f306286a, currency);
        Asset asset2 = new Asset(cVar, currency2.f306286a, currency2);
        Intrinsics.checkNotNullParameter(currency3, "currency");
        BigDecimal bigDecimalDivide2 = BigDecimal.valueOf(j2).divide(cp5.d.j(currency3));
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide2, "divide(...)");
        String strA = n6i.b.a(accountWrapper);
        String strA2 = n6i.b.a(accountWrapper2);
        String strB = this.f22236c.b("move_money_price_quote");
        return new LegacyOrderQuoteParams(asset, asset2, eVar2, bigDecimalDivide2, bVar, bVar3, bigDecimal, z12, null, fVar, strA, strA2, Boolean.valueOf(z3), strB == null ? null : strB, 256);
    }

    public final boolean f(j8l.a sourceAccountType, j8l.a targetAccountType, xi0.b sourceAccountCurrency, xi0.b targetAccountCurrency) {
        Intrinsics.checkNotNullParameter(sourceAccountType, "sourceAccountType");
        Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
        Intrinsics.checkNotNullParameter(sourceAccountCurrency, "sourceAccountCurrency");
        Intrinsics.checkNotNullParameter(targetAccountCurrency, "targetAccountCurrency");
        if (!pw5.a.s(sourceAccountType) && !pw5.a.s(targetAccountType)) {
            return false;
        }
        xi0.a aVar = xi0.b.Companion;
        aVar.getClass();
        xi0.b bVar = xi0.b.D;
        if (!Intrinsics.f(sourceAccountCurrency, bVar)) {
            return false;
        }
        aVar.getClass();
        return Intrinsics.f(targetAccountCurrency, bVar);
    }

    public final boolean g(j8l.a sourceAccountType, j8l.a targetAccountType, xi0.b sourceCurrency, xi0.b targetCurrency) {
        j8l.a aVar;
        Intrinsics.checkNotNullParameter(sourceAccountType, "sourceAccountType");
        Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        if (!Intrinsics.f(sourceCurrency, targetCurrency) || sourceAccountType == (aVar = j8l.a.CREDIT_CARD)) {
            return true;
        }
        if (targetAccountType == aVar) {
            xi0.b.Companion.getClass();
            if (Intrinsics.f(targetCurrency, xi0.b.F)) {
                return true;
            }
        }
        return ((jte.d) this.f22235b).c(PaymentsToggles$PaymentsChargesMigration.f79158c) || f(sourceAccountType, targetAccountType, sourceCurrency, targetCurrency);
    }

    public final boolean h(AccountWrapper sourceAccountWrapper, AccountWrapper targetAccountWrapper, long j2, boolean z, OrderQuote orderQuote, OrderMode orderMode) {
        Intrinsics.checkNotNullParameter(sourceAccountWrapper, "sourceAccountWrapper");
        Intrinsics.checkNotNullParameter(targetAccountWrapper, "targetAccountWrapper");
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(orderMode, "orderMode");
        LegacyOrderQuoteParams legacyOrderQuoteParamsE = e(sourceAccountWrapper, targetAccountWrapper, j2, z, orderMode, false);
        return orderQuote.f104752a == legacyOrderQuoteParamsE.e && Intrinsics.f(orderQuote.f104754c.f104718b, legacyOrderQuoteParamsE.f104734a) && Intrinsics.f(orderQuote.e.f104718b, legacyOrderQuoteParamsE.f104735b) && (!z ? (a.a.L(orderQuote.e).f115082a > j2 ? 1 : (a.a.L(orderQuote.e).f115082a == j2 ? 0 : -1)) == 0 : (a.a.L(orderQuote.f104754c).f115082a > j2 ? 1 : (a.a.L(orderQuote.f104754c).f115082a == j2 ? 0 : -1)) == 0);
    }
}
