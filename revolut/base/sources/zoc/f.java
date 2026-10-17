package zoc;

import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import k4l.c0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1h.j;
import m1h.k;
import zfd.s;
import zhm.f0;
import zhm.h0;
import znd.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zjh.f f323967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1j.b f323968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f323969c;
    public final qmc.b d;
    public final rul.e e;

    public f(zjh.f roboPortfolioInteractor, t1j.b portfolioRecurringOrdersInteractor, l80.e dateProvider, qmc.b roboContextProvider, rul.e sourcePocketCurrencyProvider) {
        Intrinsics.checkNotNullParameter(roboPortfolioInteractor, "roboPortfolioInteractor");
        Intrinsics.checkNotNullParameter(portfolioRecurringOrdersInteractor, "portfolioRecurringOrdersInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        Intrinsics.checkNotNullParameter(sourcePocketCurrencyProvider, "sourcePocketCurrencyProvider");
        this.f323967a = roboPortfolioInteractor;
        this.f323968b = portfolioRecurringOrdersInteractor;
        this.f323969c = dateProvider;
        this.d = roboContextProvider;
        this.e = sourcePocketCurrencyProvider;
    }

    @Override // m1h.k
    public final Flow a(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return new go.g(f0.f322471a, 2);
    }

    @Override // m1h.k
    public final Flow b(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return nim.a.v(rd0.e.b(t1j.b.m(this.f323968b, transferSubjectId.getF95657a())), new u0(3));
    }

    @Override // m1h.k
    public final go.g c(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return zi0.c.i(Boolean.TRUE);
    }

    @Override // m1h.k
    public final Flow d(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        od0.i.Companion.getClass();
        return zi0.c.i(od0.i.f224256b);
    }

    @Override // m1h.k
    public final Flow e(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return rd0.e.n(nim.a.v(zh9.u0.m(rd0.e.b(this.f323967a.B(transferSubjectId.getF95657a(), w4l.h.f294642c)), this.d.c(transferSubjectId.getF95657a())), new u0(4)), h0.f322473a);
    }

    @Override // m1h.k
    public final go.g f(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return new go.g(zi0.c.P(new j(new m1h.i(((l80.f) this.f323969c).e(), c0.MONTH)), false, null, 3), 2);
    }

    @Override // m1h.k
    public final Flow g(TransferSubjectId transferSubjectId) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        return xam.a.h(new s(this, (Continuation) null, 22), rd0.e.b(this.f323967a.B(transferSubjectId.getF95657a(), w4l.h.f294642c)));
    }
}
