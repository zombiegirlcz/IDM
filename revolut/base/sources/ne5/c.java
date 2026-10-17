package ne5;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import sri.m;
import te0.w;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements me5.b, ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai5.b f214416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f214417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xh5.a f214418c;

    public c(m navigator, xh5.a cryptoFeatureEnabledInteractor, ai5.b cryptoNavigationInterceptor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        this.f214416a = cryptoNavigationInterceptor;
        this.f214417b = navigator;
        this.f214418c = cryptoFeatureEnabledInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(ne5.c r6, jf0.c r7, boolean r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof ne5.a
            if (r0 == 0) goto L13
            r0 = r9
            ne5.a r0 = (ne5.a) r0
            int r1 = r0.f214414x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214414x = r1
            goto L18
        L13:
            ne5.a r0 = new ne5.a
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214414x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            boolean r7 = r0.u
            yhm.o.b(r9)
            goto L6c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            boolean r8 = r0.u
            yhm.o.b(r9)
            goto L4f
        L3b:
            yhm.o.b(r9)
            java.lang.String r7 = r7.f173629c
            efm.d0 r7 = r6.b(r7)
            r0.u = r8
            r0.f214414x = r4
            java.lang.Object r9 = nim.a.b(r7, r0)
            if (r9 != r1) goto L4f
            goto L6a
        L4f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            if (r7 == 0) goto L58
            return r5
        L58:
            xh5.a r7 = r6.f214418c
            ji5.e r7 = (ji5.e) r7
            efm.d0 r7 = r7.c()
            r0.u = r8
            r0.f214414x = r3
            java.lang.Object r9 = nim.a.b(r7, r0)
            if (r9 != r1) goto L6b
        L6a:
            return r1
        L6b:
            r7 = r8
        L6c:
            yh5.a r9 = (yh5.a) r9
            kotlin.jvm.internal.Intrinsics.h(r9)
            boolean r8 = yh5.b.w(r9)
            if (r8 == 0) goto L86
            com.revolut.retail.core.navigation.FeatureCommand r8 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.crypto.documents.api.navigation.CryptoDocumentsKompotFeatureConfig$CryptoDocuments r9 = com.revolut.feature.crypto.documents.api.navigation.CryptoDocumentsKompotFeatureConfig.CryptoDocuments.f70783g
            r8.<init>(r9)
            if (r7 == 0) goto L85
            com.revolut.retail.core.navigation.FeatureCommand r6 = h(r6, r8, r5, r3)
            return r6
        L85:
            return r8
        L86:
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$MainContainerTabId r7 = u49.a.f277275a
            com.revolut.retail.core.navigation.FeatureCommand r6 = h(r6, r5, r7, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ne5.c.g(ne5.c, jf0.c, boolean, gim.c):java.lang.Object");
    }

    public static FeatureCommand h(c cVar, FeatureCommand featureCommand, MainContainerNavigationId.MainContainerTabId mainContainerTabId, int i) {
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
        return y.D(cVar, "deeplink", 1, "crypto") && Intrinsics.f(cVar.e(2), "documents");
    }

    @Override // ai5.b
    public final d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return this.f214416a.b(deeplinkUri);
    }

    @Override // ai5.b
    public final Object c(NaviCommand naviCommand, Continuation continuation) {
        return this.f214416a.c(naviCommand, continuation);
    }

    @Override // ai5.b
    public final Object d(String str, Continuation continuation) {
        return this.f214416a.d(str, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ne5.b
            if (r0 == 0) goto L13
            r0 = r8
            ne5.b r0 = (ne5.b) r0
            int r1 = r0.f214415w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214415w = r1
            goto L1a
        L13:
            ne5.b r0 = new ne5.b
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214415w
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r3) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r8)
            goto L65
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            goto L4b
        L39:
            yhm.o.b(r8)
            java.lang.String r7 = r7.f173629c
            efm.d0 r7 = r6.b(r7)
            r0.f214415w = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L4b
            goto L64
        L4b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 == 0) goto L54
            return r5
        L54:
            xh5.a r7 = r6.f214418c
            ji5.e r7 = (ji5.e) r7
            efm.d0 r7 = r7.c()
            r0.f214415w = r4
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L65
        L64:
            return r1
        L65:
            java.lang.String r7 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            yh5.a r8 = (yh5.a) r8
            boolean r7 = yh5.b.w(r8)
            if (r7 == 0) goto L8b
            q06.h r7 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r8 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.crypto.documents.api.navigation.CryptoDocumentsKompotFeatureConfig$CryptoDocuments r1 = com.revolut.feature.crypto.documents.api.navigation.CryptoDocumentsKompotFeatureConfig.CryptoDocuments.f70783g
            r0.<init>(r1)
            r8.<init>(r0)
            q06.b r0 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.d
            r0.<init>(r1, r5)
            r7.<init>(r8, r0)
            return r7
        L8b:
            q06.h r7 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r8 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$MainContainerTabId r0 = u49.a.f277275a
            com.revolut.retail.core.navigation.FeatureCommand r0 = h(r6, r5, r0, r3)
            r8.<init>(r0)
            r7.<init>(r8, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ne5.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return w.o0(p0.f264003c, new l10.m(this, deeplink, z, (Continuation) null, 5));
    }
}
