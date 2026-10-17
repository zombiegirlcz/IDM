package ul5;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f280889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f280890c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f280891a;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        f280889b = kotlin.time.c.g(5, pkm.e.SECONDS);
        xi0.a aVar = xi0.b.Companion;
        aVar.getClass();
        xi0.b bVar = xi0.b.O;
        aVar.getClass();
        xi0.b[] elements = {bVar, xi0.b.P};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f280890c = kotlin.collections.d.y0(elements);
    }

    public e(fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f280891a = configurationInteractor;
    }

    public static Set b() {
        TimeoutException timeoutException = new TimeoutException("Source SpareChangeExcludedCurrencies does not emit initial value");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, timeoutException, h0Var);
        return f280890c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ul5.b
            if (r0 == 0) goto L13
            r0 = r8
            ul5.b r0 = (ul5.b) r0
            int r1 = r0.f280887x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280887x = r1
            goto L18
        L13:
            ul5.b r0 = new ul5.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280887x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            ul5.e r0 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            goto L4e
        L2a:
            r8 = move-exception
            goto L5c
        L2c:
            r8 = move-exception
            goto L75
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            yhm.o.b(r8)
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            long r5 = ul5.e.f280889b     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            ul5.d r8 = new ul5.d     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r8.<init>(r7, r3)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r0.u = r7     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r0.f280887x = r4     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.Object r8 = skm.h2.e(r5, r8, r0)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            if (r8 != r1) goto L4d
            return r1
        L4d:
            r0 = r7
        L4e:
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            if (r8 != 0) goto L59
            r0.getClass()     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            java.util.Set r8 = b()     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
        L59:
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            goto L62
        L5c:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r8 = yhm.o.a(r8)
        L62:
            java.lang.Throwable r0 = yhm.m.a(r8)
            if (r0 != 0) goto L69
            goto L74
        L69:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r3, r3, r0, r8)
            java.util.Set r8 = ul5.e.f280890c
        L74:
            return r8
        L75:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ul5.e.a(gim.c):java.lang.Object");
    }
}
