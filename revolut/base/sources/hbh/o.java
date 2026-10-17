package hbh;

import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import x8h.q;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f150750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tzg.m f150751b;

    public o(q investTransactionsInteractor, tzg.m wealthAccountsInteractor) {
        Intrinsics.checkNotNullParameter(investTransactionsInteractor, "investTransactionsInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.f150750a = investTransactionsInteractor;
        this.f150751b = wealthAccountsInteractor;
    }

    public final akg.n a(InvestTransactionsFilter filter, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(this.f150750a.b(new z2f.f(filter), loadingStrategy), new n(filter, 1));
    }

    public final Flow b(InvestTransactionsFilter filter, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        InvestTransactionsFilter.InvestTransactionsFilterImpl investTransactionsFilterImpl = (InvestTransactionsFilter.InvestTransactionsFilterImpl) filter;
        String str = investTransactionsFilterImpl.f105343c;
        tzg.m mVar = this.f150751b;
        return xam.a.h(new an8.a(this, filter, loadingStrategy, (Continuation) null, 4), vkm.q.q(rd0.e.n(str != null ? nim.a.v(tzg.m.b(mVar, str), new hb4.k(18)) : !investTransactionsFilterImpl.f105341a.isEmpty() ? nim.a.v(tzg.m.c(mVar, null, null, 3), new n(filter, 0)) : (investTransactionsFilterImpl.d == null && investTransactionsFilterImpl.e == null && investTransactionsFilterImpl.f == null && investTransactionsFilterImpl.f105342b.isEmpty()) ? nim.a.v(tzg.m.c(mVar, null, null, 3), new hb4.k(19)) : zi0.c.i(Boolean.TRUE), h0.f322473a)));
    }
}
