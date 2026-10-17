package wcf;

import do3.q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qe0.o;
import th6.p;
import uyd.e0;
import w6h.f;
import x4l.c;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f296414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f296415b;

    public a(usc.a fiatExchangeOrderQuoteDodFactory, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(fiatExchangeOrderQuoteDodFactory, "fiatExchangeOrderQuoteDodFactory");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f296414a = appCoroutineScope;
        Continuation continuation = null;
        this.f296415b = q.f(new c(new p(fiatExchangeOrderQuoteDodFactory, continuation, 26), new f(29), new w6b.a(21), new rp1.c(2, 24, null), new e0(3, 11, continuation)), appCoroutineScope);
    }
}
