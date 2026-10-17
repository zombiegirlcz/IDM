package qx4;

import cxe.u;
import grl.r2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mle.x;
import qwd.o;
import vkm.q;
import w4l.k;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class f implements i {
    @Override // qx4.i
    public Flow e(r2 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return q.q(rd0.e.e(xam.a.h(new c(this, origin, null, 1), i(origin)), h0.f322473a, new pc2.d(9)));
    }

    @Override // qx4.i
    public Flow f(r2 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return q.q(rd0.e.e(xam.a.h(new c(this, origin, null, 2), xam.a.h(new d((Continuation) null, this), i(origin))), h0.f322473a, new pc2.d(10)));
    }

    public abstract Flow g(r2 r2Var, boolean z);

    public final x h(k originLoadingStrategy) {
        Intrinsics.checkNotNullParameter(originLoadingStrategy, "originLoadingStrategy");
        return new x(mo3.a.g(d(), null, new qsk.d(19), 1), this, originLoadingStrategy, 17);
    }

    public final u i(r2 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return n14.k.p(xam.a.h(new c(null, this, origin), d()), new o(21));
    }

    public final u j() {
        Flow flowQ = q.q(xam.a.h(new d(this, (Continuation) null), d()));
        pc2.d dVar = new pc2.d(11);
        h0 h0Var = h0.f322473a;
        return n14.k.p(rd0.e.n(rd0.e.e(flowQ, h0Var, dVar), h0Var), new o(20));
    }

    public abstract Flow k(r2 r2Var);
}
