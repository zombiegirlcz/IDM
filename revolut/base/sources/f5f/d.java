package f5f;

import ael.y;
import akg.n;
import dv5.p;
import go.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import t1h.i;
import w4l.h;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.d f132310a;

    public d(ybl.d portfolioInteractor) {
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f132310a = portfolioInteractor;
    }

    @Override // t1h.i
    public final n a(String portfolioId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return nim.a.v(((y) this.f132310a).e(portfolioId, h.f294642c), new p(15, currency));
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
        if (withdrawTarget != null) {
            return new g(zi0.c.P(new t1h.h(12, new dj0.d(1L, sourceCurrency), true), false, null, 3), 2);
        }
        throw new NoWhenBranchMatchedException();
    }
}
