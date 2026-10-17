package vzg;

import a26.q;
import a82.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n9l.b;
import r10.r;
import w4l.h;
import x8h.k;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public interface a {
    static /* synthetic */ Flow c(r rVar, String str, b bVar, xi0.b bVar2, int i) {
        if ((i & 4) != 0) {
            bVar = b.SEC_3;
        }
        if ((i & 8) != 0) {
            bVar2 = null;
        }
        return rVar.v(str, h.f294642c, bVar, bVar2);
    }

    static Flow e(r rVar, String portfolioId) {
        rVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new q(rVar, portfolioId, (Continuation) null, 6), u0.m(nim.a.v(rVar.u(portfolioId, null, loadingStrategy), new l(26)), ((k) rVar.f250852b).b()));
    }
}
