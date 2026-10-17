package nw5;

import com.revolut.core.model.account.AccountId;
import efm.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import noi.l;
import nvg.b0;
import te0.w;
import wsg.n;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ppk.f f219769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv5.c f219770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f219771c;
    public final ufm.g d;

    public a(ppk.f ratesInteractor, xv5.c cryptoCommodityBaseCurrencyInteractor, n walletInteractor, ufm.g performanceInteractor) {
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(performanceInteractor, "performanceInteractor");
        this.f219769a = ratesInteractor;
        this.f219770b = cryptoCommodityBaseCurrencyInteractor;
        this.f219771c = walletInteractor;
        this.d = performanceInteractor;
    }

    public final r a(List sortedCurrencies, n9l.b period) {
        Intrinsics.checkNotNullParameter(sortedCurrencies, "sortedCurrencies");
        Intrinsics.checkNotNullParameter(period, "period");
        r rVarFlatMap = c(sortedCurrencies).flatMap(new l(19, new b0(this, period, 4)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }

    public final r b(List sortedCurrencies, tzg.j timeFrame) {
        Intrinsics.checkNotNullParameter(sortedCurrencies, "sortedCurrencies");
        Intrinsics.checkNotNullParameter(timeFrame, "timeFrame");
        r rVarFlatMap = c(sortedCurrencies).flatMap(new l(18, new b0(this, timeFrame, 3)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }

    public final r c(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        xv5.c cVar = this.f219770b;
        r rVarB = xv5.c.b(cVar);
        xv5.g gVar = cVar.f309206b;
        r map = rd0.e.c(gVar.f309210a.C0("KEY_SELECTED_COMMODITY_CURRENCY", String.class), kotlin.coroutines.g.f186406a).map(new xt1.a(16, new xng.l(gVar, 24)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarSwitchMap = map.switchMap(new xt1.a(15, new xng.l(cVar, 23)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        r rVarX = this.f219771c.x(AccountId.Personal.f51414a).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        r map2 = w.m(rVarB, rVarSwitchMap, rVarX).map(new l(20, new njf.e(list, 5)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return map2;
    }
}
