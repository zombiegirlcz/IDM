package dfj;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class k4 implements t3 {

    @NotNull
    public static final u3 Companion = new u3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfj.a2 f114022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f114023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v2 f114024c;

    public k4(nfj.a2 esimSubscriptionsRepository, k0 esimInstallationStateInteractor, v2 esimProfilesInteractor) {
        Intrinsics.checkNotNullParameter(esimSubscriptionsRepository, "esimSubscriptionsRepository");
        Intrinsics.checkNotNullParameter(esimInstallationStateInteractor, "esimInstallationStateInteractor");
        Intrinsics.checkNotNullParameter(esimProfilesInteractor, "esimProfilesInteractor");
        this.f114022a = esimSubscriptionsRepository;
        this.f114023b = esimInstallationStateInteractor;
        this.f114024c = esimProfilesInteractor;
    }

    public static final Object a(k4 k4Var, String str, gim.i iVar) {
        nfj.s2 s2Var = (nfj.s2) k4Var.f114022a;
        s2Var.getClass();
        n8a.r rVar = new n8a.r(11, s2Var, str, (Continuation) null);
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.J(elm.f.f127540b, rVar, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(dfj.k4 r5, dej.t1 r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof dfj.y3
            if (r0 == 0) goto L13
            r0 = r7
            dfj.y3 r0 = (dfj.y3) r0
            int r1 = r0.f114164w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114164w = r1
            goto L18
        L13:
            dfj.y3 r0 = new dfj.y3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114164w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L71
            goto L61
        L28:
            r5 = move-exception
            goto L65
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r7)
            com.revolut.retail.feature.esim.api.model.EsimProfileEntry r6 = r6.e
            dej.o1 r7 = r6.f100441b
            dej.o1 r2 = dej.o1.READY
            if (r7 != r2) goto L73
            java.lang.String r6 = r6.f100440a     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L71
            r0.f114164w = r3     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L71
            dfj.v2 r5 = r5.f114024c     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L71
            w4l.i r7 = w4l.i.f294643c     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L71
            dfj.m0 r5 = r5.e(r6, r7)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L71
            a83.j0 r6 = new a83.j0     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L71
            r7 = 23
            r6.<init>(r5, r7)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L71
            dee.a0 r5 = new dee.a0     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L71
            r7 = 6
            r5.<init>(r7)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L71
            jhi.b r5 = mo3.a.g(r6, r4, r5, r3)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L71
            java.lang.Object r7 = vkm.q.z(r5, r0)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L71
            if (r7 != r1) goto L61
            return r1
        L61:
            com.revolut.retail.feature.esim.api.model.EsimProfile r7 = (com.revolut.retail.feature.esim.api.model.EsimProfile) r7     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L71
            r4 = r7
            goto L73
        L65:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            java.lang.String r0 = "EsimSubscriptionsInteractorImpl"
            rd0.d.a(r7, r0, r4, r5, r6)
            goto L73
        L71:
            r5 = move-exception
            throw r5
        L73:
            dej.v1 r5 = new dej.v1
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.k4.b(dfj.k4, dej.t1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r12, java.lang.String r13, gim.c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof dfj.v3
            if (r0 == 0) goto L13
            r0 = r14
            dfj.v3 r0 = (dfj.v3) r0
            int r1 = r0.f114133x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114133x = r1
            goto L18
        L13:
            dfj.v3 r0 = new dfj.v3
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114133x
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r14)
            return r14
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            java.lang.String r12 = r0.u
            yhm.o.b(r14)     // Catch: com.revolut.retail.feature.esim.impl.repositories.exceptions.InsufficientFundsException -> L6b
            goto L5d
        L39:
            yhm.o.b(r14)
            nfj.a2 r14 = r11.f114022a     // Catch: com.revolut.retail.feature.esim.impl.repositories.exceptions.InsufficientFundsException -> L6b
            r0.u = r12     // Catch: com.revolut.retail.feature.esim.impl.repositories.exceptions.InsufficientFundsException -> L6b
            r0.f114133x = r4     // Catch: com.revolut.retail.feature.esim.impl.repositories.exceptions.InsufficientFundsException -> L6b
            r6 = r14
            nfj.s2 r6 = (nfj.s2) r6     // Catch: com.revolut.retail.feature.esim.impl.repositories.exceptions.InsufficientFundsException -> L6b
            r6.getClass()     // Catch: com.revolut.retail.feature.esim.impl.repositories.exceptions.InsufficientFundsException -> L6b
            mtj.i r5 = new mtj.i     // Catch: com.revolut.retail.feature.esim.impl.repositories.exceptions.InsufficientFundsException -> L6b
            r10 = 14
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: com.revolut.retail.feature.esim.impl.repositories.exceptions.InsufficientFundsException -> L6b
            skm.p0 r12 = skm.p0.f264001a     // Catch: com.revolut.retail.feature.esim.impl.repositories.exceptions.InsufficientFundsException -> L6b
            elm.f r12 = elm.f.f127540b     // Catch: com.revolut.retail.feature.esim.impl.repositories.exceptions.InsufficientFundsException -> L6b
            java.lang.Object r14 = skm.e0.J(r12, r5, r0)     // Catch: com.revolut.retail.feature.esim.impl.repositories.exceptions.InsufficientFundsException -> L6b
            if (r14 != r1) goto L5c
            goto L69
        L5c:
            r12 = r7
        L5d:
            dej.u1 r14 = (dej.u1) r14     // Catch: com.revolut.retail.feature.esim.impl.repositories.exceptions.InsufficientFundsException -> L6b
            r0.u = r9
            r0.f114133x = r3
            java.lang.Object r12 = r11.f(r12, r14, r0)
            if (r12 != r1) goto L6a
        L69:
            return r1
        L6a:
            return r12
        L6b:
            dej.w1$b r12 = dej.w1.b.f113678a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.k4.c(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007c A[PHI: r8
      0x007c: PHI (r8v5 dej.a3) = (r8v4 dej.a3), (r8v4 dej.a3), (r8v7 dej.a3) binds: [B:23:0x0065, B:25:0x0079, B:17:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(dej.k r8, chj.k0 r9, gim.c r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof dfj.w3
            if (r0 == 0) goto L13
            r0 = r10
            dfj.w3 r0 = (dfj.w3) r0
            int r1 = r0.f114144y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114144y = r1
            goto L18
        L13:
            dfj.w3 r0 = new dfj.w3
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f114142w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114144y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r10)
            return r10
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            dej.a3 r8 = r0.v
            yhm.o.b(r10)
            goto L7c
        L3c:
            chj.k0 r9 = r0.u
            yhm.o.b(r10)
            goto L62
        L42:
            yhm.o.b(r10)
            r0.u = r9
            r0.f114144y = r5
            nfj.a2 r10 = r7.f114022a
            nfj.s2 r10 = (nfj.s2) r10
            r10.getClass()
            n8a.r r2 = new n8a.r
            r5 = 10
            r2.<init>(r10, r8, r6, r5)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r8, r2, r0)
            if (r10 != r1) goto L62
            goto L88
        L62:
            r8 = r10
            dej.a3 r8 = (dej.a3) r8
            if (r9 == 0) goto L7c
            dej.t1 r10 = r8.f113483a
            java.lang.String r10 = r10.f113650a
            kotlin.time.b r2 = r8.f113484b
            kotlin.time.b r5 = r8.f113485c
            r0.u = r6
            r0.v = r8
            r0.f114144y = r4
            java.lang.Object r9 = r9.invoke(r10, r2, r5, r0)
            if (r9 != r1) goto L7c
            goto L88
        L7c:
            r0.u = r6
            r0.v = r6
            r0.f114144y = r3
            java.lang.Object r8 = r7.g(r8, r0)
            if (r8 != r1) goto L89
        L88:
            return r1
        L89:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.k4.d(dej.k, chj.k0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.time.Instant r20, java.lang.String r21, java.lang.String r22, dej.r1 r23, dj0.d r24, boolean r25, com.revolut.retail.feature.esim.api.model.EsimContractMetadata r26, java.lang.String r27, chj.k0 r28, gim.c r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.k4.e(java.time.Instant, java.lang.String, java.lang.String, dej.r1, dj0.d, boolean, com.revolut.retail.feature.esim.api.model.EsimContractMetadata, java.lang.String, chj.k0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r13, dej.u1 r14, gim.c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof dfj.z3
            if (r0 == 0) goto L13
            r0 = r15
            dfj.z3 r0 = (dfj.z3) r0
            int r1 = r0.f114170w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114170w = r1
            goto L18
        L13:
            dfj.z3 r0 = new dfj.z3
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114170w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r15)
            goto L67
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            yhm.o.b(r15)
            kotlin.time.b r15 = r14.f113667a
            if (r15 == 0) goto L3a
            long r4 = r15.f187924a
        L38:
            r7 = r4
            goto L45
        L3a:
            kotlin.time.b$a r15 = kotlin.time.b.INSTANCE
            r4 = 2000(0x7d0, double:9.88E-321)
            pkm.e r15 = pkm.e.MILLISECONDS
            long r4 = kotlin.time.c.h(r4, r15)
            goto L38
        L45:
            kotlin.time.b r14 = r14.f113668b
            if (r14 == 0) goto L4c
            long r14 = r14.f187924a
            goto L56
        L4c:
            kotlin.time.b$a r14 = kotlin.time.b.INSTANCE
            r14 = 10000(0x2710, double:4.9407E-320)
            pkm.e r2 = pkm.e.MILLISECONDS
            long r14 = kotlin.time.c.h(r14, r2)
        L56:
            dfj.a4 r6 = new dfj.a4
            r11 = 0
            r9 = r12
            r10 = r13
            r6.<init>(r7, r9, r10, r11)
            r0.f114170w = r3
            java.lang.Object r15 = skm.h2.e(r14, r6, r0)
            if (r15 != r1) goto L67
            return r1
        L67:
            dej.w1 r15 = (dej.w1) r15
            if (r15 != 0) goto L6e
            dej.w1$d r13 = dej.w1.d.f113680a
            return r13
        L6e:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.k4.f(java.lang.String, dej.u1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(dej.a3 r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof dfj.b4
            if (r0 == 0) goto L13
            r0 = r13
            dfj.b4 r0 = (dfj.b4) r0
            int r1 = r0.f113920x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113920x = r1
            goto L18
        L13:
            dfj.b4 r0 = new dfj.b4
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f113920x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            kotlin.jvm.internal.Ref$ObjectRef r12 = r0.u
            yhm.o.b(r13)
            r9 = r11
            goto L75
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            kotlin.jvm.internal.Ref$ObjectRef r6 = p.a.w(r13)
            dej.t1 r13 = r12.f113483a
            r6.f186409a = r13
            kotlin.time.b r13 = r12.f113484b
            if (r13 == 0) goto L42
            long r7 = r13.f187924a
            goto L4c
        L42:
            kotlin.time.b$a r13 = kotlin.time.b.INSTANCE
            r7 = 2000(0x7d0, double:9.88E-321)
            pkm.e r13 = pkm.e.MILLISECONDS
            long r7 = kotlin.time.c.h(r7, r13)
        L4c:
            kotlin.time.b r12 = r12.f113485c
            if (r12 == 0) goto L53
            long r12 = r12.f187924a
            goto L5d
        L53:
            kotlin.time.b$a r12 = kotlin.time.b.INSTANCE
            r12 = 10000(0x2710, double:4.9407E-320)
            pkm.e r2 = pkm.e.MILLISECONDS
            long r12 = kotlin.time.c.h(r12, r2)
        L5d:
            dfj.c4 r5 = new dfj.c4
            r10 = 0
            r9 = r11
            r5.<init>(r6, r7, r9, r10)
            r0.u = r6
            r0.f113920x = r4
            dfj.h4 r2 = new dfj.h4
            r2.<init>(r12, r5, r3)
            java.lang.Object r12 = r11.j(r2, r0)
            if (r12 != r1) goto L74
            return r1
        L74:
            r12 = r6
        L75:
            java.lang.Object r13 = r12.f186409a
            dej.t1 r13 = (dej.t1) r13
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            dej.j3 r13 = r13.f113651b
            dej.j3 r1 = dej.j3.FAILED
            if (r13 == r1) goto L9b
            java.lang.Object r13 = r12.f186409a
            dej.t1 r13 = (dej.t1) r13
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            dej.j3 r13 = r13.f113651b
            dej.j3 r0 = dej.j3.INACTIVE
            if (r13 == r0) goto L9b
            dej.b3 r13 = new dej.b3
            java.lang.Object r12 = r12.f186409a
            dej.t1 r12 = (dej.t1) r12
            r13.<init>(r12, r3)
            return r13
        L9b:
            com.revolut.retail.feature.esim.impl.repositories.exceptions.SubscriptionChangeFailedException r12 = new com.revolut.retail.feature.esim.impl.repositories.exceptions.SubscriptionChangeFailedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.k4.g(dej.a3, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c4, code lost:
    
        if (r2 == r8) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(dej.a3 r15, java.lang.String r16, gim.c r17) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.k4.h(dej.a3, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r23, java.lang.String r24, java.lang.String r25, dj0.d r26, dej.j1 r27, java.lang.Boolean r28, java.lang.String r29, java.lang.Long r30, java.lang.String r31, chj.k0 r32, gim.c r33) throws java.lang.Throwable {
        /*
            r22 = this;
            r0 = r22
            r1 = r33
            boolean r2 = r1 instanceof dfj.f4
            if (r2 == 0) goto L17
            r2 = r1
            dfj.f4 r2 = (dfj.f4) r2
            int r3 = r2.f113969y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f113969y = r3
            goto L1c
        L17:
            dfj.f4 r2 = new dfj.f4
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f113967w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f113969y
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L46
            if (r4 == r7) goto L40
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L32
            yhm.o.b(r1)
            return r1
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            dej.a3 r4 = r2.v
            yhm.o.b(r1)
            goto L9a
        L40:
            chj.k0 r4 = r2.u
            yhm.o.b(r1)
            goto L80
        L46:
            yhm.o.b(r1)
            r1 = r32
            r2.u = r1
            r2.f113969y = r7
            nfj.a2 r4 = r0.f114022a
            r10 = r4
            nfj.s2 r10 = (nfj.s2) r10
            r10.getClass()
            chj.t0 r9 = new chj.t0
            r20 = 0
            r18 = r23
            r15 = r24
            r16 = r25
            r11 = r26
            r12 = r27
            r17 = r28
            r14 = r29
            r13 = r30
            r19 = r31
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            skm.p0 r4 = skm.p0.f264001a
            elm.f r4 = elm.f.f127540b
            java.lang.Object r4 = skm.e0.J(r4, r9, r2)
            if (r4 != r3) goto L7b
            goto La7
        L7b:
            r21 = r4
            r4 = r1
            r1 = r21
        L80:
            dej.a3 r1 = (dej.a3) r1
            if (r4 == 0) goto L9b
            dej.t1 r7 = r1.f113483a
            java.lang.String r7 = r7.f113650a
            kotlin.time.b r9 = r1.f113484b
            kotlin.time.b r10 = r1.f113485c
            r2.u = r8
            r2.v = r1
            r2.f113969y = r6
            java.lang.Object r4 = r4.invoke(r7, r9, r10, r2)
            if (r4 != r3) goto L99
            goto La7
        L99:
            r4 = r1
        L9a:
            r1 = r4
        L9b:
            r2.u = r8
            r2.v = r8
            r2.f113969y = r5
            java.lang.Object r1 = r0.h(r1, r8, r2)
            if (r1 != r3) goto La8
        La7:
            return r3
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.k4.i(java.lang.String, java.lang.String, java.lang.String, dj0.d, dej.j1, java.lang.Boolean, java.lang.String, java.lang.Long, java.lang.String, chj.k0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kotlin.jvm.functions.Function1 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof dfj.g4
            if (r0 == 0) goto L13
            r0 = r6
            dfj.g4 r0 = (dfj.g4) r0
            int r1 = r0.f113982w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113982w = r1
            goto L18
        L13:
            dfj.g4 r0 = new dfj.g4
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f113982w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L27
            return r6
        L27:
            r5 = move-exception
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.f113982w = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L3d
            return r1
        L3d:
            return r5
        L3e:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            r0 = 0
            if (r6 != 0) goto L4e
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            java.lang.String r2 = "EsimSubscriptionsInteractorImpl"
            rd0.d.a(r1, r2, r0, r5, r6)
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.k4.j(kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo, dej.a3, dej.c, dej.j1, dj0.d, java.lang.Boolean, java.lang.Long, java.lang.String, oim.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo r44, dej.j1 r45, java.lang.Boolean r46, java.lang.String r47, boolean r48, dj0.d r49, java.lang.String r50, java.lang.Long r51, java.lang.String r52, dej.c r53, java.lang.String r54, chj.k0 r55, gim.c r56) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.k4.k(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo, dej.j1, java.lang.Boolean, java.lang.String, boolean, dj0.d, java.lang.String, java.lang.Long, java.lang.String, dej.c, java.lang.String, chj.k0, gim.c):java.lang.Object");
    }
}
