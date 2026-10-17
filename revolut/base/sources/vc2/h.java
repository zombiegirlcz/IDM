package vc2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw1.b f287623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iz1.m f287624b;

    public h(vw1.b aliasRepository, iz1.m settingsRepository) {
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        Intrinsics.checkNotNullParameter(settingsRepository, "settingsRepository");
        this.f287623a = aliasRepository;
        this.f287624b = settingsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(vc2.h r4, gim.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof vc2.f
            if (r0 == 0) goto L16
            r0 = r5
            vc2.f r0 = (vc2.f) r0
            int r1 = r0.f287621w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f287621w = r1
            goto L1b
        L16:
            vc2.f r0 = new vc2.f
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f287621w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L49
            goto L44
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r5)
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L49
            vw1.b r4 = r4.f287623a     // Catch: java.lang.Throwable -> L49
            r0.f287621w = r3     // Catch: java.lang.Throwable -> L49
            uy1.j r4 = (uy1.j) r4     // Catch: java.lang.Throwable -> L49
            java.lang.Object r5 = r4.g(r0)     // Catch: java.lang.Throwable -> L49
            if (r5 != r1) goto L44
            return r1
        L44:
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L49
            yhm.m$a r4 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L49
            goto L50
        L49:
            r4 = move-exception
            yhm.m$a r5 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r4)
        L50:
            java.lang.Throwable r4 = yhm.m.a(r5)
            if (r4 != 0) goto L57
            goto L63
        L57:
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r4, r5)
            zhm.f0 r5 = zhm.f0.f322471a
        L63:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vc2.h.a(vc2.h, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable b(vc2.h r5, gim.c r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof vc2.g
            if (r0 == 0) goto L16
            r0 = r6
            vc2.g r0 = (vc2.g) r0
            int r1 = r0.f287622w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f287622w = r1
            goto L1b
        L16:
            vc2.g r0 = new vc2.g
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f287622w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L52
        L2b:
            r5 = move-exception
            goto L86
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b
            iz1.m r5 = r5.f287624b     // Catch: java.lang.Throwable -> L2b
            java.lang.String r6 = "GIRO_QVIK"
            r0.f287622w = r4     // Catch: java.lang.Throwable -> L2b
            ikf.g r2 = new ikf.g     // Catch: java.lang.Throwable -> L2b
            r4 = 28
            r2.<init>(r5, r6, r3, r4)     // Catch: java.lang.Throwable -> L2b
            skm.p0 r5 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L2b
            elm.f r5 = elm.f.f127540b     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = skm.e0.J(r5, r2, r0)     // Catch: java.lang.Throwable -> L2b
            if (r6 != r1) goto L52
            goto La2
        L52:
            o02.f r6 = (o02.f) r6     // Catch: java.lang.Throwable -> L2b
            java.util.List r5 = r6.f221102a     // Catch: java.lang.Throwable -> L2b
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Throwable -> L2b
            r6 = 10
            int r6 = zhm.w.t(r5, r6)     // Catch: java.lang.Throwable -> L2b
            int r6 = zhm.q0.b(r6)     // Catch: java.lang.Throwable -> L2b
            r0 = 16
            if (r6 >= r0) goto L67
            r6 = r0
        L67:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L2b
        L70:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r6 == 0) goto L83
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L2b
            r1 = r6
            o02.e r1 = (o02.e) r1     // Catch: java.lang.Throwable -> L2b
            o02.d r1 = r1.f221100a     // Catch: java.lang.Throwable -> L2b
            r0.put(r1, r6)     // Catch: java.lang.Throwable -> L2b
            goto L70
        L83:
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b
            goto L8c
        L86:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r0 = yhm.o.a(r5)
        L8c:
            java.lang.Throwable r5 = yhm.m.a(r0)
            if (r5 != 0) goto L94
            r1 = r0
            goto La2
        L94:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r3, r3, r5, r6)
            java.util.Map r5 = zhm.r0.g()
            r1 = r5
        La2:
            java.io.Serializable r1 = (java.io.Serializable) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vc2.h.b(vc2.h, gim.c):java.io.Serializable");
    }
}
