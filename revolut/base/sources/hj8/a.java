package hj8;

import akg.n;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mki.d;
import nj8.b;
import nj8.h;
import vkm.q;
import w4l.k;
import wkm.l;

/* JADX INFO: loaded from: classes13.dex */
public interface a {
    static n a(a aVar, String juniorRegId, k loadingStrategy) {
        nj8.n nVar = (nj8.n) aVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(juniorRegId, "juniorRegId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(nVar.k(null, loadingStrategy), new b(juniorRegId, 0));
    }

    static ctk.b c(a aVar, String juniorRegId, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(juniorRegId, "juniorRegId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new ctk.b(((nj8.n) aVar).k(null, loadingStrategy), juniorRegId, 1);
    }

    static l d(a aVar, String juniorRegId, k loadingStrategy) {
        nj8.n nVar = (nj8.n) aVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(juniorRegId, "juniorRegId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return q.Q(nVar.f(loadingStrategy), new d((Continuation) null, nVar, juniorRegId, loadingStrategy, 1));
    }

    static l e(a aVar, k loadingStrategy) {
        nj8.n nVar = (nj8.n) aVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return q.Q(nVar.f(loadingStrategy), new h(null, nVar, loadingStrategy, 2));
    }
}
