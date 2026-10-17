package vdm;

import aem.d1;
import aem.h0;
import aem.j0;
import aem.m;
import aem.p0;
import aem.t0;
import aem.u0;
import aem.x;
import aem.y0;
import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import fem.g;
import fem.i;
import hem.f;
import io.ktor.client.engine.HttpClientEngine;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import skm.g1;
import skm.h1;
import zhm.d0;

/* JADX INFO: loaded from: classes23.dex */
public final class b implements CoroutineScope, Closeable {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(b.class, "closed");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpClientEngine f288078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f288079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineContext f288080c;

    @NotNull
    private volatile /* synthetic */ int closed;
    public final g d;
    public final f e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hem.b f288081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final oem.e f288082h;
    public final jem.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f288083j;

    public b(HttpClientEngine engine, e other) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(other, "userConfig");
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(other, "userConfig");
        this.f288078a = engine;
        this.closed = 0;
        h1 h1Var = new h1((Job) engine.getCoroutineContext().get(g1.f263979a));
        this.f288079b = h1Var;
        this.f288080c = engine.getCoroutineContext().plus(h1Var);
        this.d = new g();
        this.e = new f();
        i iVar = new i();
        this.f = iVar;
        this.f288081g = new hem.b();
        this.f288082h = new oem.e();
        this.i = new jem.b(0);
        e eVar = new e();
        this.f288083j = eVar;
        Intrinsics.checkNotNullParameter(this, "client");
        Continuation continuation = null;
        iVar.f(i.i, new d1(this, (ydm.d) engine, null));
        iVar.f(i.f134674j, new aem.a(this, continuation, 4));
        int i = 20;
        eVar.a(u0.f3784b, new nb.e(i));
        eVar.a(aem.g.f3721c, new nb.e(i));
        eVar.a(x.d, new nb.e(i));
        if (other.e) {
            nb.e block = new nb.e(19);
            Intrinsics.checkNotNullParameter("DefaultTransformers", "key");
            Intrinsics.checkNotNullParameter(block, "block");
            eVar.f288090c.put("DefaultTransformers", block);
        }
        eVar.a(y0.f3798b, new nb.e(i));
        bem.c cVar = h0.f3729b;
        eVar.a(cVar, new nb.e(i));
        if (other.d) {
            eVar.a(t0.d, new nb.e(i));
        }
        Intrinsics.checkNotNullParameter(other, "other");
        eVar.d = other.d;
        eVar.e = other.e;
        eVar.f288088a.putAll(other.f288088a);
        eVar.f288089b.putAll(other.f288089b);
        eVar.f288090c.putAll(other.f288090c);
        if (other.e) {
            eVar.a(p0.f3765b, new nb.e(i));
        }
        oem.a aVar = m.f3746a;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        aem.d block2 = new aem.d(eVar);
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(block2, "block");
        eVar.a(cVar, block2);
        Intrinsics.checkNotNullParameter(this, "client");
        Iterator it8 = eVar.f288088a.values().iterator();
        while (it8.hasNext()) {
            ((Function1) it8.next()).invoke(this);
        }
        Iterator it9 = eVar.f288090c.values().iterator();
        while (it9.hasNext()) {
            ((Function1) it9.next()).invoke(this);
        }
        this.e.f(f.f, new bem.g(this, continuation, 2));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        boolean zIsTerminated;
        if (k.compareAndSet(this, 0, 1)) {
            oem.e eVar = (oem.e) this.f288082h.b(j0.f3736a);
            for (oem.a aVar : d0.d1(eVar.c().keySet())) {
                Intrinsics.i(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object objB = eVar.b(aVar);
                if (objB instanceof AutoCloseable) {
                    AutoCloseable autoCloseable = (AutoCloseable) objB;
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        ExecutorService executorService = (ExecutorService) autoCloseable;
                        if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            boolean z = false;
                            while (!zIsTerminated) {
                                try {
                                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                } catch (InterruptedException unused) {
                                    if (!z) {
                                        executorService.shutdownNow();
                                        z = true;
                                    }
                                }
                            }
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else {
                        if (!(autoCloseable instanceof MediaMetadataRetriever)) {
                            throw new IllegalArgumentException();
                        }
                        ((MediaMetadataRetriever) autoCloseable).release();
                    }
                }
            }
            this.f288079b.h0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(fem.d r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vdm.a
            if (r0 == 0) goto L13
            r0 = r6
            vdm.a r0 = (vdm.a) r0
            int r1 = r0.f288077w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288077w = r1
            goto L18
        L13:
            vdm.a r0 = new vdm.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288077w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            jem.b r6 = r4.i
            glm.a r2 = iem.a.f160830a
            r6.c(r2)
            java.lang.Object r6 = r5.d
            r0.f288077w = r3
            fem.g r2 = r4.d
            java.lang.Object r6 = r2.a(r5, r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            java.lang.String r5 = "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall"
            kotlin.jvm.internal.Intrinsics.i(r6, r5)
            wdm.f r6 = (wdm.f) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vdm.b.d(fem.d, gim.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f288080c;
    }

    public final String toString() {
        return "HttpClient[" + this.f288078a + ']';
    }
}
