package s28;

import akg.n;
import ble.o1;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import wkm.l;
import ybl.k;
import zhm.d0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jt0.b f259260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f259261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0k.e f259262c;
    public final k d;

    public f(jt0.b feedInteractor, gte.a featureToggleInteractor, m0k.e wealthNewsInteractor, k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(feedInteractor, "feedInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(wealthNewsInteractor, "wealthNewsInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f259260a = feedInteractor;
        this.f259261b = featureToggleInteractor;
        this.f259262c = wealthNewsInteractor;
        this.d = tradingAccountsInteractor;
    }

    public final n a(int i) {
        return nim.a.v(rd0.e.b(m0k.e.b(this.f259262c, WealthNewsCategory.Stocks.f101808b, false, null, null, null, null, Integer.valueOf(i + 1), true, 60)), new s1c.a(11));
    }

    public final l b(int i) {
        return q.Q(boh.f.e(this.f259260a.y0(v.k(x08.c.REV_INSIGHT, x08.c.PRICE_ALERT), h0.f322473a, null), new e(this, i, 2)), new o1(3, null, c(i)));
    }

    public final l c(int i) {
        return q.Q(boh.f.e(rd0.e.n(rd0.e.b(m0k.e.b(this.f259262c, WealthNewsCategory.Stocks.f101808b, true, null, d0.d1(h.f), null, null, Integer.valueOf(i + 1), true, 52)), h0.f322473a), new e(this, i, 0)), new o1(3, null, a(i)));
    }
}
