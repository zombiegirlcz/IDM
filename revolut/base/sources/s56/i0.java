package s56;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    @NotNull
    private static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k18.c f259958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u66.b f259959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xv5.c f259960c;
    public final i26.k d;

    public i0(k18.c deFiAccountsInteractor, u66.b deFiAssetsRepository, xv5.c baseCurrencyInteractor, i26.k deFiAssetDetailsRepository) {
        Intrinsics.checkNotNullParameter(deFiAccountsInteractor, "deFiAccountsInteractor");
        Intrinsics.checkNotNullParameter(deFiAssetsRepository, "deFiAssetsRepository");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(deFiAssetDetailsRepository, "deFiAssetDetailsRepository");
        this.f259958a = deFiAccountsInteractor;
        this.f259959b = deFiAssetsRepository;
        this.f259960c = baseCurrencyInteractor;
        this.d = deFiAssetDetailsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(s56.i0 r4, com.revolut.feature.defi.accounts.api.model.DeFiBalance r5, wk5.a r6, xi0.b r7, gim.c r8) {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof s56.g0
            if (r0 == 0) goto L16
            r0 = r8
            s56.g0 r0 = (s56.g0) r0
            int r1 = r0.f259955y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f259955y = r1
            goto L1b
        L16:
            s56.g0 r0 = new s56.g0
            r0.<init>(r4, r8)
        L1b:
            java.lang.Object r8 = r0.f259953w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f259955y
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            wk5.a r6 = r0.v
            com.revolut.feature.defi.accounts.api.model.DeFiBalance r5 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L84
            goto L4e
        L2e:
            r4 = move-exception
            goto L5d
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            yhm.o.b(r8)
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L84
            java.lang.String r8 = r5.f71635a     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L84
            w4l.j r2 = w4l.j.f294644c     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L84
            r0.u = r5     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L84
            r0.v = r6     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L84
            r0.f259955y = r3     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L84
            java.lang.Object r8 = r4.b(r8, r7, r2, r0)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L84
            if (r8 != r1) goto L4e
            return r1
        L4e:
            com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails r8 = (com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails) r8     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L84
            java.util.ArrayList r4 = r8.f71667c     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L84
            boolean r4 = r4.contains(r6)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L84
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L84
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2e java.util.concurrent.CancellationException -> L84
            goto L63
        L5d:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r4 = yhm.o.a(r4)
        L63:
            java.lang.Throwable r6 = yhm.m.a(r4)
            if (r6 == 0) goto L7c
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r8 = rd0.d.f253311a
            rd0.c r8 = rd0.c.WARNING
            java.lang.String r5 = r5.f71635a
            java.lang.String r0 = "Failed to load asset details for "
            java.lang.String r5 = j6.a.q(r0, r5)
            java.lang.String r0 = "DeFiSendAmountScreenInteractor"
            rd0.d.a(r8, r0, r5, r6, r7)
        L7c:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r6 = r4 instanceof yhm.n
            if (r6 == 0) goto L83
            r4 = r5
        L83:
            return r4
        L84:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s56.i0.a(s56.i0, com.revolut.feature.defi.accounts.api.model.DeFiBalance, wk5.a, xi0.b, gim.c):java.io.Serializable");
    }

    public final Object b(String str, xi0.b bVar, w4l.k kVar, gim.c cVar) {
        return vkm.q.x(mo3.a.g(this.d.a(str, bVar.f306286a, kVar), null, null, 3), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, w4l.k r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof s56.z
            if (r0 == 0) goto L13
            r0 = r10
            s56.z r0 = (s56.z) r0
            int r1 = r0.f260006x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260006x = r1
            goto L18
        L13:
            s56.z r0 = new s56.z
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260006x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r8 = r0.u
            yhm.o.b(r10)
            goto L63
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            yhm.o.b(r10)
            java.lang.String r10 = "loadingStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r10)
            k18.c r10 = r7.f259958a
            java.lang.Object r2 = r10.f180141c
            xv5.c r2 = (xv5.c) r2
            efm.r r2 = xv5.c.b(r2)
            vkm.d r2 = rd0.e.b(r2)
            om4.r0 r5 = new om4.r0
            r6 = 9
            r5.<init>(r4, r10, r9, r6)
            wkm.l r9 = vkm.q.Q(r2, r5)
            r10 = 3
            jhi.b r9 = mo3.a.g(r9, r4, r4, r10)
            r0.u = r8
            r0.f260006x = r3
            java.lang.Object r10 = vkm.q.x(r9, r0)
            if (r10 != r1) goto L63
            return r1
        L63:
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r9 = r10.iterator()
        L6b:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L81
            java.lang.Object r10 = r9.next()
            r0 = r10
            e16.b r0 = (e16.b) r0
            java.lang.String r0 = r0.f121886a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r8)
            if (r0 == 0) goto L6b
            r4 = r10
        L81:
            e16.b r4 = (e16.b) r4
            if (r4 == 0) goto L88
            java.util.ArrayList r8 = r4.f121888c
            return r8
        L88:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "DeFi account not found: "
            java.lang.String r8 = h30.l.r(r10, r8)
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s56.i0.c(java.lang.String, w4l.k, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(wk5.a r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s56.i0.d(wk5.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0 A[LOOP:0: B:39:0x00ea->B:41:0x00f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r21, wk5.a r22, java.lang.String r23, w4l.k r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s56.i0.e(java.lang.String, wk5.a, java.lang.String, w4l.k, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r14, wk5.a r15, w4l.k r16, gim.c r17) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s56.i0.f(java.lang.String, wk5.a, w4l.k, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r12 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r13 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r8, java.lang.String r9, java.lang.String r10, w4l.k r11, com.revolut.feature.defi.accounts.api.model.DeFiBalance r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s56.i0.g(java.lang.String, java.lang.String, java.lang.String, w4l.k, com.revolut.feature.defi.accounts.api.model.DeFiBalance, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.defi.accounts.api.model.DeFiBalance r8, w4l.k r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof s56.f0
            if (r0 == 0) goto L13
            r0 = r10
            s56.f0 r0 = (s56.f0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            s56.f0 r0 = new s56.f0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f259952y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.revolut.feature.defi.accounts.api.model.DeFiBalance r8 = r0.u
            yhm.o.b(r10)
            goto L76
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.String r8 = r0.f259951x
            s56.i0 r9 = r0.f259950w
            w4l.k r2 = r0.v
            com.revolut.feature.defi.accounts.api.model.DeFiBalance r4 = r0.u
            yhm.o.b(r10)
            goto L61
        L40:
            yhm.o.b(r10)
            boolean r10 = ta6.a.E(r8)
            if (r10 == 0) goto L8d
            java.lang.String r10 = r8.f71635a
            r0.u = r8
            r0.v = r9
            r0.f259950w = r7
            r0.f259951x = r10
            r0.A = r4
            java.lang.Object r2 = r7.i(r0)
            if (r2 != r1) goto L5c
            goto L74
        L5c:
            r4 = r8
            r8 = r10
            r10 = r2
            r2 = r9
            r9 = r7
        L61:
            xi0.b r10 = (xi0.b) r10
            r0.u = r4
            r5 = 0
            r0.v = r5
            r0.f259950w = r5
            r0.f259951x = r5
            r0.A = r3
            java.lang.Object r10 = r9.b(r8, r10, r2, r0)
            if (r10 != r1) goto L75
        L74:
            return r1
        L75:
            r8 = r4
        L76:
            com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails r10 = (com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails) r10
            com.revolut.feature.defi.asset_details.api.model.DefiCurrency r9 = r10.f71665a
            com.revolut.feature.transfer.core.models.DeFiBalanceSource r0 = new com.revolut.feature.transfer.core.models.DeFiBalanceSource
            java.lang.String r1 = r8.f71638g
            java.lang.String r2 = r9.f71672b
            java.lang.String r3 = r9.f71673c
            java.lang.String r4 = r9.f
            ej0.b r5 = r8.a()
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L8d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Expected a synthetic DeFi balance"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s56.i0.h(com.revolut.feature.defi.accounts.api.model.DeFiBalance, w4l.k, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof s56.h0
            if (r0 == 0) goto L13
            r0 = r5
            s56.h0 r0 = (s56.h0) r0
            int r1 = r0.f259956w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f259956w = r1
            goto L18
        L13:
            s56.h0 r0 = new s56.h0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f259956w
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
            xv5.c r5 = r4.f259960c
            efm.r r5 = xv5.c.b(r5)
            vkm.d r5 = rd0.e.b(r5)
            r0.f259956w = r3
            java.lang.Object r5 = vkm.q.x(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s56.i0.i(gim.c):java.lang.Object");
    }
}
