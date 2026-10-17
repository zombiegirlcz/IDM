package v9h;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import d4f.p;
import e8h.u;
import efm.r;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m62.l;
import sgm.e3;
import te0.w;
import vkm.q;
import w4l.h;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3 f287072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2f.a f287073b;

    public f(e3 popularFirstBuyInteractor, y2f.a tradingTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(popularFirstBuyInteractor, "popularFirstBuyInteractor");
        Intrinsics.checkNotNullParameter(tradingTransactionsInteractor, "tradingTransactionsInteractor");
        this.f287072a = popularFirstBuyInteractor;
        this.f287073b = tradingTransactionsInteractor;
    }

    public final Flow a() {
        InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
        WealthAccountType wealthAccountType = WealthAccountType.SECURITIES;
        companion.getClass();
        return q.q(rd0.e.e(mo3.a.g(nim.a.v(((p) this.f287073b).j(new z2f.f(InvestTransactionsFilter.Companion.a(wealthAccountType)), h.f294642c), new v80.a(8)), null, new v78.d(7), 1), m72.b.w("PopularFirstBuyWidget", "hasTradedBefore"), new tc6.d(3, 27, null)));
    }

    public final r b() {
        r map = rd0.e.c(((u) this.f287072a.f262806b).f123730b.f203547a.C0(m8h.d.d, m8h.d.f203546c), g.f186406a).map(new m78.e(new l(16), 1));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return w.f0(map);
    }
}
