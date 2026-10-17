package rf5;

import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesDialogMode;
import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesMode;
import com.revolut.feature.crypto.exchange.fees.api.navigation.CryptoExchangeFeesDestination;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mf5.c;
import q06.k;
import rea.j;
import sri.m;
import tnb.g0;
import ufm.i;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements kf5.b, k, ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai5.b f253694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f253695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f253696c;
    public final FeatureCommand d;

    public b(m navigator, g0 featureChecker, ai5.b cryptoNavigationInterceptor, c cryptoExchangeFeesNavigationProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        Intrinsics.checkNotNullParameter(cryptoExchangeFeesNavigationProvider, "cryptoExchangeFeesNavigationProvider");
        this.f253694a = cryptoNavigationInterceptor;
        this.f253695b = navigator;
        this.f253696c = featureChecker;
        this.d = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "crypto") && Intrinsics.f(cVar.e(2), "exchange") && Intrinsics.f(cVar.e(3), "fees");
    }

    @Override // ai5.b
    public final d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return this.f253694a.b(deeplinkUri);
    }

    @Override // ai5.b
    public final Object c(NaviCommand naviCommand, Continuation continuation) {
        return this.f253694a.c(naviCommand, continuation);
    }

    @Override // ai5.b
    public final Object d(String str, Continuation continuation) {
        return this.f253694a.d(str, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
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
            boolean r0 = r7 instanceof rf5.a
            if (r0 == 0) goto L13
            r0 = r7
            rf5.a r0 = (rf5.a) r0
            int r1 = r0.f253693x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f253693x = r1
            goto L1a
        L13:
            rf5.a r0 = new rf5.a
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f253693x
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3c
            if (r2 == r3) goto L36
            if (r2 != r4) goto L2e
            jf0.c r6 = r0.u
            yhm.o.b(r7)
            goto L60
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            jf0.c r6 = r0.u
            yhm.o.b(r7)
            goto L4e
        L3c:
            yhm.o.b(r7)
            java.lang.String r7 = r6.f173629c
            r0.u = r6
            r0.f253693x = r3
            ai5.b r2 = r5.f253694a
            java.lang.Object r7 = r2.d(r7, r0)
            if (r7 != r1) goto L4e
            goto L5f
        L4e:
            q06.j r7 = (q06.j) r7
            if (r7 == 0) goto L53
            return r7
        L53:
            r0.u = r6
            r0.f253693x = r4
            tnb.g0 r7 = r5.f253696c
            java.lang.Object r7 = r7.g(r0)
            if (r7 != r1) goto L60
        L5f:
            return r1
        L60:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r0 = 0
            if (r7 != 0) goto L6a
            return r0
        L6a:
            q06.h r7 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r6 = r5.g(r6)
            r1.<init>(r6)
            q06.b r6 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r2 = ibb.c.d
            r6.<init>(r2, r0)
            r7.<init>(r1, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rf5.b.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarB = b(deeplink.f173629c);
        j jVar = new j(new pud.b((Object) this, deeplink, z, 7), 8);
        d0VarB.getClass();
        i iVar = new i(d0VarB, jVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final FeatureCommand g(jf0.c cVar) {
        KompotOverlayFeatureConfig kompotOverlayFeatureConfig;
        String mode = (String) cVar.d.get("mode");
        if (mode == null) {
            mode = cVar.e(4);
        }
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (Intrinsics.f(mode, "informational") || Intrinsics.f(mode, "simplified")) {
            kompotOverlayFeatureConfig = new KompotOverlayFeatureConfig(new CryptoExchangeFeesDestination.FeesBreakDown(Intrinsics.f(mode, "informational") ? CryptoExchangeFeesDialogMode.INFORMATIONAL : CryptoExchangeFeesDialogMode.DEFAULT), yhi.b.BOTTOM_DIALOG, (Integer) null, 12);
        } else {
            kompotOverlayFeatureConfig = new KompotOverlayFeatureConfig(new CryptoExchangeFeesDestination.FeesWithUpgradePlans(lf5.b.DEEPLINK, Intrinsics.f(mode, "trade-more") ? new CryptoExchangeFeesMode.TradeMore(null) : Intrinsics.f(mode, "current-plan") ? new CryptoExchangeFeesMode.UpgradePlan(true) : new CryptoExchangeFeesMode.UpgradePlan(false)), yhi.b.POPUP, (Integer) null, 12);
        }
        return new FeatureCommand(kompotOverlayFeatureConfig);
    }
}
