package rhh;

import ael.q0;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import t1h.n;
import vkm.q;
import ybl.k;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.d f254476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f254477b;

    public g(ybl.d portfolioInteractor, k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f254476a = portfolioInteractor;
        this.f254477b = tradingAccountsInteractor;
    }

    @Override // t1h.n
    public final Flow a(String portfolioId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return v7.y("TaxAdvantageWithdrawToolbarProvider", "observeState", q.q(nim.a.v(xam.a.h(new f(this, portfolioId, null), ((q0) this.f254477b).o(portfolioId, w4l.h.f294642c)), new ou5.a(17, currency))));
    }

    @Override // t1h.n
    public final Flow b(String portfolioId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return com.revolut.data.database.models.openbanking.d.x("TaxAdvantageWithdrawToolbarProvider", "getToolbarTitle", nim.a.v(((q0) this.f254477b).o(portfolioId, w4l.h.f294642c), new rg3.d(this, 19)));
    }
}
