package e56;

import a19.e;
import com.revolut.feature.defi.remittances.impl.data.network.DeFiRemittancesService;
import com.revolut.feature.defi.remittances.impl.data.network.DeFiSendSubmitService;
import do3.q;
import dp4.a1;
import e07.k;
import e31.i;
import e4k.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qe0.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiRemittancesService f122771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeFiSendSubmitService f122772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x26.a f122773c;
    public final CoroutineScope d;
    public final o e;

    public c(DeFiRemittancesService service, DeFiSendSubmitService submitService, x26.a quoteErrorParser, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(submitService, "submitService");
        Intrinsics.checkNotNullParameter(quoteErrorParser, "quoteErrorParser");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f122771a = service;
        this.f122772b = submitService;
        this.f122773c = quoteErrorParser;
        this.d = appCoroutineScope;
        Continuation continuation = null;
        this.e = q.f(new x4l.c(new a1(this, continuation, 7), new f(15), new k(23), new i(2, 2, null), new e(3, 29, continuation)), appCoroutineScope);
    }
}
