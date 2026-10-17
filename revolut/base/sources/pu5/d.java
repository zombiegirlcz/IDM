package pu5;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import prl.n;
import q06.k;
import sri.m;
import ufm.i;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements mt5.b, k, ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai5.b f239829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f239830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final usc.a f239831c;
    public final FeatureCommand d;

    public d(m navigator, usc.a cryptoTaxFeatureChecker, ai5.b cryptoNavigationInterceptor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(cryptoTaxFeatureChecker, "cryptoTaxFeatureChecker");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        this.f239829a = cryptoNavigationInterceptor;
        this.f239830b = navigator;
        this.f239831c = cryptoTaxFeatureChecker;
        this.d = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6)));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "crypto") && Intrinsics.f(cVar.e(2), "tax");
    }

    @Override // ai5.b
    public final d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return this.f239829a.b(deeplinkUri);
    }

    @Override // ai5.b
    public final Object c(NaviCommand naviCommand, Continuation continuation) {
        return this.f239829a.c(naviCommand, continuation);
    }

    @Override // ai5.b
    public final Object d(String str, Continuation continuation) {
        return this.f239829a.d(str, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r9 == r1) goto L29;
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
            boolean r0 = r9 instanceof pu5.c
            if (r0 == 0) goto L13
            r0 = r9
            pu5.c r0 = (pu5.c) r0
            int r1 = r0.f239828w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f239828w = r1
            goto L1a
        L13:
            pu5.c r0 = new pu5.c
            gim.c r9 = (gim.c) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f239828w
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r3) goto L3b
            if (r2 != r4) goto L33
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            goto L83
        L2d:
            r8 = move-exception
            goto Lb2
        L30:
            r8 = move-exception
            goto Lbc
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            yhm.o.b(r9)
            goto L4f
        L3f:
            yhm.o.b(r9)
            java.lang.String r8 = r8.f173629c
            r0.f239828w = r3
            ai5.b r9 = r7.f239829a
            java.lang.Object r9 = r9.d(r8, r0)
            if (r9 != r1) goto L4f
            goto L82
        L4f:
            q06.j r9 = (q06.j) r9
            if (r9 == 0) goto L54
            return r9
        L54:
            usc.a r8 = r7.f239831c     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            java.lang.Object r8 = r8.f282889b     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            xh5.a r8 = (xh5.a) r8     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            ji5.e r8 = (ji5.e) r8     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            efm.d0 r8 = r8.c()     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            wsg.a r9 = new wsg.a     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r2 = 14
            r9.<init>(r2)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            wsg.k r2 = new wsg.k     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r6 = 4
            r2.<init>(r9, r6)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r8.getClass()     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            ufm.i r9 = new ufm.i     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r9.<init>(r8, r2, r3)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            java.lang.String r8 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r0.f239828w = r4     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            java.lang.Object r9 = nim.a.b(r9, r0)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            if (r9 != r1) goto L83
        L82:
            return r1
        L83:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            q06.b r8 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r0 = ibb.c.d
            r8.<init>(r0, r5)
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L98
            q06.i r9 = new q06.i
            r9.<init>(r8)
            return r9
        L98:
            com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig r9 = new com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig
            yhi.b r0 = yhi.b.SOLID
            r1 = 12
            com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig$TaxReportDestination r2 = com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig.TaxReportDestination.f71406a
            r9.<init>(r2, r0, r5, r1)
            com.revolut.retail.core.navigation.FeatureCommand r9 = gc0.c.f(r9)
            q06.h r0 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r1.<init>(r9)
            r0.<init>(r1, r8)
            return r0
        Lb2:
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r5, r5, r8, r9)
            return r5
        Lbc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pu5.d.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarB = b(deeplink.f173629c);
        n nVar = new n(6, new b(this, z));
        d0VarB.getClass();
        i iVar = new i(d0VarB, nVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
