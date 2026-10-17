package s8h;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 implements jf0.d, q06.k {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f261015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f261016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g9h.e f261017c;

    public j0(sri.m navigator, xoj.a featuresInteractor, gte.a featureToggleInteractor, g9h.e topMoversDestinationProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(topMoversDestinationProvider, "topMoversDestinationProvider");
        this.f261015a = navigator;
        this.f261016b = featuresInteractor;
        this.f261017c = topMoversDestinationProvider;
    }

    public static wnh.d b(xzg.n0 n0Var) {
        int i = h0.d[n0Var.ordinal()];
        if (i == 1) {
            return wnh.d.ALL;
        }
        if (i == 2) {
            return wnh.d.GAINERS;
        }
        if (i == 3) {
            return wnh.d.LOSERS;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static wnh.e c(xzg.l0 l0Var) {
        int i = h0.e[l0Var.ordinal()];
        if (i == 1) {
            return wnh.e.ONE_DAY;
        }
        if (i == 2) {
            return wnh.e.ONE_WEEK;
        }
        if (i == 3) {
            return wnh.e.ONE_MONTH;
        }
        if (i == 4) {
            return wnh.e.ONE_YEAR;
        }
        if (i == 5) {
            return wnh.e.FIVE_YEARS;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static g0 d(jf0.c cVar) {
        f fVar;
        xzg.l0 l0Var;
        f0 f0Var;
        xzg.n0 n0Var;
        e eVar = f.Companion;
        String str = (String) cVar.d.get("timeSpan");
        eVar.getClass();
        if (str != null) {
            f[] fVarArrValues = f.values();
            int length = fVarArrValues.length;
            for (int i = 0; i < length; i++) {
                fVar = fVarArrValues[i];
                if (Intrinsics.f(fVar.a(), str)) {
                    break;
                }
            }
            fVar = null;
        } else {
            fVar = null;
        }
        int i2 = fVar == null ? -1 : h0.f261007b[fVar.ordinal()];
        if (i2 == -1 || i2 == 1) {
            l0Var = xzg.l0.ONE_DAY;
        } else if (i2 == 2) {
            l0Var = xzg.l0.ONE_WEEK;
        } else if (i2 == 3) {
            l0Var = xzg.l0.ONE_MONTH;
        } else if (i2 == 4) {
            l0Var = xzg.l0.ONE_YEAR;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            l0Var = xzg.l0.FIVE_YEARS;
        }
        e0 e0Var = f0.Companion;
        String str2 = (String) cVar.d.get("filter");
        e0Var.getClass();
        if (str2 != null) {
            f0[] f0VarArrValues = f0.values();
            int length2 = f0VarArrValues.length;
            for (int i3 = 0; i3 < length2; i3++) {
                f0Var = f0VarArrValues[i3];
                if (Intrinsics.f(f0Var.a(), str2)) {
                    break;
                }
            }
            f0Var = null;
        } else {
            f0Var = null;
        }
        int i5 = f0Var == null ? -1 : h0.f261008c[f0Var.ordinal()];
        if (i5 == -1 || i5 == 1) {
            n0Var = xzg.n0.ALL;
        } else if (i5 == 2) {
            n0Var = xzg.n0.GAINERS;
        } else {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            n0Var = xzg.n0.LOSERS;
        }
        c cVar2 = d.Companion;
        String strE = cVar.e(3);
        cVar2.getClass();
        d dVarA = c.a(strE);
        int i6 = dVarA == null ? -1 : h0.f261006a[dVarA.ordinal()];
        if (i6 == -1 || i6 == 1 || i6 == 2) {
            return new g0(false, l0Var, n0Var);
        }
        if (i6 == 3 || i6 == 4) {
            return null;
        }
        if (i6 == 5) {
            return new g0(true, l0Var, n0Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "instruments") && Intrinsics.f(cVar.e(2), "top-movers");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof s8h.i0
            if (r0 == 0) goto L13
            r0 = r7
            s8h.i0 r0 = (s8h.i0) r0
            int r1 = r0.f261012x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261012x = r1
            goto L1a
        L13:
            s8h.i0 r0 = new s8h.i0
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261012x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            s8h.g0 r6 = r0.u
            yhm.o.b(r7)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            s8h.g0 r6 = d(r6)
            if (r6 != 0) goto L3e
            goto L6b
        L3e:
            boolean r7 = r6.f261002a
            if (r7 == 0) goto L45
            yoj.c r7 = yoj.c.CRYPTO
            goto L47
        L45:
            yoj.c r7 = yoj.c.WEALTH_TRADING
        L47:
            xoj.a r2 = r5.f261016b
            cpj.b r2 = (cpj.b) r2
            efm.r r7 = r2.l(r7)
            efm.d0 r7 = r7.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r0.u = r6
            r0.f261012x = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L6c
        L6b:
            return r4
        L6c:
            boolean r7 = r6.f261002a
            xzg.n0 r0 = r6.f261004c
            xzg.l0 r1 = r6.f261003b
            if (r7 == 0) goto L87
            com.revolut.feature.wealth_discovery.api.declaration.collection.TopMoversDestination$Crypto r7 = new com.revolut.feature.wealth_discovery.api.declaration.collection.TopMoversDestination$Crypto
            wnh.e r1 = c(r1)
            wnh.d r0 = b(r0)
            r2 = 4
            r7.<init>(r1, r0, r2)
            com.revolut.retail.core.navigation.FeatureCommand r7 = zh9.u0.f(r7)
            goto L8d
        L87:
            g9h.e r7 = r5.f261017c
            com.revolut.retail.core.navigation.FeatureCommand r7 = r7.a(r1, r0)
        L8d:
            q06.h r0 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r1.<init>(r7)
            q06.b r7 = new q06.b
            boolean r6 = r6.f261002a
            if (r6 == 0) goto L9d
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r6 = ibb.c.d
            goto L9f
        L9d:
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r6 = ibb.c.f160141b
        L9f:
            r7.<init>(r6, r4)
            r0.<init>(r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s8h.j0.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.i iVar = new ufm.i(new ufm.c(new fg8.b(deeplink, 4), 2), new s65.o(new s78.d(this, 5), 19), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        ufm.i iVar2 = new ufm.i(iVar, new s65.o(new pud.b((Object) this, deeplink, z, 14), 20), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return ue0.e.F(iVar2, Boolean.FALSE);
    }
}
