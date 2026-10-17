package prl;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f239330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x4l.c f239331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qe0.o f239332c;
    public final x4l.c d;

    public h(f investOrdersDodFactory, e investOrderDodFactory, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(investOrdersDodFactory, "investOrdersDodFactory");
        Intrinsics.checkNotNullParameter(investOrderDodFactory, "investOrderDodFactory");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f239330a = appCoroutineScope;
        Continuation continuation = null;
        x4l.c cVar = new x4l.c(new o29.l(investOrdersDodFactory, continuation, 29), new pp5.d(investOrdersDodFactory, 14), new plb.g(investOrdersDodFactory, 21), new pqc.k(investOrdersDodFactory, continuation, 6), new pfk.q(investOrdersDodFactory, continuation, 10));
        this.f239331b = cVar;
        this.f239332c = do3.q.f(cVar, appCoroutineScope);
        this.d = new x4l.c(new o29.l(investOrderDodFactory, continuation, 28), new pp5.d(investOrderDodFactory, 13), new plb.g(investOrderDodFactory, 20), new pqc.k(investOrderDodFactory, continuation, 5), new p24.q(investOrderDodFactory, continuation, 7));
    }
}
