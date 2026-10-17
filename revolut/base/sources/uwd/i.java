package uwd;

import com.revolut.feature.staking.impl.stake.v2.StakeControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakeControllerContract$InputData f283626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f283627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppk.f f283628c;
    public final xv5.c d;
    public final gte.a e;
    public final cwd.b f;

    public i(StakeControllerContract$InputData inputData, n walletInteractor, ppk.f ratesInteractor, xv5.c cryptoBaseCurrencyInteractor, gte.a featureToggleInteractor, cwd.b stakingScreenRepository) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(cryptoBaseCurrencyInteractor, "cryptoBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(stakingScreenRepository, "stakingScreenRepository");
        this.f283626a = inputData;
        this.f283627b = walletInteractor;
        this.f283628c = ratesInteractor;
        this.d = cryptoBaseCurrencyInteractor;
        this.e = featureToggleInteractor;
        this.f = stakingScreenRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof uwd.a
            if (r0 == 0) goto L13
            r0 = r13
            uwd.a r0 = (uwd.a) r0
            int r1 = r0.f283614w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f283614w = r1
            goto L18
        L13:
            uwd.a r0 = new uwd.a
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f283614w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L4b
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L2f:
            yhm.o.b(r13)
            io3.l r5 = io3.l.CURRENT
            io3.k r6 = io3.k.ACTIVE
            r10 = 0
            r11 = 60
            wsg.n r4 = r12.f283627b
            r7 = 0
            r8 = 0
            r9 = 0
            efm.d0 r13 = osg.b.j(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.f283614w = r3
            java.lang.Object r13 = nim.a.b(r13, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            java.util.List r13 = (java.util.List) r13
            kotlin.jvm.internal.Intrinsics.h(r13)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r13 = r13.iterator()
        L5b:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r13.next()
            r2 = r1
            io3.d r2 = (io3.d) r2
            xi0.b r2 = z92.f.l(r2)
            boolean r2 = cp5.d.A(r2)
            if (r2 == 0) goto L5b
            r0.add(r1)
            goto L5b
        L76:
            java.lang.Object r13 = zhm.d0.d0(r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: uwd.i.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof uwd.b
            if (r0 == 0) goto L13
            r0 = r13
            uwd.b r0 = (uwd.b) r0
            int r1 = r0.f283615w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f283615w = r1
            goto L18
        L13:
            uwd.b r0 = new uwd.b
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f283615w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L4b
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L2f:
            yhm.o.b(r13)
            io3.l r5 = io3.l.CURRENT
            io3.k r6 = io3.k.ACTIVE
            r10 = 0
            r11 = 60
            wsg.n r4 = r12.f283627b
            r7 = 0
            r8 = 0
            r9 = 0
            efm.d0 r13 = osg.b.j(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.f283615w = r3
            java.lang.Object r13 = nim.a.b(r13, r0)
            if (r13 != r1) goto L4b
            return r1
        L4b:
            java.util.List r13 = (java.util.List) r13
            kotlin.jvm.internal.Intrinsics.h(r13)
            java.lang.Object r13 = zhm.d0.d0(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: uwd.i.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3 A[LOOP:4: B:31:0x00ad->B:33:0x00b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(gim.c r18) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uwd.i.c(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof uwd.d
            if (r0 == 0) goto L13
            r0 = r5
            uwd.d r0 = (uwd.d) r0
            int r1 = r0.f283619w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f283619w = r1
            goto L18
        L13:
            uwd.d r0 = new uwd.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f283619w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            xv5.c r5 = r4.d
            efm.r r5 = xv5.c.b(r5)
            vkm.d r5 = rd0.e.b(r5)
            r0.f283619w = r3
            java.lang.Object r5 = vkm.q.x(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uwd.i.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(gim.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof uwd.e
            if (r0 == 0) goto L13
            r0 = r12
            uwd.e r0 = (uwd.e) r0
            int r1 = r0.f283620w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f283620w = r1
            goto L18
        L13:
            uwd.e r0 = new uwd.e
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f283620w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L28
            goto L6a
        L28:
            r0 = move-exception
            r12 = r0
            goto L6f
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L33:
            yhm.o.b(r12)
            cwd.b r12 = r11.f
            ue0.c r12 = r12.f109602a
            java.lang.String r2 = "LAST_CURRENCY_KEY"
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Object r12 = r12.T2(r2, r5)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L51
            xi0.a r2 = xi0.b.Companion
            r2.getClass()
            xi0.b r12 = xi0.a.a(r12)
            r6 = r12
            goto L52
        L51:
            r6 = r4
        L52:
            if (r6 == 0) goto L89
            yhm.m$a r12 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            wsg.n r5 = r11.f283627b     // Catch: java.lang.Throwable -> L28
            r9 = 0
            r10 = 62
            r7 = 0
            r8 = 0
            efm.d0 r12 = osg.b.r(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L28
            r0.f283620w = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r12 = nim.a.b(r12, r0)     // Catch: java.lang.Throwable -> L28
            if (r12 != r1) goto L6a
            return r1
        L6a:
            io3.d r12 = (io3.d) r12     // Catch: java.lang.Throwable -> L28
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            goto L75
        L6f:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r12 = yhm.o.a(r12)
        L75:
            boolean r0 = r12 instanceof yhm.n
            if (r0 == 0) goto L7a
            r12 = r4
        L7a:
            io3.d r12 = (io3.d) r12
            if (r12 == 0) goto L89
            dj0.d r0 = z92.f.j(r12)
            boolean r0 = r0.k()
            if (r0 != 0) goto L89
            return r12
        L89:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uwd.i.e(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(gim.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof uwd.f
            if (r0 == 0) goto L13
            r0 = r11
            uwd.f r0 = (uwd.f) r0
            int r1 = r0.f283621w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f283621w = r1
            goto L18
        L13:
            uwd.f r0 = new uwd.f
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f283621w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L2a
            goto L5e
        L2a:
            r0 = move-exception
            r11 = r0
            goto L63
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L35:
            yhm.o.b(r11)
            goto L45
        L39:
            yhm.o.b(r11)
            r0.f283621w = r4
            java.lang.Object r11 = r10.d(r0)
            if (r11 != r1) goto L45
            goto L5d
        L45:
            r5 = r11
            xi0.b r5 = (xi0.b) r5
            yhm.m$a r11 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a
            wsg.n r4 = r10.f283627b     // Catch: java.lang.Throwable -> L2a
            r8 = 0
            r9 = 62
            r6 = 0
            r7 = 0
            efm.d0 r11 = osg.b.r(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2a
            r0.f283621w = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r11 = nim.a.b(r11, r0)     // Catch: java.lang.Throwable -> L2a
            if (r11 != r1) goto L5e
        L5d:
            return r1
        L5e:
            io3.d r11 = (io3.d) r11     // Catch: java.lang.Throwable -> L2a
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a
            goto L69
        L63:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r11 = yhm.o.a(r11)
        L69:
            boolean r0 = r11 instanceof yhm.n
            r1 = 0
            if (r0 == 0) goto L6f
            r11 = r1
        L6f:
            io3.d r11 = (io3.d) r11
            if (r11 == 0) goto L74
            return r11
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uwd.i.f(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00eb, code lost:
    
        if (r6 == r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:12:0x002a, B:68:0x00ee, B:69:0x00f0, B:15:0x0032, B:64:0x00dd, B:18:0x003b, B:59:0x00cb, B:61:0x00cf, B:21:0x0044, B:54:0x00b9, B:56:0x00bd, B:24:0x004d, B:49:0x00a7, B:51:0x00ab, B:27:0x0055, B:44:0x0095, B:46:0x0099, B:30:0x005d, B:39:0x0083, B:41:0x0087, B:33:0x0064, B:35:0x0073, B:65:0x00e0), top: B:77:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:12:0x002a, B:68:0x00ee, B:69:0x00f0, B:15:0x0032, B:64:0x00dd, B:18:0x003b, B:59:0x00cb, B:61:0x00cf, B:21:0x0044, B:54:0x00b9, B:56:0x00bd, B:24:0x004d, B:49:0x00a7, B:51:0x00ab, B:27:0x0055, B:44:0x0095, B:46:0x0099, B:30:0x005d, B:39:0x0083, B:41:0x0087, B:33:0x0064, B:35:0x0073, B:65:0x00e0), top: B:77:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:12:0x002a, B:68:0x00ee, B:69:0x00f0, B:15:0x0032, B:64:0x00dd, B:18:0x003b, B:59:0x00cb, B:61:0x00cf, B:21:0x0044, B:54:0x00b9, B:56:0x00bd, B:24:0x004d, B:49:0x00a7, B:51:0x00ab, B:27:0x0055, B:44:0x0095, B:46:0x0099, B:30:0x005d, B:39:0x0083, B:41:0x0087, B:33:0x0064, B:35:0x0073, B:65:0x00e0), top: B:77:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bd A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:12:0x002a, B:68:0x00ee, B:69:0x00f0, B:15:0x0032, B:64:0x00dd, B:18:0x003b, B:59:0x00cb, B:61:0x00cf, B:21:0x0044, B:54:0x00b9, B:56:0x00bd, B:24:0x004d, B:49:0x00a7, B:51:0x00ab, B:27:0x0055, B:44:0x0095, B:46:0x0099, B:30:0x005d, B:39:0x0083, B:41:0x0087, B:33:0x0064, B:35:0x0073, B:65:0x00e0), top: B:77:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:12:0x002a, B:68:0x00ee, B:69:0x00f0, B:15:0x0032, B:64:0x00dd, B:18:0x003b, B:59:0x00cb, B:61:0x00cf, B:21:0x0044, B:54:0x00b9, B:56:0x00bd, B:24:0x004d, B:49:0x00a7, B:51:0x00ab, B:27:0x0055, B:44:0x0095, B:46:0x0099, B:30:0x005d, B:39:0x0083, B:41:0x0087, B:33:0x0064, B:35:0x0073, B:65:0x00e0), top: B:77:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(gim.c r6) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uwd.i.g(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(gim.c r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof uwd.h
            if (r0 == 0) goto L13
            r0 = r11
            uwd.h r0 = (uwd.h) r0
            int r1 = r0.f283625w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f283625w = r1
            goto L18
        L13:
            uwd.h r0 = new uwd.h
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f283625w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L27
            goto L51
        L27:
            r0 = move-exception
            r11 = r0
            goto L56
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L32:
            yhm.o.b(r11)
            yhm.m$a r11 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            wsg.n r4 = r10.f283627b     // Catch: java.lang.Throwable -> L27
            com.revolut.feature.staking.impl.stake.v2.StakeControllerContract$InputData r11 = r10.f283626a     // Catch: java.lang.Throwable -> L27
            com.revolut.feature.staking.api.model.StakingProduct r11 = r11.f88138a     // Catch: java.lang.Throwable -> L27
            xi0.b r5 = r11.d     // Catch: java.lang.Throwable -> L27
            r8 = 0
            r9 = 62
            r6 = 0
            r7 = 0
            efm.d0 r11 = osg.b.r(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L27
            r0.f283625w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r11 = nim.a.b(r11, r0)     // Catch: java.lang.Throwable -> L27
            if (r11 != r1) goto L51
            return r1
        L51:
            io3.d r11 = (io3.d) r11     // Catch: java.lang.Throwable -> L27
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L5c
        L56:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r11 = yhm.o.a(r11)
        L5c:
            boolean r0 = r11 instanceof yhm.n
            r1 = 0
            if (r0 == 0) goto L62
            r11 = r1
        L62:
            io3.d r11 = (io3.d) r11
            if (r11 == 0) goto L71
            dj0.d r0 = z92.f.j(r11)
            boolean r0 = r0.k()
            if (r0 != 0) goto L71
            return r11
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uwd.i.h(gim.c):java.io.Serializable");
    }
}
