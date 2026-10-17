package cm5;

import ch6.d;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.k;
import sri.m;
import ufm.i;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements bm5.b, k, ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai5.b f25144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f25145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xh5.a f25146c;

    public c(m navigator, xh5.a cryptoFeatureEnabledInteractor, ai5.b cryptoNavigationInterceptor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        this.f25144a = cryptoNavigationInterceptor;
        this.f25145b = navigator;
        this.f25146c = cryptoFeatureEnabledInteractor;
    }

    public static FeatureCommand g(c cVar, FeatureCommand featureCommand, MainContainerNavigationId.MainContainerTabId mainContainerTabId, int i) {
        if ((i & 1) != 0) {
            featureCommand = null;
        }
        if ((i & 2) != 0) {
            mainContainerTabId = u49.b.f277278a;
        }
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(mainContainerTabId, null, featureCommand, 2)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "crypto") && Intrinsics.f(cVar.e(2), "strategies");
    }

    @Override // ai5.b
    public final d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return this.f25144a.b(deeplinkUri);
    }

    @Override // ai5.b
    public final Object c(NaviCommand naviCommand, Continuation continuation) {
        return this.f25144a.c(naviCommand, continuation);
    }

    @Override // ai5.b
    public final Object d(String str, Continuation continuation) {
        return this.f25144a.d(str, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof cm5.b
            if (r0 == 0) goto L13
            r0 = r7
            cm5.b r0 = (cm5.b) r0
            int r1 = r0.f25143w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25143w = r1
            goto L1a
        L13:
            cm5.b r0 = new cm5.b
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f25143w
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r7)
            goto L5e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            goto L48
        L38:
            yhm.o.b(r7)
            java.lang.String r6 = r6.f173629c
            r0.f25143w = r3
            ai5.b r7 = r5.f25144a
            java.lang.Object r7 = r7.d(r6, r0)
            if (r7 != r1) goto L48
            goto L5d
        L48:
            q06.j r7 = (q06.j) r7
            if (r7 == 0) goto L4d
            return r7
        L4d:
            xh5.a r6 = r5.f25146c
            ji5.e r6 = (ji5.e) r6
            efm.d0 r6 = r6.c()
            r0.f25143w = r4
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L5e
        L5d:
            return r1
        L5e:
            yh5.a r7 = (yh5.a) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            boolean r6 = yh5.b.w(r7)
            r7 = 0
            if (r6 == 0) goto L83
            q06.h r6 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.crypto.strategies.api.navigation.CryptoStrategiesKompotFeatureConfig$CryptoStrategies r2 = com.revolut.feature.crypto.strategies.api.navigation.CryptoStrategiesKompotFeatureConfig.CryptoStrategies.f70998g
            r1.<init>(r2)
            r0.<init>(r1)
            q06.b r1 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r2 = ibb.c.d
            r1.<init>(r2, r7)
            r6.<init>(r0, r1)
            return r6
        L83:
            q06.i r6 = new q06.i
            q06.b r0 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.f160140a
            r0.<init>(r1, r7)
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cm5.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarB = b(deeplink.f173629c);
        d dVar = new d(new a(this, z, 0), 16);
        d0VarB.getClass();
        i iVar = new i(d0VarB, dVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
