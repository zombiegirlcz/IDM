package qmc;

import kotlin.jvm.internal.Intrinsics;
import ocb.u;
import ql6.s;
import vkm.q0;
import ybl.k;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f247794a;

    public b(k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f247794a = tradingAccountsInteractor;
    }

    public final q0 a() {
        return rd0.e.n(nim.a.v(nim.a.v(k.k(this.f247794a, null, null, null, 7), new s(10)), new s(11)), h0.f322473a);
    }

    public final q0 b(boolean z) {
        return rd0.e.n(nim.a.v(boh.f.e(nim.a.v(nim.a.v(k.k(this.f247794a, null, null, null, 7), new u(z, 23)), new s(12)), new a(this, 0)), new s(13)), h0.f322473a);
    }

    public final q0 c(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return rd0.e.n(nim.a.v(boh.f.e(nim.a.v(((ael.q0) this.f247794a).o(portfolioId, w4l.h.f294642c), new s(14)), new a(this, 1)), new s(15)), h0.f322473a);
    }
}
