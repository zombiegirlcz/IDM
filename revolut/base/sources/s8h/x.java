package s8h;

import com.revolut.feature.wealth.api.declaration.PopularAssetsDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class x implements jf0.d, q06.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f261045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.i f261046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xoj.a f261047c;
    public final gte.a d;
    public final su9.c e;

    public x(sri.m navigator, ybl.i productGroupAvailabilityInteractor, xoj.a featuresInteractor, gte.a featureToggleInteractor, su9.c metaCollectionInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(metaCollectionInteractor, "metaCollectionInteractor");
        this.f261045a = navigator;
        this.f261046b = productGroupAvailabilityInteractor;
        this.f261047c = featuresInteractor;
        this.d = featureToggleInteractor;
        this.e = metaCollectionInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "instruments") && Intrinsics.f(cVar.e(2), "most-popular");
    }

    public final pfm.z b(String str) {
        ufm.i iVar = new ufm.i(new ufm.c(new j(str, 1), 2), new s65.o(new s78.d(this, 4), 18), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return ue0.e.F(iVar, Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(zel.f r6, java.util.List r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof s8h.w
            if (r0 == 0) goto L13
            r0 = r8
            s8h.w r0 = (s8h.w) r0
            int r1 = r0.f261044w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261044w = r1
            goto L18
        L13:
            s8h.w r0 = new s8h.w
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261044w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            goto L66
        L28:
            r6 = move-exception
            goto L72
        L2a:
            r6 = move-exception
            goto L7f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r8)
            com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$ScreenerPopularInstrumentsCollection r8 = com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$ScreenerPopularInstrumentsCollection.f96096c
            gte.a r2 = r5.d
            jte.d r2 = (jte.d) r2
            boolean r8 = r2.c(r8)
            if (r8 != 0) goto L4b
            com.revolut.feature.wealth.api.declaration.PopularAssetsDestination r6 = new com.revolut.feature.wealth.api.declaration.PopularAssetsDestination
            mzg.d r8 = mzg.d.STOCKS
            r6.<init>(r8, r7)
            return r6
        L4b:
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            su9.c r7 = r5.e     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            wgl.a r8 = new wgl.a     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            vkm.d r6 = r7.h(r8)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r7 = 3
            jhi.b r6 = mo3.a.g(r6, r4, r4, r7)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r0.f261044w = r3     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            java.lang.Object r8 = vkm.q.x(r6, r0)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            if (r8 != r1) goto L66
            return r1
        L66:
            com.revolut.shared.feature.wealth.models.screener.ScreenerCollection r8 = (com.revolut.shared.feature.wealth.models.screener.ScreenerCollection) r8     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            com.revolut.feature.wealth_discovery.api.declaration.ScreenerCollectionDestination r6 = new com.revolut.feature.wealth_discovery.api.declaration.ScreenerCollectionDestination     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            java.lang.String r7 = r8.f105154a     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            goto L78
        L72:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
        L78:
            boolean r7 = r6 instanceof yhm.n
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            r4 = r6
        L7e:
            return r4
        L7f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s8h.x.c(zel.f, java.util.List, gim.c):java.lang.Object");
    }

    public final Object d(jf0.c cVar, gim.c cVar2) {
        c cVar3 = d.Companion;
        String strE = cVar.e(3);
        cVar3.getClass();
        d dVarA = c.a(strE);
        int i = dVarA == null ? -1 : u.f261041a[dVarA.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1 || i == 2) {
            return c(zel.f.STOCKS, zhm.f0.f322471a, cVar2);
        }
        if (i == 3) {
            return c(zel.f.BOND, zhm.u.c(new xzg.b(zhm.u.c(xzg.a.BOND))), cVar2);
        }
        if (i == 4) {
            return new PopularAssetsDestination(mzg.d.CRYPTO, zhm.f0.f322471a);
        }
        if (i == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof s8h.v
            if (r0 == 0) goto L13
            r0 = r9
            s8h.v r0 = (s8h.v) r0
            int r1 = r0.f261043x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261043x = r1
            goto L1a
        L13:
            s8h.v r0 = new s8h.v
            gim.c r9 = (gim.c) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261043x
            r3 = 3
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r5) goto L30
            jf0.c r8 = r0.u
            yhm.o.b(r9)
            goto L68
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            jf0.c r8 = r0.u
            yhm.o.b(r9)
            goto L54
        L3e:
            yhm.o.b(r9)
            java.lang.String r9 = r8.e(r3)
            pfm.z r9 = r7.b(r9)
            r0.u = r8
            r0.f261043x = r4
            java.lang.Object r9 = nim.a.b(r9, r0)
            if (r9 != r1) goto L54
            goto L67
        L54:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L5d
            goto L6c
        L5d:
            r0.u = r8
            r0.f261043x = r5
            java.lang.Object r9 = r7.d(r8, r0)
            if (r9 != r1) goto L68
        L67:
            return r1
        L68:
            com.revolut.kompot.bridge.navigation.KompotDestination r9 = (com.revolut.kompot.bridge.navigation.KompotDestination) r9
            if (r9 != 0) goto L6d
        L6c:
            return r6
        L6d:
            q06.h r0 = new q06.h
            s8h.c r1 = s8h.d.Companion
            java.lang.String r8 = r8.e(r3)
            r1.getClass()
            s8h.d r8 = s8h.c.a(r8)
            if (r8 != 0) goto L80
            r8 = -1
            goto L88
        L80:
            int[] r1 = s8h.u.f261041a
            int r8 = r8.ordinal()
            r8 = r1[r8]
        L88:
            r1 = 4
            if (r8 != r1) goto L93
            q06.b r8 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.d
            r8.<init>(r1, r6)
            goto L9a
        L93:
            q06.b r8 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.f160141b
            r8.<init>(r1, r6)
        L9a:
            r0.<init>(r9, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s8h.x.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.i iVar = new ufm.i(b(deeplink.e(3)), new s65.o(new pud.b((Object) this, deeplink, z, 13), 17), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return ue0.e.F(iVar, Boolean.FALSE);
    }
}
