package a72;

import a09.p;
import com.revolut.feature.apm.multibanco.impl.data.network.MultibancoWithdrawalService;
import do3.q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import qe0.o;
import te0.w;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements i {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f1761j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultibancoWithdrawalService f1762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c72.d f1763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f1764c;
    public final l80.e d;
    public final CoroutineScope e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f1765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f1766h;
    public final o i;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f1761j = kotlin.time.c.g(5, pkm.e.SECONDS);
    }

    public m(MultibancoWithdrawalService service, c72.d withdrawalDao, ne0.j memoryCache, l80.e dateProvider, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(withdrawalDao, "withdrawalDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f1762a = service;
        this.f1763b = withdrawalDao;
        this.f1764c = memoryCache;
        this.d = dateProvider;
        this.e = appCoroutineScope;
        this.f = w.y0(new a2g.a(this, 3));
        Continuation continuation = null;
        x4l.c cVar = new x4l.c(new a09.o(this, continuation, 3), new a0.c(this, 27), new a09.b(this, 16), new a07.d(this, continuation, 9), new p(this, continuation, 3));
        this.f1765g = cVar;
        x4l.c cVar2 = new x4l.c(new k(this, continuation, 0), new a5g.h(11), new a5g.l(7), new a0l.k(this, continuation, 13), new p(this, continuation, 2));
        this.f1766h = q.f(cVar, appCoroutineScope);
        this.i = q.f(cVar2, appCoroutineScope);
    }
}
