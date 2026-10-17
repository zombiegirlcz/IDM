package o36;

import com.revolut.feature.defi.exchange.impl.data.network.DeFiExchangeService;
import com.revolut.feature.defi.exchange.impl.data.network.DeFiSwapSubmitService;
import do3.q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mqc.p;
import nfj.i;
import o29.l;
import qe0.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiExchangeService f221705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeFiSwapSubmitService f221706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x26.a f221707c;
    public final CoroutineScope d;
    public final o e;

    public g(DeFiExchangeService service, DeFiSwapSubmitService submitService, x26.a quoteErrorParser, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(submitService, "submitService");
        Intrinsics.checkNotNullParameter(quoteErrorParser, "quoteErrorParser");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f221705a = service;
        this.f221706b = submitService;
        this.f221707c = quoteErrorParser;
        this.d = appCoroutineScope;
        int i = 3;
        Continuation continuation = null;
        this.e = q.f(new x4l.c(new l(this, continuation, i), new o2g.f(i), new nz7.g(21), new p(2, 14, continuation), new i(3, 6, continuation)), appCoroutineScope);
    }
}
