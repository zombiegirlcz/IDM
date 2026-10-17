package ipc;

import akg.n;
import go.g;
import ip4.m;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import t1h.i;
import w4l.h;
import zjh.f;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f167728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jpc.e f167729b;

    public d(f roboPortfolioInteractor, jpc.e roboWithdrawBreakdownProvider) {
        Intrinsics.checkNotNullParameter(roboPortfolioInteractor, "roboPortfolioInteractor");
        Intrinsics.checkNotNullParameter(roboWithdrawBreakdownProvider, "roboWithdrawBreakdownProvider");
        this.f167728a = roboPortfolioInteractor;
        this.f167729b = roboWithdrawBreakdownProvider;
    }

    @Override // t1h.i
    public final n a(String portfolioId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return nim.a.v(this.f167729b.O(portfolioId, currency), new m(4));
    }

    @Override // t1h.i
    public final g b() {
        od0.i.Companion.getClass();
        return zi0.c.i(od0.i.f224256b);
    }

    @Override // t1h.i
    public final Flow c(xi0.b sourceCurrency, f0h.a withdrawTarget) {
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(withdrawTarget, "withdrawTarget");
        return rd0.e.b(nim.a.w(this.f167728a.C(h.f294642c), new m(3)));
    }
}
