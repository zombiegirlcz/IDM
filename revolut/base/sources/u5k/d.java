package u5k;

import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import efm.d0;
import efm.r;
import f8l.e;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import toh.h;
import u3a.q;
import u4e.i;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.b f277459a;

    public d(o7.b orderQuoteInteractor) {
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        this.f277459a = orderQuoteInteractor;
    }

    public final d0 a(dj0.d targetMoney, xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        xi0.b bVar = targetMoney.f115083b;
        long j2 = targetMoney.f115082a;
        if (Intrinsics.f(bVar, baseCurrency)) {
            ufm.b bVarM = d0.m(Long.valueOf(j2));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        d0 d0VarFirstOrError = m70.a.g(this.f277459a.p(new LegacyOrderQuoteParams(new Asset(cp5.d.z(bVar) ? f8l.c.CRYPTO : cp5.d.y(bVar) ? f8l.c.COMMODITY : f8l.c.FIAT, bVar.f306286a, bVar), new Asset(f8l.c.FIAT, baseCurrency.f306286a, baseCurrency), e.MARKET, BigDecimal.valueOf(j2 / cp5.d.k(bVar)), f8l.b.FROM, f8l.b.TO, null, false, null, null, null, null, null, null, 16128)), null, null, 3).firstOrError();
        q qVar = new q(new i(10), 9);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, qVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final r b(r walletLimitsObservable, r targetMoneyObservable, r baseCurrencyObservable) {
        Intrinsics.checkNotNullParameter(walletLimitsObservable, "walletLimitsObservable");
        Intrinsics.checkNotNullParameter(targetMoneyObservable, "targetMoneyObservable");
        Intrinsics.checkNotNullParameter(baseCurrencyObservable, "baseCurrencyObservable");
        r rVarSwitchMap = walletLimitsObservable.switchMap(new q(new h(targetMoneyObservable, 11, baseCurrencyObservable, this), 6));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }
}
