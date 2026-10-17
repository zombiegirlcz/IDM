package nx1;

import com.google.common.collect.ImmutableMap;
import com.revolut.feature.apm.core.contacts.data.network.ApmContactsDiscoveryService;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import njj.n0;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class u implements i {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmContactsDiscoveryService f220084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f220085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f220086c;
    public final ox1.i d;

    public u(ApmContactsDiscoveryService service, h cacheManager, ImmutableMap daoInteractors, ox1.i deviceContactMapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(cacheManager, "cacheManager");
        Intrinsics.checkNotNullParameter(daoInteractors, "daoInteractors");
        Intrinsics.checkNotNullParameter(deviceContactMapper, "deviceContactMapper");
        this.f220084a = service;
        this.f220085b = cacheManager;
        this.f220086c = daoInteractors;
        this.d = deviceContactMapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ae, code lost:
    
        if (r0 != r8) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(nx1.u r18, n02.b r19, int r20, java.util.List r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nx1.u.d(nx1.u, n02.b, int, java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0118, code lost:
    
        if (r0 != r8) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(nx1.u r16, java.util.List r17, n02.b r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nx1.u.e(nx1.u, java.util.List, n02.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable f(nx1.u r4, kotlin.jvm.functions.Function1 r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof nx1.s
            if (r0 == 0) goto L16
            r0 = r6
            nx1.s r0 = (nx1.s) r0
            int r1 = r0.f220080w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f220080w = r1
            goto L1b
        L16:
            nx1.s r0 = new nx1.s
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r4 = r0.u
            fim.a r6 = fim.a.COROUTINE_SUSPENDED
            int r1 = r0.f220080w
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            yhm.o.b(r4)     // Catch: java.lang.Throwable -> L48 java.util.concurrent.CancellationException -> L63
            goto L40
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r4)
            yhm.m$a r4 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L48 java.util.concurrent.CancellationException -> L63
            r0.f220080w = r2     // Catch: java.lang.Throwable -> L48 java.util.concurrent.CancellationException -> L63
            java.lang.Object r4 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L48 java.util.concurrent.CancellationException -> L63
            if (r4 != r6) goto L40
            return r6
        L40:
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L48 java.util.concurrent.CancellationException -> L63
            r4.getClass()     // Catch: java.lang.Throwable -> L48 java.util.concurrent.CancellationException -> L63
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L48 java.util.concurrent.CancellationException -> L63
            goto L4f
        L48:
            r4 = move-exception
            yhm.m$a r5 = yhm.m.INSTANCE
            yhm.n r4 = yhm.o.a(r4)
        L4f:
            java.lang.Throwable r5 = yhm.m.a(r4)
            if (r5 != 0) goto L56
            goto L62
        L56:
            zhm.h0 r4 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            r0 = 0
            rd0.d.a(r6, r0, r0, r5, r4)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        L62:
            return r4
        L63:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nx1.u.f(nx1.u, kotlin.jvm.functions.Function1, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nx1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(n02.b r12, com.revolut.feature.apm.core.models.recipients.ApmDescriptor r13, gim.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof nx1.n
            if (r0 == 0) goto L13
            r0 = r14
            nx1.n r0 = (nx1.n) r0
            int r1 = r0.f220069y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220069y = r1
            goto L18
        L13:
            nx1.n r0 = new nx1.n
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f220067w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f220069y
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            nx1.y r12 = r0.v
            yhm.o.b(r14)
            return r12
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            n02.b r12 = r0.u
            yhm.o.b(r14)
            r6 = r11
            goto L74
        L3c:
            yhm.o.b(r14)
            mtj.i r5 = new mtj.i
            r10 = 21
            r6 = r11
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            vkm.v1 r12 = new vkm.v1
            r12.<init>(r5)
            r0.u = r7
            r0.f220069y = r4
            ns9.h r13 = new ns9.h
            r14 = 6
            r13.<init>(r9, r11, r14)
            wkm.l r12 = vkm.q.Q(r12, r13)
            nx1.q r13 = new nx1.q
            r14 = 4
            r2 = 0
            r13.<init>(r14, r2, r9)
            vkm.y r14 = new vkm.y
            r14.<init>(r12, r13)
            kotlinx.coroutines.flow.Flow r12 = com.google.crypto.tink.shaded.protobuf.t1.E(r14)
            java.lang.Object r14 = vkm.q.x(r12, r0)
            if (r14 != r1) goto L73
            goto L86
        L73:
            r12 = r7
        L74:
            nx1.y r14 = (nx1.y) r14
            zhm.f0 r13 = zhm.f0.f322471a
            nx1.e r2 = r14.f220092a
            r0.u = r9
            r0.v = r14
            r0.f220069y = r3
            java.lang.Object r12 = r11.g(r13, r12, r2, r0)
            if (r12 != r1) goto L87
        L86:
            return r1
        L87:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: nx1.u.a(n02.b, com.revolut.feature.apm.core.models.recipients.ApmDescriptor, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ca, code lost:
    
        if (r0 == r8) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ca -> B:35:0x00cd). Please report as a decompilation issue!!! */
    @Override // nx1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r13, java.util.ArrayList r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nx1.u.b(java.util.List, java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // nx1.i
    public final Object c(String str, fy1.l lVar) {
        n0 n0Var = new n0(str, this, (Continuation) null);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, n0Var, lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (rx1.p.b(r1, r10, r3, r4, r5, r6) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List r8, n02.b r9, nx1.e r10, gim.c r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof nx1.t
            if (r0 == 0) goto L14
            r0 = r11
            nx1.t r0 = (nx1.t) r0
            int r1 = r0.f220083y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f220083y = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            nx1.t r0 = new nx1.t
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f220081w
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f220083y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            yhm.o.b(r11)
            goto L70
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            nx1.e r10 = r6.v
            n02.b r9 = r6.u
            yhm.o.b(r11)
            goto L4e
        L3c:
            yhm.o.b(r11)
            r6.u = r9
            r6.v = r10
            r6.f220083y = r3
            ox1.i r11 = r7.d
            java.lang.Object r11 = r11.b(r8, r10, r6)
            if (r11 != r0) goto L4e
            goto L6f
        L4e:
            ox1.d r11 = (ox1.d) r11
            java.util.Map r8 = r7.f220086c
            java.lang.Object r8 = r8.get(r9)
            r1 = r8
            rx1.p r1 = (rx1.p) r1
            if (r1 == 0) goto L73
            java.util.Map r3 = r11.f230528a
            java.util.Map r4 = r11.f230529b
            rx1.a r5 = rx1.a.INSERT
            r8 = 0
            r6.u = r8
            r6.v = r8
            r6.f220083y = r2
            r2 = r10
            java.lang.Object r8 = rx1.p.b(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L70
        L6f:
            return r0
        L70:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L73:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: nx1.u.g(java.util.List, n02.b, nx1.e, gim.c):java.lang.Object");
    }
}
