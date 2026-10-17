package pe0;

import akl.w;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import vkm.j2;
import vkm.q0;
import vkm.z1;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b80.c f235310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f235311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f235312c;
    public final HashSet d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z1 f235313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j2 f235314h;
    public final hlm.c i;

    public q(b80.c networkStateRepository, ue0.c storage, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f235310a = networkStateRepository;
        this.f235311b = storage;
        this.f235312c = coroutineScope;
        this.d = new HashSet();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        z1 z1VarA = vkm.q.a(0, 0, ukm.f.SUSPEND);
        this.f235313g = z1VarA;
        j2 j2VarC = vkm.q.c(f0.f322471a);
        this.f235314h = j2VarC;
        this.i = hlm.d.a();
        Continuation continuation = null;
        e0.C(coroutineScope, null, null, new w(this, continuation, 4), 3);
        vkm.q.G(new q0(rd0.e.b(networkStateRepository.c(true)), new g(this, continuation, 0), 1), coroutineScope);
        vkm.q.G(new q0(z1VarA, new afe.a(this, continuation, 14), 1), coroutineScope);
        vkm.q.G(rd0.e.d(new q0(vkm.q.t(j2VarC, 1), new g(this, continuation, 1), 1), h0.f322473a), coroutineScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(pe0.q r6, pe0.e r7, gim.c r8) {
        /*
            vkm.j2 r0 = r6.f235314h
            boolean r1 = r8 instanceof pe0.i
            if (r1 == 0) goto L15
            r1 = r8
            pe0.i r1 = (pe0.i) r1
            int r2 = r1.f235291y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f235291y = r2
            goto L1a
        L15:
            pe0.i r1 = new pe0.i
            r1.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r1.f235289w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f235291y
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2e
            hlm.c r6 = r1.v
            pe0.e r7 = r1.u
            yhm.o.b(r8)
            goto L48
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            yhm.o.b(r8)
            hlm.c r6 = r6.i
            r1.u = r7
            r1.v = r6
            r1.f235291y = r4
            java.lang.Object r8 = r6.lock(r5, r1)
            if (r8 != r2) goto L48
            return r2
        L48:
            java.lang.Object r8 = r0.getValue()     // Catch: java.lang.Throwable -> L72
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L72
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L72
            r1.<init>()     // Catch: java.lang.Throwable -> L72
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L72
        L57:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L72
            if (r2 == 0) goto L74
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L72
            r3 = r2
            pe0.f r3 = (pe0.f) r3     // Catch: java.lang.Throwable -> L72
            java.lang.String r3 = r3.f235285a     // Catch: java.lang.Throwable -> L72
            java.lang.String r4 = r7.f235285a     // Catch: java.lang.Throwable -> L72
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r4)     // Catch: java.lang.Throwable -> L72
            if (r3 != 0) goto L57
            r1.add(r2)     // Catch: java.lang.Throwable -> L72
            goto L57
        L72:
            r7 = move-exception
            goto L86
        L74:
            java.util.ArrayList r7 = zhm.d0.F0(r7, r1)     // Catch: java.lang.Throwable -> L72
            r0.getClass()     // Catch: java.lang.Throwable -> L72
            r0.g(r5, r7)     // Catch: java.lang.Throwable -> L72
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L72
            r6.unlock(r5)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L86:
            r6.unlock(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pe0.q.a(pe0.q, pe0.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(pe0.q r9, pe0.f r10, gim.c r11) throws java.lang.Exception {
        /*
            kotlinx.coroutines.CoroutineScope r0 = r9.f235312c
            java.util.concurrent.ConcurrentHashMap r1 = r9.e
            boolean r2 = r11 instanceof pe0.n
            if (r2 == 0) goto L17
            r2 = r11
            pe0.n r2 = (pe0.n) r2
            int r3 = r2.f235303x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f235303x = r3
            goto L1c
        L17:
            pe0.n r2 = new pe0.n
            r2.<init>(r9, r11)
        L1c:
            java.lang.Object r11 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f235303x
            r5 = 3
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L39
            if (r4 != r6) goto L31
            pe0.f r10 = r2.u
            yhm.o.b(r11)     // Catch: java.lang.Exception -> L2f
            goto L7a
        L2f:
            r11 = move-exception
            goto L8a
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            yhm.o.b(r11)
            vkm.j2 r11 = r9.f235314h
            java.lang.Object r11 = r11.getValue()
            java.util.List r11 = (java.util.List) r11
            boolean r11 = r11.contains(r10)
            if (r11 != 0) goto L4d
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L4d:
            java.util.HashSet r11 = r9.d     // Catch: java.lang.Exception -> L2f
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Exception -> L2f
        L53:
            boolean r4 = r11.hasNext()     // Catch: java.lang.Exception -> L2f
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r11.next()     // Catch: java.lang.Exception -> L2f
            r8 = r4
            pe3.c r8 = (pe3.c) r8     // Catch: java.lang.Exception -> L2f
            r8.getClass()     // Catch: java.lang.Exception -> L2f
            boolean r8 = pe3.c.a(r10)     // Catch: java.lang.Exception -> L2f
            if (r8 == 0) goto L53
            goto L6b
        L6a:
            r4 = r7
        L6b:
            pe3.c r4 = (pe3.c) r4     // Catch: java.lang.Exception -> L2f
            if (r4 == 0) goto Lc0
            r2.u = r10     // Catch: java.lang.Exception -> L2f
            r2.f235303x = r6     // Catch: java.lang.Exception -> L2f
            java.lang.Object r11 = r4.b(r10, r2)     // Catch: java.lang.Exception -> L2f
            if (r11 != r3) goto L7a
            return r3
        L7a:
            java.util.concurrent.ConcurrentHashMap r11 = r9.f     // Catch: java.lang.Exception -> L2f
            pdi.j r2 = new pdi.j     // Catch: java.lang.Exception -> L2f
            r3 = 2
            r2.<init>(r10, r9, r7, r3)     // Catch: java.lang.Exception -> L2f
            skm.a2 r2 = skm.e0.C(r0, r7, r7, r2, r5)     // Catch: java.lang.Exception -> L2f
            r11.put(r10, r2)     // Catch: java.lang.Exception -> L2f
            goto Lc0
        L8a:
            boolean r2 = r11 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto Lc3
            java.lang.String r11 = r10.f235285a
            java.lang.Object r11 = r1.get(r11)
            if (r11 != 0) goto L9c
            java.lang.Integer r11 = new java.lang.Integer
            r2 = 0
            r11.<init>(r2)
        L9c:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            b80.c r2 = r9.f235310a
            boolean r2 = r2.b()
            if (r2 == 0) goto Lc0
            if (r11 >= r5) goto Lc0
            java.lang.String r2 = r10.f235285a
            int r3 = r11 + 1
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r3)
            r1.put(r2, r4)
            dp4.y0 r1 = new dp4.y0
            r1.<init>(r11, r9, r10, r7)
            skm.e0.C(r0, r7, r7, r1, r5)
        Lc0:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        Lc3:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pe0.q.b(pe0.q, pe0.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(pe0.q r5, pe0.f r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof pe0.p
            if (r0 == 0) goto L13
            r0 = r7
            pe0.p r0 = (pe0.p) r0
            int r1 = r0.f235309y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f235309y = r1
            goto L18
        L13:
            pe0.p r0 = new pe0.p
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f235307w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f235309y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            hlm.c r6 = r0.v
            pe0.f r0 = r0.u
            yhm.o.b(r7)
            r7 = r6
            r6 = r0
            goto L48
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            yhm.o.b(r7)
            hlm.c r7 = r5.i
            r0.u = r6
            r0.v = r7
            r0.f235309y = r3
            java.lang.Object r0 = r7.lock(r4, r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            vkm.j2 r5 = r5.f235314h     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = r5.getValue()     // Catch: java.lang.Throwable -> L5f
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L5f
            java.util.ArrayList r6 = zhm.d0.A0(r0, r6)     // Catch: java.lang.Throwable -> L5f
            r5.g(r4, r6)     // Catch: java.lang.Throwable -> L5f
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L5f
            r7.unlock(r4)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L5f:
            r5 = move-exception
            r7.unlock(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pe0.q.c(pe0.q, pe0.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.ArrayList r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof pe0.o
            if (r0 == 0) goto L13
            r0 = r7
            pe0.o r0 = (pe0.o) r0
            int r1 = r0.f235306y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f235306y = r1
            goto L18
        L13:
            pe0.o r0 = new pe0.o
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f235304w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f235306y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            hlm.c r6 = r0.v
            java.util.ArrayList r0 = r0.u
            yhm.o.b(r7)
            r7 = r6
            r6 = r0
            goto L48
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            yhm.o.b(r7)
            r0.u = r6
            hlm.c r7 = r5.i
            r0.v = r7
            r0.f235306y = r3
            java.lang.Object r0 = r7.lock(r4, r0)
            if (r0 != r1) goto L48
            return r1
        L48:
            vkm.j2 r0 = r5.f235314h     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L5f
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L5f
            java.util.List r6 = zhm.d0.B0(r1, r6)     // Catch: java.lang.Throwable -> L5f
            r0.setValue(r6)     // Catch: java.lang.Throwable -> L5f
            kotlin.Unit r6 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L5f
            r7.unlock(r4)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L5f:
            r6 = move-exception
            r7.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pe0.q.d(java.util.ArrayList, gim.c):java.lang.Object");
    }
}
