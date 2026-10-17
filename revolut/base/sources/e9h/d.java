package e9h;

import efm.r;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ppk.f;
import tzg.j;
import ufm.g;
import wsg.n;
import x8h.k;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements h0h.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f123997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f123998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f123999c;
    public final n d;
    public final xv5.c e;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fk3.a f124000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zjh.c f124001h;

    public d(ybl.b instrumentTickerInteractor, f ratesInteractor, g performanceInteractor, n walletInteractor, xv5.c cryptoCommodityBaseCurrencyInteractor, k displayCurrencyInteractor, fk3.a configurationInteractor, zjh.c indexesInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(performanceInteractor, "performanceInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(indexesInteractor, "indexesInteractor");
        this.f123997a = instrumentTickerInteractor;
        this.f123998b = ratesInteractor;
        this.f123999c = performanceInteractor;
        this.d = walletInteractor;
        this.e = cryptoCommodityBaseCurrencyInteractor;
        this.f = displayCurrencyInteractor;
        this.f124000g = configurationInteractor;
        this.f124001h = indexesInteractor;
    }

    public final r b(List list, h0h.a aVar) {
        j jVar;
        if (list.isEmpty()) {
            return zi0.c.j(f0.f322471a);
        }
        if (aVar != null) {
            switch (c.f123996b[aVar.ordinal()]) {
                case 1:
                    jVar = j.ONE_DAY;
                    break;
                case 2:
                    jVar = j.ONE_WEEK;
                    break;
                case 3:
                    jVar = j.ONE_MONTH;
                    break;
                case 4:
                    jVar = j.THREE_MONTHS;
                    break;
                case 5:
                    jVar = j.SIX_MONTHS;
                    break;
                case 6:
                    jVar = j.ONE_YEAR;
                    break;
                case 7:
                    jVar = j.FIVE_YEARS;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            jVar = null;
        }
        return this.f123999c.d(list, jVar);
    }
}
